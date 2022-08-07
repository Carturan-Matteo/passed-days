import java.util.Scanner;
public class passedDays{
	public static void main (String[] args){

		System.out.println("Inserisci il mese: ");
		String mese = new Scanner(System.in).next().toLowerCase();

		System.out.println("Inserisci il giorno di "+ mese);
		int giorno = new Scanner(System.in).nextInt();

		int g = 0; //variable to control the day entered
		int gtot = 334; //variable to calculate the days that have passed since the beginning of the year 365 days - 31 days of December

		switch(mese){
		case "gennaio":						
		case "marzo":					
		case "maggio":						
		case "luglio":						
		case "agosto":							
		case "ottobre":								
		case "dicembre":						
			g = 31;
			break;
		case "aprile":				
		case "giugno":								
		case "settembre":							
		case "novembre":			
			g = 30;
			break;	
		case "febbraio":			
			g = 28;
			break;	
		default:
			System.out.println("Il mese inserito non e' valido!");
			break;
		}
		//I exclude incorrect dates in the month
		if (giorno <= 0 || giorno > g)
			System.out.println("Nel mese di "+ mese+ " non esiste il giorno inserito!");
		else {
            
		//switch for calculation of the elapsed days
		switch(mese){
		case "gennaio":	
			gtot -= 31;														
		case "febbraio":
			gtot -= 28;					
		case "marzo":
			gtot -= 31;						
		case "aprile":	
			gtot -= 30;
		case "maggio":
			gtot -= 31;							
		case "giugno":
			gtot -= 30;								
		case "luglio":	
			gtot -= 31;		
		case "agosto":
			gtot -= 31;				
		case "settembre":
			gtot -= 30;								
		case "ottobre":	
			gtot -= 31;						
		case "novembre":
			gtot -= 30;			
		case "dicembre":
			break;	
		}

		System.out.println("Dall'inizio dell'anno sono passati: "+ (gtot + giorno) + " giorno/i.");
		}		
	}
}