package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class b65 implements zee {
    public final RecyclerView a;
    public View b;
    public final Rect c = new Rect();

    public b65(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.zee
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.zee
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        View childAt;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2.F(x, y) != null) {
            View view = this.b;
            if (view == null) {
                gm0.Y(b65.class.getName(), "canceling forwarded gesture");
                return false;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            view.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.b = null;
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int i = 0;
        while (true) {
            if (i >= recyclerView2.getChildCount()) {
                childAt = null;
                break;
            }
            int i2 = i + 1;
            childAt = recyclerView2.getChildAt(i);
            if (childAt == null) {
                ore.i();
                return false;
            }
            vee layoutManager = recyclerView2.getLayoutManager();
            Rect rect = this.c;
            if (layoutManager != null) {
                layoutManager.A(rect, childAt);
            }
            if (rect.contains((int) x2, (int) y2)) {
                break;
            }
            i = i2;
        }
        boolean z = true;
        boolean z2 = recyclerView.getScrollState() != 0;
        if (motionEvent.getAction() == 0) {
            this.b = childAt;
        }
        View view2 = this.b;
        if (view2 != null) {
            MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
            if (z2 || !cqk.d(childAt, view2)) {
                motionEventObtain2.setAction(3);
            }
            motionEventObtain2.offsetLocation((-motionEvent.getX()) + 1.0f, (-motionEvent.getY()) + (view2.getMeasuredHeight() / 2));
            view2.dispatchTouchEvent(motionEventObtain2);
            if (motionEventObtain2.getActionMasked() != 1 && motionEventObtain2.getActionMasked() != 3) {
                z = false;
            }
            motionEventObtain2.recycle();
            if (z) {
                this.b = null;
            }
        }
        return false;
    }

    @Override // defpackage.zee
    public final void e(boolean z) {
    }
}
