package com.example.bookrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView bookrv;
    private ArrayList<String> bookName = new ArrayList<>();
    private ArrayList<String> authorName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookrv = findViewById(R.id.book_rv);
        bookrv.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        bookrv.setLayoutManager(staggeredGridLayoutManager);
        bookName.add("1984");
        authorName.add("George Orwell");
        bookName.add("Pride and Prejudice");
        authorName.add("Jane Austen");
        bookName.add("One Hundred Years of Solitude");
        authorName.add("Gabriel Garsia Marquez");
        bookName.add("The Book Thief");
        authorName.add("Markus Zusak");
        bookName.add("The Hitchhiker`s  Guide to the Galaxy");
        authorName.add("Douglas Adams");
        bookName.add("The Hunger Games");
        authorName.add("Suzanne Collins");
        bookName.add("The Theory of Evrything");
        authorName.add("Dr Stephen Hawking");
        bookName.add("Idiot");
        authorName.add("Dostoyevskiy");

        //same list part2

        bookName.add("1984");
        authorName.add("George Orwell");
        bookName.add("Pride and Prejudice");
        authorName.add("Jane Austen");
        bookName.add("One Hundred Years of Solitude");
        authorName.add("Gabriel Garsia Marquez");
        bookName.add("The Book Thief");
        authorName.add("Markus Zusak");
        bookName.add("The Hitchhiker`s  Guide to the Galaxy");
        authorName.add("Douglas Adams");
        bookName.add("The Hunger Games");
        authorName.add("Suzanne Collins");
        bookName.add("The Theory of Evrything");
        authorName.add("Dr Stephen Hawking");
        bookName.add("Idiot");
        authorName.add("Dostoyevskiy");

        //same list part3

        bookName.add("1984");
        authorName.add("George Orwell");
        bookName.add("Pride and Prejudice");
        authorName.add("Jane Austen");
        bookName.add("One Hundred Years of Solitude");
        authorName.add("Gabriel Garsia Marquez");
        bookName.add("The Book Thief");
        authorName.add("Markus Zusak");
        bookName.add("The Hitchhiker`s  Guide to the Galaxy");
        authorName.add("Douglas Adams");
        bookName.add("The Hunger Games");
        authorName.add("Suzanne Collins");
        bookName.add("The Theory of Evrything");
        authorName.add("Dr Stephen Hawking");
        bookName.add("Idiot");
        authorName.add("Dostoyevskiy");

        //same list part 4

        bookName.add("1984");
        authorName.add("George Orwell");
        bookName.add("Pride and Prejudice");
        authorName.add("Jane Austen");
        bookName.add("One Hundred Years of Solitude");
        authorName.add("Gabriel Garsia Marquez");
        bookName.add("The Book Thief");
        authorName.add("Markus Zusak");
        bookName.add("The Hitchhiker`s  Guide to the Galaxy");
        authorName.add("Douglas Adams");
        bookName.add("The Hunger Games");
        authorName.add("Suzanne Collins");
        bookName.add("The Theory of Evrything");
        authorName.add("Dr Stephen Hawking");
        bookName.add("Idiot");
        authorName.add("Dostoyevskiy");



        BookAdapter adapter = new BookAdapter(bookName, authorName);

        bookrv.setAdapter(adapter);


    }
}