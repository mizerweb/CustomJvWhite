package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ec4 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gc4 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ec4(gc4 gc4Var, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                this.d = gc4Var;
                super(i2, 0);
                break;
            default:
                this.d = gc4Var;
                super(i2, dc4.NORMAL);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        gc4 gc4Var = this.d;
        switch (i) {
            case 0:
                wbg wbgVar = gc4Var.p2;
                if (!cqk.d(obj, obj2)) {
                    dc4 dc4Var = (dc4) obj2;
                    int iZ = oc9.Z(dc4Var.a, pq3.j.h(gc4Var));
                    int iOrdinal = dc4Var.ordinal();
                    if (iOrdinal == 0) {
                        gc4Var.setInputsEnabled(false);
                        ArrayList arrayListG0 = gc4.G0(gc4Var);
                        fc4 fc4Var = new fc4(gc4Var, dc4Var, 0);
                        wbgVar.getClass();
                        w09 w09Var = wbgVar.a;
                        sgg sggVarI0 = yab.i0(w09Var, null, 2, new b2f(arrayListG0, fc4Var, wbgVar, new ubg(wbgVar, iZ, 1), null), 1);
                        p3c p3cVar = wbgVar.d;
                        zv8[] zv8VarArr = wbg.e;
                        p3cVar.B(wbgVar, zv8VarArr[1], sggVarI0);
                        wbgVar.c.B(wbgVar, zv8VarArr[0], yab.i0(w09Var, null, 2, new jv(arrayListG0, wbgVar, new dyd(2, wbgVar, wbg.class, "animateShackingView", "animateShackingView(Lone/me/sdk/codeinput/InputController;)V", 4, 8), null), 1));
                    } else if (iOrdinal == 1) {
                        gc4Var.setInputsEnabled(!gc4Var.getDisableInputsForError());
                        if (Build.VERSION.SDK_INT >= 30) {
                            p0m.a(gc4Var, mt7.REJECT);
                        }
                        ArrayList arrayListG1 = gc4.G0(gc4Var);
                        fc4 fc4Var2 = new fc4(gc4Var, dc4Var, 1);
                        wbgVar.b();
                        ifg ifgVar = new ifg(gc4Var, ifg.p);
                        jfg jfgVar = new jfg(0.0f);
                        jfgVar.b(1500.0f);
                        jfgVar.a(0.2f);
                        ifgVar.m = jfgVar;
                        ifgVar.a = 3000.0f;
                        ifgVar.g();
                        wbgVar.d.B(wbgVar, wbg.e[1], yab.i0(wbgVar.a, null, 2, new me1(arrayListG1, fc4Var2, new ubg(wbgVar, iZ, 2), 200L, (lq4) null), 1));
                    } else if (iOrdinal != 2) {
                        ore.o();
                    } else {
                        gc4Var.setInputsEnabled(true);
                        ArrayList arrayListG2 = gc4.G0(gc4Var);
                        fc4 fc4Var3 = new fc4(gc4Var, dc4Var, 2);
                        wbgVar.b();
                        wbgVar.d.B(wbgVar, wbg.e[1], yab.i0(wbgVar.a, null, 2, new me1(arrayListG2, fc4Var3, new ubg(wbgVar, iZ, 0), 300L, (lq4) null), 1));
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    gc4Var.setAdapter(new qbg(iIntValue, gc4Var, new fj3(8, gc4Var)));
                }
                break;
        }
    }
}
