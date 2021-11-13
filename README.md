# PetStore Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Prerequisite Installation.
    1) Java Version 11.0 or above
    2) IntelliJ IDEA Community version or Ultimate 
    3) Docker Desktop
    4) Docker Compose
    git clone https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject.git


## Downloading the Application

using the following git Command to Clone the Application

    git clone https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject.git

![GitClone](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/gitclone.PNG)

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

Or to use Mandrel distribution:

    ./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true -Dquarkus.native.builder-image=quay.io/quarkus/ubi-quarkus-mandrel:20.3-java11

You can then execute your native executable with:

    ./build/petstore-runner

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Building the API using IntelliJ IDEA
1. Setup the Targetted JDK in the [IntelliJ] IDEA (Clone the Git Repo from this Link)

    https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject.git

Go to the IntelliJ IDEA and Setup the API from cloned git

Make sure you have install Java Version 11.0 or Above & configure the Java Home in configuration settings.

    JAVA_HOME=C:\Program Files\Java\jdk-11.0.12

A) Setting Up the Gradle in IntelliJ

![IntelliJConfig](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Gradle%20Config.PNG)

B) Building the API after Selecting [Gradle]

2. Install Quarkus Plugin in IntelliJ

![QurakusConfig](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/QuarkusConfig.PNG)

3. Build the Configuration from the Qurakus Tool.
After Installing the Plugin from the MarketPlace of IntelliJ , setup up the API.

![QurakusTool](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Qurkus%20Tool.PNG)

4. Run the API after all the Configurations are setted up.

![QurakusTool](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/QurkusRun.PNG)

## Database Connection Implementation

1. Configuring the Database Connection in Quarkus

![DatabaseConnection](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Database%20Connection.PNG)

2. Connecting the PostgreSQL 
(I have used PoestgreSQL Sql database to work with PetStore API)

![PostgreSQL](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Postgre.PNG)

3. Implementing Entities in Pet Store API to Store data in PostgreSQL

![Entities](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Enitities.PNG)

## Testing API PetStore.

From IntelliJ We can Do the Automated Testing . In my Pet-Store API , following directory file i have Creates Some test Cases.


    petstore -> src -> test -> java 
In that path, few Automated test cases included to make Sure the API running correctly.
 ### Automated Testing

 1. Pets Selection Test Case
 ![Pets](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Automated%20Testing/PetTesting.PNG)

 2. Pets Type Selection Test Case
 ![PetsType](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Automated%20Testing/PetTypeTest.PNG)




## Deploying Application

To deploy the demo app on a docker-compose please visit [./deploy](https://github.com/rasika/petstore/tree/master/deploy)
