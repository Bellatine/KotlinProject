package com.namng.phonedirectory

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView.AdapterContextMenuInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.namng.phonedirectory.Object.ObjectAdapter
import com.namng.phonedirectory.Object.ObjectModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = arrayOf(
            "A Nam",
            "Bac Nam",
            "Chu Nam",
            "Di Nam",
            "Em Nam",
            "Giang Nam",
            "Ha Nam",
            "IT-E6 05 Nam",
            "K65 Nam",
            "Lam",
            "Mo Nam",
            "Nam",
            "Ong Nam",
            "P Nam",
            "Q Nam",
            "S Nam",
            "Thim Nam",
            "Viet Nam",
            "X Nam"
        )
        val emails = arrayListOf<String>()
        val phoneNumbers = arrayListOf<String>()
        val objects = arrayListOf<ObjectModel>()
        repeat(19){
            val email = names[it].replace(' ','.')
            val index = it%10
            val alphabet = names[it].first().toLowerCase()
            var iconname: String
            if(alphabet == 'd' || alphabet == 't' || !alphabet.isLowerCase()){
                 iconname = "alphabet"
            }else{
                 iconname = "alphabet_$alphabet"
            }
            objects.add(ObjectModel(it,names[it],"$email@sis.hust.edu.vn","0$index$index$index$index$index$index$index$index$index",resources.getIdentifier(iconname, "drawable", packageName)))
        }
        val objectAdapter = ObjectAdapter(this, objects, object : ObjectAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, DetailObject::class.java)
                intent.putExtra("ID",objects[position].ID)
                intent.putExtra("name",objects[position].name)
                intent.putExtra("email",objects[position].email)
                intent.putExtra("phone_num",objects[position].phoneNumber)
                intent.putExtra("image_thumb",objects[position].imageThumb)
                Log.v("TAG", objects[position].LogObject())
                startActivity(intent)
            }
        })
        val detailObject = findViewById<RecyclerView>(R.id.recyclerView)
        detailObject.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        detailObject.adapter = objectAdapter
        registerForContextMenu(detailObject)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.main_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val position = (item.menuInfo as AdapterContextMenuInfo).position
        if(item.itemId == R.id.action_add){
            Log.v("TAG", "Add new menu")
        }else if(item.itemId == R.id.action_delete){
            Log.v("TAG", "Delete")
        }else if(item.itemId == R.id.share){
            Log.v("TAG", "Share")
        }else if(item.itemId == R.id.action_setting){
            Log.v("TAG", "Setting")
        }else if(item.itemId == R.id.manage){
            Log.v("TAG", "Manage")
        }else if(item.itemId == R.id.help){
            Log.v("TAG", "Help")
        }

        return super.onContextItemSelected(item)
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val inflater: MenuInflater = menuInflater
//        inflater.inflate(R.menu.main_menu,menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if(item.itemId == R.id.action_add){
//            Log.v("TAG", "Add new menu")
//        }else if(item.itemId == R.id.action_delete){
//            Log.v("TAG", "Delete")
//        }else if(item.itemId == R.id.share){
//            Log.v("TAG", "Share")
//        }else if(item.itemId == R.id.action_setting){
//            Log.v("TAG", "Setting")
//        }else if(item.itemId == R.id.manage){
//            Log.v("TAG", "Manage")
//        }else if(item.itemId == R.id.help){
//            Log.v("TAG", "Help")
//        }
//        return super.onOptionsItemSelected(item)
//    }
}