package com.aayush.resturant_management_system.RMS.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aayush.resturant_management_system.R
import com.aayush.resturant_management_system.RMS.repository.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return view
    }
//
//    fun getData(){ try {
//
//    }
//    catch (
//
//    )
//    }

//        try{
//            CoroutineScope(Dispatchers.IO).launch {
//                val recentItemRepository = UserRepository() val response = recentItemRepository.getAllRecentItems() if(response.success==true){ val recentitemlist = response.message  BuyerDb.getInstance(requireContext()).getItemListDAO().deleteItem() BuyerDb.getInstance(requireContext()).getItemListDAO().insertItemData(response.message) withContext(Main){  println(response) Toast.makeText(context, "$recentitemlist", Toast.LENGTH_SHORT).show() val adapter = RecentItemsAdapter( recentitemlist as ArrayList<RecentItemsModel>,  requireContext() ) recyclerViewrecentitem.layoutManager = LinearLayoutManager(context) recyclerViewrecentitem.adapter = adapter }  } } }catch (ex: Exception){ Toast.makeText( context,  "Error : ${ex.toString()}", Toast.LENGTH_SHORT  ).show() }
//    }

