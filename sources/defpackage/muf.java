package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class muf extends mk0 {
    public final Intent b;

    public muf(Intent intent) {
        super(18);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muf) && this.b.equals(((muf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
