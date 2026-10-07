package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class g4i {
    public static volatile b15 e;
    public final pt3 a;
    public final pt3 b;
    public final id5 c;
    public final z18 d;

    public g4i(pt3 pt3Var, pt3 pt3Var2, id5 id5Var, z18 z18Var, xde xdeVar) {
        this.a = pt3Var;
        this.b = pt3Var2;
        this.c = id5Var;
        this.d = z18Var;
        ((Executor) xdeVar.b).execute(new myj(0, xdeVar));
    }

    public static g4i a() {
        b15 b15Var = e;
        if (b15Var != null) {
            return (g4i) b15Var.g.get();
        }
        ore.k("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (g4i.class) {
                try {
                    if (e == null) {
                        ax0 ax0Var = new ax0();
                        context.getClass();
                        ax0Var.a = context;
                        e = ax0Var.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final e4i c(g71 g71Var) {
        Set setUnmodifiableSet = g71Var instanceof g71 ? Collections.unmodifiableSet(g71.d) : Collections.singleton(new z86("proto"));
        xtj xtjVarA = ij0.a();
        g71Var.getClass();
        xtjVarA.b = "cct";
        String str = g71Var.a;
        String str2 = g71Var.b;
        if (str2 == null) {
            str2 = "";
        }
        xtjVarA.c = qv1.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        return new e4i(setUnmodifiableSet, xtjVarA.n(), this);
    }
}
