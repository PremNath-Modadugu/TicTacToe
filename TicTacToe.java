import java.util.*;
class TicTacToe
{
	
	public static void main(String[] args)
	{
		char[][] a = new char[3][3];
		char l;
		 for(int i =0 ; i<3;i++)
		 {
		   for (int j=0;j<3 ;j++ ) {
		   	  a[i][j] = '-';
		   	
		   }
		 }
		System.out.print("Pick a Letter");
		Scanner sc = new Scanner(System.in);
		l=sc.next().toUpperCase().charAt(0);
		boolean flag=true; //true =0 or false = x
		boolean new_flag=true;
		if(l=='X')
			flag=false;
		else if (l=='O')
		 {
			flag=true;
		 }
		 else
		 	System.out.print("Enter either 'X' or 'O'");
		 int i=0;
		 for (i=0;i<9 ;i++ ) {
		 	System.out.println(l+": enter the index of "+l+":");
		 	int index = sc.nextInt();
		 	int j=0,k=0;
		 	switch(index)
		 	{
		 		case 1: j=0;k=0;break;
		 		case 2: j=0;k=1;break;
		 		case 3: j=0;k=2;break;
		 		case 4: j=1;k=0;break;
		 		case 5: j=1;k=1;break;
		 		case 6: j=1;k=2;break;
		 		case 7: j=2;k=0;break;
		 		case 8: j=2;k=1;break;
		 		case 9: j=2;k=2;break;
		 		default: System.out.println("Enter only 1-9");

		 	}
		 	a[j][k] = l;
		 	TicTacToe t = new TicTacToe();
		 	if(t.isWon(l,a))
		 	{
		 		System.out.println("Congrats! "+l+" ,you've won");
		 		break;
		 	}
		 	else{
		 	if(flag){
		 		l='X';
		 		flag = false;
		 	}

		 	else{
		 		l='O';
		 		flag = true;
		 	}
		 }

		 }
		 if(i==9)
			 System.out.println("match is draw");

	    for(int j =0 ; j<3;j++)
		 {
		   for (int k=0;k<3 ;k++ ) {
		   	  System.out.print(a[j][k]);
		   	
		   }
		    System.out.print("\n");
		 }
		 	
		 }



	boolean isWon(char l, char a[][])	{

		char comp=l;

		for(int z=0;z<3;z++)
			{
				if((a[z][0]==l && a[z][1]==l && a[z][2]==l)){
					return true;
            	}
				if((a[0][z]==l && a[1][z]==l && a[2][z]==l)){
					return true;
            	}
			}
			
			if((a[0][0]==l && a[1][1]==l && a[2][2]==l)){
					return true;
            	}
			if((a[0][2]==l && a[1][1]==l && a[2][0]==l)) {
					return true;
			}

			return false;
	}


}