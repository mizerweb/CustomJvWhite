package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class nrj {
    public static final mrj Companion = new mrj();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ nrj(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            shl.b(i, 15, lrj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrj)) {
            return false;
        }
        nrj nrjVar = (nrj) obj;
        return cqk.d(this.a, nrjVar.a) && cqk.d(this.b, nrjVar.b) && cqk.d(this.c, nrjVar.c) && cqk.d(this.d, nrjVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = zo5.d(zo5.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return nbh.y(qv1.q("WebAppStorageSaveKeyRequest(queryId=", this.a, ", requestId=", this.b, ", key="), this.c, ", value=", this.d, ")");
    }
}
