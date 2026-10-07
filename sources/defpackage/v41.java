package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v41 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v41(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                w41 w41Var = (w41) obj2;
                l6g l6gVar = (l6g) obj;
                lhb lhbVar = w41Var.f;
                if (((AtomicBoolean) obj3).get()) {
                    throw new CancellationException();
                }
                p76 p76VarK = w41Var.g.k(l6gVar);
                String str = l6gVar.a;
                if (p76VarK != null) {
                    pj6.d(w41.class, str, "Found image for %s in staging area");
                    lhbVar.getClass();
                } else {
                    pj6.d(w41.class, str, "Did not find image for %s in staging area");
                    lhbVar.getClass();
                    try {
                        cba cbaVarC = w41Var.c(l6gVar);
                        if (cbaVarC == null) {
                            return null;
                        }
                        g95 g95VarY = au3.Y(cbaVarC);
                        try {
                            p76 p76Var = new p76(g95VarY);
                            g95VarY.close();
                            p76VarK = p76Var;
                        } catch (Throwable th) {
                            g95VarY.close();
                            throw th;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!Thread.interrupted()) {
                    return p76VarK;
                }
                if (pj6.a.h(2)) {
                    pj6.a.v(w41.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                }
                p76VarK.close();
                throw new InterruptedException();
            default:
                String str2 = (String) obj;
                WorkDatabase workDatabase = ((ijd) obj3).e;
                ((ArrayList) obj2).addAll((List) ch3.G(workDatabase.y().a, true, false, new rh5(str2, 15)));
                return workDatabase.x().d(str2);
        }
    }
}
