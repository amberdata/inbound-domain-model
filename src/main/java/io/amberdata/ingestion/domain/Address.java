package io.amberdata.ingestion.domain;

import java.util.Map;
import java.util.Objects;

public class Address implements BlockchainEntity {

  private String hash;
  private Long timestamp;

  private Map<String, Object> meta;

  public Address() {
  }

  private Address(Builder builder) {
    this.hash = builder.hash;
    this.timestamp = builder.timestamp;
    this.meta = builder.meta;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Address address = (Address) obj;
    return Objects.equals(hash, address.hash)
        && Objects.equals(timestamp, address.timestamp)
        && Objects.equals(meta, address.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, timestamp, meta);
  }

  @Override
  public String toString() {
    return "Address{"
        + "hash='" + hash + '\''
        + ", timestamp=" + timestamp
        + ", meta=" + meta
        + '}';
  }

  public static class Builder {

    private String hash;
    private Long timestamp;
    private Map<String, Object> meta;

    public Address.Builder hash(String value) {
      this.hash = value;
      return this;
    }

    public Address.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Address.Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Address build() {
      return new Address(this);
    }
  }
}
