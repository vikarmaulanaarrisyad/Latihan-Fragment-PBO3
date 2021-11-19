package com.nim19041156.flexiblefragmentapp5h

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.nim19041156.flexiblefragmentapp5h.R.id.btn_category


class HomeFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnCategory: Button = view.findViewById(btn_category)
        btnCategory.setOnClickListener(this)
    }
    override fun onClick(p0: View) {
        if (p0.id == btn_category) {
            val mCategoryFragment = CategoryFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.container, mCategoryFragment,
                    CategoryFragment::class.java.simpleName)
                addToBackStack(null)

                commit()

            }
        }
    }
}