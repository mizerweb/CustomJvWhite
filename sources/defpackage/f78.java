package defpackage;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f78 {
    public static f78 p;
    public static b78 q;
    public final fbc a;
    public final d78 b;
    public final w4 c;
    public final dn5 d;
    public nj9 e;
    public vi8 f;
    public nj9 g;
    public vi8 h;
    public ib5 i;
    public d5b j;
    public ojd k;
    public rjd l;
    public ww m;
    public ki3 n;
    public AnimatedFactoryV2Impl o;

    public f78(d78 d78Var) {
        qe7.v();
        d78Var.getClass();
        vbf vbfVar = d78Var.w;
        this.b = d78Var;
        vbfVar.getClass();
        this.a = new fbc(d78Var.i.b());
        this.c = new w4(d78Var.y);
        qe7.v();
        this.d = d78Var.g;
    }

    public static f78 g() {
        f78 f78Var = p;
        oc9.q(f78Var, "ImagePipelineFactory was not initialized!");
        return f78Var;
    }

    public final e85 a() {
        AnimatedFactoryV2Impl animatedFactoryV2ImplB = b();
        if (animatedFactoryV2ImplB == null) {
            return null;
        }
        if (animatedFactoryV2ImplB.h == null) {
            wi wiVar = new oah() { // from class: wi
                public final /* synthetic */ int a;

                public /* synthetic */ wi() {
                    i = i;
                }

                @Override // defpackage.oah
                public final Object get() {
                    int i;
                    switch (i) {
                        case 0:
                            i = 2;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                    return Integer.valueOf(i);
                }
            };
            jif kd5Var = animatedFactoryV2ImplB.i;
            if (kd5Var == null) {
                kd5Var = new kd5(animatedFactoryV2ImplB.b.j());
            }
            jif jifVar = kd5Var;
            wi wiVar2 = new oah() { // from class: wi
                public final /* synthetic */ int a;

                public /* synthetic */ wi() {
                    i = i;
                }

                @Override // defpackage.oah
                public final Object get() {
                    int i;
                    switch (i) {
                        case 0:
                            i = 2;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                    return Integer.valueOf(i);
                }
            };
            if (animatedFactoryV2ImplB.f == null) {
                animatedFactoryV2ImplB.f = new p3c(2, animatedFactoryV2ImplB);
            }
            animatedFactoryV2ImplB.h = new e85(animatedFactoryV2ImplB.f, tai.l(), jifVar, RealtimeSinceBootClock.get(), animatedFactoryV2ImplB.a, animatedFactoryV2ImplB.c, wiVar, wiVar2, new h85(2, Boolean.valueOf(animatedFactoryV2ImplB.k)), new h85(2, Boolean.valueOf(animatedFactoryV2ImplB.d)), new h85(2, Integer.valueOf(animatedFactoryV2ImplB.j)), new h85(2, Integer.valueOf(animatedFactoryV2ImplB.l)));
        }
        return animatedFactoryV2ImplB.h;
    }

    public final AnimatedFactoryV2Impl b() {
        if (this.o == null) {
            k2d k2dVarH = h();
            d78 d78Var = this.b;
            ee6 ee6Var = d78Var.i;
            vbf vbfVar = d78Var.w;
            ru4 ru4VarC = c();
            vbfVar.getClass();
            vbfVar.getClass();
            vbfVar.getClass();
            vbfVar.getClass();
            if (!np4.h) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Constructor constructor = AnimatedFactoryV2Impl.class.getConstructor(k2d.class, ee6.class, ru4.class, cls, cls, cls2, cls2, jif.class);
                    Boolean bool = Boolean.FALSE;
                    np4.i = (AnimatedFactoryV2Impl) constructor.newInstance(k2dVarH, ee6Var, ru4VarC, bool, bool, 30, 1000, null);
                } catch (Throwable unused) {
                }
                if (np4.i != null) {
                    np4.h = true;
                }
            }
            this.o = np4.i;
        }
        return this.o;
    }

    public final ru4 c() {
        if (this.e == null) {
            d78 d78Var = this.b;
            ku6 ku6Var = d78Var.z;
            vbf vbfVar = d78Var.w;
            h85 h85Var = d78Var.a;
            mhb mhbVar = d78Var.m;
            lhb lhbVar = d78Var.b;
            vbfVar.getClass();
            vbfVar.getClass();
            ku6Var.getClass();
            nj9 nj9Var = new nj9(new gp0(16), lhbVar, h85Var);
            mhbVar.getClass();
            this.e = nj9Var;
        }
        return this.e;
    }

    public final vi8 d() {
        if (this.f == null) {
            ru4 ru4VarC = c();
            lhb lhbVar = this.b.j;
            lhbVar.getClass();
            this.f = new vi8(ru4VarC, new q76(1, lhbVar));
        }
        return this.f;
    }

    public final vi8 e() {
        if (this.h == null) {
            d78 d78Var = this.b;
            d78Var.getClass();
            if (this.g == null) {
                ia5 ia5Var = d78Var.h;
                mhb mhbVar = d78Var.m;
                nj9 nj9Var = new nj9(new lhb(17), d78Var.c, ia5Var);
                mhbVar.getClass();
                this.g = nj9Var;
            }
            nj9 nj9Var2 = this.g;
            lhb lhbVar = d78Var.j;
            lhbVar.getClass();
            this.h = new vi8(nj9Var2, new q76(0, lhbVar));
        }
        return this.h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 b78, still in use, count: 2, list:
          (r2v0 b78) from 0x00ef: MOVE (r21v0 b78) = (r2v0 b78)
          (r2v0 b78) from 0x00f1: PHI (r21v1 b78) = (r21v0 b78), (r2v0 b78) binds: [B:26:0x00ef, B:25:0x00d8] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final defpackage.b78 f() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f78.f():b78");
    }

    public final k2d h() {
        if (this.m == null) {
            bbd bbdVar = this.b.o;
            i();
            this.m = new ww(bbdVar.a(), this.c);
        }
        return this.m;
    }

    public final l2d i() {
        if (this.n == null) {
            d78 d78Var = this.b;
            bbd bbdVar = d78Var.o;
            vbf vbfVar = d78Var.w;
            vbfVar.getClass();
            vbfVar.getClass();
            Object obj = vbfVar.c;
            fy0 fy0VarA = bbdVar.a();
            int i = bbdVar.a.c.d;
            sbd sbdVar = new sbd(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = k55.a;
                sbdVar.d(ByteBuffer.allocate(16384));
            }
            ki3 ki3Var = new ki3();
            ki3Var.b = new PreverificationHelper();
            ki3Var.a = fy0VarA;
            ki3Var.c = sbdVar;
            this.n = ki3Var;
        }
        return this.n;
    }
}
