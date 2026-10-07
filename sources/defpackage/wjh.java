package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wjh {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e = System.currentTimeMillis();

    public wjh(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjh)) {
            return false;
        }
        wjh wjhVar = (wjh) obj;
        return this.a == wjhVar.a && cqk.d(this.b, wjhVar.b) && this.c.equals(wjhVar.c) && this.d.equals(wjhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.d(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "TaskFileDownloadData(requestId=", ", fileUrl=", this.b);
        nbh.G(sbT, ", fileName=", this.c, ", notificationTitle=", this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
