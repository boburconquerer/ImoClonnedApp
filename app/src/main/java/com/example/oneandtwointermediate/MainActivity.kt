package com.example.oneandtwointermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oneandtwointermediate.Adapter.Adapter
import com.example.oneandtwointermediate.Model.Model

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshData(data())
    }

    private fun data(): ArrayList<Model> {
        val list = ArrayList<Model>()
        list.add(Model(R.drawable.carinanebula3, "One","Hi","12:05",2))
        list.add(Model(R.drawable.phoro, "Batman","Hi","12:03",1))
        list.add(Model(R.drawable.carinanebula3, "Zet","Hi","11:07",0))
        list.add(Model(R.drawable.istock, "Lukas","Hi","12:90",43))
        list.add(Model(R.drawable.carinanebula3, "One","Hi","12:05",2))
        list.add(Model(R.drawable.phoro, "Batman","Hi","12:03",1))
        list.add(Model(R.drawable.carinanebula3, "Zet","Hi","11:07",0))
        list.add(Model(R.drawable.istock, "Lukas","Hi","12:90",43))
        list.add(Model(R.drawable.carinanebula3, "One","Hi","12:05",2))
        list.add(Model(R.drawable.phoro, "Batman","Hi","12:03",1))
        list.add(Model(R.drawable.carinanebula3, "Zet","Hi","11:07",0))
        list.add(Model(R.drawable.istock, "Lukas","Hi","12:90",43))
        list.add(Model(R.drawable.carinanebula3, "One","Hi","12:05",2))
        list.add(Model(R.drawable.phoro, "Batman","Hi","12:03",1))
        list.add(Model(R.drawable.carinanebula3, "Zet","Hi","11:07",0))
        list.add(Model(R.drawable.istock, "Lukas","Hi","12:90",43))
        return list
    }


    private fun refreshData(data: ArrayList<Model>) {
        val adapter = Adapter(this,data)
        recyclerView.adapter = adapter
    }


}