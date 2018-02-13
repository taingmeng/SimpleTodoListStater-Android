package com.taingmeng.simpletodolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class TodoViewHolder extends RecyclerView.ViewHolder {

    //1. Declare fields for your views

    private TodoListener mTodoListener;

    public TodoViewHolder(final View itemView, TodoListener todoListener) {
        super(itemView);

        //2. Find views and assign to the fields

        mTodoListener = todoListener;
    }

    public void bind(final Todo todo) {

        //3. Set todo title to the title TextView

        //4. Set click listener to the delete icon
    }

    public interface TodoListener {
        void onDelete(Todo todo);
    }
}
