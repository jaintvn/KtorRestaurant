package com.sample.feature.menu.controller

import com.sample.core.BaseResponse
import io.ktor.application.*
import io.ktor.util.pipeline.*

interface MenuController {

    suspend fun fetchAllMenuItems(request: PipelineContext<Unit, ApplicationCall>) : BaseResponse<Any>

    suspend fun addMenuItem(request: PipelineContext<Unit, ApplicationCall>) : BaseResponse<Any>

}