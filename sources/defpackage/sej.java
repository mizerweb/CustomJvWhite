package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sej {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public sej(long j, long j2, long j3, String str, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public static sej a(sej sejVar, boolean z, boolean z2, int i) {
        long j = sejVar.a;
        long j2 = sejVar.b;
        long j3 = sejVar.c;
        String str = (i & 8) != 0 ? sejVar.d : null;
        if ((i & 16) != 0) {
            z = sejVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = sejVar.f;
        }
        return new sej(j, j2, j3, str, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sej)) {
            return false;
        }
        sej sejVar = (sej) obj;
        return this.a == sejVar.a && this.b == sejVar.b && this.c == sejVar.c && cqk.d(this.d, sejVar.d) && this.e == sejVar.e && this.f == sejVar.f;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + nbh.n((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "WebAppBiometryEntity(id=", ", userId=");
        sbS.append(this.b);
        qt4.z(this.c, ", botId=", ", token=", sbS);
        sbS.append(this.d);
        sbS.append(", accessRequested=");
        sbS.append(this.e);
        sbS.append(", accessGranted=");
        return qt4.r(sbS, this.f, ")");
    }

    public sej(long j, long j2, boolean z) {
        this(0L, j, j2, null, true, z);
    }
}
