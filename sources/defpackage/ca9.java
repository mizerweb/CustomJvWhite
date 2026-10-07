package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class ca9 implements srb {
    public final ks9 a;
    public boolean b = false;

    public ca9(rxk rxkVar, ks9 ks9Var) {
        this.a = ks9Var;
    }

    @Override // defpackage.srb
    public final void a(Object obj) {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.b;
        signInHubActivity.setResult(signInHubActivity.A, signInHubActivity.B);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
