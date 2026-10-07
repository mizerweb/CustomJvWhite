package defpackage;

import android.content.Context;
import one.me.sdk.database.OneMeRoomDatabase;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* JADX INFO: loaded from: classes.dex */
public final class mu2 extends kpe {
    public final /* synthetic */ int b;

    public /* synthetic */ mu2(int i) {
        this.b = i;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new iff(h5Var.d(136), h5Var.d(783), h5Var.d(97), h5Var.d(54), h5Var.d(23), h5Var.d(1048), h5Var.d(UploadConfig.DEFAULT_MAX_EVENT_COUNT), h5Var.d(1061), h5Var.d(18));
            case 1:
                return new s8f(h5Var.d(157));
            case 2:
                return new qeg(h5Var.d(157));
            case 3:
                return new a9a((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 4:
                return new s8a(h5Var.d(132));
            case 5:
                return new r9f(h5Var.d(157));
            case 6:
                return new ss2(h5Var.d(157));
            case 7:
                return new p96(h5Var.d(157));
            case 8:
                return new ye3(h5Var.d(353), h5Var.d(85), h5Var.d(54));
            case 9:
                return new s73(h5Var.d(144), h5Var.d(85), h5Var.d(139));
            case 10:
                return new rp3(h5Var.d(146), h5Var.d(325));
            case 11:
                h5Var.d(97);
                return new ou7(27);
            case 12:
                return (w6c) h5Var.c(HttpStatus.SC_UNAUTHORIZED);
            case 13:
                return (OneMeRoomDatabase) ((rre) ((w6c) h5Var.c(HttpStatus.SC_UNAUTHORIZED)).g.getValue());
            case 14:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).v();
            case 15:
                return r37.b;
            case 16:
                return new eb(h5Var.d(226), h5Var.d(146), h5Var.d(144), (ed6) h5Var.c(205), h5Var.d(97));
            case 17:
                return new yie(h5Var.d(226), h5Var.d(146), h5Var.d(144), (ed6) h5Var.c(205));
            case 18:
                return new rt0(h5Var.d(226), h5Var.d(146), h5Var.d(144), (ed6) h5Var.c(205), h5Var.d(97));
            case 19:
                return new du0(h5Var.d(226), h5Var.d(146), h5Var.d(144), (ed6) h5Var.c(205));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new k37(h5Var.d(139), h5Var.d(23), h5Var.d(146), h5Var.d(226));
            case 21:
                return new lk7(h5Var.d(669));
            case 22:
                return new pl0(h5Var.d(33), h5Var.d(31));
            case 23:
                zl9 zl9VarC = ((g5d) ((gjf) h5Var.c(97))).c();
                String str = zl9VarC != null ? zl9VarC.b : null;
                return (str == null || str.length() == 0) ? new yg((Context) h5Var.c(7), new ifh(new u02(h5Var, 1))) : new i1k(h5Var.d(122), (xhh) h5Var.c(23), str);
            case 24:
                return new no7((Context) h5Var.c(7));
            case 25:
                return new ep7((Context) h5Var.c(7), (xhh) h5Var.c(23));
            case 26:
                return new i51(h5Var.d(136));
            case 27:
                return new n49(h5Var.d(144), h5Var.d(218), h5Var.d(85));
            case 28:
                return new ul7((l7f) h5Var.c(229), h5Var.d(146), h5Var.d(144), h5Var.d(131), h5Var.d(136), h5Var.d(228), h5Var.d(227), h5Var.d(161), h5Var.d(205));
            default:
                return new ap6(h5Var.d(77), h5Var.d(100), h5Var.d(132), h5Var.d(85), h5Var.d(97), h5Var.d(7));
        }
    }
}
