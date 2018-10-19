package com.capsule.exal

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioGroup

class Activity_A : AppCompatActivity() {

  private var rgMode: RadioGroup? = null
  private var rgTarget: RadioGroup? = null
  private var btnStart: Button? = null

  private var mode: Int = 0
  private var target: Int = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_activity)
    title = javaClass.simpleName
    rgMode = findViewById(R.id.rgMode)
    rgTarget = findViewById(R.id.rgTarget)

    rgMode?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_mode0 -> mode = 0
        R.id.btn_mode1 -> mode = 1
        R.id.btn_mode2 -> mode = 2
        R.id.btn_mode3 -> mode = 3
      }
    }
    rgTarget?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_target0 -> target = 0
        R.id.btn_target1 -> target = 1
        R.id.btn_target2 -> target = 2
        R.id.btn_target3 -> target = 3
      }
    }

    btnStart = findViewById(R.id.btnStart)
    btnStart?.setOnClickListener {
      val intent = Intent()
      val cls: Class<*> = when (target) {
        0 -> Activity_A::class.java
        1 -> Activity_B::class.java
        2 -> Activity_C::class.java
        3 -> Activity_D::class.java
        else -> Activity_A::class.java
      }
      intent.setClass(this, cls)
      when (mode) {
        0 -> intent.flags
        1 -> intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        2 -> intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        3 -> intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      }
      startActivity(intent)
    }
  }

}

class Activity_B : AppCompatActivity() {

  private var rgMode: RadioGroup? = null
  private var rgTarget: RadioGroup? = null
  private var btnStart: Button? = null

  private var mode: Int = 0
  private var target: Int = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_activity)
    title = javaClass.simpleName
    rgMode = findViewById(R.id.rgMode)
    rgTarget = findViewById(R.id.rgTarget)

    rgMode?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_mode0 -> mode = 0
        R.id.btn_mode1 -> mode = 1
        R.id.btn_mode2 -> mode = 2
        R.id.btn_mode3 -> mode = 3
      }
    }
    rgTarget?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_target0 -> target = 0
        R.id.btn_target1 -> target = 1
        R.id.btn_target2 -> target = 2
        R.id.btn_target3 -> target = 3
      }
    }

    btnStart = findViewById(R.id.btnStart)
    btnStart?.setOnClickListener {
      val intent = Intent()
      val cls: Class<*> = when (target) {
        0 -> Activity_A::class.java
        1 -> Activity_B::class.java
        2 -> Activity_C::class.java
        3 -> Activity_D::class.java
        else -> Activity_A::class.java
      }
      intent.setClass(this, cls)
      when (mode) {
        0 -> intent.flags
        1 -> intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        2 -> intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        3 -> intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      }
      startActivity(intent)
    }


  }

}

class Activity_C : AppCompatActivity() {

  private var rgMode: RadioGroup? = null
  private var rgTarget: RadioGroup? = null
  private var btnStart: Button? = null

  private var mode: Int = 0
  private var target: Int = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_activity)
    title = javaClass.simpleName
    rgMode = findViewById(R.id.rgMode)
    rgTarget = findViewById(R.id.rgTarget)

    rgMode?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_mode0 -> mode = 0
        R.id.btn_mode1 -> mode = 1
        R.id.btn_mode2 -> mode = 2
        R.id.btn_mode3 -> mode = 3
      }
    }
    rgTarget?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_target0 -> target = 0
        R.id.btn_target1 -> target = 1
        R.id.btn_target2 -> target = 2
        R.id.btn_target3 -> target = 3
      }
    }

    btnStart = findViewById(R.id.btnStart)
    btnStart?.setOnClickListener {
      val intent = Intent()
      val cls: Class<*> = when (target) {
        0 -> Activity_A::class.java
        1 -> Activity_B::class.java
        2 -> Activity_C::class.java
        3 -> Activity_D::class.java
        else -> Activity_A::class.java
      }
      intent.setClass(this, cls)
      when (mode) {
        0 -> intent.flags
        1 -> intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        2 -> intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        3 -> intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      }
      startActivity(intent)
    }


  }

}

class Activity_D : AppCompatActivity() {

  private var rgMode: RadioGroup? = null
  private var rgTarget: RadioGroup? = null
  private var btnStart: Button? = null

  private var mode: Int = 0
  private var target: Int = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_activity)
    title = javaClass.simpleName
    rgMode = findViewById(R.id.rgMode)
    rgTarget = findViewById(R.id.rgTarget)

    rgMode?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_mode0 -> mode = 0
        R.id.btn_mode1 -> mode = 1
        R.id.btn_mode2 -> mode = 2
        R.id.btn_mode3 -> mode = 3
      }
    }
    rgTarget?.setOnCheckedChangeListener { group, checkedId ->
      when (checkedId) {
        R.id.btn_target0 -> target = 0
        R.id.btn_target1 -> target = 1
        R.id.btn_target2 -> target = 2
        R.id.btn_target3 -> target = 3
      }
    }

    btnStart = findViewById(R.id.btnStart)
    btnStart?.setOnClickListener {
      val intent = Intent()
      val cls: Class<*> = when (target) {
        0 -> Activity_A::class.java
        1 -> Activity_B::class.java
        2 -> Activity_C::class.java
        3 -> Activity_D::class.java
        else -> Activity_A::class.java
      }
      intent.setClass(this, cls)
      when (mode) {
        0 -> intent.flags
        1 -> intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        2 -> intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        3 -> intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      }
      startActivity(intent)
    }


  }

}