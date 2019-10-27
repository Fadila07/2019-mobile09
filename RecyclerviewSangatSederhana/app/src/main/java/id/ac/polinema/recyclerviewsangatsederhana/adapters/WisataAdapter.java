package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.Wisata;

public class WisataAdapter extends
        RecyclerView.Adapter<WisataAdapter.MyView> {
    List<Wisata> wisataList;

    public WisataAdapter(List<Wisata> wisataList) {
        this.wisataList = wisataList;
    }


    @NonNull
    @Override
    public WisataAdapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemwisata = layoutInflater.inflate(R.layout.item_wisata, parent, false);
        MyView view = new MyView(itemwisata);

        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.MyView holder, int position) {
        Wisata w = wisataList.get(position);
        holder.nm.setText(w.getNamawisata());
        holder.alm.setText(w.getAlamat());
        holder.tk.setText(w.getTiket());
        holder.gb.setImageResource(w.getWisata());
    }

    @Override
    public int getItemCount() {
        return (wisataList != null ? wisataList.size() : 0);
    }

    public class MyView extends RecyclerView.ViewHolder {
        public TextView nm;
        public TextView alm;
        public TextView tk;
        public ImageView gb;
        public MyView(@NonNull View itemView) {
            super(itemView);
            nm = itemView.findViewById(R.id.nm);
            alm = itemView.findViewById(R.id.alamat);
            tk = itemView.findViewById(R.id.tiket);
            gb = itemView.findViewById(R.id.gbr);
        }
    }
}
