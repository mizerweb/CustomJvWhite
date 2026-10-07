package defpackage;

import javax.net.ssl.SSLContext;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class u02 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ u02(h5 h5Var, int i) {
        this.a = i;
        this.b = h5Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        h5 h5Var = this.b;
        switch (i) {
            case 0:
                return new s4e(h5Var.d(97), h5Var.d(161), h5Var.d(69));
            case 1:
                return ((s7f) ((et3) h5Var.c(85))).v();
            case 2:
                return new k65(h5Var.d(735), h5Var.d(679), h5Var.d(702));
            case 3:
                return new bzd(new ifh(new u02(h5Var, 2)), h5Var.d(564), h5Var.d(146), h5Var.d(107), (ha9) h5Var.c(30));
            case 4:
                return (SSLContext) ((xd5) h5Var.c(5)).h.getValue();
            case 5:
                e5d e5dVar = (e5d) h5Var.c(26);
                return Boolean.valueOf(((Boolean) e5dVar.B().i()).booleanValue() && ((Boolean) e5dVar.N4.a(e5d.S6[301]).i()).booleanValue());
            case 6:
                return Long.valueOf(((s7f) ((et3) h5Var.c(85))).t());
            case 7:
                return h5Var.c(662);
            case 8:
                return h5Var.c(54);
            case 9:
                return h5Var.c(np0.m);
            case 10:
                return h5Var.c(470);
            case 11:
                return h5Var.c(131);
            case 12:
                return h5Var.c(221);
            case 13:
                return h5Var.c(470);
            case 14:
                return h5Var.c(563);
            case 15:
                return h5Var.c(221);
            case 16:
                return h5Var.c(662);
            case 17:
                return h5Var.c(481);
            case 18:
                return h5Var.c(300);
            case 19:
                return h5Var.c(527);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return h5Var.c(546);
            case 21:
                return h5Var.c(69);
            case 22:
                return h5Var.c(227);
            case 23:
                return h5Var.c(524);
            case 24:
                return h5Var.c(205);
            case 25:
                return h5Var.c(470);
            case 26:
                return h5Var.c(290);
            case 27:
                return h5Var.c(21);
            case 28:
                return h5Var.c(639);
            default:
                return h5Var.c(480);
        }
    }
}
