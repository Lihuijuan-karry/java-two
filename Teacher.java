package review;

public class Teacher extends Person{
	Course courses;//����Course���ͣ���Course�������
	Integer course_num;//��ʦ���ڿγ�����
	String tea_course;//��ʦ���ڿγ�����
	String office;//��ʦ�칫��
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
	Teacher(Integer number, String name, String sex,String tea_course,Integer course_num,String office) {	//�вι��췽�����������ԣ�
		super(number, name, sex);	//�̳и���Person������
		this.tea_course=tea_course;
		this.course_num=course_num;
		this.office=office;
	}
	public String toString() {
		return "��ʦ���="+number+",	��ʦ����="+name+",	  ��ʦ�Ա�="+sex+",	     ��ʦ���ڿγ�="+tea_course+",	 ��ʦ�칫��="+office;
	}

}
