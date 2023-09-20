plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm {
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                //having some issue with runnign on that, otherwise we dont need that
                implementation(compose.desktop.macos_arm64)
                implementation(project(":shared"))
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "main"
    }
}

compose {
    kotlinCompilerPlugin.set("1.5.0")
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.10")
}