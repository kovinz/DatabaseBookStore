package com.company.Entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book {
  private final IntegerProperty BookID = new SimpleIntegerProperty(this, "ClientID");
  private final IntegerProperty PublisherID = new SimpleIntegerProperty(this, "PublisherID");
  private final IntegerProperty SubjectID = new SimpleIntegerProperty(this, "SubjectID");
  private final IntegerProperty AuthorID = new SimpleIntegerProperty(this, "AuthorID");
  private final StringProperty Name = new SimpleStringProperty(this, "Name");
  private final IntegerProperty Price = new SimpleIntegerProperty(this, "Price");
  private final StringProperty Material = new SimpleStringProperty(this, "Material");
  private final IntegerProperty Pages = new SimpleIntegerProperty(this, "Pages");
  private final StringProperty Size = new SimpleStringProperty(this, "Size");
  private final IntegerProperty YearOfPublishing = new SimpleIntegerProperty(this, "YearOfPublishing");
  private final IntegerProperty Quantity = new SimpleIntegerProperty(this, "Quantity");

  public Book(int BookID, int PublisherID, int SubjectID, int AuthorID, String Name,
              int Price, String Material, int Pages, String Size,
              int YearOfPublishing, int Quantity) {
    this.BookID.set(BookID);
    this.PublisherID.set(PublisherID);
    this.SubjectID.set(SubjectID);
    this.AuthorID.set(AuthorID);
    this.Name.set(Name);
    this.Price.set(Price);
    this.Material.set(Material);
    this.Pages.set(Pages);
    this.Size.set(Size);
    this.YearOfPublishing.set(YearOfPublishing);
    this.Quantity.set(Quantity);
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

  public int getBookID() {
    return BookID.get();
  }

  public IntegerProperty bookIDProperty() {
    return BookID;
  }

  public void setBookID(int bookID) {
    this.BookID.set(bookID);
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

  public int getAuthorID() {
    return AuthorID.get();
  }

  public IntegerProperty authorIDProperty() {
    return AuthorID;
  }

  public void setAuthorID(int authorID) {
    this.AuthorID.set(authorID);
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

  public int getPrice() {
    return Price.get();
  }

  public IntegerProperty priceProperty() {
    return Price;
  }

  public void setPrice(int price) {
    this.Price.set(price);
  }

  public String getMaterial() {
    return Material.get();
  }

  public StringProperty materialProperty() {
    return Material;
  }

  public void setMaterial(String material) {
    this.Material.set(material);
  }

  public int getPages() {
    return Pages.get();
  }

  public IntegerProperty pagesProperty() {
    return Pages;
  }

  public void setPages(int pages) {
    this.Pages.set(pages);
  }

  public String getSize() {
    return Size.get();
  }

  public StringProperty sizeProperty() {
    return Size;
  }

  public void setSize(String size) {
    this.Size.set(size);
  }

  public int getYearOfPublishing() {
    return YearOfPublishing.get();
  }

  public IntegerProperty yearOfPublishingProperty() {
    return YearOfPublishing;
  }

  public void setYearOfPublishing(int yearOfPublishing) {
    this.YearOfPublishing.set(yearOfPublishing);
  }

  public int getQuantity() {
    return Quantity.get();
  }

  public IntegerProperty quantityProperty() {
    return Quantity;
  }

  public void setQuantity(int quantity) {
    this.Quantity.set(quantity);
  }
}
