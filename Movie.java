public class Movie
{
   //fields
     private String name; //holds name of movie
     private String year; //holds year of movie
     private String genre; //holds genre of movie
     private int length; //holds length of movie
     private Movie next; //holds movie next
     private Movie previous; //holds movie previous
     
     //no-arg constructor
     public Movie()
     {
      name = "";
      year = "";
      genre = "";
      length = 0;
     }
     
     //Constructor
     public Movie(String name, String year, String genre, int length)
     {
      this.name = name;
      this.year = year;
      this.genre = genre;
      this.length = length;
     }
     
     //setters
     public void setName(String name)
     {
      this.name = name;
     }
     public void setYear(String year)
     {
      this.year = year;
     }
     public void setGenre(String genre)
     {
      this.genre = genre;
     }
     public void setLength(int length)
     {
      this.length = length;
     }
     public void setNext(Movie next)
     {
      this.next = next;
     }
     public void setPrevious(Movie previous)
     {
      this.previous = previous;
     }
     
     //getters
     public String getName()
     {
      return name;
     }
     public String getYear()
     {
      return year;
     }
     public String getGenre()
     {
      return genre;
     }
     public int getLength()
     {
      return length;
     }
     public Movie getNext()
     {
      return next;
     }
     public Movie getPrevious()
     {
      return previous;
     }
     
     public String toString()
     {
      return String.format("Name:" + this.name + "\nReleased Year:" + this.year + "\nGenre:" + this.genre + "\nLength:" + this.length);
     }




}
