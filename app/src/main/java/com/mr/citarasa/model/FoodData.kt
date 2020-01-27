package com.mr.citarasa.model

import com.mr.citarasa.R

object FoodData {
    private val foodNames = arrayOf(
        "Ayam Betutu",
        "Gado - Gado",
        "Gudeg",
        "Kerak Telor",
        "Nasi Liwet",
        "Papeda",
        "Pempek",
        "Nasi Rawon",
        "Rendang",
        "Soto Banjar"
    )

    private val foodPlaces = arrayOf(
        "Bali",
        "Jakarta",
        "Yogyakarta",
        "Jakarta",
        "Solo",
        "Papua",
        "Palembang",
        "Surabaya",
        "Padang",
        "Banjarmasin"
    )

    private val foodDescriptions = arrayOf(
        "Betutu adalah lauk yang terbuat dari ayam atau bebek yang utuh yang berisi bumbu, kemudian dipanggang dalam api sekam. Betutu ini telah dikenal di seluruh kabupaten di Bali. Betutu merupakan jenis makanan tradisional daerah Bali yang bahan mentahnya berupa karkas utuh itik dan ayam.",
        "Gado-gado adalah salah satu makanan yang berasal dari betawi yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk saus gado gado kentang rebus dimasak bersamaan dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng. Sedikit emping goreng atau kerupuk (ada juga yang memakai kerupuk udang) juga ditambahkan.",
        "Gudeg adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
        "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.",
        "Nasi liwet adalah makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa).",
        "Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya disajikan dengan ikan tongkol atau mubara yang dibumbui dengan kunyit. Papeda berwarna putih dan bertekstur lengket menyerupai lem dengan rasa yang tawar. Papeda merupakan makanan yang kaya serat, rendah kolesterol dan cukup bernutrisi.",
        "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari daging ikan yang digiling lembut dan tepung kanji, serta beberapa komposisi lain seperti telur, bawang putih yang dihaluskan, penyedap rasa dan garam. Sebenarnya sulit untuk mengatakan bahwa penganan pempek pusatnya adalah di Palembang karena hampir semua daerah di Sumatera Selatan memproduksinya.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur daerah Surakarta Daging untuk rawon umumnya adalah daging sapi yang dipotong kecil-kecil, utamanya adalah bagian sandung lamur. Bumbu supnya sangat khas Indonesia, yaitu campuran bawang merah, bawang putih, lengkuas (laos), ketumbar, kemiri, serai, kunir, cabai, kluwek, garam, serta minyak nabati.",
        "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak.",
        "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih. Ada kalanya pembuatan kuah soto banjar dapat dicampurkan dengan sedikit susu yang membuat warna kuahnya mejadi tidak bening, tetapi sedikit keruh. Soto ini berisi daging ayam yang sudah disuwir-suwir, dengan tambahan perkedel, kentang rebus, rebusan telur, potongan wortel dan ketupat."
    )

    private val foodImages = intArrayOf(
        R.drawable.img_ayam_betutu,
        R.drawable.img_gado_gado,
        R.drawable.img_gudeg,
        R.drawable.img_kerak_telor,
        R.drawable.img_nasi_liwet,
        R.drawable.img_papeda,
        R.drawable.img_pempek,
        R.drawable.img_rawon,
        R.drawable.img_rendang,
        R.drawable.img_soto_banjar
    )

    private val foodCalories = arrayOf(
        "415 kkal",
        "132 kkal",
        "127 kkal",
        "107 kkal",
        "232 kkal",
        "354 kkal",
        "39 kkal",
        "119 kkal",
        "195 kkal",
        "436 kkal"
    )

    private val foodFat = arrayOf(
        "35,6 g",
        "7,41 g",
        "4,71 g",
        "14 g",
        "12 g",
        "0,05 g",
        "1,04 g",
        "7,4 g",
        "11,07 g",
        "24,9 g"
    )

