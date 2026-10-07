package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e1m extends a {
    public final bd0 y;

    public e1m(Context context, Looper looper, s80 s80Var, bd0 bd0Var, skk skkVar, skk skkVar2) {
        super(context, looper, 68, s80Var, skkVar, skkVar2, 0);
        bd0Var = bd0Var == null ? bd0.c : bd0Var;
        xp9 xp9Var = new xp9(5, false);
        xp9Var.b = Boolean.FALSE;
        bd0Var.getClass();
        xp9Var.b = Boolean.valueOf(bd0Var.a);
        xp9Var.c = bd0Var.b;
        byte[] bArr = new byte[16];
        rqk.a.nextBytes(bArr);
        xp9Var.c = Base64.encodeToString(bArr, 11);
        this.y = new bd0(xp9Var);
    }

    @Override // defpackage.fo
    public final int i() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof gam ? (gam) iInterfaceQueryLocalInterface : new gam(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 3);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle o() {
        bd0 bd0Var = this.y;
        bd0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bd0Var.a);
        bundle.putString("log_session_id", bd0Var.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
