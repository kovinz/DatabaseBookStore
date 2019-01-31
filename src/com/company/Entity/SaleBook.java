package com.company.Entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SaleBook {
  private final IntegerProperty BookID = new SimpleIntegerProperty(this, "BookID");
  private final SimpleIntegerProperty SaleID = new SimpleIntegerProperty(this, "SaleID");
  private final SimpleIntegerProperty Quantity = new SimpleIntegerProperty(this, "Quantity");

  public SaleBook(int bookID, int saleID, int quantity) {
    BookID.set(bookID);
    SaleID.set(saleID);
    Quantity.set(quantity);
  }

  public int getBookID() {
    return BookID.get();
  }

  public IntegerProperty bookIDProperty() {
    return BookID;
  }

  public void setBookID(int bookID) {
    this.BookID.set(bookID);
  }

  public int getSaleID() {
    return SaleID.get();
  }

  public SimpleIntegerProperty saleIDProperty() {
    return SaleID;
  }

  public void setSaleID(int saleID) {
    this.SaleID.set(saleID);
  }

  public int getQuantity() {
    return Quantity.get();
  }

  public SimpleIntegerProperty quantityProperty() {
    return Quantity;
  }

  public void setQuantity(int quantity) {
    this.Quantity.set(quantity);
  }
}
