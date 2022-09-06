package org.d3if2125.paseafic_nav.ui.belajar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if2125.paseafic_nav.R
import org.d3if2125.paseafic_nav.databinding.FragmentBelajarBinding

class BelajarFragment : Fragment() {

    private lateinit var binding: FragmentBelajarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBelajarBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardView.setOnClickListener {
            val tombolsatu = Intent(context, DetailActivity::class.java)
            tombolsatu.putExtra("title", "Kedalaman 50 - 100 Meter")
            tombolsatu.putExtra("gambar", R.drawable.halsatu)
            tombolsatu.putExtra("isi", "Pada kedalaman 50-100 meter terdapat biota laut\n" +
                    "Beruang Kutub :\n" +
                    "1.\tWarna Kulitnya Hitam Bukannya Putih\n" +
                    "Banyak orang mengira kalau warna kulit beruang kutub berwarna putih. Namun kenyataannya warna kulit beruang kutub adalah hitam. Sedangkan rambut beruang kutub berwarna transparan dan bisa memantulkan cahaya. Oleh karena itu, kita melihatnya seperti berwarna putih salju di kutub.\n" +
                    "2.\tMempunyai Bobot yang Besar\n" +
                    "Bobot beruang kutub jantan dewasa bisa mencapai 300 sampai 800-kilogram dan panjangnya bisa mencapai 2,5 meter. Sedangkan beruang kutub betina mempunyai bobot 150 sampai 300-kilogram dengan panjang tubuh 1,8 sampai 2 meter.\n" +
                    "3.\tBisa Berenang dan Berjalan Jauh\n" +
                    "Karena tempat tinggal beruang kutub yang di es dan dikelilingi oleh lautan. Tentu beruang kutub juga banyak menghabiskan waktunya di air untuk berburu mangsa dan menyebrang ke daratan es lainnya. Mereka juga bisa berjalan jauh sekali sampai 2.300 mil, karena mereka adalah hewan yang berpindah-pindah tempat.\n" +
                    "4.\tTahan Tidak Makan Berbulan-bulan\n" +
                    "Dalam masa hibernasi dan tidak ada mangsa terdekat yang bisa dimangsa, beruang kutub bisa tidak makan sampai berbulan-bulan. Bahkan beruang kutub betina yang sedang hamil bisa tidak makan sampai 8 bulan. Hibernasi yang dilakukan beruang kutub ini dilakukan untuk menurunkan metabolisme agar energi lebih hemat dipakai. Jadi, mereka tidak mudah lapar dan bisa tahan tidak makan lebih lama.\n" +
                    "5.\tHanya Bisa Hidup Sampai Usia 30 Tahun\n" +
                    "Sayangnya, masa hidup beruang kutub di alam liar hanya bisa mencapai 25 sampai 30 tahun saja. Induk beruang kutub mampu melahirkan 2 sampai 3 ekor anak beruang kutub. Namun, jumlah kematian beruang kutub lebih tinggi daripada tingkat kelahirannya. Oleh karena itu, beruang kutub sudah termasuk ke dalam daftar hewan yang terancam punah.\n" +
                    "\n" +
                    "Ikan Badut :\n" +
                    "1.\tTerlahir sebagai jantan\n" +
                    "Semua ikan badut terlahir sebagai jantan. Walau begitu, ikan badut tetap bisa berkembang biak. Untuk bisa berkembang biak, ikan badut yang berkelompok akan dibagi menjadi dua posisi. Bila pada kelompok tersebut ada 5 ekor ikan badut, maka 2 ikan terbesar akan menjadi pejantan dan betina yang bertugas berkembang biak. Ikan paling besar akan berperan sebagai betina.\n" +
                    "2.\tSimbiosis Mutualisme dengan Anemon Laut\n" +
                    "Ikan badut dan anemon laut memiliki hubungan simbiosis mutualisme atau hubungan yang saling menguntungkan. Anemon laut adalah jenis hewan yang memiliki tentakel dan bisa menyengat. Walau menyengat, ikan badut bisa hidup berlindung di antara tentakel anemon laut. Sedangkan anemon laut akan diuntungkan dengan adanya ikan badut di dekatnya. Ikan badut mampu mengusir hewan-hewan yang akan memangsa anemon laut. Dengan begitu, dua hewan ini hidup berdampingan dan saling menguntungkan\n" +
                    "3.\tAyah yang baik\n" +
                    "Ikan badut ternyata termasuk dalam kelompok hewan penyayang anak. Ikan badut yang berperan sebagai pejantan akan menjadi ayah yang baik bagi anak-anak nya. Hal itu ditunjukan dengan sikap pejantan yang selalu menjaga telur-telur yang di keluarkan si betina. Bahkan ikan badut jantan akan mencarikan tempat bagi ikan betina untuk bertelur.\n" +
                    "4.\tTidak pandai berenang\n" +
                    "Ikan dengan warna cantik ini ternyata tidak terlalu pandai berenang. Karena itu ikan ini lebih sering berlindung di balik tentakel anemon laut. Keunikan ikan ini membuat banyak orang menangkap dan menjadikannya hewan peliharaan di rumah.\n" +
                    " \n" +
                    "Terumbu Karang :\n" +
                    "1.\tMemiliki Luas 25.000 Kilometer Persegi\n" +
                    "Terumbu karang merupakan penghuni besar wilayah lautan. Biota yang dianggap sebagai ‘pohonnya laut’ ini diperkirakan terhampar luas hingga 25.000-kilometer persegi. Dari jumlah tersebut, pemerintah menghitung sekitar 37 persen diantaranya berkategori baik, dan 29,9 persen dalam keadaan sangat baik. Sisanya, diperlukan upaya penanganan dan perlindungan khusus agar kembali dalam kondisi baik.\n" +
                    "2.\tAmazon of the Ocean\n" +
                    "Julukan Amazon disematkan bagi terumbu karang yang ada di Indonesia karena jenisnya yang sangat beragam. Pemerintah sendiri melalui Kementerian Kelautan dan Perikanan (KKP) mengklaim bahwa 69 persen varietas seluruh terumbu karang yang ada di dunia terdapat di Indonesia. Maka, tidaklah berlebihan jika wilayah perairan laut Indonesia ini disebut bak Amazon of the Ocean.")
            context?.startActivity(tombolsatu)
        }

