package ng.com.ajsprojects.startngkotlintask2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val arrayList = ArrayList<DataModel>()

        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image1))
        arrayList.add(DataModel("Escada Perfume", "This is the perfume description", R.drawable.image2))
        arrayList.add(DataModel("Levi's Jeans for Ladies", "This is the jeans description", R.drawable.image3))
        arrayList.add(DataModel("Adidas Yeezy Boost 700", "This is the shoe description", R.drawable.image4))
        arrayList.add(DataModel("H&M Joggers", "This is the joggers description", R.drawable.image5))
        arrayList.add(DataModel("Hugo Boss Perfume", "This is the perfume description", R.drawable.image6))
        arrayList.add(DataModel("Adidas Running Shoes ", "This is the shoes description", R.drawable.image7))
        arrayList.add(DataModel("Mens Harem Pants", "This is the pants description", R.drawable.image8))
        arrayList.add(DataModel("Denim Jacket", "This is the jacket description", R.drawable.image9))
        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image1))
        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image2))
        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image3))
        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image4))
        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image5))
        arrayList.add(DataModel("Calvin Klein Shirt", "This is the shirt description", R.drawable.image6))



        val recyclerAdapter = RecyclerAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recyclerAdapter


    }
}
