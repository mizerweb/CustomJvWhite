package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pv1 implements sv1 {
    public final long a;
    public final String b;
    public final Long c;
    public final long d;
    public final long e;
    public final String f;
    public final CharSequence g;
    public final boolean h;
    public final String i;
    public final long j;
    public final Long k;
    public final Long l;
    public final boolean m;
    public final Long n;
    public final Long o;
    public final String p;
    public final Long q;
    public final boolean r;

    public pv1(long j, String str, Long l, long j2, long j3, String str2, String str3, boolean z, String str4, long j4, Long l2, Long l3, boolean z2, Long l4, Long l5, String str5, Long l6, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = l;
        this.d = j2;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = str4;
        this.j = j4;
        this.k = l2;
        this.l = l3;
        this.m = z2;
        this.n = l4;
        this.o = l5;
        this.p = str5;
        this.q = l6;
        this.r = z3;
    }

    @Override // defpackage.sv1
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.sv1
    public final boolean b() {
        return this.r;
    }

    @Override // defpackage.sv1
    public final Long c() {
        return this.o;
    }

    @Override // defpackage.sv1
    public final String d() {
        return this.p;
    }

    @Override // defpackage.sv1
    public final tv1 e() {
        return tv1.VENDOR_PUSH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv1)) {
            return false;
        }
        pv1 pv1Var = (pv1) obj;
        if (this.a != pv1Var.a || !cqk.d(this.b, pv1Var.b) || !cqk.d(this.c, pv1Var.c) || this.d != pv1Var.d || this.e != pv1Var.e) {
            return false;
        }
        String str = pv1Var.f;
        ifh ifhVar = ns4.b;
        return this.f.equals(str) && cqk.d(this.g, pv1Var.g) && this.h == pv1Var.h && cqk.d(this.i, pv1Var.i) && this.j == pv1Var.j && this.k.equals(pv1Var.k) && this.l.equals(pv1Var.l) && this.m == pv1Var.m && cqk.d(this.n, pv1Var.n) && cqk.d(this.o, pv1Var.o) && this.p.equals(pv1Var.p) && cqk.d(this.q, pv1Var.q) && this.r == pv1Var.r;
    }

    @Override // defpackage.sv1
    public final long f() {
        return this.d;
    }

    @Override // defpackage.sv1
    public final String g() {
        return this.f;
    }

    @Override // defpackage.sv1
    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iG = qt4.g(qt4.g((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e);
        ifh ifhVar = ns4.b;
        int iD = zo5.d(iG, 31, this.f);
        CharSequence charSequence = this.g;
        int iN = nbh.n((iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iN2 = nbh.n((this.l.hashCode() + ((this.k.hashCode() + qt4.g((iN + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j)) * 31)) * 31, 31, this.m);
        Long l2 = this.n;
        int iHashCode3 = (iN2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.o;
        int iD2 = zo5.d((iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.p);
        Long l4 = this.q;
        return Boolean.hashCode(this.r) + ((iD2 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }

    @Override // defpackage.sv1
    public final long i() {
        return this.j;
    }

    @Override // defpackage.sv1
    public final CharSequence j() {
        return this.g;
    }

    @Override // defpackage.sv1
    public final Long k() {
        return this.q;
    }

    @Override // defpackage.sv1
    public final String l() {
        return this.i;
    }

    @Override // defpackage.sv1
    public final boolean m() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:157:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:230:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:300:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:370:0x047b  */
    /* JADX WARN: Code duplicated, block: B:440:0x0555  */
    /* JADX WARN: Code duplicated, block: B:510:0x0634  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    public final String toString() {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String strK7;
        String strK8 = null;
        Object obj = this.b;
        if (obj == null) {
            strK = null;
        } else if (gm0.c()) {
            strK = obj.toString();
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                strK = "[]";
            } else {
                strK = c0a.k(collection.size(), "[**", "**]");
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(objArr.length, "[**", "**]");
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(iArr.length, "[**", "**]");
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(fArr.length, "[**", "**]");
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(jArr.length, "[**", "**]");
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            if (dArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(dArr.length, "[**", "**]");
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            if (sArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(sArr.length, "[**", "**]");
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(bArr.length, "[**", "**]");
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (cArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(cArr.length, "[**", "**]");
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(zArr.length, "[**", "**]");
            }
        } else {
            strK = "***";
        }
        Object obj2 = this.c;
        if (obj2 == null) {
            strK2 = null;
        } else if (gm0.c()) {
            strK2 = obj2.toString();
        } else if (obj2 instanceof Collection) {
            Collection collection2 = (Collection) obj2;
            if (collection2.isEmpty()) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(collection2.size(), "[**", "**]");
            }
        } else if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            strK2 = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
        } else if (obj2 instanceof Object[]) {
            Object[] objArr2 = (Object[]) obj2;
            if (objArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(objArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof int[]) {
            int[] iArr2 = (int[]) obj2;
            if (iArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(iArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof float[]) {
            float[] fArr2 = (float[]) obj2;
            if (fArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(fArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof long[]) {
            long[] jArr2 = (long[]) obj2;
            if (jArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(jArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof double[]) {
            double[] dArr2 = (double[]) obj2;
            if (dArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(dArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr2 = (short[]) obj2;
            if (sArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(sArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj2;
            if (bArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(bArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof char[]) {
            char[] cArr2 = (char[]) obj2;
            if (cArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(cArr2.length, "[**", "**]");
            }
        } else if (obj2 instanceof boolean[]) {
            boolean[] zArr2 = (boolean[]) obj2;
            if (zArr2.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(zArr2.length, "[**", "**]");
            }
        } else {
            strK2 = "***";
        }
        String strC = ns4.c(this.f);
        Object obj3 = this.g;
        if (obj3 == null) {
            strK3 = null;
        } else if (gm0.c()) {
            strK3 = obj3.toString();
        } else if (obj3 instanceof Collection) {
            Collection collection3 = (Collection) obj3;
            if (collection3.isEmpty()) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(collection3.size(), "[**", "**]");
            }
        } else if (obj3 instanceof Map) {
            Map map3 = (Map) obj3;
            strK3 = map3.isEmpty() ? "{}" : c0a.k(map3.size(), "{**", "**}");
        } else if (obj3 instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj3;
            if (objArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(objArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof int[]) {
            int[] iArr3 = (int[]) obj3;
            if (iArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(iArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof float[]) {
            float[] fArr3 = (float[]) obj3;
            if (fArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(fArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof long[]) {
            long[] jArr3 = (long[]) obj3;
            if (jArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(jArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof double[]) {
            double[] dArr3 = (double[]) obj3;
            if (dArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(dArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof short[]) {
            short[] sArr3 = (short[]) obj3;
            if (sArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(sArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof byte[]) {
            byte[] bArr3 = (byte[]) obj3;
            if (bArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(bArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof char[]) {
            char[] cArr3 = (char[]) obj3;
            if (cArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(cArr3.length, "[**", "**]");
            }
        } else if (obj3 instanceof boolean[]) {
            boolean[] zArr3 = (boolean[]) obj3;
            if (zArr3.length == 0) {
                strK3 = "[]";
            } else {
                strK3 = c0a.k(zArr3.length, "[**", "**]");
            }
        } else {
            strK3 = "***";
        }
        Object obj4 = this.i;
        if (obj4 != null) {
            if (gm0.c()) {
                strK8 = obj4.toString();
            } else if (obj4 instanceof Collection) {
                Collection collection4 = (Collection) obj4;
                if (collection4.isEmpty()) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(collection4.size(), "[**", "**]");
                }
            } else if (obj4 instanceof Map) {
                Map map4 = (Map) obj4;
                strK8 = map4.isEmpty() ? "{}" : c0a.k(map4.size(), "{**", "**}");
            } else if (obj4 instanceof Object[]) {
                Object[] objArr4 = (Object[]) obj4;
                if (objArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(objArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof int[]) {
                int[] iArr4 = (int[]) obj4;
                if (iArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(iArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof float[]) {
                float[] fArr4 = (float[]) obj4;
                if (fArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(fArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof long[]) {
                long[] jArr4 = (long[]) obj4;
                if (jArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(jArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof double[]) {
                double[] dArr4 = (double[]) obj4;
                if (dArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(dArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof short[]) {
                short[] sArr4 = (short[]) obj4;
                if (sArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(sArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof byte[]) {
                byte[] bArr4 = (byte[]) obj4;
                if (bArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(bArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof char[]) {
                char[] cArr4 = (char[]) obj4;
                if (cArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(cArr4.length, "[**", "**]");
                }
            } else if (obj4 instanceof boolean[]) {
                boolean[] zArr4 = (boolean[]) obj4;
                if (zArr4.length == 0) {
                    strK8 = "[]";
                } else {
                    strK8 = c0a.k(zArr4.length, "[**", "**]");
                }
            } else {
                strK8 = "***";
            }
        }
        Object objValueOf = Long.valueOf(this.j);
        if (gm0.c()) {
            strK4 = objValueOf.toString();
        } else if (objValueOf instanceof Collection) {
            Collection collection5 = (Collection) objValueOf;
            if (collection5.isEmpty()) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(collection5.size(), "[**", "**]");
            }
        } else if (objValueOf instanceof Map) {
            Map map5 = (Map) objValueOf;
            strK4 = map5.isEmpty() ? "{}" : c0a.k(map5.size(), "{**", "**}");
        } else if (objValueOf instanceof Object[]) {
            Object[] objArr5 = (Object[]) objValueOf;
            if (objArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(objArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof int[]) {
            int[] iArr5 = (int[]) objValueOf;
            if (iArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(iArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof float[]) {
            float[] fArr5 = (float[]) objValueOf;
            if (fArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(fArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof long[]) {
            long[] jArr5 = (long[]) objValueOf;
            if (jArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(jArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof double[]) {
            double[] dArr5 = (double[]) objValueOf;
            if (dArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(dArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof short[]) {
            short[] sArr5 = (short[]) objValueOf;
            if (sArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(sArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof byte[]) {
            byte[] bArr5 = (byte[]) objValueOf;
            if (bArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(bArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof char[]) {
            char[] cArr5 = (char[]) objValueOf;
            if (cArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(cArr5.length, "[**", "**]");
            }
        } else if (objValueOf instanceof boolean[]) {
            boolean[] zArr5 = (boolean[]) objValueOf;
            if (zArr5.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(zArr5.length, "[**", "**]");
            }
        } else {
            strK4 = "***";
        }
        boolean zC = gm0.c();
        Object obj5 = this.k;
        if (zC) {
            strK5 = obj5.toString();
        } else if (obj5 instanceof Collection) {
            Collection collection6 = (Collection) obj5;
            if (collection6.isEmpty()) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(collection6.size(), "[**", "**]");
            }
        } else if (obj5 instanceof Map) {
            Map map6 = (Map) obj5;
            strK5 = map6.isEmpty() ? "{}" : c0a.k(map6.size(), "{**", "**}");
        } else if (obj5 instanceof Object[]) {
            Object[] objArr6 = (Object[]) obj5;
            if (objArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(objArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof int[]) {
            int[] iArr6 = (int[]) obj5;
            if (iArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(iArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof float[]) {
            float[] fArr6 = (float[]) obj5;
            if (fArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(fArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof long[]) {
            long[] jArr6 = (long[]) obj5;
            if (jArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(jArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof double[]) {
            double[] dArr6 = (double[]) obj5;
            if (dArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(dArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof short[]) {
            short[] sArr6 = (short[]) obj5;
            if (sArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(sArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof byte[]) {
            byte[] bArr6 = (byte[]) obj5;
            if (bArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(bArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof char[]) {
            char[] cArr6 = (char[]) obj5;
            if (cArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(cArr6.length, "[**", "**]");
            }
        } else if (obj5 instanceof boolean[]) {
            boolean[] zArr6 = (boolean[]) obj5;
            if (zArr6.length == 0) {
                strK5 = "[]";
            } else {
                strK5 = c0a.k(zArr6.length, "[**", "**]");
            }
        } else {
            strK5 = "***";
        }
        boolean zC2 = gm0.c();
        Object obj6 = this.l;
        if (zC2) {
            strK6 = obj6.toString();
        } else if (obj6 instanceof Collection) {
            Collection collection7 = (Collection) obj6;
            if (collection7.isEmpty()) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(collection7.size(), "[**", "**]");
            }
        } else if (obj6 instanceof Map) {
            Map map7 = (Map) obj6;
            strK6 = map7.isEmpty() ? "{}" : c0a.k(map7.size(), "{**", "**}");
        } else if (obj6 instanceof Object[]) {
            Object[] objArr7 = (Object[]) obj6;
            if (objArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(objArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof int[]) {
            int[] iArr7 = (int[]) obj6;
            if (iArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(iArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof float[]) {
            float[] fArr7 = (float[]) obj6;
            if (fArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(fArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof long[]) {
            long[] jArr7 = (long[]) obj6;
            if (jArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(jArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof double[]) {
            double[] dArr7 = (double[]) obj6;
            if (dArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(dArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof short[]) {
            short[] sArr7 = (short[]) obj6;
            if (sArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(sArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof byte[]) {
            byte[] bArr7 = (byte[]) obj6;
            if (bArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(bArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof char[]) {
            char[] cArr7 = (char[]) obj6;
            if (cArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(cArr7.length, "[**", "**]");
            }
        } else if (obj6 instanceof boolean[]) {
            boolean[] zArr7 = (boolean[]) obj6;
            if (zArr7.length == 0) {
                strK6 = "[]";
            } else {
                strK6 = c0a.k(zArr7.length, "[**", "**]");
            }
        } else {
            strK6 = "***";
        }
        Object objValueOf2 = Boolean.valueOf(this.m);
        if (gm0.c()) {
            strK7 = objValueOf2.toString();
        } else if (objValueOf2 instanceof Collection) {
            Collection collection8 = (Collection) objValueOf2;
            if (collection8.isEmpty()) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(collection8.size(), "[**", "**]");
            }
        } else if (objValueOf2 instanceof Map) {
            Map map8 = (Map) objValueOf2;
            strK7 = map8.isEmpty() ? "{}" : c0a.k(map8.size(), "{**", "**}");
        } else if (objValueOf2 instanceof Object[]) {
            Object[] objArr8 = (Object[]) objValueOf2;
            if (objArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(objArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof int[]) {
            int[] iArr8 = (int[]) objValueOf2;
            if (iArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(iArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof float[]) {
            float[] fArr8 = (float[]) objValueOf2;
            if (fArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(fArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof long[]) {
            long[] jArr8 = (long[]) objValueOf2;
            if (jArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(jArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof double[]) {
            double[] dArr8 = (double[]) objValueOf2;
            if (dArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(dArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof short[]) {
            short[] sArr8 = (short[]) objValueOf2;
            if (sArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(sArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof byte[]) {
            byte[] bArr8 = (byte[]) objValueOf2;
            if (bArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(bArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof char[]) {
            char[] cArr8 = (char[]) objValueOf2;
            if (cArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(cArr8.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof boolean[]) {
            boolean[] zArr8 = (boolean[]) objValueOf2;
            if (zArr8.length == 0) {
                strK7 = "[]";
            } else {
                strK7 = c0a.k(zArr8.length, "[**", "**]");
            }
        } else {
            strK7 = "***";
        }
        StringBuilder sbT = qt4.t(this.a, "id=", " eventKey=", strK);
        p.j(sbT, " senderId=", strK2, " callerId=");
        sbT.append(this.d);
        qt4.z(this.e, " chatId=", " conversationId=", sbT);
        nbh.G(sbT, strC, " callerName=", strK3, " isVideo=");
        sbT.append(this.h);
        sbT.append(" conversationParams=");
        sbT.append(strK8);
        sbT.append(" receivedTime=");
        nbh.G(sbT, strK4, " sentTime=", strK5, " fcmSentTime=");
        sbT.append(strK6);
        sbT.append(" pushTransport=");
        sbT.append(tv1.VENDOR_PUSH);
        sbT.append("isContact=");
        sbT.append(strK7);
        return sbT.toString();
    }
}