        binding.cardView2.setOnClickListener {
            val tomboldua = Intent(context, DetailActivity::class.java)
            tomboldua.putExtra("title", "Kedalaman 200 - 300 Meter")
            tomboldua.putExtra("gambar", R.drawable.haldua)
            tomboldua.putExtra("isi", "HIU BANTENG\n" +
                    "1.\tBerukuran Besar dan Memiliki Moncong Pendek\n" +
                    "Hiu banteng (Carcharhinus leucas) mendapatkan namanya dari karakteristik moncongnya yang pendek dan tumpul. " +
                    "Selain itu, mereka juga punya kebiasaan menyeruduk mangsanya seperti banteng sebelum memangsanya. " +
                    "Hiu banteng termasuk famili Carcharhinide yang juga mencakup hiu yang tak kalah ganas lainnya yaitu hiu macan.\n" +
                    "2.\tBisa Hidup di Air Payau dan Air Tawar\n" +
                    "Hiu banteng memiliki persebaran yang cukup luas. Mereka bisa ditemukan di Amerika Utara hingga Selatan. " +
                    "Mereka juga ada di perairan Afrika, India, hingga ke Indonesia dan Australia. " +
                    "Habitat utama mereka adalah lautan tropis dan subtropis dengan rata-rata kedalaman 30 meter. " +
                    "Namun, mereka juga bisa hidup di air payau dan air tawar. Itulah yang membuat hiu banteng sangat berbahaya bagi manusia, " +
                    "karena mereka bisa berenang hingga ke dekat pantai serta sungai, tempat di mana manusia sering berenang.\n")
            context?.startActivity(tomboldua)
        }

