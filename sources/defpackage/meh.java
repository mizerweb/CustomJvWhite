package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class meh extends FrameLayout implements teh {
    public final /* synthetic */ ueh a;

    public meh(Context context) {
        super(context);
        this.a = new ueh();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public af7 getOnRequestInterceptTouchEvent() {
        return this.a.b;
    }

    public cf7 getOnTouch() {
        return this.a.a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        cf7 cf7Var = this.a.a;
        return (cf7Var != null ? ((Boolean) cf7Var.invoke(motionEvent)).booleanValue() : false) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        cf7 cf7Var = this.a.a;
        return (cf7Var != null ? ((Boolean) cf7Var.invoke(motionEvent)).booleanValue() : false) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        af7 af7Var = this.a.b;
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    @Override // defpackage.teh
    public void setOnRequestInterceptTouchEvent(af7 af7Var) {
        this.a.b = af7Var;
    }

    @Override // defpackage.teh
    public void setOnTouch(cf7 cf7Var) {
        this.a.a = cf7Var;
    }
}
