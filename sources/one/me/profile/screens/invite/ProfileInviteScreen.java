package one.me.profile.screens.invite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.bc1;
import defpackage.d4f;
import defpackage.dqd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.je9;
import defpackage.k9d;
import defpackage.kc4;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.opd;
import defpackage.oyf;
import defpackage.p7d;
import defpackage.q72;
import defpackage.r8e;
import defpackage.tnh;
import defpackage.trd;
import defpackage.tre;
import defpackage.upd;
import defpackage.vbd;
import defpackage.vp4;
import defpackage.w8;
import defpackage.wpd;
import defpackage.wtc;
import defpackage.xpd;
import defpackage.xr1;
import defpackage.xw3;
import defpackage.yab;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/invite/ProfileInviteScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Loyf;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lha9;", "localAccountId", "(JLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileInviteScreen extends Widget implements mc4, oyf, vp4 {
    public static final /* synthetic */ zv8[] g;
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ny8 d;
    public final wpd e;
    public final j8e f;

    static {
        dwd dwdVar = new dwd(ProfileInviteScreen.class, "moreActionsButton", "getMoreActionsButton()Landroid/widget/ImageView;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
    }

    public ProfileInviteScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new vbd(24));
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = createViewModelLazy(dqd.class, new hta(25, new k9d(bundle, 9, this)));
        wpd wpdVar = new wpd(wtcVar.getExecutors().a(), this);
        this.e = wpdVar;
        this.f = viewBinding(R.id.profile_invite_chatlinkview_more_actions_button);
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ProfileInviteFlow", zo5.j(bundle.getLong("id"), "[screen-created] id="), null);
            }
        }
        r8e r8eVar = o1().x;
        i19 i19VarF = this.lifecycleOwner.f();
        n09 n09Var = n09.d;
        q72 q72VarV = n1g.v(r8eVar, i19VarF, n09Var);
        w8 w8Var = new w8(2, wpdVar, wpd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 27);
        int i = 3;
        e9i.j0(new fz6(q72VarV, w8Var, i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().z, this.lifecycleOwner.f(), n09Var), new upd(this, lq4Var, 0), i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().A, getViewLifecycleOwner().f(), n09Var), new upd(null, this), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().y, this.lifecycleOwner.f(), n09Var), new upd(this, lq4Var, 1), i), getLifecycleScope());
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        dqd dqdVarO1 = o1();
        if (i != R.id.profile_invite_chatlinkview_refresh_button) {
            dqdVarO1.getClass();
            return;
        }
        int i2 = 56;
        a8j.x(dqdVarO1.z, new opd(new tnh(R.string.profile_invite_chat_link_update_confirmation_title), new tnh(R.string.profile_invite_chat_link_update_confirmation_description), xw3.P0(new kc4(R.id.profile_invite_chatlinkview_confirm_update, new tnh(R.string.profile_invite_chat_link_update_action), 1, i2), new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_invite_chat_link_update_cancel), 2, i2))));
    }

    @Override // defpackage.oyf
    public final void K() {
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        dqd dqdVarO1 = o1();
        if (i != R.id.profile_invite_create_link_error_confirm) {
            if (i == R.id.profile_invite_chatlinkview_confirm_update) {
                dqdVarO1.q.B(dqdVarO1, dqd.B[0], yab.i0(dqdVarO1.b, ((n0c) dqdVarO1.E()).b(), 0, new xpd(dqdVarO1, null, 1), 2));
                return;
            } else if (i == R.id.profile_invite_join_request_disable_confirm) {
                dqdVarO1.F(false);
                return;
            } else {
                dqdVarO1.getClass();
                return;
            }
        }
        ic6 ic6Var = dqdVarO1.y;
        trd trdVar = trd.b;
        long j = dqdVarO1.c;
        trdVar.getClass();
        bc1.q(":profile?id=" + j + "&type=local_chat", ic6Var);
        dqdVarO1.v.set(false);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final dqd o1() {
        return (dqd) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p7d p7dVar = new p7d(8, this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        n1g.N(new xr1(3, null, 5), linearLayout);
        p7dVar.invoke(linearLayout);
        return linearLayout;
    }

    @Override // defpackage.oyf
    public final void x(int i, int i2) {
        trd.b.r();
    }

    public ProfileInviteScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
