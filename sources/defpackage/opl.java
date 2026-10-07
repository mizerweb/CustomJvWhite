package defpackage;

import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class opl {
    public static final pp4 a(int i, ha9 ha9Var) {
        int i2 = wp4.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 != 1) {
            if (i2 == 2) {
                return new up4(ha9Var);
            }
            ore.o();
            return null;
        }
        zp4 zp4Var = new zp4();
        zp4Var.c = r66.a;
        zp4Var.d = -1;
        zp4Var.l = -1.0f;
        zp4Var.m = -1.0f;
        zp4Var.p = -1.0f;
        zp4Var.q = -1.0f;
        return zp4Var;
    }

    public static final pp4 b(Widget widget, int i) {
        return a(i, widget.getD().b());
    }

    public static void c(wzj wzjVar, long j) {
        wzjVar.c(new xjf(j, false));
    }
}
