package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vg7 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public vg7(String str, String str2) throws Throwable {
        int iK;
        int iK2;
        int iGlCreateProgram;
        try {
            iK = xg7.k(35633, str);
            try {
                iK2 = xg7.k(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        xg7.b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iK);
                        xg7.b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iK2);
                        xg7.b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.a = iGlCreateProgram;
                            a();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (iK != -1) {
                            GLES20.glDeleteShader(iK);
                        }
                        if (iK2 != -1) {
                            GLES20.glDeleteShader(iK2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (iK != -1) {
                            GLES20.glDeleteShader(iK);
                        }
                        if (iK2 != -1) {
                            GLES20.glDeleteShader(iK2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                iK2 = -1;
                iGlCreateProgram = iK2;
                if (iK != -1) {
                    GLES20.glDeleteShader(iK);
                }
                if (iK2 != -1) {
                    GLES20.glDeleteShader(iK2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            iK = -1;
            iK2 = -1;
        }
    }

    public final void a() {
        int i = this.a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = iGlGetAttribLocation;
        xg7.e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = iGlGetUniformLocation;
        xg7.e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = iGlGetUniformLocation2;
        xg7.e(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        xg7.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        xg7.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) xg7.h);
        xg7.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        xg7.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        xg7.b("glUniform1f");
    }
}
