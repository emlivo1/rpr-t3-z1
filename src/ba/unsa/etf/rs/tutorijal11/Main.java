package ba.unsa.etf.rs.tutorijal11;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ba/unsa/etf/rs/tutorijal11/imenik.fxml"));
		loader.setController(new ImenikController());
		Parent root = loader.load();
		primaryStage.setTitle("Imenik");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
