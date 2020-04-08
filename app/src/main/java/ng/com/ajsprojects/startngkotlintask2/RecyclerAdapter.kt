package ng.com.ajsprojects.startngkotlintask2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class RecyclerAdapter(val arrayList: ArrayList<DataModel>, val context: Context) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(dataModel: DataModel){
            itemView.titleTv.text = dataModel.title
            itemView.descriptionTv.text = dataModel.des
            itemView.image.setImageResource(dataModel.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return  ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{
            if(position == 0){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
            if(position == 1){
                Toast.makeText(context, "You clicked over Escada Perfume", Toast.LENGTH_LONG).show()
            }
            if(position == 2){
                Toast.makeText(context, "You clicked over Levi's Jeans for Ladies", Toast.LENGTH_LONG).show()
            }
            if(position == 3){
                Toast.makeText(context, "You clicked over Adidas Yeezy Boost 700 Wave Runner", Toast.LENGTH_LONG).show()
            }
            if(position == 4){
                Toast.makeText(context, "You clicked over H&M Joggers", Toast.LENGTH_LONG).show()
            }
            if(position == 5){
                Toast.makeText(context, "You clicked over Hugo Boss Perfume", Toast.LENGTH_LONG).show()
            }
            if(position == 6){
                Toast.makeText(context, "You clicked over Adidas Running Shoes", Toast.LENGTH_LONG).show()
            }
            if(position == 7){
                Toast.makeText(context, "You clicked over Mens Harem Pants", Toast.LENGTH_LONG).show()
            }
            if(position == 8){
                Toast.makeText(context, "You clicked over Denim Jacket", Toast.LENGTH_LONG).show()
            }
            if(position == 9){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
            if(position == 10){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
            if(position == 11){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
            if(position == 12){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
            if(position == 13){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
            if(position == 14){
                Toast.makeText(context, "You clicked over Calvin Klein Shirt", Toast.LENGTH_LONG).show()
            }
        }
    }
}