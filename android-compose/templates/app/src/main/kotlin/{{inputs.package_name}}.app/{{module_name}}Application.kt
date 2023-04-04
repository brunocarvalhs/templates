package {{inputs.package_name}}.{{module_name}}

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class {{module_name}}Application : MultiDexApplication()
