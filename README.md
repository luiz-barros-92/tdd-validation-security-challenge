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
