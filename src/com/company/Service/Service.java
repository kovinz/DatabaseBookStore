package com.company.Service;

import com.company.Entity.Book;
import com.company.Entity.Client;
import com.company.Entity.Publisher;
import com.company.Entity.Subject;

import java.util.List;

public interface Service {
  public double getSumOfSaleOfClient(Client client);

  public Publisher getPublisherById(int publisherId);

  public List<Book> getBooksByPublisherIdAndYear(int publisherId, int year);

  public List<Subject> getSubjects();

  public List<Book> getBooksBySubjectId(int subjectId);
}
