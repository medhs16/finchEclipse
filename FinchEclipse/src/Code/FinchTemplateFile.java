package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      int C4 = 261;
      int D4 = 294;
      int E4 = 330;
      int F4 = 349;
      int G4 = 392;
      int A4 = 440;
      int B4 = 494;
      int C5 = 523;

      // Write some code here!
      //myFinch.
      myFinch.playTone(C4, 1000);
      System.out.println("C");
      myFinch.playTone(D4, 1000);
      System.out.println("C");
      myFinch.playTone(E4, 1000);
      System.out.println("C");
      myFinch.playTone(F4, 1000);
      System.out.println("C");
      myFinch.playTone(G4, 1000);
      System.out.println("C");
      myFinch.playTone(A4, 1000);
      System.out.println("C");
      myFinch.playTone(B4, 1000);
      System.out.println("C");
      myFinch.playTone(C5, 1000);
      System.out.println("C");
      
      
      //singing pattern
      myFinch.playTone(C4, 1000);
      myFinch.playTone(E4, 1000);
      myFinch.playTone(G4, 1000);
      myFinch.playTone(A4, 1000);
      myFinch.playTone(F4, 1000);
      myFinch.playTone(D4, 1000);
      myFinch.playTone(247, 1000);
      myFinch.playTone(G4, 1000);
      myFinch.playTone(C4, 1000);
      
      //fur elise
      myFinch.playTone(659,500);
      myFinch.playTone(622,500);
      myFinch.playTone(659,500);
      myFinch.playTone(622,500);
      myFinch.playTone(659,500);
      myFinch.playTone(B4,500);
      myFinch.playTone(587, 500);
      myFinch.playTone(C5, 500);
      myFinch.playTone(A4, 1000);
      
      //princess leia theme
      myFinch.playTone(587,500);
      myFinch.playTone(659,500);
      myFinch.playTone(587,500);
      myFinch.playTone(B4,500);
      myFinch.playTone(554,500);
      myFinch.playTone(466,500);
      myFinch.playTone(C5, 500);
      myFinch.playTone(440, 500);
      myFinch.playTone(587, 500);
      myFinch.playTone(554,500);
      myFinch.playTone(587,500);
      myFinch.playTone(B4,500);
      myFinch.playTone(554,500);
      myFinch.playTone(466,500);
      myFinch.playTone(554,500);
      myFinch.playTone(A4, 500);
      myFinch.playTone(784, 500);
      myFinch.playTone(740, 500);
      myFinch.playTone(784,500);
      myFinch.playTone(659,500);
      myFinch.playTone(740,500);
      myFinch.playTone(622,500);
      myFinch.playTone(698,500);
      myFinch.playTone(587,500);
      myFinch.playTone(784, 500);
      myFinch.playTone(740, 500);
      myFinch.playTone(784, 500);
      myFinch.playTone(622,500);
      myFinch.playTone(740,500);
      myFinch.playTone(587,500);
      myFinch.playTone(A4,500);
      myFinch.playTone(A4,500);
      myFinch.playTone(740, 750);
      
      //force theme
      myFinch.playTone(A4,1000);
      myFinch.playTone(587,2000);
      myFinch.playTone(659,1000);
      myFinch.playTone(698,500);
      myFinch.playTone(783,500);
      myFinch.playTone(659,2000);
      myFinch.playTone(A4, 1000);
      myFinch.playTone(A4, 500);
      myFinch.playTone(587, 2000);   
      myFinch.playTone(659,500);
      myFinch.playTone(698,500);
      myFinch.playTone(A4,500);
      myFinch.playTone(698,500);
      myFinch.playTone(587,500);
      myFinch.playTone(880,500); //A5
      myFinch.playTone(783, 2000);
      myFinch.playTone(A4, 1000);
      myFinch.playTone(587, 1000);
      myFinch.playTone(659,500);
      myFinch.playTone(698,500);
      myFinch.playTone(587,500);
      myFinch.playTone(880,1000);
      myFinch.playTone(698,500);
      myFinch.playTone(1174,2000);
      myFinch.playTone(587, 1000);
      myFinch.playTone(698,750);
      myFinch.playTone(659, 750);
      myFinch.playTone(587,750);
      myFinch.playTone(783,1000);
      myFinch.playTone(698,500);
      myFinch.playTone(587,500);
      myFinch.playTone(A4,1000);
      myFinch.playTone(A4,500);
      myFinch.playTone(A4,1500);
      myFinch.playTone(587,2000);



      

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }
