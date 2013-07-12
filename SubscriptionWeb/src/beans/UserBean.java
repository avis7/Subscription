package beans;


import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.subscript.dao.TypeDAO;
import com.subscript.entities.Type;

@ManagedBean(name="user")
@SessionScoped
public class UserBean {
	private String edition;
	private String name;
	private String description;
	private ArrayList<String> editions = new ArrayList<String>();
	@EJB
	TypeDAO base;
{
 editions.add("First");
 editions.add("Second");
 editions.add("Third");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public ArrayList<String> getEditions() {
	return editions;
}

public void setEditions(ArrayList<String> editions) {
	this.editions = editions;
}

public String getEdition() {
	return edition;
}

public void setEdition(String edition) {
	this.edition = edition;
}

public String goEdit(String ed){
	this.edition=ed;
	return "Editing?faces-redirect=true";
}
public String test(){
	Type type=new Type();
	type.setDescription(description);
	type.setName(name);
	base.create(type);
	return "edit";
}
}
