import javax.swing.*;

/*
Emil Edberg
Uppgifter Kapitel 3
25/9-17
*/
public class Kapitel3{
	public static void main (String [] args){
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö
		/*
		double pi = 3.1415926536;
		double area;

		String r = JOptionPane.showInputDialog(null,"Vad har cirkeln f" + o1 +"r radie");
		double ra = Double.parseDouble(r);
		area = ra * ra * pi;
		double Omkrets = ra * 2 * pi;
		JOptionPane.showMessageDialog(null, Omkrets + "\n" + area);*/
		String minuter = JOptionPane.showInputDialog(null, "Antal minuter du ringer i m" + a1 +"naden" );
		String priset = JOptionPane.showInputDialog(null, "Hur mycket " + a2 +"r minutpriset?");
		double m = Double.parseDouble(minuter);
		double p = Double.parseDouble(priset);
		double summa = m * p;
		JOptionPane.showMessageDialog(null, summa);

	}
}