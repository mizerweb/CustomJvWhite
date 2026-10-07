package defpackage;

import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tl3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListWidget b;

    public /* synthetic */ tl3(ChatsListWidget chatsListWidget, int i) {
        this.a = i;
        this.b = chatsListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Integer num;
        int i = this.a;
        boolean z = true;
        ChatsListWidget chatsListWidget = this.b;
        switch (i) {
            case 0:
                if (cqk.d(chatsListWidget.e, "all.chat.folder")) {
                    return (hk4) chatsListWidget.b.getAccessor().c(942);
                }
                hk4.a.getClass();
                return gk4.b;
            case 1:
                zv8[] zv8VarArr = ChatsListWidget.X;
                return chatsListWidget.getRouter();
            case 2:
                zv8[] zv8VarArr2 = ChatsListWidget.X;
                if (((wh3) chatsListWidget.t1().z1.a.getValue()).b) {
                    Boolean boolValueOf = chatsListWidget.getView() != null ? Boolean.valueOf(chatsListWidget.s1().M0()) : null;
                    if (!(boolValueOf != null ? boolValueOf.booleanValue() : false)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                zk4 zk4Var = (zk4) chatsListWidget.b.getAccessor().c(943);
                hk4.a.getClass();
                return zk4Var.a(cl4.c, gk4.b);
            case 4:
                ca2 ca2Var = chatsListWidget.a;
                sl3 sl3Var = (sl3) ca2Var.getAccessor().c(976);
                hk4 hk4Var = (hk4) chatsListWidget.h.getValue();
                String str = chatsListWidget.e;
                xu1 xu1Var = (xu1) chatsListWidget.F.getValue();
                b00 b00VarA = ((hi3) ca2Var.getAccessor().c(980)).a(str);
                h5 h5Var = ((pf8) ca2Var.getAccessor().c(982)).a;
                of8 v2aVar = str.equals("all.chat.folder") ? new v2a((l3c) h5Var.c(677), 4, h5Var.d(54)) : of8.F0;
                sl3Var.getClass();
                return new rl3(hk4Var, str, xu1Var, b00VarA, v2aVar, sl3Var.a, sl3Var.b, sl3Var.c, sl3Var.d, sl3Var.e, sl3Var.f, sl3Var.g, sl3Var.h, sl3Var.i, sl3Var.j, sl3Var.k, sl3Var.l, sl3Var.m, sl3Var.n, sl3Var.o, sl3Var.p, sl3Var.q, sl3Var.r, sl3Var.s, sl3Var.t, sl3Var.u, sl3Var.v, sl3Var.w, sl3Var.x, sl3Var.y, sl3Var.z, sl3Var.A, sl3Var.B, sl3Var.C, sl3Var.D, sl3Var.E, sl3Var.F, sl3Var.G, sl3Var.H, sl3Var.I, sl3Var.J, sl3Var.K, sl3Var.L, sl3Var.M, sl3Var.N, sl3Var.O, sl3Var.P, sl3Var.Q, sl3Var.R, sl3Var.S, sl3Var.T);
            case 5:
                return new uj4(chatsListWidget.a.getAccessor().d(97));
            case 6:
                zv8[] zv8VarArr3 = ChatsListWidget.X;
                zm3.b.q(chatsListWidget.e);
                return sbi.a;
            case 7:
                return vd7.o(chatsListWidget.c, new ifh(new tl3(chatsListWidget, 1)), chatsListWidget);
            case 8:
                return new ri3(chatsListWidget.a.getAccessor().d(19), chatsListWidget.s1(), new tl3(chatsListWidget, 2), chatsListWidget.b.getAccessor().d(769));
            case 9:
                zv8[] zv8VarArr4 = ChatsListWidget.X;
                return new jed((xed) chatsListWidget.t1().X1.getValue());
            default:
                ca2 ca2Var2 = chatsListWidget.a;
                if (!((Boolean) ((e5d) ((ifh) ca2Var2.d()).getValue()).B().i()).booleanValue() || !((Boolean) ((e5d) ((ifh) ca2Var2.d()).getValue()).M4.a(e5d.S6[300]).i()).booleanValue() || (num = ((vqg) ((e5d) ((ifh) ca2Var2.d()).getValue()).r().i()).e) == null || num.intValue() == -1) {
                    return null;
                }
                return new jed((xed) chatsListWidget.t1().Y1.getValue());
        }
    }
}
