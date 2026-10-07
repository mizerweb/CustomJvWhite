package one.me.startconversation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.acc;
import defpackage.aj3;
import defpackage.ak4;
import defpackage.ca2;
import defpackage.ce;
import defpackage.cf7;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ev;
import defpackage.ft0;
import defpackage.fz6;
import defpackage.g57;
import defpackage.ga0;
import defpackage.gcc;
import defpackage.h47;
import defpackage.ha9;
import defpackage.i1m;
import defpackage.i20;
import defpackage.ifh;
import defpackage.irf;
import defpackage.j7c;
import defpackage.j8e;
import defpackage.jsc;
import defpackage.kcc;
import defpackage.kp0;
import defpackage.ks6;
import defpackage.ll8;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nn4;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o65;
import defpackage.ohg;
import defpackage.oi8;
import defpackage.ore;
import defpackage.p3c;
import defpackage.ph1;
import defpackage.phg;
import defpackage.pk6;
import defpackage.pl8;
import defpackage.pn7;
import defpackage.pq3;
import defpackage.q84;
import defpackage.qhg;
import defpackage.qn7;
import defpackage.qt4;
import defpackage.r07;
import defpackage.r84;
import defpackage.rcc;
import defpackage.rhg;
import defpackage.rx8;
import defpackage.ryf;
import defpackage.sm8;
import defpackage.svj;
import defpackage.t2g;
import defpackage.t7c;
import defpackage.thg;
import defpackage.tre;
import defpackage.uf4;
import defpackage.uhg;
import defpackage.um4;
import defpackage.vhg;
import defpackage.vv;
import defpackage.vzc;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wj4;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.xhg;
import defpackage.xhh;
import defpackage.xt4;
import defpackage.xu1;
import defpackage.yab;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.yt4;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo0;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zsj;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/startconversation/StartConversationScreen;", "Lone/me/sdk/arch/Widget;", "Lwj4;", "Lpn7;", "Lum4;", "Lnn4;", "Lpl8;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "start-conversation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartConversationScreen extends Widget implements wj4, pn7, um4, nn4, pl8 {
    public static final /* synthetic */ zv8[] A = {new z8b(StartConversationScreen.class, "isNeedScrollToTop", "isNeedScrollToTop()Z"), zo5.e(zfe.a, StartConversationScreen.class, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new z8b(StartConversationScreen.class, "isInSearch", "isInSearch()Z"), new dwd(StartConversationScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(StartConversationScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final vv d;
    public final vv e;
    public final vv f;
    public final ny8 g;
    public final ca2 h;
    public final ny8 i;
    public final ifh j;
    public final ny8 k;
    public final ny8 l;
    public final j8e m;
    public final j8e n;
    public final ny8 o;
    public final ExecutorService p;
    public final h47 q;
    public final lp0 r;
    public final zsj s;
    public final lp0 t;
    public final zsj u;
    public final pk6 v;
    public final h47 w;
    public final r84 x;
    public final aj3 y;
    public final ev z;

    public StartConversationScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new irf(18));
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        Boolean bool = Boolean.FALSE;
        this.d = new vv(Boolean.class, bool, "start_conversations_widget_is_need_scroll_to_top");
        this.e = new vv(CharSequence.class, null, "start_conversations_widget_search_query");
        vv vvVar = new vv(Boolean.class, bool, "contact_list_widget_is_in_search");
        this.f = vvVar;
        this.g = wtcVar.getAccessor().d(769);
        this.h = new ca2(m35getAccountScopeuqN4xOY());
        this.i = rx8.P(3, new rhg(this, 2));
        this.j = new ifh(new rhg(this, 3));
        this.k = createViewModelLazy(xhg.class, new t2g(1, new rhg(this, 4)));
        this.l = createViewModelLazy(zo0.class, new t2g(2, new rhg(this, 5)));
        this.m = viewBinding(R.id.oneme_startconversation_recyclerview);
        this.n = viewBinding(R.id.oneme_startconversation_toolbar);
        this.o = ysc.a.a();
        ExecutorService executorServiceA = ((a2c) wtcVar.getAccessor().c(27)).a();
        this.p = executorServiceA;
        h47 h47Var = new h47(this, executorServiceA, 5);
        this.q = h47Var;
        lp0 lp0Var = new lp0(this, (kp0) wtcVar.getAccessor().c(235), executorServiceA, 0);
        this.r = lp0Var;
        zsj zsjVar = new zsj(this, executorServiceA, 3);
        this.s = zsjVar;
        lp0 lp0Var2 = new lp0((j7c) wtcVar.getAccessor().d(751).getValue(), this, executorServiceA, 1);
        this.t = lp0Var2;
        zsj zsjVar2 = new zsj(this, executorServiceA, 3);
        this.u = zsjVar2;
        pk6 pk6Var = new pk6(this, executorServiceA, 1);
        this.v = pk6Var;
        h47 h47Var2 = new h47(this, executorServiceA, 4);
        this.w = h47Var2;
        this.x = new r84(new q84(false, 1), h47Var, pk6Var, lp0Var, zsjVar, lp0Var2, zsjVar2, h47Var2);
        this.y = new aj3(2, new rhg(this, 6));
        zv8 zv8Var = A[2];
        this.z = new ev(this, ((Boolean) vvVar.a(this)).booleanValue());
        e9i.j0(new fz6(p1().q.j, new thg(this, null, 0), 3), getLifecycleScope());
        e9i.j0(new fz6(p1().s, new thg(this, null, 1), 3), getLifecycleScope());
    }

    @Override // defpackage.um4
    public final void B(int i) {
        if (uhg.$EnumSwitchMapping$0[qt4.D(i)] != 1) {
            z();
            return;
        }
        svj svjVar = new svj(this, 1);
        ny8 ny8Var = this.o;
        if (((wsc) ny8Var.getValue()).e()) {
            return;
        }
        ((wsc) ny8Var.getValue()).j(svjVar, true);
    }

    @Override // defpackage.pl8
    public final void F(ll8 ll8Var) {
        int iOrdinal = ll8Var.ordinal();
        if (iOrdinal == 0) {
            o65.c(ohg.b.b(), ":invite/phone", null, null, 6);
        } else if (iOrdinal != 1) {
            ore.o();
        } else {
            ((sm8) this.g.getValue()).b();
            p1().B();
        }
    }

    @Override // defpackage.pn7
    public final void F0(qn7 qn7Var) {
        ml9.b(this);
        yab.i0(getViewLifecycleScope(), null, 0, new ryf(this, qn7Var, null, 3), 3);
    }

    @Override // defpackage.nn4
    public final void L0() {
        z();
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getJ() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    @Override // defpackage.wj4
    public final void h0(long j) {
        p1().B();
    }

    public final CharSequence o1() {
        zv8 zv8Var = A[1];
        return (CharSequence) this.e.a(this);
    }

    @Override // defpackage.br4
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), this.z);
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
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        wf4Var.setId(R.id.oneme_startconversation_container);
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setId(R.id.oneme_startconversation_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.oneme_startconversation_title);
        final int i = 0;
        rccVar.setLeftActions(new wbc(new cf7(this) { // from class: shg
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i2 = i;
                StartConversationScreen startConversationScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = StartConversationScreen.A;
                        ltb onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return sbi.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        int iL = startConversationScreen.v.l() + startConversationScreen.q.l();
                        int iL2 = startConversationScreen.r.l() + iL;
                        zsj zsjVar = startConversationScreen.s;
                        int iL3 = zsjVar.l() + iL2;
                        int iL4 = startConversationScreen.w.l();
                        CharSequence charSequenceO1 = startConversationScreen.o1();
                        if ((charSequenceO1 == null || charSequenceO1.length() == 0) && iIntValue >= iL && iIntValue >= iL2 && iIntValue >= iL4 && iIntValue < iL3) {
                            return ((ek4) ((k79) zsjVar.F(iIntValue - iL2))).b;
                        }
                        return null;
                }
            }
        }));
        rccVar.setRightActions(new acc(null, new kcc(new vhg(this)), null));
        t7c searchView = rccVar.getSearchView();
        final int i2 = 1;
        if (searchView != null) {
            searchView.setSearchHint(np4.q(rccVar.getContext(), R.string.oneme_startconversations_search_hint));
            zv8 zv8Var = A[2];
            if (((Boolean) this.f.a(this)).booleanValue()) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
                searchView.setExpandWithAnimation(true);
                searchView.setSearchText(o1());
            }
        }
        uf4 uf4Var = new uf4(-1, -2);
        uf4Var.i = 0;
        uf4Var.e = 0;
        uf4Var.h = 0;
        wf4Var.addView(rccVar, uf4Var);
        RecyclerView recyclerView = new RecyclerView(wf4Var.getContext());
        recyclerView.setId(R.id.oneme_startconversation_recyclerview);
        recyclerView.setItemAnimator(null);
        r84 r84Var = this.x;
        recyclerView.setAdapter(r84Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setClipToPadding(false);
        recyclerView.addOnAttachStateChangeListener(new ga0(recyclerView));
        p3c p3cVar = new p3c(11, new cf7(this) { // from class: shg
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                StartConversationScreen startConversationScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = StartConversationScreen.A;
                        ltb onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return sbi.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        int iL = startConversationScreen.v.l() + startConversationScreen.q.l();
                        int iL2 = startConversationScreen.r.l() + iL;
                        zsj zsjVar = startConversationScreen.s;
                        int iL3 = zsjVar.l() + iL2;
                        int iL4 = startConversationScreen.w.l();
                        CharSequence charSequenceO1 = startConversationScreen.o1();
                        if ((charSequenceO1 == null || charSequenceO1.length() == 0) && iIntValue >= iL && iIntValue >= iL2 && iIntValue >= iL4 && iIntValue < iL3) {
                            return ((ek4) ((k79) zsjVar.F(iIntValue - iL2))).b;
                        }
                        return null;
                }
            }
        });
        zpg zpgVar = new zpg(recyclerView, r84Var, p3cVar);
        recyclerView.h(zpgVar, -1);
        a8g a8gVar = pq3.j;
        recyclerView.h(new ak4(p3cVar, a8gVar.h(recyclerView), new phg(this, 1)), -1);
        recyclerView.h(new ph1(2), -1);
        recyclerView.h(new zpg(recyclerView, r84Var, new ft0(new qhg(this, recyclerView, 1))), -1);
        recyclerView.h(new g57(a8gVar.h(recyclerView), new phg(this, 0)), -1);
        recyclerView.h(new zpg(recyclerView, r84Var, new i1m(new qhg(this, recyclerView, 0))), -1);
        n1g.N(new ce(zpgVar, null, 5), recyclerView);
        uf4 uf4Var2 = new uf4(-1, 0);
        uf4Var2.j = rccVar.getId();
        uf4Var2.e = 0;
        uf4Var2.h = 0;
        uf4Var2.l = 0;
        wf4Var.addView(recyclerView, uf4Var2);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.x.E(this.y);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((xu1) this.i.getValue()).b(i, iArr) && i == 156) {
            wsc wscVar = (wsc) this.o.getValue();
            svj svjVar = new svj(this, 1);
            String[] strArr2 = wsc.f;
            jsc jscVar = new jsc(R.drawable.contacts_avd);
            wscVar.getClass();
            wsc.u(svjVar, strArr, iArr, strArr2, R.string.permissions_contacts_request, R.string.permissions_contacts_request_denied, jscVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(p1().t, new thg(this, null, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().u, getViewLifecycleOwner().f(), n09.d), new thg(null, this), 3), getViewLifecycleScope());
        e9i.j0(new r07(p1().p, ((zo0) this.l.getValue()).i, new vzc(this, (lq4) null, 12), 0), getViewLifecycleScope());
        this.x.C(this.y);
    }

    public final xhg p1() {
        return (xhg) this.k.getValue();
    }

    @Override // defpackage.wj4
    public final void t0(long j) {
        xhg xhgVarP1 = p1();
        xt4 xt4VarA = ((n0c) ((xhh) xhgVarP1.h.getValue())).a();
        yt4 yt4Var = (yt4) xhgVarP1.l.getValue();
        xt4VarA.getClass();
        a8j.t(xhgVarP1, lvb.x0(xt4VarA, yt4Var), new i20(xhgVarP1, j, (lq4) null, 27), 2);
        ml9.c(requireActivity());
    }

    @Override // defpackage.um4
    public final void z() {
        ((wsc) this.o.getValue()).m(new svj(this, 1), wsc.f, 156);
    }

    public StartConversationScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
