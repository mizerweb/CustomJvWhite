package defpackage;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g23 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ g23(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                e23 e23Var = (e23) obj;
                if (e23Var != null) {
                    return new e23(e23Var.a, e23Var.b, e23Var.c, e23Var.d, true);
                }
                return null;
            case 2:
                zv8[] zv8VarArr = xd3.X1;
                return null;
            case 3:
                zv8[] zv8VarArr2 = vl4.N;
                return null;
            case 4:
                ((wo8) obj).j0();
                return vd7.a();
            case 5:
                zv8[] zv8VarArr3 = fva.v;
                return null;
            case 6:
                return null;
            case 7:
                return String.valueOf(System.currentTimeMillis());
            case 8:
                return c76.a;
            default:
                return new sng((String) null, 3);
        }
    }
}
