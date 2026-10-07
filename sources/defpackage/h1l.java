package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h1l extends a {
    public final h6g A;
    public final h6g y;
    public final h6g z;

    public h1l(Context context, Looper looper, s80 s80Var, skk skkVar, skk skkVar2) {
        super(context, looper, 23, s80Var, skkVar, skkVar2, 0);
        this.y = new h6g(0);
        this.z = new h6g(0);
        this.A = new h6g(0);
    }

    @Override // defpackage.fo
    public final int i() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof w7m ? (w7m) iInterfaceQueryLocalInterface : new w7m(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final do6[] n() {
        return wqk.a;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void t() {
        System.currentTimeMillis();
        synchronized (this.y) {
            this.y.clear();
        }
        synchronized (this.z) {
            this.z.clear();
        }
        synchronized (this.A) {
            this.A.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean u() {
        return true;
    }
}
