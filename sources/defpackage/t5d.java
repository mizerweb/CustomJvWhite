package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class t5d extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5d(nef nefVar) {
        super(4, -1L);
        this.c = 6;
        this.d = nefVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int childCount;
        int iK;
        int i = this.c;
        a8g a8gVar = pq3.j;
        int i2 = 0;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                xac xacVar = (xac) obj2;
                if (xacVar != null) {
                    u5d u5dVar = (u5d) obj3;
                    int childCount2 = u5dVar.getChildCount();
                    while (i2 < childCount2) {
                        View childAt = u5dVar.getChildAt(i2);
                        w5d w5dVar = childAt instanceof w5d ? (w5d) childAt : null;
                        if (w5dVar != null) {
                            w5dVar.d(xacVar);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            case 1:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                w5d.b((w5d) obj3, (b7d) obj2);
                return;
            case 2:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                e7d e7dVar = (e7d) obj2;
                q8d q8dVar = (q8d) obj3;
                ny8 ny8Var = q8dVar.f;
                if (e7dVar == null) {
                    return;
                }
                a7d a7dVar = e7dVar.f;
                if (!e7dVar.h && ny8Var.d()) {
                    ((View) ny8Var.getValue()).setVisibility(8);
                }
                q8dVar.g.setText(e7dVar.c);
                q8dVar.h.setText(e7dVar.d.d(q8dVar));
                o8d o8dVar = q8dVar.j;
                o8dVar.setState(a7dVar);
                if (a7dVar instanceof y6d) {
                    o8dVar.setOnButtonClickListener(new vx9(q8dVar, 28, e7dVar));
                } else {
                    o8dVar.setOnClickListener(null);
                    o8dVar.setClickable(false);
                }
                final u5d u5dVar2 = q8dVar.i;
                List list = e7dVar.e;
                iaa iaaVar = e7dVar.g ? new iaa(q8dVar, 29, e7dVar) : null;
                final p8d p8dVar = new p8d(q8dVar, 0, e7dVar);
                u5dVar2.getClass();
                int size = list.size();
                if (size < u5dVar2.getChildCount() && size <= (childCount = u5dVar2.getChildCount() - 1)) {
                    while (true) {
                        u5dVar2.removeViewAt(childCount);
                        if (childCount != size) {
                            childCount--;
                        }
                    }
                }
                int i3 = 0;
                for (Object obj4 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    final b7d b7dVar = (b7d) obj4;
                    View childAt2 = u5dVar2.getChildAt(i3);
                    w5d w5dVar2 = childAt2 instanceof w5d ? (w5d) childAt2 : null;
                    if (w5dVar2 == null) {
                        w5dVar2 = new w5d(u5dVar2.getContext());
                        u5dVar2.addView(w5dVar2);
                    }
                    final w5d w5dVar3 = w5dVar2;
                    w5dVar3.c(b7dVar);
                    if (iaaVar != null) {
                        w5dVar3.setEnabled(true);
                        w5dVar3.setClickable(true);
                        qe7.H(w5dVar3, 300L, new aeb(iaaVar, 8, b7dVar));
                    } else {
                        w5dVar3.setEnabled(false);
                        w5dVar3.setClickable(false);
                    }
                    w5dVar3.setRateClickListener(new cf7() { // from class: s5d
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj5) {
                            Integer num = (Integer) obj5;
                            num.getClass();
                            u5d u5dVar3 = u5dVar2;
                            int[] iArr = u5dVar3.a;
                            Point point = u5dVar3.b;
                            ny8 ny8Var2 = w5dVar3.c;
                            if (n7j.o(ny8Var2)) {
                                ((f7d) ny8Var2.getValue()).a.e.getLocationInWindow(iArr);
                            }
                            int i5 = iArr[0];
                            w5d w5dVar4 = w5dVar3;
                            point.x = (w5dVar4.getCounterWidth() / 2) + i5;
                            point.y = iArr[1] - (w5dVar4.getCountViewHeight() * 2);
                            p8dVar.i(Integer.valueOf(b7dVar.a), point, num);
                            return sbi.a;
                        }
                    });
                    xac bubbleColors = u5dVar2.getBubbleColors();
                    if (bubbleColors != null) {
                        w5dVar3.d(bubbleColors);
                    }
                    i3 = i4;
                }
                return;
            case 3:
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj3;
                gn gnVar = profileChangeLinkScreen.s;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                String str = (String) obj2;
                zv8[] zv8VarArr = ProfileChangeLinkScreen.t;
                ImageView imageViewR1 = profileChangeLinkScreen.r1();
                osk.e(imageViewR1, gnVar);
                int iK2 = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
                RLottieDrawable rLottieDrawableCreate = str != null ? RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(str, true, iK2, iK2, true), false, false, true, false, 18, null)) : null;
                imageViewR1.setImageDrawable(rLottieDrawableCreate);
                RLottieDrawable rLottieDrawable = profileChangeLinkScreen.p;
                profileChangeLinkScreen.p = rLottieDrawableCreate;
                if (rLottieDrawable != null && !rLottieDrawable.isRecycled()) {
                    rLottieDrawable.recycle(true);
                }
                if (rLottieDrawableCreate == null || profileChangeLinkScreen.p1().getVisibility() != 0 || !profileChangeLinkScreen.r1().isAttachedToWindow()) {
                    imageViewR1.setVisibility(8);
                    return;
                } else {
                    imageViewR1.setVisibility(0);
                    osk.c(imageViewR1, gnVar);
                    return;
                }
            case 4:
                n4e n4eVar = (n4e) obj3;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                m4e m4eVar = (m4e) obj2;
                ViewGroup.LayoutParams layoutParams = n4eVar.getLayoutParams();
                if (layoutParams == null) {
                    p51.d();
                    return;
                }
                int iOrdinal = m4eVar.ordinal();
                if (iOrdinal == 0) {
                    iK = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return;
                    }
                    iK = gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
                }
                layoutParams.height = iK;
                layoutParams.width = iK;
                n4eVar.c.a = iK / 2.0f;
                n4eVar.setLayoutParams(layoutParams);
                n4eVar.a();
                return;
            case 5:
                y5e y5eVar = (y5e) obj3;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                y5eVar.requestLayout();
                y5eVar.invalidate();
                return;
            case 6:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                long jLongValue = ((Number) obj2).longValue();
                long jLongValue2 = ((Number) obj).longValue();
                nef nefVar = (nef) obj3;
                oee oeeVar = nefVar.a;
                d20 d20Var = nefVar.d;
                if (jLongValue2 != -1) {
                    Iterator it = d20Var.f.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                        } else if (((jef) it.next()).a.a != jLongValue2) {
                            i5++;
                        }
                    }
                    if (i5 != -1) {
                        oeeVar.d(i5, 1, "payload_selection");
                    }
                }
                if (jLongValue != -1) {
                    Iterator it2 = d20Var.f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                        } else if (((jef) it2.next()).a.a != jLongValue) {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        oeeVar.d(i2, 1, "payload_selection");
                        return;
                    }
                    return;
                }
                return;
            case 7:
                cqf cqfVar = (cqf) obj3;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                dbf dbfVar = (dbf) obj2;
                TextView currentLabel = cqfVar.getCurrentLabel();
                ynh ynhVar = dbfVar.a;
                float f = dbfVar.b;
                currentLabel.setText(ynhVar.d(cqfVar));
                if (f >= 0.0f) {
                    cqfVar.d.setValue(f);
                }
                cqfVar.b(a8gVar.h(cqfVar), f);
                return;
            case 8:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                o0g o0gVar = (o0g) obj3;
                o0gVar.a(a8gVar.h(o0gVar));
                return;
            case 9:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((qbg) obj3).o();
                return;
            case 10:
                ofg ofgVar = (ofg) obj3;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                ofgVar.b.setColor(iIntValue);
                ofgVar.invalidateSelf();
                return;
            case 11:
                gig gigVar = (gig) obj3;
                if (cqk.d(obj, obj2)) {
                    return;
                }
                int iOrdinal2 = ((eig) obj2).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        gig.a(gigVar);
                        return;
                    } else {
                        ore.o();
                        return;
                    }
                }
                ifh ifhVar = gigVar.c;
                if (ifhVar.d()) {
                    TextView textView = (TextView) ifhVar.getValue();
                    ValueAnimator valueAnimator = gigVar.e;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorB = gig.b(gigVar, textView, false);
                    gigVar.e = valueAnimatorB;
                    valueAnimatorB.start();
                    return;
                }
                return;
            case 12:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((b6h) obj3).invalidateSelf();
                return;
            case 13:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                gnh gnhVar = (gnh) obj3;
                gnhVar.requestLayout();
                gnhVar.invalidate();
                return;
            case 14:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                pyi pyiVar = (pyi) obj3;
                ValueAnimator valueAnimator2 = pyiVar.r;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f2 = pyiVar.n;
                if (f2 == 0.0f) {
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, pyiVar.g());
                valueAnimatorOfFloat.setDuration(100L);
                valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new myi(pyiVar, 1));
                valueAnimatorOfFloat.addListener(new oyi(pyiVar, 1));
                valueAnimatorOfFloat.start();
                pyiVar.r = valueAnimatorOfFloat;
                return;
            case 15:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                izi.O((izi) obj3);
                return;
            default:
                if (cqk.d(obj, obj2)) {
                    return;
                }
                View view = ((VideoTrimSliderWidget) obj3).getView();
                if (view != null) {
                    view.requestLayout();
                    view.invalidate();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5d(Object obj, int i, Object obj2) {
        super(4, obj);
        this.c = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5d(n4e n4eVar) {
        super(4, m4e.a);
        this.c = 4;
        this.d = n4eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t5d(y5e y5eVar) {
        this.c = 5;
        Boolean bool = Boolean.FALSE;
        this.d = y5eVar;
        super(4, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5d(int i, Object obj) {
        super(4, null);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5d(o0g o0gVar) {
        super(4, n0g.b);
        this.c = 8;
        this.d = o0gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t5d(qbg qbgVar) {
        this.c = 9;
        Boolean bool = Boolean.FALSE;
        this.d = qbgVar;
        super(4, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5d(gig gigVar) {
        super(4, eig.a);
        this.c = 11;
        this.d = gigVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t5d(gnh gnhVar) {
        this.c = 13;
        Boolean bool = Boolean.FALSE;
        this.d = gnhVar;
        super(4, bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t5d(pyi pyiVar) {
        this.c = 14;
        Boolean bool = Boolean.FALSE;
        this.d = pyiVar;
        super(4, bool);
    }
}
