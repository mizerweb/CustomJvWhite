package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l70 {
    public static final /* synthetic */ int e = 0;
    public final ny8 a;
    public final t51 b;
    public final ny8 c;
    public final ny8 d;

    public l70(ny8 ny8Var, t51 t51Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = t51Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    public static boolean a(sfa sfaVar) {
        c46 c46Var;
        w60 w60Var;
        j60 j60Var;
        b60 b60Var;
        d70 d70Var;
        o60 o60Var;
        if (sfaVar.E() || !sfaVar.C() || (c46Var = sfaVar.n) == null) {
            return true;
        }
        for (e70 e70Var : (List) c46Var.a) {
            if (e70Var.a == y60.c && (o60Var = e70Var.b) != null && ch3.r(o60Var.h)) {
                return false;
            }
            y60 y60Var = e70Var.a;
            if (y60Var == y60.d && (d70Var = e70Var.d) != null && d70Var.a == 0) {
                return false;
            }
            if (y60Var == y60.e && (b60Var = e70Var.e) != null && b60Var.a == 0) {
                return false;
            }
            if (y60Var == y60.j && (j60Var = e70Var.j) != null && j60Var.a == 0) {
                return false;
            }
            if ((y60Var == y60.f && (w60Var = e70Var.f) != null && w60Var.i() == 0) || e70Var.z == q60.b) {
                return false;
            }
        }
        return true;
    }

    public final void b(sfa sfaVar) {
        if (sfaVar.C()) {
            Iterator it = ((List) sfaVar.n.a).iterator();
            while (it.hasNext()) {
                c(sfaVar.a, ((e70) it.next()).t, q60.b);
            }
        }
    }

    public final void c(long j, String str, q60 q60Var) {
        ((qfa) this.a.getValue()).n(j, str, new ot4(4, q60Var));
    }
}
