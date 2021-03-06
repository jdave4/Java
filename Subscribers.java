public class Subscribers {
    package com.tts.subscribersList.subs;

import java.util.Date;

public class subscribers {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private Date signedUp;
	
}

public void Subscriber(String firstName, String lastName, String userName, Date signedUp) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.signedUp = signedUp;
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

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public Date getSignedUp() {
    return signedUp;
}

public void setSignedUp(Date signedUp) {
    this.signedUp = signedUp;
}

@Override
public String toString() {
    return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
            + ", signedUp=" + signedUp + "]";
}

import org.springframework.data.repository.CrudRepository;
 
interface TodoRepository extends CrudRepository<Todo, Long> {
 
}
    
}
