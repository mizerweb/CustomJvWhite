package defpackage;

import android.graphics.Bitmap;
import android.opengl.Matrix;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes2.dex */
public final class ey0 {
    public static final /* synthetic */ int g = 0;
    public final float[] a;
    public int b;
    public int c;
    public Bitmap d;
    public final /* synthetic */ Bitmap e;
    public final /* synthetic */ wjg f;

    static {
        tab.j();
    }

    public ey0(Bitmap bitmap, wjg wjgVar) {
        this.e = bitmap;
        this.f = wjgVar;
        float[] fArrJ = tab.j();
        Matrix.scaleM(fArrJ, 0, 1.0f, -1.0f, 1.0f);
        this.a = fArrJ;
        this.b = -1;
    }

    public final int a() throws VideoFrameProcessingException {
        Bitmap bitmap = this.e;
        int generationId = bitmap.getGenerationId();
        if (bitmap != this.d || generationId != this.c) {
            this.d = bitmap;
            this.c = generationId;
            try {
                if (this.b == -1) {
                    this.b = tab.s();
                }
                tab.y(bitmap, this.b);
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        }
        return this.b;
    }
}
