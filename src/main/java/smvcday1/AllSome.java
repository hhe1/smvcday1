package smvcday1;

public class AllSome {
private Person person;

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}
public void AllSay() {
	person.say();
	System.out.println("AllSay");
}
}
