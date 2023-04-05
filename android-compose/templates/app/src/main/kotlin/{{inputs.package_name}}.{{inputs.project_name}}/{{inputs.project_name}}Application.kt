package {{inputs.package_name}}.{{inputs.project_name}}

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class {{inputs.project_name}}Application : MultiDexApplication()
