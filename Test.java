package review;

public class Test {
	static Course course=new Course(1, "java", "1�ۺ�¥", "1-16��", "����", 5, 1);
	static Student stu=new Student("java",1);
	static Student stu1=new Student(67,  "��۾�",	"Ů");
	static Teacher tea=new Teacher(001,"����","��","java",1,"9��¥");
	static Teacher tea1=new Teacher(null, null,null,null, null,null);
	static Test test=new Test();
	public void judge() {
		if(tea.getCourse_num()==1) {
			if(stu.getSelected_courses_num()!=1) {
				System.out.println("ÿ��ѧ��ֻ��ѡһ�ſγ̣����ѳ������뷵������ѡ�Σ�");
			}else if(stu.getMajor()==course.getCourse_name()&&tea.getTea_course()==course.getCourse_name()){
				this.stu.setState(1);
				System.out.println("ѡ�γɹ�! ���������Ϣ���γ���Ϣ���ʦ��Ϣ��");
				System.out.println(stu1+"\n"+tea+"\n"+course);
			}else if(this.stu.getState()!=1&&this.stu.getState()!=0){
				System.out.println("δ����ѡ��");
			}if(stu.getState()==1) {
				this.stu.setState(0);
				System.out.println("�ɹ�ѡ�Σ������˿���..."+"\n"+"�˿γɹ�!");
				System.out.println(stu1+"\n"+tea1);
			}
			}else {
				System.out.println("�ڿν�ʦ�ظ���ѡ���޷��ɹ����С�");
			}
		}
	public static void main(String[] args) {
			test.judge();
	}
}
