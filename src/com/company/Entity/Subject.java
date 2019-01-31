package com.company.Entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Subject {
  private final IntegerProperty SubjectID = new SimpleIntegerProperty(this, "SubjectID");
  private final StringProperty Name = new SimpleStringProperty(this, "Name");

  public Subject(int subjectID, String name) {
    this.SubjectID.set(subjectID);
    this.Name.set(name);
  }

  public int getSubjectID() {
    return SubjectID.get();
  }

  public IntegerProperty subjectIDProperty() {
    return SubjectID;
  }

  public void setSubjectID(int subjectID) {
    this.SubjectID.set(subjectID);
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
