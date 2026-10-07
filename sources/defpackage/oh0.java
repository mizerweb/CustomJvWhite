package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oh0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public oh0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oh0)) {
            return false;
        }
        oh0 oh0Var = (oh0) obj;
        return this.a.equals(oh0Var.a) && this.b.equals(oh0Var.b) && this.c.equals(oh0Var.c) && this.d.equals(oh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return zo5.w(sb, this.d, "}");
    }
}
