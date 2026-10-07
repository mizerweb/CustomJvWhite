package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u0i extends ViewGroup implements eph {
    public static final ny8 t = rx8.P(3, new yvg(22));
    public final EnhancedAnimatedVectorDrawable a;
    public final ImageView b;
    public final ImageView c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final PathMeasure i;
    public final RectF j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public int o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;

    public u0i(Context context) {
        super(context, null);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.transctipt_loading_avd);
        this.a = enhancedAnimatedVectorDrawable;
        ImageView imageView = new ImageView(context);
        final int i = 0;
        imageView.setVisibility(0);
        imageView.setImageDrawable(enhancedAnimatedVectorDrawable);
        this.b = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.icon_cross);
        imageView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f));
        imageView2.setVisibility(8);
        this.c = imageView2;
        final int i2 = 1;
        this.d = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        this.f = paint2;
        this.g = new Path();
        this.h = new Path();
        this.i = new PathMeasure();
        this.j = new RectF();
        final int i3 = 3;
        this.k = rx8.P(3, new af7(this) { // from class: o0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i;
                a8g a8gVar = pq3.j;
                final int i5 = 0;
                final int i6 = 1;
                final int i7 = 2;
                final u0i u0iVar = this.b;
                switch (i4) {
                    case 0:
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(1500L);
                        valueAnimatorOfFloat.setRepeatCount(-1);
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i7;
                                u0i u0iVar2 = u0iVar;
                                switch (i8) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat.addListener(new t0i(u0iVar, i5));
                        return valueAnimatorOfFloat;
                    case 1:
                        tac tacVar = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r).a;
                        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(u0iVar.s ? a8gVar.h(u0iVar).t().b : tacVar.e, tacVar.b);
                        valueAnimatorOfArgb.setDuration(167L);
                        ny8 ny8Var = u0i.t;
                        valueAnimatorOfArgb.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i5;
                                u0i u0iVar2 = u0iVar;
                                switch (i8) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb.addListener(new s0i(0));
                        return valueAnimatorOfArgb;
                    case 2:
                        xac xacVarG = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r);
                        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(xacVarG.a.b, xacVarG.c.a);
                        valueAnimatorOfArgb2.setDuration(167L);
                        ny8 ny8Var2 = u0i.t;
                        valueAnimatorOfArgb2.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i6;
                                u0i u0iVar2 = u0iVar;
                                switch (i8) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb2.addListener(new s0i(1));
                        return valueAnimatorOfArgb2;
                    default:
                        AnimatorSet animatorSet = new AnimatorSet();
                        c79 c79VarW = yab.w();
                        ImageView imageView3 = u0iVar.c;
                        c79VarW.addAll(fsk.c(imageView3, 1.0f, 0.0f, 167L, 0L));
                        Property property = ViewGroup.ALPHA;
                        c79VarW.add(fsk.a(imageView3, property, 1.0f, 0.0f, 167L, 0L, false, 240));
                        ImageView imageView4 = u0iVar.b;
                        c79VarW.addAll(fsk.c(imageView4, 0.0f, 1.0f, 167L, 0L));
                        c79VarW.add(fsk.a(imageView4, property, 0.0f, 1.0f, 167L, 0L, false, 240));
                        animatorSet.playTogether(yab.j(c79VarW));
                        animatorSet.addListener(new t0i(u0iVar, i7));
                        animatorSet.addListener(new t0i(u0iVar, i6));
                        animatorSet.addListener(new s0i(2));
                        ny8 ny8Var3 = u0i.t;
                        animatorSet.setInterpolator((PathInterpolator) u0i.t.getValue());
                        return animatorSet;
                }
            }
        });
        this.l = rx8.P(3, new af7(this) { // from class: o0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i2;
                a8g a8gVar = pq3.j;
                final int i5 = 0;
                final int i6 = 1;
                final int i7 = 2;
                final u0i u0iVar = this.b;
                switch (i4) {
                    case 0:
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(1500L);
                        valueAnimatorOfFloat.setRepeatCount(-1);
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i7;
                                u0i u0iVar2 = u0iVar;
                                switch (i8) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat.addListener(new t0i(u0iVar, i5));
                        return valueAnimatorOfFloat;
                    case 1:
                        tac tacVar = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r).a;
                        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(u0iVar.s ? a8gVar.h(u0iVar).t().b : tacVar.e, tacVar.b);
                        valueAnimatorOfArgb.setDuration(167L);
                        ny8 ny8Var = u0i.t;
                        valueAnimatorOfArgb.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i5;
                                u0i u0iVar2 = u0iVar;
                                switch (i8) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb.addListener(new s0i(0));
                        return valueAnimatorOfArgb;
                    case 2:
                        xac xacVarG = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r);
                        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(xacVarG.a.b, xacVarG.c.a);
                        valueAnimatorOfArgb2.setDuration(167L);
                        ny8 ny8Var2 = u0i.t;
                        valueAnimatorOfArgb2.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i8 = i6;
                                u0i u0iVar2 = u0iVar;
                                switch (i8) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb2.addListener(new s0i(1));
                        return valueAnimatorOfArgb2;
                    default:
                        AnimatorSet animatorSet = new AnimatorSet();
                        c79 c79VarW = yab.w();
                        ImageView imageView3 = u0iVar.c;
                        c79VarW.addAll(fsk.c(imageView3, 1.0f, 0.0f, 167L, 0L));
                        Property property = ViewGroup.ALPHA;
                        c79VarW.add(fsk.a(imageView3, property, 1.0f, 0.0f, 167L, 0L, false, 240));
                        ImageView imageView4 = u0iVar.b;
                        c79VarW.addAll(fsk.c(imageView4, 0.0f, 1.0f, 167L, 0L));
                        c79VarW.add(fsk.a(imageView4, property, 0.0f, 1.0f, 167L, 0L, false, 240));
                        animatorSet.playTogether(yab.j(c79VarW));
                        animatorSet.addListener(new t0i(u0iVar, i7));
                        animatorSet.addListener(new t0i(u0iVar, i6));
                        animatorSet.addListener(new s0i(2));
                        ny8 ny8Var3 = u0i.t;
                        animatorSet.setInterpolator((PathInterpolator) u0i.t.getValue());
                        return animatorSet;
                }
            }
        });
        final int i4 = 2;
        this.m = rx8.P(3, new af7(this) { // from class: o0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                a8g a8gVar = pq3.j;
                final int i6 = 0;
                final int i7 = 1;
                final int i8 = 2;
                final u0i u0iVar = this.b;
                switch (i5) {
                    case 0:
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(1500L);
                        valueAnimatorOfFloat.setRepeatCount(-1);
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i9 = i8;
                                u0i u0iVar2 = u0iVar;
                                switch (i9) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat.addListener(new t0i(u0iVar, i6));
                        return valueAnimatorOfFloat;
                    case 1:
                        tac tacVar = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r).a;
                        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(u0iVar.s ? a8gVar.h(u0iVar).t().b : tacVar.e, tacVar.b);
                        valueAnimatorOfArgb.setDuration(167L);
                        ny8 ny8Var = u0i.t;
                        valueAnimatorOfArgb.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i9 = i6;
                                u0i u0iVar2 = u0iVar;
                                switch (i9) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb.addListener(new s0i(0));
                        return valueAnimatorOfArgb;
                    case 2:
                        xac xacVarG = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r);
                        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(xacVarG.a.b, xacVarG.c.a);
                        valueAnimatorOfArgb2.setDuration(167L);
                        ny8 ny8Var2 = u0i.t;
                        valueAnimatorOfArgb2.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i9 = i7;
                                u0i u0iVar2 = u0iVar;
                                switch (i9) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb2.addListener(new s0i(1));
                        return valueAnimatorOfArgb2;
                    default:
                        AnimatorSet animatorSet = new AnimatorSet();
                        c79 c79VarW = yab.w();
                        ImageView imageView3 = u0iVar.c;
                        c79VarW.addAll(fsk.c(imageView3, 1.0f, 0.0f, 167L, 0L));
                        Property property = ViewGroup.ALPHA;
                        c79VarW.add(fsk.a(imageView3, property, 1.0f, 0.0f, 167L, 0L, false, 240));
                        ImageView imageView4 = u0iVar.b;
                        c79VarW.addAll(fsk.c(imageView4, 0.0f, 1.0f, 167L, 0L));
                        c79VarW.add(fsk.a(imageView4, property, 0.0f, 1.0f, 167L, 0L, false, 240));
                        animatorSet.playTogether(yab.j(c79VarW));
                        animatorSet.addListener(new t0i(u0iVar, i8));
                        animatorSet.addListener(new t0i(u0iVar, i7));
                        animatorSet.addListener(new s0i(2));
                        ny8 ny8Var3 = u0i.t;
                        animatorSet.setInterpolator((PathInterpolator) u0i.t.getValue());
                        return animatorSet;
                }
            }
        });
        this.n = rx8.P(3, new af7(this) { // from class: o0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i3;
                a8g a8gVar = pq3.j;
                final int i6 = 0;
                final int i7 = 1;
                final int i8 = 2;
                final u0i u0iVar = this.b;
                switch (i5) {
                    case 0:
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(1500L);
                        valueAnimatorOfFloat.setRepeatCount(-1);
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i9 = i8;
                                u0i u0iVar2 = u0iVar;
                                switch (i9) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat.addListener(new t0i(u0iVar, i6));
                        return valueAnimatorOfFloat;
                    case 1:
                        tac tacVar = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r).a;
                        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(u0iVar.s ? a8gVar.h(u0iVar).t().b : tacVar.e, tacVar.b);
                        valueAnimatorOfArgb.setDuration(167L);
                        ny8 ny8Var = u0i.t;
                        valueAnimatorOfArgb.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i9 = i6;
                                u0i u0iVar2 = u0iVar;
                                switch (i9) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb.addListener(new s0i(0));
                        return valueAnimatorOfArgb;
                    case 2:
                        xac xacVarG = f55.g(a8gVar.h(u0iVar).f(), u0iVar.r);
                        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(xacVarG.a.b, xacVarG.c.a);
                        valueAnimatorOfArgb2.setDuration(167L);
                        ny8 ny8Var2 = u0i.t;
                        valueAnimatorOfArgb2.setInterpolator((PathInterpolator) u0i.t.getValue());
                        valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p0i
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i9 = i7;
                                u0i u0iVar2 = u0iVar;
                                switch (i9) {
                                    case 0:
                                        u0iVar2.d.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        u0iVar2.invalidate();
                                        break;
                                    case 1:
                                        u0i.a(u0iVar2, valueAnimator);
                                        break;
                                    default:
                                        u0iVar2.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        u0iVar2.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfArgb2.addListener(new s0i(1));
                        return valueAnimatorOfArgb2;
                    default:
                        AnimatorSet animatorSet = new AnimatorSet();
                        c79 c79VarW = yab.w();
                        ImageView imageView3 = u0iVar.c;
                        c79VarW.addAll(fsk.c(imageView3, 1.0f, 0.0f, 167L, 0L));
                        Property property = ViewGroup.ALPHA;
                        c79VarW.add(fsk.a(imageView3, property, 1.0f, 0.0f, 167L, 0L, false, 240));
                        ImageView imageView4 = u0iVar.b;
                        c79VarW.addAll(fsk.c(imageView4, 0.0f, 1.0f, 167L, 0L));
                        c79VarW.add(fsk.a(imageView4, property, 0.0f, 1.0f, 167L, 0L, false, 240));
                        animatorSet.playTogether(yab.j(c79VarW));
                        animatorSet.addListener(new t0i(u0iVar, i8));
                        animatorSet.addListener(new t0i(u0iVar, i7));
                        animatorSet.addListener(new s0i(2));
                        ny8 ny8Var3 = u0i.t;
                        animatorSet.setInterpolator((PathInterpolator) u0i.t.getValue());
                        return animatorSet;
                }
            }
        });
        setId(R.id.messages_list_transcription_button);
        addView(imageView, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f)));
        addView(imageView2, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
        setWillNotDraw(false);
    }

    public static void a(u0i u0iVar, ValueAnimator valueAnimator) {
        u0iVar.setDrawableColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        u0iVar.invalidate();
    }

    private final ValueAnimator getBackgroundColorAnimator() {
        return (ValueAnimator) this.l.getValue();
    }

    private final ValueAnimator getDrawableColorAnimator() {
        return (ValueAnimator) this.m.getValue();
    }

    private final ValueAnimator getLoadingAnimator() {
        return (ValueAnimator) this.k.getValue();
    }

    private final AnimatorSet getLoadingToSuccessAnimatorSet() {
        return (AnimatorSet) this.n.getValue();
    }

    private static /* synthetic */ void getLoadingToSuccessAnimatorSet$annotations() {
    }

    private final void setDrawableColor(int i) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_L_3_G_D_0_P_0", i);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_L_2_G_D_0_P_0", i);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_L_1_G_D_0_P_0", i);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_L_0_G_D_0_P_0", i);
    }

    public final void b(int i, boolean z) {
        if (i == 0) {
            return;
        }
        int i2 = this.o;
        this.o = i;
        a8g a8gVar = pq3.j;
        onThemeChanged(a8gVar.h(this));
        int i3 = 3;
        if (!z) {
            n7j.e(this, new gba(i, this, i3));
        } else if (i2 != 0) {
            EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
            if (enhancedAnimatedVectorDrawable.isRunning()) {
                enhancedAnimatedVectorDrawable.reset();
            }
            if (i2 == 1 && i == 3) {
                enhancedAnimatedVectorDrawable.reset();
                enhancedAnimatedVectorDrawable.setDuration(500L);
                enhancedAnimatedVectorDrawable.start();
            } else if (i2 == 3 && i == 2) {
                enhancedAnimatedVectorDrawable.reset();
                ValueAnimator backgroundColorAnimator = getBackgroundColorAnimator();
                backgroundColorAnimator.cancel();
                backgroundColorAnimator.start();
                AnimatorSet loadingToSuccessAnimatorSet = getLoadingToSuccessAnimatorSet();
                loadingToSuccessAnimatorSet.cancel();
                loadingToSuccessAnimatorSet.start();
                setDrawableColor(f55.g(a8gVar.h(this).f(), this.r).c.a);
            } else if (i2 == 3 && i == 1) {
                enhancedAnimatedVectorDrawable.onEnd();
                enhancedAnimatedVectorDrawable.setDuration(250L);
                enhancedAnimatedVectorDrawable.startReverse();
            } else if (i2 == 2 && i == 1) {
                enhancedAnimatedVectorDrawable.reset();
                ValueAnimator backgroundColorAnimator2 = getBackgroundColorAnimator();
                backgroundColorAnimator2.cancel();
                backgroundColorAnimator2.reverse();
                if (!this.s) {
                    ValueAnimator drawableColorAnimator = getDrawableColorAnimator();
                    drawableColorAnimator.cancel();
                    drawableColorAnimator.reverse();
                }
            } else if (i2 == 1 && i == 2) {
                enhancedAnimatedVectorDrawable.reset();
                ValueAnimator backgroundColorAnimator3 = getBackgroundColorAnimator();
                backgroundColorAnimator3.cancel();
                backgroundColorAnimator3.start();
                if (!this.s) {
                    ValueAnimator drawableColorAnimator2 = getDrawableColorAnimator();
                    drawableColorAnimator2.cancel();
                    drawableColorAnimator2.start();
                }
            }
        }
        if (i != 3) {
            getLoadingAnimator().cancel();
        } else {
            getLoadingAnimator().cancel();
            getLoadingAnimator().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.o;
        if (i != 0) {
            n7j.e(this, new gba(i, this, 3));
            if (i == 3) {
                getLoadingAnimator().start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLoadingAnimator().cancel();
        getBackgroundColorAnimator().cancel();
        getDrawableColorAnimator().cancel();
        getLoadingToSuccessAnimatorSet().cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fC;
        super.onDraw(canvas);
        canvas.drawRoundRect(this.j, yl5.d().getDisplayMetrics().density * 8.0f, yl5.d().getDisplayMetrics().density * 8.0f, this.d);
        if (this.o != 3) {
            return;
        }
        PathMeasure pathMeasure = this.i;
        float length = pathMeasure.getLength();
        float f = this.p;
        float f2 = f * length;
        float f3 = 0.2f * length;
        float f4 = 0.4f * length;
        float f5 = f3 / length;
        if (!this.q || f2 >= f3) {
            this.q = false;
            float f6 = 1.0f - f5;
            float f7 = (f - f5) / (f6 != 0.0f ? f6 : 1.0f);
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            fC = c0a.c(f4, f3, (float) ((Math.sin((((double) (f7 * 2.0f)) * 3.141592653589793d) - 1.5707963267948966d) * 0.5d) + 0.5d), f3);
        } else {
            fC = f2;
        }
        float f8 = f2 - fC;
        Path path = this.h;
        path.reset();
        Paint paint = this.f;
        if (f8 >= 0.0f) {
            pathMeasure.getSegment(f8, f2, path, true);
            canvas.drawPath(path, paint);
            return;
        }
        pathMeasure.getSegment(f8 + length, length, path, true);
        canvas.drawPath(path, paint);
        path.reset();
        pathMeasure.getSegment(0.0f, f2, path, true);
        canvas.drawPath(path, paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() / 2;
        ImageView imageView = this.b;
        qyj.M(imageView, measuredWidth - (imageView.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        qyj.M(this.c, (getMeasuredWidth() / 2) - (imageView.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.b.measure(qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), 1073741824));
        this.c.measure(qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        RectF rectF = this.j;
        rectF.set(0.0f, 0.0f, i, i2);
        Path path = this.g;
        path.reset();
        float f = yl5.d().getDisplayMetrics().density * 8.0f;
        Paint paint = this.e;
        float strokeWidth = f - paint.getStrokeWidth();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float strokeWidth2 = paint.getStrokeWidth();
        float strokeWidth3 = paint.getStrokeWidth();
        float strokeWidth4 = fWidth - paint.getStrokeWidth();
        float strokeWidth5 = fHeight - paint.getStrokeWidth();
        float f2 = (strokeWidth2 + strokeWidth4) / 2.0f;
        path.moveTo(f2, strokeWidth5);
        float f3 = strokeWidth2 + strokeWidth;
        path.lineTo(f3, strokeWidth5);
        float f4 = strokeWidth5 - strokeWidth;
        path.quadTo(strokeWidth2, strokeWidth5, strokeWidth2, f4);
        float f5 = strokeWidth3 + strokeWidth;
        path.lineTo(strokeWidth2, f5);
        path.quadTo(strokeWidth2, strokeWidth3, f3, strokeWidth3);
        float f6 = strokeWidth4 - strokeWidth;
        path.lineTo(f6, strokeWidth3);
        path.quadTo(strokeWidth4, strokeWidth3, strokeWidth4, f5);
        path.lineTo(strokeWidth4, f4);
        path.quadTo(strokeWidth4, strokeWidth5, f6, strokeWidth5);
        path.lineTo(f2, strokeWidth5);
        path.close();
        this.i.setPath(path, true);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i;
        a8g a8gVar = pq3.j;
        xac xacVarG = f55.g(a8gVar.h(this).f(), this.r);
        vac vacVar = xacVarG.d;
        int i2 = xacVarG.c.a;
        tac tacVar = xacVarG.a;
        int i3 = tacVar.b;
        this.e.setColor(vacVar.e);
        this.f.setColor(this.s ? vacVar.c : vacVar.a);
        this.c.setImageTintList(ColorStateList.valueOf(this.s ? i2 : i3));
        if (this.o == 2) {
            i = i3;
        } else {
            i = this.s ? a8gVar.h(this).t().b : tacVar.e;
        }
        this.d.setColor(i);
        if (this.o != 2) {
            if (this.s) {
                a8gVar.h(this);
                i2 = -1;
            } else {
                i2 = i3;
            }
        }
        setDrawableColor(i2);
        invalidate();
    }

    public final void setBackgroundEnabled(boolean z) {
        this.s = z;
    }

    public final void setIncomingMessage(boolean z) {
        this.r = z;
    }
}
