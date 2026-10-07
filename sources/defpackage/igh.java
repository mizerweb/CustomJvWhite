package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class igh {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final Map n;
    public final Set o;

    public igh(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, boolean z2, Map map, Set set) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = str10;
        this.m = z2;
        this.n = map;
        this.o = set;
    }

    public static igh a(igh ighVar, boolean z, Map map, int i) {
        String str = ighVar.a;
        long j = ighVar.b;
        String str2 = ighVar.c;
        String str3 = ighVar.d;
        String str4 = ighVar.e;
        String str5 = ighVar.f;
        String str6 = ighVar.g;
        String str7 = ighVar.h;
        String str8 = ighVar.i;
        String str9 = ighVar.j;
        boolean z2 = (i & 1024) != 0 ? ighVar.k : z;
        String str10 = ighVar.l;
        boolean z3 = z2;
        boolean z4 = ighVar.m;
        Map map2 = (i & 8192) != 0 ? ighVar.n : map;
        Set set = ighVar.o;
        ighVar.getClass();
        return new igh(str, j, str2, str3, str4, str5, str6, str7, str8, str9, z3, str10, z4, map2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igh)) {
            return false;
        }
        igh ighVar = (igh) obj;
        return this.a.equals(ighVar.a) && this.b == ighVar.b && cqk.d(this.c, ighVar.c) && cqk.d(this.d, ighVar.d) && cqk.d(this.e, ighVar.e) && cqk.d(this.f, ighVar.f) && this.g.equals(ighVar.g) && this.h.equals(ighVar.h) && this.i.equals(ighVar.i) && cqk.d(this.j, ighVar.j) && this.k == ighVar.k && cqk.d(this.l, ighVar.l) && this.m == ighVar.m && cqk.d(this.n, ighVar.n) && cqk.d(this.o, ighVar.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iD = zo5.d(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iD2 = zo5.d(zo5.d(zo5.d(zo5.d(zo5.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        boolean z = this.k;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        int i = (iD2 + r4) * 31;
        String str3 = this.l;
        int iHashCode2 = (i + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.m;
        return this.o.hashCode() + v0h.c(this.n, (iHashCode2 + (z2 ? 1 : z2)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "SystemState(versionName=", this.a, ", versionCode=");
        nbh.G(sbB, ", packageName=", this.c, ", environment=", this.d);
        nbh.G(sbB, ", buildUuid=", this.e, ", sessionUuid=", this.f);
        nbh.G(sbB, ", device=", this.g, ", deviceId=", this.h);
        nbh.G(sbB, ", vendor=", this.i, ", osVersion=", this.j);
        sbB.append(", isInBackground=");
        sbB.append(this.k);
        sbB.append(", connection=");
        sbB.append(this.l);
        sbB.append(", isRooted=");
        sbB.append(this.m);
        sbB.append(", properties=");
        sbB.append(this.n);
        sbB.append(", hostedLibrariesInfo=");
        sbB.append(this.o);
        sbB.append(")");
        return sbB.toString();
    }
}
