# PetStore Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

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
A) Setting Up the Gradle in IntelliJ
![IntelliJConfig](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Gradle%20Config.PNG)

B) Building the API after Selecting [Gradle]

2. Install Quarkus Plugin in IntelliJ
![QurakusConfig](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/QuarkusConfig.PNG)

3. Build the Configuration from the Qurakus Tool.
After Installing the Plugin from the MarketPlace of IntelliJ , setup up the API.
![QurakusConfig](https://github.com/Pandula1234/Pet-Store-API-MiddlewareProject/blob/main/Pet%20Store%20Documentation%20(Testing)/Configuration/Qurkus%20Tool.PNG)


## Deploying Application

To deploy the demo app on a docker-compose please visit [./deploy](https://github.com/rasika/petstore/tree/master/deploy)
