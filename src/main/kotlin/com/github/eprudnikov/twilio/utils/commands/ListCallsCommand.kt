package com.github.eprudnikov.twilio.utils.commands

import com.twilio.rest.api.v2010.account.Call
import kotlinx.cli.Subcommand
import java.time.LocalDate

class ListCallsCommand(name: String, description: String) : Subcommand(name, description) {
    override fun execute() {
        val today = LocalDate.now()

        Call.reader().read()
            .setPageSize(50)
            .filter { it.dateUpdated.toLocalDate() == today }
            .forEach {
                println(String.format("%s\t%s", it.sid, it.dateCreated))
            }
    }
}