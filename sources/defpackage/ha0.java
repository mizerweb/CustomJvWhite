package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.work.WorkRequest;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ha0 extends ViewGroup implements khf, v35, p1i, b8e, mia, fhf, ekc, k24, q1i, azf {
    public static final int n1 = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
    public static final ny8 o1 = rx8.P(3, new va(11));
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public Long F;
    public Long G;
    public String H;
    public Layout I;
    public sgg J;
    public ga0 K;
    public final cf7 a;
    public final af7 b;
    public final p6e c;
    public final gia d;
    public final dhf e;
    public final fkc f;
    public final i24 g;
    public final v0i h;
    public final vyf i;
    public final lhf j;
    public final int k;
    public final String l;
    public final eu9 m;
    public final cs n;
    public final u35 o;
    public final ny8 p;
    public final int q;
    public final ad0 r;
    public final AppCompatTextView s;
    public Integer t;
    public Integer u;
    public int v;
    public ValueAnimator w;
    public boolean x;
    public final int y;
    public final int z;

    public ha0(Context context, fz7 fz7Var, msa msaVar) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        dhf dhfVar = new dhf();
        fkc fkcVar = new fkc();
        i24 i24Var = new i24(1);
        v0i v0iVar = new v0i();
        vyf vyfVar = new vyf();
        super(context);
        this.a = fz7Var;
        this.b = msaVar;
        this.c = p6eVar;
        this.d = giaVar;
        this.e = dhfVar;
        this.f = fkcVar;
        this.g = i24Var;
        this.h = v0iVar;
        this.i = vyfVar;
        this.j = new lhf(this);
        int i = n1;
        this.k = i;
        this.l = ha0.class.getName();
        eu9 eu9Var = new eu9(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density), context);
        this.m = eu9Var;
        cs csVar = new cs(context);
        csVar.setId(R.id.messages_list_item_play);
        csVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        csVar.setImageDrawable(eu9Var);
        this.n = csVar;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.o = u35Var;
        this.p = rx8.P(3, new ca0(context, 0));
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.q = iK;
        ad0 ad0Var = new ad0(context);
        this.r = ad0Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.y, appCompatTextView);
        this.s = appCompatTextView;
        this.y = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.z = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.A = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        this.B = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        this.C = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.D = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.E = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.H = "";
        p6eVar.a = this;
        giaVar.a = this;
        dhfVar.a = this;
        i24Var.a = this;
        v0iVar.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        addView(csVar, new ViewGroup.LayoutParams(i, i));
        addView(ad0Var, new ViewGroup.LayoutParams(-1, iK));
        xr8 xr8Var = fea.u;
        kbc kbcVarH = pq3.j.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        ad0Var.setListener(new ft0(this));
    }

    public static void c(ha0 ha0Var, int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
        ha0Var.t = Integer.valueOf(lk.c(i, valueAnimator.getAnimatedFraction(), i2));
        ha0Var.u = Integer.valueOf(lk.c(i3, valueAnimator.getAnimatedFraction(), i4));
        float animatedFraction = ha0Var.h.d ? valueAnimator.getAnimatedFraction() : 1.0f - valueAnimator.getAnimatedFraction();
        ha0Var.r.r = animatedFraction;
        ha0Var.getTranscriptionView().setAlpha(animatedFraction);
        ha0Var.requestLayout();
    }

    public final o1i getTranscriptionView() {
        return (o1i) this.p.getValue();
    }

    @Override // defpackage.mia
    public final void A() {
        this.d.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.i.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.c.G(xacVar, z);
    }

    @Override // defpackage.p1i
    public final void a() {
        Integer numValueOf;
        Layout layout = this.I;
        String str = this.l;
        if (layout == null) {
            gm0.n(str, "applyTranscriptionState: currentTranscriptionLayout = null");
            return;
        }
        boolean zI = i();
        v0i v0iVar = this.h;
        boolean z = v0iVar.d;
        int i = this.v;
        Long l = this.G;
        int i2 = this.y;
        if (z) {
            long jLongValue = l != null ? l.longValue() : 0L;
            int width = layout.getWidth();
            numValueOf = Integer.valueOf(Math.max((int) tqk.c(gm0.K(192.0f * yl5.d().getDisplayMetrics().density), i, tqk.b(1000.0f, 30000.0f, oc9.x(jLongValue, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS))), width > 0 ? (i2 * 2) + width : 0));
        } else {
            numValueOf = Integer.valueOf((int) tqk.c(gm0.K(192.0f * yl5.d().getDisplayMetrics().density), i, tqk.b(1000.0f, 30000.0f, oc9.x(l != null ? l.longValue() : 0L, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS))));
        }
        this.t = numValueOf;
        int iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, layout.getHeight()) + (!zI ? (this.o.getMeasuredHeight() + this.z) - i2 : 0);
        this.u = v0iVar.d ? Integer.valueOf(getMeasuredHeight() + iB) : Integer.valueOf(getMeasuredHeight() - iB);
        final int measuredWidth = getMeasuredWidth() - ((int) ((fea) getBackground()).s);
        Integer num = this.t;
        if (num != null) {
            final int iIntValue = num.intValue();
            final int measuredHeight = getMeasuredHeight();
            Integer num2 = this.u;
            if (num2 != null) {
                final int iIntValue2 = num2.intValue();
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    gm0.n(str, "animateExpandView: expandingAnimation isRunning");
                    return;
                }
                yab.e(this, getTranscriptionView(), -1);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(333L);
                valueAnimatorOfFloat.setInterpolator((PathInterpolator) o1.getValue());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z90
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ha0.c(this.a, measuredWidth, iIntValue, measuredHeight, iIntValue2, valueAnimator2);
                    }
                });
                valueAnimatorOfFloat.addListener(new ea0(this, iIntValue, 0));
                valueAnimatorOfFloat.addListener(new da0(this, 1));
                valueAnimatorOfFloat.addListener(new da0(this, 0));
                valueAnimatorOfFloat.start();
                this.w = valueAnimatorOfFloat;
            }
        }
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.i.b(i);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        zv8[] zv8VarArr = u35.x;
        this.o.d(charSequence, false);
    }

    @Override // defpackage.q1i
    public final void f(int i) {
        this.h.f(i);
    }

    public final int g() {
        int iB;
        v0i v0iVar = this.h;
        if (v0iVar.L() > 0) {
            iB = zo5.b(6.0f, yl5.d().getDisplayMetrics().density, v0iVar.L());
        } else {
            iB = 0;
        }
        return r5a.f(6.0f, yl5.d().getDisplayMetrics().density, 2, this.n.getMeasuredWidth() + (this.y * 2)) + this.B + iB;
    }

    public int getAliasWidthWithPaddings() {
        return this.e.Z();
    }

    public boolean getDependOnOutsideView() {
        return this.f.a;
    }

    @Override // defpackage.q1i
    public Point getPosition() {
        return this.h.getPosition();
    }

    @Override // defpackage.k24
    public final void h(int i) {
        this.g.h(i);
    }

    public final boolean i() {
        Layout layout;
        if (n7j.o((ny8) this.c.b) || (layout = this.I) == null) {
            return true;
        }
        return this.o.getMeasuredWidth() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, (int) layout.getLineRight(layout.getLineCount() - 1)) < layout.getWidth();
    }

    public final void j(y90 y90Var, boolean z) {
        ga0 ga0Var;
        int i;
        int i2 = y90Var.p;
        this.x = z;
        this.F = Long.valueOf(y90Var.c);
        long j = y90Var.k;
        this.G = Long.valueOf(j);
        this.H = y90Var.e;
        i1i i1iVar = y90Var.o;
        this.I = i1iVar != null ? i1iVar.a : null;
        boolean z2 = y90Var.q;
        v0i v0iVar = this.h;
        if (z2) {
            v0iVar.r();
            boolean z3 = i2 == 2;
            v0iVar.d = z3;
            if (z3) {
                yab.e(this, getTranscriptionView(), -1);
            }
        }
        o1i transcriptionView = getTranscriptionView();
        transcriptionView.setVisibility(v0iVar.d ? 0 : 8);
        transcriptionView.setIncomingMessage(z);
        transcriptionView.setState(i1iVar);
        View viewR = v0iVar.R();
        u0i u0iVar = viewR instanceof u0i ? (u0i) viewR : null;
        if (u0iVar != null) {
            u0iVar.setIncomingMessage(this.x);
            int i3 = i2 == 0 ? -1 : q0i.$EnumSwitchMapping$0[qt4.D(i2)];
            if (i3 == 1) {
                i = 1;
            } else if (i3 != 2) {
                i = 3;
                if (i3 != 3) {
                    i = 0;
                }
            } else {
                i = 2;
            }
            u0iVar.b(i, false);
            qe7.H(u0iVar, 300L, new aa0(this, y90Var, 1));
        }
        boolean z4 = this.x;
        ad0 ad0Var = this.r;
        ad0Var.setIncomingMessage(z4);
        ad0Var.e(j, v0iVar.d, y90Var.i);
        this.s.setText(y90Var.j);
        aa0 aa0Var = new aa0(this, y90Var, 2);
        cs csVar = this.n;
        qe7.H(csVar, 300L, aa0Var);
        csVar.setOnLongClickListener(new ba0(this, 1));
        this.K = new ga0(this, 0, y90Var);
        if (isAttachedToWindow() && (ga0Var = this.K) != null) {
            ga0Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.K);
        requestLayout();
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.g.k();
    }

    public final void l(y90 y90Var) {
        String str = y90Var.e;
        i1i i1iVar = y90Var.o;
        this.I = i1iVar != null ? i1iVar.a : null;
        getTranscriptionView().setState(i1iVar);
        o1i transcriptionView = getTranscriptionView();
        v0i v0iVar = this.h;
        transcriptionView.setVisibility(v0iVar.d ? 0 : 8);
        if (this.H.length() <= 0 && str.length() != 0) {
            this.H = str;
            this.r.e(y90Var.k, v0iVar.d, y90Var.i);
            aa0 aa0Var = new aa0(this, y90Var, 0);
            cs csVar = this.n;
            qe7.H(csVar, 300L, aa0Var);
            csVar.setOnLongClickListener(new ba0(this, 0));
        }
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.c.m(z);
    }

    @Override // defpackage.k24
    public final void o() {
        this.g.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u == null || this.t == null) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.w = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator;
        lhf lhfVar = this.j;
        ny8 ny8Var = lhfVar.b;
        ny8 ny8Var2 = lhfVar.b;
        boolean zO = n7j.o(ny8Var);
        int i5 = this.A;
        int i6 = this.y;
        int iK = zO ? i5 : i6;
        int i7 = (int) ((fea) getBackground()).s;
        if (n7j.o(ny8Var2)) {
            int iA = lhfVar.a() + iK;
            lhfVar.c(i6, iK);
            iK = this.E + iA;
        }
        dhf dhfVar = this.e;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(ny8Var2)) {
            dhfVar.T(((getMeasuredWidth() - i6) - dhfVar.L()) - i7, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + i5);
        }
        gia giaVar = this.d;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(i6, iK);
            iK += giaVar.K() + this.D;
        }
        cs csVar = this.n;
        qyj.M(csVar, i6, iK, 0, 12);
        int measuredWidth = csVar.getMeasuredWidth();
        int i8 = this.B;
        int i9 = measuredWidth + i8 + i6;
        v0i v0iVar = this.h;
        if (n7j.o((ny8) v0iVar.b)) {
            v0iVar.T(((getMeasuredWidth() - i6) - v0iVar.L()) - i7, iK);
        }
        int iD = zo5.D(6.0f, yl5.d().getDisplayMetrics().density, csVar.getMeasuredWidth() + i6 + i8);
        int iB = zo5.b(2.0f, yl5.d().getDisplayMetrics().density, iK);
        ad0 ad0Var = this.r;
        qyj.M(ad0Var, iD, iB, 0, 12);
        qyj.M(this.s, i9, ad0Var.getMeasuredHeight() + this.C + iB, 0, 12);
        int right = ad0Var.getRight() - csVar.getRight();
        int i10 = this.y;
        int i11 = this.y;
        qyj.z(i11, i11, right, i10, this, csVar);
        int bottom = csVar.getBottom();
        if (n7j.o((ny8) v0iVar.b) && (v0iVar.d || ((valueAnimator = this.w) != null && valueAnimator.isRunning()))) {
            qyj.L(getTranscriptionView(), i6, bottom, (getMeasuredWidth() - i6) - i7, getTranscriptionView().getMeasuredHeight() + bottom);
            bottom += getTranscriptionView().getMeasuredHeight();
        }
        p6e p6eVar = this.c;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(gm0.K(10.0f * yl5.d().getDisplayMetrics().density), zo5.b(10.0f, yl5.d().getDisplayMetrics().density, bottom));
        }
        i24 i24Var = this.g;
        int iK2 = n7j.o((ny8) i24Var.b) ? i24Var.K() : 0;
        int measuredWidth2 = getMeasuredWidth();
        u35 u35Var = this.o;
        int measuredWidth3 = ((measuredWidth2 - u35Var.getMeasuredWidth()) - i6) - i7;
        int measuredHeight = ((getMeasuredHeight() - iK2) - u35Var.getMeasuredHeight()) - this.z;
        qyj.L(u35Var, measuredWidth3, measuredHeight, u35Var.getMeasuredWidth() + measuredWidth3, u35Var.getMeasuredHeight() + measuredHeight);
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(0, getMeasuredHeight() - i24Var.K());
        }
        vyf vyfVar = this.i;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int iL;
        boolean z;
        int iB;
        ValueAnimator valueAnimator;
        this.v = View.MeasureSpec.getSize(i);
        Long l = this.G;
        Integer num = this.t;
        Integer num2 = this.u;
        v0i v0iVar = this.h;
        int i3 = this.y;
        if (num != null && (valueAnimator = this.w) != null && valueAnimator.isRunning()) {
            size = num.intValue();
        } else if (l == null || getDependOnOutsideView()) {
            size = View.MeasureSpec.getSize(i);
        } else {
            boolean z2 = v0iVar.d;
            int i4 = this.v;
            if (z2) {
                long jLongValue = l.longValue();
                Layout layout = this.I;
                int width = layout != null ? layout.getWidth() : 0;
                size = Math.max((int) tqk.c(gm0.K(192.0f * yl5.d().getDisplayMetrics().density), i4, tqk.b(1000.0f, 30000.0f, oc9.x(jLongValue, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS))), width > 0 ? (i3 * 2) + width : 0);
            } else {
                size = (int) tqk.c(gm0.K(192.0f * yl5.d().getDisplayMetrics().density), i4, tqk.b(1000.0f, 30000.0f, oc9.x(l.longValue(), 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
            }
        }
        ValueAnimator valueAnimator2 = this.w;
        if (valueAnimator2 != null && !valueAnimator2.isRunning()) {
            this.t = null;
            this.u = null;
        }
        lhf lhfVar = this.j;
        int iK = n7j.o(lhfVar.b) ? this.A : i3;
        dhf dhfVar = this.e;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE), i2);
            iK += lhfVar.a() + this.E;
        }
        gia giaVar = this.d;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iK += giaVar.K() + this.D;
        }
        u35 u35Var = this.o;
        u35Var.measure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        AppCompatTextView appCompatTextView = this.s;
        appCompatTextView.measure(iMakeMeasureSpec, i2);
        int i5 = this.k;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        cs csVar = this.n;
        csVar.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        if (n7j.o((ny8) v0iVar.b)) {
            v0iVar.U(qv1.a(36.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(28.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        }
        int iG = g();
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - iG, 1073741824);
        int i6 = this.q;
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        ad0 ad0Var = this.r;
        ad0Var.measure(iMakeMeasureSpec4, iMakeMeasureSpec5);
        int measuredHeight = csVar.getMeasuredHeight() + i3;
        int measuredHeight2 = appCompatTextView.getMeasuredHeight() + i6 + this.C;
        int i7 = this.z;
        int iMax = Math.max(measuredHeight, measuredHeight2 + i7) + iK;
        p6e p6eVar = this.c;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            iMax = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iMax);
        }
        if (n7j.o((ny8) v0iVar.b)) {
            if (v0iVar.d) {
                z = true;
            } else {
                ValueAnimator valueAnimator3 = this.w;
                if (valueAnimator3 != null) {
                    z = true;
                    if (valueAnimator3.isRunning()) {
                    }
                }
            }
            boolean zI = i();
            ValueAnimator valueAnimator4 = this.w;
            if (valueAnimator4 == null || valueAnimator4.isRunning() != z) {
                Layout layout2 = this.I;
                iB = layout2 != null ? zo5.b(8.0f, yl5.d().getDisplayMetrics().density, layout2.getHeight()) : 0;
            } else if (zI) {
                iB = (num2 != null ? num2.intValue() : 0) - iMax;
            } else {
                iB = (((num2 != null ? num2.intValue() : 0) - iMax) - u35Var.getMeasuredHeight()) + i7;
            }
            if (iB < 0) {
                iB = 0;
            }
            getTranscriptionView().measure(View.MeasureSpec.makeMeasureSpec(size - (i3 * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(iB, 1073741824));
            if (v0iVar.d) {
                iMax = getTranscriptionView().getMeasuredHeight() + iMax + (!zI ? (u35Var.getMeasuredHeight() + i7) - i3 : 0);
            }
        }
        int iMax2 = Math.max(n7j.o((ny8) p6eVar.b) ? (i3 * 2) + p6eVar.L() : 0, Math.max(v0iVar.d ? (i3 * 2) + getTranscriptionView().getMeasuredWidth() : 0, ad0Var.getMeasuredWidth() + iG));
        i24 i24Var = this.g;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), i2);
            iMax2 = Math.max(iMax2, i24Var.L());
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), i2);
            iMax += i24Var.K();
        }
        vyf vyfVar = this.i;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), i2);
            iL = vyfVar.L();
        } else {
            iL = 0;
        }
        int i8 = iMax2 + iL;
        ((fea) getBackground()).s = iL;
        ValueAnimator valueAnimator5 = this.w;
        if (valueAnimator5 != null && valueAnimator5.isRunning() && num2 != null) {
            iMax = num2.intValue();
        }
        setMeasuredDimension(i8, iMax);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.d.p(xacVar);
    }

    @Override // defpackage.q1i
    public final boolean q() {
        return this.h.d;
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.e.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.e.setAliasColor(i);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.c.setChipObserver(t5eVar);
    }

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.g.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.o.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.o.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.f.a = z;
    }

    public void setForceIfFloating(boolean z) {
        this.d.Z(z);
    }

    @Override // defpackage.mia
    public void setForwardClickListener(qf7 qf7Var) {
        this.d.d = qf7Var;
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        this.o.setChannelMode$message_list(z);
    }

    public void setIsExpanded(boolean z) {
        this.h.d = z;
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.c.c = z;
    }

    @Override // defpackage.mia
    public void setLink(fia fiaVar) {
        this.d.setLink(fiaVar);
    }

    @Override // defpackage.b8e
    public void setMaxReactionsCount(int i) {
        this.c.f = i;
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.c.d = cf7Var;
    }

    @Override // defpackage.k24
    public void setOnCommentsEntryClickListener(af7 af7Var) {
        this.g.d = af7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.i.c = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.d.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.j.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.j.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.i.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.c.g = z;
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        this.g.v(xacVar);
    }

    @Override // defpackage.azf
    public final void w() {
        this.i.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.c.x(kjaVar, z);
    }
}
