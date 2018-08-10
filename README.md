## Amberdata Ingestion API

Not every blockchain has exactly the same entities in its domain model... On the other hand mostly all of them have commonalities. If not same names but similar meaning. 

The idea behind the Amberdata Ingestion API domain model is to gather all similarities 
into generic entities which represent blockchain metrics and bridge them to the [REST API](https://blockchains.amberdata.io/api/v1/spec)


### Ingestion API domain model

short descripiton


### Getting it

#### With Gradle or Maven

> here should be instructions of how to add maven repository which contains ingestion-domain-model artifact

Add a dependency to your `pom.xml` 

```xml
<dependency>
  <groupId>io.amberdata.ingestion-api</groupId>
  <artifactId>ingestion-domain-model</artifactId>
  <version>0.1.1</version>
</dependency>

```

or to your `build.gradle`

```gradle
dependencies {
    implementation 'io.amberdata.ingestion-api:ingestion-domain-model:0.1.1'
}
```

#### Build

```sh
$ git clone https://github.com/amberdata/ingestion-domain-model.git
$ cd ingestion-domain-model
$ ./mvnw clean install
```

### Getting Started

describe here how to create - builders
