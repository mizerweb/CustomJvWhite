package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zk6 {
    public final wo6 a;
    public final e5d b;
    public final pk5 c;

    public zk6(wo6 wo6Var, e5d e5dVar, pk5 pk5Var) {
        this.a = wo6Var;
        this.b = e5dVar;
        this.c = pk5Var;
    }

    public final float a(p5e p5eVar) {
        if (p5eVar instanceof m5e) {
            return (oc9.u(((m5e) p5eVar).c, 0.0f, 100.0f) / 100.0f) * 50.0f;
        }
        if (!(p5eVar instanceof o5e)) {
            return p5eVar instanceof n5e ? 100.0f : 0.0f;
        }
        float fU = oc9.u(((o5e) p5eVar).c, 0.0f, 100.0f);
        return ((List) ((f5d) this.a).a.F1.a(e5d.S6[134]).i()).contains(Integer.valueOf(this.c.a)) ? ((fU / 100.0f) * 49.0f) + 50.0f : (fU / 100.0f) * 90.0f;
    }
}
