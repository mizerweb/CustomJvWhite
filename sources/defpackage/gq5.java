package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gq5 extends zq0 {
    public final String b;
    public final String c;
    public final long d;

    public gq5(long j, long j2, String str, String str2) {
        super(j);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.d = j2;
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadErrorEvent{url='");
        sb.append(this.b);
        sb.append("', attachLocalId='");
        return zo5.w(sb, this.c, "'}");
    }
}
