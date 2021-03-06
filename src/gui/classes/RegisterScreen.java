package gui.classes;

import java.io.IOException;

import database.classes.Database;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterScreen extends Screen {

	/*
	 * Attributes
	 */

	Label firstNameLabel;
	Label lastNameLabel;
	Label userNameLabel;
	Label passwordLabel;

	TextField firstNameField;
	TextField lastNameField;
	TextField userNameField;
	PasswordField passwordField;

	Button backButton;
	Button saveButton;

	/*
	 * Constructor
	 */

	RegisterScreen(double width, double height, Stage stage, Database database) {
		super(width, height, stage, database);
		firstNameLabel = new Label("Firstname: ");
		lastNameLabel = new Label("Lastname: ");
		userNameLabel = new Label("Username: ");
		passwordLabel = new Label("Password: ");

		firstNameField = new TextField();
		lastNameField = new TextField();
		userNameField = new TextField();
		passwordField = new PasswordField();

		saveButton = new Button("Save");
		backButton = new Button("Back");

	}

	/*
	 * Behavior
	 */

	@Override
	public void draw() {

		stage.setTitle("Register Page");

		gridpane.add(firstNameLabel, 0, 0);
		gridpane.add(lastNameLabel, 0, 1);
		gridpane.add(userNameLabel, 0, 2);
		gridpane.add(passwordLabel, 0, 3);

		gridpane.add(firstNameField, 1, 0);
		gridpane.add(lastNameField, 1, 1);
		gridpane.add(userNameField, 1, 2);
		gridpane.add(passwordField, 1, 3);

		gridpane.add(backButton, 1, 4);
		gridpane.add(saveButton, 0, 4);

		super.draw();

		setActions();
	}

	private void setActions() {
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				Screen homeScreen = new HomeScreen(scene.getWidth(), scene.getHeight(), stage, database);
				homeScreen.draw();
			}
		});

		saveButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				int result = database.RegisterNew(firstNameField.getText(), lastNameField.getText(),
						userNameField.getText(), passwordField.getText(), 100);
				if (result == -1) {
					addConfirmationText("Username you chose already exist.");

				} else {
					addConfirmationText("Account created successfully.");
				}

				gridpane.add(backButton, 0, 1);

				try {
					database.writeList(database.getPassengersList(), Database.PASSENGERS_DATA_PATH);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
	}

}
