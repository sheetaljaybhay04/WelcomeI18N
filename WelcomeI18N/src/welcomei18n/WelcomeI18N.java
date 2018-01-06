
package welcomei18n;

/**
 * @author jaybhay-PC
 */

import java.util.*;
import java.text.*;
import java.io.*;

public class WelcomeI18N {

    public static void main(String args[]) throws Exception
	{
                int op=0;
		System.out.println("Specify your language:\n\nSelect any one option among the following- \n1. English\n2. French\n3. German\n4. Italian");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                try {
                    
                    op=Integer.parseInt(br.readLine());
                }
                catch(Exception e) {
                    System.out.println("Invalid option");
                }
                Locale l=new Locale("en");
                switch(op){
                        case 1: l=new Locale("en");  break;
                        case 2: l=new Locale("fr");  break;
                        case 3: l=new Locale("de");  break;
                        case 4: l=new Locale("it");  break;
                        default: break;
                }
		
		ResourceBundle rb=ResourceBundle.getBundle("P1", l);
		System.out.println(rb.getString("n"));
		String name=br.readLine();
		System.out.println("\n"+rb.getString("w")+" "+name);
		Date d=new Date();
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, l);
		DateFormat tf=DateFormat.getTimeInstance(DateFormat.FULL, l);
		String sdf=df.format(d);
		String stf=tf.format(d);
		System.out.println("\n"+sdf+" "+stf);	
	}
    
}
