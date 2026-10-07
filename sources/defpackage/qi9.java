package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qi9 implements lwh {
    public final FrameLayout a;
    public final vbi b;
    public final vuf c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 i;
    public float n;
    public boolean o;
    public ValueAnimator s;
    public final GestureDetector t;
    public final ny8 h = rx8.P(3, new bh9(2));
    public final k36 j = new k36(19, this);
    public final PathInterpolator k = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    public final float l = yl5.d().getDisplayMetrics().density * 100.0f;
    public int m = -1;
    public float p = 1.0f;
    public float q = 2.0f;
    public float r = 2.0f;

    public qi9(final Context context, g0d g0dVar, vbi vbiVar, vuf vufVar, ny8 ny8Var) {
        this.a = g0dVar;
        this.b = vbiVar;
        this.c = vufVar;
        this.d = ny8Var;
        this.e = rx8.P(3, new n52(context, 14));
        final int i = 0;
        this.f = rx8.P(3, new af7() { // from class: ni9
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                qi9 qi9Var = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context2, R.drawable.avd_onboarding_speed);
                        enhancedAnimatedVectorDrawable.setCallback(qi9Var.a);
                        return enhancedAnimatedVectorDrawable;
                    default:
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setId(R.id.oneme_longpress_playback_control_view);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.setBackground((GradientDrawable) qi9Var.g.getValue());
                        linearLayout.setOrientation(1);
                        w0c w0cVar = new w0c(context2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        w0cVar.setLayoutParams(layoutParams);
                        w0cVar.setId(R.id.oneme_longpress_playback_control_counter);
                        w0cVar.setTypography(q9i.c);
                        w0cVar.setEndDrawable(qi9Var.e());
                        w0cVar.setNumberFormat(new lh9(1, qi9Var));
                        linearLayout.addView(w0cVar);
                        TextView textView = new TextView(context2);
                        textView.setId(R.id.oneme_longpress_playback_control_hint);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 1;
                        layoutParams2.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f));
                        layoutParams2.setMarginEnd(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.bottomMargin = gm0.K(30.0f * yl5.d().getDisplayMetrics().density);
                        textView.setLayoutParams(layoutParams2);
                        textView.setGravity(17);
                        textView.setText(R.string.oneme_chatmedia_viewer_longpress_playback_speed_hint);
                        pq3.j.l(textView);
                        textView.setTextColor(-1);
                        q9i.a(q9i.i, textView);
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawableD = qi9Var.d();
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, enhancedAnimatedVectorDrawableD);
                        textView.setCompoundDrawablePadding(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.addView(textView);
                        return linearLayout;
                }
            }
        });
        this.g = rx8.P(3, new n52(context, 15));
        final int i2 = 1;
        this.i = rx8.P(3, new af7() { // from class: ni9
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                qi9 qi9Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context2, R.drawable.avd_onboarding_speed);
                        enhancedAnimatedVectorDrawable.setCallback(qi9Var.a);
                        return enhancedAnimatedVectorDrawable;
                    default:
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setId(R.id.oneme_longpress_playback_control_view);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.setBackground((GradientDrawable) qi9Var.g.getValue());
                        linearLayout.setOrientation(1);
                        w0c w0cVar = new w0c(context2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        w0cVar.setLayoutParams(layoutParams);
                        w0cVar.setId(R.id.oneme_longpress_playback_control_counter);
                        w0cVar.setTypography(q9i.c);
                        w0cVar.setEndDrawable(qi9Var.e());
                        w0cVar.setNumberFormat(new lh9(1, qi9Var));
                        linearLayout.addView(w0cVar);
                        TextView textView = new TextView(context2);
                        textView.setId(R.id.oneme_longpress_playback_control_hint);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 1;
                        layoutParams2.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f));
                        layoutParams2.setMarginEnd(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.bottomMargin = gm0.K(30.0f * yl5.d().getDisplayMetrics().density);
                        textView.setLayoutParams(layoutParams2);
                        textView.setGravity(17);
                        textView.setText(R.string.oneme_chatmedia_viewer_longpress_playback_speed_hint);
                        pq3.j.l(textView);
                        textView.setTextColor(-1);
                        q9i.a(q9i.i, textView);
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawableD = qi9Var.d();
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, enhancedAnimatedVectorDrawableD);
                        textView.setCompoundDrawablePadding(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.addView(textView);
                        return linearLayout;
                }
            }
        });
        this.t = new GestureDetector(context, new pi9(i, this));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // defpackage.lwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.MotionEvent r8) {
        /*
            r7 = this;
            android.view.GestureDetector r0 = r7.t
            r0.onTouchEvent(r8)
            boolean r0 = r7.o
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = r8.getAction()
            r2 = 1
            if (r0 == r2) goto Lba
            r3 = 2
            if (r0 == r3) goto L1a
            r8 = 3
            if (r0 == r8) goto Lba
            goto Lb9
        L1a:
            int r0 = r7.m
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L25
            goto Lb9
        L25:
            float r8 = r8.getX()
            float r0 = r7.n
            float r8 = r8 - r0
            float r0 = r7.l
            float r3 = -r0
            float r8 = defpackage.oc9.u(r8, r3, r0)
            float r8 = r8 / r0
            r0 = 1078145843(0x40433333, float:3.05)
            float r3 = r7.q
            float r0 = r0 - r3
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 / r3
            int r0 = defpackage.gm0.K(r0)
            float r4 = r7.q
            r5 = 1041865114(0x3e19999a, float:0.15)
            float r4 = r4 - r5
            float r4 = r4 / r3
            int r4 = defpackage.gm0.K(r4)
            r5 = 0
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 <= 0) goto L56
            float r0 = (float) r0
        L53:
            float r8 = r8 * r0
            int r1 = (int) r8
            goto L5c
        L56:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5c
            float r0 = (float) r4
            goto L53
        L5c:
            float r8 = r7.q
            float r0 = (float) r1
            float r0 = r0 * r3
            float r0 = r0 + r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r8
            int r0 = defpackage.gm0.K(r0)
            float r0 = (float) r0
            float r0 = r0 / r8
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r1 = 1077936128(0x40400000, float:3.0)
            float r0 = defpackage.oc9.u(r0, r8, r1)
            float r3 = r7.r
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L7a
            goto Lb9
        L7a:
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            android.widget.FrameLayout r3 = r7.a
            if (r8 != 0) goto L81
            goto L85
        L81:
            int r8 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r8 != 0) goto L8a
        L85:
            mt7 r8 = defpackage.mt7.REJECT
            defpackage.p0m.a(r3, r8)
        L8a:
            r7.r = r0
            android.widget.LinearLayout r8 = r7.f()
            r1 = 2131297597(0x7f09053d, float:1.8213143E38)
            android.view.View r8 = r8.findViewById(r1)
            w0c r8 = (defpackage.w0c) r8
            if (r8 == 0) goto La2
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.setCounter(r0)
        La2:
            k36 r8 = r7.j
            r3.removeCallbacks(r8)
            r3.post(r8)
            vbi r8 = r7.b
            java.lang.Object r8 = r8.invoke()
            e3j r8 = (defpackage.e3j) r8
            if (r8 == 0) goto Lb9
            float r7 = r7.r
            r8.setPlaybackSpeed(r7)
        Lb9:
            return r2
        Lba:
            r7.c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi9.a(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.lwh
    public final boolean b(MotionEvent motionEvent) {
        return this.o;
    }

    public final void c() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.addUpdateListener(new mi9(this, 0));
        valueAnimatorOfFloat.addListener(new oi9(this, 3));
        valueAnimatorOfFloat.addListener(new oi9(this, 2));
        valueAnimatorOfFloat.start();
        this.s = valueAnimatorOfFloat;
        if (this.o) {
            ((qeg) this.d.getValue()).a(2, this.r);
            e3j e3jVar = (e3j) this.b.invoke();
            if (e3jVar != null) {
                e3jVar.setPlaybackSpeed(this.p);
            }
        }
        ViewParent parent = this.a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.p = 1.0f;
        this.q = 2.0f;
        this.o = false;
    }

    @Override // defpackage.lwh
    public final void clear() {
        c();
    }

    public final EnhancedAnimatedVectorDrawable d() {
        return (EnhancedAnimatedVectorDrawable) this.f.getValue();
    }

    public final ol6 e() {
        return (ol6) this.e.getValue();
    }

    public final LinearLayout f() {
        return (LinearLayout) this.i.getValue();
    }
}
