package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ey7 extends wye {
    public final Map H;
    public wu5 I;

    public ey7(qf qfVar, ev5 ev5Var, av5 av5Var, Map map) {
        super(qfVar, ev5Var, av5Var);
        this.H = map;
    }

    @Override // defpackage.wye
    public final b87 p(b87 b87Var) {
        wu5 wu5Var;
        wu5 wu5Var2 = this.I;
        if (wu5Var2 == null) {
            wu5Var2 = b87Var.r;
        }
        if (wu5Var2 != null && (wu5Var = (wu5) this.H.get(wu5Var2.c)) != null) {
            wu5Var2 = wu5Var;
        }
        lwa lwaVar = b87Var.l;
        lwa lwaVar2 = null;
        if (lwaVar == null) {
            lwaVar = lwaVar2;
        } else {
            jwa[] jwaVarArr = lwaVar.a;
            int length = jwaVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                jwa jwaVar = jwaVarArr[i2];
                if ((jwaVar instanceof bid) && "com.apple.streaming.transportStreamTimestamp".equals(((bid) jwaVar).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    jwa[] jwaVarArr2 = new jwa[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            jwaVarArr2[i < i2 ? i : i - 1] = jwaVarArr[i];
                        }
                        i++;
                    }
                    lwaVar2 = new lwa(jwaVarArr2);
                }
                lwaVar = lwaVar2;
            }
        }
        if (wu5Var2 != b87Var.r || lwaVar != b87Var.l) {
            a87 a87VarA = b87Var.a();
            a87VarA.q = wu5Var2;
            a87VarA.k = lwaVar;
            b87Var = new b87(a87VarA);
        }
        return super.p(b87Var);
    }
}
