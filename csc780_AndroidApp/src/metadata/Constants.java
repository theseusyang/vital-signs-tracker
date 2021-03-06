/*
 * This class stores all static information that are needed
 * for the ConnectionManager class.
 */
package metadata;

public class Constants {

	//Change this data based on your IP address.
	public static final String IP_ADD = "192.168.1.30";
	//the opening port number.
	public static final int PORT = 8003;
	
	//constant code for client server protocols.
	public static final int PATIENT_FORGET_PASSWORD 	= 1;
	public static final int PATIENT_ACTIVATE_ACCOUNT 	= 3;
	public static final int PATIENT_DISPLAY_TABLE 		= 5;
	public static final int PATIENT_LOGIN				= 7;
	public static final int PATIENT_MODIFY_ACCOUNT		= 9;
	public static final int PATIENT_ENTER_MANUALLY	 	= 11;
	public static final int PATIENT_EMERGENCY_REQUEST 	= 13;
	public static final int PATIENT_REQUEST_PROVIDER_INFO = 15;
	
	public static final int PROVIDER_FORGET_PASSWORD	= 2;
	public static final int PROVIDER_REGISTER			= 4;
	public static final int PROVIDER_LOGIN				= 6;
	public static final int PROVIDER_LOGOUT				= 8;
	public static final int PROVIDER_DISPLAY_TABLE		= 10;
	public static final int PROVIDER_SUBSCRIBE_PATIENT	= 12;
	public static final int PROVIDER_DISPLAY_CHART		= 14;
	public static final int PROVIDER_CHECK_ALERT_MESSAGE = 16;	
}
