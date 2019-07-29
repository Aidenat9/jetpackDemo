package com.github.aiden.jetpackdemoapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.github.aiden.jetpackdemoapplication.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * 简单实用navigation管理fragment
 *
 */
class HomeFragment : Fragment() {
    private lateinit var homeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return homeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            val navOptions = navOptions {
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }
            val bdl = Bundle()
            bdl.putString("args", "login...")
            findNavController().navigate(R.id.login, bdl, navOptions)
        }
        btn_register.setOnClickListener {
            val navOptions = navOptions {
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }
            val bdl = Bundle()
            bdl.putString("args", "register...")
            findNavController().navigate(R.id.register, bdl, navOptions)
        }
//        val bean = HomeEntity()
//        bean.age = 12
//        bean.name = "李磊"
//        bean.des = "三好学生"
//        homeBinding.homebean = bean
        homeBinding.tvDatabind.text = "覆盖值"
    }


}
