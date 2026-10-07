package one.me.profile.screens.avatars;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8j;
import defpackage.af7;
import defpackage.ald;
import defpackage.b67;
import defpackage.ba;
import defpackage.ccc;
import defpackage.ck;
import defpackage.ckd;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ed6;
import defpackage.ekd;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.ifh;
import defpackage.ild;
import defpackage.j6c;
import defpackage.j8e;
import defpackage.jkd;
import defpackage.k9d;
import defpackage.kbc;
import defpackage.kkd;
import defpackage.kmd;
import defpackage.ks6;
import defpackage.l6c;
import defpackage.lkd;
import defpackage.lvb;
import defpackage.meh;
import defpackage.mkd;
import defpackage.mxj;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.okd;
import defpackage.ore;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.r6c;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sl1;
import defpackage.sw;
import defpackage.t1c;
import defpackage.tre;
import defpackage.vp4;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.ww3;
import defpackage.wy7;
import defpackage.xhh;
import defpackage.y3f;
import defpackage.y8j;
import defpackage.ybc;
import defpackage.yhf;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zkd;
import defpackage.zo5;
import defpackage.zv8;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarsScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lvp4;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lkmd;", "type", "Lha9;", "localAccountId", "(JLkmd;Lha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileAvatarsScreen extends SwipeWidget implements vp4, z4f {
    public static final /* synthetic */ zv8[] r = {new dwd(ProfileAvatarsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, ProfileAvatarsScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new dwd(ProfileAvatarsScreen.class, "progressIndication", "getProgressIndication()Landroid/view/View;", 0)};
    public final ifh d;
    public final oi8 e;
    public final ks6 f;
    public final wtc g;
    public final int h;
    public final ny8 i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public ViewPropertyAnimator q;

    public ProfileAvatarsScreen(Bundle bundle) {
        super(bundle);
        final int i = 0;
        this.d = new ifh(new af7(this) { // from class: ykd
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                        return pq3.j.k(profileAvatarsScreen.getContext()).b;
                    case 1:
                        zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                        return new okd(profileAvatarsScreen, profileAvatarsScreen.getA().b());
                    case 2:
                        zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                        ar arVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new mxj(arVarRequireActivity.getWindow(), arVarRequireActivity.getWindow().getDecorView());
                    case 3:
                        zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                        Resources resources = profileAvatarsScreen.getResources();
                        if (resources != null) {
                            return resources.getString(R.string.tt_of);
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        zv8[] zv8VarArr5 = ProfileAvatarsScreen.r;
                        return new ccc(1, new fz7(1, this.b, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 18));
                }
            }
        });
        this.e = oi8.e;
        this.f = tre.F(this, y3f.AVATAR_VIEWER);
        this.g = new wtc(m35getAccountScopeuqN4xOY());
        final int i2 = 1;
        this.h = 1;
        final int i3 = 3;
        this.i = createViewModelLazy(ild.class, new hta(20, new k9d(bundle, 3, this)));
        this.j = viewBinding(R.id.profile_contact_avatars_toolbar);
        this.k = viewBinding(R.id.profile_contact_avatars_viewpager);
        this.l = viewBinding(R.id.profile_contact_avatars_progress_indicator);
        this.m = rx8.P(3, new af7(this) { // from class: ykd
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i2;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                        return pq3.j.k(profileAvatarsScreen.getContext()).b;
                    case 1:
                        zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                        return new okd(profileAvatarsScreen, profileAvatarsScreen.getA().b());
                    case 2:
                        zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                        ar arVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new mxj(arVarRequireActivity.getWindow(), arVarRequireActivity.getWindow().getDecorView());
                    case 3:
                        zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                        Resources resources = profileAvatarsScreen.getResources();
                        if (resources != null) {
                            return resources.getString(R.string.tt_of);
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        zv8[] zv8VarArr5 = ProfileAvatarsScreen.r;
                        return new ccc(1, new fz7(1, this.b, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 18));
                }
            }
        });
        final int i4 = 2;
        this.n = rx8.P(3, new af7(this) { // from class: ykd
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                        return pq3.j.k(profileAvatarsScreen.getContext()).b;
                    case 1:
                        zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                        return new okd(profileAvatarsScreen, profileAvatarsScreen.getA().b());
                    case 2:
                        zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                        ar arVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new mxj(arVarRequireActivity.getWindow(), arVarRequireActivity.getWindow().getDecorView());
                    case 3:
                        zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                        Resources resources = profileAvatarsScreen.getResources();
                        if (resources != null) {
                            return resources.getString(R.string.tt_of);
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        zv8[] zv8VarArr5 = ProfileAvatarsScreen.r;
                        return new ccc(1, new fz7(1, this.b, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 18));
                }
            }
        });
        this.o = rx8.P(3, new af7(this) { // from class: ykd
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i3;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                        return pq3.j.k(profileAvatarsScreen.getContext()).b;
                    case 1:
                        zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                        return new okd(profileAvatarsScreen, profileAvatarsScreen.getA().b());
                    case 2:
                        zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                        ar arVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new mxj(arVarRequireActivity.getWindow(), arVarRequireActivity.getWindow().getDecorView());
                    case 3:
                        zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                        Resources resources = profileAvatarsScreen.getResources();
                        if (resources != null) {
                            return resources.getString(R.string.tt_of);
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        zv8[] zv8VarArr5 = ProfileAvatarsScreen.r;
                        return new ccc(1, new fz7(1, this.b, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 18));
                }
            }
        });
        final int i5 = 4;
        this.p = rx8.P(3, new af7(this) { // from class: ykd
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                        return pq3.j.k(profileAvatarsScreen.getContext()).b;
                    case 1:
                        zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                        return new okd(profileAvatarsScreen, profileAvatarsScreen.getA().b());
                    case 2:
                        zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                        ar arVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new mxj(arVarRequireActivity.getWindow(), arVarRequireActivity.getWindow().getDecorView());
                    case 3:
                        zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                        Resources resources = profileAvatarsScreen.getResources();
                        if (resources != null) {
                            return resources.getString(R.string.tt_of);
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        zv8[] zv8VarArr5 = ProfileAvatarsScreen.r;
                        return new ccc(1, new fz7(1, this.b, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 18));
                }
            }
        });
    }

    public static final View D1(ProfileAvatarsScreen profileAvatarsScreen) {
        return (View) profileAvatarsScreen.l.m(profileAvatarsScreen, r[2]);
    }

    public static final void E1(ProfileAvatarsScreen profileAvatarsScreen, mkd mkdVar, int i) {
        profileAvatarsScreen.I1().setRightActions(mkdVar.b ? (ccc) profileAvatarsScreen.p.getValue() : ybc.a);
        lkd lkdVar = mkdVar.a;
        if (lkdVar instanceof kkd) {
            CharSequence charSequenceB = ((kkd) lkdVar).a.b(profileAvatarsScreen.getContext());
            CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
            if (cqk.d(profileAvatarsScreen.I1().getTitle().getText(), charSequence)) {
                return;
            }
            profileAvatarsScreen.I1().setTitle(charSequence);
            return;
        }
        if (!lkdVar.equals(jkd.a)) {
            ore.o();
            return;
        }
        int size = ((okd) profileAvatarsScreen.m.getValue()).m.size();
        if (i < 0 || size <= 0) {
            profileAvatarsScreen.I1().setTitle("");
            return;
        }
        profileAvatarsScreen.I1().setTitle((i + 1) + " " + ((String) profileAvatarsScreen.o.getValue()) + " " + size);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long B1() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer C1() {
        return Integer.valueOf(((kbc) this.d.getValue()).b().b);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        ild ildVarJ1 = J1();
        int currentItem = K1().getCurrentItem();
        ckd ckdVar = (ckd) ww3.u1(currentItem, (List) ildVarJ1.c.b().a.getValue());
        if (ckdVar == null) {
            return;
        }
        try {
            String str = (String) ww3.r1(ckdVar.b);
            ekd ekdVar = (ekd) ww3.u1(i, ekd.i);
            if (ekdVar == null) {
                return;
            }
            a8j.t(ildVarJ1, ((n0c) ((xhh) ildVarJ1.f.getValue())).b(), new b67(ildVarJ1, ekdVar, ckdVar, str, currentItem, null), 2);
        } catch (NoSuchElementException e) {
            ((t1c) ((ed6) ildVarJ1.e.getValue())).a(new IllegalStateException("model.urls.isNotEmpty() == false", e));
        }
    }

    public final void F1(boolean z) {
        if (getView() != null) {
            float f = z ? 1.0f : 0.0f;
            ViewPropertyAnimator viewPropertyAnimator = this.q;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            if (D1(this).getAlpha() == f) {
                return;
            }
            ViewPropertyAnimator listener = D1(this).animate().alpha(f).setDuration(200L).setListener(new zkd(this, z, f, 0));
            this.q = listener;
            if (listener != null) {
                listener.start();
            }
        }
    }

    public final void G1(boolean z) {
        ny8 ny8Var = this.n;
        if (z) {
            ((mxj) ny8Var.getValue()).a(3);
        } else {
            ((mxj) ny8Var.getValue()).a.q(3);
        }
    }

    public final void H1(boolean z) {
        if (getView() != null) {
            if ((I1().getVisibility() == 0) == z) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = I1().animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.alpha(f).setDuration(200L).setListener(new ck(this, z)).start();
        }
    }

    public final rcc I1() {
        return (rcc) this.j.m(this, r[0]);
    }

    public final ild J1() {
        return (ild) this.i.getValue();
    }

    public final y8j K1() {
        return (y8j) this.k.m(this, r[1]);
    }

    @Override // defpackage.z4f
    public final void d(Window window) {
        super.d(window);
        ((mxj) this.n.getValue()).a.b0();
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.f;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        meh mehVar = new meh(getContext());
        mehVar.setId(-1);
        mehVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mehVar.setBackgroundColor(pq3.j.k(layoutInflater.getContext()).b.b().b);
        y8j y8jVar = new y8j(mehVar.getContext());
        y8jVar.setId(R.id.profile_contact_avatars_viewpager);
        y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        y8jVar.setLayoutDirection(0);
        RecyclerView recyclerView = (RecyclerView) yhf.p0(yhf.m0(new sw(4, y8jVar), ba.h));
        if (recyclerView != null) {
            recyclerView.setId(R.id.profile_avatars_viewpager_recycler_view);
        }
        y8jVar.setOffscreenPageLimit(1);
        y8jVar.setAdapter((okd) this.m.getValue());
        mehVar.addView(y8jVar);
        rcc rccVar = new rcc(mehVar.getContext());
        rccVar.setId(R.id.profile_contact_avatars_toolbar);
        ifh ifhVar = this.d;
        rccVar.setCustomTheme((kbc) ifhVar.getValue());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        rccVar.setLayoutParams(layoutParams);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new p7d(5, this)));
        lvb.I(rccVar);
        mehVar.addView(rccVar);
        FrameLayout frameLayout = new FrameLayout(mehVar.getContext());
        frameLayout.setId(R.id.profile_contact_avatars_progress_indicator);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(((kbc) ifhVar.getValue()).h().i);
        r6c r6cVar = new r6c(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        r6cVar.setLayoutParams(layoutParams2);
        r6cVar.setAppearance(j6c.a);
        r6cVar.setSize(l6c.a);
        frameLayout.addView(r6cVar);
        frameLayout.setOnClickListener(new sl1(4));
        frameLayout.setVisibility(8);
        mehVar.addView(frameLayout);
        return mehVar;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        G1(true);
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.q = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        K1().e(new wy7(10, this));
        r8e r8eVarB = J1().c.b();
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVarB, i19VarF, n09Var), new ald(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().h, getViewLifecycleOwner().f(), n09Var), new ald(null, this, 1), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getC1() {
        return this.h;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(((kbc) this.d.getValue()).b().b);
        }
        G1(true);
        H1(true);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void w1(float f) {
        View view = getView();
        if (view != null) {
            ((kbc) this.d.getValue()).h();
            view.setBackgroundColor(0);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        if (getView() != null) {
            I1().setVisibility(8);
            I1().setAlpha(0.0f);
            G1(true);
        }
    }

    public ProfileAvatarsScreen(long j, kmd kmdVar, ha9 ha9Var) {
        this(n1g.i(new ylc("EXTRA_ID", Long.valueOf(j)), new ylc("EXTRA_TYPE", kmdVar.a), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
