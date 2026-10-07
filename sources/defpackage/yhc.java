package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yhc {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;
    public final u8b h;

    public yhc(long j, String str, long j2, String str2, Long l, Long l2, String str3, u8b u8bVar) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = l;
        this.f = l2;
        this.g = str3;
        this.h = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhc)) {
            return false;
        }
        yhc yhcVar = (yhc) obj;
        return this.a == yhcVar.a && cqk.d(this.b, yhcVar.b) && this.c == yhcVar.c && cqk.d(this.d, yhcVar.d) && cqk.d(this.e, yhcVar.e) && cqk.d(this.f, yhcVar.f) && cqk.d(this.g, yhcVar.g) && cqk.d(this.h, yhcVar.h);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u8b u8bVar = this.h;
        return iHashCode4 + (u8bVar != null ? u8bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "Organization(id=", ", name=", this.b);
        qt4.z(this.c, ", updateTime=", ", description=", sbT);
        sbT.append(this.d);
        sbT.append(", parentId=");
        sbT.append(this.e);
        sbT.append(", folderTemplateId=");
        sbT.append(this.f);
        sbT.append(", iconUrl=");
        sbT.append(this.g);
        sbT.append(", links=");
        sbT.append(this.h);
        sbT.append(")");
        return sbT.toString();
    }
}
