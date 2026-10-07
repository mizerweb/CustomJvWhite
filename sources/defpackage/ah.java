package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: loaded from: classes2.dex */
public final class ah implements l78 {
    public final Image a;
    public final i1m[] b;
    public final sh0 c;

    public ah(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new i1m[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new i1m(planes[i]);
            }
        } else {
            this.b = new i1m[0];
        }
        this.c = new sh0(ghh.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.l78
    public final Image H0() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.l78
    public final k78[] e0() {
        return this.b;
    }

    @Override // defpackage.l78
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // defpackage.l78
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.l78
    public final m68 getImageInfo() {
        return this.c;
    }

    @Override // defpackage.l78
    public final int getWidth() {
        return this.a.getWidth();
    }
}
