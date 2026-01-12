
import java.util.ArrayList;
import java.util.*;
class Question{
	String question;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	char correctAns;
	
	 Question(String question, String optionA, String optionB, String optionC, String optionD, char correctAns ){
		this.question=question;
		this.optionA=optionA;
		this.optionB=optionB;
		this.optionC=optionC;
		this.optionD=optionD;
		this.correctAns=correctAns;
		
	}
	
}
public class OnlineQuizSystem {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Question> quiz=new ArrayList<>();
	
	quiz.add(new Question(
			"What is Java?",
            "A Programming Language",
            "A Database",
            "An Operating System",
            "A Browser",
            'A'
            ));
	quiz.add(new Question(
            "Which keyword is used to create an object?",
            "class",
            "new",
            "void",
            "static",
            'B'
    ));
	quiz.add(new Question( "Which of these is not OOP concept?",
            "Inheritance",
            "Encapsulation",
            "Compilation",
            "Polymorphism",
            'C'
            ));
	quiz.add(new Question( "What does JVM stand for?",
            "Java Virtual Machine",
            "Java Variable Method",
            "Java Verified Machine",
            "Java Visual Machine",
            'A'
            ));
	quiz.add(new Question(
			"Which memory area stores local variables and method calls?",
			"Heap",
			"Method Area",
			"Stack",
			"PC Register",
			'C'
			));
	quiz.add(new Question(
			"Which of the following is NOT part of JVM?",
			"Class Loader",
			"Execution Engine",
			"Garbage Collector",
			"Java Compiler",
			'D'
			));
	quiz.add(new Question(
			"What happens first when a Java program is executed?",
			"Bytecode verification",
			"JIT compilation",
			"Class loading",
			"Execution of main method",
			'C'
			));
	quiz.add(new Question(
			"Which class is mutable and NOT thread-safe?",
			"String",
			"StringBuffer",
			"StringBuilder",
			"CharSequence",
			'C'
			));
	quiz.add(new Question(
            "Which is used for exception handling?",
            "try-catch",
            "if-else",
            "for loop",
            "switch",
            'A'
    ));
	quiz.add(new Question(
			"Which Map allows one null key?",
			"Hashtable",
			"TreeMap",
			"ConcurrentHashMap",
			"HashMap",
			'A'
			));

	
	int score=0;
	
	System.out.println("====================================");
	System.out.println("   !!ONLINE QUIZ SYSTEM !! ");
	System.out.println("====================================");
	System.out.println("Enter Name: ");
	String name=sc.nextLine();
	System.out.println("=====================================");
	System.out.println("Welcome "+name+"!!");
	System.out.println("TotalQuestions: "+quiz.size());
	System.out.println("=====================================");
	
	for(int i=0;i<quiz.size();i++) {
		Question q=quiz.get(i);
		System.out.println("Question "+(i+1)+":"+q.question);
		System.out.println("A) "+q.optionA);
		System.out.println("B) "+q.optionB);
		System.out.println("C) "+q.optionC);
		System.out.println("D) "+q.optionD);
		
		
		char ans;
		while(true) {
			System.out.print("\n Your Answer is : ");
			String in=sc.next().toUpperCase();
			if(in.length()==1&&"ABCD".contains(in)) {
				ans=in.charAt(0);
				break;
			}
			else {
				System.out.println("Invalid Option!! Please Enter only A,B,C And D");
			}
		}
		if(ans==q.correctAns) {
			System.out.println("Correct!!");
			score++;
			
		}
		else {
			System.out.println("Wrong Answer, The Corrrect Answer is:"+q.correctAns);
		}
		System.out.println("Current Score: "+score+"/"+(i+1));
		System.out.println("____________________________________________________________________");
	}
	
	
	double per=(score*100)/quiz.size();
	System.out.println("=====================================");
	System.out.println("    !! QUIZ IS COMPLETED   !!");
	System.out.println("=====================================");
	System.out.println("\nName: "+name);
	System.out.println("Total Questions: "+quiz.size());
	System.out.println("Correct Answers: "+score);
	System.out.println("Wrong Answers: "+(quiz.size()-score));
	System.out.println("Score: "+score+"/"+quiz.size());
	System.out.printf("Percentage: %.1f%%\n", per);
	System.out.println("=====================================");
	System.out.println(" Thank You For Taking the Quiz");
	System.out.println("=====================================");
	
	
	}
}
