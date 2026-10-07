package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class cdb implements rf4 {
    public final ConnectivityManager a;

    public cdb(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.rf4
    public final q72 a(kg4 kg4Var) {
        return e9i.o(new wz6(kg4Var, this, (lq4) null, 23));
    }

    @Override // defpackage.rf4
    public final boolean b(mzj mzjVar) {
        return (mzjVar.j.a() == null && mzjVar.j.a == 1) ? false : true;
    }
}
