package twitter;
import java.util.ArrayList;
import user.VerifiedUser;
import user.RegularUser;
import user.User;


public class Twitter {
	
	private ArrayList<User> listOfUsers = new ArrayList<User>();
	
	public Twitter() {
		super();
	}
	public User addUser(String username, String type) {
		if(type == "Verified" ) {
			VerifiedUser userObj = new VerifiedUser(username);
			listOfUsers.add(userObj);
			return userObj;
		}
		else if(type=="Regular") {
			RegularUser userObj = new RegularUser(username);
			listOfUsers.add(userObj);
			return userObj;
		}
		else {
			System.out.println("No such user type: '" + type+ "'");
			return null;
		}
	
	}
	public int calculateRevenue() {
		int count = 0;
		for(int j=0; j< listOfUsers.size();j++) {
			if (listOfUsers.get(j).getClass().getTypeName().toString() == "user.VerifiedUser") {
				count++;
			}
		}
		int totalRevenue = count*8;
		return totalRevenue;
		
	}
	
	public void displayAllTweets() {
		for(int j=0; j< listOfUsers.size();j++) {
			listOfUsers.get(j).displayTweets();
			
			listOfUsers.get(j).displayFollowedUserTweets();
		}
		System.out.println("-----------------------------");
		for(int i=0; i< listOfUsers.size();i++) {
			listOfUsers.get(i).displayFollowedUserTweets();
		}
	}

}
