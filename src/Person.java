/*************************************************************************
  Winter 2017 CS 240 Programming Exam : Person

 Author: Syed Abidi      

 Dependencies: Stack, Queue, Dictionary

 Description:  Models a person, a list of messages that they can
               read, and a list of their friends, so that when you
               post a message, all your friends can read it too.

**************************************************************************/

public class Person { 
		String name;
		public ArrayQueue<Person> friends;
		public ArrayStack<String> wall;
    // Create a new Person with this name.
    public Person(String name) {
    		this.name = name;
    		friends = new ArrayQueue<Person>();
    		this.wall = new ArrayStack<String>();
    		
    }
    

    // Make these two people become friends with each other.
    // Throw an exception if you try to meet yourself.
    // We are allowed to assume we didn't meet this person yet.
    public void meet(Person otherPerson) {
    	if(otherPerson == this)
    		throw new RuntimeException("You can meet yourself");
    	
    		friends.enqueue(otherPerson);
    		otherPerson.friends.enqueue(this);
        
    }

    // Are these two people friends?
    // Throw an exception if you ask about knowing yourself.
    public boolean knows(Person otherPerson) {
    	if (otherPerson == this)
            throw new RuntimeException("You can't know yourself");
    		
    			return false;			//return false if 
       
    }

    // Post a message to my list and the lists of all my friends
    public void post(String message) {
    		wall.push(message);		//push message to my list
        
    		wall.push(message);
    }

    // Print a header, then all messages this Person can read, newest first
    public void listMessages() {
    		System.out.println("== The wall of " + name + " ==");
    		
    			System.out.println(s);
    }      
}