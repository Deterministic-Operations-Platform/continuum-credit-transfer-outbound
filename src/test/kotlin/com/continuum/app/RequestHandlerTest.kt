package com.continuum.app

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestHandlerTest {
    @Test
    fun handlesHealthCheck() {
        val handler = RequestHandler(ProcessingService("continuum-credit-transfer-outbound"))

        assertEquals("continuum-credit-transfer-outbound processed: health-check", handler.handle("health-check"))
    }
}