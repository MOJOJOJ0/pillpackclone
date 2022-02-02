# Pill Pack Clone
## Option 1
[Link to a page](https://www.http.cat/)
- [x] task 0
- [ ] incomplete task 1
- [ ] incompele task 2
- [x] task 3

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
