#!/bin/bash
mvn clean package install
cp target/openvms-filetype-detectors.jar /usr/local/jdk170/jre/lib/ext
