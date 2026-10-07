package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class l6g implements v71 {
    public final String a;

    public l6g(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.v71
    public final String a() {
        return this.a;
    }

    @Override // defpackage.v71
    public final boolean b(Uri uri) {
        return this.a.contains(uri.toString());
    }

    @Override // defpackage.v71
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l6g) {
            return this.a.equals(((l6g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
