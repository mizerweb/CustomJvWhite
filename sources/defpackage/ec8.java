package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ec8 extends u3m {
    public final d0c a = new d0c(3);
    public final ex8 b = new ex8(29);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v25, types: [fi9] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v31, types: [fi9] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v65 */
    @Override // defpackage.u3m
    public final cc8 a(ArrayList arrayList) throws Throwable {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        ?? ValueOf;
        ?? ValueOf2;
        ?? r6;
        ?? ValueOf3;
        Throwable th = null;
        if (arrayList.isEmpty()) {
            c();
            return null;
        }
        if (this.b.T(arrayList)) {
            c();
        }
        d0c d0cVar = this.a;
        d0cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zfg zfgVar = (zfg) it.next();
            rj5 rj5Var = (rj5) d0cVar.a;
            String str = zfgVar.e;
            str.getClass();
            th = th;
            it = it;
            Long lA = rj5Var.L(str).a(Long.valueOf(zfgVar.n));
            if ((lA == null || lA.longValue() != 0) && lA != null) {
                long jLongValue = lA.longValue();
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = arrayList9;
                Long lA2 = ((rj5) d0cVar.b).L(str).a(Long.valueOf(zfgVar.o));
                if (lA2 != null) {
                    arrayList2.add(Float.valueOf((lA2.longValue() / jLongValue) * 1000.0f));
                }
                long jLongValue2 = lA.longValue();
                Long lA3 = ((rj5) d0cVar.c).L(str).a(Long.valueOf(zfgVar.p));
                if (lA3 != null) {
                    arrayList3.add(Float.valueOf((lA3.longValue() / jLongValue2) * 1000.0f));
                }
                Long lA4 = ((rj5) d0cVar.d).L(str).a(Long.valueOf(zfgVar.q));
                long jLongValue3 = lA.longValue();
                if (lA4 != null) {
                    arrayList4.add(Float.valueOf((lA4.longValue() / jLongValue3) * 1000.0f));
                }
                long jLongValue4 = lA.longValue();
                Long lA5 = ((rj5) d0cVar.e).L(str).a(Long.valueOf(zfgVar.r));
                if (lA5 != null) {
                    arrayList6.add(Float.valueOf((lA5.longValue() / jLongValue4) * 1000.0f));
                }
                Long lA6 = ((rj5) d0cVar.f).L(str).a(Long.valueOf(zfgVar.s));
                if (lA6 != null && lA6.longValue() != 0 && lA4 != null) {
                    arrayList7.add(Float.valueOf(lA4.longValue() / lA6.longValue()));
                }
                long j = zfgVar.k;
                if (j != -1) {
                    arrayList5.add(Long.valueOf(j));
                }
                double d = zfgVar.m;
                if (d != -1.0d) {
                    arrayList10.add(Long.valueOf((long) (d * 1000.0d)));
                }
                ?? L = ((rj5) d0cVar.g).L(str);
                BigInteger bigInteger = zfgVar.i;
                Long lA7 = L.a(bigInteger != null ? Long.valueOf(bigInteger.longValue()) : th);
                ?? L2 = ((rj5) d0cVar.h).L(str);
                BigInteger bigInteger2 = zfgVar.h;
                Long lA8 = L2.a(bigInteger2 != null ? Long.valueOf(bigInteger2.longValue()) : th);
                if (lA7 != null && lA8 != null) {
                    if (lA8.longValue() + lA7.longValue() != 0) {
                        arrayList11.add(new n90(lA7.longValue(), lA8.longValue()));
                        arrayList9 = arrayList11;
                        arrayList8 = arrayList10;
                    }
                }
                it = it;
                arrayList8 = arrayList10;
                arrayList9 = arrayList11;
            }
        }
        Throwable th2 = th;
        ArrayList arrayList12 = arrayList8;
        ArrayList arrayList13 = arrayList9;
        if (arrayList2.isEmpty()) {
            objValueOf = th2;
        } else {
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            double dFloatValue = 0.0d;
            while (it2.hasNext()) {
                dFloatValue += (double) ((Number) it2.next()).floatValue();
                i++;
                if (i < 0) {
                    xw3.U0();
                    throw th2;
                }
            }
            objValueOf = Float.valueOf((float) (i == 0 ? Double.NaN : dFloatValue / ((double) i)));
        }
        if (arrayList3.isEmpty()) {
            objValueOf2 = th2;
        } else {
            Iterator it3 = arrayList3.iterator();
            int i2 = 0;
            double dFloatValue2 = 0.0d;
            while (it3.hasNext()) {
                dFloatValue2 += (double) ((Number) it3.next()).floatValue();
                i2++;
                if (i2 < 0) {
                    xw3.U0();
                    throw th2;
                }
            }
            objValueOf2 = Float.valueOf((float) (i2 == 0 ? Double.NaN : dFloatValue2 / ((double) i2)));
        }
        if (arrayList4.isEmpty()) {
            objValueOf3 = th2;
        } else {
            Iterator it4 = arrayList4.iterator();
            int i3 = 0;
            double dFloatValue3 = 0.0d;
            while (it4.hasNext()) {
                dFloatValue3 += (double) ((Number) it4.next()).floatValue();
                i3++;
                if (i3 < 0) {
                    xw3.U0();
                    throw th2;
                }
            }
            objValueOf3 = Float.valueOf((float) (i3 == 0 ? Double.NaN : dFloatValue3 / ((double) i3)));
        }
        ?? ValueOf4 = arrayList5.isEmpty() ? th2 : Long.valueOf((long) ww3.i1(arrayList5));
        if (arrayList6.isEmpty()) {
            ValueOf = th2;
        } else {
            Iterator it5 = arrayList6.iterator();
            int i4 = 0;
            double dFloatValue4 = 0.0d;
            while (it5.hasNext()) {
                dFloatValue4 += (double) ((Number) it5.next()).floatValue();
                i4++;
                if (i4 < 0) {
                    xw3.U0();
                    throw th2;
                }
            }
            ValueOf = Float.valueOf((float) (i4 == 0 ? Double.NaN : dFloatValue4 / ((double) i4)));
        }
        if (arrayList7.isEmpty()) {
            ValueOf2 = th2;
        } else {
            Iterator it6 = arrayList7.iterator();
            int i5 = 0;
            double dFloatValue5 = 0.0d;
            while (it6.hasNext()) {
                dFloatValue5 += (double) ((Number) it6.next()).floatValue();
                i5++;
                if (i5 < 0) {
                    xw3.U0();
                    throw th2;
                }
            }
            ValueOf2 = Float.valueOf((float) (i5 == 0 ? Double.NaN : dFloatValue5 / ((double) i5)));
        }
        Iterator it7 = arrayList12.iterator();
        if (it7.hasNext()) {
            r6 = (Comparable) it7.next();
            while (it7.hasNext()) {
                Comparable comparable = (Comparable) it7.next();
                if (r6.compareTo(comparable) < 0) {
                    r6 = comparable;
                }
            }
        } else {
            r6 = th2;
        }
        Long l = (Long) r6;
        if (arrayList13.isEmpty()) {
            ValueOf3 = th2;
        } else {
            Iterator it8 = arrayList13.iterator();
            long j2 = 0;
            while (it8.hasNext()) {
                j2 += ((n90) it8.next()).a;
            }
            Iterator it9 = arrayList13.iterator();
            long j3 = 0;
            while (it9.hasNext()) {
                j3 += ((n90) it9.next()).b;
            }
            long j4 = j3 + j2;
            ValueOf3 = j4 == 0 ? 0 : Integer.valueOf(oc9.w((int) ((j2 * 100) / j4), new hj8(0, 100, 1)));
        }
        new cc8(objValueOf, objValueOf2, objValueOf3, ValueOf4, ValueOf, ValueOf2, l, ValueOf3);
        return r0;
    }

    @Override // defpackage.u3m
    public final void c() {
        d0c d0cVar = this.a;
        ((rj5) d0cVar.a).P();
        ((rj5) d0cVar.b).P();
        ((rj5) d0cVar.c).P();
        ((rj5) d0cVar.d).P();
        ((rj5) d0cVar.e).P();
        ((rj5) d0cVar.f).P();
        ((rj5) d0cVar.g).P();
        ((rj5) d0cVar.h).P();
    }
}
