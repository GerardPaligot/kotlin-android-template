object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 30
    const val COMPILE_SDK_VERSION = 30
}

object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.2"
    const val ANDROIDX_TEST = "1.3.0"
    const val APPCOMPAT = "1.2.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val CORE_KTX = "1.3.2"
    const val ESPRESSO_CORE = "3.3.0"
    const val JUNIT = "4.13.2"
    const val KTLINT = "0.40.0"
    const val COMPOSE = "1.0.0-beta04"
    const val COMPOSE_ACTIVITY = "1.3.0-alpha05"
}

object BuildPluginsVersion {
    const val DETEKT = "1.16.0"
    const val KTLINT = "10.0.0"
    const val VERSIONS_PLUGIN = "0.38.0"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
}

object ComposeLibs {
    const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val COMPOSE_TEST_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}
