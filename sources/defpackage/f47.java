package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f47 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public f47(long j, String str, String str2, String str3, Long l, String str4, String str5, String str6) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final Long a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.h;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f47)) {
            return false;
        }
        f47 f47Var = (f47) obj;
        return this.a == f47Var.a && cqk.d(this.b, f47Var.b) && cqk.d(this.c, f47Var.c) && cqk.d(this.d, f47Var.d) && cqk.d(this.e, f47Var.e) && cqk.d(this.f, f47Var.f) && cqk.d(this.g, f47Var.g) && cqk.d(this.h, f47Var.h);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "FolderWidget(id=", ", name=", this.b);
        nbh.G(sbT, ", background=", this.c, ", description=", this.d);
        sbT.append(", appId=");
        sbT.append(this.e);
        sbT.append(", startParam=");
        sbT.append(this.f);
        nbh.G(sbT, ", url=", this.g, ", iconUrl=", this.h);
        sbT.append(")");
        return sbT.toString();
    }
}
