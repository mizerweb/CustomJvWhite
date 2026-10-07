package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p0m {
    public static final void a(View view, nt7 nt7Var) {
        Object poeVar;
        try {
            poeVar = Boolean.valueOf(view.performHapticFeedback(nt7Var.a()));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object obj = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = obj;
        }
    }

    public static final int b(long j, long j2) {
        return cqk.j(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final String c(int i, long j) {
        if (j >= 0) {
            tre.M(i);
            return Long.toString(j, i);
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        tre.M(i);
        String string = Long.toString(j3, i);
        tre.M(i);
        return string.concat(Long.toString(j4, i));
    }
}
