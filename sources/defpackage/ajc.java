package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ajc extends zq0 {
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final long f;
    public final mg5 g;

    public ajc(long j, long j2, long j3, String str, long j4, mg5 mg5Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = j4;
        this.g = mg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajc)) {
            return false;
        }
        ajc ajcVar = (ajc) obj;
        return this.b == ajcVar.b && this.c == ajcVar.c && this.d == ajcVar.d && cqk.d(this.e, ajcVar.e) && this.f == ajcVar.f && this.g == ajcVar.g;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + qt4.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "OutgoingMessageEvent(chatId=", ", cid=");
        sbS.append(this.c);
        qt4.z(this.d, ", messageId=", ", tag=", sbS);
        sbS.append(this.e);
        sbS.append(", sender=");
        sbS.append(this.f);
        sbS.append(", itemType=");
        sbS.append(this.g);
        sbS.append(")");
        return sbS.toString();
    }
}
