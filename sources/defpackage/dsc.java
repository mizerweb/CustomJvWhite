package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class dsc {
    public final pk5 a;
    public final boolean b;

    public dsc(Context context) {
        pk5 pk5VarW0 = lvb.w0(context);
        this.a = pk5VarW0;
        this.b = pk5VarW0.compareTo(pk5.AVERAGE) >= 0;
    }

    public final boolean a() {
        return this.b && Build.VERSION.SDK_INT >= 30;
    }

    public final String toString() {
        return s5h.x0("\n        PerformanceConfig(\n            perfClass=" + this.a + ",\n        )\n    ");
    }
}