    private val foodCarb = arrayOf(
        "15,3 g",
        "10,9 g",
        "22,54 g",
        "22 g",
        "28 g",
        "87,55 g",
        "4,72 g",
        "3,48 g",
        "4,49 g",
        "44,2 g"
    )

    private val foodProtein = arrayOf(
        "22,9 g",
        "7,14 g",
        "1,82 g",
        "17,1 g",
        "3 g",
        "0,42 g",
        "2,52 g",
        "9,6 g",
        "19,68 g",
        "16"
    )

    private val foodRecipe = arrayOf(
        "1. Ulek bumbu, rajang bumbu lalu tumis hingga harum\n" + "2. Masukan ayam, beri air rebus bumbui garam dan gula.\n" + "3. Ungkep dengan api kecil hingga lunak dan kuah asat.",
        "1. Uleg semua bumbu (halus/kasar tergantung selera) siram dengan air asam jawa secukupnya\n" + "2. Masukkan potongan lontong, sayur kol, tahu, timun dan bengkuang. Aduk-aduk sampai merata lalu hidangkan.\n" + "3. Beri tambahan bawang goreng dan gorengan/kerupuk jika ada.",
        "1. Cuci bersih irisan nangka muda,tiriskan hingga kering\n" + "2. Letakkan daun pisang pada dasar panci lalu letakkan serai,lengkuas,daun salam dan daun jeruk\n" + "3. Letakkan irisan nangka,bumbu halus dan gula merah diatas daun pisang\n" + "4. Tuangkan santan dan masak dengan api kecil hingga mendidih\n" + "5. Masukkan telur,koreksi rasa dan masak hingga kuah menyusut atau kering",
        "1. Tumis bumbu halus sampai harum lalu masukkan kedalam mangkok\n" + "2. Masukkan semua bahan dan telur lalu aduk rata\n" + "3. Masak kerak telur dengan minyak panas, lalu balik\n" + "4. Angkat dan sajikan kerak telor bersama abon, serundeng dan bawang goreng,taburkan diatas nya",
        "1. Siapkan ayam yg sudah bersih. Lalu rebus hingga matang, gunakan kuahnya untuk kaldu.\n" + "2. Haluskan semua bumbu opor. Kecuali salam dan daun jeruk. Setelah halus tumis dengan sedikit minyak hingga halus dan harum. Setelah itu masukkan ke dalam kaldu ayam tunggu hingga mendidih. Setelah mendidih masukkan santan kelapa aduk dan beri garam, merica dan penyedap rasa. Rasakan.\n" + "3. Sembari menunggu opor matang. Siapkan kuning telur dan garam. Kocok dengan mixer hingga padat lalu masukkan santan adik. Kemudian kukus sebentar. Jadi Areh putihnya\n" + "4. Membuat Areh kuning. Siapkan kuah opor lalu masukkan telur ayam kemudian kocok. Setelah itu kukus hingga sedikit padat.",
        "1. Campur tepung terigu dan tepung tapioka (timbangannya seimbang) lalu tuang masako secukupnya\n" + "2. Siapkan teflon\n" + "3. Oles teflon dgn mentega lalu ceplok 1 telur puyuh dan kasih bubuk balado sedikit\n" + "4. Lalu tuang adonan tepung ke teflon dan tuang bubuk balado lagi\n" + "5. Selanjutnya siapkan biting untung menggulung papedanya",
        "1. Giling/blender ikan hingga halus, tambahkan air es aduk hingga rata dan mengental.\n" + "2. Masukan bawang putih halus aduk rata, masukan minyak goreng aduk kembali dan tambahkan garam aduk hinga benar2 rata.\n" + "3. Setelah rata masukan 800 gr sagu aduk perlahan hingga rata. (Jangan diulen seperti membuat adonan roti atau donat).\n" + "4. Adonan agak lembek, agar dapat dibentuk gunakan sisa tepung 200gr untuk membentuk pempek dengan cara dioleskan pada tangan agar tidak lengket. Panaskan air hingga mendidih untuk merebus pempek. Setelah adonan terbentuk, masukan kedalam air mendidih diamkan hingga pempek mengapung dan matang. Angkat.",
        "1. Pertama, Siapkan Panci dan masukkan air lalu rebus hingga mendidih\n" + "2. Setelah itu Masukkan daging sapi kemudian rebus hingga setengah lunak saja. Angkat dan potong daging sesuai selera. Sisihkan.\n" + "3. Masukkan penyedap royco Serbaguna Rasa Sapi ke dalam air rebusan daging hingga menjadi kaldu.\n" + "4. Panaskan minyak pada wajan, tumis bumbu halus, lengkuas, daun jeruk, dan juga serai hingga harum\n" + "5. Kemudian campurkan potongan daging tadi ke dalam tumisan, aduk hingga merata dan bumbu meresap\n" + "6. Terakhir masukkan tumisan daging ke dalam kuah kaldu yang telah di buat tadi\n" + "7. Masak hingga daging empuk menggunakan api kecil saja\n" + "8. Sajikan dalam keadaan masih hangat, jangan lupa tambahkan pelengkap seperti toge, jeruk nipis, sambal trasi, bawang merah goreng, daun bawang dan kerupuk. Selamat mencoba",
        "1. Rebus daging sebentar. Buang air. Isi air lagi, dan rebus pagi sampai daging stgh matang. Tiriskan, Lalu potong2. Sambil menunggu, ulek atau blender bahan.\n" + "2. Tumis bumbu halus, lalu masukkan, sereh, daun salam, daun jeruk, lengkuas.\n" + "3. Masukkan daging. Aduk rata. Tuang air rebusan daging, aduk2 lagi diamkan sampai bumbu meresap ke daging. Taburi garam, kaldu, gula.\n" + "4. Tuang santan. Aduk2 dan biarkan hingga air dan santan surut. Icip2, jika pas, hidangkan",
        "1. Cuci bersih ayam lumuri dengan lemon, didihkan air dalam kuali masukan bumbu pelengkap dan masukan ayam, masak hingga keluar minyak sisihkan.\n" + "2. Haluskan bawang merah,putih,jahe merah dan buah pala,campurkan merica bubuk secukupnya\n" + "3. Tumis bumbu halus hingga harum,masukan dalam rebusan ayam didihkan sebentar angkat ayam untuk digoreng,masak kembali kuah sop dan tambahkan bawang goreng dan daun seledri.\n" + "4. Goreng ayam hingga kekuningan,dinginkan lalu suir2\n" + "5. Rendam bihun dengan air dingin hingga mengembang\n" + "6. Sajikan bersama lontong, bihun, ayam goreng dan telur rebus"
    )

