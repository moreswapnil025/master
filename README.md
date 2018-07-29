# Cognitive Scale Case Study

## API Service Implementation

Currently services hosted on AWS.

### Swagger URL for services implementation.

  http://18.222.25.123:8080/swagger-ui.html

### Implemented three following service 
  #### LOGIN (POST) : Request URL : http://18.222.25.123:8080/login :
      Request data for login  :  id and password
      for eg: {"id":1 "password" : "swapnil"} 
   #### Register (POST) : Request URL : http://18.222.25.123:8080/register
      Request data for register : 
        {
            "emailID": "string",
            "firstName": "string",
           "id": 0,
           "lastName": "string",
          "password": "string"
         }

   #### Get Available Users (GET) : Request URL:  http://18.222.25.123:8080/users

## JMeter Task

jmeter_test_plan folder contains all the following test plans 
1. load test case for HTTP GET request
3. load test case for HTTP GET request using timers
    - Not completed as currently able to see diffrent timers available in JMeter and need to know about each timer usage.
    - Did not get chance to have look for each timer.
4. load test case for HTTP POST request
5. load test case for Database

jmeter_test_plan folder also contains testdata in form of csv's please place all csv files under bin folder of JMeter package.

jmeter_test_plan folder also contains mysql-connector-java-5.1.46 for JDBC connection of MYSQL.
       - Please place mention jar under lib folder of JMeter package.




 
