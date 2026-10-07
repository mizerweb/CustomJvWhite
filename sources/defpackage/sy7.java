package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class sy7 extends tee {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public sy7(ColorDrawable colorDrawable) {
        this.b = colorDrawable.mutate();
    }

    @Override // defpackage.tee
    public void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        switch (this.a) {
            case 1:
                super.f(rect, view, recyclerView, hfeVar);
                int iP = RecyclerView.P(view);
                aqg aqgVar = (aqg) this.b;
                Object objG = aqgVar.G(iP);
                if (objG != null && iP > 0 && !objG.equals(aqgVar.G(iP - 1))) {
                    rect.top = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                }
                break;
            default:
                super.f(rect, view, recyclerView, hfeVar);
                break;
        }
    }

    @Override // defpackage.tee
    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((wee) childAt.getLayoutParams())).bottomMargin;
                    drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                    drawable.draw(canvas);
                }
                break;
        }
    }

    public sy7(aqg aqgVar) {
        this.b = aqgVar;
    }
}
