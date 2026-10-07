package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kp4 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public kp4(q36 q36Var) {
        this.a = q36Var.a;
        this.b = (String) q36Var.b;
        this.c = (String) q36Var.c;
        this.d = (String) q36Var.d;
    }

    public final boolean a() {
        String str = this.c;
        return (str == null || str.length() == 0 || !z5h.K0(str, "image/", true) || r5h.L0(str, "djvu", true)) ? false : true;
    }

    public final boolean b() {
        String str = this.c;
        return (str == null || str.length() == 0 || !z5h.K0(str, "video/", true)) ? false : true;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "ContentUriParams{contentLength=", ", contentName='", this.b);
        nbh.G(sbT, "', mimeType='", this.c, "', path='", this.d);
        sbT.append("'}");
        return sbT.toString();
    }
}
