package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qsl implements jsl {
    public final ArrayList a;

    public qsl(Context context, esl eslVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        eslVar.getClass();
        arrayList.add(new ktl(context, eslVar));
    }

    @Override // defpackage.jsl
    public final void a(phf phfVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jsl) it.next()).a(phfVar);
        }
    }
}
