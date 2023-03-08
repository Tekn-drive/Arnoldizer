package arnoldEncrypt;
import java.util.*;
public class Encrypt {
	static String generateID() {
		long random_number=(long)((Math.random()*(999-100))+100);
		String n=String.valueOf(random_number);
		String label="JA";
		String concat = label.concat(n);
		return concat;
	}

	public static void main(String[] args) {
		ArrayList<ArnoldID>id=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		boolean state=true;
		while(state) {
			System.out.println("Welcome to the Juan Arnold's encryption program");
			System.out.println("What do you want to do today?");
			System.out.println("1. Get an Arnold ID and encypt it!!");
			System.out.println("2. View your Arnoldized encryption keys!!");
			System.out.println("3. Exit");
			int choice=input.nextInt();
			if(choice==1) {
				String generated=generateID();
				long encrypted_id=arnoldEncrypt(generated);
				ArnoldID arnold = new ArnoldID(generated,encrypted_id);
				id.add(arnold);
				System.out.printf("The Arnold ID %s is successfully added!!\n",generated);
			}else if(choice==2) {
				System.out.println("The following are your created Arnold IDs with their respective encryption keys:");
				System.out.println("--------------------");
				System.out.println("Arnold ID|Arnold Key");
				System.out.println("--------------------");
				for(int i=0;i<id.size();i++) {
					System.out.printf("%9s|%10d\n",id.get(i).getID(),id.get(i).getArnold());
					System.out.println("--------------------");
				}
			}
			else if(choice==3){
				System.out.println("Alrighty then, have a nice day");
				state=false;
				input.close();
			}
		}
		System.out.println();
	}
	
	static long arnoldEncrypt(String ID){
		String digits=ID.substring(2,5);
		long numerized_id=Long.valueOf(digits);
		long arnoldized_key=numerized_id*15/6;
		return arnoldized_key;
	}
}
