package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class yha implements cia {
    public final Layout a;

    public yha(Layout layout) {
        this.a = layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yha) && this.a.equals(((yha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Deleted(bodyLayout=" + this.a + ")";
    }
}
