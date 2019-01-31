package com.company.DAO;

import com.company.Entity.*;

import java.util.List;

public interface DAO {
  public List<Client> getClients();

  public List<Book> getBooks();

  public List<Sale> getSalesByClientId(int clientId);

  public List<SaleBook> getSaleBooksBySaleId(int saleId);

  public Book getBookById(int bookId);

  public List<Book> getBooksByPublisherId(int publisherId);

  public Publisher getPublisherById(int publisherId);

  public List<Subject> getSubjects();

  public List<Book> getBooksBySubjectId(int subjectId);

}
