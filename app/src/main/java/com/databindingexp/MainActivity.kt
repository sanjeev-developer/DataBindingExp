package com.databindingexp

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.databindingexp.databinding.ActivityMainBinding
import com.databindingexp.model.ApiResponse
import com.leaderboard.repo.ApiClient
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity()
{
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //bt_click.setOnClickListener(this@MainActivity)
    }

    override fun onResume() {
        super.onResume()
        apihit()
    }

    private fun apihit()
    {
        val call: Call<ApiResponse>? = ApiClient.getClient.fetchdata()
        call!!.enqueue(object : Callback<ApiResponse?> {
            @RequiresApi(api = Build.VERSION_CODES.O)
            override fun onResponse(call: Call<ApiResponse?>, response: Response<ApiResponse?>) {

                if (response.isSuccessful()) {

                  //  var dataget = response.body()?.jsondata?.let { ApiResponse(it) }
                  //  binding?.data = response.body()?.jsondata?.let { ApiResponse(it) }
                    binding?.data = response.body()

//                    if (dataget != null) {
//                        Toast.makeText(this@MainActivity, "data received" + dataget.jsondata!![0]?.name.toString(), Toast.LENGTH_SHORT).show()
//                    }
               }
            }


            override fun onFailure(call: Call<ApiResponse?>, t: Throwable) {
                call.cancel()
            }
        })
    }

   fun share(v : View)
    {
        Toast.makeText(this@MainActivity, "data received", Toast.LENGTH_SHORT).show()
    }
}
