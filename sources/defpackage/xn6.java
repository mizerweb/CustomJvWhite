package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xn6 {
    public final ilb a;
    public final long b;
    public final bo6 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final syd p;

    public xn6(ilb ilbVar, long j, bo6 bo6Var, String str, String str2, long j2, long j3, String str3, long j4, String str4, String str5, boolean z, boolean z2, String str6, String str7, syd sydVar) {
        this.a = ilbVar;
        this.b = j;
        this.c = bo6Var;
        this.d = str;
        this.e = str2;
        this.f = j2;
        this.g = j3;
        this.h = str3;
        this.i = j4;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
        this.n = str6;
        this.o = str7;
        this.p = sydVar;
    }

    public final String a() {
        return this.o;
    }

    public final ilb b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.j;
    }

    public final bo6 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn6)) {
            return false;
        }
        xn6 xn6Var = (xn6) obj;
        return this.a.equals(xn6Var.a) && this.b == xn6Var.b && this.c == xn6Var.c && cqk.d(this.d, xn6Var.d) && cqk.d(this.e, xn6Var.e) && this.f == xn6Var.f && this.g == xn6Var.g && cqk.d(this.h, xn6Var.h) && this.i == xn6Var.i && cqk.d(this.j, xn6Var.j) && cqk.d(this.k, xn6Var.k) && this.l == xn6Var.l && this.m == xn6Var.m && cqk.d(this.n, xn6Var.n) && cqk.d(this.o, xn6Var.o) && this.p == xn6Var.p;
    }

    public final boolean f() {
        return this.m;
    }

    public final String g() {
        return this.k;
    }

    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + qt4.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iG = qt4.g(zo5.d(qt4.g(qt4.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int iHashCode3 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iN = nbh.n(nbh.n((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l), 31, this.m);
        String str5 = this.n;
        int iHashCode4 = (iN + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        return this.p.hashCode() + ((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.f;
    }

    public final String k() {
        return this.e;
    }

    public final syd l() {
        return this.p;
    }

    public final String m() {
        return this.h;
    }

    public final long n() {
        return this.g;
    }

    public final String o() {
        return this.n;
    }

    public final boolean p() {
        return this.c == bo6.MESSAGE;
    }

    public final boolean q() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    /* JADX WARN: Code duplicated, block: B:97:0x0184  */
    public final String toString() {
        String strK;
        String string;
        String strK2;
        boolean zC = gm0.c();
        String str = this.h;
        long j = this.g;
        bo6 bo6Var = this.c;
        long j2 = this.b;
        ilb ilbVar = this.a;
        long j3 = this.f;
        long j4 = this.i;
        if (!zC) {
            StringBuilder sb = new StringBuilder();
            sb.append(xn6.class.getSimpleName());
            sb.append("(pushId=");
            sb.append(j4);
            qt4.z(j3, ",sender=", ",chatRef=", sb);
            sb.append(ilbVar);
            sb.append(",messageId=");
            sb.append(j2);
            sb.append(",type=");
            sb.append(bo6Var);
            sb.append(",time=");
            sb.append(j);
            sb.append(",hasText=");
            return qt4.r(sb, str.length() > 0, ")");
        }
        if (!gm0.c()) {
            str = "***";
        }
        Object obj = this.n;
        if (obj == null) {
            strK = "empty";
        } else {
            if (gm0.c()) {
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
            if (strK == null) {
                strK = "empty";
            }
        }
        Object obj2 = this.o;
        if (obj2 != null) {
            if (gm0.c()) {
                string = obj2.toString();
            } else {
                if (obj2 instanceof Collection) {
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
                string = strK2;
            }
            if (string == null) {
            }
            StringBuilder sb2 = new StringBuilder("FcmNotification(chatRef=");
            sb2.append(ilbVar);
            sb2.append(", messageId=");
            sb2.append(j2);
            sb2.append(", fcmNotificationType=");
            sb2.append(bo6Var);
            sb2.append(", chatTitle=");
            sb2.append(this.d);
            p.j(sb2, ", senderUserName=", this.e, ", senderUserId=");
            sb2.append(j3);
            qt4.z(j, ", time=", ", text=", sb2);
            sb2.append(str);
            sb2.append(", pushId=");
            sb2.append(j4);
            nbh.G(sb2, ", eventLey=", this.j, ", largeImageUrl=", this.k);
            qv1.v(", isScheduledMessage=", ", hasAnyError=", sb2, this.l, this.m);
            nbh.G(sb2, ", url=", strK, ", bmd=", string);
            sb2.append(")");
            return sb2.toString();
        }
        strK = strK;
        string = "empty";
        StringBuilder sb3 = new StringBuilder("FcmNotification(chatRef=");
        sb3.append(ilbVar);
        sb3.append(", messageId=");
        sb3.append(j2);
        sb3.append(", fcmNotificationType=");
        sb3.append(bo6Var);
        sb3.append(", chatTitle=");
        sb3.append(this.d);
        p.j(sb3, ", senderUserName=", this.e, ", senderUserId=");
        sb3.append(j3);
        qt4.z(j, ", time=", ", text=", sb3);
        sb3.append(str);
        sb3.append(", pushId=");
        sb3.append(j4);
        nbh.G(sb3, ", eventLey=", this.j, ", largeImageUrl=", this.k);
        qv1.v(", isScheduledMessage=", ", hasAnyError=", sb3, this.l, this.m);
        nbh.G(sb3, ", url=", strK, ", bmd=", string);
        sb3.append(")");
        return sb3.toString();
    }
}
