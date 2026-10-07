package defpackage;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes2.dex */
public final class fj0 {
    public final int a;
    public final ImageCaptureException b;

    public fj0(int i, ImageCaptureException imageCaptureException) {
        this.a = i;
        this.b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fj0)) {
            return false;
        }
        fj0 fj0Var = (fj0) obj;
        return this.a == fj0Var.a && this.b.equals(fj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
