/* C202/Summer 2015
 * Lab2Program.java
 * Written By   : Farhad Amiri
 * Date Written : 07/28/2015
 * Purpose      : JavaFx circles with a line 
 */
package pkg202lab9;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.geometry.Point2D;

public class Main extends Application {

    double x = 0;
    double x1 = 0;
    double y = 0;
    double y1 = 0;
    double width = 250;
    double height = 300;

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        x = Math.random() * (width - 12);
        y = Math.random() * (height - 12);
        x1 = Math.random() * (width- 12);
        y1 = Math.random() * (height - 12);

        Circle circle1 = new Circle(x, y, 15);
        Circle circle2 = new Circle(x1, y1, 15);
        circle1.setFill(Color.RED);
        circle2.setFill(Color.BLUE);
        Line line = new Line(x, y, x1, y1);
        line.setFill(Color.YELLOW);
        Point2D p = new Point2D (x1,y1);
        Text t = new Text((x + x1) / 2, (y + y1) / 2, p.distance(x, y) + "");

        pane.getChildren().addAll(circle1, circle2, line, t);
        Scene scene = new Scene(pane, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
