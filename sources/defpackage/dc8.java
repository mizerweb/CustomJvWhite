package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dc8 extends u3m {
    public final fi9 a = new fi9();
    public final fi9 b = new fi9();
    public final fi9 c = new fi9();
    public final fi9 d = new fi9();
    public final fi9 e = new fi9();
    public final fi9 f = new fi9();
    public final fi9 g = new fi9();
    public final fi9 h = new fi9();
    public final ex8 i = new ex8(29);

    @Override // defpackage.u3m
    public final cc8 a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            c();
            return null;
        }
        if (this.i.T(arrayList)) {
            c();
        }
        zfg zfgVar = (zfg) ww3.r1(arrayList);
        Long lA = this.a.a(Long.valueOf(zfgVar.n));
        if ((lA != null && lA.longValue() == 0) || lA == null) {
            return null;
        }
        cc8 cc8Var = new cc8(null, null, null, null, null, null, null, null);
        long jLongValue = lA.longValue();
        Long lA2 = this.b.a(Long.valueOf(zfgVar.o));
        if (lA2 != null) {
            cc8Var.a = Float.valueOf((lA2.longValue() / jLongValue) * 1000.0f);
        }
        long jLongValue2 = lA.longValue();
        Long lA3 = this.c.a(Long.valueOf(zfgVar.p));
        if (lA3 != null) {
            cc8Var.b = Float.valueOf((lA3.longValue() / jLongValue2) * 1000.0f);
        }
        Long lA4 = this.d.a(Long.valueOf(zfgVar.q));
        long jLongValue3 = lA.longValue();
        if (lA4 != null) {
            cc8Var.c = Float.valueOf((lA4.longValue() / jLongValue3) * 1000.0f);
        }
        long jLongValue4 = lA.longValue();
        Long lA5 = this.e.a(Long.valueOf(zfgVar.r));
        if (lA5 != null) {
            cc8Var.e = Float.valueOf((lA5.longValue() / jLongValue4) * 1000.0f);
        }
        Long lA6 = this.f.a(Long.valueOf(zfgVar.s));
        if (lA6 != null && lA6.longValue() != 0 && lA4 != null) {
            cc8Var.f = Float.valueOf(lA4.longValue() / lA6.longValue());
        }
        long j = zfgVar.k;
        if (j != -1) {
            cc8Var.d = Long.valueOf(j);
        }
        double d = zfgVar.m;
        if (d != -1.0d) {
            cc8Var.g = Long.valueOf((long) (d * 1000.0d));
        }
        BigInteger bigInteger = zfgVar.i;
        Long lA7 = this.g.a(bigInteger != null ? Long.valueOf(bigInteger.longValue()) : null);
        BigInteger bigInteger2 = zfgVar.h;
        Long lA8 = this.h.a(bigInteger2 != null ? Long.valueOf(bigInteger2.longValue()) : null);
        if (lA7 != null && lA8 != null) {
            if (lA8.longValue() + lA7.longValue() != 0) {
                cc8Var.h = Integer.valueOf(oc9.w((int) ((lA7.longValue() * 100) / (lA8.longValue() + lA7.longValue())), new hj8(0, 100, 1)));
            }
        }
        return cc8Var;
    }

    @Override // defpackage.u3m
    public final void c() {
        this.a.a = null;
        this.b.a = null;
        this.c.a = null;
        this.d.a = null;
        this.e.a = null;
        this.f.a = null;
        this.g.a = null;
        this.h.a = null;
    }
}
