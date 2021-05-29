package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public static void displayZodiac(Zodiac z) {
		switch(z){
		case ARIES:
			JOptionPane.showMessageDialog(null, "A lot of money will come into your possesion in the future.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You will learn a secret and will have to decide what to do with it.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You will have to confront your feelings.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Someone who has been traveling for a long time will return to you.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "You will get seriously injured.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "You will watch a movie that reflects how your life will unfold.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "You will save someone's lives.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "A lot of luck will be coming your way.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "The universe is in your favor.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Help someone who has fallen and they will return the favor tenfold.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Something will threaten your life.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "A bull will attack you.");
			break;
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.TAURUS;
		displayZodiac(z);
	}
	
}
