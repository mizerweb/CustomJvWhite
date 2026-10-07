package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class s16 implements t16 {
    public final Uri a;

    public s16(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s16) && this.a.equals(((s16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Visible(uri=" + this.a + ")";
    }
}
