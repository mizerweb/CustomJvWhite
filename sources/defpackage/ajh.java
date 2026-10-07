package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ajh implements mq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ajh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wn2 wn2Var = (wn2) obj;
                kk2 kk2Var = (kk2) wn2Var.b;
                rjh rjhVar = (rjh) wn2Var.c;
                if (kk2Var != null && kk2Var.a.y()) {
                    rjhVar.a();
                    return null;
                }
                if (task.isCancelled()) {
                    rjhVar.a();
                    return null;
                }
                if (task.isFaulted()) {
                    rjhVar.b(task.getError());
                    return null;
                }
                rjhVar.c(task.getResult());
                return null;
            default:
                Collection collection = (Collection) obj;
                if (collection.size() == 0) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Task) it.next()).getResult());
                }
                return arrayList;
        }
    }
}
