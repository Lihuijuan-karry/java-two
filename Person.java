package review;

public class Person {
	Integer number;//���
	String name;//����
	String sex;//�Ա�
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	Person(){
		
	}
	Person(Integer number,String name,String sex){			//�вι��췽��
		this.number=number;
		this.name=name;
		this.sex=sex;
	}
//	@Override
//	public String toString() {
//		return "���="+number+",����="+name+",�Ա�="+sex;
//	}
}
