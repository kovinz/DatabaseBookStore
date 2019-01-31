package com.company.Screen;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainScreen extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    MainScreen.showMainScreen();
  }

  public static void showMainScreen(){
    VBox root = new VBox();

    Button clientsTable = new Button("ClientsTable");
    clientsTable.setPrefWidth(150);
    clientsTable.setPrefHeight(75);

    Button booksTable = new Button("BooksTable");
    booksTable.setPrefWidth(150);
    booksTable.setPrefHeight(75);

    Button barChart = new Button("BarChart");
    barChart.setPrefWidth(150);
    barChart.setPrefHeight(75);

    Button pieChart = new Button("PieChart");
    pieChart.setPrefWidth(150);
    pieChart.setPrefHeight(75);

    clientsTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        clientsTable.getScene().getWindow().hide();
        ClientTable.showClientTable();
      }
    });

    booksTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        booksTable.getScene().getWindow().hide();
        BookTable.showBookTable();
      }
    });

    barChart.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        barChart.getScene().getWindow().hide();
        BarChart.showBarChart();
      }
    });

    pieChart.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        pieChart.getScene().getWindow().hide();
        PieChartBooks.showPieChart();
      }
    });

    Text tablesTitle = new Text("Tables");
    Text chartsTitle = new Text("Charts");
    root.getChildren().addAll(tablesTitle, clientsTable, booksTable, chartsTitle, barChart, pieChart);
    root.setPadding(new Insets(20));
    root.setSpacing(10);
    Scene scene = new Scene(root, 600, 400);
    Stage stage = new Stage();
    stage.setTitle("MainScreen");
    stage.setScene(scene);
    stage.show();
  }
}
