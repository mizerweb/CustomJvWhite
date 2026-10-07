package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oqa extends a8j {
    public final mjg c;
    public final r8e d;
    public final mjg e;
    public final r8e f;
    public final mjg g;
    public final r8e h;
    public final ic6 i;
    public final ic6 j;
    public final mjg k;

    public oqa(boolean z) {
        String name = oqa.class.getName();
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.c = mjgVarA;
        this.d = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.e = mjgVarA2;
        this.f = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(null);
        this.g = mjgVarA3;
        this.h = new r8e(mjgVarA3);
        this.i = new ic6(null);
        this.j = new ic6(name);
        this.k = p90.a(Boolean.valueOf(z));
    }

    public final void B(ylc ylcVar) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.e;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, ylcVar == null ? null : new zv7(((Number) ylcVar.a).longValue(), (List) ylcVar.b)));
    }
}
