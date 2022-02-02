# Pill Pack Clone
## Option 1
[Link to a page](https://http.cat)
- [x] task 0
- [ ] incomplete task 1
- [ ] incompele task 2
- [x] task 3
- [x] ~task 4~

<img width="750" alt="Screen Shot 2022-02-02 at 11 33 46 AM" src="https://user-images.githubusercontent.com/15316862/152207648-21a85670-35f6-4d13-a869-91471f410b56.png">

Request Type | URL | Request Body
------------ | --- |-------------
GET | /user/find/ | None
POST| /user/add | New

Any word wrapped with two tildes (like ~~this~~) will appear crossed out.

_You **can** combine them_

```java
@PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
```
1. Item 1
1. Item 2
1. Item 3
   1. Item 3a
   1. Item 3b
   
Text inside `backticks` on a line will be formatted like code.

![Pill Pack Clone Demo](demo/demo.gif)
