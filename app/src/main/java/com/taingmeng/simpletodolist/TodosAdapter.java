package com.taingmeng.simpletodolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taingmeng.simpletodolist.TodoViewHolder.TodoListener;

import java.util.ArrayList;
import java.util.List;

public class TodosAdapter extends RecyclerView.Adapter<TodoViewHolder> implements TodoListener {

    private List<Todo> mTodoList = new ArrayList<>();

    @Override
    public TodoViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_todo, parent, false);
        return new TodoViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(final TodoViewHolder holder, final int position) {
        Todo todo = mTodoList.get(position);
        holder.bind(todo);
    }

    @Override
    public int getItemCount() {
        return mTodoList.size();
    }

    @Override
    public void onDelete(final Todo todo) {
        mTodoList.remove(todo);
        notifyDataSetChanged();
    }

    public void add(final Todo todo) {
        mTodoList.add(todo);
        notifyDataSetChanged();
    }
}
