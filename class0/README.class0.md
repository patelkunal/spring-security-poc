#### about class0

Simple spring security micro-service with simple username and password. This supports just one user with username and 
password provided in application.properties

#### build and deployment

```bash 
# with correct username and passport - will respond 200
curl -X GET --user admin:password http://localhost:8080/rest/accounts

# with incorrect username and passport - will respond 401
curl -X GET --user admin:wrongpassword http://localhost:8080/rest/accounts
```
