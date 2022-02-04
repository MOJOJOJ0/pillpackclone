# Pill Pack Clone API

## About
The intention was to mimic pill pack with added features that way a user is able to see all their meds, insurance info, and doctor info in an organized manner rather than using mulitple apps and websites to keep track. 

[pillpack.com](https://www.pillpack.com/)

## User Stories
- [ ] incompele task 2
- [x] ~task 4~

- [x] ~As a user, I would like to view a list of vaccines available~

- [x] ~As a user, I would like to view details of a specific vaccine side-effects according to user specific co-morbidities~

- [x] As a user, I would like to log in, manage a family account (a la epic, pillpack or kinsa style)

- [x] As a user, I would like to add / delete family members.

- [x] As a user, I would like to update medications.

- [x] As a user, I would like to keep track of insurance coverage and individual medication cost.

- [ ] A user can have an admin role or user role.

- [ ] As a user, keep track of health stats from various health tracking devices (fitbit, oura, apple watch, kinsa thermometers, diet apps, etc.)

- [x] As a user, I would like to see Doctors name and their contact info, including specialized care, with next appointment reminders

## Initial ERD Diagram

<img width="750" alt="Screen Shot 2022-02-02 at 11 33 46 AM" src="https://user-images.githubusercontent.com/15316862/152207648-21a85670-35f6-4d13-a869-91471f410b56.png">

## Tech Used

- Java
- Spring Boot
- IntelliJ IDEA
- Maven
- MySQL
- Postman
- Lucidcharts
- HTTPie

## Endpoints

Request Type | URL | Request Body | Description
------------ | --- |--------------|-----------------
GET | /api/users | name, email, phoneNumber, image_url | shows all users
POST | /api/add | name, email, phoneNumber, image_url | creates new user
PUT | /api/update | medsName, medsCost, insurance | updates info by id
GET | api/find/{id} | name, email, phoneNumber, image_url | find a user by id
DELETE | /delete/{id} | name, email, phoneNumber, image_url  | deletes a user by id

## Problems

Delete method throws an 500 Internal Server Error

![Pill Pack Clone Demo file structure](demo/demo.gif)
