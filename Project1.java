//Student name: Long Nguyen
//Class: CS 3345
//Section: 004
//Semester: Spring 2019
//Project: 1
//Write a java program to compute all prime numbers less than equal to a given integer N using
//the algorithm “Sieve of Erotosthenes”.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.*;
/**
 *
 * @author alongday28
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Scanner class
        int n = 0;
    	Scanner sc = new Scanner(System.in);
    	//Asking for input
    	while (n <= 0)
    	{
    		System.out.println("Input for integer N (non-negative): ");
    		//Getting input
    		n = sc.nextInt();
    	}
    	//Create a boolean array with the length of N+1
    	boolean[] a = new boolean[n+1];
    	a[0] = false;
    	a[1] = false;
    	//Make all elements of the array to be true, except 1st and 2nd
    	for (int i = 2; i <= n; i++)
    	{
    		a[i] = true;
    	}
    	//All prime numbers are marked true, else false
    	for (int i = 2; i < Math.sqrt(n); i++)
    	{
    		if (a[i] == true)
    		{
    			for (int j = i*i; j <= n; j += i)
    			{
    				a[j] = false;
    			}
    		}
    	}
    	//Print out the prime numbers
    	System.out.println("Prime number that is less than N are: ");
    	for (int i = 0; i <= n; i++)
    	{
    		if (a[i] == true)
    		{
    			System.out.print(i + " ");
    		}
    	}
    }
    
}
