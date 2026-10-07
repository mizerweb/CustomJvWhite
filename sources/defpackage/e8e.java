package defpackage;

import android.view.ViewGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class e8e extends g6g {
    public final lsa f;

    public e8e(ExecutorService executorService, lsa lsaVar) {
        super(executorService);
        this.f = lsaVar;
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        s7g s7gVar = (s7g) lfeVar;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof j8a) {
                    s7gVar.C((k79) this.d.f.get(i), ww3.B1(list));
                    return;
                }
            }
        }
        u(s7gVar, i);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new tp4(viewGroup.getContext(), this.f);
    }
}
