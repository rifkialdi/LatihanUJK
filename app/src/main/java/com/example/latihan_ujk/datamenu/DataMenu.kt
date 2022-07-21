package com.example.latihan_ujk.datamenu

import com.example.latihan_ujk.model.ItemKategori

object DataMenu {
    val dataMakananImage = arrayListOf<String>(
        "https://upload.wikimedia.org/wikipedia/commons/a/a4/Pizza.jpg",
        "https://cdn-cas.orami.co.id/parenting/original_images/ayam_pedas_korea.jpg",
        "https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-bakar-madu-pedas.jpg",
        "https://thumbs.dreamstime.com/b/spaghetti-bolognese-black-serving-platter-fresh-basil-parmesan-44237816.jpg",
        "https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-goreng-1200x720.jpg",
        "https://img-global.cpcdn.com/recipes/3df4b7a9cecaf11d/680x482cq70/sate-kelinci-bumbu-kacang-foto-resep-utama.jpg"
    )

    val dataMakananNama = arrayListOf<String>(
        "Pizza",
        "Ayam Korea",
        "Ayam Madu Bakar",
        "Spagetti",
        "Ayam Goreng",
        "Sate Kelinci"
    )

    val dataMakananDeskripsi = arrayListOf<String>(
        "Pizza dengan topping pilihan dan gurih",
        "Ayam khas korea yang di bakar dan di beri bumbu",
        "Ayam madu yang di bakar dan di beri rempah - rempah",
        "Spagetti lembut dan enak dengan kaldu",
        "Ayam goreng garing gurih dan krispi",
        "Sate kelinci dengan bumbu pilihan"
    )

    val dataMakananHarga = arrayListOf<String>(
        "50000",
        "30000",
        "35000",
        "29000",
        "25000",
        "45000"
    )

    val dataMakanan: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in dataMakananNama.indices) {
            list.add(ItemKategori(dataMakananImage[item], dataMakananNama[item], dataMakananDeskripsi[item], dataMakananHarga[item]))
        }
        return list
    }

    val dataMinumanImage = arrayListOf<String>(
        "https://cdn.pixabay.com/photo/2016/11/29/01/11/beverages-1866476_960_720.jpg",
        "https://i.pinimg.com/736x/a1/de/02/a1de02eafda098004bb2ee1073635145.jpg",
        "https://www.rukita.co/stories/wp-content/uploads/2019/12/resep-minuman-segar.-jpg.jpg",
        "https://www.jagel.id/api/listimage/v/Es-Boba-0-334610b4c01cf39a.jpg",
        "https://media-cdn.tripadvisor.com/media/photo-s/16/88/29/ef/jus-alpukat.jpg",
        "https://dl.kaskus.id/www.templeofthai.com/images/recipes/xthaitea.jpg.pagespeed.ic.9mC5d3NI3c.jpg"
    )

    val dataMinumanNama = arrayListOf<String>(
        "Tea",
        "Capcin",
        "Lemon",
        "Thaitea",
        "Alpukat",
        "RedMilk"
    )

    val dataMinumanDeskripsi = arrayListOf<String>(
        "Teh manis",
        "Capucino dengan cincau segar",
        "Minuman jus lemon yang segar",
        "Thaitea manis nikmat",
        "Jus alpukan dengan buah segar",
        "RedMilk yang smooth di mulut"
    )

    val dataMinumanHarga = arrayListOf<String>(
        "5000",
        "6000",
        "7000",
        "8000",
        "10000",
        "9000"
    )

    val dataMinuman: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in dataMinumanNama.indices) {
            list.add(ItemKategori(dataMinumanImage[item], dataMinumanNama[item], dataMinumanDeskripsi[item], dataMinumanHarga[item]))
        }
        return list
    }

    val dataDessertImage = arrayListOf<String>(
        "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552__340.jpg",
        "https://asset.kompas.com/crops/njbQ9wV94htOpofcxAPBH9SePok=/0x0:751x501/750x500/data/photo/2020/07/17/5f10ecfcc96bd.jpg",
        "https://png.pngtree.com/png-clipart/20190515/original/pngtree-mini-macarons-or-macaroons-with-colorful-sweets-foods-french-sweetmeat-french-png-image_3693073.jpg",
        "https://caramembuat.id/wp-content/uploads/2022/06/Cara-Membuat-Dessert-Box-Coklat-Mewah.jpg",
        "https://images.squarespace-cdn.com/content/v1/5dd5b5e9f226644911c4d733/1582303096724-NLWKXFDSN6B9FOFMTKLN/tiramisu-2897900_1280.jpg",
        "https://magnate.id/wp-content/uploads/2022/02/Bisnis-Dessert-Box-930x620.jpg"
    )

    val dataDessertNama = arrayListOf<String>(
        "Coffe vanila cake",
        "Vanila latte",
        "Maccaron",
        "Choco",
        "Tiramisu cake",
        "Redvelvet vanila"
    )

    val dataDessertDeskripsi = arrayListOf<String>(
        "Kue dengan topping coffe dan vanila",
        "Dengan paduan rasa vanila latte",
        "Gurih dan manin di mulut",
        "Dengan coklat asli pilihan",
        "Tiramisu nikmat dan manis",
        "Dengan paduan redvelvet vanila"
    )

    val dataDessertHarga = arrayListOf<String>(
        "30000",
        "35000",
        "20000",
        "45000",
        "40000",
        "38000"
    )

    val dataDessert: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in dataDessertNama.indices) {
            list.add(ItemKategori(dataDessertImage[item], dataDessertNama[item], dataDessertDeskripsi[item], dataDessertHarga[item]))
        }
        return list
    }
}