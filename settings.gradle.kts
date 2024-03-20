pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Lesson2"
include(":app")
include(":app:activitylifecycle")
include(":multiactivity")
include(":app:intentfilter")
include(":app:toastapp")
include(":app:notificationapp")
include(":app:dialog")
