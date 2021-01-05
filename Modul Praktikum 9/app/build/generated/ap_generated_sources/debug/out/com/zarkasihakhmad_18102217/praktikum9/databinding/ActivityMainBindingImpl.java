package com.zarkasihakhmad_18102217.praktikum9.databinding;
import com.zarkasihakhmad_18102217.praktikum9.R;
import com.zarkasihakhmad_18102217.praktikum9.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 6);
        sViewsWithIds.put(R.id.textView2, 7);
        sViewsWithIds.put(R.id.textView3, 8);
        sViewsWithIds.put(R.id.tv_age, 9);
        sViewsWithIds.put(R.id.textView5, 10);
        sViewsWithIds.put(R.id.btn_save, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView4.setTag(null);
        this.tvEmail.setTag(null);
        this.tvName.setTag(null);
        this.tvPhone.setTag(null);
        this.tvTheme.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.act == variableId) {
            setAct((com.zarkasihakhmad_18102217.praktikum9.MainActivity) variable);
        }
        else if (BR.settingModel == variableId) {
            setSettingModel((com.zarkasihakhmad_18102217.praktikum9.SettingModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAct(@Nullable com.zarkasihakhmad_18102217.praktikum9.MainActivity Act) {
        this.mAct = Act;
    }
    public void setSettingModel(@Nullable com.zarkasihakhmad_18102217.praktikum9.SettingModel SettingModel) {
        this.mSettingModel = SettingModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.settingModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String settingModelPhoneNumber = null;
        boolean textUtilsIsEmptySettingModelPhoneNumber = false;
        java.lang.String settingModelAgeInt0JavaLangStringSettingModelAgeTextView4AndroidStringDefaultAge = null;
        java.lang.String settingModelEmail = null;
        java.lang.String settingModelName = null;
        java.lang.String textUtilsIsEmptySettingModelNameTvNameAndroidStringDefaultNameSettingModelName = null;
        java.lang.String settingModelIsDarkThemeBooleanTrueTvThemeAndroidStringDarkThemeTvThemeAndroidStringLightTheme = null;
        boolean settingModelIsDarkTheme = false;
        java.lang.String javaLangStringSettingModelAge = null;
        boolean settingModelIsDarkThemeBooleanTrue = false;
        java.lang.String textUtilsIsEmptySettingModelPhoneNumberTvPhoneAndroidStringDefaultPhoneSettingModelPhoneNumber = null;
        boolean textUtilsIsEmptySettingModelName = false;
        int settingModelAge = 0;
        com.zarkasihakhmad_18102217.praktikum9.SettingModel settingModel = mSettingModel;
        boolean settingModelAgeInt0 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (settingModel != null) {
                    // read settingModel.phoneNumber
                    settingModelPhoneNumber = settingModel.getPhoneNumber();
                    // read settingModel.email
                    settingModelEmail = settingModel.getEmail();
                    // read settingModel.name
                    settingModelName = settingModel.getName();
                    // read settingModel.isDarkTheme
                    settingModelIsDarkTheme = settingModel.isDarkTheme();
                    // read settingModel.age
                    settingModelAge = settingModel.getAge();
                }


                // read TextUtils.isEmpty(settingModel.phoneNumber)
                textUtilsIsEmptySettingModelPhoneNumber = android.text.TextUtils.isEmpty(settingModelPhoneNumber);
                // read TextUtils.isEmpty(settingModel.name)
                textUtilsIsEmptySettingModelName = android.text.TextUtils.isEmpty(settingModelName);
                // read settingModel.isDarkTheme == true
                settingModelIsDarkThemeBooleanTrue = (settingModelIsDarkTheme) == (true);
                // read settingModel.age > 0
                settingModelAgeInt0 = (settingModelAge) > (0);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptySettingModelPhoneNumber) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptySettingModelName) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(settingModelIsDarkThemeBooleanTrue) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(settingModelAgeInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read settingModel.isDarkTheme == true ? @android:string/dark_theme : @android:string/light_theme
                settingModelIsDarkThemeBooleanTrueTvThemeAndroidStringDarkThemeTvThemeAndroidStringLightTheme = ((settingModelIsDarkThemeBooleanTrue) ? (tvTheme.getResources().getString(R.string.dark_theme)) : (tvTheme.getResources().getString(R.string.light_theme)));
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
                textUtilsIsEmptySettingModelNameTvNameAndroidStringDefaultNameSettingModelName = ((textUtilsIsEmptySettingModelName) ? (tvName.getResources().getString(R.string.default_name)) : (settingModelName));
                // read TextUtils.isEmpty(settingModel.phoneNumber) ? @android:string/default_phone : settingModel.phoneNumber
                textUtilsIsEmptySettingModelPhoneNumberTvPhoneAndroidStringDefaultPhoneSettingModelPhoneNumber = ((textUtilsIsEmptySettingModelPhoneNumber) ? (tvPhone.getResources().getString(R.string.default_phone)) : (settingModelPhoneNumber));
        }
        if ((dirtyFlags & 0x10L) != 0) {

                // read ("") + (settingModel.age)
                javaLangStringSettingModelAge = ("") + (settingModelAge);
        }

        if ((dirtyFlags & 0x6L) != 0) {

                // read settingModel.age > 0 ? ("") + (settingModel.age) : @android:string/default_age
                settingModelAgeInt0JavaLangStringSettingModelAgeTextView4AndroidStringDefaultAge = ((settingModelAgeInt0) ? (javaLangStringSettingModelAge) : (textView4.getResources().getString(R.string.default_age)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, settingModelAgeInt0JavaLangStringSettingModelAgeTextView4AndroidStringDefaultAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, settingModelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, textUtilsIsEmptySettingModelNameTvNameAndroidStringDefaultNameSettingModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhone, textUtilsIsEmptySettingModelPhoneNumberTvPhoneAndroidStringDefaultPhoneSettingModelPhoneNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTheme, settingModelIsDarkThemeBooleanTrueTvThemeAndroidStringDarkThemeTvThemeAndroidStringLightTheme);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): act
        flag 1 (0x2L): settingModel
        flag 2 (0x3L): null
        flag 3 (0x4L): settingModel.age > 0 ? ("") + (settingModel.age) : @android:string/default_age
        flag 4 (0x5L): settingModel.age > 0 ? ("") + (settingModel.age) : @android:string/default_age
        flag 5 (0x6L): TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
        flag 6 (0x7L): TextUtils.isEmpty(settingModel.name) ? @android:string/default_name : settingModel.name
        flag 7 (0x8L): settingModel.isDarkTheme == true ? @android:string/dark_theme : @android:string/light_theme
        flag 8 (0x9L): settingModel.isDarkTheme == true ? @android:string/dark_theme : @android:string/light_theme
        flag 9 (0xaL): TextUtils.isEmpty(settingModel.phoneNumber) ? @android:string/default_phone : settingModel.phoneNumber
        flag 10 (0xbL): TextUtils.isEmpty(settingModel.phoneNumber) ? @android:string/default_phone : settingModel.phoneNumber
    flag mapping end*/
    //end
}