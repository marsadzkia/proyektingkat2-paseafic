package org.d3if2125.paseafic_nav.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.d3if2125.paseafic_nav.R
import org.d3if2125.paseafic_nav.databinding.FragmentHomeBinding
import org.d3if2125.paseafic_nav.ui.belajar.DetailActivity

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardview1.setOnClickListener {
            val faktasatu = Intent(context, HomeDetailActivity::class.java)
            faktasatu.putExtra("title", "Samudera Pasifik lebih luas dari bulan.")
            faktasatu.putExtra("gambar", R.drawable.berita_satu)
            faktasatu.putExtra("isi", "Samudra pertama adalah Samudra Pasifik dan merupakan samudra yang paling luas dari kelima samudra lainnya.\n" +
                    "Samudra Pasifik mencakup setengah dari wilayah perairan yang ada di bumi, luasnya mencapai sekitar 179.700.000 km persegi\n" +
                    "dan membentang dari utara hingga selatan, hingga menyebabkan Samudra Pasifik terbagi menjadi dua bagian\n" +
                    "yaitu Samudra Pasifik Utara serta Samudra Pasifik Selatan.\n" +
                    "Pada titik terluasnya, dari Indonesia hingga Kolombia, Samudra Pasifik lebih lebar dari bulan, cukup banyak.\n" +
                    "Hamparan lautan ini memiliki lebar 12.300 mil, yang lebih dari lima kali diameter bulan!\n")
            context?.startActivity(faktasatu)
        }

        binding.cardview2.setOnClickListener {
            val faktadua = Intent(context, HomeDetailActivity::class.java)
            faktadua.putExtra("title", "Tekanan di dasar lautan akan\n"
                    + "menghancurkan seseorang seperti semut.")
            faktadua.putExtra("gambar", R.drawable.berita_dua)
            faktadua.putExtra("isi", "Di Palung Mariana (35.802 kaki di bawah permukaan), yang termasuk titik terdalam di planet ini,\n" +
                    "tekanan airnya delapan ton per inci persegi. Jika seseorang turun ke sana, ia akan merasa seperti sedang memegang hampir 50 jet\n" +
                    "berukuran besar. Dengan tekanan dan kegelapan di dalamnya, tidak banyak organisme laut yang bisa bertahan hidup di Palung Mariana.\n" +
                    "Adapun organisme paling umum ditemukan di Palung Mariana yaitu amuba raksasa (xenophyophores), udang tak bercangkang (Amphipoda),\n" +
                    "dan teripang kerdil (holothurian). Lalu, dari penelitian terbari di awal tahun 2016, terdapat spesies ubur-ubur kecil disini.\n" +
                    "Uniknya, ubur-ubur ini memiliki bagian kepala yang bisa bersinar.\n" +
                    "James Cameron, sutradara Titanic, merupakan satu dari sedikit orang yang pernah melakukan perjalanan ke dasar Palung Mariana.\n" +
                    "Dengan kapal selam berbentuk torpedo, Cameron menyelam selama 2.5 jam untuk mencapai dasar Palung Mariana pada tahun 2012.\n" +
                    "Perjalanannya memang berhasil, namun beberapa bagian kapal selamnya mengalami kerusakan akibat tekanan yang terlalu kuat.\n")
            context?.startActivity(faktadua)
        }

        binding.cardview3.setOnClickListener {
            val faktatiga = Intent(context, HomeDetailActivity::class.java)
            faktatiga.putExtra("title", "Lebih dari 90% bentuk kehidupan planet\n"
                    +"belum ditemukan dan berada di bawah air.")
            faktatiga.putExtra("gambar", R.drawable.berita_tiga)
            faktatiga.putExtra("isi", "Para ilmuwan dari Université Catholique de Louvain di Belgia dikejutkan oleh penemuan mereka\n " +
                    "tentang tiga spesies hiu yang bercahaya (bioluminesensi) dalam gelap yang hidup di perairan laut dalam Selandia Baru.\n " +
                    "Tiga spesies hiu itu yaitu bernama latin Dalatias licha, Etmopterus lucifer dan Etmopterus granulosus.\n" +
                    "Salah satu jenis hiu yang mereka lihat dengan kemampuan bioluminesensi ini adalah kitefin shark (Dalatias licha) " +
                    "atau  hiu sirip layang-layang yang diyakini  sebagai vertebrata bercahaya terbesar yang diketahui, dengan panjang mencapai 180 cm.\n" +
                    "“Bioluminescence sering dilihat sebagai peristiwa spektakuler namun tidak biasa di laut tetapi mengingat luasnya laut dalam\n" +
                    "dan terjadinya organisme bercahaya di zona ini, sekarang semakin jelas bahwa menghasilkan cahaya\n" +
                    "di kedalaman memainkan peran penting dalam penataan ekosistem terbesar di planet kita, yakni lautan,” tulis para peneliti. \n")
            context?.startActivity(faktatiga)
        }

        binding.cardview4.setOnClickListener {
            val faktaempat = Intent(context, HomeDetailActivity::class.java)
            faktaempat.putExtra("title", "Lautan juga memiliki danau dan sungai.")
            faktaempat.putExtra("gambar", R.drawable.berita_empat)
            faktaempat.putExtra("isi", "Lautan seperti dunia yang sepenuhnya terpisah. Ada parit, gunung, gunung berapi, dan danau dan sungai.\n"
                    + "Saat air laut menembus lapisan garam, ia membentuk depresi kecil di dasar laut. Karena air di sekitar cekungan ini\n"
                    + "mengandung lebih banyak garam daripada air laut biasa, air itu lebih padat dan tenggelam ke dalam cekungan tersebut,\n"
                    + "menciptakan genangan air asin kecil. Ini sangat mirip dengan danau yang kita kenal karena memiliki garis pantai\n"
                    + "dan beberapa di antaranya bahkan memiliki ombak. \n"
                    + "Salah satu sungai bawah laut yang paling terkenal terletak di Semenanjung Yukatan di Meksiko.\n"
                    + "Meskipun tampak seperti air laut pada umumnya dari permukaan, namun kalian akan menemukan sebuah sungai bawah laut\n"
                    + "ketika mencapai kedalaman 18 meter yang bernama Cenote Angelita. \n")
            context?.startActivity(faktaempat)
        }

        binding.cardview5.setOnClickListener {
            val faktalima = Intent(context, HomeDetailActivity::class.java)
            faktalima.putExtra("title", "Sejauh ini, baru 5% kehidupan di laut yang\n"
                    + "diketahui oleh manusia.")
            faktalima.putExtra("gambar", R.drawable.berita_lima)
            faktalima.putExtra("isi", "Sampai saat ini, para peneliti baru menemukan 5% dari lautan yang sebenarnya,\n"
                    + "karena makin dalam lautan memiliki tekanan dengan skala besar sehingga menyulitkan\n"
                    + "peneliti untuk melakukan penelitian. Meskipun 94 persen kehidupan Bumi ada di air, tapi\n"
                    + "sekitar 2/3 dari kehidupan laut masih belum teridentifikasi. Spesies baru terus ditemukan\n"
                    + "dan menambah keingintahuan tentang kehidupan bawah laut. \n"
                    + "Daftar tahunan terakhir SUNY College of Environmental Science and Forestry's (ESF)\n"
                    + "merilis 10 spesies terbaru di laut. Termasuk salah satu spesies mencolok, naga merah yang sulit sekali ditemukan\n"
                    + "meski tinggal di laut dangkal di Pantai Barat Australia.\n")
            context?.startActivity(faktalima)
        }

        binding.cardview6.setOnClickListener {
            val faktaenam = Intent(context, HomeDetailActivity::class.java)
            faktaenam.putExtra("title", "Lautan mengandung banyak emas.")
            faktaenam.putExtra("gambar", R.drawable.berita_enam)
            faktaenam.putExtra("isi", "Terdapat fakta menakjubkan pada lautan yang kadang tidak terpikirkan oleh manusia.\n"
                    + "Lautan mengandung 20 juta ton emas yang emas tersebut tidak dalam bentuk Batangan atau bongkahan\n"
                    + "melainkan emas tersebut sudah larut bersama air laut sehingga nyaris tidak terlihat.\n"
                    + "Menurut NOAA (National Oceanic and Atmospheric Administration), memperkirakan jika\n"
                    + "seluruh emas yang terkandung dalam lautan diekstrak dan dibagikan kepada penduduk bumi,\n"
                    + "maka seorang akan memperoleh emas kurang lebih seberat 4 kg.\n")
            context?.startActivity(faktaenam)
        }

        binding.cardview7.setOnClickListener {
            val faktatujuh = Intent(context, HomeDetailActivity::class.java)
            faktatujuh.putExtra("title", "Kabel koneksi internasional ada di dalam laut.")
            faktatujuh.putExtra("gambar", R.drawable.berita_tujuh)
            faktatujuh.putExtra("isi", "Internet berkecepatan tinggi yang digunakan banyak orang saat ini untuk berbagai hal,\n"
                    + "semuanya karena lautan. Diketahui bahwa kabel penting dari perusahaan komunikasi multinasional\n "
                    + "yang memungkinkan internet menjelajahi seluruh dunia, berada di dalam laut. Kabel ini membantu dalam menjaga\n"
                    + "koneksi internasional. Kabel tersebut dilindungi oleh lapisan anti-hiu, untuk memastikan bahwa tidak ada\n"
                    + "predator yang menyerang kabel.")
            context?.startActivity(faktatujuh)
        }
    }
}