package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class uzd {
    public final Layout a;
    public final Layout b;
    public final int c;
    public final int d;
    public final int e;

    public uzd(Layout layout, Layout layout2, int i, int i2, int i3) {
        this.a = layout;
        this.b = layout2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static uzd a(uzd uzdVar, int i) {
        return new uzd(uzdVar.a, uzdVar.b, uzdVar.c, uzdVar.d, i);
    }

    public final int b() {
        return this.c;
    }

    public final Layout c() {
        return this.b;
    }

    public final Layout d() {
        return this.a;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzd)) {
            return false;
        }
        uzd uzdVar = (uzd) obj;
        return this.a.equals(uzdVar.a) && cqk.d(this.b, uzdVar.b) && this.c == uzdVar.c && this.d == uzdVar.d && this.e == uzdVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Layout layout = this.b;
        return Integer.hashCode(this.e) + zo5.c(this.d, zo5.c(this.c, (iHashCode + (layout == null ? 0 : layout.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutBundle(titleLayout=");
        sb.append(this.a);
        sb.append(", subtitleLayout=");
        sb.append(this.b);
        sb.append(", subtitleHeight=");
        qt4.x(this.c, this.d, ", titleSubtitleMargin=", ", qrBitmapSize=", sb);
        return zo5.t(sb, this.e, ")");
    }
}
