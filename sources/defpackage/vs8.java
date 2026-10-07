package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vs8 implements aw8 {
    public static final vs8 a = new vs8();
    public static final us8 b = us8.b;

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        ss8 ss8Var = (ss8) obj;
        qe7.g(u76Var);
        mt8 mt8Var = mt8.a;
        dw dwVar = new dw(mt8Var.d());
        int size = ss8Var.size();
        x74 x74VarR = u76Var.r(dwVar, size);
        Iterator<jt8> it = ss8Var.iterator();
        for (int i = 0; i < size; i++) {
            x74VarR.i(dwVar, i, mt8Var, it.next());
        }
        x74VarR.c();
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        qe7.i(r55Var);
        return new ss8((List) new fw(mt8.a).i(r55Var));
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
