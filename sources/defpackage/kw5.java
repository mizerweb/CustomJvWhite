package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class kw5 implements jw5 {
    public final y82 a;
    public final ny8 b;
    public sgg c;
    public final ifh d = new ifh(new s35(8));
    public final mjg e;
    public final mjg f;

    public kw5(y82 y82Var, ny8 ny8Var) {
        this.a = y82Var;
        this.b = ny8Var;
        mjg mjgVarA = p90.a(null);
        this.e = mjgVarA;
        this.f = mjgVarA;
    }

    @Override // defpackage.jw5
    public final mjg a() {
        return this.f;
    }

    @Override // defpackage.jw5
    public final void release() throws IllegalAccessException, InvocationTargetException {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.e;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, null));
        sgg sggVar = this.c;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.c = null;
    }

    @Override // defpackage.jw5
    public final void start() {
        if (this.c == null) {
            this.c = yab.i0(this.a, ((n0c) ((xhh) this.b.getValue())).a(), 0, new i20(this, null, 14), 2);
        }
    }
}
