package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xjh {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e = System.currentTimeMillis();

    public xjh(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjh)) {
            return false;
        }
        xjh xjhVar = (xjh) obj;
        return this.a == xjhVar.a && this.b == xjhVar.b && cqk.d(this.c, xjhVar.c) && cqk.d(this.d, xjhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.d(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "TaskFileFromWebAppDownloadData(requestId=", ", botId=");
        qv1.s(this.b, ", fileUrl=", this.c, sbS);
        return qt4.q(sbS, ", fileName=", this.d, ")");
    }
}
