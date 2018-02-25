//Nate R. This is my own work.

package application;
	
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double Height = 600;
        final double Width = 600;

        Pane pane = new Pane();

        for (int x = 0; x < 10; x++) {
        	
            //Sees if first square is Black or White.
            boolean Black = x % 2 == 0;

            for (int y = 0; y < 10; y++) {

                Rectangle rectangle = new Rectangle(x * Height / 10, y * Width / 10, Height / 10, Width / 10);

                rectangle.setStroke(Color.BLACK);

                if (Black) {
                    rectangle.setFill(Color.WHITE);
                } else {
                    rectangle.setFill(Color.BLACK);
                }

                // Toggle between Black/White to determine next squares color.
                Black = !Black;
                pane.getChildren().add(rectangle);
            }
        }
        Scene scene = new Scene(pane, Height, Width);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Nate's Dumpster Checkerboard");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}