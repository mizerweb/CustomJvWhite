package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public final class g4g extends a {
    public final Bundle A;
    public final Integer B;
    public final boolean y;
    public final s80 z;

    public g4g(Context context, Looper looper, s80 s80Var, Bundle bundle, ho7 ho7Var, io7 io7Var) {
        super(context, looper, 44, s80Var, ho7Var, io7Var, 0);
        this.y = true;
        this.z = s80Var;
        this.A = bundle;
        this.B = (Integer) s80Var.f;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo
    public final boolean d() {
        return this.y;
    }

    @Override // defpackage.fo
    public final int i() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof klk ? (klk) iInterfaceQueryLocalInterface : new klk(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle o() {
        s80 s80Var = this.z;
        boolean zEquals = this.c.getPackageName().equals((String) s80Var.c);
        Bundle bundle = this.A;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) s80Var.c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.service.START";
    }
}
