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

* HTTP parameters
* Tenant configuration
* Credentials

Configuring your sdk is easy, just create a file called `sdk-java.properties` like placed on resources and add to your application.Now provide the absolute path to properties file for loading as a resource,
```java
	// SDK initializaton
	SDKTools.initialize("/Users/zgbjgg/sdk_config.properties");
```
Now the SDK is ready for use!!

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

Registering a user
------
Shows how to register an user using the default fields and extending of your own user settings

Getting user info
------
Shows how to get information about the registered user

Login 
------
Shows how to login an user using username, password, nfc and/or fingerprint

Assign services to the user
------
Shows how to assign services to the user

Get services for the user
------
Shows how to get services assigned to the user

Searching an user
------
Shows how to search a user using default fields or customizing settings

About
=====

You can find more info about courses of how to use the API, SDK's or integration of Hover into your app,
visiting us at: http:// or mail us: thehover@hovanetworks.support.com

