package com.example.datafilm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {

    val list = arrayListOf(
        DataFilm(R.drawable.spiderman, "Spiderman", 21),
        DataFilm(R.drawable.upin_ipin, "Upin dan Ipin", 20),
        DataFilm(R.drawable.sopo_jarwo, "Sopo dan Jarwo", 25),
        DataFilm(R.drawable.tom_jerry, " Tom and Jerry", 29),
        DataFilm(R.drawable.spongebob, " Spongebob", 28)
    )

    val FilmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        FilmList.value = list
    }




}