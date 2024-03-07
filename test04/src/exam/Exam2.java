package exam;

public class Exam2 {
	public static void main (String [] args) {
		for(int i=1;i<10;i++) { 			
			for(int j=2;j<10;j+=2) {				
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}System.out.println();			
		}	
	}
}
/*for(int i=2;i<10;i+=2) { //단(i) : 2, 4, 6,8
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}System.out.println();			
		}	*/
/*또는
 *for(int i=2;i<10;i++) { 
			if(i%2==1) continue;
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}System.out.println();			
		}	
 */
/*2단
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18

4단
4*1=4
4*2=8
4*3=12
4*4=16
4*5=20
4*6=24
4*7=28
4*8=32
4*9=36

6단
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54

8단
8*1=8
8*2=16
8*3=24
8*4=32
8*5=40
8*6=48
8*7=56
8*8=64
8*9=72

*/