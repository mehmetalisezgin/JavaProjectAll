package replit;

import java.util.Scanner;

public class For_While3 {

	public static void main(String[] args) {
/* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

       Input : String str=“Javaisalsoeasy”

,       Output: a s   */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir kelime giriniz : ");
		String kelime = scan.nextLine();
 
    String tekrarlayan="";
 
    for (int i = 0; i < kelime.length(); i++) {
			if (kelime.substring(i + 1).contains(kelime.substring(i, i + 1))) {
				if (!tekrarlayan.contains(kelime.substring(i, i + 1))) {
					tekrarlayan = tekrarlayan + kelime.charAt(i) + "";
				}
			}

		}
		System.out.println(tekrarlayan);
		
		scan.close();
		}
      
	}


