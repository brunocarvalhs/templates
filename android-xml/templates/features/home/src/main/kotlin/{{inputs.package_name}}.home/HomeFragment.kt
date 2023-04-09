package {{inputs.package_name}}.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import {{inputs.package_name}}.commons.BaseFragment
import {{inputs.package_name}}.{{module_name}}.home.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, attachToParent)

    override fun viewObservation() {

    }

    override fun argumentsView(arguments: Bundle) {

    }

    override fun initView() {

    }

    override fun loading() {

    }
}