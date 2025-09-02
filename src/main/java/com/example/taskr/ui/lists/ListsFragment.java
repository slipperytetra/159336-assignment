package com.example.taskr.ui.lists;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.taskr.databinding.FragmentListsBinding;

public class ListsFragment extends Fragment {

    private FragmentListsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ListsViewModel slideshowViewModel =
                new ViewModelProvider(this).get(ListsViewModel.class);

        binding = FragmentListsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLists;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}