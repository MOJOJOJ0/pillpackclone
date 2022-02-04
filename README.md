# Pill Pack Clone API

## About
The intention was to mimic pill pack with added features that way a user is able to see all their medications, insurance info, and doctors info in an organized manner rather than using mulitple apps and websites to keep track. The average person can use this as a PWA (progressive web apps) on their phones or on a desktop.

[pillpack.com](https://www.pillpack.com/)

## User Stories

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

Delete method throws a 500 Internal Server Error.

- GET (shows all users)
![getUsers](https://user-images.githubusercontent.com/15316862/152591017-7e5f5c37-2539-44f6-bb34-ee0075e2154e.gif)
- POST (creates new user)
![add user demo](https://user-images.githubusercontent.com/15316862/152586290-60bebc00-4fda-4683-a98f-44cea57a1755.gif)
- GET (finds user by id)
![findUser](https://user-images.githubusercontent.com/15316862/152591957-498fa1a8-2858-4cda-aafa-41d8f7dc64d1.gif)
- PUT (updates info by id)
![updateUser](https://user-images.githubusercontent.com/15316862/152593451-e18695c1-97ee-4190-a9ae-1b6001b472c6.gif)

## Future, Unsolved Problems, and Major Hurdles 
I would like to finish this project in a full capacity as per option 1 deliverables. Also would like to implement and learn about JSON web tokens, build a front-end, see if I'm capable of completing the bonus ideas and gain better understanding of these concepts and practice even more.
