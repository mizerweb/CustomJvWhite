package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public final class ffk implements ngk {
    public static final float[] b = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] c = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public final ngk a;

    public ffk(int i, int i2) {
        String strGlGetString = GLES20.glGetString(7938);
        float[] fArr = b;
        float[] fArr2 = c;
        this.a = (strGlGetString == null || !strGlGetString.contains("3.")) ? new ou9(fArr, i, fArr2, i2) : new ndk(fArr, i, fArr2, i2);
    }

    @Override // defpackage.ngk
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.ngk
    public final void b() {
        this.a.b();
    }
}
