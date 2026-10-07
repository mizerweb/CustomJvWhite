package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import java.util.ArrayList;
import kotlin.collections.a;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qrf extends a8j {
    public static final /* synthetic */ zv8[] u;
    public final cmf c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public Long l;
    public Long m;
    public dmf n;
    public final mjg r;
    public final r8e s;
    public final ifh t;
    public final p3c k = qyj.S();
    public final ArrayList o = new ArrayList();
    public final ic6 p = new ic6(null);
    public final ic6 q = new ic6(null);

    static {
        z8b z8bVar = new z8b(qrf.class, "authQrJob", "getAuthQrJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        u = new zv8[]{z8bVar};
    }

    public qrf(kpf kpfVar, cmf cmfVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.c = cmfVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var7;
        mjg mjgVarA = p90.a(r66.a);
        this.r = mjgVarA;
        this.s = new r8e(mjgVarA);
        this.t = new ifh(new irf(1));
        e9i.j0(new fz6(new q8e(kpfVar.a), new dtd(this, (lq4) null, 23), 3), this.b);
        if (this.l == null) {
            pvb pvbVar = (pvb) ny8Var.getValue();
            this.l = Long.valueOf(pvb.s(pvbVar, new dof(pvbVar.u().a.g())));
        }
        E();
    }

    public final void B() {
        yd0 yd0VarC = C();
        yd0VarC.getClass();
        yd0.a(yd0VarC, 3, 0, Boolean.FALSE, 2);
        a8j.x(this.q, new bcg(new tnh(R.string.settings_devices_camera_permission_denied_title), R.drawable.icon_warning_fill, new tnh(R.string.try_again), gm0.K(68.0f * yl5.d().getDisplayMetrics().density)));
    }

    public final yd0 C() {
        return (yd0) this.i.getValue();
    }

    public final void D() {
        if (((wsc) this.g.getValue()).c(wsc.n)) {
            hrf.b.getClass();
            a8j.x(this.p, new i65(":qr-scanner?mode=2"));
        } else {
            zbg zbgVar = zbg.a;
            ic6 ic6Var = this.q;
            a8j.x(ic6Var, zbgVar);
            a8j.x(ic6Var, ile.a);
        }
    }

    public final void E() {
        ArrayList<dmf> arrayList = this.o;
        boolean zIsEmpty = arrayList.isEmpty();
        c79 c79VarW = yab.w();
        c79VarW.add((mrf) this.t.getValue());
        dmf dmfVar = this.n;
        cmf cmfVar = this.c;
        if (dmfVar != null) {
            long j = dmfVar.a;
            vnh vnhVar = new vnh(R.string.settings_devices_current_sessions, a.n1(new Object[]{dmfVar.b}));
            xnh xnhVar = new xnh(zo5.p(dmfVar.c, "\n", dmfVar.d));
            int i = !zIsEmpty ? 1 : 4;
            Context context = ((jrf) cmfVar.b).b.getContext();
            String string = context.getString(R.string.settings_devices_current_session_online);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            a8g a8gVar = pq3.j;
            int i2 = c0a.h(a8gVar, context).i;
            shapeDrawable.setIntrinsicHeight(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
            shapeDrawable.setIntrinsicWidth(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
            shapeDrawable.setBounds(0, 0, shapeDrawable.getIntrinsicWidth(), shapeDrawable.getIntrinsicHeight());
            shapeDrawable.getPaint().setColor(i2);
            SpannableString spannableString = new SpannableString(" ".concat(string));
            spannableString.setSpan(new FitFontImageSpan(shapeDrawable, kw6.c, false, false, 12, null), 0, 1, 17);
            spannableString.setSpan(new fqh(a8gVar.e(context).m(), new u8h(11)), 0, spannableString.length(), 17);
            c79VarW.add(new nrf(vnhVar, j, i, xnhVar, new lsf(new xnh(spannableString)), 64));
        }
        for (dmf dmfVar2 : arrayList) {
            long j2 = dmfVar2.a;
            xnh xnhVar2 = new xnh(dmfVar2.b);
            xnh xnhVar3 = new xnh(zo5.p(dmfVar2.c, "\n", dmfVar2.d));
            long j3 = dmfVar2.a;
            jrf jrfVar = (jrf) cmfVar.b;
            ny8 ny8Var = (ny8) cmfVar.c;
            String strE = oc9.E(jrfVar.b.getContext(), ((s7f) ((et3) ny8Var.getValue())).v(), j3, ((s7f) ((et3) ny8Var.getValue())).f(), false, false, false);
            if (strE == null) {
                strE = "";
            }
            c79VarW.add(new nrf(xnhVar2, j2, 2, xnhVar3, new lsf(new xnh(strE)), 64));
        }
        if (!zIsEmpty) {
            c79VarW.add(new nrf(new tnh(R.string.settings_devices_finished_all), v7c.a, 3, null, null, 48));
        }
        this.r.setValue(yab.j(c79VarW));
    }
}
