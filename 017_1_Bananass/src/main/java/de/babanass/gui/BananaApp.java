package de.babanass.gui;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * estellt eine JavaFx-application
 * @author Alfa
 *
 */
public class BananaApp  extends Application{

	private String title;
	@Override
	public void start(Stage primaryStage) {
	//	primaryStage.setTitle("Minions sind wunderbar");
		primaryStage.setTitle(title);
		
		GridPane gitter = new GridPane();
		gitter.setAlignment(Pos.CENTER);
		
		gitter.setHgap(5);
		gitter.setVgap(5);
		
		Label begruessung = new Label("willkomw bei den Minions");
		gitter.add(begruessung, 0, 0,2,1);
		begruessung.setStyle("-fx-font-family: 'Caudex', serif;"
				+ "-fx-font-size:25;"
				+ "-fx-text-fill:yellow;");
		Label user = new Label("Der Minion:");
		TextField userEingabe = new TextField();
		gitter.add(user, 0, 1);
		gitter.add(userEingabe, 1, 1);
		
		Label chef = new Label("der cChef");
		PasswordField chefEingabe = new PasswordField();
		gitter.add(chef, 0, 2);
		gitter.add(chefEingabe, 1, 2);
		
		HBox knoepfe = new HBox();
		Button bestellen = new Button("Banana bestellen");
		Button abrbrechen = new Button("keine Banana bestellen");
		Button pumuckel = new Button("kein Minion , ich mache unsinn");
		pumuckel.setId("pumuckel");
		
		pumuckel.setOnAction(event -> userEingabe.setText("pumuckel schreibt"));
		
		knoepfe.getChildren().addAll(bestellen, abrbrechen, pumuckel);
		gitter.add(knoepfe, 1, 4);
		
		Scene scene = new Scene(gitter, 500, 500);
		scene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Caudex:ital@0;1&family=Roboto:wght@300;400;700&display=swap");
		scene.getStylesheets().add("style.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void init() {
		System.out.println("inithialisieren der  Atribute...");
		title = " Minions sind gelb";
	}

}
