package com.example.chris.employeeintent

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        emp_id_value.setText("EMP ID: "+intent.getStringExtra(EMPID))
        emp_name_value.setText("EMP NAME: "+intent.getStringExtra(EMPNAME))
        emp_salary_value.setText("EMP SALARY: "+intent.getStringExtra(EMPSALARY))
        emp_phone_no_value.setText("EMP PHONE NO: "+intent.getStringExtra(EMPPHONENO))

    }
}
