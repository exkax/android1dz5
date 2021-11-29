package com.example.android1dz5;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1dz5.databinding.Fragment2Binding;

import java.util.ArrayList;


public class Fragment2 extends Fragment implements Adapter.OnItemClickListener {
    private Fragment2Binding binding;
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<ModelOfItem> arrayList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment2Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();


    }

    private void initRecycler() {
       recyclerView = binding.recyclerView;
       adapter = new Adapter();
       adapter.setArrayList(addList(),this);
       recyclerView.setAdapter(adapter);
    }

    private ArrayList<ModelOfItem> addList() {
        arrayList = new ArrayList<>();
        arrayList.add(new ModelOfItem("1", "You will be my girl", "girl in red", "3.24"));
        arrayList.add(new ModelOfItem("2", "Everything i wanted", "Billie Eilish", "4.00"));
        arrayList.add(new ModelOfItem("3", "Him and I", "Halsey", "3.56"));
        arrayList.add(new ModelOfItem("4", "Still with you", "Jungook", "4.24"));
        arrayList.add(new ModelOfItem("5", "Don't be so shy", "Imany", "3.14"));
        arrayList.add(new ModelOfItem("6", "Dask till dawn", "Zayn feat.Sia", "3.24"));
        arrayList.add(new ModelOfItem("7", "You will be my girl", "girl in red", "3.24"));
        arrayList.add(new ModelOfItem("8", "You will be my girl", "girl in red", "3.24"));
        arrayList.add(new ModelOfItem("9", "You will be my girl", "girl in red", "3.24"));
        arrayList.add(new ModelOfItem("10", "You will be my girl", "girl in red", "3.24"));

        return  arrayList;

    }


    @Override
    public void onclick(int p) {
        Intent intent = new Intent(requireContext(), SecondMainActivity.class);
        startActivity(intent);

    }
}