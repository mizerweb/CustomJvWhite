package one.me.chats.tab;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.aac;
import defpackage.ah3;
import defpackage.aug;
import defpackage.b0h;
import defpackage.b6;
import defpackage.bp;
import defpackage.br4;
import defpackage.bt4;
import defpackage.c0a;
import defpackage.ca2;
import defpackage.chd;
import defpackage.cqk;
import defpackage.du7;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.ea2;
import defpackage.ei3;
import defpackage.esg;
import defpackage.et3;
import defpackage.et4;
import defpackage.ew5;
import defpackage.fo3;
import defpackage.fz6;
import defpackage.g5d;
import defpackage.g8c;
import defpackage.ghb;
import defpackage.gjf;
import defpackage.gm0;
import defpackage.go3;
import defpackage.gr4;
import defpackage.grg;
import defpackage.gu7;
import defpackage.gvb;
import defpackage.gve;
import defpackage.ha9;
import defpackage.ho3;
import defpackage.hr4;
import defpackage.hsc;
import defpackage.hve;
import defpackage.ifh;
import defpackage.io3;
import defpackage.iug;
import defpackage.j8e;
import defpackage.j95;
import defpackage.jc4;
import defpackage.je9;
import defpackage.jsc;
import defpackage.jvg;
import defpackage.jz;
import defpackage.k96;
import defpackage.kc4;
import defpackage.kl3;
import defpackage.km3;
import defpackage.ko3;
import defpackage.kwb;
import defpackage.lfe;
import defpackage.lm3;
import defpackage.lmc;
import defpackage.lo3;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.lw5;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.mo3;
import defpackage.mol;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n57;
import defpackage.n67;
import defpackage.nee;
import defpackage.no3;
import defpackage.nv7;
import defpackage.ny8;
import defpackage.o83;
import defpackage.obb;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.oo3;
import defpackage.or3;
import defpackage.ore;
import defpackage.org;
import defpackage.osg;
import defpackage.owh;
import defpackage.ozg;
import defpackage.p;
import defpackage.p3c;
import defpackage.p6f;
import defpackage.p96;
import defpackage.pk6;
import defpackage.po3;
import defpackage.pqg;
import defpackage.pr3;
import defpackage.ps2;
import defpackage.pte;
import defpackage.q37;
import defpackage.qe7;
import defpackage.qp4;
import defpackage.qrc;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.qyj;
import defpackage.qz4;
import defpackage.r07;
import defpackage.r2i;
import defpackage.r67;
import defpackage.r8e;
import defpackage.r8h;
import defpackage.rcc;
import defpackage.rdg;
import defpackage.rl8;
import defpackage.rm8;
import defpackage.rq;
import defpackage.rs2;
import defpackage.rx8;
import defpackage.s7f;
import defpackage.sbi;
import defpackage.sgg;
import defpackage.si3;
import defpackage.sm8;
import defpackage.so3;
import defpackage.svj;
import defpackage.szc;
import defpackage.t3a;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.to3;
import defpackage.u03;
import defpackage.uf4;
import defpackage.vd7;
import defpackage.vi3;
import defpackage.vnh;
import defpackage.vp4;
import defpackage.vq4;
import defpackage.vud;
import defpackage.vv;
import defpackage.w73;
import defpackage.wf4;
import defpackage.wq;
import defpackage.wsc;
import defpackage.wtg;
import defpackage.ww3;
import defpackage.wxb;
import defpackage.x2i;
import defpackage.x67;
import defpackage.xlf;
import defpackage.xtg;
import defpackage.xu2;
import defpackage.xug;
import defpackage.y8j;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ys4;
import defpackage.ytg;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zh3;
import defpackage.zm3;
import defpackage.zo5;
import defpackage.ztg;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.chats.list.ChatsListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0003\u0016\u0017\u0018B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u0015¨\u0006\u0019"}, d2 = {"Lone/me/chats/tab/ChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Lobb;", "Lvp4;", "Lmc4;", "Lhsc;", "Lp6f;", "Lpte;", "", "Lpr3;", "Lchd;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lha9;", "localAccountId", "Lt3f;", "parentScopeId", "(Ljava/lang/String;Lha9;Lt3f;)V", "one/me/chats/list/ChatsListWidget", "ko3", "jo3", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatsTabWidget extends Widget implements obb, vp4, mc4, hsc, p6f, pte, pr3, chd {
    public static final /* synthetic */ zv8[] B1 = {new dwd(ChatsTabWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, ChatsTabWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChatsTabWidget.class, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new dwd(ChatsTabWidget.class, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new dwd(ChatsTabWidget.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new dwd(ChatsTabWidget.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), new dwd(ChatsTabWidget.class, "storiesRecycler", "getStoriesRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(ChatsTabWidget.class, "avatarGroupStub", "getAvatarGroupStub()Lone/me/stories/viewer/view/StoriesGroupLayout;", 0), new z8b(ChatsTabWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new z8b(ChatsTabWidget.class, "channelsShowOnboardingJob", "getChannelsShowOnboardingJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final ny8 A1;
    public final r8h B;
    public final ny8 C;
    public final ny8 D;
    public final ny8 E;
    public final pk6 F;
    public final ny8 G;
    public final ny8 H;
    public boolean I;
    public qz4 J;
    public final ifh K;
    public rs2 X;
    public final n67 Y;
    public final int Z;
    public final t3f a;
    public final ny8 b;
    public final ny8 c;
    public final vq4 d;
    public final ca2 e;
    public final oi8 f;
    public final String g;
    public qp4 h;
    public qp4 i;
    public String j;
    public boolean k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final int n1;
    public final ny8 o;
    public final ifh o1;
    public final ny8 p;
    public final j8e p1;
    public final ny8 q;
    public final j8e q1;
    public final ny8 r;
    public final j8e r1;
    public g8c s;
    public final int s1;
    public final ny8 t;
    public final int t1;
    public final ny8 u;
    public final p3c u1;
    public final ny8 v;
    public sgg v1;
    public final j8e w;
    public final p3c w1;
    public final j8e x;
    public gve x1;
    public final j8e y;
    public final ny8 y1;
    public final j8e z;
    public gu7 z1;

    public ChatsTabWidget(Bundle bundle) {
        super(bundle);
        t3f t3fVar = new t3f("chats_tab_scope_id", super.getF().b());
        this.a = t3fVar;
        this.b = createViewModelLazy(vi3.class, new ei3(3, new go3(this, 0)));
        vv vvVar = new vv(t3f.class, t3fVar, "chats_tab_parent_scope_id");
        zv8 zv8Var = B1[0];
        this.c = getSharedViewModel((t3f) vvVar.a(this), km3.class, null);
        this.d = new vq4(2, this);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.e = ca2Var;
        this.f = oi8.f;
        String name = ChatsTabWidget.class.getName();
        this.g = name;
        this.l = ca2Var.c();
        this.m = ca2Var.getAccessor().d(85);
        this.n = ca2Var.getAccessor().d(54);
        this.o = ca2Var.d();
        this.p = ca2Var.getAccessor().d(280);
        this.q = ca2Var.getAccessor().d(82);
        this.r = ca2Var.getAccessor().d(19);
        this.t = ca2Var.getAccessor().d(140);
        this.u = rx8.P(3, new go3(this, 5));
        this.v = ca2Var.getAccessor().d(767);
        this.w = viewBinding(R.id.chats_list_toolbar);
        this.x = viewBinding(R.id.chats_list_folders_tabs);
        this.y = viewBinding(R.id.chats_list_folders_pager);
        this.z = viewBinding(R.id.chats_list_pinbars_view);
        this.A = createViewModelLazy(x67.class, new ei3(4, new go3(this, 6)));
        this.B = (r8h) ca2Var.getAccessor().c(338);
        this.C = createViewModelLazy(ah3.class, new ei3(5, new go3(this, 7)));
        this.D = createViewModelLazy(iug.class, new ei3(6, new go3(this, 8)));
        this.E = createViewModelLazy(jvg.class, new ei3(7, new go3(this, 9)));
        this.F = new pk6(new to3(this), ca2Var.b().a(), 2);
        this.G = ca2Var.getAccessor().d(231);
        this.H = ca2Var.getAccessor().d(147);
        this.K = new ifh(new go3(this, 10));
        this.Y = new n67(true, ca2Var.b().a(), new ifh(new go3(this, 11)));
        this.Z = 10;
        this.n1 = 3;
        this.o1 = new ifh(new go3(this, 12));
        this.p1 = viewBinding(R.id.chats_list_appbar);
        this.q1 = viewBinding(R.id.chats_list_stories_recycler_view);
        this.r1 = viewBinding(R.id.chats_list_stories_group_layout);
        this.s1 = gm0.K(88.0f * yl5.d().getDisplayMetrics().density);
        this.t1 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.u1 = qyj.S();
        this.w1 = qyj.S();
        this.y1 = rx8.P(3, new b6(26));
        this.z1 = du7.c;
        this.A1 = rx8.P(3, new go3(this, 4));
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.s("ONEME-6453|chats_list_lf | tabs subscribe on new data. Scope isActive: ", cqk.x(getLifecycleScope())), null);
            }
        }
        e9i.j0(new fz6(D1().n, new io3(this, (lq4) null, 0), 3), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().h().h(), this.lifecycleOwner.f(), n09.c), new wq(this, (lq4) null, 1), 3), getLifecycleScope());
        if (E1()) {
            e9i.j0(new fz6(B1().l.d, new io3(this, (lq4) null, 1), 3), getLifecycleScope());
        }
    }

    public static Long H1(Bundle bundle) {
        if (bundle != null) {
            if (!bundle.containsKey("story_user_id")) {
                bundle = null;
            }
            if (bundle != null) {
                return Long.valueOf(bundle.getLong("story_user_id"));
            }
        }
        return null;
    }

    public static final boolean o1(ChatsTabWidget chatsTabWidget) {
        br4 parentController = chatsTabWidget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        return hveVarU1 == null || hveVarU1.a.a.size() == 0;
    }

    public static final void p1(ChatsTabWidget chatsTabWidget, int i) {
        lve lveVar;
        je9 je9Var = je9.d;
        hve hveVarI = chatsTabWidget.u1().I(i);
        br4 br4Var = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
        ChatsListWidget chatsListWidget = br4Var instanceof ChatsListWidget ? (ChatsListWidget) br4Var : null;
        if (chatsListWidget == null) {
            return;
        }
        String str = chatsTabWidget.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            View view = chatsListWidget.getView();
            Integer numValueOf = view != null ? Integer.valueOf(view.getMeasuredWidth()) : null;
            View view2 = chatsListWidget.getView();
            a4cVar.c(je9Var, str, "ONEME-6873|chats_list_page_state | root width:" + numValueOf + ", root height:" + (view2 != null ? Integer.valueOf(view2.getMeasuredHeight()) : null), null);
        }
        if (chatsListWidget.getView() == null || cqk.d(chatsListWidget.e, "all.chat.folder")) {
            return;
        }
        int measuredWidth = chatsListWidget.s1().getMeasuredWidth();
        int measuredHeight = chatsListWidget.s1().getMeasuredHeight();
        nee adapter = chatsListWidget.s1().getAdapter();
        Integer numValueOf2 = adapter != null ? Integer.valueOf(adapter.l()) : null;
        int childCount = chatsListWidget.s1().getChildCount();
        k96 k96VarS1 = chatsListWidget.s1();
        boolean z = false;
        int i2 = 0;
        while (i2 < k96VarS1.getChildCount()) {
            int i3 = i2 + 1;
            View childAt = k96VarS1.getChildAt(i2);
            if (childAt == null) {
                ore.i();
                return;
            } else {
                if (childAt.isAttachedToWindow()) {
                    z = true;
                    break;
                }
                i2 = i3;
            }
        }
        String str2 = chatsListWidget.d;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            StringBuilder sbR = c0a.r(measuredWidth, "ONEME-6873|chats_list_page_state | chats list state. folderId:", chatsListWidget.e, " | width:", "|height:");
            qt4.x(measuredHeight, childCount, " | child:", "|childAttached:", sbR);
            sbR.append(z);
            sbR.append("|adapterCount:");
            sbR.append(numValueOf2);
            a4cVar2.c(je9Var, str2, sbR.toString(), null);
        }
    }

    public final k96 A1() {
        return (k96) this.q1.m(this, B1[6]);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    @Override // defpackage.pr3
    public final or3 B0(boolean z, boolean z2) {
        or3 or3Var;
        lve lveVar;
        je9 je9Var = je9.f;
        ytg ytgVar = B1().q;
        int i = -1;
        if (!(ytgVar instanceof wtg)) {
            if (ytgVar instanceof xtg) {
                long jLongValue = ((Number) ((jvg) this.E.getValue()).j.a.getValue()).longValue();
                Iterator it = this.F.d.f.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((osg) it.next()).i == jLongValue) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                lfe lfeVarK = A1().K(i);
                View view = lfeVarK != null ? lfeVarK.a : null;
                esg esgVar = view instanceof esg ? (esg) view : null;
                if (esgVar != null) {
                    int[] iArr = (int[]) this.y1.getValue();
                    kwb kwbVar = esgVar.a;
                    kwbVar.getLocationOnScreen(iArr);
                    iArr[0] = (kwbVar.getMeasuredWidth() / 2) + iArr[0];
                    iArr[1] = (kwbVar.getMeasuredHeight() / 2) + iArr[1];
                    return new or3(((int[]) this.y1.getValue())[0], yl5.d().getDisplayMetrics().density * 31.0f, ((int[]) this.y1.getValue())[1]);
                }
            } else {
                String str = this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "ProvideParams is not implemented for current navigation - " + ytgVar, null);
                }
            }
            return null;
        }
        long jA = ((wtg) ytgVar).a();
        hve hveVarI = u1().I(w1().getCurrentItem());
        br4 br4Var = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
        ChatsListWidget chatsListWidget = br4Var instanceof ChatsListWidget ? (ChatsListWidget) br4Var : null;
        if (chatsListWidget != null) {
            int[] iArr2 = chatsListWidget.w;
            zh3 zh3Var = chatsListWidget.u;
            Iterator it2 = zh3Var.d.f.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                ozg ozgVar = ((w73) it2.next()).x;
                if (ozgVar != null && ozgVar.b.a() == jA) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i < 0) {
                or3Var = null;
            } else {
                List listF = chatsListWidget.D.F();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (((nee) obj) == zh3Var) {
                        break;
                    }
                    arrayList.add(obj);
                }
                Iterator it3 = arrayList.iterator();
                int iL = 0;
                while (it3.hasNext()) {
                    iL += ((nee) it3.next()).l();
                }
                lfe lfeVarK2 = chatsListWidget.s1().K(iL + i);
                View view2 = lfeVarK2 != null ? lfeVarK2.a : null;
                xu2 xu2Var = view2 instanceof xu2 ? (xu2) view2 : null;
                if (xu2Var == null) {
                    or3Var = null;
                } else {
                    kwb kwbVar2 = xu2Var.a;
                    kwbVar2.getLocationOnScreen(iArr2);
                    iArr2[0] = (kwbVar2.getMeasuredWidth() / 2) + iArr2[0];
                    int measuredHeight = (kwbVar2.getMeasuredHeight() / 2) + iArr2[1];
                    iArr2[1] = measuredHeight;
                    or3Var = new or3(iArr2[0], yl5.d().getDisplayMetrics().density * 28.0f, measuredHeight);
                }
            }
        } else {
            or3Var = null;
        }
        if (or3Var == null) {
            String str2 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "We couldn't find reveal params for chat list", null);
            }
        }
        return or3Var;
    }

    public final iug B1() {
        return (iug) this.D.getValue();
    }

    public final rcc C1() {
        return (rcc) this.w.m(this, B1[1]);
    }

    public final x67 D1() {
        return (x67) this.A.getValue();
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        String string;
        je9 je9Var = je9.d;
        if (i == R.id.oneme_stories_action_write_message) {
            Long lH1 = H1(bundle);
            if (lH1 != null) {
                iug iugVarB1 = B1();
                iugVarB1.n.B(iugVarB1, iug.r[0], yab.h0(iugVarB1.b, ((n0c) iugVarB1.e).a(), 2, new aug(iugVarB1, lH1.longValue(), null, 0)));
                return;
            }
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "chats tabs: stories write clicked, but userId is missing", null);
                return;
            }
            return;
        }
        if (i == R.id.oneme_stories_action_go_to_profile) {
            Long lH2 = H1(bundle);
            if (lH2 != null) {
                a8j.x(B1().o, new xug(lH2.longValue()));
                return;
            }
            String str2 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "chats tabs: stories go to profile, but userId is missing", null);
                return;
            }
            return;
        }
        if (i != R.id.oneme_stories_action_hide_author) {
            if (bundle == null || (string = bundle.getString("folder_id")) == null) {
                return;
            }
            if (i == R.id.chats_list_folder_edit) {
                zm3.b.n(string);
                return;
            }
            if (i == R.id.chats_list_folder_delete) {
                G1(string);
                return;
            } else {
                if (i == R.id.chats_list_folder_read) {
                    x67 x67VarD1 = D1();
                    yab.i0(x67VarD1.b, ((n0c) x67VarD1.c).a(), 0, new r67(x67VarD1, string, null, 1), 2);
                    return;
                }
                return;
            }
        }
        Long lH3 = H1(bundle);
        if (lH3 != null) {
            iug iugVarB2 = B1();
            long jLongValue = lH3.longValue();
            boolean zB = ((nv7) iugVarB2.i.getValue()).b(jLongValue);
            a8j.t(iugVarB2, ((n0c) iugVarB2.e).a(), new ztg(iugVarB2, jLongValue, zB, null, 0), 2);
            a8j.x(iugVarB2.p, new grg(new tnh(zB ? R.string.stories_author_unhidden_snackbar : R.string.stories_author_hidden_snackbar), new vud(iugVarB2, jLongValue, zB, 2)));
            return;
        }
        String str3 = this.g;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, "chats tabs: stories hide author clicked, but userId is missing", null);
        }
    }

    public final boolean E1() {
        return ((Boolean) y1().B().i()).booleanValue();
    }

    public final void F1(rcc rccVar, boolean z) {
        try {
            x2i.c.remove(rccVar);
            ArrayList arrayList = (ArrayList) x2i.b().get(rccVar);
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((r2i) arrayList2.get(size)).o(rccVar);
            }
        } catch (NullPointerException e) {
            e = e;
            if (!z) {
                e = new IssueKeyException("48467", "NPE when toolbar end transitions", e);
            }
            gm0.V(this.g, e.getMessage(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [br4] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void G1(String str) {
        Object next;
        CharSequence charSequence;
        Iterator it = ((Iterable) D1().n.a.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((q37) next).a, str));
        q37 q37Var = (q37) next;
        if (q37Var == null || (charSequence = q37Var.b) == null) {
            String str2 = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qv1.k("no folder found for ", str), null);
                return;
            }
            return;
        }
        q37 q37Var2 = (q37) ww3.u1(w1().getCurrentItem(), (List) D1().n.a.getValue());
        boolean zD = cqk.d(q37Var2 != null ? q37Var2.a : null, str);
        this.j = str;
        this.k = zD;
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarA = mol.a(new vnh(R.string.chats_list_delete_folder_sheet_title, a.n1(new Object[]{charSequence})), n1g.i(new ylc("folder_id", str), new ylc("key_is_active_folder_delete", Boolean.valueOf(zD))), null, 4);
        jc4VarA.g(new tnh(R.string.chats_list_delete_folder_sheet_description));
        jc4VarA.a(new kc4(R.id.chats_list_folder_delete_confirm, new tnh(R.string.chats_list_delete_folder_sheet_action_delete), 1, 56));
        jc4VarA.a(new kc4(R.id.oneme_confirmation_sheet_cancel, new tnh(R.string.cancel), 2, 56));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(this);
        confirmationBottomSheetF.setTargetController(this);
        ?? parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    public final void I1() {
        lm3 lm3Var = (lm3) s1().d.a.getValue();
        Integer numValueOf = lm3Var != null ? Integer.valueOf(lm3Var.a) : null;
        boolean z = false;
        boolean z2 = numValueOf != null && numValueOf.intValue() > 0;
        iug iugVarB1 = B1();
        if (cqk.d(this.z1, du7.c) && !z2) {
            z = true;
        }
        qt4.C(z, iugVarB1.l.g, null);
    }

    public final void J1(pqg pqgVar) {
        q1().setVisibility(!cqk.d(this.z1, du7.c) && (pqgVar == null || (pqgVar != pqg.a && pqgVar != pqg.b && pqgVar != pqg.f)) ? 8 : 0);
    }

    @Override // defpackage.p6f
    public final void U0() {
        lve lveVar;
        hve hveVarI = u1().I(w1().getCurrentItem());
        br4 br4Var = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
        p6f p6fVar = br4Var instanceof p6f ? (p6f) br4Var : null;
        if (p6fVar != null) {
            p6fVar.U0();
        }
    }

    @Override // defpackage.hsc
    public final void Y0(boolean z) {
        if (x1().e() && x1().b.a() && !x1().b()) {
            ny8 ny8Var = this.H;
            if (z) {
                ((p96) ny8Var.getValue()).a();
            } else {
                ((p96) ny8Var.getValue()).b();
            }
        }
    }

    @Override // defpackage.pte
    public final void b() {
        if (r1()) {
            ((ea2) this.u.getValue()).c();
        }
        rs2 rs2Var = this.X;
        if (rs2Var != null) {
            rs2Var.b(false);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        String string;
        if (i != R.id.chats_list_folder_delete_confirm) {
            return;
        }
        if ((bundle == null || (string = bundle.getString("folder_id")) == null) && (string = this.j) == null) {
            return;
        }
        boolean z = bundle != null ? bundle.getBoolean("key_is_active_folder_delete") : this.k;
        x67 x67VarD1 = D1();
        yab.i0(x67VarD1.b, ((n0c) x67VarD1.c).a(), 0, new r67(x67VarD1, string, null, 0), 2);
        if (z) {
            a8j.x(s1().e, si3.a);
        }
        this.j = null;
        this.k = false;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getF() {
        return this.a;
    }

    @Override // defpackage.chd
    public final xu2 i0(long j) {
        lve lveVar;
        hve hveVarI = u1().I(w1().getCurrentItem());
        br4 br4Var = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
        ChatsListWidget chatsListWidget = br4Var instanceof ChatsListWidget ? (ChatsListWidget) br4Var : null;
        if (chatsListWidget != null) {
            return chatsListWidget.p1(j);
        }
        return null;
    }

    @Override // defpackage.pte
    public final void k0() {
        if (r1()) {
            ((ea2) this.u.getValue()).h();
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        int i;
        super.onAttach(view);
        if (((Boolean) y1().B().i()).booleanValue()) {
            B1().m.a(sbi.a);
        }
        rm8 rm8Var = (rm8) this.v.getValue();
        s7f s7fVar = (s7f) rm8Var.a();
        gvb gvbVar = s7fVar.I;
        zv8[] zv8VarArr = s7f.j0;
        if (((Boolean) gvbVar.m(s7fVar, zv8VarArr[31])).booleanValue()) {
            return;
        }
        int[] iArrS1 = ww3.S1((Collection) ((g5d) ((gjf) rm8Var.a.getValue())).a.z0.a(e5d.S6[76]).i());
        s7f s7fVar2 = (s7f) rm8Var.a();
        int iIntValue = ((Number) s7fVar2.J.m(s7fVar2, zv8VarArr[32])).intValue();
        s7f s7fVar3 = (s7f) rm8Var.a();
        long jLongValue = ((Number) s7fVar3.K.m(s7fVar3, zv8VarArr[33])).longValue();
        long jL = ((s7f) rm8Var.a()).l();
        if (jLongValue < 0) {
            jLongValue = jL;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iArrS1.length > iIntValue && (i = iArrS1[iIntValue]) >= 0) {
            ghb ghbVar = ew5.b;
            if (ew5.g(qe7.O(i, lw5.DAYS)) + jLongValue >= jCurrentTimeMillis) {
                return;
            }
            s7f s7fVar4 = (s7f) rm8Var.a();
            s7fVar4.J.B(s7fVar4, zv8VarArr[32], Integer.valueOf(iIntValue + 1));
            s7f s7fVar5 = (s7f) rm8Var.a();
            s7fVar5.K.B(s7fVar5, zv8VarArr[33], Long.valueOf(jCurrentTimeMillis));
            ((sm8) rm8Var.c.getValue()).c();
            rl8.b.j();
        }
    }

    @Override // defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        if (hr4Var.b && !r1()) {
            if (!D1().s && !x1().b.a()) {
                D1().s = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    wsc wscVarX1 = x1();
                    svj svjVar = new svj(this, 1);
                    wscVarX1.getClass();
                    svjVar.a(wsc.q, 180, R.string.permission_fsi_request, R.string.permission_fsi_request_rationale, R.string.permissions_fsi_request_positive_button, new jsc(R.drawable.calls_avd));
                }
            } else if (!x1().e()) {
                ny8 ny8Var = this.m;
                s7f s7fVar = (s7f) ((et3) ny8Var.getValue());
                gvb gvbVar = s7fVar.H;
                zv8[] zv8VarArr = s7f.j0;
                if (!((Boolean) gvbVar.m(s7fVar, zv8VarArr[30])).booleanValue()) {
                    s7f s7fVar2 = (s7f) ((et3) ny8Var.getValue());
                    s7fVar2.H.B(s7fVar2, zv8VarArr[30], Boolean.TRUE);
                    x1().j(new svj(this, 1), false);
                }
            }
        }
        if (hr4Var == hr4.e) {
            a8j.x(s1().e, si3.a);
            t1().B();
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!E1()) {
            wf4 wf4Var = new wf4(layoutInflater.getContext());
            wf4Var.setId(R.id.chats_list_folders_container);
            vd7.M(wf4Var, false);
            vd7.u(wf4Var, false);
            vd7.I(wf4Var, false);
            y8j y8jVar = new y8j(wf4Var.getContext());
            y8jVar.setId(R.id.chats_list_folders_pager);
            uf4 uf4Var = new uf4(0, 0);
            uf4Var.I = 1.0f;
            uf4Var.j = R.id.chats_list_pinbars_view;
            uf4Var.l = 0;
            uf4Var.e = 0;
            uf4Var.h = 0;
            y8jVar.setLayoutParams(uf4Var);
            lvb.m0(y8jVar);
            wf4Var.addView(y8jVar);
            return wf4Var;
        }
        Context context = layoutInflater.getContext();
        int iB = zo5.b(16.0f, yl5.d().getDisplayMetrics().density, this.t1);
        ko3 ko3Var = new ko3(this);
        ho3 ho3Var = new ho3(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipChildren(false);
        View orgVar = new org(this.s1, iB, context);
        orgVar.setId(R.id.chats_list_stories_group_layout);
        orgVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        orgVar.setElevation(10.0f);
        frameLayout.addView(orgVar);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setId(R.id.chats_list_folders_container);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        vd7.M(linearLayout, true);
        fo3 fo3Var = new fo3(this.F, ko3Var, ho3Var, 1);
        et4 et4Var = new et4(linearLayout.getContext());
        et4Var.setLayoutParams(new bt4(-1, -1));
        et4Var.setClipChildren(false);
        fo3Var.invoke(et4Var);
        linearLayout.addView(et4Var);
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("ONEME-6453|chats_list_lf | tabs view destroy. Scope isActive: ", cqk.x(getLifecycleScope())), null);
            }
        }
        rs2 rs2Var = this.X;
        if (rs2Var != null) {
            rs2Var.b(false);
        }
        this.X = null;
        if (E1()) {
            A1().setPager(null);
            StoriesAppBarBehavior storiesAppBarBehaviorZ1 = z1();
            if (storiesAppBarBehaviorZ1 != null) {
                storiesAppBarBehaviorZ1.o = null;
                storiesAppBarBehaviorZ1.t = null;
                org orgVar = storiesAppBarBehaviorZ1.u;
                if (orgVar != null) {
                    orgVar.setOnCollapsedClickListener(null);
                }
                storiesAppBarBehaviorZ1.u = null;
                storiesAppBarBehaviorZ1.v = null;
                storiesAppBarBehaviorZ1.p = null;
                rq rqVar = storiesAppBarBehaviorZ1.s;
                if (rqVar != null) {
                    rqVar.f(storiesAppBarBehaviorZ1);
                }
                storiesAppBarBehaviorZ1.s = null;
                storiesAppBarBehaviorZ1.B = null;
                storiesAppBarBehaviorZ1.C = 0.0f;
                mjg mjgVar = storiesAppBarBehaviorZ1.w;
                pqg pqgVar = pqg.a;
                mjgVar.getClass();
                mjgVar.j(null, pqgVar);
                storiesAppBarBehaviorZ1.y = 0.0f;
                storiesAppBarBehaviorZ1.z = false;
                storiesAppBarBehaviorZ1.A = true;
                storiesAppBarBehaviorZ1.G = false;
                storiesAppBarBehaviorZ1.E = null;
                storiesAppBarBehaviorZ1.F = true;
            }
        }
        if (((Boolean) y1().x6.a(e5d.S6[389]).i()).booleanValue()) {
            br4 parentController = this;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                hveVarU1.M((lo3) this.A1.getValue());
            }
        }
        qz4 qz4Var = this.J;
        if (qz4Var != null) {
            qz4Var.c();
        }
        this.J = null;
        F1(C1(), true);
        C1().a();
        t1().B();
        qp4 qp4Var = this.h;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        this.h = null;
        g8c g8cVar = this.s;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.s = null;
        qp4 qp4Var2 = this.i;
        if (qp4Var2 != null) {
            qp4Var2.dismiss();
        }
        this.i = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (r1()) {
            ((ea2) this.u.getValue()).e(i);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        D1().B(bundle2.getString("folder_id"));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        mjg mjgVar;
        u03 u03Var = (u03) this.r.getValue();
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("ONEME-6453|chats_list_lf | tabs view created. Scope isActive: ", cqk.x(getLifecycleScope())), null);
            }
        }
        requireActivity().d().a(getViewLifecycleOwner(), this.d);
        w1().setAdapter(u1());
        n57 n57VarU1 = u1();
        n57VarU1.g = 0;
        while (n57VarU1.e.i() > n57VarU1.g) {
            n57VarU1.e.h(((Number) n57VarU1.f.remove(0)).longValue());
        }
        w1().setOffscreenPageLimit(this.n1);
        qz4 qz4VarA = this.Y.a(v1(), w1(), new kl3(2, this), new bp(2, this, ChatsTabWidget.class, "handleLongClickOnFolderTab", "handleLongClickOnFolderTab(Landroid/view/View;Lone/me/common/tablayout/model/OneMeBaseTabItemModel;)V", 0, 5), new oo3(1, this, ChatsTabWidget.class, "showDeleteFolderConfirmation", "showDeleteFolderConfirmation(Ljava/lang/String;)V", 0, 0));
        qz4VarA.a();
        this.J = qz4VarA;
        if (((Boolean) y1().x6.a(e5d.S6[389]).i()).booleanValue()) {
            this.X = new rs2(this.Y, v1(), (ViewGroup) view, (ps2) this.K.getValue(), this.e.getAccessor().d(738), this.e.getAccessor().d(157), getViewLifecycleScope(), getViewLifecycleOwner());
            br4 parentController = this;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                hveVarU1.a((lo3) this.A1.getValue());
            }
        }
        r8e r8eVar = D1().n;
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 8), 3), getViewLifecycleScope());
        y8j y8jVarW1 = w1();
        View childAt = y8jVarW1.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        y8jVarW1.e(new so3(0, this));
        if (u1().s.size() > 0) {
            ((wxb) this.q.getValue()).getClass();
            y8jVarW1.measure(View.MeasureSpec.makeMeasureSpec(y8jVarW1.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(y8jVarW1.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
            if (u1().s.size() > 1) {
                p1(this, 1);
                u1().L(0);
            }
        }
        hve childRouter = getChildRouter((ViewGroup) this.z.m(this, B1[4]));
        childRouter.e = 1;
        childRouter.S(false);
        if (!childRouter.o()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget(szc.a, this.a.b());
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.T(oc9.e(pinBarsWidget, null, null));
        }
        view.addOnAttachStateChangeListener(new po3(0, this));
        D1().B(getArgs().getString("folder_id"));
        r8e r8eVar2 = D1().p;
        n09 n09Var2 = n09.e;
        e9i.j0(new fz6(n1g.v(r8eVar2, getViewLifecycleOwner().f(), n09Var2), new io3((lq4) null, this, 9), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(s1().d, 13), getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 10), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(t1().f, 8), getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 11), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(D1().q, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 12), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((ah3) this.C.getValue()).f, getViewLifecycleOwner().f(), n09Var2), new o83(null, this, view), 3), getViewLifecycleScope());
        if (E1()) {
            StoriesAppBarBehavior storiesAppBarBehaviorZ1 = z1();
            if (storiesAppBarBehaviorZ1 != null) {
                k96 k96VarA1 = A1();
                org orgVarQ1 = q1();
                rcc rccVarC1 = C1();
                t3a t3aVar = new t3a(this);
                storiesAppBarBehaviorZ1.t = k96VarA1;
                storiesAppBarBehaviorZ1.u = orgVarQ1;
                storiesAppBarBehaviorZ1.v = rccVarC1;
                storiesAppBarBehaviorZ1.p = t3aVar;
                orgVarQ1.setOnCollapsedClickListener(new xlf(3, storiesAppBarBehaviorZ1));
            }
            StoriesAppBarBehavior storiesAppBarBehaviorZ2 = z1();
            if (storiesAppBarBehaviorZ2 != null) {
                storiesAppBarBehaviorZ2.E = new mo3(this, 0);
            }
            e9i.j0(new fz6(n1g.v(B1().l.i, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 13), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(new r07(B1().l.d, y1().O4.a(e5d.S6[302]).h(), new no3(3, null, 0), 0), getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 14), 3), getViewLifecycleScope());
            StoriesAppBarBehavior storiesAppBarBehaviorZ3 = z1();
            if (storiesAppBarBehaviorZ3 != null && (mjgVar = storiesAppBarBehaviorZ3.x) != null) {
                e9i.j0(new fz6(n1g.v(mjgVar, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 15), 3), getViewLifecycleScope());
            }
            k96 k96VarA2 = A1();
            k96VarA2.setPager(new p3c(6, this));
            k96VarA2.setThreshold(4);
            k96VarA2.setIgnoreRefreshingFlagsForScrollEvent(true);
            e9i.j0(new fz6(n1g.v(B1().B().i, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 3), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(B1().o, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 4), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(B1().p, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 5), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(((b0h) this.p.getValue()).b, getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 6), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(new jz(((jvg) this.E.getValue()).j, 7), getViewLifecycleOwner().f(), n09Var), new io3((lq4) null, this, 7), 3), getViewLifecycleScope());
        }
        String str2 = u03Var.g;
        owh owhVar = str2 != null ? new owh(str2) : null;
        String str3 = owhVar != null ? owhVar.a : null;
        if (str3 != null) {
            qrc.k(u03.i, "chats_tab_created", 2, str3, false, null, null, 120);
            return;
        }
        String str4 = u03Var.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str4, "Invoked 'onChatsTabCreated', but traceId is null or empty!", null);
        }
    }

    public final org q1() {
        return (org) this.r1.m(this, B1[7]);
    }

    public final boolean r1() {
        return ((Number) y1().h().i()).longValue() > 0;
    }

    public final vi3 s1() {
        return (vi3) this.b.getValue();
    }

    public final km3 t1() {
        return (km3) this.c.getValue();
    }

    @Override // defpackage.obb
    public final lmc u0() {
        return new lmc(null, 0, rdg.FOLDER_ID, Long.valueOf(w1().getCurrentItem() == 0 ? 1L : 2L), null, null, 115);
    }

    public final n57 u1() {
        return (n57) this.o1.getValue();
    }

    public final aac v1() {
        return (aac) this.x.m(this, B1[2]);
    }

    public final y8j w1() {
        return (y8j) this.y.m(this, B1[3]);
    }

    public final wsc x1() {
        return (wsc) this.l.getValue();
    }

    public final e5d y1() {
        return (e5d) this.o.getValue();
    }

    public final StoriesAppBarBehavior z1() {
        if (getView() != null) {
            ViewGroup.LayoutParams layoutParams = ((rq) this.p1.m(this, B1[5])).getLayoutParams();
            bt4 bt4Var = layoutParams instanceof bt4 ? (bt4) layoutParams : null;
            ys4 ys4Var = bt4Var != null ? bt4Var.a : null;
            if (ys4Var instanceof StoriesAppBarBehavior) {
                return (StoriesAppBarBehavior) ys4Var;
            }
        }
        return null;
    }

    public ChatsTabWidget(String str, ha9 ha9Var, t3f t3fVar) {
        this(n1g.i(new ylc("folder_id", str), new ylc(Widget.ARG_SCOPE_ID, new t3f(null, ha9Var, 1)), new ylc("chats_tab_parent_scope_id", t3fVar)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChatsTabWidget(String str, ha9 ha9Var, t3f t3fVar, int i, j95 j95Var) {
        if ((i & 4) != 0) {
            Parcelable.Creator<t3f> creator = t3f.CREATOR;
            t3fVar = t3f.d;
        }
        this(str, ha9Var, t3fVar);
    }
}
