package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h79 extends i79 {
    @Override // defpackage.i79
    public final void a(long j, Object obj) {
        ((r3) ((vj8) ldi.d.i(j, obj))).a = false;
    }

    @Override // defpackage.i79
    public final void b(long j, Object obj, Object obj2) {
        kdi kdiVar = ldi.d;
        vj8 vj8VarK = (vj8) kdiVar.i(j, obj);
        vj8 vj8Var = (vj8) kdiVar.i(j, obj2);
        int size = vj8VarK.size();
        int size2 = vj8Var.size();
        if (size > 0 && size2 > 0) {
            if (!((r3) vj8VarK).a) {
                vj8VarK = vj8VarK.k(size2 + size);
            }
            vj8VarK.addAll(vj8Var);
        }
        if (size > 0) {
            vj8Var = vj8VarK;
        }
        ldi.o(j, obj, vj8Var);
    }

    @Override // defpackage.i79
    public final List c(long j, Object obj) {
        vj8 vj8Var = (vj8) ldi.d.i(j, obj);
        if (((r3) vj8Var).a) {
            return vj8Var;
        }
        int size = vj8Var.size();
        vj8 vj8VarK = vj8Var.k(size == 0 ? 10 : size * 2);
        ldi.o(j, obj, vj8VarK);
        return vj8VarK;
    }
}
