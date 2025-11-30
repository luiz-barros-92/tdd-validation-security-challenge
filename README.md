# TDD Validation and Security Challebge
[DevSuperior](https://devsuperior.com.br/)

Implement the necessary features for the tests of the project to pass.

|   Access Control                                           |
|------------------------------------------------------------|
| Only GET endpoints from city and events are public.        |
| ADMIN and/or CLIENT users can insert new events (POST).    |
| All other access privileges are granted only to the ADMIN. |
<br>

|    City Validation                                    |
|-------------------------------------------------------|
| Name cannot be empty.                                 |
<br>

|    Event Validation                                   |
|-------------------------------------------------------|
| Name cannot be empty.                                 |
| Date cannot be in the past.                           |
| City cannot be null.                                  |

## Class Diagram
![img](https://github.com/luiz-barros-92/assets/blob/main/challenges/tdd-event-city/validation-security.png)
<br>

## API Endpoint Access Control and Response Codes
| Endpoint   | Method | Expected Status               | User Role | Notes                               |
|------------|--------|-------------------------------|-----------|-------------------------------------|
| /events    | POST   | 401 Unauthorized              | none      | User not logged in                  |
| /events    | POST   | 201 Created                   | CLIENT    | Correct data                        |
| /events    | POST   | 201 Created                   | ADMIN     | Correct data                        |
| /events    | POST   | 422 Unprocessable Entity      | ADMIN     | Name is blank                       | 
| /events    | POST   | 422 Unprocessable Entity      | ADMIN     | Date is in the past                 |
| /events    | POST   | 422 Unprocessable Entity      | ADMIN     | City is null                        |
| /events    | GET    | 200 OK                        | any       | Returns a paged list of resources   |
| /cities    | POST   | 401 Unauthorized              | none      | User not logged in                  |
| /cities    | POST   | 403 Forbidden                 | CLIENT    | Access denied                       |
| /cities    | POST   | 201 Created                   | ADMIN     | Correct data                        |
| /cities    | POST   | 422 Unprocessable Entity      | ADMIN     | Name is blank                       |
| /cities    | GET    | 200 OK                        | any       | Returns all resources sorted by name|

