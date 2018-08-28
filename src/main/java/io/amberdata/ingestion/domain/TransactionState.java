package io.amberdata.ingestion.domain;

public enum TransactionState {

  unknown   (0),
  pending   (1),
  confirmed (2),
  replaced  (3),
  lost      (4);

  private final int id;

  TransactionState (int id) {
    this.id = id;
  }

  public int getId () {
    return this.id;
  }

  public static TransactionState fromId (Integer id) {
    if ( id == null ) {
      return null;
    }

    for (TransactionState type : values()) {
      if ( type.getId() == id ) {
        return type;
      }
    }

    return null;
  }

}
