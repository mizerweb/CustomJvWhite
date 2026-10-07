package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ndk implements ngk {
    public final int a;
    public final int b;
    public final FloatBuffer h;
    public final FloatBuffer i;
    public final IntBuffer f = IntBuffer.allocate(1);
    public final IntBuffer g = IntBuffer.allocate(2);
    public final int c = 2;
    public final int e = 5;
    public final int d = 4;

    public ndk(float[] fArr, int i, float[] fArr2, int i2) {
        this.a = i;
        this.b = i2;
        this.h = bgc.a(fArr);
        this.i = bgc.a(fArr2);
    }

    @Override // defpackage.ngk
    public final void a() {
        GLES20.glDeleteBuffers(2, this.g);
        bgc.c("glDeleteBuffers");
        GLES30.glDeleteVertexArrays(1, this.f);
        bgc.c("glDeleteVertexArrays");
    }

    @Override // defpackage.ngk
    public final void b() {
        FloatBuffer floatBuffer;
        IntBuffer intBuffer = this.f;
        if (intBuffer.get(0) == 0) {
            FloatBuffer floatBuffer2 = this.h;
            if (floatBuffer2 == null || (floatBuffer = this.i) == null) {
                return;
            }
            GLES30.glGenVertexArrays(1, intBuffer);
            IntBuffer intBuffer2 = this.g;
            GLES20.glGenBuffers(2, intBuffer2);
            GLES20.glBindBuffer(34962, intBuffer2.get(0));
            bgc.c("glBindBuffer");
            GLES20.glBufferData(34962, floatBuffer2.remaining() * 4, floatBuffer2, 35044);
            bgc.c("glBufferData");
            GLES20.glBindBuffer(34962, 0);
            bgc.c("glBindBuffer");
            GLES20.glBindBuffer(34962, intBuffer2.get(1));
            bgc.c("glBindBuffer");
            GLES20.glBufferData(34962, floatBuffer.remaining() * 4, floatBuffer, 35044);
            bgc.c("glBufferData");
            GLES20.glBindBuffer(34962, 0);
            bgc.c("glBindBuffer");
            GLES30.glBindVertexArray(intBuffer.get(0));
            bgc.c("glBindVertexArray");
            intBuffer2.rewind();
            GLES20.glBindBuffer(34962, intBuffer2.get(0));
            bgc.c("glBindBuffer");
            int i = this.c;
            GLES20.glVertexAttribPointer(this.a, i, 5126, false, i * 4, 0);
            bgc.c("glVertexAttribPointer");
            GLES20.glBindBuffer(34962, 0);
            bgc.c("glBindBuffer");
            intBuffer2.rewind();
            GLES20.glBindBuffer(34962, intBuffer2.get(1));
            bgc.c("glBindBuffer");
            GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, 0);
            bgc.c("glVertexAttribPointer");
            GLES20.glBindBuffer(34962, 0);
            bgc.c("glBindBuffer");
            GLES30.glBindVertexArray(0);
            bgc.c("glBindVertexArray");
        }
        GLES30.glBindVertexArray(intBuffer.get(0));
        bgc.c("glBindVertexArray");
        int i2 = this.a;
        GLES20.glEnableVertexAttribArray(i2);
        bgc.c("glEnableVertexAttribArray");
        int i3 = this.b;
        GLES20.glEnableVertexAttribArray(i3);
        bgc.c("glEnableVertexAttribArray");
        GLES20.glDrawArrays(this.e, 0, this.d);
        bgc.c("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i2);
        bgc.c("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(i3);
        bgc.c("glDisableVertexAttribArray");
        GLES30.glBindVertexArray(0);
        bgc.c("glBindVertexArray");
    }
}
