package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class va9 implements dk5 {
    public final ynh a;
    public final af7 b;
    public final cf7 c;
    public final int d;
    public final long e;
    public final mjg f;
    public final r8e g;

    public va9(ynh ynhVar, af7 af7Var, cf7 cf7Var, int i, int i2) {
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = ynhVar;
        this.b = af7Var;
        this.c = cf7Var;
        this.d = i;
        this.e = ej5.b.incrementAndGet();
        mjg mjgVarA = p90.a(d());
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.g;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        if (ej5.a(e55Var.a, this.e)) {
            this.c.invoke(Boolean.valueOf(!((Boolean) this.b.invoke()).booleanValue()));
            List listD = d();
            mjg mjgVar = this.f;
            mjgVar.getClass();
            mjgVar.j(null, listD);
        }
    }

    public final List d() {
        return Collections.singletonList(new e55(this.e, this.a, this.d, null, new d55(((Boolean) this.b.invoke()).booleanValue()), 8));
    }
}
