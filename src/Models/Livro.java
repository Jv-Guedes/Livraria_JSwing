/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Red-Dragon
 */
public class Livro {
    
    private String title;
    private String autor;
    private String vender;
    private int year;
    private boolean isRead;

    public Livro(String title, String autor, String vender, int year, boolean isRead) {
        this.title = title;
        this.autor = autor;
        this.vender = vender;
        this.year = year;
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public String getVender() {
        return vender;
    }

    public int getYear() {
        return year;
    }

    public boolean isIsRead() {
        return isRead;
    }
    
    
    
    
    
}
