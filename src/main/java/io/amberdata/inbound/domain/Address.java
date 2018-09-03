package io.amberdata.inbound.domain;

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
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Map<String, Object> getMeta() {
    return this.meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || this.getClass() != object.getClass()) {
      return false;
    }

    Address that = (Address) object;
    return
        Objects.equals(this.hash, that.hash)
          && Objects.equals(this.timestamp, that.timestamp)
          && Objects.equals(this.meta, that.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.hash, this.timestamp, this.meta);
  }

  @Override
  public String toString() {
    return "Address{"
        + "hash='" + this.hash + '\''
        + ", timestamp=" + this.timestamp
        + ", meta=" + this.meta
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
