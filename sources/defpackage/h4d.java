package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h4d {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ip4 e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Map j;
    public long k = SystemClock.elapsedRealtime();

    public h4d(String str, String str2, String str3, String str4, ip4 ip4Var, String str5, boolean z, boolean z2, boolean z3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ip4Var;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = map;
    }

    public final long a() {
        return this.k;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.h;
    }

    public final h4d d() {
        h4e h4eVar = i4e.a;
        return new h4d(this.a, new BigInteger(Long.toUnsignedString(i4e.b.f()), 10).toString(36), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void e(long j) {
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4d)) {
            return false;
        }
        h4d h4dVar = (h4d) obj;
        return cqk.d(this.a, h4dVar.a) && cqk.d(this.b, h4dVar.b) && cqk.d(this.c, h4dVar.c) && cqk.d(this.d, h4dVar.d) && this.e == h4dVar.e && cqk.d(this.f, h4dVar.f) && this.g == h4dVar.g && this.h == h4dVar.h && this.i == h4dVar.i && cqk.d(this.j, h4dVar.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = zo5.d(zo5.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        ip4 ip4Var = this.e;
        int iHashCode2 = (iHashCode + (ip4Var == null ? 0 : ip4Var.hashCode())) * 31;
        String str3 = this.f;
        return this.j.hashCode() + nbh.n(nbh.n(nbh.n((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbC = nbh.C("{");
        sbC.append(" \"vsid\": \"" + this.b + "\"");
        String str = this.a;
        if (str != null) {
            sbC.append(", \"vid\": \"" + str + "\"");
        }
        String str2 = this.d;
        if (str2 != null) {
            sbC.append(", \"cdn_host\": \"" + str2 + "\"");
        }
        String str3 = this.f;
        if (str3 != null) {
            sbC.append(", \"place\": \"" + str3 + "\"");
        }
        sbC.append(", \"params\": { ");
        wfe wfeVar = new wfe();
        wfeVar.a = "";
        this.j.forEach(new ma4(3, new uv2(sbC, 4, wfeVar)));
        sbC.append(" }");
        sbC.append(" }");
        return sbC.toString();
    }
}
