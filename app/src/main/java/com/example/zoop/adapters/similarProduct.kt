//package com.example.zoop.adapters
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.similarproducts.databinding.similarProductBinding
//
//class similarProduct(private val list:List<SimilarProducts>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//    inner class MyViewHolder(binding:similarProductBinding): RecyclerView.ViewHolder(binding.root)
//    {
//        val maintv=binding.mainTv
//        val clicknum=binding.clickNum
//        val datestv=binding.datesTv
//        val linktv=binding.tvLink
//
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return MyViewHolder(similarProductBinding.inflate(LayoutInflater.from(parent.context),parent,false))
//    }
//
//    override fun getItemCount(): Int {
//        return list.size
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//
//    }
//}