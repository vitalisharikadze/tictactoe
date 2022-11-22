package com.example.tictac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var player = "p1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_00.setOnClickListener {
            buttonClick(button_00)
        }
        button_01.setOnClickListener {
            buttonClick(button_01)
        }
        button_02.setOnClickListener {
            buttonClick(button_02)
        }
        button_10.setOnClickListener {
            buttonClick(button_10)
        }
        button_11.setOnClickListener {
            buttonClick(button_11)
        }
        button_12.setOnClickListener {
            buttonClick(button_12)
        }
        button_20.setOnClickListener {
            buttonClick(button_20)
        }
        button_21.setOnClickListener {
            buttonClick(button_21)
        }
        button_22.setOnClickListener {
            buttonClick(button_22)
        }
        reset_button.setOnClickListener {
            reset()
        }

    }

    fun buttonClick(btn: Button) {
        if (btn.text == "") {
            if (player == "p1") {
                player = "p2"
                btn.text = "X"
            } else {
                player = "p1"
                btn.text = "O"
            }
        }
        win()
    }

    fun win() {
        if ((button_00.text == "X" && button_01.text == "X" && button_02.text == "X")
            || (button_10.text == "X" && button_11.text == "X" && button_12.text == "X")
            || (button_20.text == "X" && button_21.text == "X" && button_22.text == "X")
            || (button_00.text == "X" && button_11.text == "X" && button_22.text == "X")
            || (button_02.text == "X" && button_11.text == "X" && button_20.text == "X")
            || (button_00.text == "X" && button_10.text == "X" && button_20.text == "X")
            || (button_01.text == "X" && button_11.text == "X" && button_21.text == "X")
            || (button_02.text == "X" && button_12.text == "X" && button_22.text == "X")
        ) {
            toast("X won the game")
            disableButton()
        } else if ((button_00.text == "O" && button_01.text == "O" && button_02.text == "O")
            || (button_10.text == "O" && button_11.text == "O" && button_12.text == "O")
            || (button_20.text == "O" && button_21.text == "O" && button_22.text == "O")
            || (button_00.text == "O" && button_11.text == "O" && button_22.text == "O")
            || (button_02.text == "O" && button_11.text == "O" && button_20.text == "O")
            || (button_00.text == "O" && button_10.text == "O" && button_20.text == "O")
            || (button_01.text == "O" && button_11.text == "O" && button_21.text == "O")
            || (button_02.text == "O" && button_12.text == "O" && button_22.text == "O")
        ) {
            toast("O won the game")
            disableButton()
        }
        else{
            if (button_00.text !="" && button_01.text !="" && button_02.text !="" && button_10.text !=""
                && button_11.text !="" && button_12.text !="" && button_20.text !=""
                && button_21.text !="" && button_22.text !="" )
                toast("Tie game")
        }
    }


        fun toast(msg: String) {
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_LONG).show()
        }

        fun reset() {
            button_00.text = ""
            button_01.text = ""
            button_02.text = ""
            button_10.text = ""
            button_11.text = ""
            button_12.text = ""
            button_20.text = ""
            button_21.text = ""
            button_22.text = ""
            button_00.isEnabled=true
            button_01.isEnabled=true
            button_02.isEnabled=true
            button_10.isEnabled=true
            button_11.isEnabled=true
            button_12.isEnabled=true
            button_20.isEnabled=true
            button_21.isEnabled=true
            button_22.isEnabled=true
        }

    fun disableButton(){
        button_00.isEnabled=false
        button_01.isEnabled=false
        button_02.isEnabled=false
        button_10.isEnabled=false
        button_11.isEnabled=false
        button_12.isEnabled=false
        button_20.isEnabled=false
        button_21.isEnabled=false
        button_22.isEnabled=false
    }
    }

