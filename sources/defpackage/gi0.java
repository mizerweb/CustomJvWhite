package defpackage;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
public final class gi0 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public gi0(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            ore.n("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gi0) {
            gi0 gi0Var = (gi0) obj;
            if (this.a.equals(gi0Var.a) && this.b == gi0Var.b && this.c == gi0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zo5.t(sb, this.c, "}");
    }
}
