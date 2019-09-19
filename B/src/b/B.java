/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.util.Random;

/**
 *
 * @author user
 */
public class B {

     public static void callNumber(int[][]c1,int[][]c2,int[]n)
{
int i,j,k;
Random rand = new Random();
k=rand.nextInt(75);
if (n[k]==0)
;
else
System.out.println(n[k]);

for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if (c1[i][j]==n[k])
c1[i][j]=0;
if (c2[i][j]==n[k])
c2[i][j]=0;
}
}
n[k]=0;
}
//A method that calls a number from 1-75, and checks to see if it is in either card.
//If it is in either card, it sets the value in the card equal to 0 so it can be determined if it has already been called.

public static boolean checkWinner(int[][]c1)
{
int count1=0,count2=0,i,j;
for(i=0;i<c1.length;i++)
{
for(j=0;j<c1.length;j++)
{
if(c1[i][j]==0)
count1++;
if(c1[j][i]==0)
count2++;
}
//Checks for 5 in a row in rows and columns.
if(count1==5)
return true;
if(count2==5)
return true;
}
count1=count2=0;
for(i=0;i<c1.length;i++)
{
if(c1[i][i]==0)
count1++;
if(c1[i][c1.length-1-i]==0)
count2++;
}
//Checks for the diagonals.
if(count1==5)
return true;
if(count2==5)
return true;
return false;
}
//A method to check to see if either card has one.

public static void createCard(int [] [] c1)
{
int i,j;
Random rand = new Random();
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if (j==0)
c1[i][j]= rand.nextInt(15)+1;
else if (j==1)
c1[i][j]= rand.nextInt(15)+16;
else if (j==2)
c1[i][j]= rand.nextInt(15)+31;
else if (j==3)
c1[i][j]= rand.nextInt(15)+46;
else if (j==4)
c1[i][j]= rand.nextInt(15)+61;
}
}
}

   
    
    public static void main(String[] args)
{
int j,i,k;
boolean winnerFoundc1=false,winnerFoundc2=false;
//Variable declarations.
int[][] card1 = new int[5][5];
int[][] card2 = new int[5][5];
//Creates an array for the two cards.
int[] numbers = new int [75];
//Creates an array for the 75 numbers to be called.
Random rand = new Random();
for(k=0;k<75;k++)
{
numbers[k]= k+1;
}
//Fills the called number array with the numbers 1-75.
createCard(card1);
createCard(card2);
System.out.println(createCard(card1));
printCard2(card2);
//Methods to create the card and print it.
while(winnerFoundc1==false && winnerFoundc2==false)
{
callNumber(card1,card2,numbers);
winnerFoundc1=checkWinner(card1);
winnerFoundc2=checkWinner(card2);
}

    /**
     *
     * @param c1
     * @param c2
     * @param n
     */
   
}

    