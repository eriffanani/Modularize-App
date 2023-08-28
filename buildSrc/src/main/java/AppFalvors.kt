import org.gradle.api.JavaVersion

object Flavors {

    const val sdkMin = 21
    const val sdkTarget = 34
    const val jvmVersion = "17"
    val javaVersion by lazy { JavaVersion.VERSION_17 }

}