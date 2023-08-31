/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Book {
    public String title;
    public int pages;
    public int publication;
    public String fullBook;
    
    public Book(String fullTitle, int NumberPages, int publicationYear){
        this.title = fullTitle;
        this.pages = NumberPages;
        this.publication = publicationYear;
    }
    
    public String returnFullBook(){
        this.fullBook = this.title + ", " + this.pages + " pages," + this.publication;
        return fullBook;
    }
    
}
