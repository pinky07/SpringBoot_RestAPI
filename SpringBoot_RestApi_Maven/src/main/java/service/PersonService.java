package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import model.Person;

@Service
public class PersonService {
	//why we create hashtable<key,value>--> (String,Person) type???
	//because we will be setting, different set of value of person class
	//and assign those group to a key 
	//example-- setting value for person is(id-1,age-21,name-smith, lastname-gupta)--need to store these
	//value within object of the same class, so need to create object then set values like p.setFirstName("steve")etc,
	//now need to set key so, we can easily fetch data, assign unique value to particular group
	Hashtable<String,Person> persons = new Hashtable<String,Person>();
	
	public PersonService(){
		Person p = new Person();
		//setting value
		p.setId("1");
		p.setAge(21);
		p.setFirstName("steve");
		p.setLastName("smith");
		//finish setting value, need to save all value altogather, but how??
		persons.put("1", p);// what we did here,
		//setting a group of value and giving it to unique id, so it will be easy to get it back.
		
		p = new Person();//creating another object, no matter if name is same as above
		p.setId("2");
		p.setAge(21);
		p.setFirstName("steve");
		p.setLastName("smith");
		persons.put("2", p);
	
	}
//
public Person getPerson(String id){
	//here if condition will contain all key as above example is 1,2
	if(persons.containsKey(id)) {
		return persons.get(id);
	}else
		return null;
	}
//now we want to take each information that we had stored,remember we store value in form of group(key, value)
//so need to get back as same manner.
public Hashtable<String,Person>getAll(){
	return persons;
}

}
