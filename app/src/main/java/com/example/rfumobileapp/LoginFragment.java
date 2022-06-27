package com.example.rfumobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.Objects;

public class LoginFragment extends Fragment {
    CallbackFragment callbackFragment;
    private Button lgbtn;
    private TextInputEditText em, inpass;

    List<String> username, password;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        lgbtn = view.findViewById(R.id.loginbutton);

        lgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isEmptFields = false;
//                if(TextUtils.isEmpty(Objects.requireNonNull(em.getText()).toString()))
//                    isEmptFields = true;
//                if(TextUtils.isEmpty(Objects.requireNonNull(inpass.getText()).toString()))
//                    isEmptFields = true;
//                if(!isEmptFields){
//                    checkDataPengurus();
                    startActivity(new Intent(getActivity(), MenuActivity.class));
//                }
            }
        });
        return view;
    }

    private boolean checkDataPengurus() {
        readDataPengurus();
        String usName = Objects.requireNonNull(em.getText()).toString().trim();
        String pass = Objects.requireNonNull(inpass.getText()).toString().trim();
        if ((username.contains(usName) || TextUtils.isEmpty(usName))
                && (password.contains(pass) || TextUtils.isEmpty(pass))){
            return true;
        }
        return false;
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    public void setCallbackFragment(CallbackFragment callbackFragment) {
        this.callbackFragment = callbackFragment;
    }
}