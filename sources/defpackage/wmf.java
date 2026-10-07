package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class wmf {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final pmf d;

    static {
        String str = vqi.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public wmf(int i, Bundle bundle, long j, pmf pmfVar) {
        lvb.R(pmfVar == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (pmfVar == null && i < 0) {
            pmfVar = new pmf(i);
        }
        this.d = pmfVar;
    }

    public static wmf a(Bundle bundle) {
        pmf pmfVar;
        int i = bundle.getInt(e, -1);
        Bundle bundleN = vqi.n(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            pmfVar = pmf.a(bundle2);
        } else {
            pmfVar = i != 0 ? new pmf(i) : null;
        }
        pmf pmfVar2 = pmfVar;
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        return new wmf(i, bundleN, j, pmfVar2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        pmf pmfVar = this.d;
        if (pmfVar != null) {
            bundle.putBundle(h, pmfVar.b());
        }
        return bundle;
    }

    public wmf(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }
}
