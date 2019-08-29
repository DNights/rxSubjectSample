package com.dnights.reactivexsubjectsample

import com.dnights.reactivexsubjectsample.rx.RxSubject
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

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
