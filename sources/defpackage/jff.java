package defpackage;

import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jff implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectedMediaBottomBarWidget b;

    public /* synthetic */ jff(SelectedMediaBottomBarWidget selectedMediaBottomBarWidget, int i) {
        this.a = i;
        this.b = selectedMediaBottomBarWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        sbi sbiVar = sbi.a;
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = SelectedMediaBottomBarWidget.C;
                return selectedMediaBottomBarWidget.t1().z;
            case 1:
                zv8[] zv8VarArr2 = SelectedMediaBottomBarWidget.C;
                return selectedMediaBottomBarWidget.t1().B;
            case 2:
                zv8[] zv8VarArr3 = SelectedMediaBottomBarWidget.C;
                return new nef(selectedMediaBottomBarWidget.t1(), ((a2c) selectedMediaBottomBarWidget.g.getAccessor().c(27)).a());
            case 3:
                zv8[] zv8VarArr4 = SelectedMediaBottomBarWidget.C;
                return Boolean.valueOf(selectedMediaBottomBarWidget.p1().E());
            case 4:
                zv8[] zv8VarArr5 = SelectedMediaBottomBarWidget.C;
                rt2 rt2Var = (rt2) selectedMediaBottomBarWidget.p1().c.getValue();
                if (rt2Var != null && pll.d(rt2Var, (e5d) selectedMediaBottomBarWidget.i.getValue(), selectedMediaBottomBarWidget.p1().d.h(), null) && !selectedMediaBottomBarWidget.p1().E()) {
                    z = true;
                }
                if (!selectedMediaBottomBarWidget.r1()) {
                    int i2 = uw8.a;
                    if (!uw8.b(uw8.c) && !z) {
                        oef oefVar = selectedMediaBottomBarWidget.A;
                        hb9 hb9VarX0 = oefVar != null ? oefVar.X0() : null;
                        gm0.n(selectedMediaBottomBarWidget.c, "Send clicked");
                        selectedMediaBottomBarWidget.t1().G(selectedMediaBottomBarWidget.q1().getText(), hb9VarX0);
                    }
                }
                oef oefVar2 = selectedMediaBottomBarWidget.A;
                if (oefVar2 != null) {
                    oefVar2.b0(selectedMediaBottomBarWidget.p1().d, rt2Var);
                }
                return sbiVar;
            case 5:
                zv8[] zv8VarArr6 = SelectedMediaBottomBarWidget.C;
                if (!selectedMediaBottomBarWidget.r1()) {
                    hff hffVarT1 = selectedMediaBottomBarWidget.t1();
                    as9 as9Var = hffVarT1.d;
                    Long l = (Long) as9Var.e.invoke();
                    if (as9Var.d.h() && l == null) {
                        hffVarT1.s.B(hffVarT1, hff.C[1], yab.h0(hffVarT1.b, ((n0c) hffVarT1.E()).a(), 2, new xef(hffVarT1, null, 0)));
                    }
                }
                oef oefVar3 = selectedMediaBottomBarWidget.A;
                if (oefVar3 != null) {
                    oefVar3.Q0();
                }
                return sbiVar;
            case 6:
                zv8[] zv8VarArr7 = SelectedMediaBottomBarWidget.C;
                selectedMediaBottomBarWidget.t1().B.a(null);
                oef oefVar4 = selectedMediaBottomBarWidget.A;
                if (oefVar4 != null) {
                    oefVar4.g0();
                }
                return sbiVar;
            case 7:
                return selectedMediaBottomBarWidget.z;
            case 8:
                zv8[] zv8VarArr8 = SelectedMediaBottomBarWidget.C;
                selectedMediaBottomBarWidget.t1().B.a(yka.d);
                selectedMediaBottomBarWidget.q1().setLeftIcon(R.drawable.icon_sticker);
                return sbiVar;
            case 9:
                hi7 hi7Var = (hi7) selectedMediaBottomBarWidget.g.getAccessor().c(780);
                jff jffVar = new jff(selectedMediaBottomBarWidget, 3);
                hi7Var.getClass();
                return new gi7(jffVar);
            case 10:
                iff iffVar = (iff) selectedMediaBottomBarWidget.g.getAccessor().c(1057);
                vv vvVar = selectedMediaBottomBarWidget.e;
                zv8 zv8Var = SelectedMediaBottomBarWidget.C[2];
                long jLongValue = ((Number) vvVar.a(selectedMediaBottomBarWidget)).longValue();
                as9 as9VarP1 = selectedMediaBottomBarWidget.p1();
                gi7 gi7Var = (gi7) selectedMediaBottomBarWidget.j.getValue();
                boolean z2 = !selectedMediaBottomBarWidget.r1();
                iffVar.getClass();
                return new hff(jLongValue, as9VarP1, gi7Var, z2, iffVar.a, iffVar.b, iffVar.c, iffVar.d, iffVar.e, iffVar.f, iffVar.g, iffVar.h, iffVar.i);
            default:
                return ((fz9) selectedMediaBottomBarWidget.g.getAccessor().c(354)).a(null);
        }
    }
}
