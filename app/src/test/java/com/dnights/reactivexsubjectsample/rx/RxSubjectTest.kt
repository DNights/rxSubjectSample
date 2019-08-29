package com.dnights.reactivexsubjectsample.rx

import org.junit.Assert.*
import org.junit.Test

class RxSubjectTest {
    @Test
    fun rxSubjectTest(){

        val rxSubject = RxSubject()

        rxSubject.runOnNext()

        rxSubject.asyncSubject
            .subscribe{
                println(it)
            }

        rxSubject.behaviorSubject
            .subscribe {
                println(it)
            }

        rxSubject.publishSubject
            .subscribe{
                println()
            }

        rxSubject.replaySubject
            .subscribe {
                println()
            }
    }

    @Test
    fun rxSubjectTest2(){

        val rxSubject = RxSubject()

        rxSubject.asyncSubject
            .subscribe{
                println(it)
            }

        rxSubject.behaviorSubject
            .subscribe {
                println(it)
            }

        rxSubject.publishSubject
            .subscribe{
                println()
            }

        rxSubject.replaySubject
            .subscribe {
                println()
            }

        rxSubject.runOnNext()
    }
}