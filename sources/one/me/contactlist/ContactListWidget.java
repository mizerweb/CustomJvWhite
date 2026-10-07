package one.me.contactlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.aj3;
import defpackage.ak4;
import defpackage.al4;
import defpackage.bl4;
import defpackage.c03;
import defpackage.ca2;
import defpackage.cl4;
import defpackage.d3;
import defpackage.d4f;
import defpackage.dl4;
import defpackage.dq4;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ek4;
import defpackage.et3;
import defpackage.fj3;
import defpackage.fl4;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.g8f;
import defpackage.gbj;
import defpackage.gl4;
import defpackage.gm8;
import defpackage.h47;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.hm8;
import defpackage.hve;
import defpackage.i19;
import defpackage.i1m;
import defpackage.i7c;
import defpackage.ifh;
import defpackage.j7c;
import defpackage.j8e;
import defpackage.jed;
import defpackage.jhc;
import defpackage.jsc;
import defpackage.k96;
import defpackage.khb;
import defpackage.kp0;
import defpackage.ks6;
import defpackage.ktc;
import defpackage.ll8;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lve;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n6f;
import defpackage.nee;
import defpackage.nn4;
import defpackage.np0;
import defpackage.nr2;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ow0;
import defpackage.p;
import defpackage.p3c;
import defpackage.p6f;
import defpackage.p90;
import defpackage.pbb;
import defpackage.pk6;
import defpackage.pl8;
import defpackage.pn4;
import defpackage.pn7;
import defpackage.pq3;
import defpackage.q84;
import defpackage.qh4;
import defpackage.qi4;
import defpackage.qn7;
import defpackage.qt4;
import defpackage.qyj;
import defpackage.r07;
import defpackage.r1c;
import defpackage.r66;
import defpackage.r84;
import defpackage.rcc;
import defpackage.rp4;
import defpackage.rx8;
import defpackage.s63;
import defpackage.s7f;
import defpackage.svj;
import defpackage.tee;
import defpackage.tnh;
import defpackage.tre;
import defpackage.uf4;
import defpackage.um4;
import defpackage.usc;
import defpackage.v8;
import defpackage.vj4;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vq;
import defpackage.vv;
import defpackage.w14;
import defpackage.w8c;
import defpackage.wf4;
import defpackage.wj4;
import defpackage.wsc;
import defpackage.xme;
import defpackage.xt4;
import defpackage.xu1;
import defpackage.xw3;
import defpackage.y3f;
import defpackage.y8;
import defpackage.yab;
import defpackage.yk4;
import defpackage.ylc;
import defpackage.ynh;
import defpackage.ysc;
import defpackage.yt4;
import defpackage.yw1;
import defpackage.z8;
import defpackage.z8b;
import defpackage.za2;
import defpackage.zfe;
import defpackage.zo0;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zsj;
import defpackage.zv8;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.vpnconnectedwarning.VpnConnectedWarningBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\fB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000f\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lone/me/contactlist/ContactListWidget;", "Lone/me/sdk/arch/Widget;", "Lpbb;", "Lv8;", "Lwj4;", "Lpn7;", "Lum4;", "Lnn4;", "Lpl8;", "Lvp4;", "Lmc4;", "", "Lp6f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lcl4;", "type", "Lha9;", "localAccountId", "(Lcl4;Lha9;)V", "(Lha9;)V", "contact-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactListWidget extends Widget implements pbb, v8, wj4, pn7, um4, nn4, pl8, vp4, mc4, p6f {
    public static final /* synthetic */ zv8[] o1 = {new dwd(ContactListWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, ContactListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new z8b(ContactListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new z8b(ContactListWidget.class, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new z8b(ContactListWidget.class, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new z8b(ContactListWidget.class, "isInSearch", "isInSearch()Z"), new z8b(ContactListWidget.class, "isNeedScrollToTop", "isNeedScrollToTop()Z"), new z8b(ContactListWidget.class, "isPermissionChecked", "isPermissionChecked()Z")};
    public final ny8 A;
    public g8c B;
    public final j8e C;
    public final ny8 D;
    public final List E;
    public final ny8 F;
    public final ny8 G;
    public final ifh H;
    public final p3c I;
    public final vv J;
    public final vv K;
    public final vv X;
    public final vv Y;
    public final vv Z;
    public final ca2 a;
    public final ca2 b;
    public final oi8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final hm8 h;
    public final z8 i;
    public final ExecutorService j;
    public final ny8 k;
    public final zsj l;
    public final lp0 m;
    public final zsj n;
    public final ks6 n1;
    public final h47 o;
    public final lp0 p;
    public final zsj q;
    public final pk6 r;
    public final r84 s;
    public final xme t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final ow0 x;
    public final ny8 y;
    public final ny8 z;

    public ContactListWidget(Bundle bundle) {
        super(bundle);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.a = ca2Var;
        this.b = new ca2(m35getAccountScopeuqN4xOY());
        this.c = oi8.f;
        this.d = ca2Var.getAccessor().d(231);
        this.e = ca2Var.getAccessor().d(236);
        this.f = ca2Var.getAccessor().d(377);
        this.g = ca2Var.getAccessor().d(769);
        this.h = (hm8) ca2Var.getAccessor().c(752);
        this.i = (z8) ca2Var.getAccessor().c(753);
        ExecutorService executorServiceA = ((a2c) ca2Var.getAccessor().c(27)).a();
        this.j = executorServiceA;
        this.k = ca2Var.getAccessor().d(714);
        zsj zsjVar = new zsj(this, executorServiceA, 3);
        this.l = zsjVar;
        lp0 lp0Var = new lp0((j7c) ca2Var.getAccessor().d(751).getValue(), this, executorServiceA, 1);
        this.m = lp0Var;
        zsj zsjVar2 = new zsj(this, executorServiceA, 3);
        this.n = zsjVar2;
        h47 h47Var = new h47(this, executorServiceA, 4);
        this.o = h47Var;
        lp0 lp0Var2 = new lp0(this, (kp0) ca2Var.getAccessor().c(235), executorServiceA, 0);
        this.p = lp0Var2;
        zsj zsjVar3 = new zsj(this, executorServiceA, 1);
        this.q = zsjVar3;
        pk6 pk6Var = new pk6(this, executorServiceA, 1);
        this.r = pk6Var;
        r84 r84Var = new r84(new q84(false, 1), pk6Var, zsjVar3, lp0Var2, zsjVar, lp0Var, zsjVar2, h47Var);
        r84Var.C(new aj3(2, new al4(this, 0)));
        this.s = r84Var;
        this.t = p90.M(new al4(this, 7));
        this.u = createViewModelLazy(yk4.class, new fj3(10, new za2(this, 28, bundle)));
        this.v = createViewModelLazy(gm8.class, new fj3(11, new al4(this, 8)));
        this.w = createViewModelLazy(y8.class, new fj3(12, new al4(this, 9)));
        this.x = binding(new al4(this, 10));
        this.y = rx8.P(3, new al4(this, 11));
        this.z = rx8.P(3, new yw1(2, bundle));
        this.A = createViewModelLazy(zo0.class, new fj3(13, new al4(this, 1)));
        this.C = viewBinding(R.id.oneme_contactlist_rv);
        this.D = rx8.P(3, new al4(this, 2));
        this.E = xw3.P0(new rp4(R.id.oneme_contactlist_menu_item_add_contact, new tnh(R.string.contact_list_menu_item_add_contact), Integer.valueOf(R.drawable.icon_plus), (Integer) null, 20), new rp4(R.id.oneme_contactlist_menu_item_create_chat, new tnh(R.string.action_create_multichat), Integer.valueOf(R.drawable.icon_users), (Integer) null, 20), new rp4(R.id.oneme_invite_by_link_action_menu_item, new tnh(R.string.oneme_invite_by_link_action), Integer.valueOf(R.drawable.icon_link), (Integer) null, 20), new rp4(R.id.oneme_invite_by_phone_action_menu_item, new tnh(R.string.oneme_invite_by_phone_action), Integer.valueOf(R.drawable.icon_call), (Integer) null, 20));
        this.F = ysc.a.a();
        this.G = ca2Var.getAccessor().d(85);
        this.H = new ifh(new al4(this, 4));
        this.I = qyj.S();
        this.J = new vv(Long.class, null, "selected.contactId.Action");
        this.K = new vv(CharSequence.class, null, "contact_list_widget_search_query");
        Boolean bool = Boolean.FALSE;
        this.X = new vv(Boolean.class, bool, "contact_list_widget_is_in_search");
        this.Y = new vv(Boolean.class, bool, "contact_list_widget_is_need_scroll_to_top");
        this.Z = new vv(Boolean.class, bool, "contact_list_widget_permission_check");
        this.n1 = tre.G(this, new al4(this, 6));
    }

    @Override // defpackage.um4
    public final void B(int i) {
        int iD = qt4.D(i);
        if (iD == 5 || iD == 6) {
            p1().m(new svj(this, 1), wsc.i, 160);
        } else {
            v1();
        }
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        Long lR1 = r1();
        long jLongValue = lR1 != null ? lR1.longValue() : 0L;
        zv8[] zv8VarArr = o1;
        vo8 vo8Var = (vo8) this.I.m(this, zv8VarArr[2]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        zv8 zv8Var = zv8VarArr[3];
        this.J.b(this, null);
        t1().F(i, jLongValue);
    }

    @Override // defpackage.pl8
    public final void F(ll8 ll8Var) {
        int i;
        int iOrdinal = ll8Var.ordinal();
        if (iOrdinal == 0) {
            i = R.id.oneme_invite_by_phone_action_menu_item;
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            i = R.id.oneme_invite_by_link_action_menu_item;
        }
        Long lR1 = r1();
        long jLongValue = lR1 != null ? lR1.longValue() : 0L;
        zv8 zv8Var = o1[3];
        this.J.b(this, null);
        t1().F(i, jLongValue);
    }

    @Override // defpackage.pn7
    public final void F0(qn7 qn7Var) {
        ml9.b(this);
        yab.i0(getViewLifecycleScope(), null, 0, new qh4(this, qn7Var, null, 2), 3);
    }

    @Override // defpackage.wj4
    public final void K0() {
        w1(new tnh(R.string.snackbar_self_title), null, null);
    }

    @Override // defpackage.nn4
    public final void L0() {
        v1();
    }

    @Override // defpackage.pn7
    public final void N(qn7 qn7Var, boolean z) {
        yab.i0(getViewLifecycleScope(), null, 0, new qi4(this, qn7Var, z, (lq4) null, 4), 3);
    }

    @Override // defpackage.p6f
    public final void U0() {
        a8j.x(t1().A, n6f.a);
    }

    @Override // defpackage.v8
    public final void a0() {
        ml9.b(this);
        yk4 yk4VarT1 = t1();
        int i = i7c.b;
        dq4 dq4Var = yk4VarT1.b;
        xt4 xt4VarA = ((n0c) yk4VarT1.E()).a();
        yt4 yt4VarD = yk4VarT1.D();
        xt4VarA.getClass();
        yk4VarT1.x.B(yk4VarT1, yk4.G[1], yab.h0(dq4Var, lvb.x0(xt4VarA, yt4VarD), 2, new jhc(yk4VarT1, (lq4) null)));
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        yk4 yk4VarT1 = t1();
        if (i == R.id.oneme_contact_not_found_bottom_sheet_positive_button) {
            a8j.x(yk4VarT1.B, new g8f());
        } else {
            yk4VarT1.getClass();
        }
        if (((xu1) this.D.getValue()).g(i) || bundle == null) {
            return;
        }
        t1().F(i, bundle.getLong("selected.contactId.Action"));
    }

    @Override // defpackage.pl8
    public final void e0(int i) {
        Long lR1 = r1();
        long jLongValue = lR1 != null ? lR1.longValue() : 0L;
        zv8 zv8Var = o1[3];
        this.J.b(this, null);
        t1().F(i, jLongValue);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.n1;
    }

    @Override // defpackage.wj4
    public final void h0(long j) {
        Object next;
        List list = ((vj4) t1().u.a.getValue()).c;
        ktc ktcVar = null;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ek4) next).a != j);
            ek4 ek4Var = (ek4) next;
            if (ek4Var != null) {
                ktcVar = ek4Var.l;
            }
        }
        if (ktcVar != null) {
            t1().G();
        }
    }

    @Override // defpackage.wj4
    public final void j0(long j, View view) {
        ml9.b(this);
        int iOrdinal = t1().c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                ore.o();
                return;
            }
            if (r1() == null) {
                zv8[] zv8VarArr = o1;
                zv8 zv8Var = zv8VarArr[2];
                p3c p3cVar = this.I;
                vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
                if (vo8Var == null || !vo8Var.isActive()) {
                    p3cVar.B(this, zv8VarArr[2], yab.i0(getViewLifecycleScope(), null, 2, new vq(this, j, view, (lq4) null, 20), 1));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5, types: [br4] */
    @Override // defpackage.wj4
    public final void m(long j, boolean z) {
        if (!((gbj) t1().t.getValue()).a()) {
            yk4 yk4VarT1 = t1();
            xt4 xt4VarA = ((n0c) yk4VarT1.E()).a();
            yt4 yt4VarD = yk4VarT1.D();
            xt4VarA.getClass();
            a8j.t(yk4VarT1, lvb.x0(xt4VarA, yt4VarD), new c03(yk4VarT1, j, z, null, 6), 2);
            return;
        }
        zv8[] zv8VarArr = BottomSheetWidget.t;
        VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet = new VpnConnectedWarningBottomSheet(y3f.CALL_VPN_WARNING_SHEET, getB().b());
        vpnConnectedWarningBottomSheet.setTargetController(this);
        ?? parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(vpnConnectedWarningBottomSheet, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    @Override // defpackage.pbb
    public final y3f o0() {
        return u1() ? y3f.CONTACTS_SEARCH : y3f.CONTACTS_TAB;
    }

    public final gm8 o1() {
        return (gm8) this.v.getValue();
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        jed jedVar = (jed) this.t.getValue();
        if (jedVar != null) {
            jedVar.d();
        }
        zv8[] zv8VarArr = o1;
        zv8 zv8Var = zv8VarArr[7];
        vv vvVar = this.Z;
        if (((Boolean) vvVar.a(this)).booleanValue()) {
            return;
        }
        zv8 zv8Var2 = zv8VarArr[7];
        vvVar.b(this, Boolean.TRUE);
        boolean zC = p1().c(wsc.g);
        ny8 ny8Var = this.G;
        if (!zC) {
            ((s7f) ((et3) ny8Var.getValue())).P();
            wsc wscVarP1 = p1();
            svj svjVar = new svj(this, 1);
            wscVarP1.getClass();
            wsc.h(wscVarP1, svjVar, wsc.f, 156, true, R.string.permissions_contacts_request_rationale, R.string.permissions_contacts_request, new jsc(R.drawable.contacts_avd), null, np0.n);
            return;
        }
        wsc wscVarP2 = p1();
        String[] strArr = wsc.h;
        if (wscVarP2.c(strArr)) {
            return;
        }
        s7f s7fVar = (s7f) ((et3) ny8Var.getValue());
        if (((Boolean) s7fVar.G.m(s7fVar, s7f.j0[29])).booleanValue()) {
            return;
        }
        ((s7f) ((et3) ny8Var.getValue())).P();
        p1().m(new svj(this, 1), strArr, 156);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        wf4Var.setId(R.id.oneme_contactlist_container);
        View viewS1 = s1();
        uf4 uf4Var = new uf4(-1, -2);
        uf4Var.i = 0;
        uf4Var.e = 0;
        uf4Var.h = 0;
        wf4Var.addView(viewS1, uf4Var);
        r1c r1cVar = new r1c(wf4Var.getContext());
        r1cVar.setIcon(R.drawable.icon_users_fill);
        r1cVar.setTitle(new tnh(R.string.empty_contact_list_title));
        r1cVar.setSubtitle(new tnh(R.string.empty_contact_list_description));
        k96 k96Var = new k96(wf4Var.getContext());
        k96Var.setId(R.id.oneme_contactlist_rv);
        k96Var.setItemAnimator(null);
        nee neeVar = this.s;
        k96Var.setAdapter(neeVar);
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager(1, false));
        k96Var.setClipToPadding(false);
        k96Var.setEmptyView(r1cVar);
        p3c p3cVar = new p3c(11, new bl4(this, 0));
        tee zpgVar = new zpg(k96Var, neeVar, p3cVar);
        k96Var.h(zpgVar, -1);
        k96Var.h(new ak4(p3cVar, pq3.j.h(k96Var), new s63(8, this)), -1);
        tee zpgVar2 = new zpg(k96Var, neeVar, new i1m(new w14(this, 5, k96Var)));
        k96Var.h(zpgVar2, -1);
        n1g.N(new d3(zpgVar, zpgVar2, null, 11), k96Var);
        jed jedVar = (jed) this.t.getValue();
        if (jedVar != null) {
            jedVar.e(k96Var);
            k96Var.k(jedVar);
        }
        uf4 uf4Var2 = new uf4(-1, 0);
        uf4Var2.j = s1().getId();
        uf4Var2.e = 0;
        uf4Var2.h = 0;
        uf4Var2.l = 0;
        wf4Var.addView(k96Var, uf4Var2);
        uf4 uf4Var3 = new uf4(-1, 0);
        uf4Var3.j = s1().getId();
        uf4Var3.e = 0;
        uf4Var3.h = 0;
        uf4Var3.l = 0;
        wf4Var.addView(r1cVar, uf4Var3);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.t.b = khb.k;
        this.B = null;
        ((fl4) this.y.getValue()).e();
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        zv8[] zv8VarArr = o1;
        vo8 vo8Var = (vo8) this.I.m(this, zv8VarArr[2]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        zv8 zv8Var = zv8VarArr[3];
        this.J.b(this, null);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (((xu1) this.D.getValue()).b(i, iArr)) {
            return;
        }
        if (i == 156) {
            wsc wscVarP1 = p1();
            svj svjVar = new svj(this, 1);
            String[] strArr2 = wsc.f;
            jsc jscVar = new jsc(R.drawable.contacts_avd);
            wscVarP1.getClass();
            if (wsc.u(svjVar, strArr, iArr, strArr2, R.string.permissions_contacts_request, R.string.permissions_contacts_request_denied, jscVar)) {
                wsc wscVarP2 = p1();
                wscVarP2.getClass();
                String[] strArr3 = strArr2;
                if (strArr3.length != 0) {
                    strArr3 = (Comparable[]) Arrays.copyOf(strArr3, strArr3.length);
                    if (strArr3.length > 1) {
                        Arrays.sort(strArr3);
                    }
                }
                usc uscVar = (usc) wscVarP2.d.get(Arrays.toString(strArr3));
                if (uscVar != null) {
                    uscVar.e();
                }
            }
        }
        x1();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), (fl4) this.y.getValue());
        }
        e9i.j0(new r07(t1().u, ((zo0) this.A.getValue()).i, new gl4(0, null, this), 0), getViewLifecycleScope());
        e9i.j0(new fz6(t1().D, new dl4(this, null), 3), getViewLifecycleScope());
        e9i.j0(new r07(t1().y.j, ((y8) this.w.getValue()).g, new gl4(1, null, this), 0), getViewLifecycleScope());
        nr2 nr2VarM0 = e9i.m0(o1().m, t1().z);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(nr2VarM0, i19VarF, n09Var), new dl4(0, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.m0(o1().l, t1().A), getViewLifecycleOwner().f(), n09Var), new dl4(1, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().B, getViewLifecycleOwner().f(), n09Var), new dl4(2, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().o, getViewLifecycleOwner().f(), n09Var), new dl4(3, null, this), 3), getViewLifecycleScope());
    }

    public final wsc p1() {
        return (wsc) this.F.getValue();
    }

    public final CharSequence q1() {
        zv8 zv8Var = o1[4];
        return (CharSequence) this.K.a(this);
    }

    public final Long r1() {
        zv8 zv8Var = o1[3];
        return (Long) this.J.a(this);
    }

    public final rcc s1() {
        zv8 zv8Var = o1[0];
        return (rcc) this.x.getValue();
    }

    @Override // defpackage.wj4
    public final void t0(long j) {
        ml9.b(this);
        t1().F(R.id.oneme_contactlist_action_write, j);
    }

    public final yk4 t1() {
        return (yk4) this.u.getValue();
    }

    public final boolean u1() {
        zv8 zv8Var = o1[5];
        return ((Boolean) this.X.a(this)).booleanValue();
    }

    public final void v1() {
        p1().m(new svj(this, 1), wsc.f, 156);
    }

    public final void w1(ynh ynhVar, ynh ynhVar2, Integer num) {
        CharSequence charSequenceB = ynhVar.b(getContext());
        if (charSequenceB == null) {
            return;
        }
        g8c g8cVar = this.B;
        if (g8cVar != null) {
            g8cVar.b();
        }
        h8c h8cVar = new h8c(this);
        h8cVar.n(charSequenceB);
        h8cVar.a(ynhVar2);
        if (num != null) {
            h8cVar.h(new w8c(num.intValue()));
        }
        this.B = h8cVar.p();
    }

    public final void x1() {
        boolean zB = ((vj4) t1().y.j.a.getValue()).b();
        h47 h47Var = this.o;
        lp0 lp0Var = this.p;
        if (!zB || !((List) ((y8) this.w.getValue()).g.a.getValue()).isEmpty() || !u1()) {
            CharSequence charSequenceQ1 = q1();
            lp0Var.H((charSequenceQ1 == null || charSequenceQ1.length() == 0) ? (List) ((zo0) this.A.getValue()).i.a.getValue() : r66.a);
            h47Var.H(null);
        } else {
            boolean zC = p1().c(wsc.g);
            pn4 pn4Var = new pn4(zC ? R.string.empty_search_contact_enabled_description : R.string.empty_search_contact_disabled_description, zC ? null : Integer.valueOf(R.string.empty_search_contact_btn_title));
            lp0Var.H(null);
            h47Var.H(Collections.singletonList(pn4Var));
        }
    }

    @Override // defpackage.um4
    public final void z() {
        v1();
    }

    public ContactListWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public ContactListWidget(cl4 cl4Var, ha9 ha9Var) {
        this(n1g.i(new ylc("contact_screen_open_mode", cl4Var.name()), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
