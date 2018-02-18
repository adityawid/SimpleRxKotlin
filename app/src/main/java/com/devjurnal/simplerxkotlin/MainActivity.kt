package com.devjurnal.simplerxkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Single

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO (1) add gradle
        // Todo (2) Observable Rx
        Observable.fromArray("Adit", "arif", "nando")
                .filter { data -> data.contains("nando") }
                .subscribe {
                    // data = nama variabel
                    data ->
                    Log.d("data :" , data.toString())
                }


        // Sample 2
        Flowable.just(11,23,42,53,55)
                .map { t -> t.toDouble()   }    // Konversi data dari int ke tipedata lain
                .filter { t: Double ->  t< 40 }   // filter data
                .subscribe {
                    t: Double? ->
                    Log.d("data sample 2 :" , t.toString())
                }
        
    }
}
