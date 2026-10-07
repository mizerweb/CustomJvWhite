package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mm4 {
    public final ny8 a;
    public final ny8 b;
    public final ifh c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final yf5 e;

    public mm4(gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ifh ifhVar) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ifhVar;
        this.e = yab.h(gu4Var, null, 0, new wyj(ny8Var, null, 7), 3);
    }

    public final Object a(ArrayList arrayList, nq4 nq4Var) {
        Object objK0 = yab.K0((xt4) this.c.getValue(), new gz(arrayList, this, (lq4) null, 6), nq4Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final Object b(List list, cf7 cf7Var, nq4 nq4Var) {
        Object objK0 = yab.K0((xt4) this.c.getValue(), new vk4(this, list, cf7Var, (lq4) null, 2), nq4Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }
}
