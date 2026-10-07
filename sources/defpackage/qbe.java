package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qbe extends a8j {
    public final af7 c;
    public final gjg d;
    public final ic6 e = new ic6(null);
    public final ic6 f = new ic6(null);
    public final mjg g;
    public final r8e h;
    public final mjg i;
    public final r8e j;
    public final mjg k;
    public final r8e l;

    public qbe(af7 af7Var, gjg gjgVar) {
        this.c = af7Var;
        this.d = gjgVar;
        Boolean bool = Boolean.FALSE;
        mjg mjgVarA = p90.a(bool);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(bool);
        this.i = mjgVarA2;
        this.j = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(bool);
        this.k = mjgVarA3;
        this.l = new r8e(mjgVarA3);
    }

    public final void B(boolean z) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
            ((Boolean) value).getClass();
        } while (!mjgVar.h(value, Boolean.valueOf(z)));
    }

    public final void C(ynh ynhVar, boolean z) {
        a8j.x(this.e, new nbe(ynhVar, z ? Integer.valueOf(R.drawable.icon_warning) : null));
    }
}
