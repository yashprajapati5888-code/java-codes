package encapsulation.encapsultwo;

public class BookStatus {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setTitle("Wings of Fire");
        obj.setAuthor("Dr. APJ Abdul Kalam");

        System.out.println("Book:"+ obj.getTitle() +"By:"+ obj.getAuthor());
    }
}
