#### about class3

Simple spring security micro-service with simple username and password. This is replica of class2 with spring's xml config.

#### build and deployment

```bash 
# with correct username and passport - will respond 200
curl -X GET --user admin:admin http://localhost:8080/rest/accounts
curl -X GET --user user:user http://localhost:8080/rest/accounts

# with incorrect username and passport - will respond 401
curl -X GET --user admin:wrongpassword http://localhost:8080/rest/accounts
```