    private val foodIngredient = arrayOf(
        "1/2 ayam kampung besar (1 ayam kampung kecil)\n" + "Air,gula,garam secukupnya\n" + "Bumbu ulek halus:\n" + "1/2 sdm ketumbar\n" + "1 sdt merica\n" + "2 kemiri\n" + "7 cabe rawit\n" + "1 bungkus terasi abc\n" + "1 ruas kunyit\n" + "Bumbu rajang halus:\n" + "10 cabe rawit\n" + "10 bawang merah\n" + "4 bawang putih\n" + "1 ruas kunyit\n" + "3 ruas kencur\n" + "2 ruas jahe\n" + "2 ruas lengkuas\n" + "2 batang sere",
        "Lontong\n" + "Sayur kol rebus\n" + "Timun\n" + "Bengkuang\n" + "Tahu kulit\n" + "Kacang tanah yang sudah digoreng\n" + "Terasi goreng\n" + " Cabe rawit\n" + "Garam\n" + "Gula merah\n" + "Air asam jawa",
        "500 g irisan nangka muda\n" + "1000 ml santan kental\n" + "85 g gula jawa\n" + "2 butir telur rebus\n" + "1 batang serai\n" + "3 iris lengkuas\n" + "4 lembar daun salam\n" + "4 lembar daun jeruk\n" + "3 lembar daun pisang\n" + "Bumbu Halus:\n" + "7 siung bawang merah\n" + "4 siung bawang putih\n" + "1 sdt ketumbar\n" + "6 butir merica\n" + "3 butir kemiri",
        "1 centong nasi atau nasi ketan putih\n" + "2 butir telur ayam atau telur bebek\n" + "2 sdm abon sapi\n" + "2 sdm serundeng\n" + "secukupnya Bawang goreng\n" + "secukupnya Gula, garam\n" + "Haluskan\n" + "3 siung bawang putih\n" + "3 siung bawang merah\n" + "2 buah rawit merah\n" + "Bahan Tambahan\n" + "Abon, serundeng, bawang goreng untuk taburan kerak telor",
        "Nasi 2 cup magic com\n" + "1/2 bungkus Santan kara\n" + "secukupnya Garam\n" + "Bawang merah 1 siung, bawang putih 1 siung\n" + "3 biji Cabe rawit\n" + "2 lbr Daun salam\n" + "1 batang Serai",
        "sagu\n" + "air panas\n" + "lombok/cabe rawit\n" + "tomat\n" + "jeruk nipis\n" + "terasi\n" + "ikan masak + kuah\n" + "sayur\n" + "secukupnya garam dan penyedap",
        "1 kg daging ikan giling tenggiri/Gabus/Kakap\n" + "1 kg tepung sagu/tapioka tani\n" + "4 sdm bawang putih halus\n" + "1/2 gelas minyak goreng\n" + "1 1/2 gelas air es\n" + "2 sdm garam",
        "500 gram daging sapi kisi2 di potong2\n" + "Air putih\n" + "Bahan halus :\n" + "10 kluwek (direndam air panas dulu)\n" + "10 bawang merah\n" + "5 bawang putih\n" + "1 ruas jahe\n" + "1 sdt ketumbar di sangrai\n" + "1 sdt jinten di sangrai\n" + "4 butir kemiri di sangrai\n" + "1 ruas kunir\n" + "3 cabe besar buang bijinya\n" + "Garam, merica, kaldu jamur\n" + "Pelengkap:\n" + "Taoge pendek\n" + "Sambal terasi\n" + "Krupuk",
        "500 gr daging sapi\n" + "2 bungkus bumbu instan \"bamboo\"\n" + "2 bungkus santan \"kara\" 65ml\n" + "600 ml air\n" + "6 siung bawang merah\n" + "3 siung bawang putih\n" + "1 ruas jahe\n" + "5 biji cabe rawit\n" + "2 biji cabe merah\n" + "1,5 ruas lengkuas, geprek\n" + "2 batang serai, geprek\n" + "4 lembar daun jeruk\n" + "3 lembar daun salam\n" + "secukupnya Kaldu bubuk\n" + "secukupnya Garam\n" + "secukupnya Gula",
        "1 ekor ayam potong 6 bagian\n" + "Lontong nasi\n" + "1 bungkus bihun\n" + "5 butir telur rebus\n" + "Bawang goreng\n" + "secukupnya Daun seledri\n" + "Merica bubuk\n" + "6 siung bawang merah\n" + "4 siung bawang putih\n" + "1 ruas kecil jahe merah\n" + "Seujung jari kelingking buah pala\n" + "Bumbu pelengkap\n" + "Secukupnya bunga lawang\n" + "Secukupnya kayu manis\n" + "Secukupnya cengkeh\n" + "Secukupnya kapulaga\n" + "1 ruas kecil lengkuas digeprek\n" + "1 batang sereh di geprek\n" + "1 sdm cuka dapur\n" + "Garam"
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()

                food.name = foodNames[position]
                food.place = foodPlaces[position]
                food.description = foodDescriptions[position]
                food.photo = foodImages[position]
                food.cal = foodCalories[position]
                food.fat = foodFat[position]
                food.carb = foodCarb[position]
                food.protein = foodProtein[position]
                food.ingredient = foodIngredient[position]
                food.recipe = foodRecipe[position]

                list.add(food)
            }
            return list
        }
}