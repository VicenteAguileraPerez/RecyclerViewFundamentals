package com.vicenteaguilera.recyclerviewfundamentals.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vicenteaguilera.recyclerviewfundamentals.R;
import com.vicenteaguilera.recyclerviewfundamentals.models.ItemRecycler;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @SuppressWarnings("unused")
    private static final String TAG = Adapter.class.getSimpleName();
    private static final int ITEM_COUNT = 50;
    private List<ItemRecycler> items;

    public Adapter() {
        super();

        // Create some items
        items = new ArrayList<>();
        for (int i = 0; i < ITEM_COUNT; ++i) {
            items.add(new ItemRecycler("Item " + i, "This is the item number " + i));
        }
    }

    /**
     * onCreateViewHolder(ViewGroup parent, int viewType) should create the view, and return a matching ViewHolder,

     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_layout,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        ItemRecycler itemRecycler = items.get(position);
        holder.title.setText(itemRecycler.getTitle());
        holder.subtitle.setText(itemRecycler.getSubtitle());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
            TextView title;
            TextView subtitle;

            public ViewHolder(View itemView) {
                super(itemView);
                title =  itemView.findViewById(R.id.title);
                subtitle = itemView.findViewById(R.id.subtitle);
            }
        }
}

