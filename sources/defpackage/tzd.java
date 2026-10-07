package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class tzd {
    public final String a;
    public final Rect b;

    public tzd(String str, Rect rect) {
        this.a = str;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzd)) {
            return false;
        }
        tzd tzdVar = (tzd) obj;
        return this.a.equals(tzdVar.a) && this.b.equals(tzdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QrCode(text=" + (gm0.c() ? this.a : "****") + ", boundingRect=" + this.b + ")";
    }
}
