package com.dadashovaaytaj.gardenx;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {

    Context context;
    ArrayList<Model> arraylistModel = new ArrayList<Model>() ;


    public ImageAdapter(Context context, ArrayList<Model> arraylistModel)
    {
        this.context=context;
        this.arraylistModel=arraylistModel;

    }


    @Override
    public int getCount() {
        return arraylistModel.size();
    }

    @Override
    public Object getItem(int position) {
        return arraylistModel.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final Model row = (Model) getItem(position);
        final ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.grid_item,parent,false);
            holder.flowImg = convertView.findViewById(R.id.flower_image);
            holder.flowName = convertView.findViewById(R.id.flower_name);
            holder.btn = convertView.findViewById(R.id.goButton);

            holder.btn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    int newPosition = (int) holder.btn.getTag();
                    Model userNew = (Model) getItem(newPosition);
                   openNewActivity(userNew.getFlowerName(),userNew.getimgId());
                }
            });

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.flowName.setText(row.getFlowerName());
        if (row.getFlowerName().equals("Jemy")) holder.flowImg.setImageResource(R.drawable.first);
        else if(row.getFlowerName().equals("Lake")) holder.flowImg.setImageResource(R.drawable.second);
        else if(row.getFlowerName().equals("Narcis")) holder.flowImg.setImageResource(R.drawable.third);
        else if(row.getFlowerName().equals("Rozz")) holder.flowImg.setImageResource(R.drawable.fourth);
        else if(row.getFlowerName().equals("Yumi")) holder.flowImg.setImageResource(R.drawable.fifth);
        else if(row.getFlowerName().equals("Sevic")) holder.flowImg.setImageResource(R.drawable.sixth);
        else if(row.getFlowerName().equals("Brun")) holder.flowImg.setImageResource(R.drawable.seventh);
        else if(row.getFlowerName().equals("Eva")) holder.flowImg.setImageResource(R.drawable.eighth);

        holder.btn.setTag(position);
        return convertView;
    }

    private void openNewActivity(String nameOfPictures,int idOfPictures)
    {
        Intent intent = new Intent(context,ProfileActivity.class);
        intent.putExtra("chosenName",nameOfPictures);
        intent.putExtra("ID",idOfPictures);
        context.startActivity(intent);
    }

}

class ViewHolder
{
    ImageView flowImg;
    TextView flowName;
    Button btn;
}