# 

This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.

This Groovy package, using the [http-builder-ng library](https://http-builder-ng.github.io/http-builder-ng/), is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Generator version: 7.15.0-SNAPSHOT
- Build package: org.openapitools.codegen.languages.GroovyClientCodegen

## Requirements

* Groovy 2.5.7
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

## Getting Started


```groovy
def apiInstance = new PetApi()
def pet = new Pet() // Pet | Pet object that needs to be added to the store

apiInstance.addPet(pet)
    {
    // on success
    def result = (Pet)it
    println result
    
}
    {
    // on failure
    statusCode, message ->
        println "${statusCode} ${message}"
};
```

