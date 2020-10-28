package review;

public class Person {
	Integer number;//编号
	String name;//姓名
	String sex;//性别
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
	Person(Integer number,String name,String sex){			//有参构造方法
		this.number=number;
		this.name=name;
		this.sex=sex;
	}
//	@Override
//	public String toString() {
//		return "编号="+number+",姓名="+name+",性别="+sex;
//	}
}
