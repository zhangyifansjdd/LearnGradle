package com.zyf

import org.gradle.api.Plugin
import org.gradle.api.Project

class ZyfPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println 'ZyfPlugin被应用了！'

        project.task('testTask') << {
            println '任务testTAsk执行了！'
        }
    }
}


