package com.dnights.reactivexsubjectsample.rx

import io.reactivex.subjects.AsyncSubject
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.ReplaySubject
import java.util.concurrent.TimeUnit

class RxSubject {

    val asyncSubject = AsyncSubject.create<String>()
    val behaviorSubject = BehaviorSubject.create<String>()
    val publishSubject = PublishSubject.create<String>()
    val replaySubject = ReplaySubject.create<String>()


    fun runOnNext(){
        for (i in 0..100){
            val onNextString = "onNext $i"
            asyncSubject.onNext("asyncSubject$onNextString")
            behaviorSubject.onNext("behaviorSubject$onNextString")
            publishSubject.onNext("publishSubject$onNextString")
            replaySubject.onNext("replaySubject$onNextString")
        }
    }

}