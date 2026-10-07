package defpackage;

import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ye5 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ df5 b;

    public /* synthetic */ ye5(df5 df5Var, int i) {
        this.a = i;
        this.b = df5Var;
    }

    @Override // defpackage.pwi
    public final void run() throws GlUtil$GlException {
        int i = this.a;
        df5 df5Var = this.b;
        switch (i) {
            case 0:
                df5Var.getClass();
                try {
                    r6a r6aVar = df5Var.d;
                    r6aVar.getClass();
                    try {
                        v30 v30Var = (v30) r6aVar.b;
                        if (v30Var != null) {
                            GLES20.glDeleteProgram(v30Var.b);
                            tab.e();
                        }
                    } catch (GlUtil$GlException e) {
                        lvb.l0("CompositorGlProgram", "Error releasing GL Program", e);
                    }
                    df5Var.h.c();
                    tab.p(df5Var.m, df5Var.n);
                } catch (GlUtil$GlException e2) {
                    lvb.l0("DefaultVideoCompositor", "Error releasing GL resources", e2);
                    return;
                }
                break;
            case 1:
                EGLDisplay eGLDisplayT = tab.t();
                df5Var.m = eGLDisplayT;
                wm7 wm7Var = df5Var.c;
                df5Var.n = wm7Var.q(wm7Var.y(eGLDisplayT, 2, tab.b), df5Var.m);
                break;
            default:
                df5Var.b();
                break;
        }
    }
}
