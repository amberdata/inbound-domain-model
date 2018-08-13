## Amberdata Ingestion API

Not every blockchain has exactly the same entities in its domain model... On the other hand mostly all of them have commonalities. If not same names but similar meaning. 

The idea behind the Amberdata Ingestion API domain model is to gather all similarities 
into generic entities which represent blockchain metrics and bridge them to the [REST API](https://blockchains.amberdata.io/api/v1/spec)


### Ingestion API domain model

Ingestion API domain model contains a collection of generic entities.


### Getting it

#### With Gradle or Maven

> here should be instructions of how to add maven repository which contains ingestion-domain-model artifact

Add a dependency to your `pom.xml` 

```xml
<dependency>
  <groupId>io.amberdata.ingestion</groupId>
  <artifactId>ingestion-domain</artifactId>
  <version>0.1.1</version>
</dependency>

```

or to your `build.gradle`

```gradle
dependencies {
    implementation 'io.amberdata.ingestion:ingestion-domain:0.1.1'
}
```

#### Build

```sh
$ git clone https://github.com/amberdata/ingestion-domain-model.git
$ cd ingestion-domain-model
$ ./mvnw clean install
```

### Getting Started

To populate and create an entity you will use Builder methods of the entity class

In the simplest case to create a block you will write similar code
                                
```java
Block block = new Block.Builder()
  .number(BigInteger.valueOf(5_000_000))
  .hash("0x1234a")
  .parentHash("0x1234b")
  .gasUsed(new BigDecimal(100))
  .numTransactions(10)
  .timestamp(1533891660)
  .build();
```

In some cases you have parameters which don't fit the generic model. In order not to miss such parameters, you will use `optionalProperties` map

```java
Map<String, Object> optionalProperties = new HashMap<>();
optionalProperties.put("operarion_name", "transfer");
optionalProperties.put("operarion_value", 1000);
        
Block block = new Block.Builder()
  .number(BigInteger.valueOf(5_000_000))
  .hash("0x1234a")
  .parentHash("0x1234b")
  .gasUsed(new BigDecimal(100))
  .numTransactions(10)
  .timestamp(1533891660)
  .optionalProperties(optionalProperties)
  .build();
```

