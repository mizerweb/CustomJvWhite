package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class yc7 extends sr implements ljc {
    public final /* synthetic */ bd7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc7(bd7 bd7Var) {
        super(4);
        this.c = bd7Var;
    }

    @Override // defpackage.ljc
    public final void d(Object obj) {
        Object obj2;
        ad7 ad7Var;
        ((i64) this.b).Q(new rjc(obj));
        bd7 bd7Var = this.c;
        ad7 ad7Var2 = ad7.d;
        i40 i40Var = bd7Var.f;
        do {
            obj2 = i40Var.a;
            ad7 ad7Var3 = (ad7) obj2;
            int iOrdinal = ad7Var3.ordinal();
            if (iOrdinal == 0) {
                ad7Var = ad7.b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + bd7Var + "! State is " + ad7Var3 + ' ');
                }
                ad7Var = ad7Var2;
            }
        } while (!i40Var.a(obj2, ad7Var));
        Iterator it = bd7Var.h.iterator();
        if (it.hasNext()) {
            throw qt4.h(it);
        }
        if (ad7Var == ad7Var2) {
            Iterator it2 = bd7Var.h.iterator();
            if (it2.hasNext()) {
                throw qt4.h(it2);
            }
        }
    }
}
