package com.satriauno.buik

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class BookAdapter(val listBook: ArrayList<DBook>) :
    RecyclerView.Adapter<BookAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): BookAdapter.GridViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.row_item, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listBook[position].photo)
            .apply(RequestOptions().override(350, 550))
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name_book)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_book)
        var tvCategory: TextView = itemView.findViewById(R.id.tv_category)
        var tvPage: TextView = itemView.findViewById(R.id.tv_page)
    }

}
