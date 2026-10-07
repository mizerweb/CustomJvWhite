package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya9 implements mjd {
    public final Executor a;
    public final qg7 b;

    public ya9(Executor executor, qg7 qg7Var) {
        this.a = executor;
        this.b = qg7Var;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        pjd pjdVar = es0Var.c;
        v78 v78Var = es0Var.a;
        es0Var.h("local", "fetch");
        xa9 xa9Var = new xa9(this, lq0Var, pjdVar, es0Var, e(), v78Var, pjdVar, es0Var);
        es0Var.a(new o55(3, xa9Var));
        this.a.execute(xa9Var);
    }

    public final p76 c(InputStream inputStream, int i) {
        g95 g95VarY;
        qg7 qg7Var = this.b;
        try {
            if (i <= 0) {
                qg7Var.getClass();
                dba dbaVar = new dba((waa) qg7Var.b);
                try {
                    ((qf4) qg7Var.c).e(inputStream, dbaVar);
                    cba cbaVarY = dbaVar.y();
                    dbaVar.close();
                    g95VarY = au3.Y(cbaVarY);
                } catch (Throwable th) {
                    dbaVar.close();
                    throw th;
                }
            } else {
                qg7Var.getClass();
                dba dbaVar2 = new dba((waa) qg7Var.b, i);
                try {
                    ((qf4) qg7Var.c).e(inputStream, dbaVar2);
                    cba cbaVarY2 = dbaVar2.y();
                    dbaVar2.close();
                    g95VarY = au3.Y(cbaVarY2);
                } catch (Throwable th2) {
                    dbaVar2.close();
                    throw th2;
                }
            }
            g95 g95Var = g95VarY;
            p76 p76Var = new p76(g95Var);
            bu3.b(inputStream);
            g95Var.close();
            return p76Var;
        } catch (Throwable th3) {
            bu3.b(inputStream);
            au3.E(null);
            throw th3;
        }
    }

    public abstract p76 d(v78 v78Var);

    public abstract String e();
}
