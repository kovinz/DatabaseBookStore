package com.company.Entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sale {
  private final IntegerProperty SaleID = new SimpleIntegerProperty(this, "SaleID");
  private final StringProperty DateSale = new SimpleStringProperty(this, "DateSale");
  private final StringProperty Delivery = new SimpleStringProperty(this, "Delivery");
  private final IntegerProperty AddressID = new SimpleIntegerProperty(this, "AddressID");
  private final IntegerProperty ClientID = new SimpleIntegerProperty(this, "ClientID");

  public Sale(int saleID, String dateSale,
              String delivery, int addressID,
              int clientID) {
    SaleID.set(saleID);
    DateSale.set(dateSale);
    Delivery.set(delivery);
    AddressID.set(addressID);
    ClientID.set(clientID);
  }

  public int getSaleID() {
    return SaleID.get();
  }

  public IntegerProperty saleIDProperty() {
    return SaleID;
  }

  public void setSaleID(int saleID) {
    this.SaleID.set(saleID);
  }

  public String getDateSale() {
    return DateSale.get();
  }

  public StringProperty dateSaleProperty() {
    return DateSale;
  }

  public void setDateSale(String dateSale) {
    this.DateSale.set(dateSale);
  }

  public String getDelivery() {
    return Delivery.get();
  }

  public StringProperty deliveryProperty() {
    return Delivery;
  }

  public void setDelivery(String delivery) {
    this.Delivery.set(delivery);
  }

  public int getAddressID() {
    return AddressID.get();
  }

  public IntegerProperty addressIDProperty() {
    return AddressID;
  }

  public void setAddressID(int addressID) {
    this.AddressID.set(addressID);
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
}
