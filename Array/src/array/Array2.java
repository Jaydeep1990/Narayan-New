package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//jaydeep chavan pratap
//jaydeep chavna going to the home
 /* String name="Jaydeep";
   String name1="Jaydeel";
  System.out.println(name.compareTo(name1));
    if(name.length()==name1.length()) {
    	try {
			for(int i=0;i<name1.length();i++) {
				if(name.charAt(i)==name1.charAt(i)) {
					System.out.println(name.charAt(i)+" same character");
				}else {
					System.out.println("not eaual both string");
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("String is not equal");
		}
    	
    }*/
		
		//state-teste 
	/*	String s="elbow";
		String s1="below";
		if(s.length()==s1.length()) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					System.out.println(s.charAt(i)+"is available");
					break;
				}if(j==s.length()-1) {
					System.out.println(j);
					if(s.charAt(i)==s1.charAt(j)) {
						System.out.println(s.charAt(i)+"is available");
				}else {
					System.out.println(s.charAt(i)+"not present");
				}
			}
		}
	}

}*/
		String jay="character";
	
		for(int i=0;i<jay.length();i++) {
			int count=1;
		for(int j=i+1;j<jay.length();j++) {
			if(jay.charAt(i)==jay.charAt(j)) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(jay.charAt(i)+"comes"+count+"times");
		}
		}
	/*	String name="sampada";
		//System.out.println(name.replace("n", ""));
		System.out.println("jaydeep");
		System.out.println("chavan");
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					System.out.println(name.replaceAll(Character.toString(name.charAt(i)), ""));
				}
			}
		}*/
	/*	char []jay= {'a','b','c','d'};
		String a=new String(jay);
		System.out.println(a);
		String kaka="jaydeep";
		char[]pp=kaka.toCharArray();
		char ii='a';
		String i=Character.toString(ii);*/
		
	/*	String a="jaydeep";
		String b="chavan";
		a=a+b;
		b=a.substring(0, 7);
		a=a.substring(7,13);
		System.out.println(a);
		System.out.println(b);*/
		/*	int []jay= {3,4,6,7,3,7,9};
	     
		for(int i=0;i<jay.length;i++) {
			int temp;
			for(int j=i+1;j<jay.length;j++) {
				if(jay[i]>jay[j]) {
					
					temp=jay[i];
				//	System.out.println(jay[i]);
				jay[i]=jay[j];
				jay[j]=temp;
				//System.out.println(temp);
				}
			}
		}
		for(int a:jay) {
			System.out.println(a);
		}*/
		/*	String []kaka= {"jay","cha","kaka","pra"};
			for(int i=0;i<kaka.length;i++) {
				String temp="";
				for(int j=i+1;j<kaka.length;j++) {
					if(kaka[i].compareTo(kaka[j])<0) {
						temp=kaka[i];
						kaka[i]=kaka[j];
						kaka[j]=temp;
					}
				}
			}
			for(String kk:kaka) {
				System.out.println(kk);
			}*/
			String kk[]= {"jay","cha","van","papa"};
			int ascc=000;
			String small="";
			for(String jj:kk) {
			char[]pp=jj.toCharArray();
			int charVal=pp[0];
			if(charVal>ascc) {
				ascc=charVal;
				small=jj;
			}
			}
			System.out.println(small);
	}
}
