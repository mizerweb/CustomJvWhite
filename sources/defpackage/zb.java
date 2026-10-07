package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class zb extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(z0c z0cVar) {
        super(4, Integer.MIN_VALUE);
        this.c = 26;
        this.d = z0cVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        gs7 gs7Var;
        int i;
        float f;
        float f2;
        h58 h58Var;
        int i2;
        switch (this.c) {
            case 0:
                kbc kbcVar = (kbc) obj2;
                ac acVar = (ac) this.d;
                b25 b25Var = acVar.a;
                b25Var.e.B(b25Var, b25.g[0], Integer.valueOf(kbcVar.getIcon().d));
                acVar.setTextColor(kbcVar.getText().d);
                return;
            case 1:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                mn mnVar = (mn) obj2;
                mn mnVar2 = (mn) obj;
                String str = ((qn) this.d).f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "#" + ((qn) this.d).a + " oldState: " + mnVar2 + ", newState: " + mnVar, null);
                    }
                }
                qn qnVar = (qn) this.d;
                qnVar.n(qnVar.i);
                ((qn) this.d).invalidateSelf();
                return;
            case 2:
                dq0 dq0Var = (dq0) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                dq0Var.requestLayout();
                dq0Var.invalidate();
                return;
            case 3:
                qc1 qc1Var = (qc1) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                yc1 yc1Var = (yc1) obj2;
                qc1Var.getMicrophoneOnDrawable().setBounds(0, 0, qc1Var.getControlsSize().a(), qc1Var.getControlsSize().a());
                qc1.w(qc1Var, qc1Var.w, yc1Var.d(), yc1Var.b());
                qc1.w(qc1Var, qc1Var.x, yc1Var.d(), yc1Var.b());
                qc1.w(qc1Var, qc1Var.y, yc1Var.d(), yc1Var.b());
                qc1.w(qc1Var, qc1Var.z, yc1Var.d(), yc1Var.b());
                qc1.w(qc1Var, qc1Var.A, yc1Var.d(), yc1Var.b());
                qc1.w(qc1Var, qc1Var.B, yc1Var.d(), yc1Var.b());
                qc1Var.x();
                qc1Var.invalidate();
                qc1Var.requestLayout();
                return;
            case 4:
                yd1 yd1Var = ((xd1) this.d).e;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                wd1 wd1Var = (wd1) obj2;
                vd1 vd1Var = wd1Var.c;
                ((wme) yd1Var.c).a();
                yd1Var.b = vd1Var;
                ViewGroup.LayoutParams layoutParams = yd1Var.getLayoutParams();
                if (layoutParams == null) {
                    p51.d();
                    return;
                }
                long j = wd1Var.a;
                layoutParams.width = (int) (j >> 32);
                layoutParams.height = (int) (j & 4294967295L);
                yd1Var.setLayoutParams(layoutParams);
                return;
            case 5:
                hn1 hn1Var = (hn1) this.d;
                gn1 gn1Var = (gn1) obj2;
                if (((gn1) obj) == gn1Var && hn1Var.y) {
                    return;
                }
                hn1Var.y = true;
                ls7 ls7Var = hn1Var.s;
                int iOrdinal = gn1Var.ordinal();
                if (iOrdinal == 0) {
                    gs7Var = gs7.a;
                } else if (iOrdinal == 1) {
                    gs7Var = gs7.b;
                } else if (iOrdinal == 2) {
                    gs7Var = gs7.c;
                } else {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        ore.o();
                        return;
                    }
                    gs7Var = gs7.d;
                }
                ls7Var.setColorState(gs7Var);
                return;
            case 6:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                final nd2 nd2Var = (nd2) this.d;
                a8g a8gVar = pq3.j;
                ValueAnimator valueAnimator = nd2Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int color = nd2Var.f.getColor();
                int iOrdinal2 = nd2Var.getType().ordinal();
                if (iOrdinal2 == 0) {
                    a8gVar.h(nd2Var);
                    i = 1308622847;
                } else if (iOrdinal2 == 1) {
                    i = a8gVar.h(nd2Var).l().d;
                } else {
                    if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                        ore.o();
                        return;
                    }
                    i = a8gVar.h(nd2Var).h().d;
                }
                final int i3 = i;
                final float f3 = nd2Var.g;
                int iOrdinal3 = nd2Var.getType().ordinal();
                if (iOrdinal3 == 0) {
                    f = nd2.l;
                } else if (iOrdinal3 == 1) {
                    f = nd2.m;
                } else if (iOrdinal3 == 2) {
                    f = nd2.n;
                } else {
                    if (iOrdinal3 != 3) {
                        ore.o();
                        return;
                    }
                    f = nd2.o;
                }
                final float f4 = f;
                final float f5 = nd2Var.h;
                int iOrdinal4 = nd2Var.getType().ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                    f2 = 0.0f;
                } else {
                    if (iOrdinal4 != 3) {
                        ore.o();
                        return;
                    }
                    f2 = 1.0f;
                }
                final float f6 = f2;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ld2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float animatedFraction = valueAnimator2.getAnimatedFraction();
                        nd2 nd2Var2 = nd2Var;
                        nd2Var2.f.setColor(((Integer) nd2Var2.b.evaluate(animatedFraction, Integer.valueOf(color), Integer.valueOf(i3))).intValue());
                        FloatEvaluator floatEvaluator = nd2Var2.c;
                        nd2Var2.g = floatEvaluator.evaluate(animatedFraction, (Number) Float.valueOf(f3), (Number) Float.valueOf(f4)).floatValue();
                        nd2Var2.h = floatEvaluator.evaluate(animatedFraction, (Number) Float.valueOf(f5), (Number) Float.valueOf(f6)).floatValue();
                        nd2Var2.invalidate();
                    }
                });
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.start();
                nd2Var.d = valueAnimatorOfFloat;
                return;
            case 7:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((bl2) this.d).b();
                return;
            case 8:
                fl2 fl2Var = (fl2) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                dl2 dl2Var = (dl2) obj2;
                fl2Var.g(dl2Var);
                ChatMediaViewerScreen chatMediaViewerScreen = fl2Var.a;
                chatMediaViewerScreen.getClass();
                int iOrdinal5 = dl2Var.ordinal();
                if (iOrdinal5 == 0) {
                    ji0 ji0Var = chatMediaViewerScreen.G;
                    if (ji0Var != null) {
                        ji0Var.c(true);
                    }
                } else if (iOrdinal5 == 1) {
                    ji0 ji0Var2 = chatMediaViewerScreen.G;
                    if (ji0Var2 != null) {
                        ji0Var2.c(false);
                    }
                } else if (iOrdinal5 != 2) {
                    ore.o();
                    return;
                } else {
                    ji0 ji0Var3 = chatMediaViewerScreen.G;
                    if (ji0Var3 != null) {
                        ji0Var3.c(false);
                    }
                }
                fl2Var.h();
                return;
            case 9:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                zo3 zo3Var = (zo3) this.d;
                zo3Var.d.setText(((ynh) obj2).d(zo3Var));
                return;
            case 10:
                xv3 xv3Var = (xv3) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                xv3Var.i.clear();
                int i4 = 0;
                for (Object obj3 : (List) obj2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    yu3 yu3Var = (yu3) obj3;
                    n11 n11Var = xv3Var.g;
                    if (((ArrayList) n11Var.c).size() > i4) {
                        h58Var = (h58) n11Var.b(i4);
                    } else {
                        xj7 xj7Var = new xj7(xv3Var.a.getResources());
                        xj7Var.b = 0;
                        h58Var = new h58(xj7Var.a());
                        ote oteVarD = h58Var.d();
                        if (oteVarD != null) {
                            oteVarD.setCallback(xv3Var.b);
                        }
                        ArrayList arrayList = (ArrayList) n11Var.c;
                        int size = arrayList.size();
                        oc9.m(size, arrayList.size() + 1);
                        arrayList.add(size, h58Var);
                        if (n11Var.b) {
                            h58Var.f();
                        }
                    }
                    xv3Var.m(h58Var, yu3Var, false);
                    i4 = i5;
                }
                return;
            case 11:
                mx4 mx4Var = (mx4) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                mx4Var.F(mx4Var.getWidth(), mx4Var.getHeight());
                mx4Var.invalidate();
                return;
            case 12:
                ox5 ox5Var = (ox5) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                float fFloatValue = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                ox5Var.c.setStrokeWidth(fFloatValue);
                ox5Var.invalidate();
                return;
            case 13:
                xg6 xg6Var = (xg6) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                p90.Q(xg6Var, xg6Var.f, (noh) obj2);
                xg6Var.invalidate();
                xg6Var.requestLayout();
                return;
            case 14:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                aq6 aq6Var = (aq6) obj2;
                aq6 aq6Var2 = (aq6) obj;
                wr6 wr6Var = (wr6) this.d;
                wr6Var.v = (aq6Var == null || (aq6Var.j == null && aq6Var.k == null) || aq6Var.l) ? false : true;
                wr6.N(wr6Var, aq6Var2 == null);
                return;
            case 15:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((ip7) this.d).invalidateSelf();
                return;
            case 16:
                js7 js7Var = (js7) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                gs7 gs7Var2 = (gs7) obj2;
                gs7 gs7Var3 = (gs7) obj;
                if (gs7Var2 == null) {
                    ore.k("Check failed.");
                    return;
                }
                if (gs7Var3 != null) {
                    js7Var.m();
                    ks7 ks7VarF = js7Var.f(gs7Var2);
                    js7.u.getClass();
                    js7Var.e(ks7VarF, zpe.p(gs7Var2));
                    return;
                }
                js7.u.getClass();
                js7Var.p = zpe.p(gs7Var2);
                ks7 ks7VarF2 = js7Var.f(gs7Var2);
                js7Var.k = ks7VarF2.a;
                js7Var.l = ks7VarF2.b;
                js7Var.m = ks7VarF2.c;
                js7Var.n = ks7VarF2.d;
                js7Var.o = ks7VarF2.e;
                js7Var.b();
                js7Var.l();
                return;
            case 17:
                if (cqk.d((owb) obj, (owb) obj2)) {
                    return;
                }
                cx8.a((cx8) this.d);
                return;
            case 18:
                eu9 eu9Var = (eu9) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    ((Paint) eu9Var.j.getValue()).setColor(num.intValue());
                    eu9Var.invalidateSelf();
                    return;
                }
                return;
            case 19:
                yz9 yz9Var = (yz9) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                iq9 iq9Var = (iq9) obj2;
                if (iq9Var != null) {
                    mjg mjgVar = yz9Var.i;
                    mjgVar.getClass();
                    mjgVar.j(null, iq9Var);
                    yz9Var.q(iq9Var);
                    yz9Var.requestLayout();
                    yz9Var.invalidate();
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                v5a v5aVar = (v5a) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                iq9 iq9Var2 = (iq9) obj2;
                if (iq9Var2 != null) {
                    mjg mjgVar2 = v5aVar.s;
                    mjgVar2.getClass();
                    mjgVar2.j(null, iq9Var2);
                    v5aVar.getDate$message_list().setBackgroundEnabled$message_list(!iq9Var2.d());
                    v5aVar.q(iq9Var2);
                    v5aVar.requestLayout();
                    v5aVar.invalidate();
                    return;
                }
                return;
            case 21:
                cf7 cf7Var = (cf7) obj2;
                at3 defaultMovementMethod = ((dka) this.d).getDefaultMovementMethod();
                boolean z = cf7Var != null;
                GestureDetector gestureDetector = defaultMovementMethod.l;
                if (z) {
                    gestureDetector.setOnDoubleTapListener(defaultMovementMethod.k);
                } else {
                    gestureDetector.setOnDoubleTapListener(null);
                }
                defaultMovementMethod.i = z;
                return;
            case 22:
                if (((a5b) obj) != ((a5b) obj2)) {
                    b5b b5bVar = (b5b) this.d;
                    a8g a8gVar2 = pq3.j;
                    int iOrdinal6 = b5bVar.getMessageTextColor().ordinal();
                    if (iOrdinal6 == 0) {
                        i2 = a8gVar2.l(b5bVar).b.getText().b;
                    } else {
                        if (iOrdinal6 != 1) {
                            ore.o();
                            return;
                        }
                        i2 = a8gVar2.l(b5bVar).b.getText().d;
                    }
                    b5bVar.u.setTextColor(i2);
                    return;
                }
                return;
            case 23:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                ((rdb) this.d).invalidateSelf();
                return;
            case 24:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                nvb nvbVar = (nvb) this.d;
                nvbVar.onThemeChanged(pq3.j.h(nvbVar));
                return;
            case 25:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((fyb) this.d).a((eyb) obj2);
                return;
            case 26:
                z0c z0cVar = (z0c) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                String str2 = iIntValue + "º";
                z0cVar.p = str2;
                TextPaint textPaint = z0cVar.b;
                z0cVar.e = iIntValue < 0 ? textPaint.measureText(str2, 1, str2.length() - 1) : textPaint.measureText(str2, 0, str2.length() - 1);
                p0m.a(z0cVar, kt7.TEXT_HANDLE_MOVE);
                return;
            case 27:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                kbc kbcVarH = (kbc) obj2;
                v9c v9cVar = (v9c) this.d;
                if (kbcVarH == null) {
                    kbcVarH = pq3.j.h(v9cVar);
                }
                v9cVar.onThemeChanged(kbcVarH);
                return;
            case 28:
                ubc ubcVar = (ubc) this.d;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                ny8 ny8Var = ubcVar.j;
                if (zBooleanValue) {
                    ((View) ny8Var.getValue()).setVisibility(0);
                    ubc.a(ubcVar, false);
                    return;
                } else {
                    if (ny8Var.d()) {
                        ((r6c) ny8Var.getValue()).setVisibility(8);
                        ubc.a(ubcVar, true);
                        return;
                    }
                    return;
                }
            default:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                ((jjc) this.d).invalidateSelf();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb(Object obj, int i, Object obj2) {
        super(4, obj);
        this.c = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(qn qnVar) {
        super(4, mn.a);
        this.c = 1;
        this.d = qnVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zb(qc1 qc1Var) {
        this.c = 3;
        rc1 rc1Var = rc1.a;
        this.d = qc1Var;
        super(4, rc1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(hn1 hn1Var) {
        super(4, gn1.a);
        this.c = 5;
        this.d = hn1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(nd2 nd2Var) {
        super(4, md2.a);
        this.c = 6;
        this.d = nd2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zb(bl2 bl2Var) {
        this.c = 7;
        Boolean bool = Boolean.FALSE;
        this.d = bl2Var;
        super(4, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(fl2 fl2Var) {
        super(4, dl2.a);
        this.c = 8;
        this.d = fl2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(zo3 zo3Var) {
        super(4, ynh.b);
        this.c = 9;
        this.d = zo3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(xv3 xv3Var) {
        super(4, r66.a);
        this.c = 10;
        this.d = xv3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(mx4 mx4Var) {
        super(4, jx4.a);
        this.c = 11;
        this.d = mx4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(b5b b5bVar) {
        super(4, a5b.b);
        this.c = 22;
        this.d = b5bVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zb(rdb rdbVar) {
        this.c = 23;
        Float fValueOf = Float.valueOf(0.0f);
        this.d = rdbVar;
        super(4, fValueOf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(nvb nvbVar) {
        super(4, mvb.a);
        this.c = 24;
        this.d = nvbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(fyb fybVar) {
        super(4, eyb.a);
        this.c = 25;
        this.d = fybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb(Drawable.Callback callback, int i) {
        super(4, null);
        this.c = i;
        this.d = callback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zb(ubc ubcVar) {
        this.c = 28;
        Boolean bool = Boolean.FALSE;
        this.d = ubcVar;
        super(4, bool);
    }
}
