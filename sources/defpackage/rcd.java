package defpackage;

import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rcd extends sg5 {
    public final pjd c;
    public final es0 d;
    public final qcd e;
    public boolean f;
    public au3 g;
    public int h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ vm5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcd(vm5 vm5Var, lq0 lq0Var, pjd pjdVar, qcd qcdVar, es0 es0Var) {
        super(lq0Var);
        this.k = vm5Var;
        this.g = null;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.c = pjdVar;
        this.e = qcdVar;
        this.d = es0Var;
        es0Var.a(new o55(4, this));
    }

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
    public static void m(rcd rcdVar, au3 au3Var, int i) throws Throwable {
        qcd qcdVar = rcdVar.e;
        es0 es0Var = rcdVar.d;
        pjd pjdVar = rcdVar.c;
        oc9.i(Boolean.valueOf(au3.W(au3Var)));
        if (!(((xt3) au3Var.K()) instanceof CloseableStaticBitmap)) {
            rcdVar.o(i, au3Var);
            return;
        }
        pjdVar.a(es0Var, "PostprocessorProducer");
        g95 g95Var = null;
        Map mapA = null;
        try {
            try {
                g95 g95VarP = rcdVar.p((xt3) au3Var.K());
                try {
                    if (pjdVar.c(es0Var, "PostprocessorProducer")) {
                        mapA = h98.a("Postprocessor", qcdVar.getName());
                    }
                    pjdVar.d(es0Var, "PostprocessorProducer", mapA);
                    rcdVar.o(i, g95VarP);
                    au3.E(g95VarP);
                } catch (Throwable th) {
                    th = th;
                    g95Var = g95VarP;
                    au3.E(g95Var);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            pjdVar.b(es0Var, "PostprocessorProducer", e, !pjdVar.c(es0Var, "PostprocessorProducer") ? null : h98.a("Postprocessor", qcdVar.getName()));
            if (rcdVar.n()) {
                rcdVar.b.e(e);
                return;
            }
            return;
            au3.E(g95Var);
            throw th;
        }
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void d() {
        if (n()) {
            this.b.c();
        }
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void f(Throwable th) {
        if (n()) {
            this.b.e(th);
        }
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        au3 au3Var = (au3) obj;
        if (!au3.W(au3Var)) {
            if (lq0.a(i)) {
                o(i, null);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                au3 au3Var2 = this.g;
                this.g = au3.A(au3Var);
                this.h = i;
                this.i = true;
                boolean zQ = q();
                au3.E(au3Var2);
                if (zQ) {
                    ((Executor) this.k.d).execute(new zn(11, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        synchronized (this) {
            try {
                if (this.f) {
                    return false;
                }
                au3 au3Var = this.g;
                this.g = null;
                this.f = true;
                au3.E(au3Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    public final void o(int i, au3 au3Var) {
        boolean z;
        boolean zA = lq0.a(i);
        if (zA) {
            if (zA) {
                return;
            } else {
                return;
            }
        }
        synchronized (this) {
            z = this.f;
        }
        if (z) {
            if (zA || !n()) {
                return;
            }
        }
        this.b.g(i, au3Var);
    }

    public final g95 p(xt3 xt3Var) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) xt3Var;
        au3 au3VarA = this.e.a(closeableStaticBitmap.getUnderlyingBitmap(), (k2d) this.k.c);
        try {
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(au3VarA, xt3Var.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            closeableStaticBitmapOf.putExtras(closeableStaticBitmap.getExtras());
            return au3.Y(closeableStaticBitmapOf);
        } finally {
            au3.E(au3VarA);
        }
    }

    public final synchronized boolean q() {
        if (this.f || !this.i || this.j || !au3.W(this.g)) {
            return false;
        }
        this.j = true;
        return true;
    }
}
