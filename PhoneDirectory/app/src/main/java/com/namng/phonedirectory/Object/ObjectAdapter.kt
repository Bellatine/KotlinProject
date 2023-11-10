package com.namng.phonedirectory.Object

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.namng.phonedirectory.R

class ObjectAdapter(val context: Context, val items: ArrayList<ObjectModel>,val listener: OnItemClickListener? = null): RecyclerView.Adapter<ObjectAdapter.ItemViewHolder>() {
    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObjectAdapter.ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.`object`,parent,false)
        return ItemViewHolder(itemView,listener)
    }

    override fun onBindViewHolder(holder: ObjectAdapter.ItemViewHolder, position: Int) {
        holder.icon.setImageResource(items[position].imageThumb)
        holder.name.setText(items[position].name)
        holder.setItemClickListener {
            listener?.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    interface OnItemClickListener  {
        fun onItemClick(position: Int)
    }

    public class ItemViewHolder(val itemView: View, val listener: OnItemClickListener ?): RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val icon: ImageView

        init {
            icon = itemView.findViewById(R.id.icon)
            name = itemView.findViewById(R.id.name)
            itemView.setOnClickListener {
                listener?.onItemClick(adapterPosition)
            }
        }

        fun setItemClickListener(listener: View.OnClickListener?) {
            itemView.setOnClickListener(listener)

        }
    }


}