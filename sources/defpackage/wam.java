package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wam implements tam {
    final List a;

    public wam(Context context, vam vamVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (vamVar.c()) {
            arrayList.add(new lbm(context, vamVar));
        }
    }

    @Override // defpackage.tam
    public final void a(sam samVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tam) it.next()).a(samVar);
        }
    }
}
