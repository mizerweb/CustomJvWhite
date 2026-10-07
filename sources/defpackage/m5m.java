package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m5m implements f5m {
    public final ArrayList a;

    public m5m(Context context, x4m x4mVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        x4mVar.getClass();
        arrayList.add(new b6m(context, x4mVar));
    }

    @Override // defpackage.f5m
    public final void a(wze wzeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f5m) it.next()).a(wzeVar);
        }
    }
}
