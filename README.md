# lacuillere

# Password and encryptions

##### Introduction 
- Database password is encrypted with Jasypt.
So, Jasypt dependancies has been add in pom.xml

```
<dependency>
<groupId>com.github.ulisesbocchio</groupId>
<artifactId>jasypt-spring-boot-starter</artifactId>
<version>LATEST</version>
</dependency>
```

- With this Jasypt, ENC(passwordEncoded) will be decoded and use by spring.
ENC(passwordEncoded) is used in application.properties


##### For encrypt a new password 

- To replace passwordEncoded in argument of ENC(passwordEncoded), you have to
download Jasypt (binaries and javadoc) on https://github.com/jasypt/jasypt\
Jasypt provide a /bin folder with encrypt.bat (windows) or encrypt.sh (Bash)


- After, you can run jasypt with your CLI and with two parameters

input : your secret password to be encoded\
password : your private password, share with your team\


####### Example generating password :

```
./bin/encrypt.sh input='myDatabasePassword' password='privateKeyOnlySharedWithMyTeam'
```

##### Running project :

- For run your spring application, you have to define a parameter to your launch configuration.

```
-Djasypt.encryptor.password=privateKeyOnlySharedWithMyTeam
```

- To add this argument with intelliJ, you can go to : \
Edit Configuration -> Override Parameters :

- in the name, add
```
jasypt.encryptor.password \
```
- in value, add :
```
privateKeyOnlySharedWithMyTeam
```

