#!/bin/bash

# start docker session
#aws configure set region us-east-1
#aws configure set output text
#$(aws ecr get-login)
# pull, build, create and start
docker-compose up -d --remove-orphans
#docker logout https://142221083342.dkr.ecr.us-east-1.amazonaws.com
