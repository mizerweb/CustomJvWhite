package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class wnj implements ynj {
    public final Uri a;

    public wnj(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnj) && this.a.equals(((wnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadCameraPhoto(data=" + this.a + ")";
    }
}
