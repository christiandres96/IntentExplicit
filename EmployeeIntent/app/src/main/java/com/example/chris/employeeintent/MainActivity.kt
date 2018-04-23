package com.example.chris.employeeintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val EMPID = "empid"
const val EMPNAME="empname"
const val EMPSALARY="empsalary"
const val EMPPHONENO="empphoneno"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_button.setOnClickListener{
            val intent=Intent(this,DetailActivity::class.java)
            intent.putExtra(EMPID,emp_id.text.toString())
            intent.putExtra(EMPNAME,emp_name.text.toString())
            intent.putExtra(EMPSALARY,emp_salary.text.toString())
            intent.putExtra(EMPPHONENO,emp_phone_no.text.toString())
            startActivity(intent)

        }
    }
}
