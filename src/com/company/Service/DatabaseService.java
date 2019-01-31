package com.company.Service;

import com.company.DAO.DatabaseDao;
import com.company.Entity.*;

import java.util.ArrayList;
import java.util.List;

public class DatabaseService implements Service{
  public double getSumOfSaleOfClient(Client client) {
    double sum = 0;
    DatabaseDao databaseDao = new DatabaseDao();
    List<Sale> sales = databaseDao.getSalesByClientId(client.getClientID());
    for (Sale sale : sales) {
      List<SaleBook> saleBooks = databaseDao.getSaleBooksBySaleId(sale.getSaleID());
      for (SaleBook saleBook : saleBooks) {
        Book book = databaseDao.getBookById(saleBook.getBookID());
        sum += book.getPrice() * saleBook.getQuantity();
      }
    }
    return sum;
  }

  public Publisher getPublisherById(int publisherId) {
    DatabaseDao databaseDao = new DatabaseDao();
    Publisher publisher = databaseDao.getPublisherById(publisherId);
    return publisher;
  }

  public List<Book> getBooksByPublisherIdAndYear(int publisherId, int year) {
    DatabaseDao databaseDao = new DatabaseDao();
    List<Book> bookList = databaseDao.getBooksByPublisherId(publisherId);
    List<Book> appropriateBooks = new ArrayList<>();
    for (Book book : bookList) {
      if (book.getYearOfPublishing() == year) {
        appropriateBooks.add(book);
      }
    }
    return appropriateBooks;
  }

  public List<Subject> getSubjects() {
    DatabaseDao databaseDao = new DatabaseDao();
    List<Subject> subjects = databaseDao.getSubjects();
    return subjects;
  }

  public List<Book> getBooksBySubjectId(int subjectId) {
    DatabaseDao databaseDao = new DatabaseDao();
    List<Book> subjects = databaseDao.getBooksBySubjectId(subjectId);
    return subjects;
  }
}
