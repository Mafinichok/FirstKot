package com.example.firstkot


class inRashod(var summRas: Int, var kategor: String, var chislo: String){
    var summRass: Int = 0
        get() = 54
    fun dispplay(){
        println("Категория: $kategor, Дата: $chislo, Сумма рассхода: $summRas")
    }
}

fun main(){
    val Rashod1 = inRashod(200, "Abubus", "20.20.2077")
    //Rashod1.dispplay()
    val Rashod2 = inRashod(400, "Abubus", "20.20.2077")
    val Rashod3 = inRashod(400, "Chepuha", "20.20.2077")
    val SPISOK = spisok()
    SPISOK.addRashod(Rashod1)
    SPISOK.addRashod(Rashod2)
    SPISOK.addRashod(Rashod3)
    SPISOK.vuvod()
    SPISOK.podshet()
}
class spisok{
    val Spisok = mutableListOf<inRashod>()
    val SpisokKat = mutableListOf<String>()
    var sum = 0
    fun addRashod(Rashod: inRashod){
        Spisok.add(Rashod)
        if(SpisokKat.size != 0){
            var cringe: Boolean = false
            for(i in 0..SpisokKat.size - 1) {
                if (Rashod.kategor == SpisokKat[i]){
                    cringe = true
                    break
                }
            }
            if(cringe == false){
                SpisokKat.add(Rashod.kategor)
            }
        }
        else{
            SpisokKat.add(Rashod.kategor)
        }
    }
    fun vuvod(){
        for(i in 0..Spisok.size - 1){
            Spisok[i].dispplay()
        }
        for(i in 0..SpisokKat.size - 1){
            println(SpisokKat[i])
        }
    }
    fun podshet(){
        var aboba = 0
        aboba = SpisokKat.size
        sum = 0
        for(i in 0..SpisokKat.size - 1){
            sum = 0
            for(i2 in 0..Spisok.size - 1){
                if(Spisok[i2].kategor == SpisokKat[i]){
                    this.sum = Spisok[i2].summRas + sum
                }
            }
            println(sum)
        }
    }
}