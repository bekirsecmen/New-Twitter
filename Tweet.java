package twitter;


public class Tweet {
	
	private String contentOfTweet;
	public String getContentOfTweet() {
		return contentOfTweet;
	}
	public void setContentOfTweet(String contentOfTweet) {
		this.contentOfTweet = contentOfTweet;
	}
	public Tweet(String contentOfTweet) {
		
		this.contentOfTweet = contentOfTweet;	
	}
	public void edit(String newContent){
		contentOfTweet = newContent; 
	}
	public String toString() {
		return contentOfTweet;
	}
	
		
	
}
