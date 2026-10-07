package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vp8 {
    public final String a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final Long f;
    public final String g;
    public final boolean h;
    public final Long i;

    public vp8(String str, boolean z, String str2, int i, String str3, Long l, String str4, boolean z2, Long l2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = l;
        this.g = str4;
        this.h = z2;
        this.i = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp8)) {
            return false;
        }
        vp8 vp8Var = (vp8) obj;
        return cqk.d(this.a, vp8Var.a) && this.b == vp8Var.b && cqk.d(this.c, vp8Var.c) && this.d == vp8Var.d && cqk.d(this.e, vp8Var.e) && this.f.equals(vp8Var.f) && cqk.d(this.g, vp8Var.g) && this.h == vp8Var.h && cqk.d(this.i, vp8Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iN = nbh.n((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iC = zo5.c(this.d, (iN + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.g;
        int iN2 = nbh.n((iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h);
        Long l = this.i;
        return iN2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("Loaded(title=", this.a, ", isChannel=", ", description=", this.b);
        sbA.append(this.c);
        sbA.append(", participantsCount=");
        sbA.append(this.d);
        sbA.append(", avatarUrl=");
        sbA.append(this.e);
        sbA.append(", avatarSourceId=");
        sbA.append(this.f);
        sbA.append(", abbreviation=");
        sbA.append(this.g);
        sbA.append(", requiresApplication=");
        sbA.append(this.h);
        sbA.append(", joinRequestTime=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
