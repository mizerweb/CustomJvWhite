package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class shj {
    public static final rhj Companion = new rhj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ shj(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            shl.b(i, 7, qhj.a.d());
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
        if (!(obj instanceof shj)) {
            return false;
        }
        shj shjVar = (shj) obj;
        return cqk.d(this.a, shjVar.a) && cqk.d(this.b, shjVar.b) && cqk.d(this.c, shjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppDownloadFileRequest(requestId=", this.a, ", url=", this.b, ", fileName="), this.c, ")");
    }
}
