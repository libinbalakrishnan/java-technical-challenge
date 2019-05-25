I have written a code that allows 

Promocode Operation: add,update,delete and read Promocode details. Admin user can perform this.
User operation : add,update,delete and read user details. To send authentication mail to user, JMS functionality needs to be implemented.
Flight Search details operations : add,update,delete and read Flight Search details to send new offers

Sending new offer notice:  New offers will be sent to the saved email address - Batch needs to be there to check the 

Promocode and saved flight details. And based on this, offer email should be sent to users using JMS. This functionality yet to be added to this repository.

Technologies Used : Spring, Spring datajpa, SQL server ,jax rs, Spring JDBC.

Pre-requisites:
1) Maven and Java JDK should be installed(versions used: Apache Maven 3.3.9 ; Java version: 1.8.0_45)
2) SQLserver
3) Postman 
4) Eclipse IDE

Execution:
1) Import the project
2) Clean and install Maven dependencies
3) Run the DataJpaExampleApplication.java
4) Use postman to hit relevant services/operations -  Promocode Operation, User operation, Flight Search details operations