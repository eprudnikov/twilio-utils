package org.example.com.github.eprudnikov.twilio.utils

import com.twilio.rest.api.v2010.account.Call
import java.time.LocalDate

fun main() {
    val today = LocalDate.now().minusDays(2)

    Call.reader().read()
        .setPageSize(50)
        .filter { it.dateUpdated.toLocalDate() == today }
        .forEach {
            println(String.format("%s\t%s", it.sid, it.dateCreated))
        }
}