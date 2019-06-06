package org.ejagruti.modules;

import java.util.*;

import javax.activation.*;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendMail {

	
	/**
	 * examples----
	 * @param FromEmailId       -  fromemailid@tosendmail.com
	 * @param ToEmailId         -  wheretosend@email.com
	 * @param LocalHost         -  smptp.gmail.com 
	 * @param Port              -   465 / 587 (see what works for you)
	 * @param FromEmailPassword -  ejagruti
	 * @param AttachemntDetails -  location of attachment
	 * @param Protocol          -  smtp
	 */
	public static void SendReportThroughMail(final String FromEmailId, String ToEmailId, String LocalHost,
			String Port, final String FromEmailPassword, String AttachemntDetails,String Protocol) { 
		
	
		// Recipient's email ID needs to be mentioned.
	      String to = ToEmailId;

	      // Sender's email ID needs to be mentioned
	      String from =FromEmailId;

	      // Assuming you are sending email from localhost
	      String host = LocalHost;

	      // Get system properties
	      //Properties properties = System.getProperties();
	      Properties properties = new Properties();
	      properties.put("mail.transport.protocol", Protocol);
	      properties.put("mail.smtp.host", host); // smtp.gmail.com?
	      properties.put("mail.smtp.port", Port);
	      //mail.smtp.starttls.enable="true"
	      //mail.smtp.socketFactory.class="javax.net.ssl.SSLSocketFactory"

	      // Setup mail server  - Authentication
	      properties.setProperty("mail.smtp.host", host);
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable","true");
	      properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	      Authenticator authenticator = new Authenticator() {
	          protected PasswordAuthentication getPasswordAuthentication() {
	              return new PasswordAuthentication(FromEmailId,FromEmailPassword);
	          }
	      };

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties, authenticator);
	      
	     
	      
	      try {
	          // Create a default MimeMessage object.
	          MimeMessage message = new MimeMessage(session);

	          // Set From: header field of the header.
	          message.setFrom(new InternetAddress(from));

	          // Set To: header field of the header.
	          message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));

	          // Set Subject: header field
	          message.setSubject("This is the Subject Line!");

	          // Create the message part 
	          BodyPart messageBodyPart = new MimeBodyPart();

	          // Fill the message
	          messageBodyPart.setText("This is message body");
	          
	          // Create a multipar message
	          Multipart multipart = new MimeMultipart();

	          // Set text message part
	          multipart.addBodyPart(messageBodyPart);

	          // Part two is attachment
	          messageBodyPart = new MimeBodyPart();
	          String filename = AttachemntDetails;
	          DataSource source = new FileDataSource(filename);
	          messageBodyPart.setDataHandler(new DataHandler(source));
	          messageBodyPart.setFileName(filename);
	          multipart.addBodyPart(messageBodyPart);

	          // Send the complete message parts
	          message.setContent(multipart );

	          // Send message
	          Transport.send(message);
	          System.out.println("Sent message successfully....");
	       }catch (MessagingException mex) {
	          mex.printStackTrace();
	       }
	}
	      public static void main(String [] args) {
	    	  
	    	  /*SendReportThroughMail("ejagrutiauto@gmail.com","vivekphoenix@gmail.com","smtp.gmail.com",
	    			  "587","ejagruti",System.getProperty("user.dir")+"\\reports\\newreportwithmail.html",
	    			  "smtp");*/
	    	 
	      }
	      
		
	}

