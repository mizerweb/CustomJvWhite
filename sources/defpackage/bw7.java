package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class bw7 implements aw7 {
    public final ny8 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public boolean c;
    public zv7 d;

    public bw7(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(long j) {
        zv7 zv7Var = this.d;
        b(new zv7(j, (zv7Var == null || zv7Var.a != j) ? null : zv7Var.b));
    }

    public final void b(zv7 zv7Var) {
        this.d = zv7Var;
        Iterator it = this.b.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            bw7 bw7Var = this;
            boolean zT = ((tea) it.next()).T(zv7Var, new m20(2, bw7Var, bw7.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 25));
            if (!z2) {
                z2 = zT;
            }
            this = bw7Var;
        }
        bw7 bw7Var2 = this;
        if (zv7Var != null && !z2) {
            z = true;
        }
        bw7Var2.c = z;
    }
}
