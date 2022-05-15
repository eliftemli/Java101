package Odev14_MatrisTranspoz;

public class main {
	
	public static void main(String[] args) {
		
		int[][] matris = {{1,3,4},{2,4,3},{3,4,5}};
		
		int[][] transpoze = new int[3][3];
		
		for(int i=0; i < matris.length;i++)
		{
			for(int j=0; j < matris[i].length; j++)
			{
				transpoze[i][j] = matris[j][i];
			}
			
		}
		
		System.out.println("Matris: ");
		for(int i=0; i < matris.length;i++)
		{
			for(int j=0; j < matris[i].length; j++)
			{
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpoze:");
		for(int i=0; i < transpoze.length;i++)
		{
			for(int j=0; j < transpoze[i].length; j++)
			{
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
