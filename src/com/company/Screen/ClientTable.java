package com.company.Screen;

import com.company.DAO.DatabaseDao;
import com.company.Entity.Client;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableView ;
import javafx.scene.control.TableColumn ;
import javafx.scene.control.cell.PropertyValueFactory ;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane ;
import javafx.scene.Scene ;
import javafx.stage.Stage ;

public class ClientTable{


  public static void showClientTable(){
      DatabaseDao databaseDao = new DatabaseDao();

      TableView<Client> clientTable = new TableView<>();
      TableColumn<Client, Integer> clientIdCol = new TableColumn<>("ClientID");
      clientIdCol.setCellValueFactory(new PropertyValueFactory<>("ClientID"));
      TableColumn<Client, String> loginCol = new TableColumn<>("Login");
      loginCol.setCellValueFactory(new PropertyValueFactory<>("Login"));
      TableColumn<Client, String> firstNameCol = new TableColumn<>("FirstName");
      firstNameCol.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
      TableColumn<Client, String> secondNameCol = new TableColumn<>("SecondName");
      secondNameCol.setCellValueFactory(new PropertyValueFactory<>("SecondName"));
      TableColumn<Client, String> emailCol = new TableColumn<>("Email");
      emailCol.setCellValueFactory(new PropertyValueFactory<>("Email"));
      TableColumn<Client, String> phoneCol = new TableColumn<>("Phone");
      phoneCol.setCellValueFactory(new PropertyValueFactory<>("Phone"));

      clientTable.getColumns().addAll(clientIdCol, loginCol, firstNameCol, secondNameCol, emailCol, phoneCol);

      clientTable.getItems().addAll(databaseDao.getClients());

      BorderPane root = new BorderPane();
      root.setCenter(clientTable);
      Button button = new Button("Back");
      root.setTop(button);
      button.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        button.getScene().getWindow().hide();
        MainScreen.showMainScreen();
      }
    });
      Scene scene = new Scene(root, 600, 400);
      Stage stage = new Stage();
      stage.setScene(scene);
      stage.show();
  }
}