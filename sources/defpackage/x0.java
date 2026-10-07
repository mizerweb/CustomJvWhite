package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public static final v0 k = new v0();
    public static final NullPointerException l = new NullPointerException("No image request was specified!");
    public static final AtomicLong m = new AtomicLong();
    public final Context a;
    public oah e;
    public boolean i;
    public Object b = null;
    public v78 c = null;
    public v78 d = null;
    public mr4 f = null;
    public boolean g = false;
    public boolean h = false;
    public au5 j = null;

    public x0(Context context) {
        this.a = context;
    }

    public final s1d a() {
        s1d s1dVarD;
        ay0 ay0VarP;
        v78 v78Var;
        if (!(this.e == null || (this.c == null && this.d == null))) {
            ore.k("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
            return null;
        }
        if (this.c == null && (v78Var = this.d) != null) {
            this.c = v78Var;
            this.d = null;
        }
        qe7.v();
        t1d t1dVar = (t1d) this;
        qe7.v();
        try {
            au5 au5Var = t1dVar.j;
            String strValueOf = String.valueOf(m.getAndIncrement());
            if (au5Var instanceof s1d) {
                s1dVarD = (s1d) au5Var;
            } else {
                xe4 xe4Var = t1dVar.o;
                s1dVarD = xe4Var.d((Resources) xe4Var.a, (ag5) xe4Var.b, (ot5) xe4Var.c, (Executor) xe4Var.d, (taa) xe4Var.e, (b50) xe4Var.f);
                oah oahVar = (oah) xe4Var.g;
                if (oahVar != null) {
                    s1dVarD.B = ((Boolean) oahVar.get()).booleanValue();
                }
            }
            s1d s1dVar = s1dVarD;
            oah oahVarA = t1dVar.e;
            if (oahVarA == null) {
                v78 v78Var2 = t1dVar.c;
                w0 w0Var = v78Var2 != null ? new w0(t1dVar, s1dVar, strValueOf, v78Var2, t1dVar.b, 1) : null;
                if (w0Var == null || t1dVar.d == null) {
                    oahVarA = w0Var;
                } else {
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(w0Var);
                    arrayList.add(new w0(t1dVar, s1dVar, strValueOf, t1dVar.d, t1dVar.b, 1));
                    oahVarA = wc8.a(arrayList, false);
                }
                if (oahVarA == null) {
                    oahVarA = fql.a();
                }
            }
            v78 v78Var3 = t1dVar.c;
            j85 j85Var = t1dVar.n.h;
            if (j85Var == null || v78Var3 == null) {
                ay0VarP = null;
            } else {
                qcd qcdVar = v78Var3.o;
                Object obj = t1dVar.b;
                ay0VarP = qcdVar != null ? j85Var.p(v78Var3, obj) : j85Var.m(v78Var3, obj);
            }
            Object obj2 = t1dVar.b;
            qe7.v();
            s1dVar.f(obj2, strValueOf);
            s1dVar.r = false;
            s1dVar.A = oahVarA;
            s1dVar.v(null);
            s1dVar.z = ay0VarP;
            s1dVar.v(null);
            qe7.v();
            synchronized (s1dVar) {
                s1dVar.C = t1dVar.c;
                s1dVar.D = t1dVar.d;
            }
            qe7.v();
            s1dVar.o = this.i;
            if (this.g) {
                if (s1dVar.d == null) {
                    s1dVar.d = new c48();
                }
                s1dVar.d.c(this.g);
                if (s1dVar.e == null) {
                    dk7 dk7VarC = dk7.c(this.a);
                    s1dVar.e = dk7VarC;
                    dk7VarC.f(s1dVar);
                }
            }
            mr4 mr4Var = this.f;
            if (mr4Var != null) {
                s1dVar.a(mr4Var);
            }
            if (this.h) {
                s1dVar.a(k);
            }
            qe7.v();
            return s1dVar;
        } catch (Throwable th) {
            qe7.v();
            throw th;
        }
    }
}