        binding.cardView3.setOnClickListener {
            val tomboltiga = Intent(context, DetailActivity::class.java)
            tomboltiga.putExtra("title", "Kedalaman 400 - 600 Meter")
            tomboltiga.putExtra("gambar", R.drawable.haltiga)
            tomboltiga.putExtra("isi", "SINGA LAUT\n" +
                    "1.\tHewan yang Suka Bergaul\n" +
                    "Singa laut merupakan hewan laut yang suka bergaul dan dikenal sebagai hewan sosial. " +
                    "Ketika bepergian, singa laut akan bergerombol menjadi sekelompok, dengan satu kelompok berjumlah 12 ekor. " +
                    "Singa laut suka berkelompok untuk saling melindungi diri dari predator. " +
                    "Predator singa laut ini adalah paus pembunuh, hiu, serigala, dan beruang kutub.\n" +
                    "2.\tBisa Bertahan 10 Menit di Dalam Air\n" +
                    "Singa laut yang paling cepat di dunia yaitu singa laut dari California, mereka bisa menyelam hingga kedalaman 274,32 meter. BELUT SERIGALA\n" +
                    "Seorang nelayan Alaska menangkap makhluk misterius di perairan Alaska yang memiliki rahang besar dan gigi setajam silet. " +
                    "Makhluk itu disebut belut serigala. Ukuran belut serigala terbilang besar untuk ukuran ikan laut. Belut serigala berbeda dari belut laut karena memiliki celah insang dan sirip dada. Hewan ini dapat mencapai panjang 2,4 meter dan berat 18 kilogram. Biasanya hewan ini ditemukan di karang-karang atau gua laut dangkal hingga laut sedalam 226 meter. Biasanya spesies ini dapat hidup selama 25 tahun.\n" +
                    "RUMPUT LAUT\n" +
                    "1.\tSebagai Penyumbang Oksigen\n" +
                    "Rumput laut menjadi salah satu penyumbang oksigen di bumi sebesar 70%. " +
                    "Para ilmuwan memercayai bahwa rumput laut bisa menjadi solusi untuk masalah perubahan iklim di saat ini.\n ")
            context?.startActivity(tomboltiga)
        }

        binding.cardView4.setOnClickListener {
            val tombolempat = Intent(context, DetailActivity::class.java)
            tombolempat.putExtra("title", "Kedalaman 700 - 900 Meter")
            tombolempat.putExtra("gambar", R.drawable.halempat)
            tombolempat.putExtra("isi", "Sperm Whale Dive (Paus Sperma)\n" +
                    "1.\tPredator Bergigi Terbesar di Dunia\n" +
                    "Paus sperma merupakan salah satu jenis paus karnivora. " +
                    "Berdasarkan tulisan dari laman Whalefacts.org, dalam satu hari setidaknya mereka dapat melahap hingga 1 ton cumi-cumi raksasa " +
                    "dan ikan-ikan yang ada di perairan dalam. Selain itu, paus sperma ternyata juga memegang gelar " +
                    "sebagai predator bergigi terbesar di dunia. Akan tetapi, ternyata mereka tidak menggunakan gigi-gigi tersebut untuk berburu. " +
                    "Mereka justru lebih suka menelan mangsanya secara langsung tanpa mencabik-cabiknya terlebih dahulu.\n")
            startActivity(tombolempat)
        }

