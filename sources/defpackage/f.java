package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class f implements si8 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        switch (this.a) {
            case 0:
                return j.a;
            case 1:
                return new wa9(Boolean.TRUE, zfe.a(Boolean.class), 0, i9.c, "Фейк вью в каналах", "channel-fake-pixel", h5Var.d(163));
            case 2:
                return new cn9(h5Var.d(527));
            case 3:
                return new evj(h5Var.d(97), h5Var.d(363));
            case 4:
                Context context = (Context) h5Var.c(7);
                xt4 xt4VarB = ((n0c) ((xhh) h5Var.c(23))).b();
                ifh ifhVarD = h5Var.d(24);
                return new jt4(context, xt4VarB, (vze) h5Var.c(263), h5Var.d(136), ifhVarD);
            case 5:
                return new cm7(h5Var.d(114), h5Var.d(144), h5Var.d(136), h5Var.d(639), (xhh) h5Var.c(23));
            case 6:
                return new qgf(h5Var.d(146), h5Var.d(116), h5Var.d(136));
            case 7:
                return cu.a;
            case 8:
                return new z0a(1);
            case 9:
                return (jn0) h5Var.c(336);
            case 10:
                return new r8h(h5Var.d(337));
            case 11:
                return (in0) h5Var.c(340);
            case 12:
                return (hh9) h5Var.c(367);
            case 13:
                return (cs3) h5Var.c(726);
            case 14:
                return new pe1((y82) h5Var.c(65), h5Var.d(144), h5Var.d(146), h5Var.d(353), h5Var.d(23), h5Var.d(132), h5Var.d(286), h5Var.d(227), h5Var.d(724), h5Var.d(725), h5Var.d(641), h5Var.d(7), h5Var.d(26));
            case 15:
                return new lhc((Context) h5Var.c(7));
            case 16:
                return jg1.a;
            case 17:
                ifh ifhVarD2 = h5Var.d(85);
                return new va9(new xnh("📞 Debug-menu в звонке"), new jc1((et3) ifhVarD2.getValue(), 0), new kc1(ifhVarD2, 0), R.drawable.icon_call, 16);
            case 18:
                ifh ifhVarD3 = h5Var.d(85);
                return new va9(new xnh("😴 Кнопка холда в звонке"), new jc1((et3) ifhVarD3.getValue(), 1), new kc1(ifhVarD3, 1), R.drawable.icon_call_hold_fill, 16);
            case 19:
                return new lc1(0);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), 0, i9.h, "Подсказка смены режимов показана", "app.calls.change_mode_swipe_used", h5Var.d(163));
            case 21:
                return new h22(h5Var.d(139));
            case 22:
                return bk1.a;
            case 23:
                return new jmd(1);
            case 24:
                return (hh9) h5Var.c(141);
            case 25:
                return new cv0(h5Var.d(34), h5Var.d(85), h5Var.d(142), h5Var.d(23));
            case 26:
                return new px2(h5Var.d(498), h5Var.d(26));
            case 27:
                return new us6((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 28:
                return new tgf(h5Var.d(23), h5Var.d(290), h5Var.d(604), h5Var.d(1059), h5Var.d(1046), h5Var.d(291));
            default:
                return new os3(h5Var.d(144), h5Var.d(23));
        }
    }
}
