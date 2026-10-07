package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class b36 extends FrameLayout implements e36 {
    public View a;
    public View b;
    public g36 c;
    public boolean d;
    public Rect e;
    public Rect f;

    public g36 getEditorSurfaceView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(i, i2, i3, i4);
        if (this.d) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int iMin = Math.min(i5, i6);
            int i7 = iMin / 2;
            int i8 = i5 / 2;
            int i9 = i6 / 2;
            View view = this.a;
            if (iMin == i5) {
                int i10 = i9 - i7;
                this.a.layout(i, i10 - view.getMeasuredHeight(), i3, i10);
                this.b.layout(i, i9 + i7, i3, i4);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int i11 = i8 - i7;
            this.a.layout(i11 - measuredWidth, i2, i11, i4);
            int i12 = i8 + i7;
            this.b.layout(i12, i2, measuredWidth + i12, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.c.measure(i, i2);
        if (this.d) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int iMin = Math.min(size, size2);
            View view = this.a;
            if (iMin == size) {
                int i3 = (size2 - iMin) / 2;
                view.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                this.b.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            } else {
                int i4 = (size - iMin) / 2;
                view.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
                this.b.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void setDrawStickerEnabled(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        this.a.setVisibility(z ? 0 : 8);
        this.b.setVisibility(this.d ? 0 : 8);
    }
}
