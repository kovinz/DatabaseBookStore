package com.company.Entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
  private final IntegerProperty ClientID = new SimpleIntegerProperty(this, "ClientID");
  private final StringProperty Login = new SimpleStringProperty(this, "Login");
  private final StringProperty FirstName  = new SimpleStringProperty(this, "FirstName");
  private final StringProperty SecondName  = new SimpleStringProperty(this, "SecondName");
  private final StringProperty Email  = new SimpleStringProperty(this, "Email");
  private final StringProperty Phone  = new SimpleStringProperty(this, "Phone");

  public Client(int clientID, String login,
                String firstName, String secondName,
                String email, String phone) {
    ClientID.set(clientID);
    Login.set(login);
    FirstName.set(firstName);
    SecondName.set(secondName);
    Email.set(email);
    Phone.set(phone);
  }

  public int getClientID() {
    return ClientID.get();
  }

  public IntegerProperty clientIDProperty() {
    return ClientID;
  }

  public void setClientID(int clientID) {
    this.ClientID.set(clientID);
  }

  public String getLogin() {
    return Login.get();
  }

  public StringProperty loginProperty() {
    return Login;
  }

  public void setLogin(String login) {
    this.Login.set(login);
  }

  public String getFirstName() {
    return FirstName.get();
  }

  public StringProperty firstNameProperty() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    this.FirstName.set(firstName);
  }

  public String getSecondName() {
    return SecondName.get();
  }

  public StringProperty secondNameProperty() {
    return SecondName;
  }

  public void setSecondName(String secondName) {
    this.SecondName.set(secondName);
  }

  public String getEmail() {
    return Email.get();
  }

  public StringProperty emailProperty() {
    return Email;
  }

  public void setEmail(String email) {
    this.Email.set(email);
  }

  public String getPhone() {
    return Phone.get();
  }

  public StringProperty phoneProperty() {
    return Phone;
  }

  public void setPhone(String phone) {
    this.Phone.set(phone);
  }
}
