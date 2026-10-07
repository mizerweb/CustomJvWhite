package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b09 implements re2 {
    public final int b;

    public b09(int i) {
        this.b = i;
    }

    @Override // defpackage.re2
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nf2 nf2Var = (nf2) it.next();
            qyj.h("The camera info doesn't contain internal implementation.", nf2Var instanceof nf2);
            if (nf2Var.j() == this.b) {
                arrayList.add(nf2Var);
            }
        }
        return arrayList;
    }
}
