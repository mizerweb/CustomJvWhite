package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class qea extends GestureDetector.SimpleOnGestureListener {
    public final nea a;
    public final af7 b;
    public ww8 c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ tea f;

    public qea(tea teaVar, nea neaVar, pea peaVar) {
        this.f = teaVar;
        this.a = neaVar;
        this.b = peaVar;
    }

    public final boolean a(MotionEvent motionEvent) {
        ViewGroup viewGroup = this.f.y;
        if (!(viewGroup instanceof mia) || viewGroup.getTouchDelegate() == null) {
            return false;
        }
        return viewGroup.getTouchDelegate().onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        View view = this.f.a;
        ww8 ww8Var = this.c;
        if (ww8Var != null) {
            ww8Var.invoke();
        }
        this.d = true;
        ((iea) view).cancelLongPress();
        ((iea) view).setPressed(false);
        af7 af7Var = this.b;
        if (af7Var != null) {
            af7Var.invoke();
        }
        return af7Var != null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        View view = this.f.a;
        if (motionEvent.getActionMasked() == 0) {
            ((iea) view).cancelLongPress();
            ((iea) view).setPressed(false);
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.d = false;
        boolean zA = a(motionEvent);
        this.e = zA;
        if (!zA) {
            ViewParent viewParent = this.f.y;
            kfa kfaVar = viewParent instanceof kfa ? (kfa) viewParent : null;
            if (kfaVar != null) {
                kfaVar.c(motionEvent, tea.X);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.d || a(motionEvent)) {
            return;
        }
        ((iea) this.f.a).performLongClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        yu3 yu3VarJ;
        ViewGroup viewGroup = this.f.y;
        if (this.b == null) {
            return false;
        }
        if (!this.e) {
            kfa kfaVar = viewGroup instanceof kfa ? (kfa) viewGroup : null;
            String strK = (kfaVar == null || (yu3VarJ = kfaVar.j(motionEvent)) == null) ? null : yu3VarJ.k();
            if (kfaVar != null) {
                kfaVar.c(motionEvent, tea.Y);
            }
            if (kfaVar == null || !kfaVar.l(motionEvent)) {
                if (kfaVar != null && (kfaVar.y(motionEvent) || strK != null)) {
                    this.a.invoke(strK);
                    return true;
                }
                i59 i59Var = viewGroup instanceof i59 ? (i59) viewGroup : null;
                if (i59Var == null || !i59Var.r()) {
                    viewGroup.performClick();
                    return true;
                }
                ((i59) viewGroup).u();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        yu3 yu3VarJ;
        tea teaVar = this.f;
        ViewParent viewParent = teaVar.y;
        if (!a(motionEvent) && this.b == null) {
            kfa kfaVar = viewParent instanceof kfa ? (kfa) viewParent : null;
            String strK = (kfaVar == null || (yu3VarJ = kfaVar.j(motionEvent)) == null) ? null : yu3VarJ.k();
            if (kfaVar != null) {
                kfaVar.c(motionEvent, tea.Y);
            }
            if (kfaVar == null || !kfaVar.l(motionEvent)) {
                if (kfaVar != null && (kfaVar.y(motionEvent) || strK != null)) {
                    this.a.invoke(strK);
                    return true;
                }
                i59 i59Var = viewParent instanceof i59 ? (i59) viewParent : null;
                if (i59Var == null || !i59Var.r()) {
                    ((iea) teaVar.a).performClick();
                    return true;
                }
                ((i59) viewParent).u();
                return true;
            }
        }
        return true;
    }
}
