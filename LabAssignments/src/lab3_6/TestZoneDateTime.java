package lab3_6;

public class TestZoneDateTime {
public static void main(String[] args) {
	
ZoneDateTime zd= new ZoneDateTime();
String s1= "America/New_York";
String s2="Europe/London";
String s3="Asia/Tokyo";
String s4="US/Pacific";
String s5="Africa/Cairo";
String s6="Australia/Sydney";

zd.printDateTime(s1);
zd.printDateTime(s2);
zd.printDateTime(s3);
zd.printDateTime(s4);
zd.printDateTime(s5);
zd.printDateTime(s6);

}
}