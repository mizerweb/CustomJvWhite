package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class qo0 extends h66 {
    public final /* synthetic */ uo0 a;

    public qo0(uo0 uo0Var) {
        this.a = uo0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        uo0 uo0Var = this.a;
        uo0Var.d.e();
        uo0Var.e.e();
    }
}
