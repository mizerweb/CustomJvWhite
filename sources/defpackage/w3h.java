package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w3h extends ib {
    public volatile float c;
    public final int d;
    public final int[] e;
    public final /* synthetic */ StoryViewsBottomSheet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3h(StoryViewsBottomSheet storyViewsBottomSheet) {
        super(storyViewsBottomSheet, 1);
        this.f = storyViewsBottomSheet;
        this.d = ViewConfiguration.get(storyViewsBottomSheet.getContext()).getScaledTouchSlop();
        this.e = new int[2];
    }

    @Override // defpackage.ib, defpackage.xbd
    public final int a() {
        WindowInsets rootWindowInsets;
        View view = this.f.getView();
        if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0;
        }
        return ixj.g(rootWindowInsets, null).a.f(1).b;
    }

    @Override // defpackage.ib, defpackage.xbd
    public final int b() {
        WindowInsets rootWindowInsets;
        StoryViewsBottomSheet storyViewsBottomSheet = this.f;
        View view = storyViewsBottomSheet.getView();
        int i = 0;
        if (view == null) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        View view2 = storyViewsBottomSheet.getView();
        if (view2 != null && (rootWindowInsets = view2.getRootWindowInsets()) != null) {
            i = ixj.g(rootWindowInsets, null).a.f(1).b;
        }
        return (i + measuredHeight) / 2;
    }

    @Override // defpackage.ib, defpackage.xbd
    public final void g(float f) {
        this.f.z = true;
    }

    @Override // defpackage.ib, defpackage.xbd
    public final boolean n(ccd ccdVar, float f, float f2) {
        View view;
        StoryViewsBottomSheet storyViewsBottomSheet = this.f;
        if (storyViewsBottomSheet.z) {
            storyViewsBottomSheet.z = false;
            this.c = f2;
            return false;
        }
        float f3 = f2 - this.c;
        this.c = f2;
        StoryViewsBottomSheet storyViewsBottomSheet2 = this.f;
        je9 je9Var = je9.f;
        RecyclerView recyclerView = null;
        if (storyViewsBottomSheet2.G1().getChildCount() <= 0) {
            String str = storyViewsBottomSheet2.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "childCount of viewPager is <=0", null);
            }
        } else {
            View childAt = storyViewsBottomSheet2.G1().getChildAt(0);
            RecyclerView recyclerView2 = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView2 == null) {
                String str2 = storyViewsBottomSheet2.m;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "no recyclerView in viewPager", null);
                }
            } else {
                lfe lfeVarK = recyclerView2.K(storyViewsBottomSheet2.G1().getCurrentItem());
                if (lfeVarK == null || (view = lfeVarK.a) == null) {
                    String str3 = storyViewsBottomSheet2.m;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "no page view found", null);
                    }
                } else {
                    recyclerView = (RecyclerView) view.findViewById(R.id.story_views_page_recycler);
                }
            }
        }
        if (recyclerView != null) {
            if (Math.abs(f3) >= this.d) {
                recyclerView.getLocationOnScreen(this.e);
                int[] iArr = this.e;
                int i = iArr[0];
                int i2 = iArr[1];
                boolean z = f >= ((float) i) && f <= ((float) (recyclerView.getWidth() + i)) && f2 >= ((float) i2) && f2 <= ((float) (recyclerView.getHeight() + i2));
                if (ccdVar == ccd.c && z) {
                    boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
                    boolean zCanScrollVertically2 = recyclerView.canScrollVertically(1);
                    if ((f3 <= 0.0f || zCanScrollVertically) && (f3 >= 0.0f || zCanScrollVertically2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
