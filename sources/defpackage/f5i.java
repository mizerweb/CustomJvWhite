package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class f5i implements aw8 {
    public final aw8 a;
    public final aw8 b;
    public final aw8 c;
    public final hif d = yab.k("kotlin.Triple", new fif[0], new ptf(21, this));

    public f5i(aw8 aw8Var, aw8 aw8Var2, aw8 aw8Var3) {
        this.a = aw8Var;
        this.b = aw8Var2;
        this.c = aw8Var3;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        e5i e5iVar = (e5i) obj;
        hif hifVar = this.d;
        x74 x74VarA = u76Var.a(hifVar);
        x74VarA.i(hifVar, 0, this.a, e5iVar.a);
        x74VarA.i(hifVar, 1, this.b, e5iVar.b);
        x74VarA.i(hifVar, 2, this.c, e5iVar.c);
        x74VarA.c();
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        hif hifVar = this.d;
        v74 v74VarA = r55Var.a(hifVar);
        Object obj = rpk.a;
        Object objX = obj;
        Object objX2 = objX;
        Object objX3 = objX2;
        while (true) {
            int iV = v74VarA.v(hifVar);
            if (iV == -1) {
                v74VarA.j(hifVar);
                if (objX == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objX2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objX3 != obj) {
                    return new e5i(objX, objX2, objX3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iV == 0) {
                objX = v74VarA.x(hifVar, 0, this.a, null);
            } else if (iV == 1) {
                objX2 = v74VarA.x(hifVar, 1, this.b, null);
            } else {
                if (iV != 2) {
                    throw new SerializationException(zo5.h(iV, "Unexpected index "));
                }
                objX3 = v74VarA.x(hifVar, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.d;
    }
}
