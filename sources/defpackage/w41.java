package defpackage;

import bolts.Task;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w41 {
    public final hn5 a;
    public final qg7 b;
    public final qf4 c;
    public final Executor d;
    public final Executor e;
    public final lhb f;
    public final pgg g;

    public w41(hn5 hn5Var, qg7 qg7Var, qf4 qf4Var, Executor executor, Executor executor2, lhb lhbVar) {
        this.a = hn5Var;
        this.b = qg7Var;
        this.c = qf4Var;
        this.d = executor;
        this.e = executor2;
        this.f = lhbVar;
        pgg pggVar = new pgg();
        pggVar.a = new HashMap();
        this.g = pggVar;
    }

    public final void a() {
        this.g.g();
        try {
            Task.call(new mz0(1, this), this.e);
        } catch (Exception e) {
            pj6.k(e, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e);
        }
    }

    public final Task b(l6g l6gVar) {
        pgg pggVar = this.g;
        synchronized (pggVar) {
            if (((HashMap) pggVar.a).containsKey(l6gVar)) {
                p76 p76Var = (p76) ((HashMap) pggVar.a).get(l6gVar);
                synchronized (p76Var) {
                    if (!p76.P(p76Var)) {
                        ((HashMap) pggVar.a).remove(l6gVar);
                        pj6.j(pgg.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(p76Var)), l6gVar.a, Integer.valueOf(System.identityHashCode(l6gVar)));
                    }
                }
            }
            if (!this.a.e(l6gVar)) {
                try {
                    return Task.call(new u41(this, l6gVar, 0), this.d);
                } catch (Exception e) {
                    pj6.k(e, "Failed to schedule disk-cache read for %s", l6gVar.a);
                    return Task.forError(e);
                }
            }
        }
        return Task.forResult(Boolean.TRUE);
    }

    public final cba c(l6g l6gVar) throws IOException {
        String str = l6gVar.a;
        lhb lhbVar = this.f;
        try {
            pj6.d(w41.class, str, "Disk cache read for %s");
            dq6 dq6VarB = this.a.b(l6gVar);
            if (dq6VarB == null) {
                pj6.d(w41.class, str, "Disk cache miss for %s");
                lhbVar.getClass();
                return null;
            }
            File file = dq6VarB.a;
            pj6.d(w41.class, str, "Found entry in disk cache for %s");
            lhbVar.getClass();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                qg7 qg7Var = this.b;
                dba dbaVar = new dba((waa) qg7Var.b, (int) file.length());
                try {
                    ((qf4) qg7Var.c).e(fileInputStream, dbaVar);
                    cba cbaVarY = dbaVar.y();
                    dbaVar.close();
                    fileInputStream.close();
                    pj6.d(w41.class, str, "Successful read from disk cache for %s");
                    return cbaVarY;
                } catch (Throwable th) {
                    dbaVar.close();
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (IOException e) {
            pj6.k(e, "Exception reading from cache for %s", str);
            lhbVar.getClass();
            throw e;
        }
    }

    public final void d(l6g l6gVar) {
        this.g.v(l6gVar);
        try {
            Task.call(new u41(this, l6gVar, 1), this.e);
        } catch (Exception e) {
            pj6.k(e, "Failed to schedule disk-cache remove for %s", l6gVar.a);
            Task.forError(e);
        }
    }

    public final void e(l6g l6gVar, p76 p76Var) {
        String str = l6gVar.a;
        pj6.d(w41.class, str, "About to write to disk-cache for key %s");
        try {
            this.a.f(l6gVar, new t41(p76Var, this));
            this.f.getClass();
            pj6.d(w41.class, str, "Successful disk-cache write for key %s");
        } catch (IOException e) {
            pj6.k(e, "Failed to write to disk-cache for key %s", str);
        }
    }
}
