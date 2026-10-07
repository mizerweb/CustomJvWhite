package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jt6 {
    public final long a;
    public final String b;
    public final String c;

    public jt6(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        return qt4.q(qt4.u(this.a, "FileUploadInfo{fileId=", ", token='", !ch3.r(this.b)), "', url='", this.c, "'}");
    }
}
