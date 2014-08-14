
rest-api-sdk-java
=================

Hover API Rest SDK for Java bindings 

Welcome to the Hover SDK for Java, this SDK is for building a robust java application based on the Hover API.
The Hover SDK for Java makes it easy to integrate a full Hover API services into java apps.
All documentation about classes, methods, etc.. are published into a [javadoc](https://zgbjgg.github.io/rest-api-sdk-java/ "REST API Hover SDK for Java Bindings")

Requirements
============

* Java JDK 1.6 or higher
* Maven (if you use pom.xml)
* Dependency Gson for json serialization

SDK Integration
===============

Add the dependency in your pom.xml if you are using Maven, otherwise build all sdk/src code into a single jar file as
a library and then add to your project.

SDK Configuration
=================

First configure the logging, providing the absolute path where `hover_sdk.log.*` will be created, the logs are in a 
rotate way so each 1 MB the log file increases by 1
```java
	Logs.initialize("/Users/zgbjgg/Desktop");
```

The configuration for the sdk is based on an properties file where you must provide:

* HTTP connection configuration
* API access parameters
* Credentials

Configuring your sdk is easy, just create a file called `sdk-java.properties` like placed on resources and add to your application.Now provide the absolute path to properties file for loading as a resource,
```java
	// SDK initializaton
	SDKTools.initialize("/Users/zgbjgg/sdk_config.properties");
```
Now the SDK is ready to use!!

Manage the request
===================

All requests to the RESTful API on the SDK are made using a serialized class, so, each request has their own translation
from json to class, for example: to register a single user use User class and its attributes instead build a json file.

> 	NOTE: If you want add more attributes to any serialized class, then just extends from the desired class.

Manage the response
======================

All responses from the RESTful API on the SDK are managed by ```Response``` class, this class stores the HTTP Status Code, the raw response (json, xml, etc ...)  as a string and the body response casted to a desired class.
For example if you register a user, then your response instance stores the serialized object, just provide the class to map:
`User userInfo = (User) response.getBodyT(User.class);`.


SDK Samples
====================

Under test directory exists a bunchet of code snippets that allow testing diferent scenarios and shows you how to use the API with the SDK.

1. Profiles
  1. Creating a profile
  2. Fetching profiles
  3. Updating profile
2. User
  1. Creating basic user
  2. Creating user with login
  3. Fetching user info
  4. Login
  5. Checking availability
  6. Checking color and fetching data
3. Merge
  1. Merging users
  2. Fetching merged 
4. Nfc
  1. Assigning nfc to user
  2. Fetching assigned nfc cards
  3. Updating nfc info
5. Notifications
  1. Creating user notification
  2. Fetching all notifications
  3. Fetching specific notification
  4. Mark notification as read

About
=====

You can find more info about courses of how to use the API, SDK's or integration of Hover into your app,
visiting us at: http://www.thehover.com or mail us: thehover@hovanetworks.com

