package defpackage;

import android.opengl.GLES30;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ze5 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ze5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.pwi
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                df5 df5Var = (df5) this.c;
                long j = this.b;
                synchronized (df5Var) {
                    while (df5Var.h.e() < df5Var.h.b && df5Var.i.e() <= j) {
                        try {
                            p11 p11Var = df5Var.h;
                            ArrayDeque arrayDeque = (ArrayDeque) p11Var.e;
                            lvb.b0(!arrayDeque.isEmpty());
                            ((ArrayDeque) p11Var.d).add((dn7) arrayDeque.remove());
                            df5Var.i.f();
                            GLES30.glDeleteSync(df5Var.j.f());
                            tab.e();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    df5Var.b();
                }
                return;
            case 1:
                nf5 nf5Var = (nf5) this.c;
                long j2 = this.b;
                uu6 uu6Var = nf5Var.k;
                wm7 wm7Var = nf5Var.c;
                ConcurrentLinkedQueue concurrentLinkedQueue = uu6Var.k;
                uu6Var.h.s();
                if (uu6Var.o != null) {
                    return;
                }
                lvb.b0(!uu6Var.p);
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                osh oshVar = (osh) concurrentLinkedQueue.remove();
                uu6Var.i(wm7Var, oshVar.a, oshVar.b, j2);
                if (concurrentLinkedQueue.isEmpty() && uu6Var.t) {
                    ljf ljfVar = uu6Var.w;
                    ljfVar.getClass();
                    ljfVar.S();
                    uu6Var.t = false;
                    return;
                }
                return;
            default:
                uu6 uu6Var2 = (uu6) this.c;
                long j3 = this.b;
                c70 c70Var = uu6Var2.m;
                p11 p11Var2 = uu6Var2.l;
                lvb.b0(uu6Var2.o != null);
                while (p11Var2.e() < p11Var2.b && c70Var.e() <= j3) {
                    ArrayDeque arrayDeque2 = (ArrayDeque) p11Var2.e;
                    lvb.b0(!arrayDeque2.isEmpty());
                    ((ArrayDeque) p11Var2.d).add((dn7) arrayDeque2.remove());
                    c70Var.f();
                    GLES30.glDeleteSync(uu6Var2.n.f());
                    tab.e();
                    uu6Var2.u.y();
                }
                return;
        }
    }
}
