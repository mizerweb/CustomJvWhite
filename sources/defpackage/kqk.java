package defpackage;

import android.media.Image;

/* JADX INFO: loaded from: classes2.dex */
final class kqk {
    private final Image a;

    public kqk(Image image) {
        this.a = image;
    }

    public final Image a() {
        return this.a;
    }

    public final Image.Plane[] b() {
        return this.a.getPlanes();
    }
}
