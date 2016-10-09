
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int[] a={15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		//System.out.println(search(a,1,0,a.length-1));
		//String[] a={"at","","","","ball","","","car","","","dad","",""};
		//System.out.println(searchR(a,"at",0,a.length-1));
		int[][] a={{0,2,4,6,8},{1,3,5,7,9},{2,4,6,8,10}};
		search(a,9);

	}
	
	public static boolean search(int[][] a, int x){
		int row=a.length-1;
		int column=0;
		while(row>=0 && column<a[0].length){
			
				if(a[row][column]==x){
					System.out.println(row+" "+column);
					return true;
				}else if(a[row][column]>x){
					row--;
				}else{
					column++;
				}
			
		}
	
		return false;
		
	}


}
