package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.stories.publish.PublishStoryBottomSheet;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gb3 implements af7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public gb3(w08 w08Var, z08 z08Var) {
        this.a = 2;
        this.c = w08Var;
        this.b = z08Var;
    }

    private final Object a() throws IllegalAccessException, InvocationTargetException {
        RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.c;
        ny8 ny8Var = recordControlsWidget.D;
        dce dceVar = (dce) this.b;
        boolean z = dceVar instanceof bce;
        lt7 lt7Var = lt7.CONFIRM;
        AnimatorSet animatorSet = null;
        if (z) {
            bce bceVar = (bce) dceVar;
            zv8[] zv8VarArr = RecordControlsWidget.x1;
            if (bceVar.b) {
                recordControlsWidget.s1().setVisibility(0);
                recordControlsWidget.M1();
                if (bceVar.a) {
                    View view = recordControlsWidget.getView();
                    if (view != null) {
                        p0m.a(view, lt7Var);
                    }
                    AnimatorSet animatorSet2 = recordControlsWidget.t1;
                    if (animatorSet2 != null && animatorSet2.isRunning()) {
                        AnimatorSet animatorSet3 = recordControlsWidget.t1;
                        if (animatorSet3 != null) {
                            animatorSet3.end();
                        }
                        AnimatorSet animatorSet4 = recordControlsWidget.t1;
                        if (animatorSet4 != null) {
                            animatorSet4.cancel();
                        }
                    }
                    recordControlsWidget.t1 = new AnimatorSet();
                    c79 c79VarW = yab.w();
                    c79VarW.addAll(fsk.c(recordControlsWidget.D1(), 1.0f, 0.5f, 150L, 0L));
                    ImageView imageViewD1 = recordControlsWidget.D1();
                    Property property = View.ALPHA;
                    c79VarW.add(fsk.a(imageViewD1, property, 1.0f, 0.0f, 150L, 0L, false, 240));
                    c79VarW.addAll(fsk.c(recordControlsWidget.C1(), 0.5f, 1.0f, 150L, 50L));
                    c79VarW.add(fsk.a(recordControlsWidget.C1(), property, 0.0f, 1.0f, 150L, 50L, false, 224));
                    ycj ycjVar = recordControlsWidget.v;
                    if (ycjVar != null) {
                        c79VarW.addAll(ycjVar.getResumeAnimations());
                    }
                    c79 c79VarJ = yab.j(c79VarW);
                    AnimatorSet animatorSet5 = recordControlsWidget.t1;
                    if (animatorSet5 != null) {
                        animatorSet5.addListener(new rce(recordControlsWidget, 9));
                    }
                    AnimatorSet animatorSet6 = recordControlsWidget.t1;
                    if (animatorSet6 != null) {
                        animatorSet6.addListener(new rce(recordControlsWidget, 8));
                    }
                    AnimatorSet animatorSet7 = recordControlsWidget.t1;
                    if (animatorSet7 != null) {
                        animatorSet7.setInterpolator(recordControlsWidget.z1());
                    }
                    AnimatorSet animatorSet8 = recordControlsWidget.t1;
                    if (animatorSet8 != null) {
                        animatorSet8.playTogether(c79VarJ);
                    }
                    AnimatorSet animatorSet9 = recordControlsWidget.t1;
                    if (animatorSet9 != null) {
                        animatorSet9.start();
                    }
                } else {
                    View view2 = recordControlsWidget.getView();
                    if (view2 != null) {
                        p0m.a(view2, lt7Var);
                    }
                    recordControlsWidget.J1(true);
                }
                recordControlsWidget.J = 100.0f;
            } else {
                if (recordControlsWidget.G == null) {
                    recordControlsWidget.G = Float.valueOf(recordControlsWidget.u1().getX());
                }
                recordControlsWidget.u1().setX(recordControlsWidget.w1 - ((recordControlsWidget.u1().getMeasuredWidth() / 2) - (recordControlsWidget.r1().getMeasuredWidth() / 2)));
                recordControlsWidget.A1().setTranslationX(recordControlsWidget.u1().getTranslationX() - (yl5.d().getDisplayMetrics().density * 4.0f));
                recordControlsWidget.H = new ylc(Float.valueOf(recordControlsWidget.u1().getX()), Float.valueOf(recordControlsWidget.u1().getY()));
                recordControlsWidget.I = new ylc(Float.valueOf(recordControlsWidget.A1().getTranslationX()), Float.valueOf(recordControlsWidget.A1().getTranslationY()));
                int i = uw8.a;
                Integer numValueOf = Integer.valueOf(uw8.a(recordControlsWidget.getContext()));
                if (!uw8.b(uw8.c)) {
                    numValueOf = null;
                }
                recordControlsWidget.X = zo5.D(10.0f, yl5.d().getDisplayMetrics().density, zo5.D(124.0f, yl5.d().getDisplayMetrics().density, wk8.t(recordControlsWidget.getContext()) - (numValueOf != null ? numValueOf.intValue() : 0)));
                recordControlsWidget.requireActivity().getWindow().addFlags(np0.m);
                ((x96) ny8Var.getValue()).a(0.0f);
                recordControlsWidget.L1(true);
                recordControlsWidget.q1 = yab.i0(recordControlsWidget.getViewLifecycleScope(), null, 0, new gce(recordControlsWidget, (lq4) null, 1), 3);
                View view3 = recordControlsWidget.getView();
                if (view3 != null) {
                    p0m.a(view3, lt7Var);
                }
            }
        } else if (dceVar instanceof cce) {
            cce cceVar = (cce) dceVar;
            boolean z2 = cceVar.a;
            boolean z3 = cceVar.b;
            ycj ycjVar2 = recordControlsWidget.v;
            if (ycjVar2 != null) {
                yc0 waveView = ycjVar2.getWaveView();
                waveView.l.reset();
                waveView.o = 0L;
                waveView.e = 0.0f;
                waveView.invalidate();
            }
            recordControlsWidget.J = 0.0f;
            recordControlsWidget.K = 0.0f;
            ((x96) ny8Var.getValue()).a(0.0f);
            recordControlsWidget.M1();
            recordControlsWidget.requireActivity().getWindow().clearFlags(np0.m);
            mt7 mt7Var = mt7.REJECT;
            if (z2) {
                View view4 = recordControlsWidget.getView();
                if (view4 != null) {
                    p0m.a(view4, mt7Var);
                }
                AnimatorSet animatorSet10 = recordControlsWidget.t1;
                if (animatorSet10 != null && animatorSet10.isRunning()) {
                    AnimatorSet animatorSet11 = recordControlsWidget.t1;
                    if (animatorSet11 != null) {
                        animatorSet11.end();
                    }
                    AnimatorSet animatorSet12 = recordControlsWidget.t1;
                    if (animatorSet12 != null) {
                        animatorSet12.cancel();
                    }
                }
                recordControlsWidget.t1 = new AnimatorSet();
                c79 c79VarW2 = yab.w();
                ycj ycjVar3 = recordControlsWidget.v;
                if (ycjVar3 != null) {
                    c79VarW2.add(fsk.a(ycjVar3, View.ALPHA, 1.0f, 0.0f, 150L, 0L, false, 240));
                }
                if (recordControlsWidget.C1().getVisibility() == 0) {
                    c79VarW2.addAll(fsk.c(recordControlsWidget.C1(), 1.0f, 0.0f, 250L, 0L));
                    c79VarW2.add(fsk.a(recordControlsWidget.C1(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, false, 240));
                } else {
                    c79VarW2.addAll(fsk.c(recordControlsWidget.D1(), 1.0f, 0.0f, 250L, 0L));
                    c79VarW2.add(fsk.a(recordControlsWidget.D1(), View.ALPHA, 1.0f, 0.0f, 250L, 0L, false, 240));
                }
                c79VarW2.addAll(fsk.c(recordControlsWidget.E1(), 1.0f, 0.0f, 250L, 0L));
                ImageView imageViewE1 = recordControlsWidget.E1();
                Property property2 = View.ALPHA;
                c79VarW2.add(fsk.a(imageViewE1, property2, 1.0f, 0.0f, 150L, 0L, false, 240));
                c79VarW2.add(fsk.a(recordControlsWidget.v1(), property2, 1.0f, 0.0f, 250L, 0L, false, 240));
                if (recordControlsWidget.H1() == fbe.b) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(gm0.K(96.0f * yl5.d().getDisplayMetrics().density), gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
                    valueAnimatorOfInt.setDuration(300L);
                    valueAnimatorOfInt.addUpdateListener(new nce(recordControlsWidget, 2));
                    c79VarW2.add(valueAnimatorOfInt);
                }
                c79VarW2.addAll(fsk.c(recordControlsWidget.u1(), 1.0f, 0.0f, 250L, 0L));
                c79VarW2.add(fsk.a(recordControlsWidget.u1(), property2, 1.0f, 0.0f, 150L, 0L, false, 240));
                c79 c79VarJ2 = yab.j(c79VarW2);
                AnimatorSet animatorSet13 = recordControlsWidget.t1;
                if (animatorSet13 != null) {
                    animatorSet13.addListener(new rce(recordControlsWidget, 3));
                }
                AnimatorSet animatorSet14 = recordControlsWidget.t1;
                if (animatorSet14 != null) {
                    animatorSet14.playTogether(c79VarJ2);
                }
                br4 parentController = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget = parentController instanceof MessageWriteWidget ? (MessageWriteWidget) parentController : null;
                if (messageWriteWidget != null && messageWriteWidget.getView() != null) {
                    tha thaVarT1 = messageWriteWidget.t1();
                    ImageView imageView = thaVarT1.k;
                    ny8 ny8Var2 = thaVarT1.i;
                    animatorSet = new AnimatorSet();
                    c79 c79VarW3 = yab.w();
                    c79VarW3.add(fsk.a(thaVarT1.f, property2, 0.0f, 1.0f, 200L, 0L, false, 240));
                    ImageView imageView2 = thaVarT1.b;
                    c79VarW3.addAll(fsk.c(imageView2, 0.0f, 1.0f, 250L, 0L));
                    c79VarW3.add(fsk.a(imageView2, property2, 0.0f, 1.0f, 200L, 0L, false, 240));
                    if (ny8Var2.d()) {
                        c79VarW3.addAll(fsk.c((View) ny8Var2.getValue(), 0.0f, 1.0f, 250L, 0L));
                        c79VarW3.add(fsk.a((View) ny8Var2.getValue(), property2, 0.0f, 1.0f, 200L, 0L, false, 240));
                    }
                    ny8 ny8Var3 = thaVarT1.h;
                    if (ny8Var3.d()) {
                        c79VarW3.addAll(fsk.c((View) ny8Var3.getValue(), 0.0f, 1.0f, 250L, 0L));
                        c79VarW3.add(fsk.a((View) ny8Var3.getValue(), property2, 0.0f, 1.0f, 200L, 50L, false, 224));
                    }
                    ny8 ny8Var4 = thaVarT1.l;
                    if (ny8Var4.d()) {
                        c79VarW3.addAll(fsk.c((View) ny8Var4.getValue(), 0.0f, 1.0f, 250L, 0L));
                        c79VarW3.add(fsk.a((View) ny8Var4.getValue(), property2, 0.0f, 1.0f, 200L, 50L, false, 224));
                    }
                    ny8 ny8Var5 = thaVarT1.m;
                    if (ny8Var5.d()) {
                        c79VarW3.addAll(fsk.c((View) ny8Var5.getValue(), 0.0f, 1.0f, 250L, 0L));
                        c79VarW3.add(fsk.a((View) ny8Var5.getValue(), property2, 0.0f, 1.0f, 200L, 50L, false, 224));
                    }
                    c79VarW3.addAll(fsk.c(imageView, 0.0f, 1.0f, 250L, 0L));
                    c79VarW3.add(fsk.a(imageView, property2, 0.0f, 1.0f, 250L, 0L, false, 240));
                    c79 c79VarJ3 = yab.j(c79VarW3);
                    animatorSet.addListener(new rha(thaVarT1, ny8Var2, 1));
                    animatorSet.addListener(new qha(thaVarT1, 3));
                    animatorSet.playTogether(c79VarJ3);
                }
                AnimatorSet animatorSet15 = recordControlsWidget.t1;
                if (animatorSet15 != null) {
                    animatorSet15.playTogether(animatorSet);
                }
                AnimatorSet animatorSet16 = recordControlsWidget.t1;
                if (animatorSet16 != null) {
                    animatorSet16.setInterpolator(recordControlsWidget.z1());
                }
                AnimatorSet animatorSet17 = recordControlsWidget.t1;
                if (animatorSet17 != null) {
                    animatorSet17.start();
                }
            } else if (z3) {
                View view5 = recordControlsWidget.getView();
                if (view5 != null) {
                    p0m.a(view5, mt7Var);
                }
                AnimatorSet animatorSet18 = recordControlsWidget.t1;
                if (animatorSet18 != null && animatorSet18.isRunning()) {
                    AnimatorSet animatorSet19 = recordControlsWidget.t1;
                    if (animatorSet19 != null) {
                        animatorSet19.end();
                    }
                    AnimatorSet animatorSet20 = recordControlsWidget.t1;
                    if (animatorSet20 != null) {
                        animatorSet20.cancel();
                    }
                }
                recordControlsWidget.N1();
                recordControlsWidget.t1 = new AnimatorSet();
                c79 c79VarW4 = yab.w();
                View viewX1 = recordControlsWidget.x1();
                Property property3 = View.ALPHA;
                ObjectAnimator objectAnimatorA = fsk.a(viewX1, property3, recordControlsWidget.x1().getAlpha(), 0.0f, 150L, 100L, false, 224);
                objectAnimatorA.addListener(new rce(recordControlsWidget, 2));
                c79VarW4.add(objectAnimatorA);
                c79VarW4.addAll(fsk.c(recordControlsWidget.G1(), 0.0f, 1.4f, 200L, 250L));
                c79VarW4.addAll(fsk.c(recordControlsWidget.G1(), 1.4f, 0.7f, 100L, 450L));
                c79VarW4.addAll(fsk.c(recordControlsWidget.G1(), 0.7f, 1.0f, 100L, 550L));
                c79VarW4.addAll(fsk.c(recordControlsWidget.G1(), 1.0f, 0.0f, 300L, 700L));
                c79VarW4.add(fsk.a(recordControlsWidget.G1(), property3, 1.0f, 0.0f, 150L, 700L, false, 224));
                c79VarW4.add(fsk.a(recordControlsWidget.w1(), property3, recordControlsWidget.w1().getAlpha(), 0.0f, 200L, 0L, false, 240));
                if (recordControlsWidget.w1().getTranslationX() == 0.0f) {
                    c79VarW4.add(fsk.a(recordControlsWidget.w1(), View.TRANSLATION_X, 0.0f, yl5.d().getDisplayMetrics().density * (-20.0f), 200L, 0L, false, 240));
                }
                c79VarW4.add(fsk.a(recordControlsWidget.y1(), property3, 1.0f, 0.0f, 200L, 100L, false, 224));
                c79VarW4.addAll(fsk.c(recordControlsWidget.u1(), recordControlsWidget.u1().getScaleX(), 0.4f, 150L, 0L));
                c79VarW4.add(fsk.a(recordControlsWidget.u1(), property3, 1.0f, 0.0f, 150L, 0L, false, 240));
                c79VarW4.addAll(fsk.c(recordControlsWidget.A1(), 1.0f, 0.0f, 200L, 100L));
                c79VarW4.add(fsk.a(recordControlsWidget.A1(), property3, 1.0f, 0.0f, 200L, 100L, false, 224));
                c79 c79VarJ4 = yab.j(c79VarW4);
                AnimatorSet animatorSet21 = recordControlsWidget.t1;
                if (animatorSet21 != null) {
                    animatorSet21.addListener(new rce(recordControlsWidget, 1));
                }
                AnimatorSet animatorSet22 = recordControlsWidget.t1;
                if (animatorSet22 != null) {
                    animatorSet22.playTogether(c79VarJ4);
                }
                br4 parentController2 = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget2 = parentController2 instanceof MessageWriteWidget ? (MessageWriteWidget) parentController2 : null;
                if (messageWriteWidget2 != null && messageWriteWidget2.getView() != null) {
                    tha thaVarT2 = messageWriteWidget2.t1();
                    ImageView imageView3 = thaVarT2.k;
                    ny8 ny8Var6 = thaVarT2.i;
                    animatorSet = new AnimatorSet();
                    c79 c79VarW5 = yab.w();
                    c79VarW5.add(fsk.a(thaVarT2.f, View.TRANSLATION_X, yl5.d().getDisplayMetrics().density * 44.0f, 0.0f, 300L, 250L, false, 224));
                    c79VarW5.add(fsk.a(thaVarT2.f, property3, 0.0f, 1.0f, 300L, 250L, false, 224));
                    ImageView imageView4 = thaVarT2.b;
                    c79VarW5.add(fsk.a(imageView4, property3, 0.0f, 1.0f, 150L, 850L, false, 224));
                    c79VarW5.addAll(fsk.c(imageView4, 0.0f, 1.0f, 300L, 700L));
                    if (ny8Var6.d()) {
                        c79VarW5.add(fsk.a((View) ny8Var6.getValue(), property3, 0.0f, 1.0f, 150L, 850L, false, 224));
                        c79VarW5.addAll(fsk.c((View) ny8Var6.getValue(), 0.0f, 1.0f, 300L, 700L));
                    }
                    c79VarW5.add(fsk.a(imageView3, property3, 0.0f, 1.0f, 200L, 350L, false, 224));
                    c79VarW5.addAll(fsk.c(imageView3, 0.0f, 1.0f, 300L, 250L));
                    ny8 ny8Var7 = thaVarT2.h;
                    if (ny8Var7.d()) {
                        c79VarW5.add(fsk.a((View) ny8Var7.getValue(), property3, 0.0f, 1.0f, 200L, 350L, false, 224));
                        c79VarW5.addAll(fsk.c((View) ny8Var7.getValue(), 0.0f, 1.0f, 300L, 250L));
                    }
                    ny8 ny8Var8 = thaVarT2.l;
                    if (ny8Var8.d()) {
                        c79VarW5.add(fsk.a((View) ny8Var8.getValue(), property3, 0.0f, 1.0f, 200L, 350L, false, 224));
                        c79VarW5.addAll(fsk.c((View) ny8Var8.getValue(), 0.0f, 1.0f, 300L, 250L));
                    }
                    ny8 ny8Var9 = thaVarT2.m;
                    if (ny8Var9.d()) {
                        c79VarW5.add(fsk.a((View) ny8Var9.getValue(), property3, 0.0f, 1.0f, 200L, 350L, false, 224));
                        c79VarW5.addAll(fsk.c((View) ny8Var9.getValue(), 0.0f, 1.0f, 300L, 250L));
                    }
                    c79 c79VarJ5 = yab.j(c79VarW5);
                    animatorSet.addListener(new rha(thaVarT2, ny8Var6, 0));
                    animatorSet.addListener(new qha(thaVarT2, 2));
                    animatorSet.playTogether(c79VarJ5);
                }
                AnimatorSet animatorSet23 = recordControlsWidget.t1;
                if (animatorSet23 != null) {
                    animatorSet23.playTogether(animatorSet);
                }
                AnimatorSet animatorSet24 = recordControlsWidget.t1;
                if (animatorSet24 != null) {
                    animatorSet24.setInterpolator(recordControlsWidget.z1());
                }
                AnimatorSet animatorSet25 = recordControlsWidget.t1;
                if (animatorSet25 != null) {
                    animatorSet25.start();
                }
            } else {
                AnimatorSet animatorSet26 = recordControlsWidget.t1;
                if (animatorSet26 != null && animatorSet26.isRunning()) {
                    AnimatorSet animatorSet27 = recordControlsWidget.t1;
                    if (animatorSet27 != null) {
                        animatorSet27.end();
                    }
                    AnimatorSet animatorSet28 = recordControlsWidget.t1;
                    if (animatorSet28 != null) {
                        animatorSet28.cancel();
                    }
                }
                recordControlsWidget.N1();
                recordControlsWidget.t1 = new AnimatorSet();
                c79 c79VarW6 = yab.w();
                View viewX2 = recordControlsWidget.x1();
                Property property4 = View.ALPHA;
                c79VarW6.add(fsk.a(viewX2, property4, recordControlsWidget.x1().getAlpha(), 0.0f, 300L, 100L, false, 224));
                View viewX3 = recordControlsWidget.x1();
                Property property5 = View.TRANSLATION_X;
                c79VarW6.add(fsk.a(viewX3, property5, 0.0f, yl5.d().getDisplayMetrics().density * 72.0f, 300L, 100L, false, 224));
                c79VarW6.add(fsk.a(recordControlsWidget.y1(), property4, 1.0f, 0.0f, 300L, 100L, false, 224));
                c79VarW6.add(fsk.a(recordControlsWidget.y1(), property5, 0.0f, yl5.d().getDisplayMetrics().density * 72.0f, 300L, 100L, false, 224));
                c79VarW6.add(fsk.a(recordControlsWidget.w1(), property4, recordControlsWidget.w1().getAlpha(), 0.0f, 250L, 0L, false, 240));
                if (recordControlsWidget.w1().getTranslationX() == 0.0f) {
                    c79VarW6.add(fsk.a(recordControlsWidget.w1(), property5, 0.0f, yl5.d().getDisplayMetrics().density * 70.0f, 300L, 50L, false, 224));
                }
                c79VarW6.addAll(fsk.c(recordControlsWidget.t1(), recordControlsWidget.t1().getScaleX(), 0.0f, 300L, 150L));
                c79VarW6.add(fsk.a(recordControlsWidget.u1(), property4, 1.0f, 0.0f, 300L, 150L, false, 224));
                ImageView imageViewR1 = recordControlsWidget.r1();
                a8g a8gVar = pq3.j;
                a8gVar.h(imageViewR1);
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, a8gVar.h(recordControlsWidget.r1()).getIcon().e);
                valueAnimatorOfArgb.setStartDelay(100L);
                valueAnimatorOfArgb.setDuration(300L);
                valueAnimatorOfArgb.addUpdateListener(new nce(recordControlsWidget, 0));
                c79VarW6.add(valueAnimatorOfArgb);
                c79VarW6.add(fsk.a(recordControlsWidget.A1(), View.TRANSLATION_Y, recordControlsWidget.A1().getTranslationY(), (-48.0f) - (yl5.d().getDisplayMetrics().density * 2.0f), 200L, 50L, false, 224));
                c79VarW6.add(fsk.a(recordControlsWidget.A1(), property4, 1.0f, 0.0f, 200L, 0L, false, 240));
                c79 c79VarJ6 = yab.j(c79VarW6);
                AnimatorSet animatorSet29 = recordControlsWidget.t1;
                if (animatorSet29 != null) {
                    animatorSet29.addListener(new rce(recordControlsWidget, 0));
                }
                AnimatorSet animatorSet30 = recordControlsWidget.t1;
                if (animatorSet30 != null) {
                    animatorSet30.playTogether(c79VarJ6);
                }
                br4 parentController3 = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget3 = parentController3 instanceof MessageWriteWidget ? (MessageWriteWidget) parentController3 : null;
                if (messageWriteWidget3 != null && messageWriteWidget3.getView() != null) {
                    tha thaVarT3 = messageWriteWidget3.t1();
                    thaVarT3.getClass();
                    animatorSet = new AnimatorSet();
                    c79 c79VarW7 = yab.w();
                    c79VarW7.add(fsk.a(thaVarT3.f, property5, yl5.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, false, 224));
                    c79VarW7.add(fsk.a(thaVarT3.f, property4, 0.0f, 1.0f, 300L, 250L, false, 224));
                    ImageView imageView5 = thaVarT3.b;
                    c79VarW7.add(fsk.a(imageView5, property5, yl5.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, false, 224));
                    c79VarW7.add(fsk.a(imageView5, property4, 0.0f, 1.0f, 300L, 250L, false, 224));
                    ImageView imageView6 = thaVarT3.k;
                    c79VarW7.add(fsk.a(imageView6, property4, 0.0f, 1.0f, 200L, 250L, false, 224));
                    c79VarW7.addAll(fsk.c(imageView6, 0.0f, 1.0f, 300L, 250L));
                    ny8 ny8Var10 = thaVarT3.i;
                    if (ny8Var10.d()) {
                        c79VarW7.add(fsk.a((View) ny8Var10.getValue(), property5, yl5.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, false, 224));
                        c79VarW7.add(fsk.a((View) ny8Var10.getValue(), property4, 0.0f, 1.0f, 300L, 250L, false, 224));
                    }
                    ny8 ny8Var11 = thaVarT3.h;
                    if (ny8Var11.d()) {
                        c79VarW7.add(fsk.a((View) ny8Var11.getValue(), property4, 0.0f, 1.0f, 200L, 250L, false, 224));
                        c79VarW7.addAll(fsk.c((View) ny8Var11.getValue(), 0.0f, 1.0f, 300L, 250L));
                    }
                    ny8 ny8Var12 = thaVarT3.l;
                    if (ny8Var12.d()) {
                        c79VarW7.add(fsk.a((View) ny8Var12.getValue(), property4, 0.0f, 1.0f, 200L, 250L, false, 224));
                        c79VarW7.addAll(fsk.c((View) ny8Var12.getValue(), 0.0f, 1.0f, 300L, 250L));
                    }
                    ny8 ny8Var13 = thaVarT3.m;
                    if (ny8Var13.d()) {
                        c79VarW7.add(fsk.a((View) ny8Var13.getValue(), property4, 0.0f, 1.0f, 200L, 250L, false, 224));
                        c79VarW7.addAll(fsk.c((View) ny8Var13.getValue(), 0.0f, 1.0f, 300L, 250L));
                    }
                    c79 c79VarJ7 = yab.j(c79VarW7);
                    animatorSet.addListener(new qha(thaVarT3, 1));
                    animatorSet.addListener(new qha(thaVarT3, 0));
                    animatorSet.playTogether(c79VarJ7);
                }
                AnimatorSet animatorSet31 = recordControlsWidget.t1;
                if (animatorSet31 != null) {
                    animatorSet31.playTogether(animatorSet);
                }
                AnimatorSet animatorSet32 = recordControlsWidget.t1;
                if (animatorSet32 != null) {
                    animatorSet32.setInterpolator(recordControlsWidget.z1());
                }
                AnimatorSet animatorSet33 = recordControlsWidget.t1;
                if (animatorSet33 != null) {
                    animatorSet33.start();
                }
            }
        } else if (dceVar instanceof zbe) {
            boolean z4 = ((zbe) dceVar).a;
            View view6 = recordControlsWidget.getView();
            if (view6 != null) {
                p0m.a(view6, lt7Var);
            }
            if (z4) {
                recordControlsWidget.L1(false);
                AnimatorSet animatorSet34 = recordControlsWidget.t1;
                if (animatorSet34 != null) {
                    animatorSet34.end();
                }
                recordControlsWidget.J1(true);
                AnimatorSet animatorSet35 = recordControlsWidget.t1;
                if (animatorSet35 != null) {
                    animatorSet35.end();
                }
                recordControlsWidget.K1();
                AnimatorSet animatorSet36 = recordControlsWidget.t1;
                if (animatorSet36 != null) {
                    animatorSet36.end();
                }
                recordControlsWidget.M1();
            } else {
                recordControlsWidget.K1();
            }
        } else if (dceVar instanceof ace) {
            ace aceVar = (ace) dceVar;
            boolean z5 = aceVar.a;
            boolean z6 = aceVar.b;
            View view7 = recordControlsWidget.getView();
            if (view7 != null) {
                p0m.a(view7, lt7Var);
            }
            if (z5) {
                if (z6) {
                    recordControlsWidget.L1(false);
                    AnimatorSet animatorSet37 = recordControlsWidget.t1;
                    if (animatorSet37 != null) {
                        animatorSet37.end();
                    }
                    recordControlsWidget.J1(true);
                    AnimatorSet animatorSet38 = recordControlsWidget.t1;
                    if (animatorSet38 != null) {
                        animatorSet38.end();
                    }
                    recordControlsWidget.K1();
                    AnimatorSet animatorSet39 = recordControlsWidget.t1;
                    if (animatorSet39 != null) {
                        animatorSet39.end();
                    }
                }
                AnimatorSet animatorSet40 = recordControlsWidget.t1;
                if (animatorSet40 != null && animatorSet40.isRunning()) {
                    AnimatorSet animatorSet41 = recordControlsWidget.t1;
                    if (animatorSet41 != null) {
                        animatorSet41.end();
                    }
                    AnimatorSet animatorSet42 = recordControlsWidget.t1;
                    if (animatorSet42 != null) {
                        animatorSet42.cancel();
                    }
                }
                recordControlsWidget.t1 = new AnimatorSet();
                c79 c79VarW8 = yab.w();
                if (recordControlsWidget.C1().getVisibility() == 0) {
                    c79VarW8.addAll(fsk.c(recordControlsWidget.C1(), 1.0f, 0.5f, 150L, 0L));
                    c79VarW8.add(fsk.a(recordControlsWidget.C1(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, false, 240));
                } else if (recordControlsWidget.D1().getVisibility() == 0) {
                    c79VarW8.addAll(fsk.c(recordControlsWidget.D1(), 1.0f, 0.5f, 150L, 0L));
                    c79VarW8.add(fsk.a(recordControlsWidget.D1(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, false, 240));
                }
                ycj ycjVar4 = recordControlsWidget.v;
                if (ycjVar4 != null) {
                    c79VarW8.addAll(ycjVar4.getResumeAnimations());
                }
                c79 c79VarJ8 = yab.j(c79VarW8);
                AnimatorSet animatorSet43 = recordControlsWidget.t1;
                if (animatorSet43 != null) {
                    animatorSet43.addListener(new rce(recordControlsWidget, 5));
                }
                AnimatorSet animatorSet44 = recordControlsWidget.t1;
                if (animatorSet44 != null) {
                    animatorSet44.addListener(new rce(recordControlsWidget, 4));
                }
                AnimatorSet animatorSet45 = recordControlsWidget.t1;
                if (animatorSet45 != null) {
                    animatorSet45.setInterpolator(recordControlsWidget.z1());
                }
                AnimatorSet animatorSet46 = recordControlsWidget.t1;
                if (animatorSet46 != null) {
                    animatorSet46.playTogether(c79VarJ8);
                }
                AnimatorSet animatorSet47 = recordControlsWidget.t1;
                if (animatorSet47 != null) {
                    animatorSet47.start();
                }
            } else {
                recordControlsWidget.J1(false);
            }
        } else if (!(dceVar instanceof ybe)) {
            ore.o();
            return null;
        }
        return sbi.a;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Integer numValueOf;
        m8b m8bVar;
        switch (this.a) {
            case 0:
                ChatScreen chatScreen = (ChatScreen) this.c;
                int iD = qt4.D(((wka) this.b).b);
                if (iD == 1) {
                    ou7 ou7Var = ChatScreen.L1;
                    MessageWriteWidget messageWriteWidgetV1 = chatScreen.V1();
                    if (messageWriteWidgetV1 != null) {
                        messageWriteWidgetV1.K1();
                    }
                } else if (iD == 2) {
                    ou7 ou7Var2 = ChatScreen.L1;
                    nma.L(chatScreen.U1(), chatScreen.Q1().getVisibility() == 0, 2);
                }
                return sbi.a;
            case 1:
                vo5 vo5Var = (vo5) ((tz7) this.b).c.getValue();
                String str = (String) this.c;
                ghb ghbVar = ew5.b;
                return Boolean.valueOf(vo5Var.b(qe7.P(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, lw5.MILLISECONDS), str));
            case 2:
                w08 w08Var = (w08) this.c;
                z08 z08Var = (z08) this.b;
                try {
                    if (!z08Var.b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (z08Var.b(false, this)) {
                    }
                    w08Var.b(1, 9, null);
                    uqi.d(z08Var);
                    return sbi.a;
                } catch (IOException e) {
                    w08Var.b(2, 2, e);
                } catch (Throwable th) {
                    w08Var.b(3, 3, null);
                    uqi.d(z08Var);
                    throw th;
                }
                break;
            case 3:
                t6e t6eVar = (t6e) this.b;
                RecyclerView recyclerView = t6eVar.a.e;
                bdc.a(recyclerView, new og7(recyclerView, (r6e) this.c, t6eVar, 21));
                return sbi.a;
            case 4:
                return a();
            case 5:
                w5f w5fVar = (w5f) this.b;
                r5f r5fVar = (r5f) this.c;
                j5f j5fVarD = w5fVar.d(r5fVar);
                w5f.a(r5fVar, w5fVar.i, w5fVar.h, new v5f(j5fVarD, w5fVar, r5fVar, w5fVar, j5fVarD));
                return Boolean.TRUE;
            case 6:
                StoriesWriteBarWidget storiesWriteBarWidget = (StoriesWriteBarWidget) this.c;
                int iD2 = qt4.D(((wka) this.b).b);
                if (iD2 == 1) {
                    zv8[] zv8VarArr = StoriesWriteBarWidget.n;
                    MessageWriteWidget messageWriteWidgetT1 = storiesWriteBarWidget.t1();
                    if (messageWriteWidgetT1 != null) {
                        messageWriteWidgetT1.K1();
                    }
                } else if (iD2 == 2) {
                    zv8[] zv8VarArr2 = StoriesWriteBarWidget.n;
                    nma.L(storiesWriteBarWidget.s1(), false, 3);
                }
                return sbi.a;
            default:
                uik uikVar = ((fvj) this.b).u;
                long j = ((hyd) this.c).a;
                PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) uikVar.b;
                zv8[] zv8VarArr3 = PublishStoryBottomSheet.t;
                nyd nydVarE1 = publishStoryBottomSheet.E1();
                String str2 = nydVarE1.f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, zo5.j(j, "onItemTrailingIconClick: id: "), null);
                    }
                }
                long j2 = R.id.oneme_stories_preset_whitelist_favorites_item;
                if (j == j2) {
                    numValueOf = Integer.valueOf(R.string.sticker_settings_favorites);
                } else {
                    numValueOf = j == ((long) R.id.oneme_stories_preset_blacklist_hide_from_item) ? Integer.valueOf(R.string.oneme_stories_blacklist_hide_from_title) : null;
                }
                if (j == j2) {
                    m8bVar = nydVarE1.u;
                } else {
                    m8bVar = j == ((long) R.id.oneme_stories_preset_blacklist_hide_from_item) ? nydVarE1.v : null;
                }
                if (numValueOf != null) {
                    ic6 ic6Var = nydVarE1.g;
                    if (m8bVar != null) {
                        psg psgVar = psg.b;
                        int iIntValue = numValueOf.intValue();
                        List listF0 = rx8.f0(m8bVar);
                        psgVar.getClass();
                        bc1.q(zo5.i(iIntValue, ":stories/publish/picker?title=", "&preselected_ids=", ww3.z1(listF0, ",", null, null, null, 62)), ic6Var);
                    } else {
                        psg psgVar2 = psg.b;
                        int iIntValue2 = numValueOf.intValue();
                        psgVar2.getClass();
                        bc1.q(":stories/publish/picker?title=" + iIntValue2, ic6Var);
                    }
                } else {
                    String str3 = nydVarE1.f;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str3, nbh.s(j, "onItemTrailingIconClick: id: ", ", has no effect"), null);
                        }
                    }
                }
                return sbi.a;
        }
    }

    public /* synthetic */ gb3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
