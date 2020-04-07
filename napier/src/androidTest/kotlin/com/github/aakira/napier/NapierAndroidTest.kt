package com.github.aakira.napier

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class NapierAndroidTest {

    @Test
    fun `Check createStackElementTag`() {
        val debugAntilog = DebugAntilog()

        assertEquals("Hoge", debugAntilog.createStackElementTag("com.github.aakira.napier.Hoge"))
        assertEquals("Hoge2", debugAntilog.createStackElementTag("AA\$com.github.aakira.napier.Hoge2"))
        assertEquals("Hoge3\$default", debugAntilog.createStackElementTag("com.github.aakira.napier.Hoge3\$default"))
        assertNotEquals("default", debugAntilog.createStackElementTag("com.github.aakira.napier.Hoge3\$default"))
    }
}
