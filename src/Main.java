class Library_item {
    private int id;
    private String title;
    private int year;

    public int getId(int id){
        return this.id=id;
    }
    public int getYear(int year){
        return this.year=year;
    }

    public String getTitle(String title)
    {
        return this.title=title;
    }
    public void setId(){
        System.out.println(id);
    }

}
class Book extends Library_item
{
    String Author;
    public void Author(int id,String title,int year ,String Author)
    {
        System.out.println(super.getId(id) +" "+ super.getTitle(title)+" "+super.getYear(year)+" "+ Author);
    }

}
class Magazine extends Library_item
{
    int issue;
    public void Issue(int id,String title,int year ,int issue)
    {
        System.out.println(super.getId(id) +" "+ super.getTitle(title)+" "+super.getYear(year)+" "+ issue);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Book MyBook = new Book();
        MyBook.Author(001,"Alchemist",2020,"  Japanese Legend");

        Magazine MyMagazine = new Magazine();
        MyMagazine.Issue(002,"Last end",2007,22);

        MyBook.setId();
        MyMagazine.setId();
    }
}