package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zo2 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zo2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pwi
    public final void run() throws VideoFrameProcessingException, GlUtil$GlException {
        switch (this.a) {
            case 0:
                ((cn7) ((euc) this.b).b).c((dn7) this.c);
                return;
            case 1:
                ((nf5) this.b).a((mf5) this.c, true);
                return;
            case 2:
                hj6 hj6Var = (hj6) this.b;
                if (((md5) this.c) != hj6Var.f) {
                    return;
                }
                hj6Var.n++;
                hj6Var.E();
                return;
            case 3:
                uu6 uu6Var = (uu6) this.b;
                bch bchVar = (bch) this.c;
                if (uu6Var.o == null && !Objects.equals(uu6Var.z, bchVar)) {
                    bch bchVar2 = uu6Var.z;
                    if (bchVar2 != null && (bchVar == null || !bchVar2.a.equals(bchVar.a))) {
                        Executor executor = uu6Var.i;
                        EGLDisplay eGLDisplay = uu6Var.d;
                        if (uu6Var.B != null) {
                            try {
                                try {
                                    try {
                                        md5 md5Var = uu6Var.s;
                                        if (md5Var != null) {
                                            md5Var.release();
                                            uu6Var.s = null;
                                        }
                                        EGLContext eGLContext = uu6Var.e;
                                        EGLSurface eGLSurface = uu6Var.f;
                                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                                        tab.d("Error making context current");
                                        tab.r(0, 1, 1);
                                        tab.p(eGLDisplay, uu6Var.B);
                                    } catch (VideoFrameProcessingException e) {
                                        executor.execute(new gf5(uu6Var, 29, e));
                                    }
                                } catch (GlUtil$GlException e2) {
                                    executor.execute(new gf5(uu6Var, 28, e2));
                                }
                                uu6Var.B = null;
                            } catch (Throwable th) {
                                uu6Var.B = null;
                                throw th;
                            }
                        }
                        break;
                    }
                    bch bchVar3 = uu6Var.z;
                    uu6Var.y = (bchVar3 != null && bchVar != null && bchVar3.b == bchVar.b && bchVar3.c == bchVar.c && bchVar3.d == bchVar.d) ? false : true;
                    uu6Var.z = bchVar;
                    return;
                }
                return;
            case 4:
                j28 j28Var = (j28) this.b;
                osh oshVar = (osh) this.c;
                ((cn7) j28Var.d).b((wm7) j28Var.c, oshVar.a, oshVar.b);
                return;
            case 5:
                tlh tlhVar = (tlh) this.b;
                dn7 dn7Var = (dn7) this.c;
                g7b g7bVar = tlhVar.f;
                g7bVar.getClass();
                int i = dn7Var.a;
                tab.m();
                n7b n7bVar = g7bVar.a;
                SparseArray sparseArray = n7bVar.k;
                lvb.b0(vqi.l(sparseArray, i));
                l7b l7bVar = (l7b) sparseArray.get(i);
                l7bVar.a.f(l7bVar.b);
                sparseArray.remove(i);
                n7bVar.p();
                return;
            default:
                o02 o02Var = (o02) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (o02Var.f) {
                    o02Var.b = false;
                    break;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
