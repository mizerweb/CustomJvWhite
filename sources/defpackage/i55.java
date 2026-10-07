package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class i55 implements cn7 {
    public final Context a;
    public final p51 b;
    public md5 c;
    public final ex3 d;
    public EGLDisplay i;
    public int j = -1;
    public int k = -1;
    public an7 e = new l6m(21);
    public bn7 f = new zpe(22);
    public zm7 g = new hs4(14);
    public Executor h = im5.a;

    public i55(Context context, p51 p51Var, ex3 ex3Var) {
        this.a = context;
        this.b = p51Var;
        this.d = ex3Var;
    }

    @Override // defpackage.cn7
    public final void a() {
        this.f.q();
    }

    @Override // defpackage.cn7
    public final void b(wm7 wm7Var, dn7 dn7Var, long j) {
        try {
            f(dn7Var.c, dn7Var.d);
            this.c.getClass();
            throw null;
        } catch (VideoFrameProcessingException | GlUtil$GlException e) {
            this.h.execute(new xc2(this, e, j, 2));
        }
    }

    @Override // defpackage.cn7
    public final void c(dn7 dn7Var) {
        this.e.z(dn7Var);
        this.e.y();
    }

    @Override // defpackage.cn7
    public final void d(Executor executor, ef5 ef5Var) {
        this.g = ef5Var;
        this.h = executor;
    }

    @Override // defpackage.cn7
    public final void e(euc eucVar) {
        this.f = eucVar;
    }

    public final void f(int i, int i2) {
        if (this.i == null) {
            this.i = tab.t();
        }
        EGL14.eglGetCurrentContext();
        if (this.j == -1 || this.k == -1) {
            this.j = i;
            this.k = i2;
        }
        this.b.getClass();
        if (this.c == null) {
            oc9.p(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            cgd cgdVarG = cgd.g(this.j, this.k);
            int iB = r88.b(4, 1);
            if (iB > 4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[0] = cgdVarG;
            ghe gheVarJ = c98.j(objArrCopyOf, 1);
            ghe gheVar = ghe.e;
            ex3 ex3Var = this.d;
            this.c = md5.k(this.a, gheVarJ, gheVar, ex3Var, ex3Var.c == 1 ? 2 : 0);
        }
    }

    @Override // defpackage.cn7
    public final void flush() {
        md5 md5Var = this.c;
        if (md5Var != null) {
            md5Var.flush();
        }
        this.e.k();
        this.e.y();
    }

    @Override // defpackage.cn7
    public final void g(an7 an7Var) {
        this.e = an7Var;
        an7Var.y();
    }

    @Override // defpackage.cn7
    public final void release() throws VideoFrameProcessingException {
        md5 md5Var = this.c;
        if (md5Var != null) {
            md5Var.release();
        }
        try {
            tab.e();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
