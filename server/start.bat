@echo off
rem Fabric 26.3 dev server. Java 25 is required by Minecraft 26.3.
cd /d "%~dp0"
"C:\Program Files\Java\jdk-25.0.4\bin\java.exe" -Xms2G -Xmx4G -jar fabric-server-launch.jar nogui
pause
