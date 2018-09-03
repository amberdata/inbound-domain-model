# Amberdata Inbound API

Amberdata provides monitoring, alerting and analytics for blockchains.

The Amberdata platform can accept data from different blockchains.  In fact, after working with and researching a few different protocols and implementations (Ethreum, Aion, Stellar, etc), we have found some commonalities between them (and some differences!), and we have developed a global data model. 

This data model can be split into two different types of entities:
  - raw types: Block, Uncle, Transaction, Address, Log and FunctionCall
  - derived types: Asset, Token, Order and Trade


# Raw types

At the very bottom of the stack, we have:
  - **blocks**, which contain transactions
  - **uncles**, also known as orphan blocks
  - **transactions**, which may include function calls and/or logs
  - **addresses**, which can designate EOAs (Externally Owned Accounts) or Contracts
  - **function calls**, also called internal messages
  - **logs**, a record of events emitted from a contract execution

## Block

### Description

* **number** :BigInteger number (or position )of the block in the blockchain
* **hash** :String the unique identifier for the block (typically a UUID or hexadecimal string)
* **gasUsed** :BigDecimal a value indicating the cost of generating this block (the unit will be different from chain to chain)
* **numTransactions** :Integer the number of transactions included in this block
* **parentHash** :String the unique identifier for the parent of this block in the blockchain
* **timestamp** :Long the date/time when this block was created and incorporated into the blockchain (expressed in milliseconds)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

### Future improvements

Note: In the next release, we will add, as part of the top level properties of a block:
* nonce
* difficulty
* size
* totalDifficulty

(see Uncle description for more details)

## Uncle

### Description

* **hash** :String the unique identifier for the uncle (typically a UUID or hexadecimal string)
* **number** :BigInteger number of this uncle
* **blockNumber** :BigInteger number of the block this uncle is attached to
* **blockHash** :String hash of the block this uncle is attached to
* **blockTimestamp** :Long the date/time of the block this uncle is attached to
* **blockTimestampNanoseconds** :Long the nanoseconds part of the block this uncle is attached to
* **difficulty** :BigInteger the difficulty at the time uncle was created
* **gasLimit** :BigInteger the gas limit at the time uncle was created
* **gasUsed** :BigInteger the gas used at the time uncle was created
* **logsBloom** :String the bloom filter for the logs of the uncle
* **miner** :String the address of the miner which created this uncle
* **mixHash** :BigInteger value used in the computational work for Proof of Work for example
* **nonce** :BigInteger value used in the computational work for Proof of Work for example
* **parentHash** :String the unique identifier for the parent block this uncle is attached to
* **positionIndex** :Integer the index of this uncle within the block it is attached to (for ordering purposes)
* **rewardValue** :String the reward for discovering this uncle
* **size** :Long the size ib bytes this uncle is occupying in the chain
* **timestamp** :Long the date/time when this uncle was created (expressed in milliseconds)
* **timestampNanoseconds** :Long the nanoseconds part of the creation timestamp
* **totalDifficulty** :BigInteger the total difficulty at the time uncle was created
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

## Transaction

### Description

* **hash** :String the unique identifier for the transaction (typically a UUID or hexadecimal string)
* **blockNumber** :BigInteger number of the block this transaction was included in
* **from** :String the address of the originator of this transaction  
* **functionCalls** :List<FunctionCall> a list of function calls executed during this transaction
* **gas** :BigInteger
* **gasUsed** :BigInteger  
* **nonce** :BigInteger number of transactions sent from an address (this is typically used to prevent double spending for example)  
* **numLogs** :Integer the number of log entries generated during this transaction  
* **status** :String an indication of the success or failure for the transaction (0x1 = success, 0x0 = failure) 
* **timestamp** :Long the date/time when this transaction was created and incorporated into a block (expressed in milliseconds)
* **to** :String the address of the recipient of this transaction (if there is only one)  
* **tos** :List<String> the addresses of the recipients of this transaction (if there are more than one)  
* **transactionIndex** :Long position of the transaction in the block (for ordering purposes)
* **value** :BigDecimal any transfer of value carried out by this transaction (0 if none)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

### Future improvements

Note: gas and gasUsed will be revisited into gas and gasPrice instead

Note: the next version will include:
* logs :List<Log> a list of log entries generated during this transaction
* numFunctionCalls :Integer the number of function calls executed during this transaction

Note: status wil be revisited in the next release and split into:
* status :boolean true if the transaction was successful, false otherwise
* statusCode :Integer a value indicating the type of error if any (0 = success)
* statusMessage :String a string explaining the reason for the failure (can be empty)

## Address

### Description

* **hash** :String the unique identifier for the address (typically a UUID or hexadecimal string)
* **timestamp** :Long the date/time when this address was encountered (expressed in milliseconds)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

### Future improvements

Note: the next revision will include
- type :String the type of address (EOA or Contract)
- subType :String the sub-type (Token, ERC20, ERC721)

## Function Call

### Description

