package defpackage;

import android.app.PendingIntent;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class i4c {
    public final String a;
    public final String b;

    public i4c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final PendingIntent a(Context context, Long l, Long l2) {
        i65 i65VarK;
        if (l != null) {
            kk9 kk9Var = kk9.b;
            long jLongValue = l.longValue();
            kk9Var.getClass();
            i65VarK = kk9.j(jLongValue, null, l2, null);
        } else {
            i65VarK = kk9.k(kk9.b, false);
        }
        kk9.b.getClass();
        return p90.p(context, 42, kk9.p(i65VarK, context, this.a, this.b, null));
    }
}
