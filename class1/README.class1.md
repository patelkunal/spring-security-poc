#### about class1

Simple spring security micro-service with simple username and password. This supports multiple users provided into 
```WebSecurityConfiguration.configure(AuthenticationManagerBuilder builder)```. Though username and passwords are 
hardcoded but it can be easily externalized.

#### build and deployment

```bash 
# with correct username and passport - will respond 200
curl -X GET --user admin:admin http://localhost:8080/rest/accounts
curl -X GET --user user:user http://localhost:8080/rest/accounts

# with incorrect username and passport - will respond 401
curl -X GET --user admin:wrongpassword http://localhost:8080/rest/accounts
```
