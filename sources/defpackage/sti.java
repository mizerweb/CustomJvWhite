package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sti {
    public final /* synthetic */ int a = 0;
    public Object b;
    public long c;
    public long d;
    public Object e;
    public Object f;
    public int g;

    public sti(sti stiVar) {
        this.b = (String) stiVar.b;
        this.c = stiVar.c;
        this.d = stiVar.d;
        this.e = (a9m) stiVar.e;
        this.f = (String) stiVar.f;
        this.g = stiVar.g;
    }

    public static sti a(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        sti stiVar = new sti();
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            int i2 = 3;
            switch (strS0) {
                case "conversationId":
                    stiVar.b = fkaVar.S0();
                    break;
                case "chatId":
                    stiVar.d = fkaVar.I0();
                    break;
                case "callerId":
                    stiVar.c = fkaVar.I0();
                    break;
                case "type":
                    String strS1 = fkaVar.S0();
                    strS1.getClass();
                    if (strS1.equals("AUDIO")) {
                        i2 = 2;
                    } else if (!strS1.equals("VIDEO")) {
                        i2 = 1;
                    }
                    stiVar.g = i2;
                    break;
                case "turnServer":
                    stiVar.e = a9m.h(fkaVar);
                    break;
                case "sdpOffer":
                    stiVar.f = ch3.W(fkaVar);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new sti(stiVar);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = (String) this.b;
                long j = this.c;
                long j2 = this.d;
                String strValueOf = String.valueOf((a9m) this.e);
                String str2 = (String) this.f;
                String strU = bc1.u(this.g);
                StringBuilder sbB = nbh.B(j, "{conversationId='", str, "', callerId=");
                qt4.z(j2, ", chatId=", ", turnServer=", sbB);
                nbh.G(sbB, strValueOf, ", sdpOffer='", str2, "', type=");
                return zo5.w(sbB, strU, "}");
            default:
                return super.toString();
        }
    }

    public sti(ljf ljfVar) {
        zu4 zu4Var = new zu4(ljfVar);
        this.b = ljfVar;
        this.f = zu4Var;
        this.e = new Object();
    }

    public /* synthetic */ sti() {
    }
}
