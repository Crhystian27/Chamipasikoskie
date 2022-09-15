package co.zoan.chamipasikoskie.presentation.main

import android.view.LayoutInflater
import androidx.navigation.findNavController
import co.zoan.chamipasikoskie.R
import co.zoan.chamipasikoskie.base.BaseActivity
import co.zoan.chamipasikoskie.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {


    override fun inflateView(inflater: LayoutInflater)=
        ActivityMainBinding.inflate(inflater)

    override fun setUI() {
        binding.mainNavHostFragment.findNavController()
            .setGraph(R.navigation.main_navigation)
    }


}