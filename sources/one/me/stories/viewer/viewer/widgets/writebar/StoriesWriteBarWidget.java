package one.me.stories.viewer.viewer.widgets.writebar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a8g;
import defpackage.awg;
import defpackage.bd1;
import defpackage.br4;
import defpackage.ch3;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.e30;
import defpackage.e9i;
import defpackage.ec6;
import defpackage.ez9;
import defpackage.fz6;
import defpackage.gb3;
import defpackage.hn9;
import defpackage.hve;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jyf;
import defpackage.jz;
import defpackage.kbc;
import defpackage.kz9;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.m5b;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nma;
import defpackage.np0;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.p90;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.qbe;
import defpackage.r8e;
import defpackage.sa3;
import defpackage.t2g;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.uw8;
import defpackage.v09;
import defpackage.vv;
import defpackage.vvg;
import defpackage.w2e;
import defpackage.wka;
import defpackage.wtc;
import defpackage.x9h;
import defpackage.xvg;
import defpackage.xx6;
import defpackage.yka;
import defpackage.ylc;
import defpackage.yvg;
import defpackage.zfe;
import defpackage.zka;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/stories/viewer/viewer/widgets/writebar/StoriesWriteBarWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScopeId", "(Lt3f;)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoriesWriteBarWidget extends Widget {
    public static final /* synthetic */ zv8[] n = {new dwd(StoriesWriteBarWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, StoriesWriteBarWidget.class, "messageWriteContainer", "getMessageWriteContainer()Lcom/bluelinelabs/conductor/Router;", 0), new dwd(StoriesWriteBarWidget.class, "messageWriteContainerView", "getMessageWriteContainerView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(StoriesWriteBarWidget.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(StoriesWriteBarWidget.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), new dwd(StoriesWriteBarWidget.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0)};
    public final t3f a;
    public final wtc b;
    public final dj9 c;
    public final ny8 d;
    public final xvg e;
    public final ny8 f;
    public final ny8 g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public kz9 l;
    public final j8e m;

    public StoriesWriteBarWidget(Bundle bundle) {
        super(bundle);
        this.a = new t3f("StoriesScreen", super.getA().b());
        this.b = new wtc(m35getAccountScopeuqN4xOY());
        this.c = new dj9();
        this.d = createViewModelLazy(nma.class, new t2g(11, new xvg(this, 0)));
        this.e = new xvg(this, 2);
        vv vvVar = new vv("stories.parent.writebar", t3f.class);
        zv8 zv8Var = n[0];
        this.f = getSharedViewModel((t3f) vvVar.a(this), vvg.class, null);
        this.g = createViewModelLazy(ez9.class, new t2g(12, new xvg(this, 3)));
        this.h = Widget.childRouter$default(this, R.id.oneme_stories_viewer_writebar_container, null, 2, null);
        this.i = viewBinding(R.id.oneme_stories_viewer_writebar_container);
        this.j = viewBinding(R.id.oneme_stories_viewer_keyboard_container);
        this.k = Widget.childRouter$default(this, R.id.oneme_stories_viewer_keyboard_container, null, 2, null);
        this.m = viewBinding(R.id.oneme_stories_viewer_writebar_widget_container);
        createViewModelLazy(x9h.class, new t2g(13, new xvg(this, 4)));
        createViewModelLazy(hn9.class, new t2g(14, new yvg(1)));
        createViewModelLazy(qbe.class, new t2g(15, new yvg(2)));
        createViewModelLazy(m5b.class, new t2g(16, new yvg(3)));
    }

    public static final void o1(StoriesWriteBarWidget storiesWriteBarWidget, wka wkaVar) {
        kz9 kz9Var;
        View view;
        if (storiesWriteBarWidget.getView() != null) {
            if (!wkaVar.a) {
                kz9 kz9Var2 = storiesWriteBarWidget.l;
                if (kz9Var2 == null || !kz9Var2.j() || (kz9Var = storiesWriteBarWidget.l) == null) {
                    return;
                }
                kz9Var.d(new gb3(wkaVar, 6, storiesWriteBarWidget));
                return;
            }
            MessageWriteWidget messageWriteWidgetT1 = storiesWriteBarWidget.t1();
            int i = 0;
            int measuredHeight = (messageWriteWidgetT1 == null || (view = messageWriteWidgetT1.getView()) == null) ? 0 : view.getMeasuredHeight();
            br4 parentController = storiesWriteBarWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            if (rootController != null) {
                ViewGroup.LayoutParams layoutParams = rootController.v1().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.topMargin;
                }
            }
            int i2 = i + measuredHeight;
            kz9 kz9Var3 = storiesWriteBarWidget.l;
            if (kz9Var3 != null) {
                kz9Var3.f(i2);
            }
        }
    }

    public static final void p1(StoriesWriteBarWidget storiesWriteBarWidget) {
        if (storiesWriteBarWidget.getView() != null) {
            MessageWriteWidget messageWriteWidgetT1 = storiesWriteBarWidget.t1();
            if (messageWriteWidgetT1 != null && messageWriteWidgetT1.getView() != null) {
                messageWriteWidgetT1.t1().setTransparent(true);
            }
            MessageWriteWidget messageWriteWidgetT2 = storiesWriteBarWidget.t1();
            if (messageWriteWidgetT2 == null || messageWriteWidgetT2.getView() == null) {
                return;
            }
            messageWriteWidgetT2.t1().setDisallowParentInterceptTouchEvent(false);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getA() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(R.id.oneme_stories_viewer_writebar_widget_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tp2 tp2VarA = oc9.a(frameLayout.getContext());
        tp2VarA.setId(R.id.oneme_stories_viewer_writebar_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        tp2VarA.setLayoutParams(layoutParams);
        q1(tp2VarA);
        frameLayout.addView(tp2VarA);
        View viewA = oc9.a(frameLayout.getContext());
        viewA.setId(R.id.oneme_stories_viewer_keyboard_container);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        viewA.setLayoutParams(layoutParams2);
        int i = uw8.a;
        viewA.setTranslationY(uw8.a(viewA.getContext()));
        lvb.H(viewA, new oi8(0, 0, 0, new j11(5, 1, true), 7), new ptf(12, this));
        frameLayout.addView(viewA);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        xx6 xx6VarA;
        zka zkaVar;
        zv8[] zv8VarArr = n;
        int i = 1;
        zv8 zv8Var = zv8VarArr[1];
        j8e j8eVar = this.h;
        boolean zO = ((hve) j8eVar.m(this, zv8Var)).o();
        a8g a8gVar = pq3.j;
        if (zO) {
            MessageWriteWidget messageWriteWidgetT1 = t1();
            if (messageWriteWidgetT1 != null) {
                kbc kbcVar = a8gVar.e(getContext()).j().b;
                messageWriteWidgetT1.G = kbcVar;
                if (messageWriteWidgetT1.getView() != null) {
                    messageWriteWidgetT1.t1().setCustomTheme(kbcVar);
                }
            }
        } else {
            hve hveVar = (hve) j8eVar.m(this, zv8VarArr[1]);
            t3f t3fVar = this.a;
            MessageWriteWidget messageWriteWidget = new MessageWriteWidget(t3fVar, t3fVar.b());
            kbc kbcVar2 = a8gVar.e(getContext()).j().b;
            messageWriteWidget.G = kbcVar2;
            if (messageWriteWidget.getView() != null) {
                messageWriteWidget.t1().setCustomTheme(kbcVar2);
            }
            lve lveVar = new lve(messageWriteWidget, null, null, null, false, -1);
            lveVar.e("stories.writebar.input");
            hveVar.T(lveVar);
        }
        ic6 ic6Var = u1().o;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i2 = 4;
        int i3 = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new awg(null, this, 4), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().y, getViewLifecycleOwner().f(), n09Var), new jyf(lq4Var, this, view, 8), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(u1().p, getViewLifecycleOwner().f(), n09Var), new awg(null, this, 5), i3), getViewLifecycleScope());
        hve hveVar2 = (hve) this.k.m(this, zv8VarArr[4]);
        tp2 tp2Var = (tp2) this.j.m(this, zv8VarArr[3]);
        tp2 tp2VarR1 = r1();
        boolean zA = ch3.o(getContext()).a();
        v09 viewLifecycleScope = getViewLifecycleScope();
        ec6 ec6Var = (ec6) s1().A.a.getValue();
        boolean z = ((ec6Var == null || (zkaVar = (zka) ec6Var.a) == null) ? null : zkaVar.a) == yka.b;
        ny8 ny8Var = this.g;
        this.l = new kz9(hveVar2, tp2Var, tp2VarR1, new xvg(this, 5), zA, viewLifecycleScope, z, new sa3(0, (ez9) ny8Var.getValue()), new w2e(i, this), new xvg(this, 1), np0.n);
        e9i.j0(new fz6(n1g.v(((ez9) ny8Var.getValue()).j, getViewLifecycleOwner().f(), n09Var), new awg(null, this, 0), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(((ez9) ny8Var.getValue()).h, 13), getViewLifecycleOwner().f(), n09Var), new awg(null, this, 1), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((ez9) ny8Var.getValue()).f, getViewLifecycleOwner().f(), n09Var), new awg(null, this, 2), i3), getViewLifecycleScope());
        r8e r8eVar = s1().C;
        e9i.j0(new e30(new fz6(new jz(r8eVar, 13), new jyf(r8eVar, (lq4) null, this), i3), 9), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(s1().A, 13), getViewLifecycleOwner().f(), n09Var), new awg(null, this, 3), i3), getViewLifecycleScope());
        MessageWriteWidget messageWriteWidgetT2 = t1();
        if (messageWriteWidgetT2 == null || (xx6VarA = messageWriteWidgetT2.z) == null) {
            xx6VarA = p90.a(Boolean.FALSE);
        }
        e9i.j0(new fz6(n1g.v(e9i.C(s1().A, uw8.f, xx6VarA, new bd1(i2, lq4Var, i3)), getViewLifecycleOwner().f(), n09Var), new awg(null, this, 6), i3), getViewLifecycleScope());
    }

    public final void q1(tp2 tp2Var) {
        lvb.H(tp2Var, new oi8(0, 0, 0, new j11(4, ch3.o(getContext()).a() ? 2 : 3, true), 7), null);
    }

    public final tp2 r1() {
        return (tp2) this.i.m(this, n[2]);
    }

    public final nma s1() {
        return (nma) this.d.getValue();
    }

    public final MessageWriteWidget t1() {
        br4 br4VarG = ((hve) this.h.m(this, n[1])).g("stories.writebar.input");
        if (br4VarG instanceof MessageWriteWidget) {
            return (MessageWriteWidget) br4VarG;
        }
        return null;
    }

    public final vvg u1() {
        return (vvg) this.f.getValue();
    }

    public StoriesWriteBarWidget(t3f t3fVar) {
        this(n1g.i(new ylc("stories.parent.writebar", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
