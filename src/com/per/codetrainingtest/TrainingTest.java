package com.per.codetrainingtest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

interface DateTest {
	public int x=5;
	public void setDate(int index, int year, int month, int date) throws Exception;
	public LocalDate getDate(int index) throws Exception;
}

interface StringConcat {
	public String sconcat(String a,String b);
}

class Dates implements DateTest{
	
	static int count = 1;
	
	private List<LocalDate> dates = new ArrayList<LocalDate>();
	
	public void addDate(int year, int month, int date) {
		dates.add(LocalDate.of(year, month, date));
	}

	@Override
	public void setDate(int index, int year, int month, int date) throws Exception{
		// TODO Auto-generated method stub
		if(index<0 || index>=dates.size()) {
			throw new RuntimeException("Index is not correct");
		}
		dates.set(index,LocalDate.of(year, month, date));
	}

	@Override
	public LocalDate getDate(int index) throws Exception {
		// TODO Auto-generated method stub
		return dates.get(index);
	}
}

public class TrainingTest extends Dates{

	public TrainingTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		Dates t = new TrainingTest();
		t.addDate(2021, 06, 22);	
		t.addDate(2021, 06, 23);	
		try {
			t.setDate(1,2021, 06, 21);
		} catch (IllegalArgumentException  e) {
			System.out.println("Faulty IllegalArgumentException");
		} catch (RuntimeException  e) {
			e.printStackTrace();			
		} finally {
			System.out.println("Done");
		}
		
		System.out.println(t.getDate(0)); 
		System.out.print(t.getDate(0).toString().substring(0,4)+ "*"); 		
		System.out.print(t.getDate(0).toString().substring(5,7)+"*"); 
		System.out.print(t.getDate(0).toString().substring(8,10)+"\n"); 	
		System.out.println(t.getDate(0).toString().replaceAll("-",".")); 
		System.out.println(t.getDate(1)); 
		System.out.println(Dates.count);
		String newCount = count>0 ? "Bigger than zero" :"Not bigger than zero";
		switch(Dates.count) {
			default:
			System.out.println("Not zero or one.");
				break;
			case 0: System.out.println("Zero");
				break;
			case 1: System.out.println("One");
				break;
		}
		
		//Operator test
		System.out.println(Dates.count+12/4);
				
		//Lambda function test.
		StringConcat s = (str1, str2) -> str1 + " "+ str2;
		System.out.println(s.sconcat(t.getDate(0).toString(),t.getDate(1).toString()));
		
		//Predicate test
		Predicate clear = c -> c.equals("grey");
		System.out.println(clear.test("pink"));
	}
}
