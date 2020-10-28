package review;

public class Test {
	static Course course=new Course(1, "java", "1综合楼", "1-16周", "李大大", 5, 1);
	static Student stu=new Student("java",1);
	static Student stu1=new Student(67,  "李慧娟",	"女");
	static Teacher tea=new Teacher(001,"李大大","男","java",1,"9号楼");
	static Teacher tea1=new Teacher(null, null,null,null, null,null);
	static Test test=new Test();
	public void judge() {
		if(tea.getCourse_num()==1) {
			if(stu.getSelected_courses_num()!=1) {
				System.out.println("每个学生只能选一门课程，您已超过，请返回重新选课！");
			}else if(stu.getMajor()==course.getCourse_name()&&tea.getTea_course()==course.getCourse_name()){
				this.stu.setState(1);
				System.out.println("选课成功! 输出个人信息、课程信息与教师信息：");
				System.out.println(stu1+"\n"+tea+"\n"+course);
			}else if(this.stu.getState()!=1&&this.stu.getState()!=0){
				System.out.println("未进行选课");
			}if(stu.getState()==1) {
				this.stu.setState(0);
				System.out.println("成功选课，正在退课中..."+"\n"+"退课成功!");
				System.out.println(stu1+"\n"+tea1);
			}
			}else {
				System.out.println("授课教师重复，选课无法成功进行。");
			}
		}
	public static void main(String[] args) {
			test.judge();
	}
}
