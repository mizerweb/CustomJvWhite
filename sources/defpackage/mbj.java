package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mbj implements zqc {
    public final gu4 a;
    public final ny8 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public mbj(gu4 gu4Var, ny8 ny8Var) {
        this.a = gu4Var;
        this.b = ny8Var;
    }

    @Override // defpackage.zqc
    public final b9b a(pxa pxaVar) {
        wd4 wd4Var = (wd4) this.b.getValue();
        if (wd4Var.c()) {
            return p90.O(1, "vpn");
        }
        this.c.computeIfAbsent(new owh(pxaVar.b), new mm(19, new jl3(this, 2, wd4Var)));
        return q1f.b;
    }

    @Override // defpackage.zqc
    public final void b(pxa pxaVar, b9b b9bVar) throws IllegalAccessException, InvocationTargetException {
        lbj lbjVar = (lbj) this.c.remove(new owh(pxaVar.b));
        if (lbjVar != null) {
            lbjVar.finalize();
        }
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) throws IllegalAccessException, InvocationTargetException {
        lbj lbjVar = (lbj) this.c.remove(new owh(pxaVar.b));
        if (lbjVar != null) {
            lbjVar.finalize();
            if (lbjVar.c) {
                return p90.O(1, "vpn");
            }
        }
        return q1f.b;
    }
}
