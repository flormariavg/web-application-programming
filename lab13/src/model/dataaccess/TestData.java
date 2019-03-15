package model.dataaccess;

import edu.mum.wap.model.CartLine;
import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;

public class TestData {

	//Books inventory
	Item item= new Item("book1", "Science Fiction", 10, 2, true);
	Item item2= new Item("book2", "Technology", 10, 2, true);
	Item item3= new Item("book3", "Stories", 10, 2, true);
	Item item4= new Item("book4", "Health", 10, 2, true);
	
	//Books I want to buy
	Product p1 = new Product(item,1);
	Product p2 = new Product(item2,2);
	Product p3 = new Product(item3,4);
	
	//my CartLine

	
	
	
//	products.add(item);
//	products.add(item2);
//	products.add(item3);
//	products.add(item4);
//	
//	
//	products.add(item);
//	products.add(item2);
//	products.add(item3);
//	products.add(item4);
	
//	@SuppressWarnings("serial")
//	public List<Author> allAuthors = new ArrayList<Author>() {
//		{
//			add(new Author("Joe", "Thomas", "641-445-2123", addresses.get(0), "A happy man is he."));
//			add(new Author("Sandra", "Thomas", "641-445-2123", addresses.get(0), "A happy wife is she."));
//			add(new Author("Nirmal", "Pugh", "641-919-3223", addresses.get(1), "Thinker of thoughts."));
//			add(new Author("Andrew", "Cleveland", "976-445-2232", addresses.get(2), "Author of childrens' books."));
//			add(new Author("Sarah", "Connor", "123-422-2663", addresses.get(3), "Known for her clever style."));
//		}
//		
//	};

//	@SuppressWarnings("serial")
//	List<Book> allBooks = new ArrayList<Book>() {
//		{
//			add(new Book("23-11451", "The Big Fish", 21, Arrays.asList(allAuthors.get(0), allAuthors.get(1))));
//			add(new Book("28-12331", "Antartica", 7, Arrays.asList(allAuthors.get(2))));
//			add(new Book("99-22223", "Thinking Java", 21, Arrays.asList(allAuthors.get(3))));
//			add(new Book("48-56882", "Jimmy's First Day of School", 7, Arrays.asList(allAuthors.get(4))));
//
//		}
//	};
//
//	@SuppressWarnings("serial")
//	List<User> allUsers = new ArrayList<User>() {
//		{
//			add(new User("vsebastianvc", "123", Auth.LIBRARIAN, new Person("Andres", "Panamito", "0986036701",addresses.get(4))));
//			add(new User("chernandez", "123", Auth.ADMIN,new Person("Sebastian", "Valencia", "3203387287",addresses.get(1))));
//			add(new User("panamito", "123", Auth.BOTH, new Person("Carlos", "Hernandez", "3004633523",addresses.get(5))));
//		}
//	};
//
//	public static void main(String[] args) {
//		TestData td = new TestData();
//		td.bookData();
//		td.libraryMemberData();
//		td.userData();
//		td.authorData();
//		DataAccess da = new DataAccessFacade();
//		System.out.println(da.readBooksMap());
//		System.out.println(da.readUserMap());
//		System.out.println(da.readAuthorMap());
//	}
//
//	/// create books
//	public void bookData() {
//		allBooks.get(0).addCopy();
//		allBooks.get(0).addCopy();
//		allBooks.get(1).addCopy();
//		allBooks.get(3).addCopy();
//		allBooks.get(2).addCopy();
//		allBooks.get(2).addCopy();
//		DataAccessFacade.loadBookMap(allBooks);
//	}
//
//	public void userData() {
//		DataAccessFacade.loadUserMap(allUsers);
//	}
//	public void authorData() {
//		DataAccessFacade.loadAuthorMap(allAuthors);
//	}
//
//	// create library members
//
//	public void libraryMemberData() {
//		LibraryMember libraryMember = new LibraryMember("1001", "Andy", "Rogers", "641-223-2211", addresses.get(4));
//		members.add(libraryMember);
//		libraryMember = new LibraryMember("1002", "Drew", "Stevens", "702-998-2414", addresses.get(5));
//		members.add(libraryMember);
//
//		libraryMember = new LibraryMember("1003", "Sarah", "Eagleton", "451-234-8811", addresses.get(6));
//		members.add(libraryMember);
//
//		libraryMember = new LibraryMember("1004", "Ricardo", "Montalbahn", "641-472-2871", addresses.get(7));
//		members.add(libraryMember);
//
//		DataAccessFacade.loadMemberMap(members);
//
//	}

}

