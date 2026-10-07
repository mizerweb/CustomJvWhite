package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class kf3 extends mk0 {
    public final Intent b;

    public kf3(Intent intent) {
        super(4);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf3) && this.b.equals(((kf3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PickPhotoFromCamera(data=" + this.b + ")";
    }
}
