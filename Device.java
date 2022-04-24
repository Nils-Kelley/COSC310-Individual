package main;

import java.util.*;

public class Device {

	List<List<String>> master = new ArrayList<>();
	Map<List<String>, String> problems = new HashMap<>();

	public Device() {

//each problem has a list of keywords associated with it
		List<String> P1 = new ArrayList<>();
		P1.add("Won't power on");
		P1.add("Is not turning turn on");
		P1.add("experiencing a blank screen");
		List<String> P2 = new ArrayList<>();
		P2.add("too bright");
		P2.add("too dim");
		List<String> P3 = new ArrayList<>();
		P3.add("Can't hear my ringtone");
		P3.add("Cannot hear my ringtone");
		List<String> P4 = new ArrayList<>();
		P4.add("dies quickly");
		P4.add("dies often");
		List<String> P5 = new ArrayList<>();
		P5.add("too slow");
		List<String> P6 = new ArrayList<>();
		P6.add("bluetooth issues");
		List<String> P7 = new ArrayList<>();
		P7.add("Icloud is full");
		P7.add("issues with icloud");
		List<String> P8 = new ArrayList<>();
		P8.add("touch screen stopped working");
		List<String> P9 = new ArrayList<>();
		P9.add("web");
		P9.add("google");
		P9.add("safari");
		List<String> P10 = new ArrayList<>();
		P10.add("cellular issues");
		P10.add("data problems");
		P10.add("coverage issues");
		P10.add("sim card");
		List<String> P11 = new ArrayList<>();
		P11.add("wifi");
		List<String> P12 = new ArrayList<>();
		P12.add("planning");
		P12.add("calendar");
		P12.add("routine");
		List<String> P13 = new ArrayList<>();
		P13.add("pay");
		P13.add("wallet");
		P13.add("card");
		List<String> P14 = new ArrayList<>();
		P14.add("language");
		List<String> P15 = new ArrayList<>();
		P15.add("volume");
		List<String> P16 = new ArrayList<>();
		P16.add("scratch");
		P16.add("dent");
		P16.add("damage");
		P16.add("protector");
		P16.add("broken");
		List<String> P17 = new ArrayList<>();
		P17.add("iphone restoration");
		List<String> P18 = new ArrayList<>();
		P18.add("android restoration");

		// Creating the List(s) for each definition
		List<String> P19 = new ArrayList();
		P19.add("define power");
		List<String> P20 = new ArrayList<>();
		P20.add("define bright");
		List<String> P21 = new ArrayList<>();
		P21.add("define turn on ");
		List<String> P22 = new ArrayList<>();
		P22.add("define dim");
		List<String> P23 = new ArrayList<>();
		P23.add("define slow");
		List<String> P24 = new ArrayList<>();
		P24.add("define bluetooth");
		List<String> P25 = new ArrayList<>();
		P25.add("define icloud");
		List<String> P26 = new ArrayList<>();
		P26.add("define touch screen");
		List<String> P27 = new ArrayList<>();
		P27.add("define internet");
		List<String> P28 = new ArrayList<>();
		P28.add("define cellular");

		// syntax that triggers the KeyWord list - creating list for it
		List<String> P29 = new ArrayList<>();
		P29.add("keywords");

		// Creating the List(s) for the word being translated
		List<String> P30 = new ArrayList<>();
		P30.add("translate power");
		List<String> P31 = new ArrayList<>();
		P31.add("translate bright");
		List<String> P32 = new ArrayList<>();
		P32.add("translate turn on");
		List<String> P33 = new ArrayList<>();
		P33.add("translate phone dies often");
		List<String> P34 = new ArrayList<>();
		P34.add("translate slow");
		List<String> P35 = new ArrayList<>();
		P35.add("translate bluetooth");
		List<String> P36 = new ArrayList<>();
		P36.add("translate phone"); 
		List<String> P37 = new ArrayList<>();
		P37.add("translate touch screen");
		List<String> P38 = new ArrayList<>();
		P38.add("translate internet");
		List<String> P39 = new ArrayList<>();
		P39.add("translate cellular");

		// all keyword lists compiled to one place - the MASTER list
		master = (Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P18,
				P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32, P33, P34, P35, P36, P37, P38,
				P39));

