package defpackage;

import android.content.Context;
import one.me.sdk.arch.Widget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class nx9 implements si8 {
    public final /* synthetic */ int a;

    public /* synthetic */ nx9(int i) {
        this.a = i;
    }

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        switch (this.a) {
            case 0:
                ifh ifhVarD = h5Var.d(7);
                ifh ifhVarD2 = h5Var.d(23);
                ifh ifhVarD3 = h5Var.d(944);
                ifh ifhVarD4 = h5Var.d(783);
                ifh ifhVarD5 = h5Var.d(138);
                ifh ifhVarD6 = h5Var.d(97);
                ifh ifhVarD7 = h5Var.d(318);
                ifh ifhVarD8 = h5Var.d(782);
                return new mx9(ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6, h5Var.d(161), ifhVarD7, ifhVarD8, h5Var.d(263), h5Var.d(294), h5Var.d(26), h5Var.d(np0.o), h5Var.d(52), (xn3) h5Var.c(144));
            case 1:
                return ox9.a;
            case 2:
                return new jz5(h5Var.d(23), h5Var.d(138), h5Var.d(136), h5Var.d(144), h5Var.d(54), h5Var.d(26), h5Var.d(1089), h5Var.d(1048), h5Var.d(1088), h5Var.d(18), h5Var.d(1090));
            case 3:
                h5Var.d(26);
                return new z0a(0);
            case 4:
                return new yx9((Context) h5Var.c(7));
            case 5:
                return pva.a;
            case 6:
                return new b7b(h5Var.d(0), h5Var.d(26));
            case 7:
                return new jmd(4);
            case 8:
                return (hh9) h5Var.c(1120);
            case 9:
                return new bxb(h5Var);
            case 10:
                return fab.a;
            case 11:
                return (hh9) h5Var.c(1121);
            case 12:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), 0, dz7.l, "Включить возможность смены языка приложения", "app.lang.multilang", h5Var.d(163));
            case 13:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), 0, dz7.m, "Включить кастомный язык", "app.lang.customLang", h5Var.d(163));
            case 14:
                return (rba) h5Var.c(1116);
            case 15:
                return new kn7();
            case 16:
                return new xwb(h5Var.d(974));
            case 17:
                tfi tfiVar = (tfi) h5Var.c(388);
                return new va9(new xnh("Предупреждать об опасных файлах"), new kj1((nni) h5Var.c(161)), new ol0(19, tfiVar), 0, 24);
            case 18:
                return jq8.a;
            case 19:
                return s29.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return wi6.a;
            case 21:
                return (hh9) h5Var.c(1118);
            case 22:
                return (hh9) h5Var.c(1119);
            case 23:
                return new e(h5Var.d(0), h5Var.d(54));
            case 24:
                return new uab(h5Var.d(0), ((bk5) ((e5d) h5Var.c(26)).j().i()).a(xj5.NATIVE_LIB_INIT_DURATION));
            case 25:
                return new vwb(h5Var);
            case 26:
                return (w69) h5Var.c(220);
            case 27:
                return new h8c((Widget) ((c1c) h5Var.c(1094)).c().x1());
            case 28:
                return new d59(h5Var.d(216));
            default:
                return dxb.a;
        }
    }
}
