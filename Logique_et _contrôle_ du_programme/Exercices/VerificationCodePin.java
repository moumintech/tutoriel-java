import java.util.Scanner;
public class VerificationCodePin {

	public static void main(String[] args) {
	
int codePIN = 10 ;
int MAX_TENTATIVES = 3;

Scanner sc = new Scanner(System.in);

int compteurTentatives= 0;
boolean accesAccorde = false;




while(compteurTentatives < MAX_TENTATIVES   ) {
System.out.print("Veuillez entrer votre code PIN : "); 
int codeSaisi = sc.nextInt();
compteurTentatives++;

	 if (codeSaisi == codePIN) {
		 
		 System.out.println("code correct");
		 accesAccorde = true;
		 break;
	 }else {
		 System.out.println("Code incorrect.");

}
	}
if (!accesAccorde) {
    System.out.println("Accès refusé : nombre de tentatives dépassé.");
}

System.out.println("Tentatives utilisées : " + compteurTentatives + "/"+  MAX_TENTATIVES);

sc.close();
}
}