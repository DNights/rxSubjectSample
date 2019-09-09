package com.dnights.reactivexsubjectsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dnights.reactivexsubjectsample.rx.RxSubject
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val disposables by lazy {
        CompositeDisposable()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rxSubject = RxSubject()

        button_run.setOnClickListener {
            rxSubject.runOnNextWithAsyncSubject()
        }

        rxSubject.asyncSubject
            .subscribeOn(AndroidSchedulers.mainThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                textView.text = it
            }.apply { disposables.add(this) }
    }

    override fun onDestroy() {
        disposables.clear()
        super.onDestroy()
    }
}
