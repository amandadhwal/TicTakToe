package defaultpackage;

class TicTacToe
{
	char[][] board;
	public TicTacToe()
	{
		board = new char[3][3];
		initBoard();
	}
	void initBoard()
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = ' ';
			}
		}
	}
	
	void dispBoard()
	{
		System.out.println("-----------------");
		for(int i=0;i<board.length;i++)
		{
			System.out.print("|");
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-----------------");
		}
	}

	void placeMark(int row,int col,char mark)
	{
		if(row >=0 && row<=2 && col>=0 && col<=2)
		{
			board[row][col]= mark;
		}
		else
		{
			System.out.println("Invalid input ");
		}
			
	}
}


public class LaunchGame {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TicTacToe t = new TicTacToe();
		t.dispBoard();
		t.placeMark(0, 0, 'X');
		t.placeMark(5, 0, 'O');
		t.dispBoard();

	}

}
