package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class or6 {
    public final Context a;
    public final g5c b;
    public final v4c c;
    public final d95 d;

    public or6(Context context, g5c g5cVar, v4c v4cVar, d95 d95Var) {
        this.a = context;
        this.b = g5cVar;
        this.c = v4cVar;
        this.d = d95Var;
    }

    public final Notification a(CharSequence charSequence, String str, Long l, boolean z, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        g5c g5cVar = this.b;
        g5cVar.c();
        this.d.getClass();
        qlb qlbVarJ = g5cVar.j("ru.oneme.app.fileUpload", true);
        Notification notification = qlbVarJ.G;
        qlbVarJ.e = qlb.c(charSequence);
        qlbVarJ.f = qlb.c(str);
        notification.when = l != null ? l.longValue() : 0L;
        this.c.getClass();
        notification.icon = z ? R.drawable.icon_upload_round_fill : R.drawable.icon_download_round_fill;
        if (ezl.c(i)) {
            qlbVarJ.p = 100;
            qlbVarJ.q = 0;
            qlbVarJ.r = true;
        } else if (ezl.b(i)) {
            qlbVarJ.p = 100;
            qlbVarJ.q = i;
            qlbVarJ.r = false;
        } else {
            qlbVarJ.p = 0;
            qlbVarJ.q = 0;
            qlbVarJ.r = false;
        }
        qlbVarJ.k = 0;
        qlbVarJ.e(0);
        qlbVarJ.h(null);
        qlbVarJ.f(2, true);
        qlbVarJ.f(16, false);
        qlbVarJ.b.add(new klb(null, this.a.getString(R.string.tt_worker_cancel), pendingIntent2));
        qlbVarJ.w = "progress";
        qlbVarJ.g = pendingIntent;
        return qlbVarJ.a();
    }

    public final Notification b(long j, String str, long j2, String str2, int i, PendingIntent pendingIntent) {
        int iHashCode = Long.hashCode(j);
        g5c g5cVar = this.b;
        g5cVar.getClass();
        return a(str, str2, Long.valueOf(j2), false, i, p90.p(this.a, iHashCode, g5cVar.m(kk9.b.r(j, bdj.FROM_NOTIFICATION, null))), pendingIntent);
    }

    public final Notification c(String str, long j, String str2, int i, PendingIntent pendingIntent) {
        return a(str, str2, Long.valueOf(j), false, i, null, pendingIntent);
    }

    public final Notification d(long j, Long l, Long l2, CharSequence charSequence, String str, int i, boolean z, PendingIntent pendingIntent) {
        Intent intentM;
        int iHashCode = Long.hashCode(j);
        g5c g5cVar = this.b;
        if (j == 0) {
            intentM = g5cVar.h(false);
        } else {
            long jLongValue = l != null ? l.longValue() : 0L;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            g5cVar.getClass();
            kk9 kk9Var = kk9.b;
            Long lValueOf = Long.valueOf(jLongValue);
            Long lValueOf2 = Long.valueOf(jLongValue2);
            kk9Var.getClass();
            intentM = g5cVar.m(kk9.j(j, lValueOf, lValueOf2, null));
        }
        return a(charSequence, str, l, z, i, p90.p(this.a, iHashCode, intentM), pendingIntent);
    }
}
