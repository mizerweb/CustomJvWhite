package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class yvb implements zvb {
    public final Drawable a;

    public yvb(Drawable drawable) {
        this.a = drawable;
    }

    public final Drawable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvb) && cqk.d(this.a, ((yvb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Custom(drawable=" + this.a + ")";
    }
}
