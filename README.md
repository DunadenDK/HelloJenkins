# HelloJenkins

mailru automation
=================

Java WebDriver test automation project for mail ru

Java
====

Run from command line: mvn clean test -DTimeout=30 -Dbrowser=chrome -Denvironment=dev


Possible options:
Dbrowser: chrome, firefox
Dsurefire.suiteXmlFiles: src\test\resources\testng-all.xml, src\test\resources\testng-smoke.xml
Denvironment: dev, qa
