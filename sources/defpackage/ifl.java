package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ifl extends sy8 {
    private final j0b b;

    public ifl(j0b j0bVar) {
        this.b = j0bVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    @Override // defpackage.sy8
    public final Object a(Object obj) {
        yrl owlVar;
        pp0 pp0Var = (pp0) obj;
        Context contextB = this.b.b();
        dbm dbmVarB = ubm.b(jqk.d());
        if (owl.c(contextB)) {
            owlVar = new owl(contextB, pp0Var, dbmVarB);
        } else {
            go7.b.getClass();
            if (go7.a(contextB) >= 204500000) {
                owlVar = new owl(contextB, pp0Var, dbmVarB);
            } else {
                owlVar = new b1m(contextB, pp0Var, dbmVarB);
            }
        }
        return new yol(this.b, pp0Var, owlVar, dbmVarB);
    }
}