* **hash** :String the unique identifier for the function call (typically a UUID or hexadecimal string)
* **arguments** :List<Argument> a list of arguments being passed to the function
* **assetType** :String the asset type involved in this function call (if any)
* **blockNumber** :Long number of the block this function call was part of  
* **depth** :Integer the depth of this function call in the call stack  
* **from** :String the address of the originator of this function call (if any)  
* **index** :Integer position of the function call in the transaction (for ordering purposes)
* **name** :String the name of the function being called
* **result** :String the result of the function call
* **signature** :String the signature of the function being called
* **subFunctions** :List<FunctionCall> the list of sub-functions called by this function (if any)
* **timestamp** :Long the date/time when this function call was executed (expressed in milliseconds)
* **to** :String the address of the recipient of this function call (if any)  
* **transactionHash** :String the unique identifier for the transaction this function call was part of
* **type** :String the type of the function being called
* **value** :BigDecimal any transfer of value carried out by this function call (if any)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

### Future improvements

TODO: what is type ???

## Log

* Note: COMING SOON

# Derived types

As we go up the stack, higher level object types are:
  - **assets**
  - **tokens** (for example ERC20 or ERC721 type tokens)
  - **orders** (DEX, or decentralized exchange related)
  - **trades** (DEX, or decentralized exchange related)

## Asset

### Description

* **amount** :String initial amount or supply for this asset
* **code** :String the code of the asset (typically a 3 or 4 letter code) 
* **functionCallHash** :String the unique identifier for the function call with which this asset was created
* **issuerAccount** :String the address of the creator or issuer of this asset
* **timestamp** :Long the date/time when this asset was created (expressed in milliseconds) (typically the timestamp of the associated function call or transaction)
* **transactionHash** :String the unique identifier for the transaction in which this asset was created
* **type** :AssetType the type of the asset (native, credit_alphanum4, credit_alphanum12, unknown)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

## Token

### Description

* **address** :String the address of the contract which created this token  
* **symbol** :String the symbol associated to this token (typically a 3 or 4 letter code)
* **name** :String the name of this token
* **decimals** :BigDecimal the number of decimals used by this token (Ethereum specific)
* **erc20** :boolean true if this token is an ERC20 token
* **erc721** :boolean true if this token is an ERC721 token
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

## Order

### Description

* **orderId** :String the unique identifier for the order (typically a UUID or hexadecimal string)
* **blockNumber** :Long number of the block this order was created in  
* **buyAmount** :BigDecimal the amount of asset being bought
* **buyAsset** :String the unique identifier for the asset being bought
* **expirationMs** :Long the timestamp at which this order expires
* **expirationNanoseconds** :Long the nanoseconds part of the expiration timestamp
* **functionCallHash** :String the unique identifier for the function call with which this order was created
* **makerAddress** :String the address of the creator of this order
* **sellAmount** :BigDecimal the amount of asset being sold
* **sellAsset** :String the unique identifier for the asset being sold
* **timestamp** :Long the date/time when this order was issued (expressed in milliseconds)
* **timestampNanoseconds** :Long the nanoseconds part of the issued timestamp
* **transactionHash** :String the unique identifier for the transaction this order was created in
* **type** :Integer type of order (buy or sell)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information

## Trade

### Description

* **blockNumber** :Long number of the block this trade was executed in  
* **buyAddress** :String the address of the buyer
* **buyAmount** :BigDecimal the amount of asset being bought
* **buyAsset** :String the unique identifier for the asset being bought
* **fee** :BigDecimal the fees associated with this trade (if any)
* **functionCallHash** :String the unique identifier for the function call with which this trade was executed
* **orderId** :String the unique identifier for the order that this trade corresponds to
* **sellAddress** :String the address of the seller
* **sellAmount** :BigDecimal the amount of asset being sold
* **sellAsset** :String the unique identifier for the asset being sold
* **timestamp** :Long the date/time when this trade was executed (expressed in milliseconds)
* **timestampNanoseconds** :Long the nanoseconds part of the execution timestamp
* **tradeId** :String the unique identifier for the trade (typically a UUID or hexadecimal string)
* **transactionHash** :String the unique identifier for the transaction this trade was executed in
* **type** :Integer type of trade (buy or sell)
* **meta** :Map<String, Object> a means to hold more information, typically used for blockchains specific information


# Usage

## Use in another project

To add the Amberdata Inbound Domain Model to you Maven project, add this dependency to your `pom.xml`:
```xml
<dependency>
    <groupId>io.amberdata.ingestion</groupId>
    <artifactId>ingestion-domain</artifactId>
    <version>0.1.17</version>
</dependency>
```

Or to your `build.gradle`:
```gradle
dependencies {
    implementation 'io.amberdata.ingestion:ingestion-domain:0.1.17'
}
```

## Build locally

```sh
$ git clone https://github.com/amberdata/ingestion-domain-model.git
$ cd ingestion-domain-model
$ mvn clean install
```

# Getting Started

The easiest way to create and populate an entity is to use the Builder class provided with each class.

For example, to create a block:
```
Block block = new Block.Builder()
    .number(BigInteger.valueOf(5_000_000))
    .hash("0x1234a")
    .parentHash("0x1234b")
    .gasUsed(new BigDecimal(100))
    .numTransactions(10)
    .timestamp(1533891660)
    .build();
```

Some blockchains might have additional parameters which don't fit the global domain model.  In this case, they can be passed it in the `meta` property:
```
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
