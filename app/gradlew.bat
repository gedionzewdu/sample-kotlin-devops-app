@echo off
:: Gradle start up script for Windows

set APP_BASE_NAME=%~nx0
set CLASSPATH=%~dp0gradle\wrapper\gradle-wrapper.jar

java -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
