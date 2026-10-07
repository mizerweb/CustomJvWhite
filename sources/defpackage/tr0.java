package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4c b;

    public /* synthetic */ tr0(h4c h4cVar, int i) {
        this.a = i;
        this.b = h4cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h4c h4cVar = this.b;
        switch (i) {
            case 0:
                for (pti ptiVar : h4cVar.g) {
                    String str = ptiVar.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Player autoplay. onMediaProcessingFinished.", null);
                        }
                    }
                    ptiVar.x = false;
                    RecyclerView recyclerView = ptiVar.h;
                    if (recyclerView != null) {
                        ptiVar.h(recyclerView, false);
                    }
                }
                break;
            default:
                Iterator it = h4cVar.g.iterator();
                while (it.hasNext()) {
                    ((pti) it.next()).e();
                }
                break;
        }
    }
}
