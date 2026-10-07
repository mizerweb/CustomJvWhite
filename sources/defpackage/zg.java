package defpackage;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class zg implements a88 {
    public final Image a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public zg(Image image) {
        this.a = image;
        this.b = image.getFormat();
        this.c = image.getWidth();
        this.d = image.getHeight();
        this.e = image.getTimestamp();
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        boolean zEquals = sr3Var.equals(zfe.a(Image.class));
        Image image = this.a;
        if (zEquals) {
            return image;
        }
        if (Build.VERSION.SDK_INT <= 27 || !sr3Var.equals(zfe.a(HardwareBuffer.class))) {
            return null;
        }
        return image.getHardwareBuffer();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "Image-" + d4h.a(this.b) + "-w" + this.c + 'h' + this.d + "-t" + this.e;
    }
}
