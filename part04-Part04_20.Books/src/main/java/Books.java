/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
class Books {
    private String name;
    private int pages;
    private int publicationDate;
    
    public Books (String nameOfBook, int pagesOfBook, int publicationYear){
    
        this.name = nameOfBook;
        this.pages = pagesOfBook;
        this.publicationDate = publicationYear;
        
}
    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

        public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationDate;
    }
    
    
}
