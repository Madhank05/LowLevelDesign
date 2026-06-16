
import model.Member;
import model.Library;
import model.Book;
import java.util.*;
class Main{
    public static void main(String[] args){
        Library lib = new Library();
        lib.addBook(101,"thirukural","thiruvaluvar");
        lib.addBook(102,"DSA","madhan");
        lib.addBook(103,"OOPS","gokila");
        lib.addBook(104,"DBMS","sahana");
        lib.seeAllBooks();
        Member m1 = new Member(1,"Madhan");
        lib.borrowbook(103,m1);
        lib.seeAvailableStatus(103);
        lib.borrowbook(102,m1);
        m1.seeBorrowedBooks();
        lib.seeAllBooks();
        lib.returnbook(103,m1);
        lib.deleteBook(101);
        lib.seeAllBooks();
    }
}
