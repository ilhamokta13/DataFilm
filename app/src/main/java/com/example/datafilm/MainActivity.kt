package com.example.datafilm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datafilm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var FilmVm : FilmViewModel
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFilm()

        FilmVm = ViewModelProvider(this).get(FilmViewModel::class.java)
        FilmVm.getFilmList()

        FilmVm.FilmList.observe(this, Observer{
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })


    }

    fun initFilm(){
        filmAdapter = FilmAdapter(ArrayList())
        binding.rvFilm.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvFilm.adapter = filmAdapter
    }






}
