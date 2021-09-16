package com.example.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList= mutableListOf(
            Todo("one",false),
            Todo("two",true),
            Todo("three",true),
            Todo("four",false),
            Todo("five",true),
            Todo("six",false),
            Todo("seven",true),
            Todo("eight",false),
            Todo("nine",true),
            Todo("ten",false),
            Todo("eleven",true),
        )
        val adapter=TodoAdapter(todoList)
        rvtodo.adapter=adapter
        rvtodo.layoutManager=LinearLayoutManager(this)

        buttonTodo.setOnClickListener{
            val title=addTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}