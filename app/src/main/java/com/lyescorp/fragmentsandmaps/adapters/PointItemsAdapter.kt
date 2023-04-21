package com.lyescorp.fragmentsandmaps.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.lyescorp.fragmentsandmaps.R
import com.lyescorp.fragmentsandmaps.databinding.PointingItemBinding
import com.lyescorp.fragmentsandmaps.models.Point

class PointItemsAdapter (var points: List<Point> = emptyList(),
                        private val context: Context,
                        private val onItemClicked: (Point) -> Unit,
                        private val onDeleteClicked: (Point) -> Unit,
   ) :
        RecyclerView.Adapter<PointItemsAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.pointing_item, parent, false), context)
        }


        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val pointsp = points[position]
            holder.bind(pointsp)
            val cont = holder.itemView.context
            // para capturar al imagen de borrar
            val binding = PointingItemBinding.bind(holder.itemView)
            holder.itemView.setOnClickListener{
                onItemClicked(pointsp)
            }

        }



        override fun getItemCount(): Int = points.size

        class ViewHolder(val view: View, val mContext: Context) : RecyclerView.ViewHolder(view) {

            private val binding = PointingItemBinding.bind(view)

            fun bind(point: Point) {


            }
        }


}