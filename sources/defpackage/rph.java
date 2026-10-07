package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class rph implements sph {
    public final Drawable a;

    public rph(Drawable drawable) {
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rph) && cqk.d(this.a, ((rph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThemeDrawable(drawable=" + this.a + ")";
    }
}
