package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ymb {
    public final ny8 a;
    public dqe b;
    public final long c;

    public ymb(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var2;
        this.b = bqe.a;
        long jT = ((xb9) ny8Var2.getValue()).t();
        this.c = jT;
        String name = ymb.class.getName();
        String str = (String) ((xb9) ny8Var2.getValue()).T().get(String.valueOf(jT));
        dqe dqeVarT = str != null ? zpe.t(str) : null;
        gm0.n(name, "ringtone from localPrefs: " + (dqeVarT != null ? dqeVarT.toString() : null));
        if (dqeVarT == null) {
            dqeVarT = ((nni) ny8Var.getValue()).g();
            a(dqeVarT);
        }
        this.b = dqeVarT;
    }

    public final void a(dqe dqeVar) {
        ny8 ny8Var = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(((xb9) ny8Var.getValue()).T());
        linkedHashMap.put(String.valueOf(this.c), dqeVar.toString());
        ((xb9) ny8Var.getValue()).j0(linkedHashMap);
    }
}
