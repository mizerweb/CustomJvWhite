package defpackage;

import java.util.Iterator;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class xu1 {
    public final svj a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d = ysc.a.a();
    public final ny8 e;
    public final ny8 f;
    public final ifh g;
    public ghg h;
    public boolean i;
    public boolean j;
    public boolean k;
    public af7 l;
    public Long m;

    public xu1(svj svjVar, ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = svjVar;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ifhVar;
    }

    public static /* synthetic */ void l(xu1 xu1Var, String str, boolean z, af7 af7Var) {
        xu1Var.k(str, true, z, false, af7Var);
    }

    public final void a(ghg ghgVar, af7 af7Var) {
        boolean zH = ((wd4) this.e.getValue()).h();
        if (af7Var == null) {
            c();
            return;
        }
        if (!zH && ghgVar != null && !((n42) d()).a.d(ghgVar)) {
            if (!m92.a((hve) this.g.getValue())) {
                zu1.b.j();
            }
            c();
            return;
        }
        if (ghgVar == null) {
            k42.a(d());
            if (!m92.a((hve) this.g.getValue())) {
                af7Var.invoke();
            }
            c();
            return;
        }
        if ((ghgVar instanceof dhg) && !this.k && ((n42) d()).a.d(ghgVar)) {
            dhg dhgVar = (dhg) ghgVar;
            zu1.b.k(dhgVar.b(), dhgVar.c());
            return;
        }
        if (h(ghgVar)) {
            if (!m92.a((hve) this.g.getValue())) {
                zu1.b.j();
            }
            c();
            return;
        }
        if (((f62) ((n42) d()).f.a.getValue()).k instanceof ki6) {
            if (!m92.a((hve) this.g.getValue())) {
                af7Var.invoke();
            }
            c();
            return;
        }
        if (!((n42) d()).a.d(ghgVar)) {
            if (((f62) ((n42) d()).f.a.getValue()).l) {
                ((n42) d()).c().B(ghgVar.a());
            }
            if (!m92.a((hve) this.g.getValue())) {
                zu1.b.j();
            }
            c();
            return;
        }
        this.l = af7Var;
        sa2 sa2VarE = e();
        sa2VarE.c = la2.a;
        sa2.c(sa2VarE, "START_CALL", null, "ANOTHER_USER_TRY", null, null, null, false, null, 506);
        svj svjVar = this.a;
        boolean z = this.i;
        boolean zH2 = ((b95) this.c.getValue()).h();
        Widget widget = svjVar.b;
        int i = z ? R.string.call_start_new_dialog_action_continue_video : R.string.call_start_new_dialog_action_continue_audio;
        int i2 = zH2 ? R.string.call_start_new_dialog_subtitle_parallel : R.string.call_start_new_dialog_subtitle;
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.call_start_new_dialog_title, null, null, 4);
        jc4VarC.g(new tnh(i2));
        jc4VarC.d(R.id.call_permission_dialog_check_continue, new tnh(i));
        jc4VarC.c(R.id.call_permission_dialog_check_cancel, new tnh(R.string.call_start_new_dialog_action_cancel));
        ConfirmationBottomSheet confirmationBottomSheetE = jc4VarC.e(widget.getB().b());
        confirmationBottomSheetE.setTargetController(widget);
        br4 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(confirmationBottomSheetE, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    public final boolean b(int i, int[] iArr) {
        String strA;
        if (i != 178) {
            return false;
        }
        if (f().c(wsc.i)) {
            if (!this.j) {
                a(this.h, this.l);
                return true;
            }
            af7 af7Var = this.l;
            if (af7Var == null) {
                c();
                return true;
            }
            af7Var.invoke();
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == -1) {
                sa2 sa2VarE = e();
                Long l = this.m;
                if (l == null || (strA = String.valueOf(l.longValue())) == null) {
                    strA = ns4.a(((f62) ((n42) d()).f.a.getValue()).i);
                }
                String str = strA;
                boolean z = ((f62) ((n42) d()).f.a.getValue()).j;
                sa2VarE.getClass();
                sa2.c(sa2VarE, "FINISH_CALL", str, "ERROR", 0L, "no_permission", null, z, Boolean.FALSE, 16);
                c();
                svj.e(this.a, R.string.permission_detail_dialog_title, Integer.valueOf(R.string.permission_detail_dialog_subtitile), null, null, false, null, 60);
                return true;
            }
        }
        c();
        return false;
    }

    public final void c() {
        this.l = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = false;
        this.m = null;
    }

    public final k42 d() {
        return (k42) this.b.getValue();
    }

    public final sa2 e() {
        return (sa2) this.f.getValue();
    }

    public final wsc f() {
        return (wsc) this.d.getValue();
    }

    public final boolean g(int i) {
        if (i != R.id.call_permission_dialog_check_continue) {
            if (i != R.id.call_permission_dialog_check_cancel) {
                return false;
            }
            c();
            return true;
        }
        e().e = 1;
        sa2 sa2VarE = e();
        sa2VarE.c = la2.a;
        sa2.c(sa2VarE, "START_CALL", null, "ANOTHER_USER_CALL", null, null, null, false, null, 506);
        b95 b95Var = (b95) this.c.getValue();
        Iterator it = ((Iterable) b95Var.h.getValue()).iterator();
        while (it.hasNext()) {
            b95Var.j(((x02) it.next()).s());
        }
        m92.d((hve) this.g.getValue());
        af7 af7Var = this.l;
        if (af7Var != null) {
            af7Var.invoke();
        }
        c();
        return true;
    }

    public final boolean h(ghg ghgVar) {
        ny8 ny8Var = this.c;
        x02 x02VarE = ((b95) ny8Var.getValue()).e(ghgVar);
        if (x02VarE == null || !((Boolean) x02VarE.isHeldByMe().getValue()).booleanValue()) {
            return false;
        }
        ((b95) ny8Var.getValue()).q(x02VarE.s());
        return true;
    }

    public final void i(boolean z) {
        String strA = ns4.a(((f62) ((n42) d()).f.a.getValue()).i);
        boolean z2 = ((f62) ((n42) d()).f.a.getValue()).j;
        if (z && !f().c(wsc.n)) {
            e().e(strA, "OUT_OF_CALL", z2);
        }
        if (f().c(wsc.i)) {
            return;
        }
        sa2 sa2VarE = e();
        sa2VarE.getClass();
        sa2.c(sa2VarE, "REQUEST_PERMISSION_MIC", strA, "AFTER_INITIATION", null, null, null, z2, null, 376);
    }

    public final void j(long j, boolean z, af7 af7Var) {
        c();
        chg chgVar = new chg(new k32(j, z));
        if (f().a(this.a, z)) {
            a(chgVar, af7Var);
            return;
        }
        i(z);
        this.h = chgVar;
        this.l = af7Var;
        this.i = z;
    }

    public final void k(String str, boolean z, boolean z2, boolean z3, af7 af7Var) {
        c();
        this.k = z3;
        boolean zX0 = r5h.X0(str);
        svj svjVar = this.a;
        if (zX0) {
            h8c h8cVar = new h8c(svjVar.b);
            h8cVar.m(new tnh(R.string.call_start_group_call_unavailable));
            h8cVar.p();
            return;
        }
        dhg dhgVar = new dhg(str, z2, z, z2);
        if (f().a(svjVar, z2)) {
            a(dhgVar, af7Var);
            return;
        }
        i(z2);
        this.h = dhgVar;
        this.l = af7Var;
        this.i = z2;
    }

    public final void m(Long l, String str, long j, boolean z, af7 af7Var) {
        c();
        this.m = l;
        e().j(str);
        ehg ehgVar = new ehg(new m32(j, str, z));
        if (f().a(this.a, z)) {
            a(ehgVar, af7Var);
            return;
        }
        i(z);
        this.h = ehgVar;
        this.l = af7Var;
        this.i = z;
    }
}
