public class DrawFigure2 {
 public static final int SUB_HEIGHT = 4;

 public static void main(String[] args) {
	 drawLine();
	 drawTop();
	 drawBottom();
	 drawLine();
  	}
 
  // produces a solid line
  public static void drawLine() {
	  System.out.print("+");
	  for (int i = 1; i <= (2 * SUB_HEIGHT); i++) {
		  	System.out.print("–");
	  }
	  System.out.println("+");
  	}
 
  // produces the top half of the hourglass figure
  public static void drawTop() {
		  for (int line = 1; line <= SUB_HEIGHT; line++) {
		  System.out.print("|");
		  writeChars(' ', line - 1);
		  System.out.print("\\");
		  writeChars('.', 2 * SUB_HEIGHT - 2 * line);
		  System.out.print("/");
		  writeChars(' ', line - 1);
		  System.out.println("|");
		  }
		  }
 
  // produces the bottom half of the hourglass figure
  public static void drawBottom() {
	  for (int line = 1; line <= SUB_HEIGHT; line++) {
		  System.out.print("|");
		  writeChars(' ', SUB_HEIGHT - line); 
		  System.out.print("/");
		  writeChars('.', line*2-2);
		  System.out.print("\\");
		  writeChars(' ', SUB_HEIGHT - line); 
		  System.out.println("|");
	  		}
   		}
  public static void writeChars(char symbol, int number) {
		for (int count = 1; count <= number; count++) {
			System.out.print(symbol);
		}
	}
   }
