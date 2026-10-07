package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bb5 implements ay7 {
    public final /* synthetic */ db5 a;

    public bb5(db5 db5Var) {
        this.a = db5Var;
    }

    @Override // defpackage.ay7
    public final void b() {
        this.a.e.remove(this);
    }

    @Override // defpackage.ay7
    public final boolean d(Uri uri, mf mfVar, boolean z) {
        cb5 cb5Var;
        db5 db5Var = this.a;
        HashMap map = db5Var.d;
        if (db5Var.l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            wx7 wx7Var = db5Var.j;
            String str = vqi.a;
            List list = wx7Var.e;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                cb5 cb5Var2 = (cb5) map.get(((vx7) list.get(i2)).a);
                if (cb5Var2 != null && jElapsedRealtime < cb5Var2.h) {
                    i++;
                }
            }
            dc1 dc1VarN = db5Var.c.n(new xu6(1, 0, db5Var.j.e.size(), i), mfVar);
            if (dc1VarN != null && dc1VarN.a == 2 && (cb5Var = (cb5) map.get(uri)) != null) {
                return cb5.a(cb5Var, dc1VarN.b);
            }
        }
        return false;
    }
}
