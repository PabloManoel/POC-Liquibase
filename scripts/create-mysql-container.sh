#!/bin/sh

docker run -d -p 3306:3306\
 -e MYSQL_ROOT_PASSWORD=RootPassword\
 -e MYSQL_DATABASE=pizzaweb\
 -e MYSQL_USER=admin\
 -e MYSQL_PASSWORD=admin123 mysql:5.7
