package com.company.Screen;

import com.company.DAO.DatabaseDao;
import com.company.Entity.Book;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BookTable{

  public static void showBookTable(){
    DatabaseDao databaseDao = new DatabaseDao();

    TableView<Book> bookTable = new TableView<>();
    TableColumn<Book, Integer> bookIdCol = new TableColumn<>("BookID");
    bookIdCol.setCellValueFactory(new PropertyValueFactory<>("BookID"));

    TableColumn<Book, Integer> subjectIdCol = new TableColumn<>("SubjectID");
    subjectIdCol.setCellValueFactory(new PropertyValueFactory<>("SubjectID"));

    TableColumn<Book, String> authorIdCol = new TableColumn<>("AuthorID");
    authorIdCol.setCellValueFactory(new PropertyValueFactory<>("AuthorID"));

    TableColumn<Book, String> nameCol = new TableColumn<>("Name");
    nameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));

    TableColumn<Book, Integer> priceCol = new TableColumn<>("Price");
    priceCol.setCellValueFactory(new PropertyValueFactory<>("Price"));

    TableColumn<Book, String> materialCol = new TableColumn<>("Material");
    materialCol.setCellValueFactory(new PropertyValueFactory<>("Material"));

    TableColumn<Book, Integer> pagesCol = new TableColumn<>("Pages");
    pagesCol.setCellValueFactory(new PropertyValueFactory<>("Pages"));

    TableColumn<Book, String> sizeCol = new TableColumn<>("Size");
    sizeCol.setCellValueFactory(new PropertyValueFactory<>("Size"));

    TableColumn<Book, Integer> yearOfPublishingCol = new TableColumn<>("YearOfPublishing");
    yearOfPublishingCol.setCellValueFactory(new PropertyValueFactory<>("YearOfPublishing"));

    TableColumn<Book, Integer> quantityCol = new TableColumn<>("Quantity");
    quantityCol.setCellValueFactory(new PropertyValueFactory<>("Quantity"));

    bookTable.getColumns().addAll(bookIdCol, subjectIdCol, authorIdCol, nameCol, priceCol,
            materialCol, pagesCol, sizeCol, yearOfPublishingCol, quantityCol);

    bookTable.getItems().addAll(databaseDao.getBooks());

    BorderPane root = new BorderPane();
    root.setCenter(bookTable);
    Button button = new Button("Back");
    root.setTop(button);
    button.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        button.getScene().getWindow().hide();
        MainScreen.showMainScreen();
      }
    });
    Scene scene = new Scene(root, 900, 500);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
  }
}
