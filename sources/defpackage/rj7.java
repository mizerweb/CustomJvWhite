package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rj7 implements ohf {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ rj7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new qj7(this);
            default:
                ohf ohfVar = (ohf) this.b;
                ArrayList arrayList = new ArrayList();
                yhf.v0(ohfVar, arrayList);
                bx3.Y0(arrayList, (Comparator) this.c);
                return arrayList.iterator();
        }
    }
}
