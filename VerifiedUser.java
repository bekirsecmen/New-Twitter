package user;

import twitter.Tweet;

public class VerifiedUser extends User {

	public VerifiedUser(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}

	
	
	public void editTweet(int id, String newContent) {
			Tweet editedTweet = new Tweet(newContent);
			getArrOfTweets().set(id, editedTweet);
	}
	
	@Override
	public void displayTweets() {
		
		System.out.println("(Verified) " + getUsername()+":");
		for(int i=0;i<getArrOfTweets().size();i++) {
			System.out.println("Tweet: "+getArrOfTweets().get(i));
		
		}
		System.out.println(" ");		
	}
}
