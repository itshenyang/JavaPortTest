#!/usr/bin/env bash
cd ..
git pull origin master
mvn clean package
nohup java -jar target/JavaPortTest-1.0-SNAPSHOT.jar &