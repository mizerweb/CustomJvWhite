package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class tz9 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final Bundle a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        String str = vqi.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public tz9(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = new Bundle(bundle);
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static tz9 a(Bundle bundle) {
        Bundle bundleN = vqi.n(bundle.getBundle(e));
        boolean z = bundle.getBoolean(f, false);
        boolean z2 = bundle.getBoolean(g, false);
        boolean z3 = bundle.getBoolean(h, false);
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        return new tz9(bundleN, z, z2, z3);
    }
}
