package by.htp.library.bean;

public class Book implements Comparable<Book> {
	private int id;
	private String author;
	private String title;
	private String materialType;
	private int countOfPages;

	public Book(int id, String author, String title, String materialType, int countOfPages) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.materialType = materialType;
		this.countOfPages = countOfPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public int getCountOfPages() {
		return countOfPages;
	}

	public void setCountOfPages(int countOfPages) {
		this.countOfPages = countOfPages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", materialType=" + materialType
				+ ", countOfPages=" + countOfPages + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + countOfPages;
		result = prime * result + id;
		result = prime * result + ((materialType == null) ? 0 : materialType.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (countOfPages != other.countOfPages)
			return false;
		if (id != other.id)
			return false;
		if (materialType == null) {
			if (other.materialType != null)
				return false;
		} else if (!materialType.equals(other.materialType))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		return Integer.valueOf(this.countOfPages).compareTo(Integer.valueOf(o.countOfPages));

	}

}
