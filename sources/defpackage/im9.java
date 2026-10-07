package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class im9 extends k0 {
    public final aw8 a;
    public final aw8 b;

    public im9(aw8 aw8Var, aw8 aw8Var2) {
        this.a = aw8Var;
        this.b = aw8Var2;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        x74 x74VarR = u76Var.r(d(), h(obj));
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            x74VarR.i(d(), i, this.a, key);
            i += 2;
            x74VarR.i(d(), i2, this.b, value);
        }
        x74VarR.c();
    }

    @Override // defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        Map map = (Map) obj;
        Object objX = v74Var.x(d(), i, this.a, null);
        int iV = v74Var.v(d());
        if (iV != i + 1) {
            c.o(qt4.l("Value must follow key in a map, index for key: ", i, iV, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objX);
        aw8 aw8Var = this.b;
        map.put(objX, (!zContainsKey || (aw8Var.d().d() instanceof rhd)) ? v74Var.x(d(), iV, aw8Var, null) : v74Var.x(d(), iV, aw8Var, wm9.N0(map, objX)));
    }
}
