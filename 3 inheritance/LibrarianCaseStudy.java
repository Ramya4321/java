/*5. Implement any one of the case study with the
 specifications given below:
a) Create classes, objects and their properties.
b) Add methods to classes and implement them.
c) Refine the objects by adding constructors and local
variables.
d) Show communication between the objects by calling
instance of one object from another class.
e) Handle Exceptions and Implement relationships like
inheritance.
Case study 2: Library Application:
The Library Application consists of Student, faculty and book
details, Issue book, and return book. The student and faculty
details consist of name, ID, Branch and maximum number of
books can be issued to them. The book details consist of ID,
Book name and Author name. To Issue a book to members, the
librarian checks the availability of book and if the book is not
available, then an error message will be displayed. To return
the book, the librarian verifies the validity and if the validity is
expired then the fine amount message will be displayed. The
student and faculty can view the book details issued to them
and also can check the count of remaining books that can be
taken for issue
*/
import java.io.*;
import java.util.*;
import java.lang.*;
class Librarian 
{
	int k,l;
	double id;
	String name;
	String branch;
	final int max=5;//maximum number of books that can be issued
	int noOfBooks;	//number of books needed
	int bookstaken;
	Librarian()
	{
		int bookstaken=0;
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);//a single scanner class didnt take two types of data types
		System.out.print("enter name:");
		name=s.nextLine();
		System.out.print("enter id:");
		id=sc.nextDouble();
		System.out.print("enter branch:");
		branch=s.nextLine();
	}
	public void display()
	{
		System.out.println("name  ="+name);
		System.out.println("id= "+id);
		System.out.println("branch= "+branch);
		System.out.println("books that are taken ="+bookstaken);
		System.out.println("total books that can be issued ="+max);
		System.out.println("books that can be taken for issue ="+(max-bookstaken));
	}
}
class Book
{
	int bookid;
	int books;//number of books left in that id
	String author,bookname;
	Book()
	{
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.print("enter bookid: ");
		bookid=sc.nextInt();
		System.out.print("enter name of book =");
		bookname=s.nextLine();
		System.out.print("author of the book =");
		author=s.nextLine();
		System.out.print("enter number of books of the id left: ");
		books=sc.nextInt();
	}
	void issuebook(Librarian l)
	{
		if(books!=0)
		{
			if(l.bookstaken>=5)
			{
				System.out.println("cannot issue more than five books:");
				return;
			}
			books--;
			l.bookstaken++;
			System.out.println("books issued");
		}
		else 
			System.out.println("error(no books of the id left)");
	}
	void bookreturn(Librarian l)
	{
		int validity;
		Scanner s=new Scanner(System.in);
		System.out.print("enter how many days has it been since you have taken the book: ");
		validity=s.nextInt();
		if(validity>7)
			System.out.println("fine amountis 100rs");
		else 
			System.out.println("no fine");
		System.out.println("book returned ");
		l.bookstaken--;
		books++;
	}
	void bookdetails()
	{
		System.out.println("name of book ="+bookname);
		System.out.println("id= "+bookid);
		System.out.println("author of the book ="+author);
		System.out.println("number of books left="+books);	
	}
}
class LibrarianCaseStudy
{
	public static void main(String args[])
	{
		int l=0;//number of  accounts created
		int n=0;//number of bookids created
		int ch,no,bid,i,sid,j,k;
		//int bookstaken=0;
		int noOfBooks;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("enter maximum number of accounts to be created:");
		no=s.nextInt();
		Librarian account[]=new Librarian[no];
		Book b[]=new Book[10];
		while(true)
		{
			System.out.print("\n 1.create (student/faculty) account\n 2.create an id for the book\n 3.book issue\n 4.return books \n 5.display book details\n 6.display (student/faculty) details\n 7.exit\n");
			System.out.print("enter your choice: ");
			ch=sc.nextInt();
			if(ch==1)
			{
				account[l]=new Librarian();
				l++;
			}
			if(ch==2)
			{
				b[n]=new Book();
				n++;
			}
			
			else if(ch==3)
			{
				int flag2=0;
				System.out.print("enter  your id: ");
				sid=s.nextInt();
					for(j=0;j<l;j++)
					{
						if(sid==account[j].id)
						{
							flag=1;
							System.out.print("enter how many books do you need: ");
							noOfBooks=s.nextInt();
							if(account[j].bookstaken>=5)
								System.out.println("cannot issue more than 5 books");
							else
							{
								for(i=0;i<noOfBooks;i++)
								{
									System.out.print("enter bookid: ");
									bid=s.nextInt();
									for(k=0;k<n;k++)
									{
										if(b[k].bookid==bid)
										{
											flag2=1;
											b[k].issuebook(account[j]);
											break;
										}
									}
									if(flag2==0)
										{
											System.out.println("enter right id");
										}
									}	
							}		
							
						break;
						}
					}	
					if(flag==0)
						System.out.println("enter right id");					
			}
			else if(ch==4)
			{
				int flag1=0;
				System.out.print("enter  your id:");
				sid=s.nextInt();
				
				for(j=0;j<l;j++)
					{
						if(sid==account[j].id)
						{
							flag1=1;
							System.out.print("enter bookid: ");
							bid=s.nextInt();
							for(i=0;i<n;i++)
							{
								if(b[i].bookid==bid)
								{
										b[i].bookreturn(account[j]);
										break;
								}
							}
							break;
						}
					}
				if(flag1==0)
					System.out.println("enter right id");
			}
			else if(ch==5)
			{
				System.out.print("enter book id: ");
				bid=s.nextInt();
				for(j=0;j<n;j++)
				{
					if(bid==b[j].bookid)
					{
						b[j].bookdetails();
						break;
					}
				}
			}
			else if(ch==6)
			{
				System.out.print("enter  id:");
				sid=s.nextInt();
				for(j=0;j<l;j++)
						if(sid==account[j].id)
						{
							account[j].display();
							break;
						}
			}
			else if(ch==7)
			{
				System.exit(0);
			}
			
		}
	}
}
/*

C:\Users\Rayapati Nikhil\Desktop\c files\java>java Week5b
enter maximum number of accounts to be created:5

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 1
enter name:ramya
enter id:92
enter branch:csse

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 1
enter name:sara
enter id:93
enter branch:it

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 2
enter bookid: 1
enter name of book =supernatural
author of the book =chuck
enter number of books of the id left: 2

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 2
enter bookid: 2
enter name of book =main kamof
author of the book =hitler
enter number of books of the id left: 10

 
 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 3
enter  your id: 592
enter right id

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 4
enter  your id:592
enter right id

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 3
enter  your id: 92
enter how many books do you need: 3
enter bookid: 1
books issued
enter bookid: 1
books issued
enter bookid: 1
error(no books of the id left)

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 6
enter  id:92
name  =ramya
id= 92.0
branch= csse
books that are taken =2
total books that can be issued =5
books that can be taken for issue =3

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 5
enter book id: 1
name of book =supernatural
id= 1
author of the book =chuck
number of books left=0

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 4
enter  your id:92
enter bookid: 1
enter how many days has it been since you have taken the book: 7
no fine
book returned

 1.create (student/faculty) account
 2.create an id for the book
 3.book issue
 4.return books
 5.display book details
 6.display (student/faculty) details
 7.exit
enter your choice: 7

C:\Users\Rayapati Nikhil\Desktop\c files\java>
*/		
						
						
				
			
			
