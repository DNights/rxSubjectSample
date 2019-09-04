package com.dnights.reactivexsubjectsample.rx

import io.reactivex.disposables.CompositeDisposable
import org.junit.After
import org.junit.Assert.*
import org.junit.Test
import java.util.concurrent.TimeUnit

class RxSubjectTest {

    private val disposables by lazy {
        CompositeDisposable()
    }

    @After
    fun disposerbleRxSubject(){
        disposables.clear()
    }

    @Test
    fun asyncSubjectTest(){
        val rxSubject = RxSubject()

        rxSubject.asyncSubject
            .doOnComplete {
                println("asyncSubjectTest doOnComplete")
            }
            .doOnSubscribe {
                println("asyncSubjectTest doOnSubscribe")
            }
            .doOnDispose {
                println("asyncSubjectTest doOnDispose")
            }
            .subscribe{
                println(it)
            }.apply { disposables.add(this) }

        rxSubject.runOnNextWithAsyncSubject()
    }

    @Test
    fun behaviorSubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.behaviorSubject
            .doOnComplete {
                println("behaviorSubjectTest doOnComplete")
            }
            .doOnSubscribe {
                println("behaviorSubjectTest doOnSubscribe")
            }
            .doOnDispose {
                println("behaviorSubjectTest doOnDispose")
            }
            .subscribe {
                println(it)
            }.apply { disposables.add(this) }

        rxSubject.runOnNextWithBehaviorSubject()
    }

    @Test
    fun publishSubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.publishSubject
            .debounce(100L, TimeUnit.MILLISECONDS)
            .doOnComplete {
                println("publishSubjectTest doOnComplete")
            }
            .doOnSubscribe {
                println("publishSubjectTest doOnSubscribe")
            }
            .doOnDispose {
                println("publishSubjectTest doOnDispose")
            }
            .subscribe{
                println(it)
            }.apply { disposables.add(this) }

        rxSubject.runOnNextWithPublishSubject()
    }

    @Test
    fun replaySubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.replaySubject
            .doOnComplete {
                println("replaySubjectTest doOnComplete")
            }
            .doOnSubscribe {
                println("replaySubjectTest doOnSubscribe")
            }
            .doOnDispose {
                println("replaySubjectTest doOnDispose")
            }
            .subscribe {
                println(it)
            }.apply { disposables.add(this) }

        rxSubject.runOnNextWithReplaySubject()
    }

}