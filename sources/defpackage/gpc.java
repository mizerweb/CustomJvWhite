package defpackage;

import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gpc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ gpc(qpc qpcVar, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = qpcVar;
        this.c = sessionDescription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SessionDescription sessionDescription = this.c;
        qpc qpcVar = this.b;
        switch (i) {
            case 0:
                n91 n91VarB = qpcVar.B();
                if (n91VarB != null) {
                    n91VarB.onLocalSdpCreated(sessionDescription.type);
                }
                break;
            case 1:
                gv6 gv6Var = qpcVar.D;
                String str = sessionDescription.description;
                if (gv6Var.c) {
                    gv6Var.b = 0L;
                    gv6Var.a = 0L;
                    gv6Var.c = false;
                }
                long jA = gv6.a(str);
                gv6Var.b = jA;
                if (jA != 0) {
                    long j = gv6Var.a;
                    if (j != 0) {
                        gv6Var.c = true;
                        gv6Var.d.J(j ^ jA);
                    }
                }
                ppc ppcVar = qpcVar.J;
                if (ppcVar != null) {
                    ppcVar.n(qpcVar, sessionDescription);
                }
                break;
            default:
                gv6 gv6Var2 = qpcVar.D;
                String str2 = sessionDescription.description;
                if (gv6Var2.c) {
                    gv6Var2.b = 0L;
                    gv6Var2.a = 0L;
                    gv6Var2.c = false;
                }
                long jA2 = gv6.a(str2);
                gv6Var2.a = jA2;
                long j2 = gv6Var2.b;
                if (j2 != 0 && jA2 != 0) {
                    gv6Var2.c = true;
                    gv6Var2.d.J(jA2 ^ j2);
                }
                ppc ppcVar2 = qpcVar.J;
                if (ppcVar2 != null) {
                    ppcVar2.h(qpcVar, sessionDescription);
                }
                break;
        }
    }
}
