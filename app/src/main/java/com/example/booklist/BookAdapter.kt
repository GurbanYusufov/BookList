package com.example.booklist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.booklist.databinding.RecyclerRowBinding
import retrofit2.Response

class BookAdapter(private val bList: List<Result>) :
    RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = bList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtAuthor.text=bList[position].author
        holder.binding.txtContent.text=bList[position].content
        holder.binding.txtLength.text=bList[position].length.toString()
    }

    class ViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)


}