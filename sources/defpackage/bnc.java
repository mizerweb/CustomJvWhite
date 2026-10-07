package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class bnc implements wu1 {
    public final /* synthetic */ int a;
    public final Object b;

    public bnc() {
        this.a = 0;
        this.b = new CopyOnWriteArraySet();
    }

    private final void a(tu1 tu1Var) {
    }

    private final void b(uu1 uu1Var) {
    }

    private final void c(vu1 vu1Var) {
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsAdded(su1 su1Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (!su1Var.b.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) obj).iterator();
                    while (it.hasNext()) {
                        ((wu1) it.next()).onCallParticipantsAdded(su1Var);
                    }
                    break;
                }
                break;
            default:
                ih ihVar = (ih) obj;
                o91 o91Var = (o91) ihVar.a;
                o91 o91Var2 = (o91) ihVar.a;
                if (!o91Var.x() && !o91Var2.j0.j().isEmpty()) {
                    o91Var2.H();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsChanged(tu1 tu1Var) {
        switch (this.a) {
            case 0:
                if (!tu1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((wu1) it.next()).onCallParticipantsChanged(tu1Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsDeAnonimized(uu1 uu1Var) {
        switch (this.a) {
            case 0:
                if (!uu1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((wu1) it.next()).onCallParticipantsDeAnonimized(uu1Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu1
    public final void onCallParticipantsRemoved(vu1 vu1Var) {
        switch (this.a) {
            case 0:
                if (!vu1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((wu1) it.next()).onCallParticipantsRemoved(vu1Var);
                    }
                    break;
                }
                break;
        }
    }

    public bnc(ih ihVar) {
        this.a = 1;
        this.b = ihVar;
    }
}
