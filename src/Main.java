
import java.io.IOException;

import actors.classes.Manager;
import database.classes.Database;
import gui.classes.HomeScreen;
import gui.classes.Screen;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	static final double defaultWidth = 580;
	static final double defaultHeight = 450;

	static Database database = new Database();

	public static void main(String[] args) throws IOException {

		Manager.setDataBase(database);

		database.load();
		launch(args);
		database.write();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Screen homeScreen = new HomeScreen(defaultWidth, defaultHeight, primaryStage, database);

		primaryStage.setMinHeight(defaultHeight);
		primaryStage.setMinWidth(defaultWidth);
		primaryStage.setMaxHeight(defaultHeight);
		primaryStage.setMaxWidth(defaultWidth);

		homeScreen.draw();

		primaryStage.show();
	}

}
