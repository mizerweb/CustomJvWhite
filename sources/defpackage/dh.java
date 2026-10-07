package defpackage;

import android.media.ImageWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class dh implements ImageWriter.OnImageReleasedListener, ndi, AutoCloseable {
    public final ImageWriter a;
    public final int b;
    public final i40 c = gvk.c(null);

    public dh(ImageWriter imageWriter, int i) {
        this.a = imageWriter;
        this.b = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(ImageWriter.class))) {
            return this.a;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.c.a == null) {
            return;
        }
        ore.m();
    }

    public final String toString() {
        return "ImageWriter-" + d4h.a(this.a.getFormat()) + '-' + ((Object) ("Input-" + this.b));
    }
}
