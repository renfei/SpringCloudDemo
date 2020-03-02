#!/usr/bin/env bash

mvn clean package -Dmaven.test.skip=true -U

docker build -t XXXXXX

doucker push XXXXXX