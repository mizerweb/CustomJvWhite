package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class u48 extends cli {
    public static final s48 D = new s48();
    public hmf A;
    public i88 B;
    public imf C;
    public final Object u;
    public w48 v;
    public Executor w;
    public p48 x;
    public Rect y;
    public Matrix z;

    public u48(y48 y48Var) {
        super(y48Var);
        this.u = new Object();
    }

    @Override // defpackage.cli
    public final yi0 A(t94 t94Var) {
        this.A.a(t94Var);
        Object[] objArr = {this.A.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        tw5 tw5VarB = this.j.b();
        tw5VarB.f = t94Var;
        return tw5VarB.j();
    }

    @Override // defpackage.cli
    public final yi0 B(yi0 yi0Var, yi0 yi0Var2) {
        tvj.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yi0Var + ", secondaryStreamSpec " + yi0Var2);
        y48 y48Var = (y48) this.i;
        g();
        hmf hmfVarJ = J(y48Var, yi0Var);
        this.A = hmfVarJ;
        Object[] objArr = {hmfVarJ.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        return yi0Var;
    }

    @Override // defpackage.cli
    public final void C() {
        wxl.a();
        imf imfVar = this.C;
        if (imfVar != null) {
            imfVar.b();
            this.C = null;
        }
        i88 i88Var = this.B;
        if (i88Var != null) {
            i88Var.a();
            this.B = null;
        }
        synchronized (this.u) {
            w48 w48Var = this.v;
            w48Var.u = false;
            w48Var.c();
            this.v = null;
        }
    }

    @Override // defpackage.cli
    public final void D(Matrix matrix) {
        super.D(matrix);
        synchronized (this.u) {
            try {
                w48 w48Var = this.v;
                if (w48Var != null) {
                    w48Var.i(matrix);
                }
                this.z = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cli
    public final void F(Rect rect) {
        this.l = rect;
        synchronized (this.u) {
            try {
                w48 w48Var = this.v;
                if (w48Var != null) {
                    w48Var.j(rect);
                }
                this.y = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    public final hmf J(y48 y48Var, yi0 yi0Var) {
        w48 w48Var;
        boolean z;
        wxl.a();
        Size size = yi0Var.a;
        Executor executor = (Executor) y48Var.b(gqh.U0, zjl.b());
        executor.getClass();
        Executor executor2 = executor;
        int iK = ((Integer) ((y48) this.i).b(y48.b, 0)).intValue() == 1 ? K() : 4;
        ls9 ls9Var = null;
        if (y48Var.b(y48.d, null) != null) {
            ore.m();
            return null;
        }
        ls9 ls9Var2 = new ls9(d3m.a(size.getWidth(), size.getHeight(), this.i.getInputFormat(), iK));
        synchronized (this.u) {
            M();
            w48Var = this.v;
        }
        if (e() != null) {
            pf2 pf2VarE = e();
            if (!((Boolean) ((y48) this.i).b(y48.g, Boolean.FALSE)).booleanValue() || j(pf2VarE, false) % 180 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        int height = z ? size.getHeight() : size.getWidth();
        int width = z ? size.getWidth() : size.getHeight();
        int i = L() == 2 ? 1 : 35;
        boolean z2 = this.i.getInputFormat() == 35 && L() == 2;
        boolean z3 = this.i.getInputFormat() == 35 && L() == 3;
        boolean z4 = this.i.getInputFormat() == 35 && (!(e() == null || j(e(), false) == 0) || Boolean.TRUE.equals((Boolean) ((y48) this.i).b(y48.f, null)));
        if (z2 || (z4 && !z3)) {
            ls9Var = new ls9(d3m.a(height, width, i, ls9Var2.n()));
        }
        if (ls9Var != null) {
            synchronized (w48Var.t) {
                w48Var.h = ls9Var;
            }
        }
        O();
        ls9Var2.D(w48Var, executor2);
        hmf hmfVarD = hmf.d(y48Var, yi0Var.a);
        t94 t94Var = yi0Var.f;
        if (t94Var != null) {
            hmfVarD.b.o(t94Var);
        }
        i88 i88Var = this.B;
        if (i88Var != null) {
            i88Var.a();
        }
        i88 i88Var2 = new i88(ls9Var2.getSurface(), size, this.i.getInputFormat());
        this.B = i88Var2;
        o9b.g(i88Var2.e).b(new su6(ls9Var2, 4, ls9Var), zjl.d());
        hmfVarD.h = yi0Var.d;
        a(hmfVarD, yi0Var);
        hmfVarD.b(this.B, yi0Var.c, -1);
        imf imfVar = this.C;
        if (imfVar != null) {
            imfVar.b();
        }
        imf imfVar2 = new imf(new o48(this, w48Var, 0));
        this.C = imfVar2;
        hmfVarD.f = imfVar2;
        return hmfVarD;
    }

    public final int K() {
        return ((Integer) ((y48) this.i).b(y48.c, 6)).intValue();
    }

    public final int L() {
        return ((Integer) ((y48) this.i).b(y48.e, 1)).intValue();
    }

    public final void M() {
        p48 p48Var;
        synchronized (this.u) {
            try {
                y48 y48Var = (y48) this.i;
                if (((Integer) y48Var.b(y48.b, 0)).intValue() == 1) {
                    this.v = new x48();
                } else {
                    this.v = new b58((Executor) y48Var.b(gqh.U0, zjl.b()));
                }
                this.v.d = L();
                this.v.e = ((Boolean) ((y48) this.i).b(y48.g, Boolean.FALSE)).booleanValue();
                pf2 pf2VarE = e();
                Boolean bool = (Boolean) ((y48) this.i).b(y48.f, null);
                boolean zA = pf2VarE != null ? pf2VarE.j().p().a(OnePixelShiftQuirk.class) : false;
                w48 w48Var = this.v;
                if (bool != null) {
                    zA = bool.booleanValue();
                }
                w48Var.f = zA;
                if (pf2VarE != null) {
                    this.v.b = j(pf2VarE, false);
                }
                Rect rect = this.y;
                if (rect != null) {
                    this.v.j(rect);
                }
                Matrix matrix = this.z;
                if (matrix != null) {
                    this.v.i(matrix);
                }
                Executor executor = this.w;
                if (executor != null && (p48Var = this.x) != null) {
                    this.v.h(executor, p48Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N(ExecutorService executorService, p48 p48Var) {
        synchronized (this.u) {
            try {
                w48 w48Var = this.v;
                if (w48Var != null) {
                    w48Var.h(executorService, new oo6(9, p48Var));
                }
                if (this.x == null) {
                    this.e = 1;
                    t();
                }
                this.w = executorService;
                this.x = p48Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O() {
        synchronized (this.u) {
            try {
                pf2 pf2VarE = e();
                if (pf2VarE != null) {
                    this.v.b = j(pf2VarE, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cli
    public final cmi h(boolean z, fmi fmiVar) {
        D.getClass();
        y48 y48Var = s48.a;
        t94 t94VarA = fmiVar.a(y48Var.L(), 1);
        if (z) {
            t94VarA = t94.I(t94VarA, y48Var);
        }
        if (t94VarA == null) {
            return null;
        }
        return new y48(dhc.a(((r48) n(t94VarA)).b));
    }

    @Override // defpackage.cli
    public final bmi n(t94 t94Var) {
        return new r48(w8b.h(t94Var), 0);
    }

    public final String toString() {
        return "ImageAnalysis:".concat(i());
    }

    @Override // defpackage.cli
    public final cmi w(nf2 nf2Var, bmi bmiVar) {
        Size sizeB;
        euc eucVarN;
        synchronized (this.u) {
            try {
                p48 p48Var = this.x;
                sizeB = p48Var != null ? p48Var.b() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sizeB == null) {
            return bmiVar.q();
        }
        if (nf2Var.D(((Integer) bmiVar.g().b(v68.w0, 0)).intValue()) % 180 == 90) {
            sizeB = new Size(sizeB.getHeight(), sizeB.getWidth());
        }
        cmi cmiVarQ = bmiVar.q();
        bh0 bh0Var = v68.z0;
        if (!cmiVarQ.f(bh0Var)) {
            bmiVar.g().m(bh0Var, sizeB);
        }
        cmi cmiVarQ2 = bmiVar.q();
        bh0 bh0Var2 = v68.D0;
        if (cmiVarQ2.f(bh0Var2)) {
            dne dneVar = (dne) this.g.b(bh0Var2, null);
            if (dneVar == null) {
                eucVarN = new euc(14, false);
                eucVarN.b = ww6.c;
                eucVarN.c = null;
                eucVarN.d = null;
            } else {
                eucVarN = euc.n(dneVar);
            }
            if (dneVar == null || dneVar.b == null) {
                eucVarN.c = new ene(sizeB);
            }
            if (dneVar == null) {
                eucVarN.d = new oo6(10, sizeB);
            }
            bmiVar.g().m(bh0Var2, new dne((ww6) eucVarN.b, (ene) eucVarN.c, (oo6) eucVarN.d));
        }
        return bmiVar.q();
    }

    @Override // defpackage.cli
    public final void x(int i) {
        if (E(i)) {
            O();
        }
    }
}
