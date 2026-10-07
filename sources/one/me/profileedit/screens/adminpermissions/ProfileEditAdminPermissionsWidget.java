package one.me.profileedit.screens.adminpermissions;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.aj8;
import defpackage.bdc;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.end;
import defpackage.ev;
import defpackage.f8b;
import defpackage.fnd;
import defpackage.fv9;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gnd;
import defpackage.ha9;
import defpackage.hnd;
import defpackage.hta;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jj8;
import defpackage.jz;
import defpackage.khb;
import defpackage.l0d;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ng7;
import defpackage.np0;
import defpackage.ny8;
import defpackage.og7;
import defpackage.oi8;
import defpackage.ol0;
import defpackage.p90;
import defpackage.pq3;
import defpackage.pvb;
import defpackage.qb3;
import defpackage.rcc;
import defpackage.rt2;
import defpackage.rt3;
import defpackage.sbf;
import defpackage.sgg;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.xme;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ym9;
import defpackage.zfe;
import defpackage.zmd;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Collections;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B)\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "contactId", "Lzmd;", "type", "Lha9;", "localAccountId", "(JJLzmd;Lha9;)V", "profile-edit"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileEditAdminPermissionsWidget extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] n = {new dwd(ProfileEditAdminPermissionsWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, ProfileEditAdminPermissionsWidget.class, "contactId", "getContactId()J", 0), new dwd(ProfileEditAdminPermissionsWidget.class, "type", "getType()Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsType;", 0), new dwd(ProfileEditAdminPermissionsWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ProfileEditAdminPermissionsWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final oi8 a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final wtc e;
    public final ny8 f;
    public final lp0 g;
    public final j8e h;
    public final j8e i;
    public final xme j;
    public final int k;
    public g8c l;
    public sgg m;

    public ProfileEditAdminPermissionsWidget(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv("chat_id", Long.class);
        this.c = new vv("contact_id", Long.class);
        this.d = new vv("permissions_type", zmd.class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.e = wtcVar;
        this.f = createViewModelLazy(end.class, new hta(23, new fnd(this, 0)));
        this.g = new lp0(((a2c) wtcVar.getAccessor().c(27)).a(), this);
        this.h = viewBinding(R.id.profile_edit_admin_permissions_toolbar_view);
        this.i = viewBinding(R.id.profile_edit_admin_permissions_recycler_view);
        this.j = p90.M(new fnd(this, 1));
        this.k = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.profile_edit_confirm_save_button) {
            p1().C();
            return;
        }
        if (i == R.id.profile_edit_confirm_exit_button) {
            a8j.x(p1().r, rt3.b);
            return;
        }
        if (i == R.id.profile_edit_admin_permissions_change_owner_change_action) {
            end endVarP1 = p1();
            a8j.t(endVarP1, ((n0c) endVarP1.F()).a(), new l0d(endVarP1, (lq4) null, 9), 2);
        } else if (i == R.id.profile_edit_admin_permissions_delete_from_admins_delete_action) {
            end endVarP2 = p1();
            long j = endVarP2.d;
            rt2 rt2VarD = endVarP2.D();
            if (rt2VarD != null) {
                ((pvb) endVarP2.k.getValue()).C(rt2VarD.a, rt2VarD.b.a, Collections.singletonList(Long.valueOf(j)), false, rt2VarD.n(j));
                a8j.x(endVarP2.r, rt3.b);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    public final zmd o1() {
        zv8 zv8Var = n[2];
        return (zmd) this.d.a(this);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        n1g.N(new qb3(3, null, 9), frameLayout);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext());
        recyclerView.setId(R.id.profile_edit_admin_permissions_recycler_view);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), recyclerView.getPaddingRight(), this.k);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.g);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        f8b f8bVar = jj8.a;
        f8b f8bVar2 = new f8b(3);
        f8bVar2.h(np0.q);
        f8bVar2.h(np0.r);
        f8bVar2.h(np0.m);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new fv9(this, 22, f8bVar2), null, null, null, 60), -1);
        recyclerView.h(new ym9(aj8.b(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), np0.r, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density)), aj8.b(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), np0.r, 0, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f)), aj8.b(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, np0.r, gm0.K(20.0f * yl5.d().getDisplayMetrics().density), PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f)), 0), -1);
        frameLayout.addView(recyclerView);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.profile_edit_admin_permissions_toolbar_view);
        rccVar.setTitle(R.string.profile_edit_admin_new_permissions_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new ol0(24, this)));
        n1g.N(new gnd(3, null, 0), rccVar);
        frameLayout.addView(rccVar);
        frameLayout.addView((View) this.j.getValue());
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.j.b = khb.k;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        rcc rccVar = (rcc) this.h.m(this, n[3]);
        bdc.a(rccVar, new og7(rccVar, 20, this));
        q1();
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(14, this));
        }
        jz jzVar = new jz(p1().r, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new hnd(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(p1().s, 13), getViewLifecycleOwner().f(), n09Var), new hnd(null, this, 1), 3), getViewLifecycleScope());
        this.m = e9i.j0(new fz6(n1g.v(p1().v, getViewLifecycleOwner().f(), n09Var), new hnd(null, this, 2), 3), getViewLifecycleScope());
    }

    public final end p1() {
        return (end) this.f.getValue();
    }

    public final void q1() {
        xme xmeVar = this.j;
        if (xmeVar.d()) {
            cyb cybVar = (cyb) xmeVar.getValue();
            if (cybVar.getVisibility() == 0) {
                bdc.a(cybVar, new ng7(cybVar, this, cybVar, 20));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.i.m(this, n[4]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.k);
        }
    }

    public ProfileEditAdminPermissionsWidget(long j, long j2, zmd zmdVar, ha9 ha9Var) {
        this(n1g.i(new ylc("chat_id", Long.valueOf(j)), new ylc("contact_id", Long.valueOf(j2)), new ylc("permissions_type", zmdVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
