# Simple loan checker in Java/Spring

# Technologies Used

  - Java
  - SpringBoot
  - Spring Web
  - Spring Validation
  - Lombok

# Description

  A simple system that contains only one route responsible for checking which types of loans a user is allowed to use.
  Validations were made for the request fields found in RequestEntity, as well as validation error messages were handled to be displayed in a more user-friendly way for those who consume the service. I dont use folders to separate files because it is a small project for study

# Business Rule
  - Grant the personal loan if the client's salary is equal to or less than R$3000.
  - Grant the personal loan if the client's salary is between R$3000 and R$5000, if the client is under 30 years old and lives in São Paulo (SP).
  - Grant the payroll loan if the client's salary is equal to or greater than R$5000.
  - Grant the loan with collateral if the client's salary is equal to or less than R$3000.
  - Grant the loan with collateral if the client's salary is between R$3000 and R$5000, if the client is under 30 years old and lives in São Paulo (SP).

# Request Format


```json
{
 "name": "example name",
 "age": 22,
 "cpf": "831.887.100-62",
 "location": "SP",
 "wage": 3000.0
}
```

For this request will return a response 200 OK and the list of types of loan valids to this user

Now for the next request it will return the error formatted for the invalid cpf with a status 400 Bad Request

```json
{
 "name": "example name",
 "age": 22,
 "cpf": "831.887.100-61",
 "location": "SP",
 "wage": 3000.0
}
```

# Run the project

Clone this repository

```
git clone https://github.com/dev-gabrielferreira/Simple-loan-checker.git
```

Go to the directory

```
cd Simple-loan-checker
```

Now run with the following command or press the start button in your IDE(Vscode, Intellij, Eclipse)

```
mvn spring-boot:run
```
