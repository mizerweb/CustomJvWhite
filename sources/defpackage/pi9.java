package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pi9 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pi9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        TextureViewRenderer textureViewRenderer;
        KeyEvent.Callback callback;
        lp5 lp5Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                s52 s52Var = (s52) obj;
                p52 p52Var = s52Var.s1;
                if (p52Var != null) {
                    p52Var.n(s52Var.x1);
                }
                return s52Var.s1 != null;
            case 7:
                i72 i72Var = (i72) obj;
                Matrix matrix = i72Var.t;
                Matrix matrix2 = i72Var.h;
                if (!i72Var.z || (textureViewRenderer = i72Var.g) == null) {
                    return false;
                }
                float fA = v3e.a(matrix);
                float fA2 = v3e.a(matrix2);
                float x = (motionEvent.getX() - textureViewRenderer.getLeft()) + ((i72Var.c / 2) - (textureViewRenderer.getWidth() / 2));
                float y = (motionEvent.getY() - textureViewRenderer.getTop()) + ((i72Var.d / 2) - (textureViewRenderer.getHeight() / 2));
                if (i72Var.A) {
                    i72Var.a.performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                }
                if (Math.abs(fA - fA2) < 0.01f) {
                    i72Var.d(gm0.K(200.0f));
                    float fA3 = (fA2 * 2.0f) / v3e.a(matrix);
                    Matrix matrix3 = i72Var.i;
                    matrix.invert(matrix3);
                    float[] fArr = i72Var.o;
                    fArr[0] = x;
                    fArr[1] = y;
                    float[] fArr2 = i72Var.p;
                    matrix3.mapPoints(fArr2, fArr);
                    matrix2.mapPoints(fArr, fArr2);
                    float f = fArr[0];
                    float f2 = fArr[1];
                    Matrix matrix4 = new Matrix(matrix);
                    matrix4.postScale(fA3, fA3, f, f2);
                    float[] fArr3 = new float[4];
                    matrix4.mapPoints(fArr3, i72Var.q);
                    ylc ylcVarC = i72Var.c(fArr3);
                    float fFloatValue = ((Number) ylcVarC.a).floatValue();
                    float fFloatValue2 = ((Number) ylcVarC.b).floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        matrix4.postTranslate(fFloatValue, fFloatValue2);
                    }
                    i72Var.a(matrix4);
                } else {
                    i72Var.d(100);
                    i72Var.a(matrix2);
                }
                return true;
            case 8:
                xp9 xp9Var = ((at3) obj).d;
                if (xp9Var == null || (callback = (View) ((WeakReference) xp9Var.b).get()) == null) {
                    return false;
                }
                GestureDetector.OnDoubleTapListener onDoubleTapListener = callback instanceof GestureDetector.OnDoubleTapListener ? (GestureDetector.OnDoubleTapListener) callback : null;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return false;
            case 9:
                ed7 ed7Var = (ed7) obj;
                int i2 = ed7Var.b;
                if (i2 == 0) {
                    int i3 = i2 + 1;
                    ed7Var.b = i3;
                    ip5 ip5Var = (ip5) ed7Var.c;
                    if (ip5Var != null) {
                        ip5Var.p(i3);
                    }
                }
                return true;
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            default:
                return super.onDoubleTap(motionEvent);
            case 14:
                eyg eygVar = (eyg) obj;
                if (!eygVar.b.getAsBoolean()) {
                    return false;
                }
                if (eyg.a(eygVar, motionEvent)) {
                    UserStoriesScreen userStoriesScreen = eygVar.a;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    boolean zBooleanValue = ((Boolean) userStoriesScreen.I1().p.a.getValue()).booleanValue();
                    lp5 lp5Var2 = userStoriesScreen.o1;
                    if (lp5Var2 != null) {
                        p0m.a(lp5Var2, lt7.CONFIRM);
                    }
                    userStoriesScreen.I1().E(new oni(zBooleanValue, userStoriesScreen, 1), zBooleanValue);
                    if (!zBooleanValue && (lp5Var = userStoriesScreen.o1) != null) {
                        lp5Var.g = new kp5(x2, y2, AnimationUtils.currentAnimationTimeMillis());
                        lp5Var.invalidate();
                    }
                }
                return true;
            case 16:
                r1k r1kVar = (r1k) obj;
                r1kVar.i = motionEvent.getX();
                r1kVar.j = motionEvent.getY();
                r1kVar.k = 1;
                return true;
            case 17:
                ((z1k) obj).q.a(motionEvent.getX(), motionEvent.getY());
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 8:
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        Boolean boolValueOf;
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 7:
            case 9:
            case 10:
            case 13:
            case 16:
            default:
                return super.onDown(motionEvent);
            case 8:
                at3 at3Var = (at3) obj;
                at3Var.g = false;
                Spannable spannable = at3Var.e;
                if (spannable == null) {
                    return false;
                }
                ClickableSpan clickableSpanA = at3.a(at3Var, at3Var.d, spannable, motionEvent);
                at3Var.f = clickableSpanA;
                return clickableSpanA != null;
            case 11:
                tha thaVar = (tha) obj;
                pha phaVar = thaVar.f;
                fha fhaVar = thaVar.e;
                if (fhaVar != null) {
                    fv9 fv9Var = (fv9) fhaVar;
                    MessageWriteWidget messageWriteWidget = (MessageWriteWidget) fv9Var.b;
                    tha thaVar2 = (tha) fv9Var.c;
                    zv8[] zv8VarArr = MessageWriteWidget.I;
                    if (messageWriteWidget.getView() != null) {
                        if (messageWriteWidget.t1().hasFocus()) {
                            z = false;
                        } else {
                            thaVar2.setShowSoftInputOnFocus(!messageWriteWidget.A1().I());
                            if (messageWriteWidget.A1().I()) {
                                a8j.x(messageWriteWidget.A1().x, qla.a);
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        boolValueOf = Boolean.valueOf(z);
                    } else {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                        return true;
                    }
                }
                Editable text = phaVar.getText();
                if (text == null) {
                    return false;
                }
                hha.a.onTouchEvent(phaVar, text, motionEvent);
                return false;
            case 15:
                pyi pyiVar = (pyi) obj;
                pyiVar.p = false;
                float x = motionEvent.getX() - (pyiVar.getWidth() / 2.0f);
                float y = motionEvent.getY() - (pyiVar.getHeight() / 2.0f);
                if (pyiVar.i()) {
                    float width = pyiVar.getWidth() / 2.0f;
                    float height = pyiVar.getHeight() / 2.0f;
                    long jE = pyiVar.e(width, height);
                    if (((float) Math.hypot((width + x) - Float.intBitsToFloat((int) (jE >> 32)), (height + y) - Float.intBitsToFloat((int) (jE & 4294967295L)))) <= yl5.d().getDisplayMetrics().density * 16.0f * 2.0f) {
                        pyiVar.getParent().requestDisallowInterceptTouchEvent(true);
                        pyiVar.o = true;
                        pyiVar.m(x, y);
                        pyiVar.d(true);
                    }
                    break;
                }
            case 12:
            case 14:
                return true;
            case 17:
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        Spannable spannable;
        t59 t59Var;
        ViewParent parent;
        nyi listener;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qi9 qi9Var = (qi9) obj;
                FrameLayout frameLayout = qi9Var.a;
                e3j e3jVar = (e3j) qi9Var.b.invoke();
                if (e3jVar == null) {
                    gm0.n(pi9.class.getName(), "Media viewer. Can't speed up because player is null");
                    break;
                } else if (e3jVar.d()) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                    qi9Var.n = motionEvent.getX();
                    float fL0 = e3jVar.l0();
                    qi9Var.p = fL0;
                    float fU = oc9.u(fL0 + 1.0f, 0.2f, 3.0f);
                    qi9Var.q = fU;
                    qi9Var.r = fU;
                    qi9Var.m = motionEvent.getPointerId(0);
                    qi9Var.o = true;
                    VideoViewerWidget videoViewerWidget = (VideoViewerWidget) qi9Var.c.b;
                    zv8[] zv8VarArr = VideoViewerWidget.q;
                    a6j a6jVarX1 = videoViewerWidget.x1();
                    if (a6jVarX1 != null) {
                        a6jVarX1.N0();
                    }
                    yab.e(frameLayout, qi9Var.f(), -1);
                    w0c w0cVar = (w0c) qi9Var.f().findViewById(R.id.oneme_longpress_playback_control_counter);
                    if (w0cVar != null) {
                        w0cVar.setCounter(Float.valueOf(qi9Var.r));
                    }
                    e3jVar.setPlaybackSpeed(qi9Var.r);
                    p0m.a(frameLayout, lt7.GESTURE_START);
                    ValueAnimator valueAnimator = qi9Var.s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(qi9Var.k);
                    valueAnimatorOfFloat.addUpdateListener(new mi9(qi9Var, 1));
                    valueAnimatorOfFloat.addListener(new oi9(qi9Var, 1));
                    valueAnimatorOfFloat.addListener(new oi9(qi9Var, 0));
                    valueAnimatorOfFloat.start();
                    qi9Var.s = valueAnimatorOfFloat;
                    break;
                }
                break;
            case 5:
                g52 g52Var = (g52) obj;
                e52 e52Var = g52Var.F1;
                if (e52Var != null) {
                    e52Var.j(g52Var.I1, new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
                }
                break;
            case 6:
                s52 s52Var = (s52) obj;
                p52 p52Var = s52Var.s1;
                if (p52Var != null) {
                    p52Var.i(s52Var.x1, new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
                }
                break;
            case 8:
                at3 at3Var = (at3) obj;
                xp9 xp9Var = at3Var.d;
                if (xp9Var != null && (spannable = at3Var.e) != null && spannable.length() != 0) {
                    ClickableSpan clickableSpanA = at3.a(at3Var, xp9Var, spannable, motionEvent);
                    if (clickableSpanA instanceof URLSpan) {
                        at3Var.c = ((URLSpan) clickableSpanA).getURL();
                        t59Var = t59.a;
                    } else if (clickableSpanA instanceof k59) {
                        at3Var.c = ((k59) clickableSpanA).c;
                        t59Var = t59.f;
                    } else if (clickableSpanA instanceof fga) {
                        if (((fga) clickableSpanA).a.c == bga.a) {
                            try {
                                at3Var.a.r(spannable.subSequence(spannable.getSpanStart(clickableSpanA), spannable.getSpanEnd(clickableSpanA)).toString(), ((fga) clickableSpanA).a, motionEvent);
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                    } else if (clickableSpanA instanceof rud) {
                        at3Var.c = ((rud) clickableSpanA).a;
                        t59Var = t59.e;
                    }
                    t59 t59Var2 = t59Var;
                    at3Var.f = clickableSpanA;
                    String str = at3Var.c;
                    if (str != null && str.length() != 0) {
                        at3Var.a.u(clickableSpanA, spannable.getSpanStart(clickableSpanA), spannable.getSpanEnd(clickableSpanA), str, t59Var2, motionEvent);
                        at3Var.g = true;
                    }
                }
                break;
            case 14:
                eyg eygVar = (eyg) obj;
                if (eygVar.f && eygVar.h && eygVar.b.getAsBoolean() && eygVar.e != 2) {
                    eygVar.g = true;
                    UserStoriesScreen userStoriesScreen = eygVar.a;
                    userStoriesScreen.H1().K(1);
                    View view = userStoriesScreen.getView();
                    if (view != null && (parent = view.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    userStoriesScreen.x1(false);
                    break;
                }
                break;
            case 15:
                pyi pyiVar = (pyi) obj;
                if (!pyiVar.o && !pyiVar.p && (listener = pyiVar.getListener()) != null) {
                    ((izi) listener).performLongClick();
                    break;
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        switch (this.a) {
            case 7:
                i72 i72Var = (i72) this.b;
                i72Var.k = false;
                i72Var.l = false;
                Matrix matrix = i72Var.t;
                float[] fArr = i72Var.r;
                float[] fArr2 = i72Var.q;
                matrix.mapPoints(fArr, fArr2);
                Matrix matrix2 = i72Var.h;
                float[] fArr3 = i72Var.s;
                matrix2.mapPoints(fArr3, fArr2);
                boolean z = fArr[0] >= fArr3[0];
                boolean z2 = fArr[2] <= fArr3[2];
                if (!z || f >= 0.0f) {
                    f3 = f;
                } else {
                    i72Var.k = true;
                    f3 = 0.0f;
                }
                if (z2 && f > 0.0f) {
                    i72Var.k = true;
                    f3 = 0.0f;
                }
                boolean z3 = fArr[1] >= fArr3[1];
                boolean z4 = fArr[3] <= fArr3[3];
                if (!z3 || f2 >= 0.0f) {
                    f4 = f2;
                } else {
                    i72Var.l = true;
                    f4 = 0.0f;
                }
                if (z4 && f2 > 0.0f) {
                    i72Var.l = true;
                    f4 = 0.0f;
                }
                if (f3 != 0.0f || f4 != 0.0f) {
                    matrix.postTranslate(-f3, -f4);
                    i72Var.m = true;
                    i72Var.b();
                }
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ej1 ej1Var;
        af7 af7Var;
        ip5 ip5Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                fj1 fj1Var = (fj1) obj;
                ej1 ej1Var2 = fj1Var.y;
                if (ej1Var2 != null) {
                    CallScreen callScreen = ((hx1) ej1Var2).a;
                    l6m l6mVar = CallScreen.D1;
                    if (callScreen.R1().D(callScreen.N1().g)) {
                        CallScreen.G1(callScreen);
                    }
                }
                return fj1Var.y != null;
            case 3:
                lj1 lj1Var = (lj1) obj;
                ij1 ij1Var = lj1Var.v;
                if (ij1Var != null && (ej1Var = ((fj1) ((ex8) ij1Var).b).y) != null) {
                    CallScreen callScreen2 = ((hx1) ej1Var).a;
                    l6m l6mVar2 = CallScreen.D1;
                    if (callScreen2.R1().D(callScreen2.N1().g)) {
                        CallScreen.G1(callScreen2);
                    }
                }
                return lj1Var.v != null;
            case 4:
                r12 r12Var = (r12) obj;
                q12 q12Var = r12Var.s;
                if (q12Var != null) {
                    CallScreen callScreen3 = ((nx1) q12Var).a;
                    l6m l6mVar3 = CallScreen.D1;
                    if (callScreen3.R1().D(callScreen3.N1().g)) {
                        CallScreen.G1(callScreen3);
                    }
                }
                return r12Var.s != null;
            case 5:
                g52 g52Var = (g52) obj;
                e52 e52Var = g52Var.F1;
                if (e52Var != null) {
                    e52Var.k();
                }
                return g52Var.F1 != null;
            case 6:
                s52 s52Var = (s52) obj;
                p52 p52Var = s52Var.s1;
                if (p52Var != null) {
                    p52Var.u(s52Var.x1);
                }
                return s52Var.s1 != null;
            case 7:
            case 11:
            case 13:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 8:
                at3 at3Var = (at3) obj;
                xp9 xp9Var = at3Var.d;
                View view = xp9Var != null ? (View) ((WeakReference) xp9Var.b).get() : null;
                ClickableSpan clickableSpan = at3Var.f;
                if (clickableSpan == null || view == null) {
                    at3Var.g = false;
                    if (clickableSpan == null && view != null && (af7Var = at3Var.h) != null) {
                        af7Var.invoke();
                        at3Var.d = null;
                    }
                } else {
                    if (!at3Var.g) {
                        clickableSpan.onClick(view);
                    }
                    at3Var.d = null;
                    at3Var.f = null;
                    at3Var.e = null;
                    at3Var.c = null;
                    at3Var.g = false;
                }
                return true;
            case 9:
                ed7 ed7Var = (ed7) obj;
                if (ed7Var.b == 0 && (ip5Var = (ip5) ed7Var.c) != null) {
                    ip5Var.k();
                }
                return true;
            case 10:
                ((op5) ((pp5) obj).d).q();
                return super.onSingleTapConfirmed(motionEvent);
            case 12:
                zvc zvcVar = ((bwc) obj).v;
                if (zvcVar != null) {
                    zvcVar.n();
                }
                return true;
            case 14:
                eyg eygVar = (eyg) obj;
                if (!eygVar.b.getAsBoolean()) {
                    return false;
                }
                if (eyg.a(eygVar, motionEvent)) {
                    eyg.b(eygVar, motionEvent);
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        mg8 mg8Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                o61 o61Var = (o61) obj;
                l61 l61Var = o61Var.p;
                c61 c61Var = o61Var.q;
                g61 g61Var = o61Var.r;
                if (l61Var != null && c61Var != null && g61Var != null && !c61Var.h) {
                    ng8 ng8Var = (ng8) l61Var;
                    w45 w45Var = ng8Var.g;
                    if (w45Var.b) {
                        w45Var.b = false;
                        kg8 kg8Var = ng8Var.d;
                        if (kg8Var != null && (mg8Var = ng8Var.f) != null) {
                            long j = ng8Var.c;
                            MessagesListWidget messagesListWidget = ((osa) mg8Var).b;
                            zv8[] zv8VarArr = MessagesListWidget.T1;
                            jsa jsaVarF1 = messagesListWidget.F1();
                            jsaVarF1.n2.B(jsaVarF1, jsa.Z2[4], yab.h0(jsaVarF1.b, ((n0c) jsaVarF1.j).b(), 2, new i53(jsaVarF1, j, c61Var, kg8Var, g61Var, jsaVarF1.b0().J(2), null)));
                        }
                        ng8Var.postDelayed(new pi(10, w45Var.c), w45Var.a);
                    }
                }
                o61Var.q = null;
                o61Var.r = null;
                o61Var.invalidate();
                return true;
            case 8:
                at3 at3Var = (at3) obj;
                if (at3Var.i) {
                    Runnable runnable = at3Var.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    onSingleTapConfirmed(motionEvent);
                }
                return false;
            case 9:
                ed7 ed7Var = (ed7) obj;
                int i2 = ed7Var.b;
                if (i2 > 0) {
                    int i3 = i2 + 1;
                    ed7Var.b = i3;
                    ip5 ip5Var = (ip5) ed7Var.c;
                    if (ip5Var != null) {
                        ip5Var.p(i3);
                    }
                }
                return true;
            case 11:
                pha phaVar = ((tha) obj).f;
                Editable text = phaVar.getText();
                if (text != null) {
                    hha.a.onTouchEvent(phaVar, text, motionEvent);
                }
                return false;
            case 13:
                atf atfVar = (atf) obj;
                ny8 ny8Var = atfVar.o;
                if (!ny8Var.d() || ((v9c) ny8Var.getValue()).isEnabled()) {
                    return false;
                }
                wsf wsfVar = atfVar.s;
                if (wsfVar == null) {
                    return true;
                }
                wsfVar.s(atfVar.getModelItem().getItemId());
                return true;
            case 14:
                eyg eygVar = (eyg) obj;
                if (!eygVar.b.getAsBoolean()) {
                    return false;
                }
                if (eyg.a(eygVar, motionEvent)) {
                    return true;
                }
                eyg.b(eygVar, motionEvent);
                return true;
            case 15:
                pyi pyiVar = (pyi) obj;
                if (!pyiVar.i()) {
                    nyi listener = pyiVar.getListener();
                    if (listener != null) {
                        ((izi) listener).Z();
                    }
                    pyiVar.setInPause(true);
                } else if (pyiVar.i()) {
                    nyi listener2 = pyiVar.getListener();
                    if (listener2 != null) {
                        ((izi) listener2).a0();
                    }
                    pyiVar.setInPause(false);
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
