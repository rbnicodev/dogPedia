package com.rbnico.dogpedia.data

object DataProvider {
    val dogList = listOf(
        Dog(
            "Balú",
            "Pastor Alemán",
            8,
            "https://images.dog.ceo/breeds/germanshepherd/n02106662_2058.jpg",
        ),
        Dog(
            "Duna",
            "Beagle",
            2,
            "https://images.dog.ceo/breeds/beagle/n02088364_17766.jpg"
        ),
        Dog(
            "Xsena",
            "Rottweiler",
            8,
            "https://images.dog.ceo/breeds/rottweiler/n02106550_2197.jpg"
        ),
        Dog(
            "Papi",
            "Mini",
            9,
            "https://images.dog.ceo/breeds/pinscher-miniature/n02107312_3426.jpg"
        ),
        Dog(
            "Sasha",
            "Husky",
            3,
            "https://images.dog.ceo/breeds/husky/n02110185_11580.jpg"
        ),
        Dog(
            "Akenay",
            "Husky",
            1,
            "https://images.dog.ceo/breeds/husky/n02110185_8564.jpg"
        ),
        Dog(
            "Paco",
            "Pug",
            2,
            "https://images.dog.ceo/breeds/pug/n02110958_11256.jpg"
        )

    )
    lateinit var dog: Dog
}