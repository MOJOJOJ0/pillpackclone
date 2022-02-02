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

```java
@PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
```
