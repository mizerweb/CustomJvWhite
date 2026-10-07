package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w18 {
    public final x18 a;
    public final String b;

    public w18(String str, String str2, String str3, x18 x18Var) {
        this.a = x18Var;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        u18.a(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            u18.a(sb, str2);
        }
        sb.append("\r\n");
        if (str3 != null) {
            p.j(sb, "Content-Type: ", str3, "\r\n");
        }
        this.b = sb.toString();
    }
}
