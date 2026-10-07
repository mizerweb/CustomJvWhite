package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eia {
    public final int a;
    public final long b;
    public final fda c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final long h;
    public final long i;

    public eia(int i, long j, fda fdaVar, String str, String str2, String str3, int i2, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = fdaVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = j2;
        this.i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eia)) {
            return false;
        }
        eia eiaVar = (eia) obj;
        return this.a == eiaVar.a && this.b == eiaVar.b && cqk.d(this.c, eiaVar.c) && cqk.d(this.d, eiaVar.d) && cqk.d(this.e, eiaVar.e) && cqk.d(this.f, eiaVar.f) && this.g == eiaVar.g && this.h == eiaVar.h && this.i == eiaVar.i;
    }

    public final int hashCode() {
        int iG = qt4.g(Integer.hashCode(this.a) * 31, 31, this.b);
        fda fdaVar = this.c;
        int iHashCode = (iG + (fdaVar == null ? 0 : fdaVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.g;
        return Long.hashCode(this.i) + qt4.g((iHashCode4 + (i != 0 ? qt4.D(i) : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "MessageLink(type=", ", chatLocalId=");
        sbX.append(", message=");
        sbX.append(this.c);
        sbX.append(", chatName=");
        sbX.append(this.d);
        nbh.G(sbX, ", chatLink=", this.e, ", chatIconUrl=", this.f);
        sbX.append(", chatAccessType=");
        sbX.append(tt2.j(this.g));
        sbX.append(", outgoingChatServerId=");
        sbX.append(this.h);
        return zo5.k(this.i, ", outgoingMessageServerId=", ")", sbX);
    }
}
