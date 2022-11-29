package user;

public class RegularUser extends User {

	public RegularUser(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}
	
	public void deleteTweet(int id) {
		getArrOfTweets().remove(id);
		
	}
	@Override
	public void displayTweets() {
	
		System.out.println("(Regular) " + getUsername()+":");
		for(int i=0;i<getArrOfTweets().size();i++) {
			System.out.println("Tweet: "+getArrOfTweets().get(i));
		
		}
		System.out.println(" ");		
	}

}
