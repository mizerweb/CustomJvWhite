package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class ne4 {
    public static final ne4 e;
    public static final ne4 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        ar3 ar3Var = ar3.r;
        ar3 ar3Var2 = ar3.s;
        ar3 ar3Var3 = ar3.t;
        ar3 ar3Var4 = ar3.l;
        ar3 ar3Var5 = ar3.n;
        ar3 ar3Var6 = ar3.m;
        ar3 ar3Var7 = ar3.o;
        ar3 ar3Var8 = ar3.q;
        ar3 ar3Var9 = ar3.p;
        ar3[] ar3VarArr = {ar3Var, ar3Var2, ar3Var3, ar3Var4, ar3Var5, ar3Var6, ar3Var7, ar3Var8, ar3Var9};
        ar3[] ar3VarArr2 = {ar3Var, ar3Var2, ar3Var3, ar3Var4, ar3Var5, ar3Var6, ar3Var7, ar3Var8, ar3Var9, ar3.j, ar3.k, ar3.h, ar3.i, ar3.f, ar3.g, ar3.e};
        me4 me4Var = new me4();
        me4Var.b((ar3[]) Arrays.copyOf(ar3VarArr, 9));
        quh quhVar = quh.TLS_1_3;
        quh quhVar2 = quh.TLS_1_2;
        me4Var.d(quhVar, quhVar2);
        me4Var.d = true;
        me4Var.a();
        me4 me4Var2 = new me4();
        me4Var2.b((ar3[]) Arrays.copyOf(ar3VarArr2, 16));
        me4Var2.d(quhVar, quhVar2);
        me4Var2.d = true;
        e = me4Var2.a();
        me4 me4Var3 = new me4();
        me4Var3.b((ar3[]) Arrays.copyOf(ar3VarArr2, 16));
        me4Var3.d(quhVar, quhVar2, quh.TLS_1_1, quh.TLS_1_0);
        me4Var3.d = true;
        me4Var3.a();
        f = new ne4(false, false, null, null);
    }

    public ne4(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ar3.b.k(str));
        }
        return ww3.T1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !uqi.j(strArr, sSLSocket.getEnabledProtocols(), kbb.a)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || uqi.j(strArr2, sSLSocket.getEnabledCipherSuites(), ar3.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(tre.Z(str));
        }
        return ww3.T1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ne4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ne4 ne4Var = (ne4) obj;
        boolean z = ne4Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, ne4Var.c) && Arrays.equals(this.d, ne4Var.d) && this.b == ne4Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return c0a.p(sb, this.b, ')');
    }
}
