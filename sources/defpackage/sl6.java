package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sl6 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ sl6(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(list.contains((Long) obj));
            default:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((wf5) it.next()).b();
                }
                return sbi.a;
        }
    }
}
