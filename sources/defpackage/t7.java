package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class t7 extends ar {
    @Override // defpackage.ar, defpackage.g74, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.fragment.app.b, defpackage.g74, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gm0.n("t7", "onCreate: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // defpackage.g74, android.app.Activity
    public void onNewIntent(Intent intent) {
        gm0.n("t7", "onNewIntent: intent =" + intent + " " + getLocalClassName() + "@" + hashCode());
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.n("t7", "onPause: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.n("t7", "onResume: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // defpackage.ar, androidx.fragment.app.b, android.app.Activity
    public void onStart() {
        super.onStart();
        gm0.n("t7", "onStart: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // defpackage.ar, androidx.fragment.app.b, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.n("t7", "onStop: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // defpackage.ar, defpackage.g74, android.app.Activity
    public final void setContentView(int i) {
        t();
        super.setContentView(i);
    }

    public final void t() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.ar, defpackage.g74, android.app.Activity
    public void setContentView(View view) {
        t();
        super.setContentView(view);
    }

    @Override // defpackage.ar, defpackage.g74, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        super.setContentView(view, layoutParams);
    }
}
