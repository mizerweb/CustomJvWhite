package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class nr9 implements rr9 {
    public final Uri a;
    public final g4b b;

    public nr9(Uri uri, g4b g4bVar) {
        this.a = uri;
        this.b = g4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr9)) {
            return false;
        }
        nr9 nr9Var = (nr9) obj;
        return this.a.equals(nr9Var.a) && this.b.equals(nr9Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ", sliceData=" + this.b + ", fireTime=null)";
    }
}
