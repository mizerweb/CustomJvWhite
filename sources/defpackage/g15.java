package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g15 extends exe {
    public final /* synthetic */ k71 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ble j;

    public g15(k71 k71Var, int i, ble bleVar) {
        this.h = k71Var;
        this.i = i;
        this.j = bleVar;
    }

    @Override // defpackage.exe
    public final Object e() {
        ble bleVar = this.j;
        c98 c98Var = bleVar.b;
        l4e l4eVar = bleVar.e;
        if (l4eVar == null) {
            return null;
        }
        b87 b87Var = bleVar.a;
        String str = b87Var.m;
        xr8 xr8Var = b8h.P0;
        jj6 sb7Var = (str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new sb7(xr8Var, 32) : new to9(xr8Var, 2);
        q51 q51Var = new q51(sb7Var, this.i, b87Var);
        try {
            l4eVar.getClass();
            l4e l4eVarE = bleVar.e();
            if (l4eVarE != null) {
                l4e l4eVarA = l4eVar.a(l4eVarE, ((ws0) c98Var.get(0)).a);
                k71 k71Var = this.h;
                if (l4eVarA == null) {
                    new dg8(k71Var, bql.a(bleVar, ((ws0) c98Var.get(0)).a, l4eVar, 0), bleVar.a, 0, null, q51Var).load();
                } else {
                    l4eVarE = l4eVarA;
                }
                new dg8(k71Var, bql.a(bleVar, ((ws0) c98Var.get(0)).a, l4eVarE, 0), bleVar.a, 0, null, q51Var).load();
            }
            sb7Var.release();
            return q51Var.a();
        } catch (Throwable th) {
            q51Var.a.release();
            throw th;
        }
    }
}
