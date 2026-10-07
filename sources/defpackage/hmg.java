package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class hmg extends xbd {
    public float a;
    public final int b;
    public final int[] c = new int[2];
    public final /* synthetic */ StickerSetBottomSheet d;

    public hmg(StickerSetBottomSheet stickerSetBottomSheet) {
        this.d = stickerSetBottomSheet;
        this.b = ViewConfiguration.get(stickerSetBottomSheet.getContext()).getScaledTouchSlop();
    }

    @Override // defpackage.xbd
    public final int a() {
        return StickerSetBottomSheet.D1(this.d);
    }

    @Override // defpackage.xbd
    public final int b() {
        return d();
    }

    @Override // defpackage.xbd
    public final int d() {
        StickerSetBottomSheet stickerSetBottomSheet = this.d;
        View view = stickerSetBottomSheet.getView();
        return (view != null ? view.getMeasuredHeight() : 0) - stickerSetBottomSheet.t;
    }

    @Override // defpackage.xbd
    public final View e() {
        zv8[] zv8VarArr = StickerSetBottomSheet.v;
        return this.d.s1();
    }

    @Override // defpackage.xbd
    public final ccd f(ccd ccdVar, ccd ccdVar2) {
        ccd ccdVar3 = ccd.a;
        if (ccdVar2 == ccdVar3 && ccdVar == ccd.c) {
            return ccd.b;
        }
        return ccdVar2 == ccdVar3 ? ccdVar : ccdVar2;
    }

    @Override // defpackage.xbd
    public final void g(float f) {
        this.a = f;
    }

    @Override // defpackage.xbd
    public final void m(int i) {
        zv8[] zv8VarArr = StickerSetBottomSheet.v;
        br4 parentController = this.d.getParentController();
        StickerPreviewScreen stickerPreviewScreen = parentController instanceof StickerPreviewScreen ? (StickerPreviewScreen) parentController : null;
        ViewGroup viewGroup = stickerPreviewScreen != null ? (ViewGroup) stickerPreviewScreen.m.m(stickerPreviewScreen, StickerPreviewScreen.v[6]) : null;
        if (viewGroup == null) {
            return;
        }
        if (i <= viewGroup.getBottom()) {
            viewGroup.setTranslationY(i - viewGroup.getBottom());
        } else {
            viewGroup.setTranslationY(0.0f);
        }
    }

    @Override // defpackage.xbd
    public final boolean n(ccd ccdVar, float f, float f2) {
        float f3 = f2 - this.a;
        StickerSetBottomSheet stickerSetBottomSheet = this.d;
        RecyclerView recyclerView = (RecyclerView) stickerSetBottomSheet.r.m(stickerSetBottomSheet, StickerSetBottomSheet.v[3]);
        boolean z = ccdVar == ccd.c;
        if (Math.abs(f3) >= this.b) {
            int[] iArr = this.c;
            recyclerView.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            boolean z2 = f >= ((float) i) && f <= ((float) (recyclerView.getWidth() + i)) && f2 >= ((float) i2) && f2 <= ((float) (recyclerView.getHeight() + i2));
            if (z && z2) {
                boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
                boolean zCanScrollVertically2 = recyclerView.canScrollVertically(1);
                if ((f3 <= 0.0f || zCanScrollVertically) && (f3 >= 0.0f || zCanScrollVertically2)) {
                }
            }
            return true;
        }
        return false;
    }
}
