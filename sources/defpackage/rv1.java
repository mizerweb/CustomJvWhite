package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rv1 implements sv1 {
    public final long a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final boolean e;
    public final String f;
    public final long g;
    public final boolean h;
    public final Long i;
    public final String j;
    public final Long k;
    public final boolean l;

    public rv1(long j, long j2, String str, String str2, boolean z, String str3, long j3, boolean z2, Long l, String str4, Long l2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = j3;
        this.h = z2;
        this.i = l;
        this.j = str4;
        this.k = l2;
        this.l = z3;
    }

    @Override // defpackage.sv1
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.sv1
    public final boolean b() {
        return this.l;
    }

    @Override // defpackage.sv1
    public final Long c() {
        return this.i;
    }

    @Override // defpackage.sv1
    public final String d() {
        return this.j;
    }

    @Override // defpackage.sv1
    public final tv1 e() {
        return tv1.SOCKET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv1)) {
            return false;
        }
        rv1 rv1Var = (rv1) obj;
        if (this.a != rv1Var.a || this.b != rv1Var.b) {
            return false;
        }
        String str = rv1Var.c;
        ifh ifhVar = ns4.b;
        return this.c.equals(str) && cqk.d(this.d, rv1Var.d) && this.e == rv1Var.e && cqk.d(this.f, rv1Var.f) && this.g == rv1Var.g && this.h == rv1Var.h && cqk.d(this.i, rv1Var.i) && cqk.d(this.j, rv1Var.j) && cqk.d(this.k, rv1Var.k) && this.l == rv1Var.l;
    }

    @Override // defpackage.sv1
    public final long f() {
        return this.a;
    }

    @Override // defpackage.sv1
    public final String g() {
        return this.c;
    }

    @Override // defpackage.sv1
    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        int iG = qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
        ifh ifhVar = ns4.b;
        int iD = zo5.d(iG, 31, this.c);
        CharSequence charSequence = this.d;
        int iN = nbh.n((iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iN2 = nbh.n(qt4.g((iN + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        Long l = this.i;
        int iHashCode = (iN2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.k;
        return Boolean.hashCode(this.l) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.sv1
    public final long i() {
        return this.g;
    }

    @Override // defpackage.sv1
    public final CharSequence j() {
        return this.d;
    }

    @Override // defpackage.sv1
    public final Long k() {
        return this.k;
    }

    @Override // defpackage.sv1
    public final String l() {
        return this.f;
    }

    @Override // defpackage.sv1
    public final boolean m() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    public final String toString() {
        String strK;
        String strK2;
        String strC = ns4.c(this.c);
        String strK3 = null;
        String strK4 = "***";
        Object obj = this.d;
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
        Object obj2 = this.f;
        if (obj2 != null) {
            if (gm0.c()) {
                strK3 = obj2.toString();
            } else if (obj2 instanceof Collection) {
                Collection collection2 = (Collection) obj2;
                if (collection2.isEmpty()) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(collection2.size(), "[**", "**]");
                }
            } else if (obj2 instanceof Map) {
                Map map2 = (Map) obj2;
                strK3 = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
            } else if (obj2 instanceof Object[]) {
                Object[] objArr2 = (Object[]) obj2;
                if (objArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(objArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof int[]) {
                int[] iArr2 = (int[]) obj2;
                if (iArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(iArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof float[]) {
                float[] fArr2 = (float[]) obj2;
                if (fArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(fArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof long[]) {
                long[] jArr2 = (long[]) obj2;
                if (jArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(jArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof double[]) {
                double[] dArr2 = (double[]) obj2;
                if (dArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(dArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr2 = (short[]) obj2;
                if (sArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(sArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj2;
                if (bArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(bArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof char[]) {
                char[] cArr2 = (char[]) obj2;
                if (cArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(cArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof boolean[]) {
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr2.length == 0) {
                    strK3 = "[]";
                } else {
                    strK3 = c0a.k(zArr2.length, "[**", "**]");
                }
            } else {
                strK3 = "***";
            }
        }
        Object objValueOf = Long.valueOf(this.g);
        if (gm0.c()) {
            strK2 = objValueOf.toString();
        } else if (objValueOf instanceof Collection) {
            Collection collection3 = (Collection) objValueOf;
            if (collection3.isEmpty()) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(collection3.size(), "[**", "**]");
            }
        } else if (objValueOf instanceof Map) {
            Map map3 = (Map) objValueOf;
            strK2 = map3.isEmpty() ? "{}" : c0a.k(map3.size(), "{**", "**}");
        } else if (objValueOf instanceof Object[]) {
            Object[] objArr3 = (Object[]) objValueOf;
            if (objArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(objArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof int[]) {
            int[] iArr3 = (int[]) objValueOf;
            if (iArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(iArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof float[]) {
            float[] fArr3 = (float[]) objValueOf;
            if (fArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(fArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof long[]) {
            long[] jArr3 = (long[]) objValueOf;
            if (jArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(jArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof double[]) {
            double[] dArr3 = (double[]) objValueOf;
            if (dArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(dArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof short[]) {
            short[] sArr3 = (short[]) objValueOf;
            if (sArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(sArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof byte[]) {
            byte[] bArr3 = (byte[]) objValueOf;
            if (bArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(bArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof char[]) {
            char[] cArr3 = (char[]) objValueOf;
            if (cArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(cArr3.length, "[**", "**]");
            }
        } else if (objValueOf instanceof boolean[]) {
            boolean[] zArr3 = (boolean[]) objValueOf;
            if (zArr3.length == 0) {
                strK2 = "[]";
            } else {
                strK2 = c0a.k(zArr3.length, "[**", "**]");
            }
        } else {
            strK2 = "***";
        }
        Object objValueOf2 = Boolean.valueOf(this.h);
        if (gm0.c()) {
            strK4 = objValueOf2.toString();
        } else if (objValueOf2 instanceof Collection) {
            Collection collection4 = (Collection) objValueOf2;
            if (collection4.isEmpty()) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(collection4.size(), "[**", "**]");
            }
        } else if (objValueOf2 instanceof Map) {
            Map map4 = (Map) objValueOf2;
            strK4 = map4.isEmpty() ? "{}" : c0a.k(map4.size(), "{**", "**}");
        } else if (objValueOf2 instanceof Object[]) {
            Object[] objArr4 = (Object[]) objValueOf2;
            if (objArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(objArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof int[]) {
            int[] iArr4 = (int[]) objValueOf2;
            if (iArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(iArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof float[]) {
            float[] fArr4 = (float[]) objValueOf2;
            if (fArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(fArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof long[]) {
            long[] jArr4 = (long[]) objValueOf2;
            if (jArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(jArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof double[]) {
            double[] dArr4 = (double[]) objValueOf2;
            if (dArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(dArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof short[]) {
            short[] sArr4 = (short[]) objValueOf2;
            if (sArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(sArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof byte[]) {
            byte[] bArr4 = (byte[]) objValueOf2;
            if (bArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(bArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof char[]) {
            char[] cArr4 = (char[]) objValueOf2;
            if (cArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(cArr4.length, "[**", "**]");
            }
        } else if (objValueOf2 instanceof boolean[]) {
            boolean[] zArr4 = (boolean[]) objValueOf2;
            if (zArr4.length == 0) {
                strK4 = "[]";
            } else {
                strK4 = c0a.k(zArr4.length, "[**", "**]");
            }
        }
        StringBuilder sbS = qt4.s(this.a, "callerId=", " chatId=");
        qv1.s(this.b, " conversationId=", strC, sbS);
        sbS.append(" callerName=");
        sbS.append(strK);
        sbS.append(" isVideo=");
        sbS.append(this.e);
        nbh.G(sbS, " conversationParams=", strK3, " receivedTime=", strK2);
        sbS.append(" pushTransport=");
        sbS.append(tv1.SOCKET);
        sbS.append("isContact=");
        sbS.append(strK4);
        return sbS.toString();
    }
}
