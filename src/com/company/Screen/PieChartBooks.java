package com.company.Screen;


import com.company.Entity.Subject;
import com.company.Service.DatabaseService;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class PieChartBooks {
  public static void showPieChart() {
    DatabaseService service = new DatabaseService();
    List<Subject> subjects = service.getSubjects();
    List<Integer> quantityOfBooksOnSubjects = new ArrayList<>();
    for (Subject subject : subjects) {
      quantityOfBooksOnSubjects.add(service.getBooksBySubjectId(subject.getSubjectID()).size());
    }
    PieChart pieChart = new PieChart();
    int i = 0;
    List<PieChart.Data> datas = new ArrayList<>();
    for (Subject subject : subjects) {
      datas.add(new PieChart.Data(subject.getName(), quantityOfBooksOnSubjects.get(i)));
      i++;
    }
    for (i = 0; i < datas.size(); i++) {
      pieChart.getData().add(datas.get(i));
    }

    pieChart.setLegendSide(Side.LEFT);

    BorderPane root = new BorderPane();
    Button button = new Button("Back");
    root.setTop(button);
    root.setCenter(pieChart);
    button.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        button.getScene().getWindow().hide();
        MainScreen.showMainScreen();
      }
    });
    Scene scene = new Scene(root, 800, 600);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
  }
}

