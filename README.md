# 计G201 李慧娟 2020322067
## java第二次项目
## 阅读程序
1.项目共有五个类：person，teacher，student，course，test；  
2.person类是teacher类与student类的父类，test为主类；  
3.教师只能教授一门课，学生只能选择一门课，否则选课无法进行；  
4.学生选择课程后，打印学生基本信息、课程基本信息、教师基本信息。 
## 实验目的
+ 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
+ 掌握面向对象的类设计方法（属性、方法）；  
+ 掌握类的继承用法，通过构造方法实例化对象；  
+ 学会使用super()，用于实例化子类；  
+ 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中；  
+ 掌握类与类之间如何进行相关联
## 实验过程
+ **Person类 (父类)**  
  1.定义属性：编号(number)、姓名(name)、性别(sex)  
  2.定义方法：set()，get()；  无参，有参构造方法    
+ **Teacher类 (子类)**  
  1.定义属性：courses(Course类型--与Course类相关联)、授课数量(course_num)、授课名称(tea_course)、办公室(office)；  
  2.定义方法：set()，get()赋值取值；  有参构造方法；  super()调用父类构造方法继承父类属性；  toString()打印信息  
+ **Student (子类)**  
  1.定义属性：courses(Course类型--与Course类相关联)、选择课程数量(selected_courses_num;)、选课状态(state)、所选课程(major)；  
  2.定义方法：set()，get()赋值取值；  有参构造方法；  super()调用父类构造方法继承父类属性；  toString()打印信息  
+ **Course类**  
  1.定义属性：课程编号(number)、课程名称(course_name)、上课地点(area)、上课时间(time)、教课老师(course_teacher)、课程学分(score)、授课教师数量(course_teacher_num)；  
  2.定义方法：set()，get()赋值取值；  有参构造方法；  toString()打印信息  
+ **Test类(主类)**  
  1.创建对象：实例化构造方法对象(static修饰)，实例化test对象；  
  2.定义方法：judge()嵌套if-else if-else()语句判断学生选课，test对象调用judge()方法；  
## 核心方法
- judge()判断  
  + 教师教授课程数量！=1，选课无法进行；  
  + 学生选择课程数量！=1，返回重新选课；  
  + 学生选择课程=教师教授课程=课程本身时，选课成功，打印学生信息、课程信息、教师信息；并且选课状态设置为1；  
  + 当学生选课状态=1时，才能进行退课；退课状态=0，退课成功，输出学生信息，教师信息为空。
## 实验结果
学生选课成功，打印信息  
退课成功，打印信息   
![alt 点击链接](http://m.qpic.cn/psc?/V51PA3o90d17IF0JFyFi0lN3aB2Fw6re/bqQfVz5yrrGYSXMvKr.cqYLx6DmO*3C8YCGkQx84eb0H*YdHglwjmKtlp9oe17Pzu47cqUwaPkNITObOqtXBkuytcjFVow.s6PWaLx4*GuY!/b&bo=AwQfAQAAAAADBzs!&rf=viewer_4)
## 实验感想
1.掌握父类与子类的继承关系，熟练使用构造方法实例化对象  
2.了解类与类之间相关联
