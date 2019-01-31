package com.company.Screen;

import com.company.Entity.Book;
import com.company.Entity.Publisher;
import com.company.Service.DatabaseService;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.List;

public class BarChart {
  public static void showBarChart(){
    CategoryAxis xAxis = new CategoryAxis();
    NumberAxis yAxis = new NumberAxis();
    javafx.scene.chart.BarChart<String, Number> barChart = new javafx.scene.chart.BarChart<>(xAxis, yAxis) ;
    xAxis.setLabel("Years");
    yAxis.setLabel("QuantityOfBooks");

    DatabaseService service = new DatabaseService();
    Publisher act = service.getPublisherById(1);
    Publisher bloomsbury = service.getPublisherById(3);

    List<Book> act2014 = service.getBooksByPublisherIdAndYear(1, 2014);
    List<Book> act2015 = service.getBooksByPublisherIdAndYear(1, 2015);
    List<Book> act2016 = service.getBooksByPublisherIdAndYear(1, 2016);
    List<Book> bloomsbury2014 = service.getBooksByPublisherIdAndYear(3, 2014);
    List<Book> bloomsbury2015 = service.getBooksByPublisherIdAndYear(3, 2015);
    List<Book> bloomsbury2016 = service.getBooksByPublisherIdAndYear(3, 2016);

    XYChart.Series series1 = new XYChart.Series();
    series1.setName(act.getName());
    series1.getData().add(new XYChart.Data("2016", act2014.size()));
    series1.getData().add(new XYChart.Data("2015", act2015.size()));
    series1.getData().add(new XYChart.Data("2014", act2016.size()));

    XYChart.Series series2 = new XYChart.Series();
    series2.setName(bloomsbury.getName());
    series2.getData().add(new XYChart.Data("2016", bloomsbury2014.size()));
    series2.getData().add(new XYChart.Data("2015", bloomsbury2015.size()));
    series2.getData().add(new XYChart.Data("2014", bloomsbury2016.size()));

    barChart.getData().addAll(series1, series2);

    BorderPane root = new BorderPane();
    Button button = new Button("Back");
    root.setTop(button);
    root.setCenter(barChart);
    button.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        button.getScene().getWindow().hide();
        MainScreen.showMainScreen();
      }
    });
    Scene scene  = new Scene(root,800,600);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
  }
}
