/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelobello_quiz2;

import java.util.Scanner;



public class Pelobello_Quiz2 {
        public static class Node{
        int data;
        Node next;
        
        //sa sulod sa class na Node nag initiate ug bag ong class
        public Node(int data){
        this.data = data;
        this.next=null;
    }
    }
        public static class LinkedList{
           Node head; 
        public void add(int data){
            Node node = new Node(data);
            
            node.data = data;
            node.next = null;
            
            if(head== null){
                head = node;
            }else {
                Node n = head;
                while (n.next !=null) {                    
                    n = n.next;
                }
                n.next=node;
            } 
        }
   
        public int searchdata(int index){
            Node node = head;
            
            int pos = 0;
            
            while (node!=null) {                
                if(node.data == index){
                    return pos;
                }
                node = node.next;
                pos++;
            }
               return -1;
 
        }
     
         public void insertbyIndex(int index, int data){
            Node List = new Node(data);
            if (index < 0){
                System.out.println("Invalid position, position must be non-negative");
                return;
            }
            if (index == 0){
                List.next = head;
                head = List;
                return;
            }
            Node node = head;
            int currentIndex = 0;
            
            while (node != null && currentIndex < index -1) {                
                node = node.next;
                currentIndex++;
            }
            if(node != null){
                List.next = node.next;
                node.next = List;
            }else {
                System.out.println("Invalid Index!");
            }
        }
       public void display(){
           Node node = head;
         
          
           while (node.next!=null) {               
               System.out.println(node.data);
               node = node.next;
           }
           System.out.println(node.data);
       }              
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean Menu = true;
        
        while (Menu) {            
            System.out.println("1. Add data 2.Insert data in a position you want! 3.  Search data ");
            System.out.print("Input here: ");
             int input = scan.nextInt();
             
             switch (input) {
                    case 1:
                        System.out.print("Enter Data: ");
                        int data = scan.nextInt();
                        list.add(data);
                        
                    break;
                    case 2:
                        System.out.print("Enter Position: ");
                        int pos = scan.nextInt();
                        System.out.print("Enter data: ");
                        int posData = scan.nextInt();
                        
                        list.insertbyIndex(pos, posData);
                    
                    break;
                    case 3:
                        list.display();
                        System.out.print("Input the data you want to Search: ");
                        int search = scan.nextInt();
                        
                        System.out.println("Your search: "+search);
                        System.out.println("at Index: "+list.searchdata(search));
                        
                    
                    break;
                    
                    
                default:
                    System.out.println("Bye!");
                      scan.close();
                   
            }
           
        }
        
        
      
        
        
    }
    
}
