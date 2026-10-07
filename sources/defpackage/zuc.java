package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class zuc extends avc {
    public final Uri b;
    public final y26 c;

    public zuc(Uri uri, y26 y26Var) {
        this.b = uri;
        this.c = y26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuc)) {
            return false;
        }
        zuc zucVar = (zuc) obj;
        return this.b.equals(zucVar.b) && this.c.equals(zucVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OnEditSuccess(uri=" + this.b + ", editorState=" + this.c + ")";
    }
}
