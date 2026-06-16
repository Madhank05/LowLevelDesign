package model;
import java.util.*;

public class Library{
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(int id,String title,String author){
          books.add(new Book(id,title,author));
          System.out.println("Book Added Successfully");
    }
    public void deleteBook(int id){
        for(Book b : books){
            if(id==b.getId()){
              books.remove(b);
              System.out.println("Book deleted Successfully");
              break;
            }
        }
    }
    public void seeAvailableStatus(int id){
        System.out.println("\nAvailable status");
         System.out.println("ID "+"  Title  "+"Author "+"Available status");
        for(Book b : books){
            if(id==b.getId()){
              System.out.println(b.getId() + " "+b.getTitle() + " " + b.getAuthor()+" "+b.getAvailable());
            }
        }
    }
    public void seeAllBooks(){
        System.out.println("\nBook details");
         System.out.println("ID "+"  Title  "+"Author "+"Available status");
          for(Book b : books){
              System.out.println(b.getId()+" "+b.getTitle() + " " + b.getAuthor()+" "+b.getAvailable());
        }
    }
    public void returnbook(int id,Member m){
         for(Book b : books){
            if(id==b.getId()){
              m.returnbook(b);
            }
        }
    }
    public void borrowbook(int id,Member m){
        for(Book b : books){
           if(id==b.getId()){
              m.borrowbook(b);
            }
        }
    }
    
}