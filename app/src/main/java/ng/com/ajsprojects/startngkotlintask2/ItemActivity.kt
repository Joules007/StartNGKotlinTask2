package ng.com.ajsprojects.startngkotlintask2

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_item.*

class ItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        //getting data from putExtra
        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDescriptionTv = intent.getStringExtra("iDescription")
        val aImageView = intent.getIntExtra("iImageView", 0)

        // setting title in the ItemActivity
        actionBar.setTitle(aTitle)
        itemTitleTv.text = aTitle
        itemDescriptionTv.text = aDescriptionTv
        itemImage.setImageResource(aImageView)

    }
}
