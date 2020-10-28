package review;

public class Teacher extends Person{
	Course courses;//定义Course类型，与Course类相关联
	Integer course_num;//教师所授课程数量
	String tea_course;//教师所授课程名称
	String office;//教师办公室
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getTea_course() {
		return tea_course;
	}

	public void setTea_course(String tea_course) {
		this.tea_course = tea_course;
	}

	public int getCourse_num() {
		return course_num;
	}

	public void setCourse_num(Integer course_num) {
		this.course_num = course_num;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}
	Teacher(Integer number, String name, String sex,String tea_course,Integer course_num,String office) {	//有参构造方法（父类属性）
		super(number, name, sex);	//继承父类Person的属性
		this.tea_course=tea_course;
		this.course_num=course_num;
		this.office=office;
	}
	public String toString() {
		return "教师编号="+number+",	教师姓名="+name+",	  教师性别="+sex+",	     教师所授课程="+tea_course+",	 教师办公室="+office;
	}

}
