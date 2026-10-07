package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class db2 implements AutoCloseable {
    public final dq4 a;
    public final CopyOnWriteArrayList b;

    public db2(ljf ljfVar, String str) {
        dq4 dq4VarA = cqk.a(lvb.x0(((zqh) ljfVar.c).f, new nah((vo8) ljfVar.d)));
        this.a = dq4VarA;
        this.b = new CopyOnWriteArrayList();
        yab.i0(dq4VarA, null, 0, new dn0(ljfVar, str, this, null, 13), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, nq4 nq4Var) {
        bb2 bb2Var;
        Object obj;
        if (nq4Var instanceof bb2) {
            bb2Var = (bb2) nq4Var;
            int i = bb2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bb2Var.g = i - Integer.MIN_VALUE;
            } else {
                bb2Var = new bb2(this, nq4Var);
            }
        } else {
            bb2Var = new bb2(this, nq4Var);
        }
        Object obj2 = bb2Var.e;
        int i2 = bb2Var.g;
        byte b = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj2);
            i64 i64Var = new i64();
            copyOnWriteArrayList.add(i64Var);
            cb2 cb2Var = new cb2(i64Var, lq4Var, b == true ? 1 : 0);
            bb2Var.d = i64Var;
            bb2Var.g = 1;
            Object objL0 = lvb.L0(j, cb2Var, bb2Var);
            hu4 hu4Var = hu4.a;
            if (objL0 == hu4Var) {
                return hu4Var;
            }
            obj2 = objL0;
            obj = i64Var;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = bb2Var.d;
            ch3.d0(obj2);
        }
        boolean z = obj2 != null;
        copyOnWriteArrayList.remove(obj);
        return Boolean.valueOf(z);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        cqk.g(this.a);
    }
}
