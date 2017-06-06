//Modul Login
/*Steven Sen			064001600022
Dimas Adi Pratama		064001600003 
La Ode Muhammad Nurabdulrahma	064001600013
Febriana Tindaon		064001600017
Soefhwan			065001600002 */
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
   Login[1]="12345";
   Login[2]="Imam";
   Login[3]="45678";
   
 


public class login
{
	public static void main(String args[])
	{
		String NAMA, PASSWORD;
		int i, pilihan;
		
		dataUser[] USER = new dataUser[10];
		
		USER[0] = new dataUser("Arman", "arman1234");
		USER[1] = new dataUser("Febri", "febri2345");
		USER[2] = new dataUser("Steven", "steven3456");
		USER[3] = new dataUser("Sofwan", "sofwan4567");
		USER[4] = new dataUser("Dimas", "dimas5678");
			   

	for (;;)
	{	
		NAMA = JOptionPane.showInputDialog("Masukkan username = ");

		PASSWORD = JOptionPane.showInputDialog("Masukkan pin = ");

		for (i = 0; i <= 5; i++)
		{
			if (i < 5)
			{
				if (NAMA.equals(USER[i].cekUser()) && PASSWORD.equals(USER[i].cekPin()))
				{
					JOptionPane.showMessageDialog(null, "Login Sukses");
					break;
				}
			}
			if (i > 4)
			{
				JOptionPane.showMessageDialog(null, "Maaf login gagal");
			}
		}
		pilihan = JOptionPane.showConfirmDialog(null, "Apakah anda ingin login lagi?", "LOGIN", JOptionPane.YES_NO_OPTION);
		if (pilihan == JOptionPane.YES_OPTION)   
		{    
			JOptionPane.showMessageDialog(null, "Silahkan login lagi");   
		}   
		else   
		{    
			JOptionPane.showMessageDialog(null, "Terima Kasih");    
			break;   
		}   
	}   
}
