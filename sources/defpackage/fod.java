package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class fod extends mk0 {
    public final Intent b;

    public fod(Intent intent) {
        super(12);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fod) && this.b.equals(((fod) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
