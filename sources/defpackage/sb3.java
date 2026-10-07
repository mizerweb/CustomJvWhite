package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class sb3 extends FrameLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (view != null && view.getId() == R.id.chat__bottom_container) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                    int measuredHeight = findViewById(R.id.chat__toolbar).getMeasuredHeight();
                    int measuredHeight2 = findViewById(R.id.chat__pinbars_container).getMeasuredHeight();
                    Integer numL = n7j.l(this);
                    super.measureChildWithMargins(view, i, i2, iMakeMeasureSpec, Math.max(i4, measuredHeight + measuredHeight2 + (numL != null ? numL.intValue() : 0)));
                } else {
                    super.measureChildWithMargins(view, i, i2, i3, i4);
                }
                break;
            default:
                super.measureChildWithMargins(view, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                if (size == 0) {
                    size = Integer.MAX_VALUE;
                } else if (size2 == 0) {
                    size2 = Integer.MAX_VALUE;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, size2), 1073741824);
                super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb3(Context context, int i) {
        super(context);
        this.a = i;
    }
}
