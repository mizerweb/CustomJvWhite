package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ oyj d;

    public /* synthetic */ xj2(WorkDatabase workDatabase, String str, oyj oyjVar, int i) {
        this.a = i;
        this.b = workDatabase;
        this.c = str;
        this.d = oyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        oyj oyjVar = this.d;
        String str = this.c;
        WorkDatabase workDatabase = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) ch3.G(workDatabase.x().a, true, false, new rh5(str, 7))).iterator();
                while (it.hasNext()) {
                    sb8.h(oyjVar, (String) it.next());
                }
                break;
            default:
                Iterator it2 = ((List) ch3.G(workDatabase.x().a, true, false, new rh5(str, 12))).iterator();
                while (it2.hasNext()) {
                    sb8.h(oyjVar, (String) it2.next());
                }
                break;
        }
    }
}
