set projectpath=C:\Bitnami\jenkins-1.612-0\apps\jenkins\jenkins_home\jobs\Finsys\workspace
echo %projectpath%
set classpath=%projectpath%\bin;%projectpath%\AllRequiredJars\sel2.53\*;%projectpath%\AllRequiredJars\sel3.0\*;%projectpath%\AllRequiredJars\sel2.44\*;%projectpath%\AllRequiredJars\extentreports-java-2.4\lib\*;%projectpath%\AllRequiredJars\extentreports-java-2.4\*;%projectpath%\JARS\Sel2.53\selenium-2.53.0\*;%projectpath%\JARS\Sel3.0\Selenium 3.0\*;%projectpath%\bin\org\ejagruti\modules\*
echo %classpath%
java org.testng.TestNG -d test-outputs %projectpath%\SMOKE.xml
echo %projectpath%
pause