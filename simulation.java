package mp7;
import java.util.Scanner;
public class simulation {
		public static void main(String[] args) {
			
			Scanner stdin = new Scanner( System.in );
			
			System.out.println("How big do you want the board to be?");
		
			int size = stdin.nextInt();
			System.out.println(size);
			
			System.out.println("How many cycles do you want the board to go through?");
			
			int cycles = stdin.nextInt();
			System.out.println(cycles);
			
			int[][] board = new int[size][size];
			
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[0].length; j++) {
					board[i][j] = (int)(Math.random()*2);
				}
			}
			
			for(int i = 0; i < board.length; i++) {
				int count = 0;
				for(int j = 0; j < board[0].length; j++) {
					
					System.out.print(board[i][j] + " ");
					count++;
					if(count == board.length) {
						System.out.println("");
					}
				}
			}
			for(int n = 0; n < cycles - 1; n++) {
				
			
				int[][] newBoard = new int[size][size];
				
				for(int i = 0; i < board.length; i++) {
					for(int j = 0; j < board[0].length; j++) {
						int neighborCount = 0;
						
						if(i == 0 && j == 0) {
							if(board[i + 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j + 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i == 0 && j != 0 && j != board.length - 1) {
							if(board[i + 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j - 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i != 0 && j == 0 && i != board.length - 1) {
							if(board[i + 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j + 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i == 0 && j == board.length - 1) {
							if(board[i + 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j - 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i == board.length - 1 && j == 0) {
							if(board[i - 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j + 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i == board.length - 1 && j == board.length - 1) {
							if(board[i - 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j - 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i == board.length - 1 && j != board.length - 1 && j != 0) {
							if(board[i][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j + 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i != board.length - 1 && j == board.length - 1 && i != 0) {
							if(board[i - 1][j] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j] == 1) {
								neighborCount++;
							}
							if(board[i][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j - 1] == 1) {
								neighborCount++;
							}
						}
						
						if(i != board.length - 1 && j != board.length - 1 && i != 0 && j != 0) {
							if(board[i - 1][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j] == 1) {
								neighborCount++;
							}
							if(board[i - 1][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i][j + 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j - 1] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j] == 1) {
								neighborCount++;
							}
							if(board[i + 1][j + 1] == 1) {
								neighborCount++;
							}
						}
						
						if(board[i][j] == 0) {
							if (neighborCount == 3) {
								newBoard[i][j] = 1;
							} else {
								newBoard[i][j] = 0;
							}
						}
						
						if(board[i][j] == 1) {
							if (neighborCount < 2 || neighborCount > 3) {
								newBoard[i][j] = 0;
							} else {
								newBoard[i][j] = 1;
							}
						}
						
					}
				}
				
				for(int i = 0; i < newBoard.length; i++) {
					for(int j = 0; j < newBoard[0].length; j++) {
						board[i][j] = newBoard[i][j];
					}
				}
				
				System.out.println("");
				
				for(int i = 0; i < board.length; i++) {
					int count = 0;
					for(int j = 0; j < board[0].length; j++) {
						
						System.out.print(board[i][j] + " ");
						count++;
						if(count == board.length) {
							System.out.println("");
						}
					}
				}
		}	
			
		}		
	}
