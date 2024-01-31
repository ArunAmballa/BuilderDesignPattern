package com.arun.main;

public class TestMain {
	
	public static void main(String args[])
	{
		User user1=new User.UserBuilder().setUserEmail("arunamballa24@gmail.com").setUserId("505").setUserName("Arun Amballa").build();
		System.out.println(user1);
		
		User user2=new User.UserBuilder().setUserEmail("amballa").build();
		System.out.println(user2);
		System.out.println(user2.getUserId());
		
		
		Book book=new Book();
		book.setBookName("Python");
		
		System.out.println(book.getBookName());
		System.out.println(book.getPages());
		System.out.println(book.getAuthor());
		
	}

}
