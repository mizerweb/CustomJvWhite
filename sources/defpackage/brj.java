package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class brj {
    public static final arj Companion = new arj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ brj(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            shl.b(i, 7, zqj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brj)) {
            return false;
        }
        brj brjVar = (brj) obj;
        return cqk.d(this.a, brjVar.a) && cqk.d(this.b, brjVar.b) && cqk.d(this.c, brjVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + zo5.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppStorageGetKeyRequest(queryId=", this.a, ", requestId=", this.b, ", key="), this.c, ")");
    }
}
