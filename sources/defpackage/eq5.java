package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eq5 extends zq0 {
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public eq5(long j, long j2, String str, String str2, String str3) {
        super(j);
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? "" : str3;
        this.e = j2;
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleteEvent{url='");
        sb.append(this.b);
        sb.append("', path='");
        sb.append(this.c);
        sb.append("', attachLocalId='");
        sb.append(this.d);
        sb.append("', messageId=");
        return zo5.u(sb, this.e, '}');
    }
}
