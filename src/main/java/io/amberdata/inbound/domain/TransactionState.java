package io.amberdata.inbound.domain;

public enum TransactionState {

  unknown(0),
  pending(1),
  confirmed(2),
  replaced(3),
  lost(4);

  private final int id;

  TransactionState(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  /**
   * Returns an instance of TransactionState according to given to integer ID.
   * @param id instance ID
   * @return instance of TransactionState enum or {@code null} if no corresponding instance exists
   */
  public static TransactionState fromId(Integer id) {
    if (id == null) {
      return null;
    }

    for (TransactionState type : values()) {
      if (type.getId() == id) {
        return type;
      }
    }

    return null;
  }

}
