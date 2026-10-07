package defpackage;

import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ew6 {
    public final due a;
    public final fw6 b;
    public final cw6 c;

    public ew6(gi1 gi1Var, cmf cmfVar, esh eshVar, boolean z, boolean z2, nr1 nr1Var, due dueVar, occ occVar, CidLogger cidLogger) {
        gi1Var.getClass();
        eshVar.getClass();
        this.a = dueVar;
        fw6 fw6Var = new fw6(xw3.P0(new hjf(z, occVar, new occ(0, this, ew6.class, "isServerTopology", "isServerTopology()Z", 0, 24), eshVar, gi1Var, cidLogger), new mc8(new occ(0, this, ew6.class, "isServerTopology", "isServerTopology()Z", 0, 21), z, z2, eshVar, gi1Var, cidLogger), new mc8(new occ(0, this, ew6.class, "isServerTopology", "isServerTopology()Z", 0, 23), z, z2, eshVar, (fi1) gi1Var, cidLogger, (char) 0), new mc8(new occ(0, this, ew6.class, "isServerTopology", "isServerTopology()Z", 0, 22), z, z2, eshVar, gi1Var, cidLogger, (byte) 0)));
        this.b = fw6Var;
        this.c = new cw6(nr1Var, fw6Var);
    }

    public static final boolean a(ew6 ew6Var) {
        return ew6Var.a.w() == zvh.c;
    }
}
