package review;

public class Course {
	int number;//课程编号
	String course_name;//课程名称
	String area;//上课地点
	String time;//上课时间
	String course_teacher;//教课老师
	int score;//课程学分
	int course_teacher_num;//授课教师数量
	public int getCourse_teacher_num() {
		return course_teacher_num;
	}
	public void setCourse_teacher_num(int course_teacher_num) {
		this.course_teacher_num = course_teacher_num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCourse_teacher() {
		return course_teacher;
	}
	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}
	Course(int number,String course_name,String area,String time,String course_teacher,int score,int course_teacher_num){		//有参构造方法
		this.number=number;
		this.course_name=course_name;
		this.area=area;
		this.time=time;
		this.course_teacher=course_teacher;
		this.score=score;
		this.course_teacher_num=course_teacher_num;
	}
	@Override
	public String toString() {
		return "课程编号="+number+",	课程名称="+course_name+",	  上课地点="+area+",   上课时间="+time+",	 授课教师="+course_teacher+",	 课程学分="+score;
	}
}
