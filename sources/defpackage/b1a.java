package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class b1a {
    public final String a;
    public final RectF b;
    public final Rect c;

    public b1a(String str, RectF rectF, Rect rect) {
        this.a = str;
        this.b = rectF;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1a)) {
            return false;
        }
        b1a b1aVar = (b1a) obj;
        return this.a.equals(b1aVar.a) && cqk.d(this.b, b1aVar.b) && this.c.equals(b1aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnCropSuccess(path=" + this.a + ", relativeCrop=" + this.b + ", absoluteCrop=" + this.c + ")";
    }
}
