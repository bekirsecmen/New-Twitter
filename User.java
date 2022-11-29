package user;
import user.User;
import java.util.ArrayList;

import twitter.Tweet;


public class User {
	
	private String username;
	private String id;
	private ArrayList<Tweet> arrOfTweets = new ArrayList<Tweet>();
	private ArrayList<User> followed = new ArrayList<User>();
	

	public User(String username) {
		
		this.username = username;
	}
	public User(ArrayList<User> followed) {
		
		this.followed = followed;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Tweet> getArrOfTweets() {
		return arrOfTweets;
	}
	public void setArrOfTweets(ArrayList<Tweet> arrOfTweets) {
		this.arrOfTweets = arrOfTweets;
	}
	
	
	public void displayTweets() {
		System.out.println(username);
		System.out.println(arrOfTweets);
	}

	
	public void sendTweet(String content) {
		Tweet newtweet = new Tweet(content);
		arrOfTweets.add(newtweet);
	}
	
	public void followUser(User user) {
		followed.add(user);
		
	}
	
	public void displayFollowedUserTweets() {
		for(int i=0;i<followed.size();i++) {
			if (followed.get(i).getClass().getTypeName().toString() == "user.VerifiedUser" ) {
				System.out.println("(Verified) " + followed.get(i).getUsername());
				
				System.out.println(followed.get(i).arrOfTweets);
				
			}
			else if (followed.get(i).getClass().getTypeName().toString() == "user.RegularUser" ) {
				System.out.println("(Regular) " + followed.get(i).getUsername()); 
				
				System.out.println(followed.get(i).arrOfTweets);
				
			}
		}
		System.out.println(" ");
		
	}
}
