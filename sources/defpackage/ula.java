package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class ula implements ama {
    public final Uri a;
    public final g4b b;

    public ula(Uri uri, g4b g4bVar) {
        this.a = uri;
        this.b = g4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ula)) {
            return false;
        }
        ula ulaVar = (ula) obj;
        return cqk.d(this.a, ulaVar.a) && this.b.equals(ulaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SendImage(mediaUri=" + this.a + ", sliceData=" + this.b + ")";
    }
}
