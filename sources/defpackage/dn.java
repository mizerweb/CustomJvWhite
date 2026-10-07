package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dn {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;

    public dn(long j, String str, String str2, String str3, long j2, List list) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = list;
    }

    public final List a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return this.a == dnVar.a && cqk.d(this.b, dnVar.b) && cqk.d(this.c, dnVar.c) && cqk.d(this.d, dnVar.d) && this.e == dnVar.e && cqk.d(this.f, dnVar.f);
    }

    public final long f() {
        return this.e;
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + qt4.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "AnimojiSetEntity(id=", ", name=", this.b);
        nbh.G(sbT, ", iconUrl=", this.c, ", iconLottieUrl=", this.d);
        qt4.z(this.e, ", updateTime=", ", animojiIds=", sbT);
        return qv1.n(")", sbT, this.f);
    }
}
