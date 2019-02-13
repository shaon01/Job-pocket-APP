package com.example.jobpocket;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class RVCompanyAdptr extends RecyclerView.Adapter<RVCompanyAdptr.CompanyViewHolder>{

    public static class CompanyViewHolder extends RecyclerView.ViewHolder{
        CardView    cardView;
        TextView    companyName;
        ImageView   companyIcon;

        CompanyViewHolder(View itemView){
            super(itemView);
            cardView    = itemView.findViewById(R.id.cv_company);
            companyName = itemView.findViewById(R.id.company_name);
            companyIcon = itemView.findViewById(R.id.company_photo);
        }
    }

    List<CompanyBio> companyBios;

    RVCompanyAdptr(List<CompanyBio> companyBios){
        this.companyBios = companyBios;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public CompanyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View cvh = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.all_company_view_activity, viewGroup, false);
        CompanyViewHolder companyViewHolder = new CompanyViewHolder(cvh);
        return companyViewHolder;
    }

    @Override
    public void onBindViewHolder(CompanyViewHolder companyViewHolder, int i){
        companyViewHolder.companyName.setText(companyBios.get(i).companyName);
        companyViewHolder.companyIcon.setImageResource(companyBios.get(i).companyIcon);
    }

    @Override
    public int getItemCount(){
        return companyBios.size();
    }
    //end of class
}
