package one.me.stories.viewer.viewer.viewsbottomsheet;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.aac;
import defpackage.af7;
import defpackage.c;
import defpackage.c0a;
import defpackage.dwd;
import defpackage.e6c;
import defpackage.e9i;
import defpackage.fwg;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gpi;
import defpackage.h47;
import defpackage.ha9;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.je9;
import defpackage.kbc;
import defpackage.l6c;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.r6c;
import defpackage.t3f;
import defpackage.tre;
import defpackage.u3h;
import defpackage.w11;
import defpackage.w3h;
import defpackage.wtc;
import defpackage.x3h;
import defpackage.xbd;
import defpackage.y8j;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z3h;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/viewer/viewer/viewsbottomsheet/StoryViewsBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "showViews", "(Lt3f;Z)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoryViewsBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] H = {new dwd(StoryViewsBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), zo5.f(zfe.a, StoryViewsBottomSheet.class, "tabLayout", "getTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0), new dwd(StoryViewsBottomSheet.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new dwd(StoryViewsBottomSheet.class, "loadingProgress", "getLoadingProgress()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0)};
    public final j8e A;
    public final j8e B;
    public final j8e C;
    public final j8e D;
    public final ny8 E;
    public final ny8 F;
    public final boolean G;
    public final ExecutorService u;
    public final h47 v;
    public final h47 w;
    public final z3h x;
    public fwg y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r6v1, types: [v3h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [v3h] */
    /* JADX WARN: Type inference failed for: r8v0, types: [v3h] */
    /* JADX WARN: Type inference failed for: r9v0, types: [v3h] */
    public StoryViewsBottomSheet(Bundle bundle) {
        super(bundle);
        ExecutorService executorServiceA = ((a2c) new wtc(m35getAccountScopeuqN4xOY()).getAccessor().c(27)).a();
        this.u = executorServiceA;
        final int i = 0;
        int i2 = 12;
        h47 h47Var = new h47(new u3h(this, 0), executorServiceA, i2);
        this.v = h47Var;
        final int i3 = 1;
        h47 h47Var2 = new h47(new u3h(this, 1), executorServiceA, i2);
        this.w = h47Var2;
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        ha9 ha9VarB = ((t3f) ((Parcelable) objF0)).b();
        ?? r6 = new af7(this) { // from class: v3h
            public final /* synthetic */ StoryViewsBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i;
                lq4 lq4Var = null;
                int i5 = 2;
                StoryViewsBottomSheet storyViewsBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = StoryViewsBottomSheet.H;
                        w11 w11VarF1 = storyViewsBottomSheet.F1();
                        p2h p2hVar = w11VarF1.z;
                        long j = p2hVar.d;
                        Long lValueOf = (p2hVar.c == null || j == 0 || !p2hVar.f.compareAndSet(false, true)) ? null : Long.valueOf(j);
                        if (lValueOf != null) {
                            w11VarF1.x.B(w11VarF1, w11.B[2], yab.h0(w11VarF1.b, ((n0c) ((xhh) w11VarF1.g.getValue())).a(), 2, new t20(w11VarF1, lValueOf, lq4Var, i5)));
                        }
                        return sbi.a;
                    case 1:
                        zv8[] zv8VarArr2 = StoryViewsBottomSheet.H;
                        w11 w11VarF2 = storyViewsBottomSheet.F1();
                        p2h p2hVar2 = w11VarF2.z;
                        long j2 = p2hVar2.e;
                        Long lValueOf2 = (p2hVar2.c == null || j2 == 0 || !p2hVar2.g.compareAndSet(false, true)) ? null : Long.valueOf(j2);
                        if (lValueOf2 != null) {
                            w11VarF2.y.B(w11VarF2, w11.B[3], yab.h0(w11VarF2.b, ((n0c) ((xhh) w11VarF2.g.getValue())).a(), 2, new i26(w11VarF2, lValueOf2, lq4Var, 19)));
                        }
                        return sbi.a;
                    case 2:
                        zv8[] zv8VarArr3 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.d != 0);
                    default:
                        zv8[] zv8VarArr4 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.e != 0);
                }
            }
        };
        ?? r7 = new af7(this) { // from class: v3h
            public final /* synthetic */ StoryViewsBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                lq4 lq4Var = null;
                int i5 = 2;
                StoryViewsBottomSheet storyViewsBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = StoryViewsBottomSheet.H;
                        w11 w11VarF1 = storyViewsBottomSheet.F1();
                        p2h p2hVar = w11VarF1.z;
                        long j = p2hVar.d;
                        Long lValueOf = (p2hVar.c == null || j == 0 || !p2hVar.f.compareAndSet(false, true)) ? null : Long.valueOf(j);
                        if (lValueOf != null) {
                            w11VarF1.x.B(w11VarF1, w11.B[2], yab.h0(w11VarF1.b, ((n0c) ((xhh) w11VarF1.g.getValue())).a(), 2, new t20(w11VarF1, lValueOf, lq4Var, i5)));
                        }
                        return sbi.a;
                    case 1:
                        zv8[] zv8VarArr2 = StoryViewsBottomSheet.H;
                        w11 w11VarF2 = storyViewsBottomSheet.F1();
                        p2h p2hVar2 = w11VarF2.z;
                        long j2 = p2hVar2.e;
                        Long lValueOf2 = (p2hVar2.c == null || j2 == 0 || !p2hVar2.g.compareAndSet(false, true)) ? null : Long.valueOf(j2);
                        if (lValueOf2 != null) {
                            w11VarF2.y.B(w11VarF2, w11.B[3], yab.h0(w11VarF2.b, ((n0c) ((xhh) w11VarF2.g.getValue())).a(), 2, new i26(w11VarF2, lValueOf2, lq4Var, 19)));
                        }
                        return sbi.a;
                    case 2:
                        zv8[] zv8VarArr3 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.d != 0);
                    default:
                        zv8[] zv8VarArr4 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.e != 0);
                }
            }
        };
        final int i4 = 2;
        ?? r8 = new af7(this) { // from class: v3h
            public final /* synthetic */ StoryViewsBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                lq4 lq4Var = null;
                int i6 = 2;
                StoryViewsBottomSheet storyViewsBottomSheet = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = StoryViewsBottomSheet.H;
                        w11 w11VarF1 = storyViewsBottomSheet.F1();
                        p2h p2hVar = w11VarF1.z;
                        long j = p2hVar.d;
                        Long lValueOf = (p2hVar.c == null || j == 0 || !p2hVar.f.compareAndSet(false, true)) ? null : Long.valueOf(j);
                        if (lValueOf != null) {
                            w11VarF1.x.B(w11VarF1, w11.B[2], yab.h0(w11VarF1.b, ((n0c) ((xhh) w11VarF1.g.getValue())).a(), 2, new t20(w11VarF1, lValueOf, lq4Var, i6)));
                        }
                        return sbi.a;
                    case 1:
                        zv8[] zv8VarArr2 = StoryViewsBottomSheet.H;
                        w11 w11VarF2 = storyViewsBottomSheet.F1();
                        p2h p2hVar2 = w11VarF2.z;
                        long j2 = p2hVar2.e;
                        Long lValueOf2 = (p2hVar2.c == null || j2 == 0 || !p2hVar2.g.compareAndSet(false, true)) ? null : Long.valueOf(j2);
                        if (lValueOf2 != null) {
                            w11VarF2.y.B(w11VarF2, w11.B[3], yab.h0(w11VarF2.b, ((n0c) ((xhh) w11VarF2.g.getValue())).a(), 2, new i26(w11VarF2, lValueOf2, lq4Var, 19)));
                        }
                        return sbi.a;
                    case 2:
                        zv8[] zv8VarArr3 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.d != 0);
                    default:
                        zv8[] zv8VarArr4 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.e != 0);
                }
            }
        };
        final int i5 = 3;
        this.x = new z3h(this, ha9VarB, h47Var, h47Var2, r6, r7, r8, new af7(this) { // from class: v3h
            public final /* synthetic */ StoryViewsBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                lq4 lq4Var = null;
                int i7 = 2;
                StoryViewsBottomSheet storyViewsBottomSheet = this.b;
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr = StoryViewsBottomSheet.H;
                        w11 w11VarF1 = storyViewsBottomSheet.F1();
                        p2h p2hVar = w11VarF1.z;
                        long j = p2hVar.d;
                        Long lValueOf = (p2hVar.c == null || j == 0 || !p2hVar.f.compareAndSet(false, true)) ? null : Long.valueOf(j);
                        if (lValueOf != null) {
                            w11VarF1.x.B(w11VarF1, w11.B[2], yab.h0(w11VarF1.b, ((n0c) ((xhh) w11VarF1.g.getValue())).a(), 2, new t20(w11VarF1, lValueOf, lq4Var, i7)));
                        }
                        return sbi.a;
                    case 1:
                        zv8[] zv8VarArr2 = StoryViewsBottomSheet.H;
                        w11 w11VarF2 = storyViewsBottomSheet.F1();
                        p2h p2hVar2 = w11VarF2.z;
                        long j2 = p2hVar2.e;
                        Long lValueOf2 = (p2hVar2.c == null || j2 == 0 || !p2hVar2.g.compareAndSet(false, true)) ? null : Long.valueOf(j2);
                        if (lValueOf2 != null) {
                            w11VarF2.y.B(w11VarF2, w11.B[3], yab.h0(w11VarF2.b, ((n0c) ((xhh) w11VarF2.g.getValue())).a(), 2, new i26(w11VarF2, lValueOf2, lq4Var, 19)));
                        }
                        return sbi.a;
                    case 2:
                        zv8[] zv8VarArr3 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.d != 0);
                    default:
                        zv8[] zv8VarArr4 = StoryViewsBottomSheet.H;
                        return Boolean.valueOf(storyViewsBottomSheet.F1().z.e != 0);
                }
            }
        });
        this.A = viewBinding(R.id.story_views_bottom_sheet_title);
        this.B = viewBinding(R.id.story_views_bottom_sheet_tab_layout);
        this.C = viewBinding(R.id.story_views_bottom_sheet_view_pager);
        this.D = viewBinding(R.id.story_views_bottom_sheet_progress);
        Object objF1 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF1 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.E = getSharedViewModel((t3f) ((Parcelable) objF1), w11.class, null);
        Object objF2 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF2 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.F = getSharedViewModel((t3f) ((Parcelable) objF2), gpi.class, null);
        this.G = bundle.getBoolean("show_views_arg");
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(frameLayout2.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.story_views_bottom_sheet_title);
        q9i.a(q9i.d, textView);
        textView.setGravity(1);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        textView.setTextColor(t1().getText().b);
        textView.setText(R.string.oneme_stories_views_bottom_sheet_title);
        linearLayout.addView(textView);
        aac aacVar = new aac(linearLayout.getContext());
        aacVar.setId(R.id.story_views_bottom_sheet_tab_layout);
        aacVar.setTabMode(1);
        aacVar.setElevation(0.0f);
        aacVar.setOverScrollMode(2);
        aacVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        linearLayout.addView(aacVar);
        y8j y8jVar = new y8j(linearLayout.getContext());
        y8jVar.setId(R.id.story_views_bottom_sheet_view_pager);
        y8jVar.setOffscreenPageLimit(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        y8jVar.setLayoutParams(layoutParams);
        linearLayout.addView(y8jVar);
        frameLayout2.addView(linearLayout);
        r6c r6cVar = new r6c(frameLayout2.getContext());
        r6cVar.setId(R.id.story_views_bottom_sheet_progress);
        r6cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        r6cVar.setCustomTheme(t1());
        r6cVar.setAppearance(e6c.a);
        r6cVar.setSize(l6c.a);
        r6cVar.setVisibility(8);
        frameLayout2.addView(r6cVar);
        return frameLayout2;
    }

    public final w11 F1() {
        return (w11) this.E.getValue();
    }

    public final y8j G1() {
        return (y8j) this.C.m(this, H[2]);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        View viewS1 = s1();
        ViewGroup.LayoutParams layoutParams = s1().getLayoutParams();
        layoutParams.height = -1;
        viewS1.setLayoutParams(layoutParams);
        View viewS2 = s1();
        ViewGroup viewGroup = viewS2 instanceof ViewGroup ? (ViewGroup) viewS2 : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        if (childAt != null) {
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            layoutParams2.height = -1;
            childAt.setLayoutParams(layoutParams2);
        }
        super.onAttach(view);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        String name = StoryViewsBottomSheet.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "StoryViewsBottomSheet: resume(OVERLAY)", null);
            }
        }
        ((gpi) this.F.getValue()).O(5);
        fwg fwgVar = this.y;
        if (fwgVar != null) {
            fwgVar.d();
        }
        this.y = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        String name = StoryViewsBottomSheet.class.getName();
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "StoryViewsBottomSheet: pause(OVERLAY)", null);
            }
        }
        ((gpi) this.F.getValue()).K(5);
        G1().setAdapter(this.x);
        ic6 ic6Var = F1().o;
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, getViewLifecycleOwner().f(), n09Var), new x3h(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().m, getViewLifecycleOwner().f(), n09Var), new x3h(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().q, getViewLifecycleOwner().f(), n09Var), new x3h(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().s, getViewLifecycleOwner().f(), n09Var), new x3h(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().u, getViewLifecycleOwner().f(), n09Var), new x3h(lq4Var, this, 4), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new w3h(this);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.e(getContext()).j().b;
    }

    public StoryViewsBottomSheet(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("show_views_arg", Boolean.valueOf(z)), new ylc("no_horizontal_padding", Boolean.TRUE)));
    }
}
