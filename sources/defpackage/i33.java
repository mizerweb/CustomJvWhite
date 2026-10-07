package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class i33 extends mk0 {
    public final Intent b;
    public final Uri c;

    public i33(Intent intent, Uri uri) {
        super(3);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i33)) {
            return false;
        }
        i33 i33Var = (i33) obj;
        return this.b.equals(i33Var.b) && cqk.d(this.c, i33Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
