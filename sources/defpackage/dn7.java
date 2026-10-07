package defpackage;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes2.dex */
public final class dn7 {
    public static final dn7 e = new dn7(-1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dn7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a() throws GlUtil$GlException {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            tab.e();
        }
        int i2 = this.b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            tab.e();
        }
    }
}
