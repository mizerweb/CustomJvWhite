package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bgc {
    public static final m18 a = new m18(HttpStatus.SC_NOT_FOUND, "SC_NOT_FOUND");
    public static final m18 b = new m18(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "SC_REQUESTED_RANGE_NOT_SATISFIABLE");
    public static final m18 c = new m18(500, "SC_INTERNAL_SERVER_ERROR");
    public static final m18 d = new m18(HttpStatus.SC_BAD_REQUEST, "SC_BAD_REQUEST");
    public static final m18 e = new m18(HttpStatus.SC_PRECONDITION_FAILED, "SC_PRECONDITION_FAILED");
    public static final m18 f = new m18(HttpStatus.SC_FORBIDDEN, "SC_FORBIDDEN");
    public static final m18 g = new m18(HttpStatus.SC_CONFLICT, "SC_CONFLICT");
    public static final m18 h = new m18(HttpStatus.SC_REQUEST_TOO_LONG, "SC_REQUEST_ENTITY_TOO_LARGE");
    public static final m18 i = new m18(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "SC_UNSUPPORTED_MEDIA_TYPE");
    public static final m18 j = new m18(HttpStatus.SC_NOT_ACCEPTABLE, "SC_NOT_ACCEPTABLE");
    public static final m18 k = new m18(-1, "UNKNOWN_ERROR");
    public static final m18 l = new m18(-100, "FILE_NOT_FOUND");
    public static final m18 m = new m18(-101, "FILE_ZERO_LENGTH");

    public static final FloatBuffer a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static final void b(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        ore.q(c0a.o("Unable to locate '", str, "' in program"));
    }

    public static final void c(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        tre.M(16);
        ore.q(zo5.p(str, ": glError 0x", p0m.c(16, ((long) iGlGetError) & 4294967295L)));
    }

    public static final int d(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        c("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        c("glShaderSource");
        GLES20.glCompileShader(iGlCreateShader);
        c("glCompileShader");
        int[] iArr = {1};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strI = zo5.i(i2, "Could not compile shader ", ": ", GLES20.glGetShaderInfoLog(iGlCreateShader));
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, "j", strI, null, null, 8);
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static cgc e() {
        if (cgc.d) {
            return new cgc();
        }
        return null;
    }

    public static void f(v7h v7hVar, int i2, qg4 qg4Var) {
        long jM = v7hVar.m(i2);
        List listH = v7hVar.h(jM);
        if (listH.isEmpty()) {
            return;
        }
        if (i2 == v7hVar.o() - 1) {
            c.t();
            return;
        }
        long jM2 = v7hVar.m(i2 + 1) - v7hVar.m(i2);
        if (jM2 > 0) {
            qg4Var.accept(new bz4(jM, jM2, listH));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void g(v7h v7hVar, c8h c8hVar, qg4 qg4Var) {
        int iE;
        boolean z;
        long j2 = c8hVar.b;
        if (j2 == -9223372036854775807L) {
            iE = 0;
        } else {
            iE = v7hVar.e(j2);
            if (iE == -1) {
                iE = v7hVar.o();
            }
            if (iE > 0 && v7hVar.m(iE - 1) == j2) {
                iE--;
            }
        }
        if (j2 == -9223372036854775807L || iE >= v7hVar.o()) {
            z = false;
        } else {
            List listH = v7hVar.h(j2);
            long jM = v7hVar.m(iE);
            if (listH.isEmpty()) {
                z = false;
            } else {
                long j3 = c8hVar.b;
                if (j3 < jM) {
                    qg4Var.accept(new bz4(j3, jM - j3, listH));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i2 = iE; i2 < v7hVar.o(); i2++) {
            f(v7hVar, i2, qg4Var);
        }
        if (c8hVar.a) {
            if (z) {
                iE--;
            }
            for (int i3 = 0; i3 < iE; i3++) {
                f(v7hVar, i3, qg4Var);
            }
            if (z) {
                qg4Var.accept(new bz4(v7hVar.m(iE), j2 - v7hVar.m(iE), v7hVar.h(j2)));
            }
        }
    }
}
