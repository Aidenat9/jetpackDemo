package com.github.aiden.jetpackdemoapplication


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import kotlinx.android.synthetic.main.fragment_register.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RegisterFragment : Fragment() {
    private lateinit var mContext: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context!!
    }

    final val TAG: String = "registerfragment>>>"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val string = arguments?.getString("args")
        string?.apply {
            Log.e(TAG, string)
        }
        btn_tologin.setOnClickListener {
            val navOptions = navOptions{
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }
            val bdl = Bundle()
            bdl.putString("args","register 2 login...")
            findNavController().navigate(R.id.login,bdl,navOptions)
        }
    }

}
