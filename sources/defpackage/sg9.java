package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sg9 {
    public static final eu6 f = new eu6(29);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{uid='");
        sb.append(this.a);
        sb.append("', sessionKey='");
        sb.append(this.b);
        sb.append("', authenticationToken='");
        sb.append(this.c);
        sb.append("', apiServer='");
        sb.append(this.d);
        sb.append("', authenticationHash='");
        return zo5.w(sb, this.e, "'}");
    }
}
