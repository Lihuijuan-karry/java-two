package review;

public class Student extends Person{
	Course courses;//定义Course类型，与Course类相关联
	int selected_courses_num;//学生所选课程数量
	int state;//学生选课状态
	String major;//学生所选课程
	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getSelected_courses_num() {
		return selected_courses_num;
	}

	public void setSelected_courses_num(int selected_courses_num) {
		this.selected_courses_num = selected_courses_num;
	}

	public Course getcourses() {
		return courses;
	}

	public void setcourses(Course courses) {
		this.courses = courses;
	}
	Student(Integer number,String name,String sex){	//有参构造方法（父类属性）
		super(number, name, sex);	//继承父类Person的属性
	}
	Student(String major,int selected_courses_num){
		super();
		this.major=major;
		this.selected_courses_num=selected_courses_num;
	}
	@Override
	public String toString() {
		return "学生编号="+number+",	学生姓名="+name+",	  学生性别="+sex;
	}
}
