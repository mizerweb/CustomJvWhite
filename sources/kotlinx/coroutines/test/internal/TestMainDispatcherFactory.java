package kotlinx.coroutines.test.internal;

import defpackage.d0b;
import defpackage.lk9;
import defpackage.qk9;
import defpackage.rlh;
import defpackage.yjg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lqk9;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TestMainDispatcherFactory implements qk9 {
    @Override // defpackage.qk9
    public final lk9 a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((qk9) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iB = ((qk9) next).b();
                do {
                    Object next2 = it.next();
                    int iB2 = ((qk9) next2).b();
                    if (iB < iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        qk9 qk9Var = (qk9) obj;
        if (qk9Var == null) {
            qk9Var = d0b.a;
        }
        return new rlh(new yjg(qk9Var, arrayList, this));
    }

    @Override // defpackage.qk9
    public final int b() {
        return Integer.MAX_VALUE;
    }
}
