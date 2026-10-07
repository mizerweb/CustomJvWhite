package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f3 implements aw8 {
    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        wjl.b(this, u76Var, obj);
        throw null;
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        uad uadVar = (uad) this;
        v74 v74VarA = r55Var.a(uadVar.d());
        String strH = null;
        while (true) {
            int iV = v74VarA.v(uadVar.d());
            if (iV == -1) {
                throw new IllegalArgumentException(qv1.k("Polymorphic value has not been read for class ", strH).toString());
            }
            if (iV != 0) {
                if (iV == 1) {
                    if (strH == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    wjl.a(this, v74VarA, strH);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (strH == null) {
                    strH = "unknown class";
                }
                sb.append(strH);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(iV);
                throw new SerializationException(sb.toString());
            }
            strH = v74VarA.h(uadVar.d(), iV);
        }
    }
}
