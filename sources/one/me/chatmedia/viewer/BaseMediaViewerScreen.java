package one.me.chatmedia.viewer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import defpackage.a6j;
import defpackage.a8g;
import defpackage.af7;
import defpackage.as0;
import defpackage.c3j;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.g8c;
import defpackage.gr4;
import defpackage.h;
import defpackage.h8c;
import defpackage.hr4;
import defpackage.j8e;
import defpackage.ny8;
import defpackage.o8c;
import defpackage.pgg;
import defpackage.pq3;
import defpackage.qt4;
import defpackage.rx8;
import defpackage.s5a;
import defpackage.sgg;
import defpackage.sr0;
import defpackage.t3f;
import defpackage.t5a;
import defpackage.w8c;
import defpackage.w8g;
import defpackage.wme;
import defpackage.y8j;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatmedia.viewer.BaseMediaViewerScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatmedia/viewer/BaseMediaViewerScreen;", "", "T", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Las0;", "La6j;", "Ls5a;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseMediaViewerScreen<T> extends SwipeWidget implements as0, a6j, s5a {
    public static final /* synthetic */ zv8[] o;
    public final t3f d;
    public final j8e e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public float i;
    public boolean j;
    public sgg k;
    public g8c l;
    public t5a m;
    public final int n;

    static {
        dwd dwdVar = new dwd(BaseMediaViewerScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0);
        zfe.a.getClass();
        o = new zv8[]{dwdVar};
    }

    public BaseMediaViewerScreen(Bundle bundle) {
        super(bundle);
        this.d = new t3f("chatMediaViewer", super.getD().b());
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.e = viewBinding(R.id.oneme_chatmedia_viewer_pager);
        this.f = hVar.getAccessor().d(192);
        final int i = 0;
        this.g = rx8.P(3, new af7(this) { // from class: vr0
            public final /* synthetic */ BaseMediaViewerScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0056  */
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                BaseMediaViewerScreen baseMediaViewerScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = BaseMediaViewerScreen.o;
                        e3j e3jVar = ((w8g) baseMediaViewerScreen.f.getValue()).get();
                        pgg pggVarF1 = baseMediaViewerScreen.F1();
                        if (pggVarF1 != null) {
                            e3jVar.X(pggVarF1);
                        }
                        if (baseMediaViewerScreen.getView() != null) {
                            Object objU1 = ww3.u1(baseMediaViewerScreen.G1().getCurrentItem(), baseMediaViewerScreen.E1().l.f);
                            ky9 ky9Var = objU1 instanceof ky9 ? (ky9) objU1 : null;
                            if (ky9Var != null && ky9Var.e) {
                                e3jVar.b(0.0f);
                            } else if (baseMediaViewerScreen.i < 0.0f) {
                                e3jVar.b(1.0f);
                            }
                        } else if (baseMediaViewerScreen.i < 0.0f && e3jVar.a() == 0.0f) {
                            e3jVar.b(1.0f);
                        }
                        e3jVar.o0(false);
                        e3jVar.q0((c3j) baseMediaViewerScreen.h.getValue());
                        return e3jVar;
                    default:
                        zv8[] zv8VarArr2 = BaseMediaViewerScreen.o;
                        return new wr0(baseMediaViewerScreen, i3);
                }
            }
        });
        final int i2 = 1;
        this.h = rx8.P(3, new af7(this) { // from class: vr0
            public final /* synthetic */ BaseMediaViewerScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0056  */
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                int i4 = 0;
                BaseMediaViewerScreen baseMediaViewerScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = BaseMediaViewerScreen.o;
                        e3j e3jVar = ((w8g) baseMediaViewerScreen.f.getValue()).get();
                        pgg pggVarF1 = baseMediaViewerScreen.F1();
                        if (pggVarF1 != null) {
                            e3jVar.X(pggVarF1);
                        }
                        if (baseMediaViewerScreen.getView() != null) {
                            Object objU1 = ww3.u1(baseMediaViewerScreen.G1().getCurrentItem(), baseMediaViewerScreen.E1().l.f);
                            ky9 ky9Var = objU1 instanceof ky9 ? (ky9) objU1 : null;
                            if (ky9Var != null && ky9Var.e) {
                                e3jVar.b(0.0f);
                            } else if (baseMediaViewerScreen.i < 0.0f) {
                                e3jVar.b(1.0f);
                            }
                        } else if (baseMediaViewerScreen.i < 0.0f && e3jVar.a() == 0.0f) {
                            e3jVar.b(1.0f);
                        }
                        e3jVar.o0(false);
                        e3jVar.q0((c3j) baseMediaViewerScreen.h.getValue());
                        return e3jVar;
                    default:
                        zv8[] zv8VarArr2 = BaseMediaViewerScreen.o;
                        return new wr0(baseMediaViewerScreen, i4);
                }
            }
        });
        this.i = -1.0f;
        this.n = 1;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long B1() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer C1() {
        return Integer.valueOf(pq3.j.k(getContext()).b.b().b);
    }

    public abstract int D1();

    public abstract sr0 E1();

    public pgg F1() {
        return null;
    }

    public final y8j G1() {
        return (y8j) this.e.m(this, o[0]);
    }

    public abstract void H1();

    public abstract void I1();

    public final boolean J1() {
        sgg sggVar;
        return this.g.d() && (sggVar = this.k) != null && sggVar.isActive();
    }

    public abstract void K1();

    public abstract void L1();

    public final void M1(boolean z) {
        g8c g8cVar = this.l;
        if (g8cVar != null) {
            g8cVar.a();
        }
        String string = getContext().getString(z ? R.string.oneme_chatmedia_viewer_load_video_fail : R.string.oneme_chatmedia_viewer_load_photo_fail);
        h8c h8cVar = new h8c(this);
        h8cVar.n(string);
        h8cVar.c(new o8c(0, 0, D1(), 11));
        h8cVar.h(new w8c(R.drawable.icon_warning));
        this.l = h8cVar.p();
    }

    public abstract void N1();

    public final void O1() {
        if (J1()) {
            e3j e3jVarW0 = w0();
            K1();
            e3jVarW0.pause();
            e3jVarW0.H(null);
            e3jVarW0.stop();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getD() {
        return this.d;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.br4
    public final boolean handleBack() {
        g8c g8cVar = this.l;
        if (g8cVar != null) {
            g8cVar.a();
        }
        return super.handleBack();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        if (hr4Var == hr4.f && this.g.d()) {
            K1();
            w0().q((c3j) this.h.getValue());
            wme wmeVar = ((w8g) this.f.getValue()).k;
            if (wmeVar.d()) {
                ((e3j) wmeVar.getValue()).release();
                wmeVar.a();
            }
        }
    }

    @Override // defpackage.br4
    public void onDestroy() {
        super.onDestroy();
        ny8 ny8Var = this.g;
        if (ny8Var.d()) {
            ((w8g) this.f.getValue()).a((e3j) ny8Var.getValue());
        }
    }

    @Override // defpackage.br4
    public void onDestroyView(View view) {
        super.onDestroyView(view);
        this.m = null;
    }

    @Override // defpackage.s5a
    public void p0(int i) {
        int iD = qt4.D(i);
        if (iD != 1 && iD != 2) {
            if (iD != 4) {
                return;
            }
            t5a t5aVar = this.m;
            if (t5aVar != null) {
                t5aVar.d(4);
            }
            L1();
            return;
        }
        e3j e3jVarW0 = w0();
        if (e3jVarW0.d()) {
            e3jVarW0.pause();
            N1();
        } else {
            e3jVarW0.play();
            I1();
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getN() {
        return this.n;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public void t1(float f) {
        Window window;
        Window window2;
        View view = getView();
        a8g a8gVar = pq3.j;
        if (view != null) {
            view.setBackgroundColor(a8gVar.k(getContext()).b.b().b);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(a8gVar.k(getContext()).b.b().b);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(a8gVar.k(getContext()).b.b().b);
    }

    @Override // defpackage.a6j
    public final e3j w0() {
        return (e3j) this.g.getValue();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public void w1(float f) {
        Window window;
        Window window2;
        View view = getView();
        a8g a8gVar = pq3.j;
        if (view != null) {
            a8gVar.k(getContext());
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            a8gVar.k(getContext());
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        a8gVar.k(getContext());
        window.setNavigationBarColor(0);
    }
}
