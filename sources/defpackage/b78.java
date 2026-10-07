package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class b78 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final rjd a;
    public final oah b;
    public final oah c;
    public final la7 d;
    public final ka7 e;
    public final taa f;
    public final taa g;
    public final j85 h;
    public final oah i;
    public final AtomicLong j = new AtomicLong();
    public final d78 k;

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public b78(rjd rjdVar, Set set, Set set2, ia5 ia5Var, vi8 vi8Var, vi8 vi8Var2, dn5 dn5Var, j85 j85Var, h85 h85Var, d78 d78Var) {
        this.a = rjdVar;
        this.b = ia5Var;
        this.c = dn5Var;
        this.d = new la7(set);
        this.e = new ka7(set2);
        this.f = vi8Var;
        this.g = vi8Var2;
        this.h = j85Var;
        this.i = h85Var;
        this.k = d78Var;
    }

    public final q0 a(v78 v78Var, Object obj, u78 u78Var, hme hmeVar, String str) {
        if (v78Var == null) {
            return fql.d(new NullPointerException());
        }
        try {
            rjd rjdVar = this.a;
            rjdVar.getClass();
            qcd qcdVar = v78Var.o;
            qe7.v();
            mjd mjdVarA = rjdVar.a(v78Var);
            if (qcdVar != null) {
                mjdVarA = rjdVar.e(mjdVarA);
            }
            mjd mjdVar = mjdVarA;
            if (u78Var == null) {
                u78Var = u78.FULL_FETCH;
            }
            return f(mjdVar, v78Var, u78Var, obj, hmeVar, str);
        } catch (Exception e) {
            return fql.d(e);
        }
    }

    public final t25 b(v78 v78Var, Object obj) {
        return a(v78Var, obj, null, null, null);
    }

    public final la7 c(v78 v78Var, hme hmeVar) {
        if (v78Var == null) {
            ore.k("Required value was null.");
            return null;
        }
        ls0 ls0Var = v78Var.p;
        la7 la7Var = this.d;
        if (hmeVar == null) {
            return ls0Var == null ? la7Var : new la7(la7Var, ls0Var);
        }
        return ls0Var == null ? new la7(la7Var, hmeVar) : new la7(la7Var, hmeVar, ls0Var);
    }

    public final q0 d(v78 v78Var, pza pzaVar) {
        mjd ajeVar;
        mjd mjdVarB;
        whd whdVar = whd.b;
        rjd rjdVar = this.a;
        oah oahVar = this.i;
        d78 d78Var = this.k;
        CancellationException cancellationException = l;
        oah oahVar2 = this.b;
        qe7.v();
        if (!((Boolean) oahVar2.get()).booleanValue()) {
            return fql.d(cancellationException);
        }
        try {
            d78Var.w.getClass();
            if (v78Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (((Boolean) oahVar.get()).booleanValue()) {
                mjdVarB = rjdVar.b(v78Var);
            } else {
                mjd mjdVarA = rjdVar.a(v78Var);
                synchronized (rjdVar) {
                    ajeVar = (mjd) rjdVar.k.get(mjdVarA);
                    if (ajeVar == null) {
                        rjdVar.b.getClass();
                        ajeVar = new aje(mjdVarA, 1);
                        rjdVar.k.put(mjdVarA, ajeVar);
                    }
                }
                mjdVarB = ajeVar;
            }
            return g(mjdVarB, v78Var, pzaVar, whdVar);
        } catch (Exception e) {
            return fql.d(e);
        }
    }

    public final q0 e(v78 v78Var) {
        whd whdVar = whd.c;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return fql.d(l);
        }
        if (v78Var == null) {
            return fql.d(new NullPointerException("imageRequest is null"));
        }
        try {
            return g(this.a.b(v78Var), v78Var, null, whdVar);
        } catch (Exception e) {
            return fql.d(e);
        }
    }

    public final q0 f(mjd mjdVar, v78 v78Var, u78 u78Var, Object obj, hme hmeVar, String str) {
        qe7.v();
        jk8 jk8Var = new jk8(c(v78Var, hmeVar), this.e);
        try {
            u78 u78Var2 = v78Var.k;
            oof oofVar = new oof(v78Var, String.valueOf(this.j.getAndIncrement()), str, jk8Var, obj, u78Var2.a > u78Var.a ? u78Var2 : u78Var, false, !rki.d(v78Var.b), v78Var.j, this.k);
            qe7.v();
            yt3 yt3Var = new yt3(mjdVar, oofVar, jk8Var);
            qe7.v();
            return yt3Var;
        } catch (Exception e) {
            return fql.d(e);
        }
    }

    public final q0 g(mjd mjdVar, v78 v78Var, Object obj, whd whdVar) {
        jk8 jk8Var = new jk8(c(v78Var, null), this.e);
        Uri uri = v78Var.b;
        if (!uri.equals(uri)) {
            w78 w78VarB = w78.b(v78Var);
            w78VarB.a = uri;
            v78Var = w78VarB.a();
        }
        v78 v78Var2 = v78Var;
        try {
            u78 u78Var = v78Var2.k;
            if (u78Var.a <= 1) {
                u78Var = u78.FULL_FETCH;
            }
            u78 u78Var2 = u78Var;
            String strValueOf = String.valueOf(this.j.getAndIncrement());
            d78 d78Var = this.k;
            vbf vbfVar = d78Var.w;
            return ukl.b(mjdVar, new oof(v78Var2, strValueOf, null, jk8Var, obj, u78Var2, true, false, whdVar, d78Var), jk8Var);
        } catch (Exception e) {
            return fql.d(e);
        }
    }
}
