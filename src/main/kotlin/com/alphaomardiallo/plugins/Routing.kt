package com.alphaomardiallo.plugins

import com.alphaomardiallo.routes.customerRouting
import com.alphaomardiallo.routes.getOrderRoute
import com.alphaomardiallo.routes.listOrdersRoute
import com.alphaomardiallo.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
