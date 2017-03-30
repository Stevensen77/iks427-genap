import java.util.Scanner;
public class Login
{

   public static void main(String[] args)
   
   {
   Scanner input = new Scanner (System.in);
	String namauser,kode,password,username;

   String[] Login;
   
   Login = new String [10];
   Login[0]="Anung";
   Login[1]="123";
   Login[2]="Imam";
   Login[3]="456";
   
   

   
   
for(;;)
   {
	System.out.println ("");
   System.out.print ("Masukkan username = ");
   namauser = input.nextLine();
   System.out.print ("Masukkan password = ");
   kode = input.nextLine();
   
		if (Login[0].equals(namauser) && Login[1].equals(kode))
		{
			System.out.println ("Login sukses ! ");
			System.out.println ("Hello Mr.Anung");
			System.out.println ("");
			break;
		}
		
		
		if (Login[2].equals(namauser) && Login[3].equals(kode))
		{
			System.out.println ("Login sukses ! ");
			System.out.println ("Hello Mr.Imam");
			System.out.println ("");
			break;
		}
		else 
		{
		System.out.println("Maaf, Login Anda gagal");
		}
	}
   }
}