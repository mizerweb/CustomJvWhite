package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o38 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public o38(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o38)) {
            return false;
        }
        o38 o38Var = (o38) obj;
        return cqk.d(this.a, o38Var.a) && cqk.d(this.b, o38Var.b) && this.c.equals(o38Var.c) && this.d == o38Var.d && cqk.d(this.e, o38Var.e);
    }

    public final int hashCode() {
        int iA = spc.a(this.d, zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c));
        String str = this.e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("IceCandidateGatheringFailedEvent(localAddress=", this.a, ", remoteUrl=", this.b, ", description=");
        sbQ.append(this.c);
        sbQ.append(", code=");
        sbQ.append(this.d);
        sbQ.append(", transportType=");
        return zo5.w(sbQ, this.e, ")");
    }
}
