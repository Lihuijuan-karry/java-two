package review;

public class Student extends Person{
	Course courses;//����Course���ͣ���Course�������
	int selected_courses_num;//ѧ����ѡ�γ�����
	int state;//ѧ��ѡ��״̬
	String major;//ѧ����ѡ�γ�
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
	Student(Integer number,String name,String sex){	//�вι��췽�����������ԣ�
		super(number, name, sex);	//�̳и���Person������
	}
	Student(String major,int selected_courses_num){
		super();
		this.major=major;
		this.selected_courses_num=selected_courses_num;
	}
	@Override
	public String toString() {
		return "ѧ�����="+number+",	ѧ������="+name+",	  ѧ���Ա�="+sex;
	}
}
