package one.me.calls.ui.ui.waitingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.chb;
import defpackage.cyb;
import defpackage.dd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.m;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.r;
import defpackage.r1c;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sfd;
import defpackage.sx1;
import defpackage.tnh;
import defpackage.wbc;
import defpackage.wc;
import defpackage.wf4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/AdminWaitingRoomScreen;", "Lone/me/sdk/arch/Widget;", "Lchb;", "Lz4f;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdminWaitingRoomScreen extends Widget implements chb, z4f {
    public static final /* synthetic */ zv8[] i = {new dwd(AdminWaitingRoomScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, AdminWaitingRoomScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(AdminWaitingRoomScreen.class, "applyAllButton", "getApplyAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(AdminWaitingRoomScreen.class, "rejectAllButton", "getRejectAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(AdminWaitingRoomScreen.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final sx1 a;
    public final ny8 b;
    public final j8e c;
    public final j8e d;
    public final j8e e;
    public final j8e f;
    public final j8e g;
    public final ny8 h;

    public AdminWaitingRoomScreen(Bundle bundle) {
        super(bundle);
        this.a = new sx1(m35getAccountScopeuqN4xOY());
        this.b = createViewModelLazy(dd.class, new r(7, new zc(this, 0)));
        this.c = viewBinding(R.id.call_screen_admin_user_in_wait_room_title);
        this.d = viewBinding(R.id.call_screen_admin_user_in_wait_room_list);
        this.e = viewBinding(R.id.call_screen_admin_user_in_wait_room_apply_all);
        this.f = viewBinding(R.id.call_screen_admin_user_in_wait_room_reject_all);
        this.g = viewBinding(R.id.call_screen_admin_user_in_wait_room_empty);
        this.h = rx8.P(3, new zc(this, 1));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getA() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        a8g a8gVar = pq3.j;
        wf4Var.setBackgroundColor(a8gVar.l(wf4Var).b.b().c);
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.call_screen_admin_user_in_wait_room_title);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        rccVar.setTitle(R.string.call_screen_admin_user_in_wait_room_title);
        rccVar.setSubtitle(R.string.call_users_info_count_no_users);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new m(8, this)));
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.call_screen_admin_user_in_wait_room_list);
        final int i2 = 0;
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((wc) this.h.getValue());
        recyclerView.setItemAnimator(null);
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.call_screen_admin_user_in_wait_room_apply_all);
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_screen_admin_user_in_wait_room_apply_all));
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: yc
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = AdminWaitingRoomScreen.i;
                        ((dd) adminWaitingRoomScreen.b.getValue()).B(true);
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = AdminWaitingRoomScreen.i;
                        ((dd) adminWaitingRoomScreen.b.getValue()).B(false);
                        break;
                    default:
                        zv8[] zv8VarArr3 = AdminWaitingRoomScreen.i;
                        adminWaitingRoomScreen.getRouter().C(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        cybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cyb cybVar2 = new cyb(getContext());
        cybVar2.setId(R.id.call_screen_admin_user_in_wait_room_reject_all);
        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxb.SECONDARY);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.call_screen_admin_user_in_wait_room_reject_all));
        final int i3 = 1;
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: yc
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = AdminWaitingRoomScreen.i;
                        ((dd) adminWaitingRoomScreen.b.getValue()).B(true);
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = AdminWaitingRoomScreen.i;
                        ((dd) adminWaitingRoomScreen.b.getValue()).B(false);
                        break;
                    default:
                        zv8[] zv8VarArr3 = AdminWaitingRoomScreen.i;
                        adminWaitingRoomScreen.getRouter().C(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        cybVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        r1c r1cVar = new r1c(getContext());
        r1cVar.setId(R.id.call_screen_admin_user_in_wait_room_empty);
        r1cVar.setIcon(R.drawable.ic_waitin_room_24);
        r1cVar.setTitle(new tnh(R.string.call_screen_admin_user_in_wait_room_empty_title));
        r1cVar.setSubtitle(new tnh(R.string.call_screen_admin_user_in_wait_room_empty_subtitle));
        final int i4 = 2;
        r1cVar.f(r1cVar.getContext().getString(R.string.call_screen_admin_user_in_wait_room_empty_button), new View.OnClickListener(this) { // from class: yc
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = AdminWaitingRoomScreen.i;
                        ((dd) adminWaitingRoomScreen.b.getValue()).B(true);
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = AdminWaitingRoomScreen.i;
                        ((dd) adminWaitingRoomScreen.b.getValue()).B(false);
                        break;
                    default:
                        zv8[] zv8VarArr3 = AdminWaitingRoomScreen.i;
                        adminWaitingRoomScreen.getRouter().C(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        r1cVar.setCustomTheme(a8gVar.l(r1cVar).b);
        r1cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        r1cVar.setVisibility(8);
        wf4Var.addView(rccVar);
        wf4Var.addView(r1cVar);
        wf4Var.addView(recyclerView);
        wf4Var.addView(cybVar);
        wf4Var.addView(cybVar2);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = rccVar.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        eg4VarH.d(id2, 3, rccVar.getId(), 4);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 4, cybVar.getId(), 3);
        int id3 = r1cVar.getId();
        eg4VarH.d(id3, 3, rccVar.getId(), 4);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 4, 0, 4);
        int id4 = cybVar.getId();
        eg4VarH.d(id4, 6, cybVar2.getId(), 6);
        new bsb(6, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id4, 7, cybVar2.getId(), 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id4, 4, cybVar2.getId(), 3);
        new bsb(4, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id5 = cybVar2.getId();
        eg4VarH.d(id5, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id5));
        eg4VarH.d(id5, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id5));
        eg4VarH.d(id5, 4, 0, 4);
        new bsb(4, eg4VarH, id5).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.d.m(this, i[1])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(((dd) this.b.getValue()).f, new sfd(this, (lq4) null, 5), 3), getLifecycleScope());
    }

    public AdminWaitingRoomScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
