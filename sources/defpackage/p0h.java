package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class p0h extends a8j {
    public final ha9 c;
    public final ny8 d;
    public final ny8 e;
    public final mjg f;
    public sgg g;
    public final String h;
    public final r8e i;

    public p0h(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ha9 ha9Var) {
        this.c = ha9Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        mjg mjgVarA = p90.a(null);
        this.f = mjgVarA;
        this.h = p0h.class.getName();
        q0d q0dVar = new q0d(e9i.M0(mjgVarA, new rz1(1, null, ny8Var)), this, 24);
        Float fValueOf = Float.valueOf(0.0f);
        this.i = e9i.G0(q0dVar, this.b, j0g.a, fValueOf);
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.g;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.g = null;
    }
}
