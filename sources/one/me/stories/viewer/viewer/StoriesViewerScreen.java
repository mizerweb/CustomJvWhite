package one.me.stories.viewer.viewer;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.af7;
import defpackage.ahc;
import defpackage.b0h;
import defpackage.bpg;
import defpackage.bvg;
import defpackage.c9;
import defpackage.chf;
import defpackage.cvg;
import defpackage.dvg;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ev;
import defpackage.evg;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.ha9;
import defpackage.hr4;
import defpackage.i19;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jvg;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.m3h;
import defpackage.meh;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nbh;
import defpackage.nvh;
import defpackage.ny8;
import defpackage.o3h;
import defpackage.oi8;
import defpackage.ptf;
import defpackage.pug;
import defpackage.qrc;
import defpackage.qug;
import defpackage.r3h;
import defpackage.r8e;
import defpackage.rug;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.t3h;
import defpackage.tre;
import defpackage.tug;
import defpackage.vt3;
import defpackage.vv;
import defpackage.wtc;
import defpackage.ww3;
import defpackage.wy7;
import defpackage.xw3;
import defpackage.y8j;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/stories/viewer/viewer/StoriesViewerScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScopeId", "Ltug;", "viewerMode", "Lha9;", "localAccountId", "(Lt3f;Ltug;Lha9;)V", "a", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoriesViewerScreen extends SwipeWidget implements z4f {
    public static final /* synthetic */ zv8[] t = {new dwd(StoriesViewerScreen.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, StoriesViewerScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final oi8 d;
    public final t3f e;
    public final String f;
    public final vv g;
    public final ny8 h;
    public final wtc i;
    public final ny8 j;
    public final t3h k;
    public final ny8 l;
    public final j8e m;
    public final bvg n;
    public ValueAnimator o;
    public g8c p;
    public g8c q;
    public final vt3 r;
    public final int s;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/stories/viewer/viewer/StoriesViewerScreen$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "", "bundleDump", "classLoadersDump", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(Throwable th, String str, String str2) {
            super("71268", nbh.w("viewerMode parcelable exception. Dump: ", str, ". ClassLoaders: ", str2, "."), th);
        }
    }

    public StoriesViewerScreen(Bundle bundle) {
        super(bundle);
        this.d = new oi8(0, 3, 0, null, 13);
        t3f t3fVar = new t3f("viewer_scope", super.getE().b());
        this.e = t3fVar;
        this.f = StoriesViewerScreen.class.getName();
        vv vvVar = new vv("parent_scope", t3f.class);
        this.g = vvVar;
        this.h = rx8.P(3, new af7() { // from class: one.me.stories.viewer.viewer.a
            @Override // defpackage.af7
            public final Object invoke() {
                tug tugVar;
                StoriesViewerScreen storiesViewerScreen = this.a;
                zv8[] zv8VarArr = StoriesViewerScreen.t;
                try {
                    tugVar = (tug) ((Parcelable) tre.f0(storiesViewerScreen.getArgs(), "viewer_mode", tug.class));
                } catch (Throwable th) {
                    String str = storiesViewerScreen.f;
                    Bundle args = storiesViewerScreen.getArgs();
                    String strZ1 = ww3.z1(args.keySet(), null, "{", "}", new ptf(11, args), 25);
                    ClassLoader classLoader = args.getClassLoader();
                    Class<?> cls = classLoader != null ? classLoader.getClass() : null;
                    StoriesViewerScreen.a aVar = new StoriesViewerScreen.a(th, strZ1 + "{classLoader=" + cls + "@" + System.identityHashCode(args.getClassLoader()) + "}", ww3.z1(xw3.P0(new ylc(tug.class, "StoriesViewerMode"), new ylc(pug.class, "All"), new ylc(qug.class, "SingleOwner"), new ylc(rug.class, "SingleStory")), null, "{", "}", new chf(22), 25));
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.g;
                        String message = aVar.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        a4c.f(a4cVar, je9Var, str, message, null, aVar, 8);
                    }
                    tugVar = null;
                }
                return tugVar == null ? new pug() : tugVar;
            }
        });
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.i = wtcVar;
        this.j = wtcVar.getAccessor().d(280);
        this.k = (t3h) wtcVar.getAccessor().c(953);
        this.l = rx8.P(3, new cvg(this, 0));
        this.m = viewBinding(R.id.oneme_stories_viewer_view_pager);
        zv8 zv8Var = t[0];
        t3f t3fVar2 = (t3f) vvVar.a(this);
        this.n = new bvg(this, t3fVar2 != null ? t3fVar2 : t3fVar, ((a2c) wtcVar.getAccessor().c(27)).a());
        this.r = new vt3(5, this);
        this.s = 3;
    }

    public static final y8j D1(StoriesViewerScreen storiesViewerScreen) {
        return (y8j) storiesViewerScreen.m.m(storiesViewerScreen, t[1]);
    }

    public final jvg E1() {
        return (jvg) this.l.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getE() {
        return this.e;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        mjg mjgVar = E1().o;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        jvg jvgVarE1 = E1();
        jvgVarE1.c.a = new bpg(1, jvgVarE1);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        if (hr4Var.b) {
            return;
        }
        jvg jvgVarE1 = E1();
        jvgVarE1.e.A(((tug) this.h.getValue()).o(), m3h.LEAVE_SCREEN, null);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        meh mehVar = new meh(layoutInflater.getContext());
        mehVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mehVar.setBackgroundColor(-16777216);
        y8j y8jVar = new y8j(mehVar.getContext());
        y8jVar.setId(R.id.oneme_stories_viewer_view_pager);
        y8jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        y8jVar.setClipToOutline(true);
        y8jVar.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 16.0f));
        y8jVar.setPageTransformer(new ahc(18));
        y8jVar.setOffscreenPageLimit(-1);
        y8jVar.setAdapter(this.n);
        lvb.m0(y8jVar);
        y8jVar.e(new wy7(12, this));
        mehVar.addView(y8jVar);
        return mehVar;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        jvg jvgVarE1 = E1();
        mjg mjgVar = jvgVarE1.i;
        mjgVar.getClass();
        mjgVar.j(null, -1L);
        mjg mjgVar2 = jvgVarE1.k;
        mjgVar2.getClass();
        mjgVar2.j(null, 0);
        mjg mjgVar3 = jvgVarE1.o;
        Boolean bool = Boolean.FALSE;
        mjgVar3.getClass();
        mjgVar3.j(null, bool);
        mjg mjgVar4 = jvgVarE1.g;
        Boolean bool2 = Boolean.TRUE;
        mjgVar4.getClass();
        mjgVar4.j(null, bool2);
        jvgVarE1.c.a = null;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        Activity activity;
        Window window;
        getRouter().M(this.r);
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        view.setKeepScreenOn(false);
        this.q = null;
        if (isBeingDestroyed() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            j(window);
        }
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        getRouter().a(this.r);
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), new ev(19, this));
        }
        r8e r8eVar = E1().w;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 0;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new dvg(lq4Var, this, i), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().l, getViewLifecycleOwner().f(), n09Var), new dvg(lq4Var, this, 1), i2), getViewLifecycleScope());
        int i3 = 2;
        e9i.j0(new fz6(n1g.v(E1().x, getViewLifecycleOwner().f(), n09Var), new c9(i3, lq4Var, 21), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().n, getViewLifecycleOwner().f(), n09Var), new dvg(lq4Var, this, i3), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().p, getViewLifecycleOwner().f(), n09Var), new evg(lq4Var, view, i), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((b0h) this.j.getValue()).b, getViewLifecycleOwner().f(), n09Var), new dvg(lq4Var, this, i2), i2), getViewLifecycleScope());
        t3h t3hVar = this.k;
        r3h r3hVar = (r3h) t3hVar.g.get();
        if (r3hVar instanceof o3h) {
            qrc.k(t3hVar, "story_owners_screen_created", 0, ((o3h) r3hVar).a(), false, null, null, 120);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getS() {
        return this.s;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final boolean s1() {
        return ((Boolean) E1().n.a.getValue()).booleanValue();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(-16777216);
        }
        mjg mjgVar = E1().r;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void u1() {
        mjg mjgVar = E1().r;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(0);
        }
        mjg mjgVar = E1().r;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    public StoriesViewerScreen(t3f t3fVar, tug tugVar, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("parent_scope", t3fVar), new ylc("viewer_mode", tugVar)));
    }
}
