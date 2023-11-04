import java.util.Scanner;

public class Bank{

Scanner sc = new Scanner(System.in);

float balance = 0;
float inte = 0;
int amount;
String name;
int acnum;
int contact;
String address; 

void OpenAccount(){
System.out.println("ENTER YOUR NAME: ");
name = sc.next();
System.out.println("ENTER YOUR ACCOUNT NUMBER: ");
acnum = sc.nextInt();
System.out.println("ENTER YOUR INITIAL BALANCE: ");
balance = sc.nextFloat();
System.out.println("RATE OF INTEREST - 10%");
System.out.println("ENTER YOUR CONTACT NUMBER - ");
contact = sc.nextInt();
System.out.println("ENTER ADDRESS");
address = sc.next();


}

void Cinterest(){
inte = (balance*10/100);
balance = balance + inte;
System.out.println("Interest Rate is 10% \nYour interest - "+ inte);
System.out.println("Your Balance with interest - "+ balance);
}


void Deposit(){
System.out.println("ENTER AMOUNT: ");
amount = sc.nextInt();
balance=balance + amount;
System.out.println("ACCOUNT BALANCE: "+ balance);
}

void Withdraw(){
System.out.println("ENTER AMOUNT: ");
amount = sc.nextInt();
if(balance<amount)
System.out.println("TRANSACTION FAITED DUE TO INSUFFICIENT BALANCE!");

else
{
	balance= balance-amount;
	System.out.println("ACCOUNT BALANCE: "+ balance);
}
}

void CheckBalance(){
inte = (balance*10/100);
System.out.println("ACCOUNT NUMBER: "+ acnum);
System.out.println("ACCOUNT NAME: "+ name);
System.out.println("RATE INTEREST - 10%");
System.out.println("ADDRESS: "+ address);
System.out.println("YOUR TOTAL BALANCE: "+ balance);
System.out.println("YOUR INTEREST: "+ inte);
}

  public static void main(String args[]){
    
     Bank obj = new Bank();
System.out.println("-~-~-~-~-~-~-~WELCOME TO OUR BANK~-~-~-~-~-~-~");
Scanner in = new Scanner(System.in);
int i=0;
do{
	System.out.println("\nYou want to continue? 1 - yes , 2 - no");
        int b = in.nextInt();
	if(b==1){
	System.out.println("\n\nENTER\n1.OPEN ACCOUNT\n2.DEPOSIT\n3.WITHDRAWAL\n4.COMPUTE INTEREST\n5.CHECK DETAILS\n6.EXIT\n");
	int choice = in.nextInt();
	if (choice==6)
	{System.out.println("-~-~-~-~-~-~-~Thank You-~-~-~-~-~-~-~");
    		break;
	}
	else{
		switch(choice){ 

				case 1:
    				obj.OpenAccount();
    				break;

				case 2:
    				obj.Deposit();
    				break;

				case 3:
    				obj.Withdraw();
    				break;

				case 4:
				obj.Cinterest();
				break;

				case 5:
    				obj.CheckBalance();
    				break;

				//case 5:
				//break;

				default:
    				System.out.println("INVALID OPTION!");
   				 break;
				}
		               }}
           else
		{
			System.out.println("-~-~-~-~-~-~-~Thank You~-~-~-~-~-~-~");
			break;
		}
   }while(i<6);


  }
}