package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tye {
    public final t9b a;
    public final int b;
    public final lwa c;
    public boolean d;

    public tye(b87 b87Var, t9b t9bVar) {
        this.a = t9bVar;
        this.c = b87Var.l;
        this.b = izl.k(b87Var.n);
    }

    public static String h(b87 b87Var, List list) {
        String str = b87Var.n;
        ex3 ex3Var = b87Var.D;
        str.getClass();
        boolean zM = uya.m(str);
        t98 t98Var = new t98(4);
        t98Var.h(str);
        if (zM) {
            t98Var.c("video/hevc");
            t98Var.c("video/avc");
        }
        t98Var.i(list);
        c98 c98VarA = t98Var.j().a();
        for (int i = 0; i < c98VarA.size(); i++) {
            String str2 = (String) c98VarA.get(i);
            if (list.contains(str2)) {
                if (zM && ex3.h(ex3Var)) {
                    if (!y86.f(str2, ex3Var).isEmpty()) {
                        return str2;
                    }
                } else if (!y86.e(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract sp7 i(s26 s26Var, b87 b87Var, int i);

    public abstract u55 j();

    public abstract b87 k();

    public abstract boolean l();

    public boolean m() {
        return false;
    }

    public abstract void n();

    public abstract void o();
}
