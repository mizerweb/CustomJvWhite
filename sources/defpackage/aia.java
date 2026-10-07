package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class aia implements cia {
    public final Layout a;

    public aia(Layout layout) {
        this.a = layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aia) && this.a.equals(((aia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Simple(bodyLayout=" + this.a + ")";
    }
}
