plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    js(IR) {
        moduleName = "asteroid-app"
        browser {
            commonWebpackConfig {
                outputFileName = "asteroid-app.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}

compose.experimental {
    web.application {}
}

compose {
    kotlinCompilerPlugin.set("1.5.0")
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.10")
}
