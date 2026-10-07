package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class aj6 extends a8j {
    public final ny8 c;
    public final ny8 d;
    public final String e = aj6.class.getName();
    public final ic6 f = new ic6(null);
    public sgg g;

    public aj6(ny8 ny8Var, ny8 ny8Var2) {
        this.c = ny8Var;
        this.d = ny8Var2;
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
