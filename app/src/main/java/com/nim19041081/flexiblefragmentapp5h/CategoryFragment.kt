package com.nim19041081.flexiblefragmentapp5h

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class CategoryFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnDetailCategory: Button = view.findViewById(R.id.btn_detail_category)
        btnDetailCategory.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.btn_detail_category) {
            val detailcategory = DetailCategoryFragment()

            val mBundle = Bundle()
            mBundle.putString(DetailCategoryFragment.EXTRA_NAME, "Lifestyle")
            val description = "Kategori ini akan berisi produk-produk lifestyle"
            detailcategory.arguments = mBundle
            detailcategory.description = description
            val mFragmentManager = parentFragmentManager

            mFragmentManager.beginTransaction().apply {
                replace(R.id.container, detailcategory,
                    DetailCategoryFragment::class.java.simpleName)
                addToBackStack(null)

                commit()

            }
        }
    }
}