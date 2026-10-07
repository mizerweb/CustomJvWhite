package one.me.notifications.settings;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a8j;
import defpackage.cka;
import defpackage.cob;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dqe;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.fob;
import defpackage.fz6;
import defpackage.gr4;
import defpackage.ha9;
import defpackage.hob;
import defpackage.hr4;
import defpackage.hsc;
import defpackage.hta;
import defpackage.i19;
import defpackage.iob;
import defpackage.k96;
import defpackage.kob;
import defpackage.kp0;
import defpackage.ks6;
import defpackage.lp0;
import defpackage.mjg;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.p96;
import defpackage.r07;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx1;
import defpackage.sbi;
import defpackage.tre;
import defpackage.um4;
import defpackage.v0k;
import defpackage.vn7;
import defpackage.wsc;
import defpackage.xb9;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo0;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/notifications/settings/NotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lum4;", "Lhsc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "notifications-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationsSettingsScreen extends Widget implements um4, hsc {
    public static final /* synthetic */ zv8[] m = {new dwd(NotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, NotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(NotificationsSettingsScreen.class, "resetDefaultsButton", "getResetDefaultsButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final ks6 a;
    public final oi8 b;
    public final v0k c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final cob g;
    public final ny8 h;
    public final lp0 i;
    public final ow0 j;
    public final ow0 k;
    public final ow0 l;

    public NotificationsSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new cka(9));
        this.b = oi8.f;
        v0k v0kVar = new v0k(m35getAccountScopeuqN4xOY());
        this.c = v0kVar;
        this.d = createViewModelLazy(kob.class, new hta(4, new hob(this, 0)));
        this.e = v0kVar.getAccessor().d(34);
        this.f = v0kVar.getAccessor().d(147);
        this.g = new cob(new vn7(23, this), v0kVar.getExecutors().a());
        this.h = createViewModelLazy(zo0.class, new hta(5, new hob(this, 1)));
        this.i = new lp0(this, (kp0) v0kVar.getAccessor().c(235), v0kVar.getExecutors().a(), 0);
        this.j = binding(new hob(this, 2));
        this.k = binding(new hob(this, 3));
        this.l = binding(new hob(this, 4));
    }

    @Override // defpackage.um4
    public final void B(int i) {
        if (i != 5) {
            return;
        }
        a8j.x(p1().u, fob.b);
    }

    @Override // defpackage.hsc
    public final void Y0(boolean z) {
        if (o1().e() && o1().b.a() && !o1().b()) {
            ny8 ny8Var = this.f;
            if (z) {
                ((p96) ny8Var.getValue()).a();
            } else {
                ((p96) ny8Var.getValue()).b();
            }
        }
        if (z) {
            return;
        }
        p1().I();
        mjg mjgVar = p1().o;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final wsc o1() {
        return (wsc) this.e.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            kob kobVarP1 = p1();
            kobVarP1.F().d();
            kobVarP1.I();
            if (kobVarP1.w && kobVarP1.F().b()) {
                kobVarP1.w = false;
                a8j.x(kobVarP1.v, sbi.a);
            }
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        kob kobVarP1 = p1();
        mjg mjgVar = kobVarP1.r;
        Boolean boolValueOf = Boolean.valueOf(kobVarP1.c.b());
        mjgVar.getClass();
        mjgVar.j(null, boolValueOf);
        kob kobVarP2 = p1();
        mjg mjgVar2 = kobVarP2.s;
        dqe dqeVarC = kobVarP2.C();
        mjgVar2.getClass();
        mjgVar2.j(null, dqeVarC);
        p1().I();
    }

    @Override // defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        if (hr4Var == hr4.c) {
            kob kobVarP1 = p1();
            if (((Boolean) ((e5d) kobVarP1.h.getValue()).f().i()).booleanValue()) {
                xb9 xb9Var = (xb9) kobVarP1.i.getValue();
                xb9Var.V0.B(xb9Var, xb9.g1[39], Boolean.TRUE);
            }
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.oneme_notifications_settings_linearlayout);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        zv8[] zv8VarArr = m;
        zv8 zv8Var = zv8VarArr[0];
        linearLayout.addView((rcc) this.j.getValue());
        zv8 zv8Var2 = zv8VarArr[1];
        linearLayout.addView((k96) this.k.getValue());
        zv8 zv8Var3 = zv8VarArr[2];
        linearLayout.addView((cyb) this.l.getValue());
        n1g.N(new n(3, null, 9), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 177) {
            kob kobVarP1 = p1();
            boolean z = iArr[0] != 0;
            mjg mjgVar = kobVarP1.o;
            Boolean boolValueOf = Boolean.valueOf(z);
            mjgVar.getClass();
            mjgVar.j(null, boolValueOf);
            p1().I();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = p1().q;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new iob(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new r07(((zo0) this.h.getValue()).i, p1().p, new rx1(3, null, 3), 0), getViewLifecycleOwner().f(), n09Var), new iob(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().n, getViewLifecycleOwner().f(), n09Var), new iob(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().v, getViewLifecycleOwner().f(), n09Var), new iob(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().u, getViewLifecycleOwner().f(), n09Var), new iob(null, this, 4), 3), getViewLifecycleScope());
    }

    public final kob p1() {
        return (kob) this.d.getValue();
    }

    public NotificationsSettingsScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
