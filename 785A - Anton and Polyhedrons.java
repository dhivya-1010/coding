import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++){
		    str[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<n;i++){
		    String r = str[i];
		    if(r.equals("Tetrahedron"))count+=4;
		    else if(r.equals("Cube")) count+=6;
		    else if(r.equals("Octahedron")) count+=8;
		    else if(r.equals("Dodecahedron")) count+=12;
		    else if(r.equals("Icosahedron")) count+=20;
		}
		System.out.println(count);
	}
}
