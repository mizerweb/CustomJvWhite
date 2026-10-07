package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class ged {
    public final Rect a;
    public final Size b;
    public final Size c;

    public ged(Rect rect, Size size, Size size2) {
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ged)) {
            return false;
        }
        ged gedVar = (ged) obj;
        return this.a.equals(gedVar.a) && cqk.d(this.b, gedVar.b) && cqk.d(this.c, gedVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
