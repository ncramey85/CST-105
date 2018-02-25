//Nate R. This is my own work. 

package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Cards_Draw extends Application{
	
	static ArrayList<Integer> cardDeck = new ArrayList<>();
	static int[] threeNumbers = new int[3];
	
	public static void main (String[] args)
		{
		store52cards();
		Collections.shuffle(cardDeck);
		pickThree(threeNumbers);
		displayNumber(threeNumbers);	
		Application.launch(args);
		}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new HBox(100);
		Image Card = new Image("/Computer/C:/dev/52cards" + "png");
		pane.getChildren().add(new ImageView(Card));
		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Random three cards");
		primaryStage.show();
		
	}		
	public static void displayNumber(int[] threeNumbers)
		{
		for (int i = 0; i < threeNumbers.length; i++)
			{
			System.out.print(threeNumbers[i] + " ");
		}
			}
	
	public static void pickThree(int[] threeNumbers)
		{
		Random Rand = new Random();
		int number;
		int index = 0;
		
		for (int i = 52; i > 49; i--)
		{
		number = Rand.nextInt(i);
		threeNumbers[index] = cardDeck.get(number);
		cardDeck.remove(number);
		index++;
		}
}
	public static void store52cards()
	{
	for (int i = 1; i <= 52; i++)
		{
		cardDeck.add(i);
		}
	}
}