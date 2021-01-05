// Generated by view binder compiler. Do not edit!
package com.zarkasihakhmad_18102217.praktikum9.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.zarkasihakhmad_18102217.praktikum9.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingPreferenceBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final EditText edtAge;

  @NonNull
  public final EditText edtEmail;

  @NonNull
  public final EditText edtName;

  @NonNull
  public final EditText edtPhone;

  @NonNull
  public final RadioButton rbNo;

  @NonNull
  public final RadioButton rbYes;

  @NonNull
  public final RadioGroup rgLoveMu;

  private ActivitySettingPreferenceBinding(@NonNull ScrollView rootView, @NonNull Button btnSave,
      @NonNull EditText edtAge, @NonNull EditText edtEmail, @NonNull EditText edtName,
      @NonNull EditText edtPhone, @NonNull RadioButton rbNo, @NonNull RadioButton rbYes,
      @NonNull RadioGroup rgLoveMu) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.edtAge = edtAge;
    this.edtEmail = edtEmail;
    this.edtName = edtName;
    this.edtPhone = edtPhone;
    this.rbNo = rbNo;
    this.rbYes = rbYes;
    this.rgLoveMu = rgLoveMu;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingPreferenceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingPreferenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setting_preference, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingPreferenceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_save;
      Button btnSave = rootView.findViewById(id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.edt_age;
      EditText edtAge = rootView.findViewById(id);
      if (edtAge == null) {
        break missingId;
      }

      id = R.id.edt_email;
      EditText edtEmail = rootView.findViewById(id);
      if (edtEmail == null) {
        break missingId;
      }

      id = R.id.edt_name;
      EditText edtName = rootView.findViewById(id);
      if (edtName == null) {
        break missingId;
      }

      id = R.id.edt_phone;
      EditText edtPhone = rootView.findViewById(id);
      if (edtPhone == null) {
        break missingId;
      }

      id = R.id.rb_no;
      RadioButton rbNo = rootView.findViewById(id);
      if (rbNo == null) {
        break missingId;
      }

      id = R.id.rb_yes;
      RadioButton rbYes = rootView.findViewById(id);
      if (rbYes == null) {
        break missingId;
      }

      id = R.id.rg_love_mu;
      RadioGroup rgLoveMu = rootView.findViewById(id);
      if (rgLoveMu == null) {
        break missingId;
      }

      return new ActivitySettingPreferenceBinding((ScrollView) rootView, btnSave, edtAge, edtEmail,
          edtName, edtPhone, rbNo, rbYes, rgLoveMu);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
