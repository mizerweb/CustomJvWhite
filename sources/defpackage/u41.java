package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u41 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w41 b;
    public final /* synthetic */ l6g c;

    public /* synthetic */ u41(w41 w41Var, l6g l6gVar, int i) {
        this.a = i;
        this.b = w41Var;
        this.c = l6gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean zD = false;
        switch (this.a) {
            case 0:
                w41 w41Var = this.b;
                l6g l6gVar = this.c;
                String str = l6gVar.a;
                lhb lhbVar = w41Var.f;
                p76 p76VarK = w41Var.g.k(l6gVar);
                if (p76VarK != null) {
                    p76VarK.close();
                    pj6.d(w41.class, str, "Found image for %s in staging area");
                    lhbVar.getClass();
                    zD = true;
                } else {
                    pj6.d(w41.class, str, "Did not find image for %s in staging area");
                    lhbVar.getClass();
                    try {
                        zD = w41Var.a.d(l6gVar);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return Boolean.valueOf(zD);
            default:
                w41 w41Var2 = this.b;
                l6g l6gVar2 = this.c;
                w41Var2.g.v(l6gVar2);
                hn5 hn5Var = w41Var2.a;
                synchronized (hn5Var.m) {
                    try {
                        ArrayList arrayListX = p90.x(l6gVar2);
                        for (int i = 0; i < arrayListX.size(); i++) {
                            String str2 = (String) arrayListX.get(i);
                            hn5Var.h.remove(str2);
                            hn5Var.e.remove(str2);
                        }
                    } catch (IOException e) {
                        ghb ghbVar = hn5Var.j;
                        e.getMessage();
                        ghbVar.getClass();
                    }
                    break;
                }
                return null;
        }
    }
}
