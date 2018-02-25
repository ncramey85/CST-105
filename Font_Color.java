//Nate R. This is my own work

package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class Font_Color extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    
    public void start(Stage primaryStage) {
        // Settings for HBox Pane
        HBox hBox = new HBox(100);
        hBox.setPadding(new Insets(100));

        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
        
        // Stores five (5) text styles with size, fonts, vertically, and random colors.
        for (int i = 0; i < 5; i++) {
            Text text = new Text("Java");
            text.setFont(font);
            text.setRotate(90);
            text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            hBox.getChildren().add(text);
        }
        
        // Displays Text.
        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}