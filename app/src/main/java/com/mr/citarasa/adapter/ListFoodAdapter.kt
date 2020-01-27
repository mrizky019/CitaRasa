package com.mr.citarasa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mr.citarasa.R
import com.mr.citarasa.model.Food

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvFoodNames: TextView = itemView.findViewById(R.id.textViewFoodName)
        var tvFoodPlaces: TextView = itemView.findViewById(R.id.textViewFoodPlace)
        var tvFoodDescription: TextView = itemView.findViewById(R.id.textViewFoodDescription)
        var imgFood: ImageView = itemView.findViewById(R.id.imgItemPhoto)
        var btnFavorite: ImageButton = itemView.findViewById(R.id.btnSetFavorite)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_food, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]
        var count = 0

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgFood)

        holder.tvFoodNames.text = food.name
        holder.tvFoodPlaces.text = food.place
        holder.tvFoodDescription.text = food.description
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }
        holder.btnFavorite.setOnClickListener {
            count += 1
            if (count == 1) {
                holder.btnFavorite.setImageResource(R.drawable.ic_favorite_like_24dp)
                Toast.makeText(
                    holder.itemView.context,
                    "Favorite : " + listFood[holder.adapterPosition].name,
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                holder.btnFavorite.setImageResource(R.drawable.ic_favorite_border_unlike_24dp)
                count -= count
            }
        }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}
