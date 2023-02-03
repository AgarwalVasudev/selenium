
set projectLocation=C:\Users\vasudev.agarwal\OneDrive - Accenture\Documents\Testing\Eclipse_Workspace\Automation_Framework_Nit
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestSuite.xml
pause