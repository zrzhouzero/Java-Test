import java.util.*;

/* 
Write a program to read the names and final marks of the students in a particular tutorial
group storing them in appropriate arrays. You should prompt the user to enter the number of
students in the class and create arrays with the specified size. Your program should print - 
a) the average mark
b) the highest mark and the name of that student
c) the names of all the students scoring above average marks. 
*/

public class student_mark 
{
	private String stname;
	private int stmark;
	
	public student_mark(String stname, int stmark) 
	{
		this.stname = stname;
		this.stmark = stmark;
	}
	
	public int getMark()
	{
		return this.stmark;
	}
	
	public String getName()
	{
		return this.stname;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int conditionzero;
		boolean loop = true;
		do
		{
			System.out.println("Welcome to student mark system!");
			int stnum;
			System.out.println("Input the number of the students");
			stnum = sc.nextInt();
			student_mark[] class1 = new student_mark[stnum];
			String c1stname;
			int c1stmark;	
			for (int i = 0; i < stnum; i++)
			{
				System.out.println("Input for student " + i);
				System.out.println("Input the name");
				c1stname = sc.next();
				System.out.println("Input the mark");
				c1stmark = sc.nextInt();
				class1[i] = new student_mark(c1stname, c1stmark);
			}
			
			System.out.println("--------------------Zero--------------------");
			int sum = 0;
			float avg;
			for (int j = 0; j < stnum; j++)
			{
				sum += class1[j].getMark();
			}
			avg = (float) sum / (float) stnum;
			System.out.println("The average mark is " + String.format("%.2f", avg));
			System.out.println("--------------------Zero--------------------");
			
			int max = 0;
			for (int mi = 0; mi < stnum; mi++)
			{
				if(max < class1[mi].stmark)
				{
					max = class1[mi].stmark;
				}
			}
			System.out.println("The highest mark is: " + max);
			System.out.println("The student(s) who get the highest mark is(are): ");
			for (int mj = 0; mj < stnum; mj++)
			{
				if (class1[mj].stmark == max)
				{
					System.out.print(class1[mj].stname + " ");
				}
			}
			System.out.println();
			System.out.println("--------------------Zero--------------------");
			
			System.out.print("Student(s): ");
			for (int mk = 0; mk < stnum; mk++)
			{
				if ((float)class1[mk].stmark > avg)
				{
					System.out.print(class1[mk].stname + " ");
				}
			}
			System.out.println("score(s) above average marks.");
			System.out.println("--------------------Zero--------------------");

			System.out.println("Do you want to continue? Input 1 to continue, input 0 to quit");
			conditionzero = sc.nextInt();
			if (conditionzero == 0)
			{
				System.out.println("Programme Terminated!");
				System.exit(0);
			}
		} while (loop == true);
	}
}
