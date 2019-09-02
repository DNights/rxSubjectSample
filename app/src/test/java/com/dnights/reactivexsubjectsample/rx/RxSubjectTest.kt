package com.dnights.reactivexsubjectsample.rx

import io.reactivex.android.schedulers.AndroidSchedulers
import org.junit.Assert.*
import org.junit.Test
import java.util.concurrent.TimeUnit

class RxSubjectTest {
    @Test
    fun asyncSubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.runOnNextWithAsyncSubject()

        rxSubject.asyncSubject
            .subscribe{
                println(it)
            }
    }

    @Test
    fun behaviorSubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.behaviorSubject
            .subscribe {
                println(it)
            }

        rxSubject.runOnNextWithBehaviorSubject()
    }

    @Test
    fun publishSubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.runOnNextWithPublishSubject()

        rxSubject.publishSubject
            .debounce(100L, TimeUnit.MILLISECONDS)
            .subscribe{
                println()
            }
    }

    @Test
    fun replaySubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.replaySubject
            .subscribe {
                println()
            }

        rxSubject.runOnNextWithReplaySubject()
    }

}