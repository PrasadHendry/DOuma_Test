package dOuma_Pak;

public class Book {

    String author, title;
    int isbn;
    
	Book()
	{
	    
        author = "";
        title = "";
        isbn = 0;
    }

    Book(String au, String tl, int ib)
    {

        author = au;
        title = tl;
        isbn = ib;
    }

    public void setData()
    {
        author = "Fyodor Dostoevsky";
        title = "Crime and Punishment";
        isbn = 784;
    }

    void display()
    {

        System.out.print("\nAuthor: "+author+"\nBook Title: "+title+"\nISBN: "+isbn);
    }

}

