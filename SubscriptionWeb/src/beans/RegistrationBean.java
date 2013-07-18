package beans;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;

@ManagedBean
@SessionScoped
public class RegistrationBean {
private String firstName;
private String lastName;
private Date dob;
private String sex;
private String email;
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
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public String getSex() {
return sex;
}
public void setSex(String sex) {
this.sex = sex;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public void validateEmail(FacesContext context,
UIComponent toValidate,
Object value) throws ValidatorException {
String emailStr = (String) value;
if (-1 == emailStr.indexOf("@")) {
FacesMessage message = new FacesMessage("Invalid email address");
throw new ValidatorException(message);
}
}
public String addConfirmedUser() {
boolean added = true; // actual application may fail to add user
FacesMessage doneMessage = null;
String outcome = null;
if (added) {
doneMessage = new FacesMessage("Successfully added new user");
outcome = "done";
} else {
doneMessage = new FacesMessage("Failed to add new user");
outcome = "registration";
}
FacesContext.getCurrentInstance().addMessage(null, doneMessage);
return outcome;
}
}
