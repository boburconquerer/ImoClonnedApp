package com.example.oneandtwointermediate.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.oneandtwointermediate.MainActivity2
import com.example.oneandtwointermediate.Model.Model
import com.example.oneandtwointermediate.R
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var context:Context,var list: ArrayList<Model>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model: Model = list[position]
        if (holder is ChatViewHolder) {
            holder.image.setImageResource(model.image)
            holder.name.text = model.name
            holder.text.text = model.text
            holder.time.text = model.time
            holder.count.text = model.count.toString()

            holder.clickable.setOnClickListener {
                val intent = Intent(context,MainActivity2::class.java)
                context.startActivity(intent)
            }


            if (model.count > 0) {
                holder.linearLayout.visibility = View.VISIBLE
            } else {
                holder.linearLayout.visibility = View.GONE
            }

            if (model.count > 9) {
                //   holder.count.visibility = View.GONE
                holder.count.text = "..${model.count}"
            }
        }


    }

    inner class ChatViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ShapeableImageView = view.findViewById(R.id.image)
        var name: TextView = view.findViewById(R.id.name)
        var text: TextView = view.findViewById(R.id.text)
        var time: TextView = view.findViewById(R.id.time)
        var count: TextView = view.findViewById(R.id.count)
        var linearLayout: LinearLayout = view.findViewById(R.id.linearLayout)
        var clickable: LinearLayout = view.findViewById(R.id.clickable)
    }


}