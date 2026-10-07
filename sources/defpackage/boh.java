package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class boh extends RecyclerView {
    public final pm0 j2;
    public final LinearLayoutManager k2;
    public ValueAnimator l2;
    public final String m2;

    public boh(Context context, Executor executor) {
        super(context);
        pm0 pm0Var = new pm0(executor);
        this.j2 = pm0Var;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.k2 = linearLayoutManager;
        this.m2 = boh.class.getName();
        setLayoutManager(linearLayoutManager);
        setAdapter(pm0Var);
        setItemAnimator(null);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final pm0 getSelectorAdapter() {
        return this.j2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.l2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setListener(om0 om0Var) {
        this.j2.g = om0Var;
    }
}
