package com.dnights.reactivexsubjectsample.rx

import io.reactivex.subjects.AsyncSubject
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.ReplaySubject

class RxSubject {

    val asyncSubject = AsyncSubject.create<String>()
    val behaviorSubject = BehaviorSubject.create<String>()
    val publishSubject = PublishSubject.create<String>()
    val replaySubject = ReplaySubject.create<String>()

    fun runOnNextWithAsyncSubject(){
        for (i in 0..100){
            asyncSubject.onNext("asyncSubject onNext $i")
        }

        asyncSubject.onComplete()
    }

    fun runOnNextWithBehaviorSubject(){
        for (i in 0..100){
            behaviorSubject.onNext("behaviorSubject onNext $i")
        }

        behaviorSubject.onComplete()
    }

    fun runOnNextWithPublishSubject(){
        for (i in 0..100){
            publishSubject.onNext("publishSubject onNext $i")
        }

        publishSubject.onComplete()
    }

    fun runOnNextWithReplaySubject(){
        for (i in 0..100){
            replaySubject.onNext("replaySubject onNext $i")
        }

        replaySubject.onComplete()
    }
}