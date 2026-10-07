package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class iu1 {
    public final Uri a;
    public final String b;

    public iu1(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu1)) {
            return false;
        }
        iu1 iu1Var = (iu1) obj;
        return cqk.d(this.a, iu1Var.a) && cqk.d(this.b, iu1Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PhoneWithName(phoneNumber=" + this.a + ", name=" + this.b + ")";
    }
}
