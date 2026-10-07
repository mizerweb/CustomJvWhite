package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class d7a {
    public final Uri a;
    public final g4b b;

    public d7a(Uri uri, g4b g4bVar) {
        this.a = uri;
        this.b = g4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7a)) {
            return false;
        }
        d7a d7aVar = (d7a) obj;
        return this.a.equals(d7aVar.a) && this.b.equals(d7aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ", sliceData=" + this.b + ")";
    }
}
