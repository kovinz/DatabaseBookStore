package com.company.DAO;

import com.company.Entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDao implements DAO{
  private String user = "root";
  private String password = "qwe123";
  private String url = "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
  private String driver = "com.mysql.cj.jdbc.Driver";
  private Connection connection;

  public DatabaseDao() {
    try {
      Class.forName(driver);
      connection = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public List<Client> getClients() {
    List<Client> clientList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Client");
    ) {
      while (rs.next()) {
        int ClientID = rs.getInt("ClientID");
        String Login = rs.getString("Login");
        String FirstName = rs.getString("FirstName");
        String SecondName = rs.getString("SecondName");
        String Email = rs.getString("Email");
        String Phone = rs.getString("Phone");
        Client client = new Client(ClientID, Login, FirstName, SecondName, Email, Phone);
        clientList.add(client);
      }
      return clientList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return clientList;
  }

  public List<Book> getBooks() {
    List<Book> bookList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Book");
    ) {
      while (rs.next()) {
        int BookID = rs.getInt("BookID");
        int PublisherID = rs.getInt("PublisherID");
        int SubjectID = rs.getInt("SubjectID");
        int AuthorID = rs.getInt("AuthorID");
        String Name = rs.getString("Name");
        int Price = rs.getInt("Price");
        String Material = rs.getString("Material");
        int Pages = rs.getInt("Pages");
        String Size = rs.getString("Size");
        int YearOfPublishing = rs.getInt("YearOfPublishing");
        int Quantity = rs.getInt("Quantity");
        Book book = new Book(BookID, PublisherID, SubjectID, AuthorID, Name, Price,
                Material, Pages, Size, YearOfPublishing, Quantity);
        bookList.add(book);
      }
      return bookList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return bookList;
  }

  public List<Sale> getSalesByClientId(int clientId) {
    List<Sale> saleList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Sale where ClientID = " + Integer.toString(clientId));
    ) {
      while (rs.next()) {
        int SaleID = rs.getInt("SaleID");
        String DateSale = rs.getString("DateSale");
        String Delivery = rs.getString("Delivery");
        int AddressID = rs.getInt("AddressID");
        int ClientID = rs.getInt("ClientID");
        Sale sale = new Sale(SaleID, DateSale, Delivery, AddressID, ClientID);
        saleList.add(sale);
      }
      return saleList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return saleList;
  }

  public List<SaleBook> getSaleBooksBySaleId(int saleId) {
    List<SaleBook> saleBookList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from SaleBook where SaleID = " + Integer.toString(saleId));
    ) {
      while (rs.next()) {
        int BookID = rs.getInt("BookID");
        int SaleID = rs.getInt("SaleID");
        int Quantity = rs.getInt("Quantity");
        SaleBook saleBook = new SaleBook(BookID, SaleID, Quantity);
        saleBookList.add(saleBook);
      }
      return saleBookList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return saleBookList;
  }

  public Book getBookById(int bookId) {
    Book book = null;
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Book where BookID = " + Integer.toString(bookId));
    ) {
      rs.next();
      int BookID = rs.getInt("BookID");
      int PublisherID = rs.getInt("PublisherID");
      int SubjectID = rs.getInt("SubjectID");
      int AuthorID = rs.getInt("AuthorID");
      String Name = rs.getString("Name");
      int Price = rs.getInt("Price");
      String Material = rs.getString("Material");
      int Pages = rs.getInt("Pages");
      String Size = rs.getString("Size");
      int YearOfPublishing = rs.getInt("YearOfPublishing");
      int Quantity = rs.getInt("Quantity");
      book = new Book(BookID, PublisherID, SubjectID, AuthorID, Name, Price,
              Material, Pages, Size, YearOfPublishing, Quantity);
      return book;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return book;
  }

  public List<Book> getBooksByPublisherId(int publisherId) {
    List<Book> bookList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Book where PublisherID = " + Integer.toString(publisherId));
    ) {
      while (rs.next()) {
        int BookID = rs.getInt("BookID");
        int PublisherID = rs.getInt("PublisherID");
        int SubjectID = rs.getInt("SubjectID");
        int AuthorID = rs.getInt("AuthorID");
        String Name = rs.getString("Name");
        int Price = rs.getInt("Price");
        String Material = rs.getString("Material");
        int Pages = rs.getInt("Pages");
        String Size = rs.getString("Size");
        int YearOfPublishing = rs.getInt("YearOfPublishing");
        int Quantity = rs.getInt("Quantity");
        Book book = new Book(BookID, PublisherID, SubjectID, AuthorID, Name, Price,
                Material, Pages, Size, YearOfPublishing, Quantity);
        bookList.add(book);
      }
      return bookList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return bookList;
  }

  public Publisher getPublisherById(int publisherId) {
    Publisher publisher = null;
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Publisher where PublisherID = " + Integer.toString(publisherId));
    ) {
      rs.next();
      int PublisherId = rs.getInt("PublisherID");
      String Name = rs.getString("Name");
      publisher = new Publisher(PublisherId, Name);
      return publisher;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return publisher;
  }

  public List<Subject> getSubjects() {
    List<Subject> subjectList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Subject");
    ) {
      while (rs.next()) {
        int SubjectID = rs.getInt("SubjectID");
        String Name = rs.getString("Name");
        Subject subject = new Subject(SubjectID, Name);
        subjectList.add(subject);
      }
      return subjectList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return subjectList;
  }

  public List<Book> getBooksBySubjectId(int subjectId) {
    List<Book> bookList = new ArrayList<>();
    try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Book where SubjectID = " + Integer.toString(subjectId));
    ) {
      while (rs.next()) {
        int BookID = rs.getInt("BookID");
        int PublisherID = rs.getInt("PublisherID");
        int SubjectID = rs.getInt("SubjectID");
        int AuthorID = rs.getInt("AuthorID");
        String Name = rs.getString("Name");
        int Price = rs.getInt("Price");
        String Material = rs.getString("Material");
        int Pages = rs.getInt("Pages");
        String Size = rs.getString("Size");
        int YearOfPublishing = rs.getInt("YearOfPublishing");
        int Quantity = rs.getInt("Quantity");
        Book book = new Book(BookID, PublisherID, SubjectID, AuthorID, Name, Price,
                Material, Pages, Size, YearOfPublishing, Quantity);
        bookList.add(book);
      }
      return bookList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return bookList;
  }
}
