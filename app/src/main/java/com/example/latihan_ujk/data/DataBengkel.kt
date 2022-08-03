package com.example.latihan_ujk.data

import com.example.latihan_ujk.model.ItemKategori

object DataBengkel {
    val motorImage = arrayListOf<String>(
        "https://imgx.gridoto.com/crop/56x0:1231x720/700x465/filters:watermark(file/2017/gridoto/img/watermark_otomania.png,5,5,60)/photo/2019/11/01/1300273336.jpeg",
        "https://d2fgf7u961ce77.cloudfront.net/uploads/news/handle_rem.jpg",
        "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2020/6/23/90ef9060-d050-4abb-9c9d-d3be2b497d18.jpg",
        "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//96/MTA-6690821/mtr_mtr_minyak_rem_motor_dot_3_merah_50ml_-dijamin_asli-_full02_m0r5haq1.jpg",
        "https://www.astramotor.co.id/wp-content/uploads/2020/05/jok-motor.jpg",
        "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2021/11/9/61d9c8bd-37e0-438e-969f-c2ff9bd69484.jpg"
    )

    val motorItem = arrayListOf<String>(
        "Gear motor",
        "Handle rem",
        "Piring rem",
        "Oli rem",
        "Jok motor",
        "Lampu sein"
    )

    val motorDeskripsi = arrayListOf<String>(
        "Gear merk sss, tangguh dan tahan lama",
        "Handle rem merk bion untuk motor bebek",
        "Piring rem merk spee",
        "Oli rem merk supa",
        "Jok motor merk zxz",
        "Lampu sein 30w"
    )

    val motorHarga = arrayListOf<String>(
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
        for (item in motorImage.indices) {
            list.add(ItemKategori(motorImage[item], motorItem[item], motorDeskripsi[item], motorHarga[item]))
        }
        return list
    }

    val mobilImage = arrayListOf<String>(
        "https://cms-revamp.daihatsu.co.id/uploads/tipsandtrick/1605969623884.jpeg",
        "https://imgx.gridoto.com/crop/0x0:0x0/700x465/filters:watermark(file/2017/gridoto/img/watermark.png,5,5,60)/photo/2021/02/27/img_1571jpg-20210227013450.jpg",
        "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full/MTA-1967271/pertamina_pertamina-prima-xp-20w-50-pelumas-oli-mobil--4-liter-_full03.jpg",
        "https://s3-id-jkt-1.kilatstorage.id/fastnlow/2018/10/3-Ciri-Ciri-Menandakan-Lampu-Sein-Mobil-Anda-Rusak-3-880x495.jpg",
        "https://img.okezone.com/content/2016/07/21/15/1443007/kelebihan-dan-kekurangan-tiga-jenis-wiper-mobil-NiP1B0DEIb.jpg",
        "https://images.tokopedia.net/img/cache/500-square/product-1/2020/3/28/281555311/281555311_7eed11ef-192b-4ba7-a6ac-eda3c6dfe4c5_700_700.jpg"
    )

    val mobilItem = arrayListOf<String>(
        "Ban mobil",
        "Pelk",
        "Oli mobil pertamina",
        "Sein mobil",
        "Wiper mobil",
        "jok mobil"
    )

    val mobilDeskripsi = arrayListOf<String>(
        "ban mobil merk bridgen",
        "pelk mobil merk super kuat dan tangguh",
        "oli merk pertamina untuk mobil > 1000cc",
        "sein mobil 30w",
        "wiper merk upper",
        "jok mobil dengan bahan kulit"
    )

    val mobilHarga = arrayListOf<String>(
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
        for (item in mobilImage.indices) {
            list.add(ItemKategori(mobilImage[item], mobilItem[item], mobilDeskripsi[item], mobilHarga[item]))
        }
        return list
    }

    val sepedaImage = arrayListOf<String>(
        "https://www.jakartanotebook.com/images/products/80/63/28833/2/ztto-handle-rem-sepeda-bike-brake-lever-aluminium-22.2-23.8mm-cbl-09-black-17.jpg",
        "https://ae01.alicdn.com/kf/HTB1cESYn21TBuNjy0Fjq6yjyXXas/Michelin-Race-R-29X2-1-Ban-Sepeda-27-5-29er-Ban-Sepeda-Gunung-MTB-26-2.jpg",
        "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2020/8/14/de7570c0-68f0-4280-8217-4e792e6a6d1c.jpg",
        "https://www.jakartanotebook.com/images/products/35/1020/46715/2/goofy-lampu-sepeda-led-usb-rechargeable-cree-t6-300-lumens-dengan-klakson-dt-6105c-black-1.jpg",
        "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2020/9/14/45bed798-c317-44a6-ae95-aca8e976cd22.jpg",
        "https://1.bp.blogspot.com/-risv1zmP0L4/V9KcbNmmAEI/AAAAAAAAAks/fKaGyTuBYtQiC3UuyBGnvbkh84fqVIi8wCLcB/s1600/GUB-alloy-mountain-bike-frame-26er-MTB-bicycle-frame-size-17-GUB800-EMS-free-shipping.jpg"
    )

    val sepedaItem = arrayListOf<String>(
        "Handle sepeda",
        "Ban sepeda",
        "Jok sepeda",
        "Senter sepeda",
        "Grip sepeda",
        "body"
    )

    val sepedaDeskripsi = arrayListOf<String>(
        "Handle merk maxxis",
        "Ban sepedah merk bridgestone yang tangguh",
        "Jok sepedah awet",
        "senter 40w",
        "grip empuh dan lembut",
        "kokoh dan kuat"
    )

    val sepedaHarga = arrayListOf<String>(
        "30000",
        "35000",
        "20000",
        "45000",
        "40000",
        "120000"
    )

    val dataDessert: ArrayList<ItemKategori>
    get() {
        val list = arrayListOf<ItemKategori>()
        for (item in sepedaImage.indices) {
            list.add(ItemKategori(sepedaImage[item], sepedaItem[item], sepedaDeskripsi[item], sepedaHarga[item]))
        }
        return list
    }
}