import java.util.ArrayList;

class Book{
    int noOfPAges;
    String author;
    int edition;
    Book(int noOfPAges,String author,int edition){
        this.author=author;
        this.noOfPAges=noOfPAges;
        this.edition=edition;
    }
}
class BookArr{
    public static void main(String[] args){
        ArrayList<Book> list=new ArrayList<>();
        list.add(new Book(20,"a",30));
        list.add(new Book(200,"b",300));
        display(list);
    }
    static void display(ArrayList<Book> list){
        for (Book b : list)
            System.out.println("Author:"+b.author+" Pages:"+b.noOfPAges+" Ed:"+b.edition);
    }
}