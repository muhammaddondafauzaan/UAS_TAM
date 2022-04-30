package com.example.rfumobileapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.Objects;

public class RegisterFragment extends Fragment {
    CallbackFragment callbackFragment;
    private Button regbtn;
    private TextInputEditText emReg, inpassReg;

    List<String> username, password;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        regbtn = view.findViewById(R.id.regbutton);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                boolean isEmptFields = false;
//                if(TextUtils.isEmpty(Objects.requireNonNull(em.getText()).toString())){
//                    isEmptFields = true;
//                }
//                if(TextUtils.isEmpty(Objects.requireNonNull(inpass.getText()).toString())){
//                    isEmptFields = true;
//                }
//                if(!isEmptFields){
//                    startActivity(new Intent(getActivity(), MenuActivity.class));
//                }
                startActivity(new Intent(getActivity(), MenuActivity.class));
            }
        });

        return view;
    }

    private void checkDataPengurus() {
        readDataPengurus();
        String usName = Objects.requireNonNull(emReg.getText()).toString().trim();
        String pass = Objects.requireNonNull(inpassReg.getText()).toString().trim();
        if (username.contains(usName) || TextUtils.isEmpty(usName)){
            if (password.contains(pass) || TextUtils.isEmpty(pass)){

            } else {
            }
        } else {
        }
    }

    private void readDataPengurus(){
        String url = "https://github.com/bikashthapa01/excel-reader-android-app/blob/master/story.xls?raw=true";
//        client = new AsyncHttpClient();
//        client.get(url, new FileAsyncHttpResponseHandler(this) {
//            @Override
//            public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {
//                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, File file) {
//                WorkbookSettings ws = new WorkbookSettings();
//                ws.setGCDisabled(true);
//                if (file != null){
//                    try {
//                        workbook = workbook.getWorkbook(file);
//                        Sheet sheet = workbook.getSheet(0);
//                        for (int i=0; i < sheet.getRows();i++){
//                            Cell[] row = sheet.getRow(i);
//                            username.add(row[0].getContents());
//                            password.add(row[1].getContents());
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    } catch (BiffException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
    }
}