package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sa4 {
    public final String a;
    public final String b;
    public final String c;

    public sa4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo{sessionKey='");
        sb.append(this.a);
        sb.append("', apiEndpoint='");
        sb.append(this.b);
        sb.append("', authToken='");
        return zo5.w(sb, this.c, "'}");
    }
}
