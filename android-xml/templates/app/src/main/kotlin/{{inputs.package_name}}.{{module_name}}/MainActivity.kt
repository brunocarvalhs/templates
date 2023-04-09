package {{inputs.package_name}}.{{module_name}}

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import {{inputs.package_name}}.commons.BaseActivity
import {{inputs.package_name}}.{{module_name}}.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    lateinit var navController: NavController

    override fun createBinding(inflater: LayoutInflater): ActivityMainBinding =
        ActivityMainBinding.inflate(inflater)

    override fun setupNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(binding.fragmentContainerView.id) as NavHostFragment
        navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(setOf(navController.graph.startDestinationId))
        binding.topAppBar.setupWithNavController(navController, appBarConfiguration)
    }

    override val toolbar: Toolbar
        get() = binding.topAppBar

    override fun showToolbar() {
        toolbar.visibility = View.VISIBLE
    }

    override fun hideToolbar() {
        toolbar.visibility = View.GONE
    }

    override fun defineAppNavigation(setOf: Set<Int>) {
        val appBarConfiguration = AppBarConfiguration(setOf)
        binding.topAppBar.setupWithNavController(navController, appBarConfiguration)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        navController.handleDeepLink(intent)
    }
}