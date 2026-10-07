package one.me.chats.list;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.adh;
import defpackage.ak4;
import defpackage.an3;
import defpackage.bdc;
import defpackage.bm3;
import defpackage.br4;
import defpackage.c6;
import defpackage.ca2;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.dq4;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9h;
import defpackage.e9i;
import defpackage.ei3;
import defpackage.ek4;
import defpackage.em3;
import defpackage.f5d;
import defpackage.fz6;
import defpackage.g3;
import defpackage.gm0;
import defpackage.gve;
import defpackage.ha9;
import defpackage.ht1;
import defpackage.ic6;
import defpackage.ifh;
import defpackage.iug;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jed;
import defpackage.jsc;
import defpackage.jz;
import defpackage.k0d;
import defpackage.k79;
import defpackage.k96;
import defpackage.khb;
import defpackage.lfe;
import defpackage.ll8;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nee;
import defpackage.ny8;
import defpackage.o6f;
import defpackage.obf;
import defpackage.ok6;
import defpackage.ol;
import defpackage.opl;
import defpackage.ore;
import defpackage.ow0;
import defpackage.p3c;
import defpackage.p6f;
import defpackage.p90;
import defpackage.pk3;
import defpackage.pk6;
import defpackage.pl8;
import defpackage.pp4;
import defpackage.pq3;
import defpackage.q37;
import defpackage.q84;
import defpackage.qt4;
import defpackage.qw2;
import defpackage.qyj;
import defpackage.r03;
import defpackage.r17;
import defpackage.r1c;
import defpackage.r47;
import defpackage.r84;
import defpackage.rb5;
import defpackage.ri3;
import defpackage.rl3;
import defpackage.rt2;
import defpackage.rx8;
import defpackage.see;
import defpackage.sk3;
import defpackage.sm8;
import defpackage.svj;
import defpackage.t3f;
import defpackage.tk3;
import defpackage.tl3;
import defpackage.tm3;
import defpackage.tnh;
import defpackage.tre;
import defpackage.tz;
import defpackage.u50;
import defpackage.v09;
import defpackage.v56;
import defpackage.v66;
import defpackage.vd7;
import defpackage.vee;
import defpackage.vl3;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vq;
import defpackage.vv;
import defpackage.w09;
import defpackage.w4;
import defpackage.w73;
import defpackage.wh3;
import defpackage.wo6;
import defpackage.wsc;
import defpackage.wxb;
import defpackage.wzj;
import defpackage.xe3;
import defpackage.xl3;
import defpackage.xm3;
import defpackage.xme;
import defpackage.xt4;
import defpackage.xu2;
import defpackage.xw3;
import defpackage.yab;
import defpackage.yk4;
import defpackage.yl3;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ym3;
import defpackage.yt4;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zh3;
import defpackage.zm3;
import defpackage.zn;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/chats/list/ChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lmc4;", "Lok6;", "Lpl8;", "Lp6f;", "Lan3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lt3f;", "parentScopeId", "Lha9;", "localAccountId", "(Ljava/lang/String;Lt3f;Lha9;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatsListWidget extends Widget implements vp4, mc4, ok6, pl8, p6f, an3 {
    public static final /* synthetic */ zv8[] X = {new dwd(ChatsListWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.e(zfe.a, ChatsListWidget.class, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), new z8b(ChatsListWidget.class, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new dwd(ChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(ChatsListWidget.class, "emptyViewNestedScrollContainer", "getEmptyViewNestedScrollContainer()Landroidx/core/widget/NestedScrollView;", 0), new z8b(ChatsListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new dwd(ChatsListWidget.class, "chatsListRecyclerViewAnalyticsListener", "getChatsListRecyclerViewAnalyticsListener()Lone/me/chats/list/ChatsListRecyclerViewAnalyticsListener;", 0)};
    public final em3 A;
    public final xe3 B;
    public final r47 C;
    public final r84 D;
    public final p3c E;
    public final ny8 F;
    public final ow0 G;
    public final xme H;
    public final xme I;
    public final v66 J;
    public boolean K;
    public final ca2 a;
    public final ca2 b;
    public final ca2 c;
    public final String d;
    public final String e;
    public final vv f;
    public final vv g;
    public final ifh h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ExecutorService n;
    public final ny8 o;
    public final j8e p;
    public final ny8 q;
    public final j8e r;
    public final ifh s;
    public a t;
    public final zh3 u;
    public cf7 v;
    public final int[] w;
    public final pk6 x;
    public final pk6 y;
    public final pk6 z;

    public ChatsListWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv("parent_scope_id_arg", t3f.class);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.a = ca2Var;
        ca2 ca2Var2 = new ca2(m35getAccountScopeuqN4xOY());
        this.b = ca2Var2;
        this.c = new ca2(m35getAccountScopeuqN4xOY());
        String name = ChatsListWidget.class.getName();
        this.d = name;
        String string = bundle.getString("folder.id.key");
        if (string == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.e = string;
        this.f = new vv(Long.class, null, "selected.chatId.Action");
        this.g = new vv(Long.class, null, "selected.contactId.Action");
        this.h = new ifh(new tl3(this, 0));
        this.i = ca2Var2.getAccessor().d(769);
        this.j = createViewModelLazy(yk4.class, new ei3(1, new tl3(this, 3)));
        this.k = createViewModelLazy(rl3.class, new ei3(2, new tl3(this, 4)));
        zv8 zv8Var = X[0];
        this.l = getSharedViewModel((t3f) vvVar.a(this), iug.class, null);
        this.m = ca2Var.c();
        ExecutorService executorServiceA = ca2Var.b().a();
        this.n = executorServiceA;
        this.o = ca2Var.getAccessor().d(714);
        this.p = viewBinding(R.id.chats_list_view);
        this.q = ca2Var.getAccessor().d(82);
        this.r = viewBinding(R.id.oneme_folder_empty_view_scrollable_container_id);
        this.s = new ifh(new tl3(this, 5));
        zh3 zh3Var = new zh3(new v56(6, this), executorServiceA);
        this.u = zh3Var;
        this.w = new int[2];
        pk6 pk6Var = new pk6(this, executorServiceA, 0);
        this.x = pk6Var;
        pk6 pk6Var2 = new pk6(this, executorServiceA, 0);
        this.y = pk6Var2;
        pk6 pk6Var3 = new pk6(this, executorServiceA, 1);
        this.z = pk6Var3;
        em3 em3Var = new em3();
        this.A = em3Var;
        xe3 xe3Var = new xe3(this, executorServiceA);
        this.B = xe3Var;
        r47 r47Var = new r47(executorServiceA, new gve(this), new tl3(this, 6));
        this.C = r47Var;
        this.D = new r84(new q84(false, 2), r47Var, zh3Var, em3Var, pk6Var, pk6Var3, pk6Var2, xe3Var);
        this.E = qyj.S();
        this.F = rx8.P(3, new tl3(this, 7));
        this.G = binding(new tl3(this, 8));
        this.H = p90.M(new tl3(this, 9));
        this.I = p90.M(new tl3(this, 10));
        this.J = new v66(1, this);
        this.K = true;
        t1().f.v();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.s("ONEME-6453|chats_list_lf | list subscribe on new data. Scope isActive: ", cqk.x(getLifecycleScope())), null);
            }
        }
        e9i.j0(e9i.A(t1().z1, t1().E1, t1().F1, new tz(7, ch3.j(xw3.P0(ll8.b, ll8.a))), t1().J1, new vl3(0, null, this)), getLifecycleScope());
    }

    public static final void o1(ChatsListWidget chatsListWidget) {
        w73 w73VarR1;
        cf7 cf7Var;
        if (((Boolean) ((f5d) ((wo6) chatsListWidget.a.getAccessor().d(54).getValue())).a.c5.a(e5d.S6[316]).i()).booleanValue() && chatsListWidget.isAttached()) {
            br4 parentController = chatsListWidget.getParentController();
            String str = null;
            ChatsTabWidget chatsTabWidget = parentController instanceof ChatsTabWidget ? (ChatsTabWidget) parentController : null;
            if (chatsTabWidget != null) {
                List list = (List) chatsTabWidget.D1().n.a.getValue();
                int iIntValue = ((Number) chatsTabWidget.D1().p.a.getValue()).intValue();
                if (iIntValue < 0 || iIntValue > xw3.O0(list)) {
                    String str2 = chatsTabWidget.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str2, qt4.l("Incorrect folder position=", iIntValue, list.size(), ", folders size = "), null);
                        }
                    }
                } else {
                    str = ((q37) ((List) chatsTabWidget.D1().n.a.getValue()).get(iIntValue)).a;
                }
            }
            if (str == null || !str.equals(chatsListWidget.e) || (w73VarR1 = chatsListWidget.r1(chatsListWidget.s1())) == null || (cf7Var = chatsListWidget.v) == null) {
                return;
            }
        }
    }

    public static void w1(pp4 pp4Var) {
        pp4Var.h(new Rect(gm0.K(yl5.d().getDisplayMetrics().density * (-6.0f)), 0, gm0.K((-6.0f) * yl5.d().getDisplayMetrics().density), 0), 0.0f);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        zv8[] zv8VarArr = X;
        zv8 zv8Var = zv8VarArr[1];
        vv vvVar = this.f;
        Long l = (Long) vvVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            zv8 zv8Var2 = zv8VarArr[1];
            vvVar.b(this, null);
            t1().L(i, jLongValue);
            return;
        }
        zv8 zv8Var3 = zv8VarArr[2];
        vv vvVar2 = this.g;
        Long l2 = (Long) vvVar2.a(this);
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            zv8 zv8Var4 = zv8VarArr[2];
            vvVar2.b(this, null);
            ((yk4) this.j.getValue()).F(i, jLongValue2);
        }
    }

    @Override // defpackage.pl8
    public final void F(ll8 ll8Var) {
        int iOrdinal = ll8Var.ordinal();
        if (iOrdinal == 0) {
            zm3.b.v();
        } else if (iOrdinal != 1) {
            ore.o();
        } else {
            ((sm8) this.i.getValue()).b();
            t1().P();
        }
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        t1().A1 = null;
    }

    @Override // defpackage.p6f
    public final void U0() {
        a8j.x(t1().L1, new o6f(false));
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_saved_messages_clear_history) {
            rl3 rl3VarT1 = t1();
            rt2 rt2Var = (rt2) ((qw2) rl3VarT1.p.getValue()).R().getValue();
            if (rt2Var == null) {
                gm0.Y(rl3.class.getName(), "Early return in onClearSavedMessagesConfirm cuz of chatController.savedMessagesChat.value is null");
                return;
            } else {
                opl.c((wzj) rl3VarT1.y.getValue(), rt2Var.a);
                return;
            }
        }
        if (i == R.id.oneme_confirm_cancel) {
            H(bundle);
            return;
        }
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("selected.chatId.Action")) : null;
        boolean z = (lValueOf == null || lValueOf.longValue() != 0) && lValueOf != null;
        Long lValueOf2 = bundle != null ? Long.valueOf(bundle.getLong("selected.contactId.Action")) : null;
        boolean z2 = (lValueOf2 == null || lValueOf2.longValue() != 0) && lValueOf2 != null;
        if (z) {
            rl3 rl3VarT2 = t1();
            if (lValueOf != null) {
                rl3VarT2.L(i, lValueOf.longValue());
                return;
            } else {
                ore.p("Required value was null.");
                return;
            }
        }
        if (z2) {
            yk4 yk4Var = (yk4) this.j.getValue();
            if (lValueOf2 != null) {
                yk4Var.F(i, lValueOf2.longValue());
                return;
            } else {
                ore.p("Required value was null.");
                return;
            }
        }
        rl3 rl3VarT3 = t1();
        pk3 pk3Var = rl3VarT3.A1;
        if (pk3Var != null) {
            xt4 xt4VarA = ((n0c) rl3VarT3.h).a();
            yt4 yt4VarJ = rl3VarT3.J();
            xt4VarA.getClass();
            a8j.t(rl3VarT3, lvb.x0(xt4VarA, yt4VarJ), new ht1(pk3Var, rl3VarT3, i, (lq4) null, 7), 2);
            return;
        }
        String str = rl3VarT3.U1;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.h(i, "pendingConfirmation is null for action: "), null);
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        tre.C0(s1(), this.D, false, new c6(22));
        t1().M();
        jed jedVar = (jed) this.H.getValue();
        if (jedVar != null) {
            jedVar.d();
        }
        jed jedVar2 = (jed) this.I.getValue();
        if (jedVar2 != null) {
            jedVar2.d();
        }
        try {
            this.u.C(this.J);
        } catch (IllegalStateException unused) {
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Adapter data observer has been already attached. Probably onDetach hasn't been called?", null);
            }
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        k96 k96Var = new k96(layoutInflater.getContext());
        k96Var.setId(R.id.chats_list_view);
        k96Var.setTag(R.id.oneme_folder_tag, this.e);
        k96Var.setHasFixedSize(true);
        frameLayout.addView(k96Var);
        NestedScrollView nestedScrollView = new NestedScrollView(frameLayout.getContext());
        nestedScrollView.setId(R.id.oneme_folder_empty_view_scrollable_container_id);
        nestedScrollView.setFillViewport(true);
        r1c r1cVar = new r1c(nestedScrollView.getContext());
        r1cVar.setId(R.id.oneme_folder_empty_view_id);
        r1cVar.setAllowAnimate(false);
        r1cVar.setIcon(R.drawable.icon_folder_fill);
        r1cVar.setTitle(new tnh(R.string.chats_list_empty_state_title));
        nestedScrollView.addView(r1cVar, -1, -1);
        frameLayout.addView(nestedScrollView, -1, -1);
        n1g.N(new adh(3, (lq4) null, 7), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("ONEME-6453|chats_list_lf | list view destroy. Scope isActive: ", cqk.x(getLifecycleScope())), null);
            }
        }
        xme xmeVar = this.H;
        khb khbVar = khb.k;
        xmeVar.b = khbVar;
        this.I.b = khbVar;
        k96 k96VarS1 = s1();
        ow0 ow0Var = this.G;
        zv8 zv8Var = X[6];
        k96VarS1.p0((ri3) ow0Var.getValue());
        k96VarS1.setDelegate(null);
        k96VarS1.setPager(null);
        tre.D0(k96VarS1, null, null, 6);
        rl3 rl3VarT1 = t1();
        r17 r17VarK = rl3VarT1.K();
        if (r17VarK == null || !r17VarK.s) {
            return;
        }
        gm0.n(rl3VarT1.U1, "clear temporary suggest chats");
        a8j.t(rl3VarT1, ((n0c) rl3VarT1.h).b(), new sk3(0, rl3VarT1, null), 2);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        if (getView() != null) {
            tre.D0(s1(), null, null, 4);
        }
        this.u.E(this.J);
        super.onDetach(view);
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        zv8[] zv8VarArr = X;
        zv8 zv8Var = zv8VarArr[1];
        this.f.b(this, null);
        zv8 zv8Var2 = zv8VarArr[2];
        this.g.b(this, null);
        vo8 vo8Var = (vo8) this.E.m(this, zv8VarArr[5]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            wsc wscVar = (wsc) this.m.getValue();
            svj svjVar = new svj(this, 1);
            String[] strArr2 = wsc.f;
            jsc jscVar = new jsc(R.drawable.contacts_avd);
            wscVar.getClass();
            wsc.u(svjVar, strArr, iArr, strArr2, R.string.permissions_contacts_request, R.string.permissions_contacts_request_denied, jscVar);
        }
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
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("ONEME-6453|chats_list_lf | list view created. Scope isActive: ", cqk.x(getLifecycleScope())), null);
            }
        }
        k96 k96VarS1 = s1();
        r84 r84Var = this.D;
        String str2 = this.e;
        if (cqk.d(str2, "all.chat.folder")) {
            ow0 ow0Var = this.G;
            zv8 zv8Var = X[6];
            k96VarS1.i((ri3) ow0Var.getValue());
        }
        k96VarS1.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        if (true != linearLayoutManager.i) {
            linearLayoutManager.i = true;
            linearLayoutManager.j = 0;
            RecyclerView recyclerView = linearLayoutManager.b;
            if (recyclerView != null) {
                recyclerView.c.m();
            }
        }
        linearLayoutManager.C = 12;
        k96VarS1.setLayoutManager(linearLayoutManager);
        tre.D0(k96VarS1, r84Var, new c6(23), 2);
        k96VarS1.setHasFixedSize(true);
        k96VarS1.setPager(new w4(this));
        if (cqk.d(str2, "all.chat.folder")) {
            k96VarS1.setDelegate(this.A);
        }
        k96VarS1.setEmptyView((NestedScrollView) this.r.m(this, X[4]));
        k96VarS1.setClipToPadding(false);
        k96VarS1.setClipChildren(false);
        k96VarS1.setClipToOutline(false);
        k96VarS1.setThreshold(10);
        k96VarS1.setIgnoreRefreshingFlagsForScrollEvent(true);
        a aVar = this.t;
        if (aVar != null) {
            k96VarS1.setItemViewCacheSize(Integer.MIN_VALUE);
            k96VarS1.setRecycledViewPool(aVar);
        }
        see itemAnimator = k96VarS1.getItemAnimator();
        rb5 rb5Var = itemAnimator instanceof rb5 ? (rb5) itemAnimator : null;
        if (rb5Var != null) {
            rb5Var.g = false;
        }
        k96VarS1.h(new r03(), -1);
        a8g a8gVar = pq3.j;
        k96VarS1.h(new k0d(a8gVar.h(k96VarS1)), -1);
        String string = getContext().getString(R.string.contacts);
        u50 u50Var = new u50();
        u50Var.a = this;
        u50Var.c = string;
        u50Var.b = k96VarS1;
        k96VarS1.h(new obf(u50Var), -1);
        k96VarS1.h(new ak4(new p3c(11, new ol(this, 3, new ek4(0L, "", null, null, null, null, null, false, false, "", false, null, 0, false, false, false, false, false, 1637376))), a8gVar.h(k96VarS1), null), -1);
        k96VarS1.h(new e9h(getContext()), -1);
        if (r84Var.l() > 0) {
            ((wxb) this.q.getValue()).getClass();
            k96VarS1.measure(View.MeasureSpec.makeMeasureSpec(k96VarS1.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(k96VarS1.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        jed jedVar = (jed) this.H.getValue();
        if (jedVar != null) {
            jedVar.e(k96VarS1);
            k96VarS1.k(jedVar);
        }
        jed jedVar2 = (jed) this.I.getValue();
        if (jedVar2 != null) {
            jedVar2.e(k96VarS1);
            k96VarS1.k(jedVar2);
        }
        k96VarS1.setEdgeEffectFactory(new xl3(this));
        s1().setRefreshingNext(((wh3) t1().z1.a.getValue()).b);
        s1().k(new bm3(this));
        ic6 ic6Var = t1().K1;
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, getViewLifecycleOwner().f(), n09Var), new yl3(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(t1().L1, 5), getViewLifecycleOwner().f(), n09Var), new yl3(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().H1, getViewLifecycleOwner().f(), n09Var), new yl3(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((yk4) this.j.getValue()).z, getViewLifecycleOwner().f(), n09Var), new yl3(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(((yk4) this.j.getValue()).A, 6), getViewLifecycleOwner().f(), n09Var), new yl3(null, this, 4), 3), getViewLifecycleScope());
        this.u.g = new g3(9, this);
        e9i.j0(new fz6(n1g.v(t1().S1, getViewLifecycleOwner().f(), n09Var), new yl3(null, this, 5), 3), getViewLifecycleScope());
        tm3 tm3Var = t1().B1;
        if (tm3Var != null) {
            ym3 ym3Var = new ym3(s1(), this.u, this.D, tm3Var);
            v09 viewLifecycleScope = getViewLifecycleScope();
            vd7.B(((w09) viewLifecycleScope).b).Y(new g3(10, ym3Var));
            e9i.j0(new fz6(tm3Var.h, new xm3(2, ym3Var, ym3.class, "handleNewSelectedChats", "handleNewSelectedChats(Lone/me/chats/list/multiselection/ChatsMultiselectionLogic$Data;)V", 4, 0), 3), viewLifecycleScope);
        }
        x1();
    }

    public final xu2 p1(long j) {
        zh3 zh3Var = this.u;
        Iterator it = zh3Var.d.f.iterator();
        int iL = 0;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((w73) it.next()).a == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            List listF = this.D.F();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (((nee) obj) == zh3Var) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                iL += ((nee) it2.next()).l();
            }
            lfe lfeVarK = s1().K(iL + i);
            View view = lfeVarK != null ? lfeVarK.a : null;
            if (view instanceof xu2) {
                return (xu2) view;
            }
        }
        return null;
    }

    public final r1c q1() {
        NestedScrollView nestedScrollView = (NestedScrollView) this.r.m(this, X[4]);
        View childAt = nestedScrollView.getChildAt(0);
        if (childAt != null) {
            return (r1c) childAt;
        }
        throw new IndexOutOfBoundsException("Index: 0, Size: " + nestedScrollView.getChildCount());
    }

    public final w73 r1(k96 k96Var) {
        int iX0;
        vee layoutManager = k96Var.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && (iX0 = linearLayoutManager.X0()) != -1) {
            zh3 zh3Var = this.u;
            if (iX0 <= zh3Var.l() - 1 && zh3Var.l() != 0) {
                return (w73) ((k79) zh3Var.F(iX0));
            }
        }
        return null;
    }

    public final k96 s1() {
        return (k96) this.p.m(this, X[3]);
    }

    public final rl3 t1() {
        return (rl3) this.k.getValue();
    }

    public final void u1(long j) {
        rl3 rl3VarT1 = t1();
        dq4 dq4Var = rl3VarT1.b;
        xt4 xt4VarA = ((n0c) rl3VarT1.h).a();
        yt4 yt4VarJ = rl3VarT1.J();
        xt4VarA.getClass();
        yab.i0(dq4Var, lvb.x0(xt4VarA, yt4VarJ), 0, new tk3(rl3VarT1, j, null, 2), 2);
    }

    @Override // defpackage.an3
    public final void v0(boolean z) {
        if (getView() != null) {
            q1().setAllowAnimate(z);
        }
    }

    public final void v1(long j, View view) {
        zv8[] zv8VarArr = X;
        zv8 zv8Var = zv8VarArr[2];
        if (((Long) this.g.a(this)) == null) {
            zv8 zv8Var2 = zv8VarArr[5];
            p3c p3cVar = this.E;
            vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var2);
            if (vo8Var == null || !vo8Var.isActive()) {
                p3cVar.B(this, zv8VarArr[5], yab.i0(getViewLifecycleScope(), null, 2, new vq(this, j, view, (lq4) null, 16), 1));
            }
        }
    }

    public final void x1() {
        if (!this.K || t1().z1.a.getValue() == wh3.c || ((wh3) t1().z1.a.getValue()).a.isEmpty() || getView() == null) {
            return;
        }
        this.K = false;
        k96 k96VarS1 = s1();
        bdc.a(k96VarS1, new zn(3, k96VarS1, this));
    }

    public ChatsListWidget(String str, t3f t3fVar, ha9 ha9Var) {
        this(n1g.i(new ylc("parent_scope_id_arg", t3fVar), new ylc("folder.id.key", str), new ylc(Widget.ARG_SCOPE_ID, new t3f(null, ha9Var, 1))));
    }
}
