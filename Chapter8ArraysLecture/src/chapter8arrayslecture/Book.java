/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8arrayslecture;

/**
 *
 * @author lee_c
 */
public class Book {

    private String title;
    private String author;
    private int pages;
    private double cost;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Book() {
        title="No title";
        author = "no one";
        pages = 0;
        cost = 0;
    }
    
     public Book(String title, String author, int pages, double cost) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.cost = cost;
    }

    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setters and Getters">
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

   //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pages=" + pages + ", cost=" + cost + '}';
    }
    //</editor-fold>
    
    
    
}
