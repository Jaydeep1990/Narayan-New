package array;

//pravin and sourabh gaurav
//abhi come back
public class Practice {
public static void main(String[] args) {
  
int jay=1231114;int sum=0;
int k=jay;int prod=0;
while(jay!=0) {
	int kk=jay%10;
	if(kk==1)
		prod++;
	jay=jay/10;
}System.out.println(prod);
}
}



