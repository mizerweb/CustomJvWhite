package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class lkk extends f55 {
    public final /* synthetic */ int e;

    public /* synthetic */ lkk(int i) {
        this.e = i;
    }

    @Override // defpackage.f55
    public fo d(Context context, Looper looper, s80 s80Var, Object obj, ho7 ho7Var, io7 io7Var) {
        switch (this.e) {
            case 0:
                s80Var.getClass();
                Integer num = (Integer) s80Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new g4g(context, looper, s80Var, bundle, ho7Var, io7Var);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            case 2:
            case 4:
            default:
                return super.d(context, looper, s80Var, obj, ho7Var, io7Var);
            case 3:
                return new jfl(context, looper, 126, s80Var, ho7Var, io7Var, 0);
            case 5:
                return new e1m(context, looper, s80Var, (bd0) obj, (skk) ho7Var, (skk) io7Var);
            case 6:
                return new q5l(context, looper, s80Var, (GoogleSignInOptions) obj, (skk) ho7Var, (skk) io7Var);
        }
    }

    @Override // defpackage.f55
    public fo e(Context context, Looper looper, s80 s80Var, Object obj, skk skkVar, skk skkVar2) {
        switch (this.e) {
            case 2:
                return new emk(context, looper, 308, s80Var, skkVar, skkVar2, 0);
            case 3:
            default:
                return super.e(context, looper, s80Var, obj, skkVar, skkVar2);
            case 4:
                return new h1l(context, looper, s80Var, skkVar, skkVar2);
        }
    }
}
