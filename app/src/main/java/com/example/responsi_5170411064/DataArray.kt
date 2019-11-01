package com.example.responsi_5170411064

object DataArray {
    private val languages = listOf("Github","LinkedIn","Skype","Tumblr",
        "Twitter","Termometer", "Monitor", "Kamera", "Pulpen")

    val desk = listOf(
        "Github adalah...",
        "LinkerId adalah...",
        "Skype adalah...",
        "Tumblr adalah...",
        "Twitter adalah...",
        "Termometer adalah...",
        "Monitor adalah...",
        "Kamera adalah...",
        "Pulpen adalah..."
        )

    private val pictDat = intArrayOf(
        R.drawable.github,
        R.drawable.linkedin,
        R.drawable.skype,
        R.drawable.tumblr,
        R.drawable.twitter,
        R.drawable.termometer,
        R.drawable.monitor,
        R.drawable.kamera,
        R.drawable.pulpen
    )

    val listData : ArrayList<AturArray>
        get() {
            val list = arrayListOf<AturArray>()
            for (position in languages.indices){
                val listDat = AturArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}