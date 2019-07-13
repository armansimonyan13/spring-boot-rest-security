# Spring Boot REST Security

This is a simple implementation of Restful application with Spring Boot Web Security


###### To login:

`curl -i -X POST -d username=user -d password=pass http://localhost:8080/login -c cookies.txt`


###### To fetch data:

`curl -i --header "Accept:application/json" -X GET -b cookies.txt http://localhost:8080/api/message`

