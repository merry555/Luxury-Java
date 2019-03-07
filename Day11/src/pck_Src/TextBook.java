package pck_Src;

public class TextBook extends Book{

	String subject;
	
	public TextBook(String name, String subject, String publisher){
		super(name, publisher);
		this.subject = subject;
	}
}
