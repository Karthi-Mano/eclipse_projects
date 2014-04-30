@echo ON
CD %CD%




SET LibPATH=S:\Zakir\jre7


%LibPATH%\bin\java -cp C:\Zakir\GitHub\EclipseProject\TestProject\bin\com\zakir\TestNG;%LibPATH%\bin\*;%LibPATH%\lib\* org.testng.TestNG .\TestNG_CR.xml



