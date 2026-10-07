package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class vfc extends rbb {
    public final Intent b;
    public final Uri c;

    public vfc(Intent intent, Uri uri) {
        super(sbi.a);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfc)) {
            return false;
        }
        vfc vfcVar = (vfc) obj;
        return this.b.equals(vfcVar.b) && cqk.d(this.c, vfcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
