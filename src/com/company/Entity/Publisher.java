package com.company.Entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Publisher {
  private final IntegerProperty PublisherID = new SimpleIntegerProperty(this, "PublisherID");
  private final StringProperty Name = new SimpleStringProperty(this, "Name");

  public Publisher(int publisherID, String name) {
    this.PublisherID.set(publisherID);
    this.Name.set(name);
  }

  public int getPublisherID() {
    return PublisherID.get();
  }

  public IntegerProperty publisherIDProperty() {
    return PublisherID;
  }

  public void setPublisherID(int publisherID) {
    this.PublisherID.set(publisherID);
  }

  public String getName() {
    return Name.get();
  }

  public StringProperty nameProperty() {
    return Name;
  }

  public void setName(String name) {
    this.Name.set(name);
  }
}
