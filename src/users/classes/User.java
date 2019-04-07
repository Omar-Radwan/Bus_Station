package users.classes;

import java.util.LinkedList;

import classes.Message;

public abstract class User {

	/*
	 * Attributes
	 */

	String userName;
	String firstName;
	String lastName;
	String password;

	LinkedList<Message> messageList = new LinkedList<Message>();

	/*
	 * Constructor
	 */

	public User(String firstName, String lastName, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;

		this.messageList = new LinkedList<Message>();
	}

	/*
	 * Getters And Setters
	 */

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LinkedList<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(LinkedList<Message> messageList) {
		this.messageList = messageList;
	}

	/*
	 * toString uses " " as delimiter
	 */

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + userName + " " + password + " ";
	}

	/*
	 * Behavior
	 */

	/*
	 * Adders
	 */

	public Message addMessage(String from, String to, String subject, String content) {
		messageList.add(0, new Message(from, to, subject, content));
		return messageList.getFirst();
	}

}