		// each problem has a solution
		String S1 = "You should try to plug it into power";
		String S2 = "You should try to access setting>display>brightness";
		String S3 = "You should try to turn on the ringer";
		String S4 = "You should try to get a new phone";
		String S5 = "You should try to close some apps";
		String S6 = "You should try to make sure the device you want to pair with is in pairing mode,then check your settings";
		String S7 = "You need to access setting and pay for more Icloud storage";
		String S8 = "You should try to touch it's software";
		String S9 = "You should try to tap the safari icon";
		String S10 = "You should try to For more information on your cell phone provider, Please contact them";
		String S11 = "You should try to Go to your home router,then settings and select the given name and then enter password";
		String S12 = "You should try to Use the calendar tool that comes with your model";
		String S13 = "You should try to Go to wallet app, press add card, add card details";
		String S14 = "You should try to go to setting > accessibility > preferred > language";
		String S15 = "You should try to use the side button to adjust volume up or down";
		String S16 = "You should try to take to the shop and be more careful";
		String S17 = "You Selected 'iPhone Restoration'.\n "
				+ "                             If this is correct, please describe the issue(s) you are having:\n "
				+ "                             (i.e., power, data, damage, etc..)";
		String S18 = "You Selected 'Android Restoration'.\n "
				+ "                             If this is correct, please describe the issue(s) you are having:\n"
				+ "                             (i.e., power, data, damage, etc..)\"";
		// DEFINITIONS - WIKIPEDIA PART OF THE API
		String S19 = "Power - Supply (a device - i.e., your phone) with mechanical or electrical energy";
		String S20 = "Bright - Giving out or reflecting a lot of light; shining";
		String S21 = "Turn on - Start the flow or operation of something by means of a valve, switch, or button";
		String S22 = "Dim - Not shining brightly or clearly";
		String S23 = "Slow - Moving or operating, or designed to do so, only at a low speed; not quick or fast";
		String S24 = "Bluetooth - A standard for the short-range wireless interconnection of mobile phones, computers, and other electronic devices";
		String S25 = "iCloud - The service from Apple that securely stores your photos, files, notes, passwords, \n"
				+ "         and other data in the cloud and keeps it up to date across all your devices, automatically";
		String S26 = "Touch Screen - A display device which allows the user to interact with a computer by touching areas on the screen";
		String S27 = "Internet - A global computer network providing a variety of information and communication facilities, \n"
				+ "         consisting of interconnected networks using standardized communication protocols";
		String S28 = "Cellular Data - Denoting or relating to a mobile telephone system that uses a number of short-range radio stations to cover the area that it serves, \n"
				+ "         he signal being automatically switched from one station to another as the user travels around";
		String S29 = "List of Keywords: \n"
				+ "                                   (-)    -power \n                                   (-)    -bright \n                                   (-)    -turn on "
				+ "\n                                   (-)    -dim "
				+ "\n                                   (-)    -slow \n                                   (-)    -bluetooth \n                                   (-)    -iCloud / Phone (translate only)"
				+ "\n                                   (-)    -touch screen \n                                   (-)    -internet \n                                   (-)    -cellular ";

		// TRANSLATION OF KEYWORDS INTO GERMAN
		String S30 = "\n             ($) KEYWORD: Power (i.e., electricity) \n"
				+ "             ($) TRANSLATION: Elektrizität "
				+ "\n             ($) DEFINITION IN GERMAN: Elektrische Energie, elektrischer Strom \n"
				+ "             (was du benutzt um dein händy aufzuladen)";

		String S31 = "\n             ($) KEYWORD: Bright \n" + "             ($) TRANSLATION: Hell"
				+ "\n             ($) DEFINITION IN GERMAN: Mit viel Licht erfüllt und damit leuchtend oder gut ausgeleuchtetet";

