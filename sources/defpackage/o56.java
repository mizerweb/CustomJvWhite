package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o56 {
    public final mjg a;
    public final r8e b;
    public final yh5 c;

    public o56() {
        mjg mjgVarA = p90.a(null);
        this.a = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.b = r8eVar;
        us5 us5Var = new us5(6);
        this.c = new yh5(new xre(us5Var, 16, r8eVar), new q0d(r8eVar, us5Var, 21));
    }

    public final void a(yka ykaVar) {
        mjg mjgVar = this.a;
        zka zkaVar = (zka) mjgVar.getValue();
        yka ykaVar2 = yka.d;
        yka ykaVar3 = yka.b;
        if (ykaVar == ykaVar2) {
            if ((zkaVar != null ? zkaVar.a : null) != ykaVar3) {
                return;
            }
        }
        if (ykaVar == null) {
            ykaVar = (zkaVar != null ? zkaVar.a : null) == ykaVar3 ? yka.c : ykaVar3;
        }
        zka zkaVar2 = new zka(ykaVar);
        mjgVar.getClass();
        mjgVar.j(null, zkaVar2);
    }
}
