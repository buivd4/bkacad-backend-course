import java.util.Scanner;
public class Lec07Prac01 {
    static public class Book{
        //Tạo một lớp Book để đại diện cho thông tin về sách như tiêu đề, tác giả và năm xuất bản.
        String title;
        String author;
        int publishYear;

        Book(){

        }
        Book(String t, String a, int p){
            this.title = t;
            this.author = a;
            this.publishYear = p;
        }

        //Tạo phương thức để in ra thông tin của sách
        void printInfo(){
            System.out.printf("Title: %s\n", this.title);
            System.out.printf("Author: %s\n", this.author);
            System.out.printf("Publish Year: %s\n", this.publishYear);
        }

        //Tạo phương thức để kiểm tra xem sách có xuất bản trước một năm nhất định hay không
        boolean isPublishBefore(int year){
            return (this.publishYear<year);
        }
    }
    public static void main(String[] args) {
        // Khởi tạo 3 cuốn sách
        // Book book1 = new Lec07Prac01.Book("The C Programming Language", "Someone", 1990);
        // Book book2 = new Lec07Prac01.Book("The Art of Programming", "Someone else", 1980);
        // Book book3 = new Lec07Prac01.Book("Algorithm", "Someone else", 1887);

        // In thông tin
        // book2.printInfo();

        // Sử dụng thuộc tính
        // System.out.printf("Book 1 có xuất bản trước năm 1995 không? %s\n", book1.isPublishBefore(1995));

        // Viết chương trình nhập vào mảng N cuốn sách (với class Book)
        // <kieu_du_lieu>[] tenBien = new <kieu_du_lieu>[];
        int N=3;
        Book[] books = new Book[N];
        Scanner scn = new Scanner(System.in).useDelimiter("\n");

        for(int i=0;i<books.length;i++){
            System.out.printf("----------Nhập sách thứ %d-------------\n", i);
            System.out.println("Nhập tên sách: ");
            String bookTitle = scn.next();
            System.out.println("Nhập tác giả: ");
            String bookAuthor = scn.next();
            System.out.println("Nhập năm xuất bản: ");
            int bookPY = scn.nextInt();
            books[i]= new Book(bookTitle, bookAuthor, bookPY);
        }
        scn.close();
        System.out.println("--------------------------------------------------");
        for(int i=0;i<books.length;i++){
            System.out.printf("----------In sách thứ %d-------------\n", i);
            books[i].printInfo();
        }
    }
}
