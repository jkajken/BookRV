package com.example.bookrv;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private ArrayList<String> namelist,authorlist ;

    public BookAdapter(ArrayList<String> namelist, ArrayList<String> authorlist) {
        this.namelist = namelist;
        this.authorlist = authorlist;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.bind(namelist.get(position),authorlist.get(position));

    }

    @Override
    public int getItemCount() {
        return namelist.size();
    }
}
