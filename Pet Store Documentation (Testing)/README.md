# PetStore Application Testing 

## Testing the Petstore API

API testing entails testing application programming interfaces (APIs) directly and as part of integration testing to see if they fulfill functionality, reliability, performance, and security standards. Because APIs lack a graphical user interface, API testing is done at the message layer. API testing is essential for automated testing since APIs are now the primary interface to application functionality and GUI tests are challenging to maintain with the short release cycles and rapid changes prevalent in Agile software development and DevOps.

## Downloading the Postman Application

This Application is a versatile application for testing CRUD Operations of an API. Download Postman from Below Link

 https://www.postman.com/downloads/

## Postman Dashboard
![PostMan Preview](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Postman.PNG)

## Packaging and running the application

If you want to build an [_??ber-jar_], execute the following command:

    ./gradlew build -Dquarkus.package.type=uber-jar

To run the application:

    java -jar build/petstore-runner.jar

The application can be also packaged using simple:

    ./gradlew build

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it is not an _??ber-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

To launch the test page, open your browser at the following URL

    http://localhost:8080/index.html

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

    ./gradlew quarkusDev

## Configuring the Application

Use a Code editor tool to manipulating the Code segments. You can use any code editing tool.

    ./gradlew quarkusDev

## Creating a native executable

Mind having GRAALVM_HOME set to your Mandrel or GraalVM installation.

You can create a native executable using:

    ./gradlew build -Dquarkus.package.type=native

Or, if you don't have [Mandrel](https://github.com/graalvm/mandrel/releases/) or
[GraalVM](https://github.com/graalvm/graalvm-ce-builds/releases) installed, you can run the native executable
build in a container using:

    ./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true

