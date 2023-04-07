package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Stddto {
	@Id
 private int stdid;
 private int stdname;
 private int stdemail;
 private int rollno;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public int getStdname() {
	return stdname;
}
public void setStdname(int stdname) {
	this.stdname = stdname;
}
public int getStdemail() {
	return stdemail;
}
public void setStdemail(int stdemail) {
	this.stdemail = stdemail;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
 
}
