package com.bulenthanci.nfopazar

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.GREEN
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.messaging.FirebaseMessaging
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main5.*
import java.util.*


class Main5Activity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)








        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()


        val imagebutton20 = findViewById<ImageButton>(R.id.control)

        imagebutton20.setOnClickListener {
            Toasty.info(this.applicationContext, "HEPSİ SEÇİLDİ!!", Toast.LENGTH_SHORT).show()

            val uuid = UUID.randomUUID()
            val usermap2 = hashMapOf<String, Any>()
            val usermap = hashMapOf<String, Any>()
            usermap.put("useremail", auth.currentUser!!.email.toString())
            usermap.put("Hepsi", "Hepsi Basti")
            usermap.put("tarih", Timestamp.now())

            usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
            usermap2.put("Hepsi", "Hepsi Basti")
            usermap2.put("tarih", Timestamp.now())

            db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                if (task.isComplete && task.isSuccessful) {

                } else {
                    Toast.makeText(
                        this.applicationContext,
                        "Başarısız Tekrar Dene",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }

                db.collection("Users").add(usermap).addOnCompleteListener { task ->

                    if (task.isComplete && task.isSuccessful) {

                    }

                }.addOnFailureListener { exception ->
                    Toast.makeText(
                        applicationContext,
                        exception.localizedMessage.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }

                bac.setBackgroundColor(Color.GREEN)
                bac2.setBackgroundColor(Color.GREEN)
                bac3.setBackgroundColor(Color.GREEN)
                bac4.setBackgroundColor(Color.GREEN)
                bac5.setBackgroundColor(Color.GREEN)
                bac6.setBackgroundColor(Color.GREEN)
                bac7.setBackgroundColor(Color.GREEN)
                bac8.setBackgroundColor(Color.GREEN)
                bac9.setBackgroundColor(Color.GREEN)
                bac10.setBackgroundColor(Color.GREEN)
                bac11.setBackgroundColor(Color.GREEN)
                bac12.setBackgroundColor(Color.GREEN)
                bac13.setBackgroundColor(Color.GREEN)
                bac14.setBackgroundColor(Color.GREEN)
            }

            val bac = findViewById<LinearLayout>(R.id.bac)
            val imageButton = findViewById<ImageButton>(R.id.saglik)
            val imageButton2 = findViewById<ImageButton>(R.id.egitim)
            val imageButton3 = findViewById<ImageButton>(R.id.giyim)
            val imageButton4 = findViewById<ImageButton>(R.id.mobil)
            val imageButton7 = findViewById<ImageButton>(R.id.sutUrun)
            val imageButton8 = findViewById<ImageButton>(R.id.organik)
            val imageButton9 = findViewById<ImageButton>(R.id.emlak)
            val imageButton10 = findViewById<ImageButton>(R.id.vasita)
            val imageButton11 = findViewById<ImageButton>(R.id.benzin)
            val imageButton13 = findViewById<ImageButton>(R.id.petshop)
            val imageButton14 = findViewById<ImageButton>(R.id.yemek)


        }
    }


        fun saglik(view: View) {
            val uuid = UUID.randomUUID()

            val usermap = hashMapOf<String, Any>()
            val usermap2 = hashMapOf<String, Any>()
            usermap.put("useremail", auth.currentUser!!.email.toString())
            usermap.put("Saglik", "Saglik BASTİ")
            usermap.put("tarih", Timestamp.now())

            usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
            usermap2.put("Saglik", "Saglik Basti")
            usermap2.put("tarih", Timestamp.now())

            db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                if (task.isComplete && task.isSuccessful) {

                } else {
                    Toast.makeText(
                        this.applicationContext,
                        "Başarısız Tekrar Dene",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }


                db.collection("Users").add(usermap).addOnCompleteListener { task ->

                    if (task.isComplete && task.isSuccessful) {


                    } else {
                        Toasty.error(this.applicationContext, "BAŞARISIZ", Toast.LENGTH_SHORT)
                            .show()
                    }

                }

                FirebaseMessaging.getInstance().subscribeToTopic("saglik")
                    .addOnCompleteListener { task ->

                        if (task.isSuccessful()) {


                        } else {
                            Toast.makeText(this.applicationContext, "Başarısız", Toast.LENGTH_SHORT)
                                .show()
                        }

                    }.addOnFailureListener { exception ->
                        Toast.makeText(
                            applicationContext,
                            exception.localizedMessage.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                Toasty.success(this.applicationContext, "SAĞLIK SEÇİLDİ", Toast.LENGTH_SHORT).show()
                bac.setBackgroundColor(Color.GREEN)
            }


        }


        fun egitim(view: View) {

            val uuid = UUID.randomUUID()

            val usermap = hashMapOf<String, Any>()
            val usermap2 = hashMapOf<String, Any>()
            usermap.put("useremail", auth.currentUser!!.email.toString())
            usermap.put("Egitim", "Egitim BASTİ")
            usermap.put("tarih", Timestamp.now())

            usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
            usermap2.put("Egitim", "Egitim Basti")
            usermap2.put("tarih", Timestamp.now())

            db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                if (task.isComplete && task.isSuccessful) {

                } else {
                    Toast.makeText(
                        this.applicationContext,
                        "Başarısız Tekrar Dene",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }

                db.collection("Users").add(usermap).addOnCompleteListener { task ->

                    if (task.isComplete && task.isSuccessful) {

                    } else {

                        Toast.makeText(this.applicationContext, "Başarısız", Toast.LENGTH_SHORT)
                            .show()
                    }

                    FirebaseMessaging.getInstance().subscribeToTopic("egitim")
                        .addOnCompleteListener { task ->

                            if (task.isSuccessful()) {



                            } else {
                                Toast.makeText(
                                    this.applicationContext,
                                    "Başarısız",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                            }

                        }.addOnFailureListener { exception ->
                            Toast.makeText(
                                applicationContext,
                                exception.localizedMessage.toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }



                    Toasty.success(this.applicationContext, "EĞİTİM SEÇİLDİ").show()
                    bac2.setBackgroundColor(Color.GREEN)
                }

            }
        }
















            fun giyim(view: View) {


                val uuid = UUID.randomUUID()

                val usermap = hashMapOf<String, Any>()
                val usermap2 = hashMapOf<String, Any>()
                usermap.put("useremail", auth.currentUser!!.email.toString())
                usermap.put("GİYİM", "GİYİM BASTİ")
                usermap.put("tarih", Timestamp.now())
                usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
                usermap2.put("Giyim", "Giyim Basti")
                usermap2.put("tarih", Timestamp.now())

                db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                    if (task.isComplete && task.isSuccessful) {

                    } else {
                        Toast.makeText(
                            this.applicationContext,
                            "Başarısız Tekrar Dene",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }



                    db.collection("Users").add(usermap).addOnCompleteListener { task ->

                        if (task.isComplete && task.isSuccessful) {

                        } else {
                            Toast.makeText(this.applicationContext, "BAŞARISIZ", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }

                    FirebaseMessaging.getInstance().subscribeToTopic("giyim")
                        .addOnCompleteListener { task ->

                            if (task.isSuccessful()) {



                            } else {
                                Toast.makeText(
                                    this.applicationContext,
                                    "Başarısız",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                            }

                        }.addOnFailureListener { exception ->
                            Toast.makeText(
                                applicationContext,
                                exception.localizedMessage.toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    Toasty.success(this.applicationContext, "GİYİM SEÇİLDİ", Toast.LENGTH_SHORT)
                        .show()
                    bac3.setBackgroundColor(Color.GREEN)
                }
            }


                fun elektr(view: View) {

                    val uuid = UUID.randomUUID()
                    val usermap2 = hashMapOf<String, Any>()
                    val usermap = hashMapOf<String, Any>()
                    usermap.put("useremail", auth.currentUser!!.email.toString())
                    usermap.put("Elektronik", "Elektronik BASTİ")
                    usermap.put("tarih", Timestamp.now())
                    usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
                    usermap2.put("Elektronik", "Elektronik Basti")
                    usermap2.put("tarih", Timestamp.now())



                    db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                        if (task.isComplete && task.isSuccessful) {

                        } else {
                            Toast.makeText(
                                this.applicationContext,
                                "Başarısız Tekrar Dene",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }

                        db.collection("Users").add(usermap).addOnCompleteListener { task ->

                            if (task.isComplete && task.isSuccessful) {

                            } else {
                                Toast.makeText(
                                    this.applicationContext,
                                    "Başarısız Tekrar Dene",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                            }



                            FirebaseMessaging.getInstance().subscribeToTopic("elektr")
                                .addOnCompleteListener { task ->

                                    if (task.isSuccessful()) {


                                    } else {
                                        Toast.makeText(
                                            this.applicationContext,
                                            "Başarısız",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }

                                }.addOnFailureListener { exception ->
                                    Toast.makeText(
                                        applicationContext,
                                        exception.localizedMessage.toString(),
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }

                            Toasty.success(
                                this.applicationContext,
                                "ELEKTRONİK SEÇİLDİ",
                                Toast.LENGTH_SHORT
                            ).show()
                            bac4.setBackgroundColor(Color.GREEN)
                        }
                    }
                }



                        fun manav(view: View) {

                            val uuid = UUID.randomUUID()
                            val usermap2 = hashMapOf<String, Any>()

                            val usermap = hashMapOf<String, Any>()
                            usermap.put("useremail", auth.currentUser!!.email.toString())
                            usermap.put("Manav", "Manav Basti")
                            usermap.put("tarih", Timestamp.now())

                            usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
                            usermap2.put("Manav", "Manav Basti")
                            usermap2.put("tarih", Timestamp.now())

                            db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                                if (task.isComplete && task.isSuccessful) {

                                } else {
                                    Toast.makeText(
                                        this.applicationContext,
                                        "Başarısız Tekrar Dene",
                                        Toast.LENGTH_SHORT
                                    )
                                        .show()
                                }

                                db.collection("Users").add(usermap).addOnCompleteListener { task ->

                                    if (task.isComplete && task.isSuccessful) {

                                    } else {
                                        Toast.makeText(
                                            this.applicationContext,
                                            "BAŞARISIZ",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()

                                    }
                                }

                                FirebaseMessaging.getInstance().subscribeToTopic("manav")
                                    .addOnCompleteListener { task ->

                                        if (task.isSuccessful()) {



                                        } else {
                                            Toast.makeText(
                                                this.applicationContext,
                                                "Başarısız",
                                                Toast.LENGTH_SHORT
                                            )
                                                .show()
                                        }

                                    }.addOnFailureListener { exception ->
                                        Toast.makeText(
                                            applicationContext,
                                            exception.localizedMessage.toString(),
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }

                                Toasty.success(
                                    this.applicationContext,
                                    "MANAV SEÇİLDİ",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                                bac5.setBackgroundColor(Color.GREEN)
                            }
                        }


                            fun market(view: View) {

                                val uuid = UUID.randomUUID()
                                val usermap2 = hashMapOf<String, Any>()

                                val usermap = hashMapOf<String, Any>()
                                usermap.put("useremail", auth.currentUser!!.email.toString())
                                usermap.put("Market", "Market Basti")
                                usermap.put("tarih", Timestamp.now())

                                usermap2.put("userphone", auth.currentUser!!.phoneNumber.toString())
                                usermap2.put("Market", "Market Basti")
                                usermap2.put("tarih", Timestamp.now())

                                db.collection("Users").add(usermap2).addOnCompleteListener { task ->

                                    if (task.isComplete && task.isSuccessful) {

                                    } else {
                                        Toast.makeText(
                                            this.applicationContext,
                                            "Başarısız Tekrar Dene",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }

                                    db.collection("Users").add(usermap)
                                        .addOnCompleteListener { task ->

                                            if (task.isComplete && task.isSuccessful) {

                                            } else {
                                                Toast.makeText(
                                                    this.applicationContext,
                                                    "BAŞARISIZ",
                                                    Toast.LENGTH_SHORT
                                                )
                                                    .show()
                                            }
                                        }


                                    FirebaseMessaging.getInstance().subscribeToTopic("market")
                                        .addOnCompleteListener { task ->

                                            if (task.isSuccessful()) {



                                            } else {
                                                Toast.makeText(
                                                    this.applicationContext,
                                                    "Başarısız",
                                                    Toast.LENGTH_SHORT
                                                )
                                                    .show()
                                            }

                                        }.addOnFailureListener { exception ->
                                            Toast.makeText(
                                                applicationContext,
                                                exception.localizedMessage.toString(),
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }



                                    Toasty.success(
                                        this.applicationContext,
                                        "MARKET SEÇİLDİ",
                                        Toast.LENGTH_SHORT
                                    )
                                        .show()

                                }
                                                bac6.setBackgroundColor(GREEN)
                            }


                                fun sutUrun(view: View) {

                                    val uuid = UUID.randomUUID()
                                    val usermap2 = hashMapOf<String, Any>()

                                    val usermap = hashMapOf<String, Any>()
                                    usermap.put("useremail", auth.currentUser!!.email.toString())
                                    usermap.put("SutUrun", "SutUrun  BASTİ")
                                    usermap.put("tarih", Timestamp.now())

                                    usermap2.put(
                                        "userphone",
                                        auth.currentUser!!.phoneNumber.toString()
                                    )
                                    usermap2.put("SutUrun", "SutUrun Basti")
                                    usermap2.put("tarih", Timestamp.now())

                                    db.collection("Users").add(usermap2)
                                        .addOnCompleteListener { task ->

                                            if (task.isComplete && task.isSuccessful) {

                                            } else {
                                                Toast.makeText(
                                                    this.applicationContext,
                                                    "Başarısız Tekrar Dene",
                                                    Toast.LENGTH_SHORT
                                                )
                                                    .show()
                                            }

                                            db.collection("Users").add(usermap)
                                                .addOnCompleteListener { task ->

                                                    if (task.isComplete && task.isSuccessful) {

                                                    } else {
                                                        Toast.makeText(
                                                            this.applicationContext,
                                                            "Başarısız",
                                                            Toast.LENGTH_SHORT
                                                        )
                                                            .show()
                                                    }

                                                }
                                            FirebaseMessaging.getInstance()
                                                .subscribeToTopic("suturun")
                                                .addOnCompleteListener { task ->

                                                    if (task.isSuccessful()) {


                                                    } else {
                                                        Toast.makeText(
                                                            this.applicationContext,
                                                            "Başarısız",
                                                            Toast.LENGTH_SHORT
                                                        )
                                                            .show()
                                                    }

                                                }.addOnFailureListener { exception ->
                                                    Toast.makeText(
                                                        applicationContext,
                                                        exception.localizedMessage.toString(),
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }


                                            Toasty.success(
                                                this.applicationContext,
                                                "SÜT ÜRÜNLERİ SEÇİLDİ",
                                                Toast.LENGTH_SHORT
                                            )
                                                .show()
                                            bac7.setBackgroundColor(Color.GREEN)
                                        }
                                }


                                    fun organik(view: View) {

                                        val uuid = UUID.randomUUID()
                                        val usermap2 = hashMapOf<String, Any>()

                                        val usermap = hashMapOf<String, Any>()
                                        usermap.put(
                                            "useremail",
                                            auth.currentUser!!.email.toString()
                                        )
                                        usermap.put("Organik", "Organik BASTİ")
                                        usermap.put("tarih", Timestamp.now())

                                        usermap2.put(
                                            "userphone",
                                            auth.currentUser!!.phoneNumber.toString()
                                        )
                                        usermap2.put("Organik", "Organik Basti")
                                        usermap2.put("tarih", Timestamp.now())

                                        db.collection("Users").add(usermap2)
                                            .addOnCompleteListener { task ->

                                                if (task.isComplete && task.isSuccessful) {

                                                } else {
                                                    Toast.makeText(
                                                        this.applicationContext,
                                                        "Başarısız Tekrar Dene",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                        .show()
                                                }

                                                db.collection("Users").add(usermap)
                                                    .addOnCompleteListener { task ->

                                                        if (task.isComplete && task.isSuccessful) {

                                                        } else {
                                                            Toast.makeText(
                                                                this.applicationContext,
                                                                "Başarısız",
                                                                Toast.LENGTH_SHORT
                                                            )
                                                                .show()
                                                        }

                                                    }


                                                FirebaseMessaging.getInstance()
                                                    .subscribeToTopic("organik")
                                                    .addOnCompleteListener { task ->

                                                        if (task.isSuccessful()) {



                                                        } else {
                                                            Toast.makeText(
                                                                this.applicationContext,
                                                                "Başarısız",
                                                                Toast.LENGTH_SHORT
                                                            )
                                                                .show()
                                                        }

                                                    }.addOnFailureListener { exception ->
                                                        Toast.makeText(
                                                            applicationContext,
                                                            exception.localizedMessage.toString(),
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                    }


                                                Toasty.success(
                                                    this.applicationContext,
                                                    "ORGANİK SEÇİLDİ",
                                                    Toast.LENGTH_SHORT
                                                )
                                                    .show()
                                                bac8.setBackgroundColor(Color.GREEN)
                                            }
                                    }


                                        fun emlak(view: View) {

                                            val uuid = UUID.randomUUID()
                                            val usermap2 = hashMapOf<String, Any>()

                                            val usermap = hashMapOf<String, Any>()
                                            usermap.put(
                                                "useremail",
                                                auth.currentUser!!.email.toString()
                                            )
                                            usermap.put("Emlak", "Emlak BASTİ")
                                            usermap.put("tarih", Timestamp.now())

                                            usermap2.put(
                                                "userphone",
                                                auth.currentUser!!.phoneNumber.toString()
                                            )
                                            usermap2.put("Emlak", "Emlak Basti")
                                            usermap2.put("tarih", Timestamp.now())

                                            db.collection("Users").add(usermap2)
                                                .addOnCompleteListener { task ->

                                                    if (task.isComplete && task.isSuccessful) {

                                                    } else {
                                                        Toast.makeText(
                                                            this.applicationContext,
                                                            "Başarısız Tekrar Dene",
                                                            Toast.LENGTH_SHORT
                                                        )
                                                            .show()
                                                    }

                                                    db.collection("Users").add(usermap)
                                                        .addOnCompleteListener { task ->

                                                            if (task.isComplete && task.isSuccessful) {

                                                            } else {
                                                                Toast.makeText(
                                                                    this.applicationContext,
                                                                    "Başarısız",
                                                                    Toast.LENGTH_SHORT
                                                                )
                                                                    .show()
                                                            }

                                                        }

                                                    FirebaseMessaging.getInstance()
                                                        .subscribeToTopic("emlak")
                                                        .addOnCompleteListener { task ->

                                                            if (task.isSuccessful()) {



                                                            } else {
                                                                Toast.makeText(
                                                                    this.applicationContext,
                                                                    "Başarısız",
                                                                    Toast.LENGTH_SHORT
                                                                )
                                                                    .show()
                                                            }

                                                        }.addOnFailureListener { exception ->
                                                            Toast.makeText(
                                                                applicationContext,
                                                                exception.localizedMessage.toString(),
                                                                Toast.LENGTH_SHORT
                                                            ).show()
                                                        }

                                                    Toasty.success(
                                                        this.applicationContext,
                                                        "EMLAK SEÇİLDİ",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                        .show()
                                                    bac9.setBackgroundColor(Color.GREEN)
                                                }
                                        }


                                            fun vasita(view: View) {

                                                val uuid = UUID.randomUUID()
                                                val usermap2 = hashMapOf<String, Any>()

                                                val usermap = hashMapOf<String, Any>()
                                                usermap.put(
                                                    "useremail",
                                                    auth.currentUser!!.email.toString()
                                                )
                                                usermap.put("Vasita", "Vasita BASTİ")
                                                usermap.put("tarih", Timestamp.now())

                                                usermap2.put(
                                                    "userphone",
                                                    auth.currentUser!!.phoneNumber.toString()
                                                )
                                                usermap2.put("Egitim", "Egitim Basti")
                                                usermap2.put("tarih", Timestamp.now())

                                                db.collection("Users").add(usermap2)
                                                    .addOnCompleteListener { task ->

                                                        if (task.isComplete && task.isSuccessful) {

                                                        } else {
                                                            Toast.makeText(
                                                                this.applicationContext,
                                                                "Başarısız Tekrar Dene",
                                                                Toast.LENGTH_SHORT
                                                            )
                                                                .show()
                                                        }

                                                        db.collection("Users").add(usermap)
                                                            .addOnCompleteListener { task ->

                                                                if (task.isComplete && task.isSuccessful) {

                                                                } else {
                                                                    Toast.makeText(
                                                                        this.applicationContext,
                                                                        "Başarısız",
                                                                        Toast.LENGTH_SHORT
                                                                    )
                                                                        .show()
                                                                }

                                                            }

                                                        FirebaseMessaging.getInstance()
                                                            .subscribeToTopic("vasita")
                                                            .addOnCompleteListener { task ->

                                                                if (task.isSuccessful()) {



                                                                } else {
                                                                    Toast.makeText(
                                                                        this.applicationContext,
                                                                        "Başarısız",
                                                                        Toast.LENGTH_SHORT
                                                                    )
                                                                        .show()
                                                                }

                                                            }.addOnFailureListener { exception ->
                                                                Toast.makeText(
                                                                    applicationContext,
                                                                    exception.localizedMessage.toString(),
                                                                    Toast.LENGTH_SHORT
                                                                ).show()
                                                            }

                                                        Toasty.success(
                                                            this.applicationContext,
                                                            "VASITA SEÇİLDİ",
                                                            Toast.LENGTH_SHORT
                                                        )
                                                            .show()
                                                        bac10.setBackgroundColor(Color.GREEN)
                                                    }
                                            }


                                                fun benzin(view: View) {

                                                    val uuid = UUID.randomUUID()
                                                    val usermap2 = hashMapOf<String, Any>()

                                                    val usermap = hashMapOf<String, Any>()
                                                    usermap.put(
                                                        "useremail",
                                                        auth.currentUser!!.email.toString()
                                                    )
                                                    usermap.put("Benzin", "Benzin BASTİ")
                                                    usermap.put("tarih", Timestamp.now())

                                                    usermap2.put(
                                                        "userphone",
                                                        auth.currentUser!!.phoneNumber.toString()
                                                    )
                                                    usermap2.put("Benzin", "Benzin Basti")
                                                    usermap2.put("tarih", Timestamp.now())

                                                    db.collection("Users").add(usermap2)
                                                        .addOnCompleteListener { task ->

                                                            if (task.isComplete && task.isSuccessful) {

                                                            } else {
                                                                Toast.makeText(
                                                                    this.applicationContext,
                                                                    "Başarısız Tekrar Dene",
                                                                    Toast.LENGTH_SHORT
                                                                )
                                                                    .show()
                                                            }

                                                            db.collection("Users").add(usermap)
                                                                .addOnCompleteListener { task ->

                                                                    if (task.isComplete && task.isSuccessful) {

                                                                    } else {
                                                                        Toast.makeText(
                                                                            this.applicationContext,
                                                                            "Başarısız",
                                                                            Toast.LENGTH_SHORT
                                                                        )
                                                                            .show()
                                                                    }

                                                                }

                                                            FirebaseMessaging.getInstance()
                                                                .subscribeToTopic("benzin")
                                                                .addOnCompleteListener { task ->

                                                                    if (task.isSuccessful()) {


                                                                    } else {
                                                                        Toast.makeText(
                                                                            this.applicationContext,
                                                                            "Başarısız",
                                                                            Toast.LENGTH_SHORT
                                                                        )
                                                                            .show()
                                                                    }

                                                                }
                                                                .addOnFailureListener { exception ->
                                                                    Toast.makeText(
                                                                        applicationContext,
                                                                        exception.localizedMessage.toString(),
                                                                        Toast.LENGTH_SHORT
                                                                    ).show()
                                                                }

                                                            Toasty.success(
                                                                this.applicationContext,
                                                                "AKARYAKIT SEÇİLDİ",
                                                                Toast.LENGTH_SHORT
                                                            )
                                                                .show()
                                                            bac11.setBackgroundColor(Color.GREEN)
                                                        }
                                                }


                                                    fun petshop(view: View) {

                                                        val uuid = UUID.randomUUID()
                                                        val usermap2 = hashMapOf<String, Any>()

                                                        val usermap = hashMapOf<String, Any>()
                                                        usermap.put(
                                                            "useremail",
                                                            auth.currentUser!!.email.toString()
                                                        )
                                                        usermap.put("Petshop", "Petshop BASTİ")
                                                        usermap.put("tarih", Timestamp.now())

                                                        usermap2.put(
                                                            "userphone",
                                                            auth.currentUser!!.phoneNumber.toString()
                                                        )
                                                        usermap2.put("Petshop", "Petshop Basti")
                                                        usermap2.put("tarih", Timestamp.now())

                                                        db.collection("Users").add(usermap2)
                                                            .addOnCompleteListener { task ->

                                                                if (task.isComplete && task.isSuccessful) {

                                                                } else {
                                                                    Toast.makeText(
                                                                        this.applicationContext,
                                                                        "Başarısız Tekrar Dene",
                                                                        Toast.LENGTH_SHORT
                                                                    )
                                                                        .show()
                                                                }

                                                                db.collection("Users").add(usermap)
                                                                    .addOnCompleteListener { task ->

                                                                        if (task.isComplete && task.isSuccessful) {

                                                                        } else {
                                                                            Toast.makeText(
                                                                                this.applicationContext,
                                                                                "Başarısız",
                                                                                Toast.LENGTH_SHORT
                                                                            )
                                                                                .show()
                                                                        }

                                                                    }

                                                                FirebaseMessaging.getInstance()
                                                                    .subscribeToTopic("petshop")
                                                                    .addOnCompleteListener { task ->

                                                                        if (task.isSuccessful()) {


                                                                        } else {
                                                                            Toast.makeText(
                                                                                this.applicationContext,
                                                                                "Başarısız",
                                                                                Toast.LENGTH_SHORT
                                                                            )
                                                                                .show()
                                                                        }

                                                                    }
                                                                    .addOnFailureListener { exception ->
                                                                        Toast.makeText(
                                                                            applicationContext,
                                                                            exception.localizedMessage.toString(),
                                                                            Toast.LENGTH_SHORT
                                                                        ).show()
                                                                    }

                                                                Toasty.success(
                                                                    this.applicationContext,
                                                                    "PETSHOP SEÇİLDİ",
                                                                    Toast.LENGTH_SHORT
                                                                )
                                                                    .show()

                                                                bac12.setBackgroundColor(Color.GREEN)
                                                            }
                                                    }


                                                        fun yemek(view: View) {


                                                            val uuid = UUID.randomUUID()
                                                            val usermap2 = hashMapOf<String, Any>()

                                                            val usermap = hashMapOf<String, Any>()
                                                            usermap.put(
                                                                "useremail",
                                                                auth.currentUser!!.email.toString()
                                                            )
                                                            usermap.put("Yemek", "Yemek BASTİ")
                                                            usermap.put("tarih", Timestamp.now())

                                                            usermap2.put(
                                                                "userphone",
                                                                auth.currentUser!!.phoneNumber.toString()
                                                            )
                                                            usermap2.put("Yemek", "Yemek Basti")
                                                            usermap2.put("tarih", Timestamp.now())

                                                            db.collection("Users").add(usermap2)
                                                                .addOnCompleteListener { task ->

                                                                    if (task.isComplete && task.isSuccessful) {

                                                                    } else {
                                                                        Toast.makeText(
                                                                            this.applicationContext,
                                                                            "Başarısız Tekrar Dene",
                                                                            Toast.LENGTH_SHORT
                                                                        )
                                                                            .show()
                                                                    }

                                                                    db.collection("Users")
                                                                        .add(usermap)
                                                                        .addOnCompleteListener { task ->

                                                                            if (task.isComplete && task.isSuccessful) {

                                                                            } else {
                                                                                Toast.makeText(
                                                                                    this.applicationContext,
                                                                                    "Başarısız",
                                                                                    Toast.LENGTH_SHORT
                                                                                )
                                                                                    .show()
                                                                            }

                                                                        }

                                                                    FirebaseMessaging.getInstance()
                                                                        .subscribeToTopic("yemek")
                                                                        .addOnCompleteListener { task ->

                                                                            if (task.isSuccessful()) {


                                                                            } else {
                                                                                Toast.makeText(
                                                                                    this.applicationContext,
                                                                                    "Başarısız",
                                                                                    Toast.LENGTH_SHORT
                                                                                )
                                                                                    .show()
                                                                            }

                                                                        }
                                                                        .addOnFailureListener { exception ->
                                                                            Toast.makeText(
                                                                                applicationContext,
                                                                                exception.localizedMessage.toString(),
                                                                                Toast.LENGTH_SHORT
                                                                            ).show()
                                                                        }

                                                                    Toasty.success(
                                                                        this.applicationContext,
                                                                        "YEMEK SEÇİLDİ",
                                                                        Toast.LENGTH_SHORT
                                                                    )
                                                                        .show()

                                                                    bac13.setBackgroundColor(Color.GREEN)
                                                                }
                                                        }


                                                            fun fitness(view: View) {

                                                                val uuid = UUID.randomUUID()
                                                                val usermap2 =
                                                                    hashMapOf<String, Any>()

                                                                val usermap =
                                                                    hashMapOf<String, Any>()
                                                                usermap.put(
                                                                    "useremail",
                                                                    auth.currentUser!!.email.toString()
                                                                )
                                                                usermap.put(
                                                                    "Fitness",
                                                                    "Fitness BASTİ"
                                                                )
                                                                usermap.put(
                                                                    "tarih",
                                                                    Timestamp.now()
                                                                )

                                                                usermap2.put(
                                                                    "userphone",
                                                                    auth.currentUser!!.phoneNumber.toString()
                                                                )
                                                                usermap2.put(
                                                                    "Egitim",
                                                                    "Egitim Basti"
                                                                )
                                                                usermap2.put(
                                                                    "tarih",
                                                                    Timestamp.now()
                                                                )

                                                                db.collection("Users").add(usermap2)
                                                                    .addOnCompleteListener { task ->

                                                                        if (task.isComplete && task.isSuccessful) {

                                                                        } else {
                                                                            Toast.makeText(
                                                                                this.applicationContext,
                                                                                "Başarısız Tekrar Dene",
                                                                                Toast.LENGTH_SHORT
                                                                            )
                                                                                .show()
                                                                        }

                                                                        db.collection("Users")
                                                                            .add(usermap)
                                                                            .addOnCompleteListener { task ->

                                                                                if (task.isComplete && task.isSuccessful) {

                                                                                } else {
                                                                                    Toast.makeText(
                                                                                        this.applicationContext,
                                                                                        "Başarısız",
                                                                                        Toast.LENGTH_SHORT
                                                                                    )
                                                                                        .show()
                                                                                }

                                                                            }

                                                                        FirebaseMessaging.getInstance()
                                                                            .subscribeToTopic("fitness")
                                                                            .addOnCompleteListener { task ->

                                                                                if (task.isSuccessful()) {


                                                                                } else {
                                                                                    Toast.makeText(
                                                                                        this.applicationContext,
                                                                                        "Başarısız",
                                                                                        Toast.LENGTH_SHORT
                                                                                    )
                                                                                        .show()
                                                                                }

                                                                            }
                                                                            .addOnFailureListener { exception ->
                                                                                Toast.makeText(
                                                                                    applicationContext,
                                                                                    exception.localizedMessage.toString(),
                                                                                    Toast.LENGTH_SHORT
                                                                                ).show()
                                                                            }

                                                                        Toasty.success(
                                                                            this.applicationContext,
                                                                            "FİTNESS SEÇİLDİ",
                                                                            Toast.LENGTH_SHORT
                                                                        )
                                                                            .show()

                                                                        bac14.setBackgroundColor(
                                                                            Color.GREEN
                                                                        )
                                                                    }
                                                            }


                                                                fun next(view: View) {

                                                                    val alert =
                                                                        AlertDialog.Builder(this)
                                                                    alert.setTitle("EMİN MİSİN?")
                                                                    alert.setMessage("EN AZ BİR KATEGORİ SEÇMEN GEREK YOKSA BİLDİRİM ALAMAZSIN!!!")
                                                                    alert.setPositiveButton("EMİNİM!") { dialog, which ->
                                                                        Toasty.info(
                                                                            this.applicationContext,
                                                                            "TEŞEKKÜRLER !! :)",
                                                                            Toast.LENGTH_LONG
                                                                        ).show()
                                                                        finish()
                                                                      //  System.exit(0)

                                                                    }



                                                                    alert.setNegativeButton("EMİNİ DEĞİLİM!") { dialog, which ->

                                                                        Toasty.error(
                                                                            this.applicationContext,
                                                                            "EN AZ BİR KATEGORİ SEÇ!!!!",
                                                                            Toast.LENGTH_LONG
                                                                        ).show()
                                                                    }

                                                                    alert.show()


                                                                }


                                                            }