        binding.cardView5.setOnClickListener {
            val tombollima = Intent(context, DetailActivity::class.java)
            tombollima.putExtra("title", "Kedalaman 1000 - 1500 Meter")
            tombollima.putExtra("gambar", R.drawable.hallima)
            tombollima.putExtra("isi", "Sperm Whale Dive (Paus Sperma)\n" +
                    "1.\tPredator Bergigi Terbesar di Dunia\n" +
                    "Paus sperma merupakan salah satu jenis paus karnivora. Berdasarkan tulisan dari laman Whalefacts.org, " +
                    "dalam satu hari setidaknya mereka dapat melahap hingga 1 ton cumi-cumi raksasa dan ikan-ikan yang ada di perairan dalam. " +
                    "Selain itu, paus sperma ternyata juga memegang gelar sebagai predator bergigi terbesar di dunia. " +
                    "Akan tetapi, ternyata mereka tidak menggunakan gigi-gigi tersebut untuk berburu. " +
                    "Mereka justru lebih suka menelan mangsanya secara langsung tanpa mencabik-cabiknya terlebih dahulu.\n" +
                    "2.\tHewan dengan Suara Terkeras di Dunia\n" +
                    "Memang untuk ukuran besar suara dapat dipengaruhi oleh beberapa faktor, misalnya medium udara dengan air yang berbeda. " +
                    "Akan tetapi, jika diukur dengan besaran desibelnya, maka predikat hewan dengan suara terbising dipegang oleh paus sperma " +
                    "dengan besaran 230 desibel untuk sekali clicks yang mereka suarakan. Itu artinya, suara seekor paus sperma melebihi kebisingan suara mesin jet.\n" +
                    "3.\tPenyelam yang sangat handal\n" +
                    "Paus sperma menjadikan cumi-cumi raksasa sebagai makanan utama. Untuk mendapatkan cumi-cumi tersebut, " +
                    "mereka harus menyelam ke lautan dalam. Beruntungnya, mereka dapat beradaptasi dengan hal tersebut. " +
                    "Mereka dapat menyelam hingga sedalam 3.280 kaki atau hampir mencapai 1 kilometer dengan durasi hingga mencapai 90 menit " +
                    "untuk satu tarikan napas! Hal tersebut kemudian menjadikan mereka sebagai mamalia dengan kemampuan menyelam terbaik.\n" +
                    "HIU GOBLIN\n" +
                    "1.\tUkuran Hiu Goblin\n" +
                    "Saat lahir, panjang hiu goblin sekitar 80 hingga 100 cm. Saat dewasa, jantannya berukuran 260 hingga 380 cm. Seperti kebanyakan spesies hiu, betina hiu goblin memiliki tubuh lebih besar, yakni lebih dari 420cm. Bahkan, beberapa spesies berukuran 620 cm juga telah ditemukan. \n" +
                    "2.\tMakanan Hiu Goblin\n" +
                    "Hiu goblin menggunakan elektroreseptor yang disebut ampula Lorenzini di hidungnya yang panjang untuk mendeteksi medan listrik mangsanya. Kemudian, ketika mangsa ditemukan, hiu goblin menggunakan daya apung alami yang diproduksi oleh organ hatinya yang besar dan kaya akan minyak untuk mengapung tanpa suara ke arah mangsanya. \n" +
                    "3.\tSpesies Hiu Goblin\n" +
                    "Hiu goblin termasuk dalam keluarga Mitsukurinidae, yang berisi satu spesies hidup, yakni hanya hiu goblin. Ada anggota keluarga lain yang sudah punah dan terdapat dalam catatan fosil yang berumur sekitar 125 juta tahun.  ")
            startActivity(tombollima)
        }

        binding.cardView6.setOnClickListener {
            val tombolenam = Intent(context, DetailActivity::class.java)
            tombolenam.putExtra("title", "Kedalaman 2000 - 3000 Meter")
            tombolenam.putExtra("gambar", R.drawable.halenam)
            tombolenam.putExtra("isi", "HIU MAKO\n" +
                    "1.\tBerdarah Panas\n" +
                    "Meskipun bukan mamalia, hiu mako sebenarnya berdarah panas. Mereka adalah endotermik yang berarti bahwa " +
                    "mereka dapat mempertahankan suhu tubuh mereka terlepas dari suhu lingkungan di sekitar mereka. Kerabat dekat hiu mako adalah hiu putih. \n" +
                    "2.\tPerenang Super\n" +
                    "Meskipun mereka hanya dapat mencapai kecepatan puncaknya dalam ledakan singkat, spesies ini juga memiliki kecepatan konstan yang sangat cepat.")
            startActivity(tombolenam)
        }

        binding.cardView7.setOnClickListener {
            val tomboltujuh = Intent(context, DetailActivity::class.java)
            tomboltujuh.putExtra("title", "Kedalaman 3500 - 5000 Meter")
            tomboltujuh.putExtra("gambar", R.drawable.haltujuh)
            tomboltujuh.putExtra("isi", "PAUS BELUGA\n" +
                    "1.\tDijuluki sebagai “Kepala Melon”\n" +
                    "Paus beluga dijuluki sebagai kepala melon disebabkan karena bulatan di dahinya. " +
                    "Bulatan ini merupakan organ berlemak yang membantu proses ekolokasi, " +
                    "yakni proses di mana hewan menggunakan gema sebagai panggilan untuk menemukan " +
                    "dan mengidentifikasi objek. Cara kerjanya adalah dengan memantulkan gelombang suara ke air. " +
                    "Gelombang ini nantinya akan memantul dan kembali ke beluga dalam bentuk gema.\n")
            startActivity(tomboltujuh)
        }
    }
}