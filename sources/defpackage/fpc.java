package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fpc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;
    public final /* synthetic */ xbb c;

    public /* synthetic */ fpc(qpc qpcVar, xbb xbbVar, int i) {
        this.a = i;
        this.b = qpcVar;
        this.c = xbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        xbb xbbVar = this.c;
        qpc qpcVar = this.b;
        switch (i) {
            case 0:
                qpcVar.k("create sdp error " + xbbVar.b, "create.sdp2");
                qpcVar.r.post(new fpc(qpcVar, xbbVar, 2));
                break;
            case 1:
                qpcVar.k("set sdp error " + xbbVar.b, "set.sdp2");
                qpcVar.r.post(new fpc(qpcVar, xbbVar, 3));
                break;
            case 2:
                n91 n91VarB = qpcVar.B();
                if (n91VarB != null) {
                    n91VarB.onNegotiationError(xbbVar);
                }
                break;
            default:
                n91 n91VarB2 = qpcVar.B();
                if (n91VarB2 != null) {
                    n91VarB2.onNegotiationError(xbbVar);
                }
                break;
        }
    }
}
