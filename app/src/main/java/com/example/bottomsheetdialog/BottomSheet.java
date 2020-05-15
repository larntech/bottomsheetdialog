package com.example.bottomsheetdialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BottomSheet extends BottomSheetDialogFragment {

    public BottomSheet() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     final View view1 = inflater.inflate(R.layout.row_add_item,container,false);

        Button btnAdd = view1.findViewById(R.id.btnAddItem);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edName = view1.findViewById(R.id.itemName);


                if(!TextUtils.isEmpty(edName.getText().toString())){
                    String itemName = edName.getText().toString();
                    startActivity(new Intent(getContext(),ItemNameActivity.class).putExtra("data",itemName));
                    dismiss();


                }else{
                    Toast.makeText(getContext(), "Name required ", Toast.LENGTH_LONG).show();
                }



            }
        });

      return view1;
    }
}
