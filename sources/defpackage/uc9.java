package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uc9 extends l40 {
    public final vc9 d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final String i;
    public final float j;
    public final boolean k;

    public uc9(vc9 vc9Var, long j, long j2, long j3, List list, String str, float f, boolean z, boolean z2, boolean z3) {
        super(w50.LOCATION, z2, z3);
        this.d = vc9Var;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = list;
        this.i = str;
        this.k = z;
        this.j = f;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        vc9 vc9Var = this.d;
        mapA.put("latitude", Double.valueOf(vc9Var.a));
        mapA.put("longitude", Double.valueOf(vc9Var.b));
        long j = this.e;
        if (j > 0) {
            mapA.put("livePeriod", Long.valueOf(j));
        }
        float f = this.j;
        if (f > 0.0f) {
            mapA.put("zoom", Float.valueOf(f));
        }
        double d = vc9Var.c;
        if (d != 0.0d) {
            mapA.put("alt", Double.valueOf(d));
        }
        float f2 = vc9Var.d;
        if (f2 != 0.0f) {
            mapA.put("epu", Float.valueOf(f2));
        }
        float f3 = vc9Var.e;
        if (f3 != 0.0f) {
            mapA.put("hdn", Float.valueOf(f3));
        }
        float f4 = vc9Var.f;
        if (f4 != 0.0f) {
            mapA.put("spd", Float.valueOf(f4));
        }
        return mapA;
    }
}
