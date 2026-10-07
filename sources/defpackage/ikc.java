package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public interface ikc {
    public static final Pair a;
    public static final Pair b;
    public static final Pair c;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        a = Pair.create(fValueOf, fValueOf);
        b = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        c = Pair.create(fValueOf2, fValueOf2);
    }

    default Pair a() {
        return c;
    }

    default float b() {
        return 0.0f;
    }

    default Pair c() {
        return a;
    }

    default Pair d() {
        return b;
    }
}
