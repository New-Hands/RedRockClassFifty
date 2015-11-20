package com.redrockclassfifty.level1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class LevelOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentOperate op=new studentOperate();
		op.add(20,"李欣桓");
		op.add(21, "熊东");
		op.add(19, "李尚庭");
		op.add(20, "阳萧");
		op.print(0);
	}

}
class studentOperate{
	private ArrayList<student> array=new ArrayList();
	private LinkedList<student> link=new LinkedList();
	private HashMap hashmap=new HashMap();
	//student [] a={new student(20,"李欣桓"),new student(19,"李尚庭"),new student(21,"熊东"),new student(20,"阳萧"),new student(20,"魏凡奇"),new student(22,"王万成")};
	private static class student{
		private int age;
		private String name;
		public student(int age, String name) {
			this.age = age;
			this.name = name;
		}
		@Override
		public String toString() {
			return "student [age=" + age + ", name=" + name + "]";
		}
	 }
	public void add(int age,String name){
		student a=new student(age,name);
		array.add(a);
		link.add(a);
		hashmap.put(age,name);
	}
	public void print(int i){
		System.out.println(array.get(i));
		System.out.println(link.get(i));
		System.out.println(hashmap.get(array.get(i).age));
		
	}
	
}