package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ng2 {
    public static final g40 a = gvk.b(0);

    public static final lg2 a(hg2 hg2Var) {
        try {
            Trace.beginSection("CameraPipe");
            zo7 zo7Var = new zo7(8, hg2Var);
            jg2 jg2Var = hg2Var.b;
            c70 c70Var = new c70();
            c70Var.e = jg2Var;
            c70Var.a = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
            c70Var.b = 4;
            c70Var.c = -3;
            c70Var.d = -1;
            return new lg2(new z05(zo7Var, c70Var));
        } finally {
            Trace.endSection();
        }
    }
}
