package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cw6 implements wu1 {
    public final nr1 a;
    public final fw6 b;
    public boolean c;
    public boolean d;

    public cw6(nr1 nr1Var, fw6 fw6Var) {
        this.a = nr1Var;
        this.b = fw6Var;
    }

    public final void a(yt1 yt1Var, List list) {
        if (this.c && this.d) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            du1 du1Var = (du1) it.next();
            if (du1Var.c()) {
                boolean zD = cqk.d(du1Var.a, yt1Var);
                fw6 fw6Var = this.b;
                if (zD) {
                    if (!this.c) {
                        fw6Var.a();
                        this.c = true;
                    }
                } else if (!this.d) {
                    fw6Var.d();
                    this.d = true;
                }
            }
        }
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsAdded(su1 su1Var) {
        a((yt1) this.a.invoke(), su1Var.b);
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsChanged(tu1 tu1Var) {
        a((yt1) this.a.invoke(), tu1Var.a);
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsDeAnonimized(uu1 uu1Var) {
        a((yt1) this.a.invoke(), uu1Var.a);
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsRemoved(vu1 vu1Var) {
    }
}
