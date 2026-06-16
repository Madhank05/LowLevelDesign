package model;
import java.util.*;

public class Member{
    private int id;
    private String name;
    private ArrayList<Book> borrowedbooks;
    public Member(int id,String name){
        this.id = id;
        this.name = name;
        borrowedbooks = new ArrayList<>();
    }
    public void borrowbook(Book b){
        borrowedbooks.add(b);
        b.setAvailable(false);
        System.out.println("Book borrowed successfully");
    }
     public void returnbook(Book b){
        borrowedbooks.remove(b);
        b.setAvailable(true);
    }
    public void seeBorrowedBooks(){
        for(Book b : borrowedbooks){
             System.out.print(b.getId()+" "+b.getTitle() + " " + b.getAuthor());
        }
    }
}