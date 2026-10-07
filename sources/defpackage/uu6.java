package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class uu6 implements cn7, fn7 {
    public EGLSurface B;
    public final Context a;
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final ex3 g;
    public final o02 h;
    public final Executor i;
    public final swi j;
    public final p11 l;
    public final c70 m;
    public final c70 n;
    public final en7 o;
    public final boolean p;
    public int q;
    public int r;
    public md5 s;
    public boolean t;
    public lag v;
    public ljf w;
    public boolean x;
    public boolean y;
    public bch z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public an7 u = new zpe(26);
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public long A = -9223372036854775807L;

    public uu6(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, ex3 ex3Var, o02 o02Var, Executor executor, swi swiVar, en7 en7Var, int i, boolean z) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = ex3Var;
        this.h = o02Var;
        this.i = executor;
        this.j = swiVar;
        this.o = en7Var;
        this.p = z;
        this.l = new p11(ex3.h(ex3Var), i);
        this.m = new c70(i);
        this.n = new c70(i);
    }

    @Override // defpackage.cn7
    public final void a() {
        this.h.s();
        if (!this.k.isEmpty()) {
            lvb.b0(!this.p);
            this.t = true;
        } else {
            ljf ljfVar = this.w;
            ljfVar.getClass();
            ljfVar.S();
            this.t = false;
        }
    }

    @Override // defpackage.cn7
    public final void b(wm7 wm7Var, dn7 dn7Var, final long j) {
        this.h.s();
        long j2 = this.A;
        Executor executor = this.i;
        if (j2 == -9223372036854775807L) {
            final int i = 0;
            executor.execute(new Runnable(this) { // from class: tu6
                public final /* synthetic */ uu6 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    long j3 = j;
                    uu6 uu6Var = this.b;
                    switch (i2) {
                        case 0:
                            uu6Var.j.e(j3, false);
                            break;
                        default:
                            uu6Var.j.e(j3, true);
                            break;
                    }
                }
            });
        }
        if (this.o != null) {
            lvb.b0(this.l.e() > 0);
            i(wm7Var, dn7Var, j, j * 1000);
            return;
        }
        if (this.p) {
            i(wm7Var, dn7Var, j, j * 1000);
        } else {
            osh oshVar = new osh(dn7Var, j);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.k;
            concurrentLinkedQueue.add(oshVar);
            long j3 = this.A;
            if (j3 != -9223372036854775807L) {
                if (j == j3) {
                    this.A = -9223372036854775807L;
                    final int i2 = 1;
                    executor.execute(new Runnable(this) { // from class: tu6
                        public final /* synthetic */ uu6 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            long j4 = j;
                            uu6 uu6Var = this.b;
                            switch (i3) {
                                case 0:
                                    uu6Var.j.e(j4, false);
                                    break;
                                default:
                                    uu6Var.j.e(j4, true);
                                    break;
                            }
                        }
                    });
                    i(wm7Var, dn7Var, j, System.nanoTime());
                    concurrentLinkedQueue.clear();
                } else {
                    this.u.z(dn7Var);
                }
            }
        }
        this.u.y();
    }

    @Override // defpackage.cn7
    public final void c(dn7 dn7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cn7
    public final void d(Executor executor, ef5 ef5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cn7
    public final void e(euc eucVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fn7
    public final void f(long j) {
        this.h.q(new ze5(this, j, 2), true);
    }

    @Override // defpackage.cn7
    public final void flush() {
        this.h.s();
        this.k.clear();
        int i = 0;
        this.t = false;
        md5 md5Var = this.s;
        if (md5Var != null) {
            md5Var.flush();
        }
        this.u.k();
        while (true) {
            if (i >= (this.o == null ? 1 : this.l.e())) {
                return;
            }
            this.u.y();
            i++;
        }
    }

    @Override // defpackage.cn7
    public final void g(an7 an7Var) {
        this.h.s();
        this.u = an7Var;
        int i = 0;
        while (true) {
            if (i >= (this.o == null ? 1 : this.l.e())) {
                return;
            }
            an7Var.y();
            i++;
        }
    }

    public final boolean h(wm7 wm7Var, int i, int i2) throws VideoFrameProcessingException {
        boolean z = (this.q == i && this.r == i2 && this.v != null) ? false : true;
        ArrayList arrayList = this.b;
        if (z) {
            this.q = i;
            this.r = i2;
            lag lagVarD = pwe.d(i, i2, arrayList);
            if (!Objects.equals(this.v, lagVarD)) {
                this.v = lagVarD;
                this.i.execute(new su6(this, 0, lagVarD));
            }
        }
        this.v.getClass();
        bch bchVar = this.z;
        en7 en7Var = this.o;
        if (bchVar == null && en7Var == null) {
            lvb.b0(this.B == null);
            md5 md5Var = this.s;
            if (md5Var != null) {
                md5Var.release();
                this.s = null;
            }
            lvb.G0("FinalShaderWrapper", "Output surface and size not set, dropping frame.");
            return false;
        }
        int i3 = bchVar == null ? this.v.a : bchVar.b;
        int i4 = bchVar == null ? this.v.b : bchVar.c;
        ex3 ex3Var = this.g;
        if (bchVar != null && this.B == null) {
            this.B = wm7Var.g(this.d, bchVar.a, ex3Var.c, bchVar.e);
        }
        if (en7Var != null) {
            this.l.d(wm7Var, i3, i4);
        }
        md5 md5Var2 = this.s;
        if (md5Var2 != null && (this.y || z || this.x)) {
            md5Var2.release();
            this.s = null;
            this.y = false;
            this.x = false;
        }
        if (this.s == null) {
            bch bchVar2 = this.z;
            int i5 = bchVar2 == null ? 0 : bchVar2.d;
            z88 z88Var = new z88(4);
            z88Var.f(arrayList);
            if (i5 != 0) {
                float f = i5 % 360.0f;
                if (f < 0.0f) {
                    f += 360.0f;
                }
                z88Var.c(new g1f(f));
            }
            z88Var.c(cgd.g(i3, i4));
            md5 md5VarK = md5.k(this.a, z88Var.h(), this.c, ex3Var, 0);
            lag lagVarD2 = pwe.d(this.q, this.r, md5VarK.i);
            bch bchVar3 = this.z;
            if (bchVar3 != null) {
                lvb.b0(lagVarD2.a == bchVar3.b);
                lvb.b0(lagVarD2.b == bchVar3.c);
            }
            this.s = md5VarK;
            this.y = false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [dn7] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [an7] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(wm7 wm7Var, dn7 dn7Var, long j, long j2) {
        ?? r7;
        long j3;
        uu6 uu6Var;
        ?? r8;
        uu6 uu6Var2;
        try {
            if (j2 != -2) {
                try {
                    if (h(wm7Var, dn7Var.c, dn7Var.d)) {
                        long j4 = this.A;
                        if (!(j4 != -9223372036854775807L) || j == j4) {
                            if (this.z != null) {
                                uu6 uu6Var3 = this;
                                j3 = j;
                                try {
                                    uu6Var3.j(dn7Var, j3, j2);
                                    r8 = dn7Var;
                                    uu6Var2 = uu6Var3;
                                } catch (VideoFrameProcessingException | GlUtil$GlException e) {
                                    e = e;
                                    r7 = dn7Var;
                                    uu6Var = uu6Var3;
                                    uu6Var.i.execute(new xc2(uu6Var, e, j3, 3));
                                    uu6Var2 = uu6Var;
                                    r8 = r7;
                                }
                            } else {
                                uu6 uu6Var4 = this;
                                dn7 dn7Var2 = dn7Var;
                                en7 en7Var = uu6Var4.o;
                                uu6Var2 = uu6Var4;
                                r8 = dn7Var2;
                                if (en7Var != null) {
                                    uu6Var4.k(dn7Var2, j);
                                    uu6Var2 = uu6Var4;
                                    r8 = dn7Var2;
                                }
                            }
                            uu6Var2.u.z(r8);
                            return;
                        }
                    }
                } catch (VideoFrameProcessingException e2) {
                    e = e2;
                    uu6Var = this;
                    r7 = dn7Var;
                    j3 = j;
                    uu6Var.i.execute(new xc2(uu6Var, e, j3, 3));
                    uu6Var2 = uu6Var;
                    r8 = r7;
                    uu6Var2.u.z(r8);
                    return;
                } catch (GlUtil$GlException e3) {
                    e = e3;
                    uu6Var = this;
                    r7 = dn7Var;
                    j3 = j;
                    uu6Var.i.execute(new xc2(uu6Var, e, j3, 3));
                    uu6Var2 = uu6Var;
                    r8 = r7;
                    uu6Var2.u.z(r8);
                    return;
                }
            }
            this.u.z(dn7Var);
            if (j2 == -2) {
                this.w.getClass();
            }
        } catch (VideoFrameProcessingException e4) {
            e = e4;
            this = this;
        } catch (GlUtil$GlException e5) {
            e = e5;
            this = this;
        }
    }

    public final void j(dn7 dn7Var, long j, long j2) throws VideoFrameProcessingException, GlUtil$GlException {
        EGLSurface eGLSurface = this.B;
        eGLSurface.getClass();
        bch bchVar = this.z;
        bchVar.getClass();
        md5 md5Var = this.s;
        md5Var.getClass();
        int i = bchVar.b;
        int i2 = bchVar.c;
        EGLDisplay eGLDisplay = this.d;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.e);
        tab.d("Error making context current");
        tab.r(0, i, i2);
        tab.g();
        md5Var.h(dn7Var.a, j);
        if (j2 == -3) {
            lvb.b0(j != -9223372036854775807L);
            j2 = 1000 * j;
        }
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        this.w.getClass();
        g55.a();
    }

    public final void k(dn7 dn7Var, long j) throws VideoFrameProcessingException, GlUtil$GlException {
        dn7 dn7VarF = this.l.f();
        this.m.b(j);
        tab.r(dn7VarF.b, dn7VarF.c, dn7VarF.d);
        tab.g();
        md5 md5Var = this.s;
        md5Var.getClass();
        md5Var.h(dn7Var.a, j);
        this.n.b(tab.m());
        en7 en7Var = this.o;
        en7Var.getClass();
        en7Var.a(this, dn7VarF, j);
    }

    @Override // defpackage.cn7
    public final void release() throws VideoFrameProcessingException {
        this.h.s();
        md5 md5Var = this.s;
        if (md5Var != null) {
            md5Var.release();
            this.s = null;
        }
        try {
            this.l.c();
            tab.p(this.d, this.B);
            tab.e();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
