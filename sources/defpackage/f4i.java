package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f4i {
    public final ij0 a;
    public final String b;
    public final z86 c;
    public final f2i d;
    public final g4i e;

    public f4i(ij0 ij0Var, String str, z86 z86Var, f2i f2iVar, g4i g4iVar) {
        this.a = ij0Var;
        this.b = str;
        this.c = z86Var;
        this.d = f2iVar;
        this.e = g4iVar;
    }

    public final void a(fc6 fc6Var) {
        dzh dzhVar = new dzh(7);
        if (fc6Var == null) {
            ore.n("Null event");
            return;
        }
        g4i g4iVar = this.e;
        id5 id5Var = g4iVar.c;
        jh0 jh0Var = (jh0) fc6Var;
        vhd vhdVar = jh0Var.b;
        xtj xtjVarA = ij0.a();
        ij0 ij0Var = this.a;
        xtjVarA.D(ij0Var.a);
        xtjVarA.d = vhdVar;
        xtjVarA.c = ij0Var.b;
        ij0 ij0VarN = xtjVarA.n();
        js8 js8Var = new js8();
        js8Var.f = new HashMap();
        js8Var.d = Long.valueOf(g4iVar.a.i());
        js8Var.e = Long.valueOf(g4iVar.b.i());
        js8Var.a = this.b;
        js8Var.c = new r76(this.c, (byte[]) this.d.apply(jh0Var.a));
        js8Var.b = null;
        id5Var.b.execute(new i0(id5Var, ij0VarN, dzhVar, js8Var.j()));
    }
}
