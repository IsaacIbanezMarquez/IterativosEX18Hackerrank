
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




// ENUNCIADO:

// Nombres amics

/* Fes un programa que llegeix dos nombres enters positius i escrigui si són amics o no. Dos nombres enters positius són amics si la suma dels divisors positius d'un és igual a l'altre número i a l'inrevés.

Més info: Nombres amics Wikipedia

Fixeu-vos en l'exemple de 220 i 284 de la pàg de la wikipedia.

Si els dos nombres són amics escriurem TRUE i sinó FALSE.

Input Format

Dos nombres enters positius.

Constraints

Suposem els dos nombres enters positius.

Output Format

{ TRUE | FALSE }

Sample Input 0

220 284
Sample Output 0

TRUE
Sample Input 1

15 2
Sample Output 1

FALSE

 */

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int NR = 0;
        int IR = 0;

        int count = 1;

        while (count != Num1)
        {
            if ((Num1 % count) == 0)
            {
                NR = NR + count;
            }
            count++;
        }
        count = 1;

        while (count != Num2)
        {
            if ((Num2 % count) == 0)
            {
                IR = IR + count;
            }
            count++;
        }
        if (IR == Num1 & NR == Num2)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
