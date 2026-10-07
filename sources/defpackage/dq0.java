package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dq0 extends ViewGroup {
    public static final /* synthetic */ zv8[] f;
    public final kbc a;
    public final ImageView b;
    public View c;
    public final zb d;
    public final int e;

    static {
        z8b z8bVar = new z8b(dq0.class, "iconSize", "getIconSize()I");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public dq0(Context context, int i) {
        super(context);
        kbc kbcVar = pq3.j.e(context).j().b;
        this.a = kbcVar;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(imageView.getContext().getDrawable(i).mutate());
        imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        this.b = imageView;
        this.d = new zb(bc1.k(24.0f, yl5.d().getDisplayMetrics().density), 2, this);
        this.e = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        a();
    }

    private final int getIconSize() {
        zv8 zv8Var = f[0];
        return ((Number) this.d.b).intValue();
    }

    private final void setIconSize(int i) {
        this.d.B(this, f[0], Integer.valueOf(i));
    }

    public abstract void a();

    public final View getContentView() {
        return this.c;
    }

    public final kbc getCustomTheme() {
        return this.a;
    }

    public final ImageView getIconView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        int i5 = (layoutParams2 != null ? layoutParams2.gravity : 8388611) & 8388613;
        int i6 = this.e;
        if (i5 == 8388613) {
            int childCount = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                int measuredWidth2 = getChildAt(i8).getMeasuredWidth() + i7;
                if (i8 < getChildCount() - 1) {
                    measuredWidth2 += i6;
                }
                i7 = measuredWidth2;
            }
            measuredWidth = getMeasuredWidth() - i7;
        } else {
            measuredWidth = 0;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt = getChildAt(i9);
            qyj.M(childAt, measuredWidth, (getMeasuredHeight() - childAt.getMeasuredHeight()) / 2, 0, 12);
            measuredWidth += childAt.getMeasuredWidth() + i6;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getIconSize(), 1073741824);
        ImageView imageView = this.b;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        View view = this.c;
        if (view != null) {
            view.measure(0, 0);
        }
        int measuredWidth = imageView.getMeasuredWidth() + this.e;
        View view2 = this.c;
        int measuredWidth2 = measuredWidth + (view2 != null ? view2.getMeasuredWidth() : 0);
        int measuredHeight = imageView.getMeasuredHeight();
        View view3 = this.c;
        setMeasuredDimension(View.resolveSize(measuredWidth2, i), View.resolveSize(Math.max(measuredHeight, view3 != null ? view3.getMeasuredHeight() : 0), i2));
    }

    public final void setContentView(View view) {
        this.c = view;
    }
}
