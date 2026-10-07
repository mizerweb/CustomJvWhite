package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.mediaeditor.PhotoEditScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ivc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PhotoEditScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ivc(lq4 lq4Var, PhotoEditScreen photoEditScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = photoEditScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PhotoEditScreen photoEditScreen = this.g;
        switch (i) {
            case 0:
                ivc ivcVar = new ivc(lq4Var, photoEditScreen, 0);
                ivcVar.f = obj;
                return ivcVar;
            case 1:
                ivc ivcVar2 = new ivc(lq4Var, photoEditScreen, 1);
                ivcVar2.f = obj;
                return ivcVar2;
            case 2:
                ivc ivcVar3 = new ivc(lq4Var, photoEditScreen, 2);
                ivcVar3.f = obj;
                return ivcVar3;
            default:
                ivc ivcVar4 = new ivc(lq4Var, photoEditScreen, 3);
                ivcVar4.f = obj;
                return ivcVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ivc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ivc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((ivc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ivc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3;
        AnimatorSet animatorSet4;
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        switch (this.e) {
            case 0:
                Object obj4 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj4;
                if (cqk.d(rbbVar, rt3.b)) {
                    yv9.b.l();
                } else if (rbbVar instanceof avc) {
                    PhotoEditScreen photoEditScreen = this.g;
                    avc avcVar = (avc) rbbVar;
                    zv8[] zv8VarArr = PhotoEditScreen.s1;
                    je9 je9Var = je9.d;
                    if (avcVar.equals(xuc.b)) {
                        qvc qvcVar = photoEditScreen.E;
                        if (qvcVar == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        lvc lvcVarY1 = photoEditScreen.y1();
                        lvcVarY1.getClass();
                        lvcVarY1.o.B(lvcVarY1, lvc.q[0], a8j.t(lvcVarY1, null, new voc(qvcVar, lvcVarY1, (lq4) null, i3), 1));
                    } else if (avcVar.equals(wuc.b)) {
                        qvc qvcVar2 = photoEditScreen.E;
                        if (qvcVar2 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        boolean z = qvcVar2.b.i;
                        String str = photoEditScreen.a;
                        if (z) {
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "onCancel: will show exit confirmation", null);
                            }
                            mrk.d(photoEditScreen);
                        } else {
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str, "onCancel: will finish with cancel", null);
                            }
                            if (!photoEditScreen.A1()) {
                                photoEditScreen.A.a();
                            }
                            hve router = photoEditScreen.getRouter();
                            zv zvVar = new zv();
                            zvVar.addLast(router);
                            while (true) {
                                if (zvVar.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                                    int iO0 = xw3.O0(arrayListE);
                                    while (true) {
                                        if (-1 < iO0) {
                                            br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                                            if (br4Var instanceof vuc) {
                                                obj3 = br4Var;
                                            } else {
                                                Iterator it = new upe(br4Var.getChildRouters()).iterator();
                                                while (true) {
                                                    tpe tpeVar = (tpe) it;
                                                    if (tpeVar.b.hasPrevious()) {
                                                        zvVar.addLast((hve) tpeVar.b.previous());
                                                    } else {
                                                        iO0--;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            vuc vucVar = (vuc) obj3;
                            if (vucVar != null) {
                                vucVar.y();
                            }
                            yv9.b.l();
                        }
                    } else if (avcVar instanceof zuc) {
                        zuc zucVar = (zuc) avcVar;
                        Uri uri = zucVar.b;
                        y26 y26Var = zucVar.c;
                        hve router2 = photoEditScreen.getRouter();
                        zv zvVar2 = new zv();
                        zvVar2.addLast(router2);
                        while (true) {
                            if (zvVar2.isEmpty()) {
                                obj2 = null;
                            } else {
                                ArrayList arrayListE2 = ((hve) zvVar2.removeLast()).e();
                                int iO1 = xw3.O0(arrayListE2);
                                while (true) {
                                    if (-1 < iO1) {
                                        br4 br4Var2 = ((lve) arrayListE2.get(iO1)).a;
                                        if (br4Var2 instanceof vuc) {
                                            obj2 = br4Var2;
                                        } else {
                                            Iterator it2 = new upe(br4Var2.getChildRouters()).iterator();
                                            while (true) {
                                                tpe tpeVar2 = (tpe) it2;
                                                if (tpeVar2.b.hasPrevious()) {
                                                    zvVar2.addLast((hve) tpeVar2.b.previous());
                                                } else {
                                                    iO1--;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        vuc vucVar2 = (vuc) obj2;
                        if (vucVar2 != null) {
                            vucVar2.r(uri, y26Var);
                        }
                        if (!photoEditScreen.A1()) {
                            photoEditScreen.A.a();
                        }
                        yv9.b.l();
                    } else {
                        if (!avcVar.equals(yuc.b)) {
                            ore.o();
                            return null;
                        }
                        String str2 = photoEditScreen.a;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar3.b(je9Var2)) {
                                a4cVar3.c(je9Var2, str2, "newPhotoEditor: onEditError", null);
                            }
                        }
                        g8c g8cVar = photoEditScreen.G;
                        if (g8cVar != null) {
                            g8cVar.a();
                        }
                        h8c h8cVar = new h8c(photoEditScreen);
                        h8cVar.m(new tnh(R.string.common_error));
                        photoEditScreen.G = h8cVar.p();
                    }
                }
                return sbi.a;
            case 1:
                Object obj5 = this.f;
                ch3.d0(obj);
                tvc tvcVar = (tvc) obj5;
                PhotoEditScreen photoEditScreen2 = this.g;
                j8e j8eVar = photoEditScreen2.i;
                zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                ((FrameLayout) j8eVar.m(photoEditScreen2, zv8VarArr2[4])).setVisibility(tvcVar.h ? 0 : 8);
                photoEditScreen2.w1().setVisibility(tvcVar.h ? 0 : 8);
                photoEditScreen2.u1().setLeftActionEnabled(tvcVar.b);
                photoEditScreen2.u1().setRightPrimaryActionEnabled(tvcVar.c);
                ImageView imageView = (ImageView) photoEditScreen2.k.m(photoEditScreen2, zv8VarArr2[6]);
                boolean z2 = tvcVar.f;
                Rect rect = n7j.a;
                imageView.setEnabled(z2);
                imageView.setAlpha(!z2 ? 0.3f : 1.0f);
                return sbi.a;
            case 2:
                Object obj6 = this.f;
                ch3.d0(obj);
                PhotoEditScreen photoEditScreen3 = this.g;
                j8e j8eVar2 = photoEditScreen3.m;
                j8e j8eVar3 = photoEditScreen3.l;
                zv8[] zv8VarArr3 = PhotoEditScreen.s1;
                int iOrdinal = ((qu5) obj6).ordinal();
                if (iOrdinal == 0) {
                    c36 c36Var = photoEditScreen3.F;
                    if (c36Var != null) {
                        c36Var.j = true;
                    }
                    zv8[] zv8VarArr4 = PhotoEditScreen.s1;
                    ((su5) j8eVar2.m(photoEditScreen3, zv8VarArr4[8])).b();
                    ((su5) j8eVar3.m(photoEditScreen3, zv8VarArr4[7])).c();
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    c36 c36Var2 = photoEditScreen3.F;
                    if (c36Var2 != null) {
                        c36Var2.j = false;
                    }
                    zv8[] zv8VarArr5 = PhotoEditScreen.s1;
                    ((su5) j8eVar3.m(photoEditScreen3, zv8VarArr5[7])).b();
                    ((su5) j8eVar2.m(photoEditScreen3, zv8VarArr5[8])).c();
                }
                return sbi.a;
            default:
                Object obj7 = this.f;
                ch3.d0(obj);
                dd8 dd8Var = (dd8) obj7;
                int i4 = dd8Var.a;
                k11 k11Var = (k11) dd8Var.b;
                final PhotoEditScreen photoEditScreen4 = this.g;
                ny8 ny8Var = photoEditScreen4.x;
                j8e j8eVar4 = photoEditScreen4.s;
                boolean z3 = i4 > 0;
                int i5 = photoEditScreen4.D;
                int i6 = photoEditScreen4.C;
                int iOrdinal2 = k11Var.ordinal();
                final int i7 = 3;
                if (iOrdinal2 == 0) {
                    if (photoEditScreen4.z1().getVisibility() == 0) {
                        AnimatorSet animatorSet5 = photoEditScreen4.H;
                        if (animatorSet5 != null && animatorSet5.isRunning() && (animatorSet2 = photoEditScreen4.H) != null) {
                            animatorSet2.cancel();
                        }
                        if (z3) {
                            LinearLayout linearLayoutX1 = photoEditScreen4.x1();
                            Property property = View.ALPHA;
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayoutX1, (Property<LinearLayout, Float>) property, 0.0f, 1.0f);
                            objectAnimatorOfFloat.addListener(new hvc(photoEditScreen4, 2));
                            objectAnimatorOfFloat.setDuration(500L);
                            objectAnimatorOfFloat.setInterpolator(photoEditScreen4.s1());
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(photoEditScreen4.z1().getWidth(), i6);
                            valueAnimatorOfInt.setDuration(500L);
                            valueAnimatorOfInt.setInterpolator(photoEditScreen4.s1());
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fvc
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i8 = i;
                                    PhotoEditScreen photoEditScreen5 = photoEditScreen4;
                                    switch (i8) {
                                        case 0:
                                            zv8[] zv8VarArr6 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams = photoEditScreen5.r1().getLayoutParams();
                                                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.r1().setLayoutParams(layoutParams);
                                            }
                                            break;
                                        case 1:
                                            zv8[] zv8VarArr7 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams2 = photoEditScreen5.z1().getLayoutParams();
                                                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.z1().setLayoutParams(layoutParams2);
                                            }
                                            break;
                                        case 2:
                                            zv8[] zv8VarArr8 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams3 = photoEditScreen5.z1().getLayoutParams();
                                                layoutParams3.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.z1().setLayoutParams(layoutParams3);
                                            }
                                            break;
                                        default:
                                            zv8[] zv8VarArr9 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams4 = photoEditScreen5.r1().getLayoutParams();
                                                layoutParams4.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.r1().setLayoutParams(layoutParams4);
                                            }
                                            break;
                                    }
                                }
                            });
                            valueAnimatorOfInt.addListener(new hvc(photoEditScreen4, 3));
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(photoEditScreen4.z1(), (Property<e8c, Float>) property, 1.0f, 0.0f);
                            objectAnimatorOfFloat2.setDuration(167L);
                            objectAnimatorOfFloat2.setInterpolator((PathInterpolator) ny8Var.getValue());
                            AnimatorSet animatorSet6 = new AnimatorSet();
                            animatorSet6.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt, objectAnimatorOfFloat2);
                            animatorSet6.start();
                            photoEditScreen4.H = animatorSet6;
                        } else {
                            photoEditScreen4.G1(photoEditScreen4.z1(), true);
                        }
                    }
                    if (photoEditScreen4.r1().getVisibility() == 0) {
                        AnimatorSet animatorSet7 = photoEditScreen4.H;
                        if (animatorSet7 != null && animatorSet7.isRunning() && (animatorSet = photoEditScreen4.H) != null) {
                            animatorSet.cancel();
                        }
                        if (z3) {
                            LinearLayout linearLayoutX2 = photoEditScreen4.x1();
                            Property property2 = View.ALPHA;
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayoutX2, (Property<LinearLayout, Float>) property2, 0.0f, 1.0f);
                            objectAnimatorOfFloat3.addListener(new hvc(photoEditScreen4, 0));
                            objectAnimatorOfFloat3.setDuration(500L);
                            objectAnimatorOfFloat3.setInterpolator(photoEditScreen4.s1());
                            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(photoEditScreen4.r1().getWidth(), i6);
                            valueAnimatorOfInt2.setDuration(500L);
                            valueAnimatorOfInt2.setInterpolator(photoEditScreen4.s1());
                            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fvc
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i8 = i7;
                                    PhotoEditScreen photoEditScreen5 = photoEditScreen4;
                                    switch (i8) {
                                        case 0:
                                            zv8[] zv8VarArr6 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams = photoEditScreen5.r1().getLayoutParams();
                                                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.r1().setLayoutParams(layoutParams);
                                            }
                                            break;
                                        case 1:
                                            zv8[] zv8VarArr7 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams2 = photoEditScreen5.z1().getLayoutParams();
                                                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.z1().setLayoutParams(layoutParams2);
                                            }
                                            break;
                                        case 2:
                                            zv8[] zv8VarArr8 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams3 = photoEditScreen5.z1().getLayoutParams();
                                                layoutParams3.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.z1().setLayoutParams(layoutParams3);
                                            }
                                            break;
                                        default:
                                            zv8[] zv8VarArr9 = PhotoEditScreen.s1;
                                            if (photoEditScreen5.isAttached()) {
                                                ViewGroup.LayoutParams layoutParams4 = photoEditScreen5.r1().getLayoutParams();
                                                layoutParams4.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                photoEditScreen5.r1().setLayoutParams(layoutParams4);
                                            }
                                            break;
                                    }
                                }
                            });
                            valueAnimatorOfInt2.addListener(new hvc(photoEditScreen4, 1));
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(photoEditScreen4.r1(), (Property<c7h, Float>) property2, 1.0f, 0.0f);
                            objectAnimatorOfFloat4.setDuration(167L);
                            objectAnimatorOfFloat4.setInterpolator((PathInterpolator) ny8Var.getValue());
                            AnimatorSet animatorSet8 = new AnimatorSet();
                            animatorSet8.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt2, objectAnimatorOfFloat4);
                            animatorSet8.start();
                            photoEditScreen4.H = animatorSet8;
                        } else {
                            photoEditScreen4.G1(photoEditScreen4.r1(), false);
                        }
                    }
                    zv8[] zv8VarArr6 = PhotoEditScreen.s1;
                    ((ox5) j8eVar4.m(photoEditScreen4, zv8VarArr6[14])).setVisibility(8);
                    View view = (View) photoEditScreen4.t.m(photoEditScreen4, zv8VarArr6[15]);
                    if (z3) {
                        view.animate().cancel();
                        view.animate().alpha(0.0f).setDuration(300L).setInterpolator(photoEditScreen4.s1()).withEndAction(new i7b(photoEditScreen4, 14, view)).start();
                    } else {
                        view.setAlpha(0.0f);
                        view.setVisibility(8);
                    }
                } else if (iOrdinal2 == 1) {
                    AnimatorSet animatorSet9 = photoEditScreen4.H;
                    if (animatorSet9 != null && animatorSet9.isRunning() && (animatorSet3 = photoEditScreen4.H) != null) {
                        animatorSet3.cancel();
                    }
                    if (z3) {
                        LinearLayout linearLayoutX3 = photoEditScreen4.x1();
                        Property property3 = View.ALPHA;
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(linearLayoutX3, (Property<LinearLayout, Float>) property3, 1.0f, 0.0f);
                        objectAnimatorOfFloat5.setDuration(333L);
                        objectAnimatorOfFloat5.setInterpolator(photoEditScreen4.s1());
                        objectAnimatorOfFloat5.addListener(new hvc(photoEditScreen4, 6));
                        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(photoEditScreen4.z1().getWidth(), i5);
                        valueAnimatorOfInt3.addListener(new hvc(photoEditScreen4, 7));
                        valueAnimatorOfInt3.setDuration(500L);
                        valueAnimatorOfInt3.setInterpolator(photoEditScreen4.s1());
                        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fvc
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i3;
                                PhotoEditScreen photoEditScreen5 = photoEditScreen4;
                                switch (i8) {
                                    case 0:
                                        zv8[] zv8VarArr7 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams = photoEditScreen5.r1().getLayoutParams();
                                            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.r1().setLayoutParams(layoutParams);
                                        }
                                        break;
                                    case 1:
                                        zv8[] zv8VarArr8 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams2 = photoEditScreen5.z1().getLayoutParams();
                                            layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.z1().setLayoutParams(layoutParams2);
                                        }
                                        break;
                                    case 2:
                                        zv8[] zv8VarArr9 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams3 = photoEditScreen5.z1().getLayoutParams();
                                            layoutParams3.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.z1().setLayoutParams(layoutParams3);
                                        }
                                        break;
                                    default:
                                        zv8[] zv8VarArr10 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams4 = photoEditScreen5.r1().getLayoutParams();
                                            layoutParams4.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.r1().setLayoutParams(layoutParams4);
                                        }
                                        break;
                                }
                            }
                        });
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(photoEditScreen4.z1(), (Property<e8c, Float>) property3, 0.0f, 1.0f);
                        objectAnimatorOfFloat6.setDuration(333L);
                        objectAnimatorOfFloat6.setInterpolator(photoEditScreen4.s1());
                        AnimatorSet animatorSet10 = new AnimatorSet();
                        animatorSet10.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt3, objectAnimatorOfFloat6);
                        animatorSet10.start();
                        photoEditScreen4.H = animatorSet10;
                    } else {
                        photoEditScreen4.G1(photoEditScreen4.z1(), true);
                    }
                    ((ox5) j8eVar4.m(photoEditScreen4, PhotoEditScreen.s1[14])).setVisibility(0);
                    photoEditScreen4.D1(z3, true);
                } else {
                    if (iOrdinal2 != 2) {
                        ore.o();
                        return null;
                    }
                    AnimatorSet animatorSet11 = photoEditScreen4.H;
                    if (animatorSet11 != null && animatorSet11.isRunning() && (animatorSet4 = photoEditScreen4.H) != null) {
                        animatorSet4.cancel();
                    }
                    if (z3) {
                        LinearLayout linearLayoutX4 = photoEditScreen4.x1();
                        Property property4 = View.ALPHA;
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(linearLayoutX4, (Property<LinearLayout, Float>) property4, 1.0f, 0.0f);
                        objectAnimatorOfFloat7.setDuration(333L);
                        objectAnimatorOfFloat7.setInterpolator(photoEditScreen4.s1());
                        objectAnimatorOfFloat7.addListener(new hvc(photoEditScreen4, 4));
                        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(i6, i5);
                        valueAnimatorOfInt4.addListener(new hvc(photoEditScreen4, 5));
                        valueAnimatorOfInt4.setDuration(500L);
                        valueAnimatorOfInt4.setInterpolator(photoEditScreen4.s1());
                        valueAnimatorOfInt4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fvc
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i2;
                                PhotoEditScreen photoEditScreen5 = photoEditScreen4;
                                switch (i8) {
                                    case 0:
                                        zv8[] zv8VarArr7 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams = photoEditScreen5.r1().getLayoutParams();
                                            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.r1().setLayoutParams(layoutParams);
                                        }
                                        break;
                                    case 1:
                                        zv8[] zv8VarArr8 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams2 = photoEditScreen5.z1().getLayoutParams();
                                            layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.z1().setLayoutParams(layoutParams2);
                                        }
                                        break;
                                    case 2:
                                        zv8[] zv8VarArr9 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams3 = photoEditScreen5.z1().getLayoutParams();
                                            layoutParams3.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.z1().setLayoutParams(layoutParams3);
                                        }
                                        break;
                                    default:
                                        zv8[] zv8VarArr10 = PhotoEditScreen.s1;
                                        if (photoEditScreen5.isAttached()) {
                                            ViewGroup.LayoutParams layoutParams4 = photoEditScreen5.r1().getLayoutParams();
                                            layoutParams4.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            photoEditScreen5.r1().setLayoutParams(layoutParams4);
                                        }
                                        break;
                                }
                            }
                        });
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(photoEditScreen4.r1(), (Property<c7h, Float>) property4, 0.0f, 1.0f);
                        objectAnimatorOfFloat8.setDuration(500L);
                        objectAnimatorOfFloat8.setInterpolator(photoEditScreen4.s1());
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        animatorSet12.playTogether(objectAnimatorOfFloat7, valueAnimatorOfInt4, objectAnimatorOfFloat8);
                        animatorSet12.start();
                        photoEditScreen4.H = animatorSet12;
                    } else {
                        photoEditScreen4.G1(photoEditScreen4.r1(), true);
                        photoEditScreen4.r1().H0();
                    }
                    photoEditScreen4.D1(false, false);
                }
                return sbi.a;
        }
    }
}
