package com.example.onboardingexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingAdapter(private val onboardingItems: List<OnboardingModel>) :
    RecyclerView.Adapter<OnboardingAdapter.OnboardingItemHolder>() {

    inner class OnboardingItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        val onboardingImage = view.findViewById(R.id.imageOnboarding) as ImageView
        val title = view.findViewById(R.id.txtTitle) as TextView
        val description = view.findViewById(R.id.description) as TextView

        fun bind(onboardingModel: OnboardingModel) {
            onboardingImage.setImageResource(onboardingModel.image)
            title.text = onboardingModel.title
            description.text = onboardingModel.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingItemHolder {
        return OnboardingItemHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_onboarding_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: OnboardingItemHolder, position: Int) {
        holder.bind(onboardingItems[position])
    }

    override fun getItemCount(): Int = onboardingItems.size
}