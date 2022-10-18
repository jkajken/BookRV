package com.example.bookrv;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView bookName;
    private TextView authorName;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);

        bookName=itemView.findViewById(R.id.book_Name);
        authorName=itemView.findViewById(R.id.author_Name);

    }

    public void bind(String name, String author){
        bookName.setText(name);
        authorName.setText(author);
    }
}
