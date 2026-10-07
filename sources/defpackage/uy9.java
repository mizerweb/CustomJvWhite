package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uy9 extends sb3 implements eph {
    public final l1c b;
    public final ixi c;
    public final ny8 d;

    public uy9(Context context) {
        super(context, 1);
        xj7 xj7Var = new xj7(getResources());
        xj7Var.l = i1f.l;
        xj7Var.b = 0;
        l1c l1cVar = new l1c(context, xj7Var.a());
        l1cVar.setId(R.id.gallery_simple_drawee_view);
        l1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        l1cVar.setClickable(false);
        l1cVar.setFocusable(false);
        this.b = l1cVar;
        ixi ixiVar = new ixi(context);
        ixiVar.setId(R.id.gallery_video_info_text_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        ixiVar.setLayoutParams(layoutParams);
        ixiVar.setVisibility(8);
        this.c = ixiVar;
        this.d = rx8.P(3, new vx9(context, 1, this));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClickable(true);
        setFocusable(true);
        setClipChildren(false);
        setClipToPadding(false);
        addView(l1cVar);
        addView(ixiVar);
        onThemeChanged(pq3.j.h(this));
    }

    public final npb getCheckButton() {
        return (npb) this.d.getValue();
    }

    public final l1c getDraweeView() {
        return this.b;
    }

    public final ixi getVideoInfo() {
        return this.c;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = kbcVar.getIcon().c;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_image).mutate();
        sb8.m0(i, drawableMutate);
        l1c l1cVar = this.b;
        wj7 wj7Var = (wj7) l1cVar.getHierarchy();
        if (wj7Var != null) {
            i1f i1fVar = i1f.m;
            wj7Var.i(1, drawableMutate);
            wj7Var.f(1).q(i1fVar);
        }
        l1cVar.setBackgroundColor(kbcVar.b().b);
    }
}
