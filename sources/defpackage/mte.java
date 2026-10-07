package defpackage;

import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mte implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi3 b;

    public /* synthetic */ mte(fi3 fi3Var, int i) {
        this.a = i;
        this.b = fi3Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        fi3 fi3Var = this.b;
        switch (i) {
            case 0:
                gdi gdiVar = (gdi) obj;
                gdiVar.d(70, new nte(fi3Var, 0));
                gdiVar.d(7, new nte(fi3Var, 1));
                gdiVar.d(739, new nte(fi3Var, 2));
                gdiVar.d(27, new ci3(11));
                gdiVar.d(23, new ci3(12));
                gdiVar.d(686, new ci3(13));
                gdiVar.d(1095, new ci3(14));
                gdiVar.d(1096, new ci3(15));
                gdiVar.d(1097, new ci3(16));
                gdiVar.d(687, new ci3(17));
                gdiVar.d(120, new ci3(18));
                gdiVar.d(67, new jld(15));
                gdiVar.d(68, new jld(16));
                gdiVar.d(69, new jld(17));
                gdiVar.d(974, new twb(23));
                gdiVar.d(205, new twb(24));
                gdiVar.d(679, new rwb(5));
                gdiVar.d(48, new twb(25));
                gdiVar.d(90, new twb(26));
                gdiVar.d(88, new twb(27));
                gdiVar.d(1137, new twb(28));
                gdiVar.d(71, new twb(29));
                gdiVar.d(87, new b7c(0));
                gdiVar.d(1133, new b7c(1));
                gdiVar.d(1094, new twb(18));
                gdiVar.d(45, new twb(19));
                gdiVar.d(1000, new twb(20));
                gdiVar.d(806, new twb(21));
                gdiVar.d(1132, new twb(22));
                gdiVar.d(253, new l65(4));
                gdiVar.d(254, new l65(5));
                gdiVar.d(255, new l65(6));
                gdiVar.d(184, new l65(0));
                gdiVar.d(28, new m3d(24));
                gdiVar.d(91, new m3d(25));
                boolean zF = ku6.j.f((OneMeApplication) fi3Var.b);
                mte mteVar = new mte(fi3Var, 1);
                gdiVar.d(172, new zc9(27));
                gdiVar.d(173, new z6b(zF));
                gdiVar.d(174, new a7b(zF, mteVar));
                gdiVar.d(65, new t62(5));
                gdiVar.d(733, new t62(6));
                gdiVar.d(741, new t62(7));
                gdiVar.d(747, new t62(8));
                gdiVar.d(107, new t62(9));
                gdiVar.d(734, new t62(10));
                gdiVar.d(952, new qqg(15));
                gdiVar.d(230, new jld(14));
                break;
            default:
                ku6.j.g((OneMeApplication) fi3Var.b, ((Boolean) obj).booleanValue());
                break;
        }
        return sbiVar;
    }
}
