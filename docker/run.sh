#!/bin/sh

echo "********************************************************"
echo "Starting Fairanb Server"
echo "USing Profile: $PROFILE"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/target/@project.build.finalName@.jar