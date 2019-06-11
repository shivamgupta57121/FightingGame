import java.util.Scanner;
import java.util.Random;

public class Fighting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Attack Points of Monster : ");
		int monsterAttack = scan.nextInt();
		System.out.print("Defence Points of Monster : ");
		int monsterDefence = scan.nextInt();
		System.out.print("Damage of Monster : ");
		int monsterDamage = scan.nextInt();
		System.out.print("Life Points of Monster : ");
		int monsterLife = scan.nextInt();
		
		System.out.print("Your Attack Points : ");
		int yourAttack = scan.nextInt();
		System.out.print("Your Defence Points : ");
		int yourDefence = scan.nextInt();
		System.out.print("Your Damage : ");
		int yourDamage = scan.nextInt();
		System.out.print("Your Life Points : ");
		int yourLife = scan.nextInt();
		System.out.println();
		
		scan.nextLine();
		Random generator = new Random();
		do {
			boolean attacker = generator.nextBoolean();
			if(attacker) {
				System.out.println("Your attack");
				int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
				int attackValue = yourAttack + dice;
				System.out.println("Rolled Value : "+dice);
				System.out.println("Your attack value : "+attackValue);
				if (attackValue > monsterDefence) {
					System.out.println("Your attack was successful. ");
					monsterLife = monsterLife - yourDamage;
					System.out.println("Monster's remaining Life : "+monsterLife);
				}
				else {
					System.out.println("Your attack was not successful. ");
				}
				
			}
			else {
				System.out.println("Monster attacks. ");
				int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
				int attackValue = monsterAttack + dice;
				System.out.println("Rolled Value : "+dice);
				System.out.println("Monster's attack value : "+attackValue);
				if (attackValue > yourDefence) {
					System.out.println("Monster's attack was successful. ");
					yourLife = yourLife - monsterDamage;
					System.out.println("Your remaining Life : "+yourLife);
				}
				else {
					System.out.println("Monster's attack was not successful. ");
				}
			}
			
			System.out.println("Press Enter to continue. ");
			scan.nextLine();
		}while(yourLife>0 && monsterLife>0);
		
		if(monsterLife>0)
			System.out.println("You are dead. :-( ");
		else
			System.out.println("You won. The monster is dead. :-) ");
		

	}

}