		String S32 = "\n             ($) KEYWORD: Turn on \n" + "             ($) TRANSLATION: Anmachen | (Mach mal) An"
				+ "\n             ($) DEFINITION IN GERMAN: Ein  Gerät (Lampe, Heizung, Elektrogerät etc.) anschalten";

		String S33 = "\n             ($) KEYWORD: Dim \n" + "             ($) TRANSLATION: Dunkel"
				+ "\n             ($) DEFINITION IN GERMAN: Ohne oder wenig Licht, lichtlos";

		String S34 = "\n             ($) KEYWORD: Slow \n" + "             ($) TRANSLATION: Langsam"
				+ "\n             ($) DEFINITION IN GERMAN: Eine niedrige Geschwindigkeit aufweisend, lange Zeit benötigend";

		String S35 = "\n             ($) KEYWORD: Bluetooth \n" + "             ($) TRANSLATION: Bluetooth"
				+ "\n             ($) DEFINITION IN GERMAN: Technik ein Industriestandard für die drahtlose Vernetzung von Geräten über kurze Distanz";

		String S36 = "\n             ($) KEYWORD: Phone \n" + "             ($) TRANSLATION: Händy"
				+ "\n             ($) DEFINITION IN GERMAN: Kleines Funktelefon, das man bei sich trägt";

		String S37 = "\n             ($) KEYWORD: Touch Screen \n" + "             ($) TRANSLATION: Touchscreen"
				+ "\n             ($) DEFINITION IN GERMAN: Ein berührungsempfindlicher Bildschirm, der als Ein- und Ausgabegerät dient";

		String S38 = "\n             ($) KEYWORD: Internet \n" + "             ($) TRANSLATION: Internet"
				+ "\n             ($) DEFINITION IN GERMAN: Internet, Medium: Online-Medium; weltweites, öffentliches Computernetzwerk";

		String S39 = "\n             ($) KEYWORD: Cellular Data \n" + "             ($) TRANSLATION: Mobilfunkdaten"
				+ "\n             ($) DEFINITION IN GERMAN: Benutzt um eine Mobilfunkverbindung an mobile Geräte wie Smartphones und Tablets übertragen werden";

		// Problems and solutions paired in HashSet
		problems.put(P1, S1); //
		problems.put(P2, S2);
		problems.put(P3, S3);
		problems.put(P4, S4);
		problems.put(P5, S5);
		problems.put(P6, S6);
		problems.put(P7, S7);
		problems.put(P8, S8);
		problems.put(P9, S9);
		problems.put(P10, S10);
		problems.put(P11, S11);
		problems.put(P12, S12);
		problems.put(P13, S13);
		problems.put(P14, S14);
		problems.put(P15, S15);
		problems.put(P16, S16);
		problems.put(P17, S17);
		problems.put(P18, S18);

		// Adding the DEFINITIONS and KEYWORDS to the HashSet
		problems.put(P19, S19);
		problems.put(P20, S20);
		problems.put(P21, S21);
		problems.put(P22, S22);
		problems.put(P23, S23);
		problems.put(P24, S24);
		problems.put(P25, S25);
		problems.put(P26, S26);
		problems.put(P27, S27);
		problems.put(P28, S28);

		// Adding the KEYWORDS LIST into the HashSet
		problems.put(P29, S29);

		// Adding the TRANSLATIONS of keywords with its KEYWORD (in GERMAN) into the
		// HashSet
		problems.put(P30, S30);
		problems.put(P31, S31);
		problems.put(P32, S32);
		problems.put(P33, S33);
		problems.put(P34, S34);
		problems.put(P35, S35);
		problems.put(P36, S36);
		problems.put(P37, S37);
		problems.put(P38, S38);
		problems.put(P39, S39);
	}

	public List GetMaster() {
		return master;
	}
}
//key word lists