# Amberdata Ingestion API

The Amberdata Ingestion Domain Model defines the different entities and object models that 3rd parties can use to push data into the Amberdata platform.

After working with and researching a few different blockchains (Ethereum, Aion, Stellar, etc)  we have found some commonalities (and differences!) between them, and this project is the result.

Once ingested into the Amberdata platform, these entities are processed by our backend pipeline, where we combine these data sources with off-chain data, extract metrics, and provide insights, analytics and monitoring into your blockchain.

A full Swagger documentation of the REST API is available [here](https://blockchains.amberdata.io/api/v1/spec).


# How to use it (Gradle or Maven)

> Here should be instructions of how to add maven repository which contains ingestion-domain-model artifact

Add a dependency to your `pom.xml` 

```xml
<dependency>
  <groupId>io.amberdata.ingestion</groupId>
  <artifactId>ingestion-domain</artifactId>
  <version>0.1.4</version>
</dependency>

```

or to your `build.gradle`

```gradle
dependencies {
    implementation 'io.amberdata.ingestion:ingestion-domain:0.1.4'
}
```

# Build locally

```sh
$ git clone https://github.com/amberdata/ingestion-domain-model.git
$ cd ingestion-domain-model
$ mvn clean install
```

# Getting Started

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

In some cases you have parameters which don't fit the generic model. In order not to miss such parameters, you will use `meta` property

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
  .meta(optionalProperties)
  .build();
```


# Licensing

This project is licensed under the [Apache Licence 2.0](./LICENSE).

See also [Contributing](./CONTRIBUTING.md)
