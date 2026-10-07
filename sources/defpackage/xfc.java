package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class xfc extends zfc {
    public final Intent a;
    public final Uri b;

    public xfc(Intent intent, Uri uri) {
        this.a = intent;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfc)) {
            return false;
        }
        xfc xfcVar = (xfc) obj;
        return this.a.equals(xfcVar.a) && cqk.d(this.b, xfcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.a + ", uri=" + this.b + ")";
    }
}
