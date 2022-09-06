package org.d3if2125.paseafic_nav.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/d3if2125/paseafic_nav/firebase/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/d3if2125/paseafic_nav/databinding/ActivityRegisterBinding;", "confirmpass", "", "email", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "nama", "password", "progressDialog", "Landroid/app/ProgressDialog;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "regisUser", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.d3if2125.paseafic_nav.databinding.ActivityRegisterBinding binding;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    private android.app.ProgressDialog progressDialog;
    private java.lang.String email = " ";
    private java.lang.String nama = " ";
    private java.lang.String password = " ";
    private java.lang.String confirmpass = " ";
    private java.util.HashMap _$_findViewCache;
    
    public RegisterActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void regisUser() {
    }
}