package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class suc {
    public final RectF a;
    public final Rect b;
    public final Uri c;
    public final ux4 d;

    public suc(RectF rectF, Rect rect, Uri uri, ux4 ux4Var) {
        this.a = rectF;
        this.b = rect;
        this.c = uri;
        this.d = ux4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suc)) {
            return false;
        }
        suc sucVar = (suc) obj;
        return cqk.d(this.a, sucVar.a) && this.b.equals(sucVar.b) && cqk.d(this.c, sucVar.c) && this.d.equals(sucVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PhotoCropResult(relativeCrop=" + this.a + ", absoluteCrop=" + this.b + ", imageUri=" + this.c + ", cropResult=" + this.d + ")";
    }
}
