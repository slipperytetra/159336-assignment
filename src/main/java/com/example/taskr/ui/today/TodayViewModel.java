package com.example.taskr.ui.today;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TodayViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TodayViewModel() {
        //if today is empty
        mText = new MutableLiveData<>();
        mText.setValue("Nothing planned for today.\nSit back and relax");
    }

    public LiveData<String> getText() {
        return mText;
    }
}