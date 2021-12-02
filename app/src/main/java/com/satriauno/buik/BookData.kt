package com.satriauno.buik

object BookData {

    private val NameBook = arrayOf("Ini buku1",
    "buku2",
    "buku3",
    "buku5",
    "buku6")

    private val DataPage = arrayOf("1-2",
    "1-20",
    "1-45",
    "1-100",
    "1-120",
    "1-200")

    private val CategoryData = arrayOf("romance",
        "fantasy",
        "harem",
        "adult",
        "Action",
        "sad")

    private val DetailBook  = arrayOf("test",
    "test",
    "ini test oi")

    private val ImageBook = intArrayOf(
        R.drawable.anakrantau,
        R.drawable.ayah,
        R.drawable.kisahnabi,
        R.drawable.petabintang,
        R.drawable.rumahcahaya,
        R.drawable.senja,
    )

    val listData: ArrayList<DBook>
        get() {
            val list = arrayListOf<DBook>()
            for (position in NameBook.indices) {
                val book = DBook()
                book.category = CategoryData[position]
                book.name = NameBook[position]
                book.detail = DetailBook[position]
                book.page = DataPage[position]
                book.photo = ImageBook[position]
                list.add(book)

            }
            return list
        }


}



