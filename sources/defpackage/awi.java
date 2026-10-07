package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes2.dex */
public interface awi {
    boolean a();

    Range b(int i);

    int d();

    boolean e(int i, int i2);

    default boolean f(int i, int i2) {
        if (e(i, i2)) {
            return true;
        }
        return a() && e(i2, i);
    }

    int g();

    Range h();

    Range i(int i);

    Range j();

    Range k();
}
