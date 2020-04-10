package com.practice.demo;
/**
 * 
 * @author Achter
 * @date   2020年4月10日
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		
		/*System.out.println("安旭山");//输出姓名
		System.out.println(18);//年龄
		System.out.println(6500.5);//月薪:double型
		//Shift+Ctrl+F;格式化
		System.out.println("苏州");//住址:字符串String
		//Ctrl+空格
		System.out.println("跑步");//爱好:字符串String
		System.out.println('男');//性别:char类型
*/      //Shift+Ctrl+/ 表示注释多行代码     Shift+Ctrl+\ 表示取消注释多行代码
		//类名首字母大写,方法名首字母小写(main),变量名首字母小写
		//变量不能使用中文
		//变量命名:一个英文单词或者是缩写,二是两个单词中间使用下划线_,三驼峰式命名
		String userName = "安旭山";
		String user_name = "Achter";
		
		String name = "安旭山";//char用''(单引号),字符串用双引号""
		//age:年龄
		int age = 18;
		//salary:月薪
		double salary = 6500.5678;
		//address:住址
		String address = "苏州";
		//hobby:爱好  多个使用数组
		String hobby = "跑步,打篮球";
		//sex:性别  一个字符 使用char
		char sex = '男';
		
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("月薪:"+salary);
		System.out.println("住址:"+address);
		System.out.println("爱好:"+hobby);
		System.out.println("性别:"+sex);
		
	}

}
