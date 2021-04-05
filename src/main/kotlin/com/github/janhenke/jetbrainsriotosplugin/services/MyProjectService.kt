package com.github.janhenke.jetbrainsriotosplugin.services

import com.github.janhenke.jetbrainsriotosplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
