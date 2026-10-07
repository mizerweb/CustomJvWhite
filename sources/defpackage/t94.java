package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface t94 {
    static dhc I(t94 t94Var, t94 t94Var2) {
        if (t94Var == null && t94Var2 == null) {
            return dhc.c;
        }
        w8b w8bVarH = t94Var2 != null ? w8b.h(t94Var2) : w8b.e();
        if (t94Var != null) {
            Iterator it = t94Var.c().iterator();
            while (it.hasNext()) {
                n(w8bVarH, t94Var2, t94Var, (bh0) it.next());
            }
        }
        return dhc.a(w8bVarH);
    }

    static void n(w8b w8bVar, t94 t94Var, t94 t94Var2, bh0 bh0Var) {
        if (!Objects.equals(bh0Var, v68.D0)) {
            w8bVar.l(bh0Var, t94Var2.g(bh0Var), t94Var2.i(bh0Var));
            return;
        }
        dne dneVar = (dne) t94Var2.b(bh0Var, null);
        dne dneVar2 = (dne) t94Var.b(bh0Var, null);
        s94 s94VarG = t94Var2.g(bh0Var);
        if (dneVar == null) {
            dneVar = dneVar2;
        } else if (dneVar2 != null) {
            euc eucVarN = euc.n(dneVar2);
            ww6 ww6Var = dneVar.a;
            if (ww6Var != null) {
                eucVarN.b = ww6Var;
            }
            ene eneVar = dneVar.b;
            if (eneVar != null) {
                eucVarN.c = eneVar;
            }
            oo6 oo6Var = dneVar.c;
            if (oo6Var != null) {
                eucVarN.d = oo6Var;
            }
            dneVar = new dne((ww6) eucVarN.b, (ene) eucVarN.c, (oo6) eucVarN.d);
        }
        w8bVar.l(bh0Var, s94VarG, dneVar);
    }

    Object b(bh0 bh0Var, Object obj);

    Set c();

    Set d(bh0 bh0Var);

    boolean f(bh0 bh0Var);

    s94 g(bh0 bh0Var);

    Object i(bh0 bh0Var);

    void j(hu huVar);

    Object k(bh0 bh0Var, s94 s94Var);
}
