package org.example.com.github.eprudnikov.twilio.utils

import com.github.eprudnikov.twilio.utils.commands.ListCallsCommand
import kotlinx.cli.ArgParser

fun main(args: Array<String>) {
    val parser = ArgParser("twilio-utils")
    val listCallsCommand = ListCallsCommand("list-calls", "List calls matching the given criteria")
    parser.subcommands(listCallsCommand)

    parser.parse(args)


}