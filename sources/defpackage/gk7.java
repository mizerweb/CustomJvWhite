package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class gk7 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gk7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ((ata) this.b).a(((tea) this.c).A);
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
            case 2:
                return true;
            case 1:
            case 3:
            default:
                return super.onDown(motionEvent);
            case 4:
                zyf zyfVar = (zyf) this.b;
                TouchDelegate touchDelegate = zyfVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) && zyfVar.k.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    zyfVar.getRippleDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    zyfVar.getBorderDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    zyfVar.setPressed(true);
                    zyfVar.invalidate();
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                super.onLongPress(motionEvent);
                ((af7) obj).invoke();
                break;
            case 1:
            case 3:
            default:
                super.onLongPress(motionEvent);
                break;
            case 2:
                super.onLongPress(motionEvent);
                ((kj1) obj).invoke();
                break;
            case 4:
                zyf zyfVar = (zyf) this.b;
                TouchDelegate touchDelegate = zyfVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    zyfVar.setPressed(false);
                    zyfVar.invalidate();
                    zyfVar.performLongClick();
                    break;
                }
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((ata) obj2).b(((tea) obj).A);
                return true;
            case 2:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 3:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) obj2;
                if (profileAvatarsScreen != null) {
                    ProfileAvatarWidget profileAvatarWidget = (ProfileAvatarWidget) obj;
                    vv vvVar = profileAvatarWidget.b;
                    zv8 zv8Var = ProfileAvatarWidget.e[0];
                    ((Number) vvVar.a(profileAvatarWidget)).longValue();
                    if (profileAvatarsScreen.getView() != null) {
                        profileAvatarsScreen.H1(!(profileAvatarsScreen.I1().getVisibility() == 0));
                    }
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((af7) obj).invoke();
                return true;
            case 1:
            case 3:
            default:
                return super.onSingleTapUp(motionEvent);
            case 2:
                ((kj1) obj).invoke();
                return true;
            case 4:
                zyf zyfVar = (zyf) obj;
                TouchDelegate touchDelegate = zyfVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    zyfVar.setPressed(false);
                    zyfVar.invalidate();
                    if (zyfVar.k.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ((xre) this.c).invoke();
                    } else {
                        ((View) zyfVar.getParent()).performClick();
                    }
                }
                return true;
        }
    }
}
