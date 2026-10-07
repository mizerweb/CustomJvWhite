package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yb7 extends er0 {
    public final v30 h;

    public yb7(int i, Context context, boolean z) throws VideoFrameProcessingException {
        super(z, i);
        try {
            v30 v30Var = new v30(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_transformation_es2.glsl");
            this.h = v30Var;
            float[] fArrJ = tab.j();
            v30Var.A("uTexTransformationMatrix", fArrJ);
            v30Var.A("uTransformationMatrix", fArrJ);
            v30Var.A("uRgbMatrix", fArrJ);
            v30Var.y(tab.v());
        } catch (GlUtil$GlException | IOException e) {
            throw VideoFrameProcessingException.a(-9223372036854775807L, e);
        }
    }

    @Override // defpackage.er0
    public final lag f(int i, int i2) {
        return new lag(i, i2);
    }

    @Override // defpackage.er0
    public final void h(int i, long j) throws VideoFrameProcessingException {
        v30 v30Var = this.h;
        try {
            GLES20.glUseProgram(v30Var.b);
            tab.e();
            v30Var.C(i, 0, "uTexSampler");
            v30Var.g();
            GLES20.glDrawArrays(5, 0, 4);
        } catch (GlUtil$GlException e) {
            throw VideoFrameProcessingException.a(-9223372036854775807L, e);
        }
    }

    @Override // defpackage.cn7
    public void release() throws VideoFrameProcessingException {
        try {
            this.a.c();
            try {
                GLES20.glDeleteProgram(this.h.b);
                tab.e();
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
