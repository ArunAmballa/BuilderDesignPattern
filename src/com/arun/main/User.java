package com.arun.main;

public class User 
{
	
	private String userName;
	private String userId;
	private String userEmail;
	
	private User(UserBuilder builder)
	{
		this.userName=builder.userName;
		this.userEmail=builder.userEmail;
		this.userId=builder.userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userEmail=" + userEmail + "]";
	}


	static class UserBuilder
	{
		private String userName;
		private String userId;
		private String userEmail;
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}
		
		public User build()
		{
			return new User(this);
		}
		
		
	}
	

}
