package {{inputs.package_name}}.commons

import androidx.appcompat.widget.Toolbar

interface ManagerToolbar {
    val toolbar: Toolbar

    fun showToolbar()
    fun hideToolbar()

    fun defineAppNavigation(setOf: Set<Int>)
}
