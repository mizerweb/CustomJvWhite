package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dpc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;

    public /* synthetic */ dpc(qpc qpcVar, int i) {
        this.a = i;
        this.b = qpcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qpc qpcVar = this.b;
        switch (i) {
            case 0:
                qpcVar.s();
                break;
            case 1:
                qpcVar.V = false;
                ppc ppcVar = qpcVar.J;
                if (ppcVar != null) {
                    ppcVar.i(qpcVar);
                }
                break;
            case 2:
                n91 n91VarB = qpcVar.B();
                if (n91VarB != null) {
                    n91VarB.onIceRestart();
                }
                break;
            case 3:
                qpcVar.w.log("PeerConnectionClient", "createPeerConnectionFactoryInternal, " + qpcVar);
                qpcVar.I = false;
                break;
            case 4:
                ppc ppcVar2 = qpcVar.J;
                if (ppcVar2 != null) {
                    ppcVar2.a(qpcVar);
                }
                break;
            case 5:
                ppc ppcVar3 = qpcVar.J;
                if (ppcVar3 != null) {
                    ppcVar3.g();
                }
                break;
            case 6:
                qpcVar.I = true;
                break;
            default:
                qpcVar.s();
                an anVar = qpcVar.h;
                if (anVar != null) {
                    anVar.d();
                    nl nlVar = anVar.a;
                    if (nlVar.i) {
                        nlVar.g.remove(anVar);
                    }
                }
                hm hmVar = qpcVar.j;
                if (hmVar != null) {
                    f25 f25Var = hmVar.c;
                    if (f25Var != null) {
                        f25Var.c(hmVar);
                    }
                    hmVar.c = null;
                }
                qpcVar.w.log("PeerConnectionClient", qpcVar + ": " + uza.b(qpcVar) + " was released");
                break;
        }
    }
}
