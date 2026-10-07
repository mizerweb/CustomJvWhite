package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class hag extends v5a implements fag, z5j, y5j {
    public final hq9 A;
    public boolean B;
    public final l1c C;
    public final ny8 D;
    public final wti E;
    public final ny8 F;
    public final int G;
    public final int H;
    public ga0 I;
    public sgg J;
    public final vvi x;
    public final ivd y;
    public final o2d z;

    public hag(Context context) {
        vvi vviVar = new vvi();
        ivd ivdVar = new ivd();
        super(context);
        this.x = vviVar;
        this.y = ivdVar;
        o2d o2dVar = new o2d(context);
        this.z = o2dVar;
        hq9 hq9Var = new hq9(context);
        hq9Var.setUseMaxDimensionsOnMeasure(true);
        hq9Var.setOverlayDrawable(o2dVar);
        hq9Var.setShowProgress(true);
        this.A = hq9Var;
        l1c l1cVar = new l1c(context);
        this.C = l1cVar;
        this.D = rx8.P(3, new twf(context, 10));
        wti wtiVar = new wti(context);
        wtiVar.setDrawableEnabled(false);
        wtiVar.setBackgroundEnabled(true);
        this.E = wtiVar;
        this.F = rx8.P(3, new twf(context, 11));
        this.G = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.H = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        vviVar.a = this;
        ivdVar.a = this;
        addView(l1cVar, new ViewGroup.LayoutParams(-1, -2));
        addView(hq9Var, new ViewGroup.LayoutParams(-1, -1));
        addView(wtiVar, new ViewGroup.LayoutParams(-2, -2));
        setTransitionGroup(true);
        l1cVar.setupNewController(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(hag hagVar, h50 h50Var) {
        Float fValueOf = Float.valueOf(0.0f);
        ivd ivdVar = hagVar.y;
        hq9 hq9Var = hagVar.A;
        eag eagVar = (eag) hagVar.getModel();
        if (cqk.d(eagVar != null ? Long.valueOf(eagVar.a) : null, h50Var != null ? Long.valueOf(h50Var.b()) : null)) {
            eag eagVar2 = (eag) hagVar.getModel();
            if (cqk.d(eagVar2 != null ? eagVar2.b : null, h50Var != null ? h50Var.a() : null)) {
                byte b = (h50Var instanceof c50) || (h50Var instanceof g50) || (h50Var instanceof e50);
                if (b == true && n7j.o((ny8) hagVar.x.b)) {
                    yab.d(hagVar, hagVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                    hagVar.getTransferStatusView().setVisibility(0);
                    wti transferStatusView = hagVar.getTransferStatusView();
                    CharSequence charSequenceB = h50Var.c().b(hagVar.getContext());
                    transferStatusView.setContent(charSequenceB != null ? charSequenceB : "");
                    if (h50Var instanceof c50) {
                        ivdVar.J();
                    } else {
                        ivdVar.r();
                        ivdVar.Q().setVisibility(0);
                        g50 g50Var = h50Var instanceof g50 ? (g50) h50Var : null;
                        int i = (int) (((g50Var != null ? g50Var.b : 0.0f) / 100.0f) * 10000.0f);
                        Drawable background = ivdVar.Q().getBackground();
                        v50 v50Var = background instanceof v50 ? (v50) background : null;
                        if (v50Var != null) {
                            v50Var.setLevel(i);
                        }
                    }
                    hq9Var.o(false, fValueOf, false);
                    return;
                }
                if (b != true) {
                    ny8 ny8Var = hagVar.F;
                    if (ny8Var.d()) {
                        ((wti) ny8Var.getValue()).setVisibility(8);
                    }
                    ivdVar.J();
                    zv8[] zv8VarArr = t58.A;
                    hq9Var.o(false, fValueOf, true);
                    return;
                }
                yab.d(hagVar, hagVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                hagVar.getTransferStatusView().setVisibility(0);
                wti transferStatusView2 = hagVar.getTransferStatusView();
                CharSequence charSequenceB2 = h50Var.c().b(hagVar.getContext());
                transferStatusView2.setContent(charSequenceB2 != null ? charSequenceB2 : "");
                ivdVar.J();
                g50 g50Var2 = h50Var instanceof g50 ? (g50) h50Var : null;
                Float fValueOf2 = Float.valueOf((g50Var2 != null ? g50Var2.b : 0.0f) / 100.0f);
                zv8[] zv8VarArr2 = t58.A;
                hq9Var.o(true, fValueOf2, true);
            }
        }
    }

    private final tz0 getBlurPostProcessor() {
        return (tz0) this.D.getValue();
    }

    private final wti getTransferStatusView() {
        return (wti) this.F.getValue();
    }

    @Override // defpackage.z5j
    public final boolean B() {
        return this.x.B();
    }

    @Override // defpackage.z5j
    public final void D(q5j q5jVar, t50 t50Var, long j, boolean z, boolean z2) {
        this.x.D(q5jVar, t50Var, j, z, z2);
    }

    @Override // defpackage.y5j
    public final u5j H(boolean z) {
        return ou7.k;
    }

    @Override // defpackage.rz9
    public final long I(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        wti wtiVar = this.E;
        wtiVar.measure(iMakeMeasureSpec, i4);
        ny8 ny8Var = this.F;
        if (ny8Var.d()) {
            ((wti) ny8Var.getValue()).measure(i3, i4);
        }
        this.y.b0();
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        hq9 hq9Var = this.A;
        hq9Var.measure(iMakeMeasureSpec2, i4);
        vvi vviVar = this.x;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.U(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = hq9Var.getBlurOffset();
        l1c l1cVar = this.C;
        if (blurOffset == 0) {
            boolean z = hq9Var.getMeasuredWidth() < i;
            this.B = z;
            if (z) {
                l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
            }
        } else if (hq9Var.C > 0) {
            this.B = true;
            int blurOffset2 = (hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredWidth();
            if (i < blurOffset2) {
                i = blurOffset2;
            }
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        } else if (hq9Var.s()) {
            this.B = true;
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredHeight(), 1073741824));
        } else {
            this.B = false;
        }
        return bj8.a(Math.max(this.B ? l1cVar.getMeasuredWidth() : hq9Var.getMeasuredWidth(), Math.max(n7j.k(ny8Var), wtiVar.getMeasuredWidth() + getDate$message_list().getMeasuredWidth())), Math.max(this.B ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight(), Math.max(getDate$message_list().getMeasuredHeight(), n7j.j(ny8Var))));
    }

    @Override // defpackage.z5j
    public final void J() {
        this.x.J();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        l1c l1cVar = this.C;
        if (view == l1cVar && !this.B) {
            return false;
        }
        if (view != this.A && view != l1cVar && view != this.x.R()) {
            return super.drawChild(canvas, view, j);
        }
        float f = 1.0f * yl5.d().getDisplayMetrics().density;
        float[] fArrA = ((fea) getBackground()).a();
        Rect bounds = ((fea) getBackground()).getBounds();
        float f2 = ((fea) getBackground()).r;
        float f3 = ((fea) getBackground()).s;
        float[] fArrA2 = ht9.a();
        int length = fArrA2.length;
        int i2 = 0;
        while (i < length) {
            float f4 = fArrA2[i];
            ht9.a()[i2] = Math.max(0.0f, fArrA[i2] - f);
            i++;
            i2++;
        }
        Path pathB = ht9.b();
        pathB.reset();
        pathB.addRoundRect(bounds.left + f, bounds.top + f, (bounds.right - f) - f3, (bounds.bottom - f) - f2, ht9.a(), Path.Direction.CW);
        Path pathB2 = ht9.b();
        int iSave = canvas.save();
        canvas.clipPath(pathB2);
        try {
            super.drawChild(canvas, view, j);
            return true;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.z5j
    public View getPreviewView() {
        return this.A;
    }

    @Override // defpackage.kfa
    public final boolean l(MotionEvent motionEvent) {
        return this.A.n(motionEvent);
    }

    @Override // defpackage.z5j
    public final boolean n() {
        return this.x.n();
    }

    @Override // defpackage.rz9
    public final void q(iq9 iq9Var) {
        eag eagVar = (eag) iq9Var;
        fti ftiVar = eagVar.c;
        g58 g58Var = new g58(0L, ftiVar.b, ftiVar.c, ftiVar.d, false, ftiVar.e, false, ftiVar.i, ftiVar.j, null, null, null, 0L, 0L, 32256);
        o2d o2dVar = eagVar.f ? this.z : null;
        hq9 hq9Var = this.A;
        hq9Var.setOverlayDrawable(o2dVar);
        hq9Var.setImageAttach(g58Var);
        zqk.a(this.C, g58Var, getBlurPostProcessor(), false);
        long jG = ew5.g(ftiVar.f);
        String[] strArr = woh.b;
        this.E.setContent(mxl.a(jG));
        if (eagVar.a()) {
            return;
        }
        ny8 ny8Var = this.F;
        if (ny8Var.d()) {
            ((wti) ny8Var.getValue()).setVisibility(8);
        }
        this.y.J();
    }

    @Override // defpackage.gnh, defpackage.i59
    public final boolean r() {
        return false;
    }

    @Override // defpackage.z5j
    public final void s(boolean z) {
        this.x.s(true);
    }

    @Override // defpackage.z5j
    public void setVideoClickListener(qf7 qf7Var) {
        this.x.c = qf7Var;
    }

    @Override // defpackage.z5j
    public void setVideoLongClickListener(qf7 qf7Var) {
        this.x.d = qf7Var;
    }

    @Override // defpackage.rz9
    public final int t(int i, int i2) {
        hq9 hq9Var = this.A;
        boolean zS = hq9Var.s();
        l1c l1cVar = this.C;
        int measuredHeight = zS ? ((l1cVar.getMeasuredHeight() - hq9Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.B || hq9Var.s()) ? i : ((getMeasuredWidth() - ((int) ((fea) getBackground()).s)) - hq9Var.getMeasuredWidth()) / 2;
        if (this.B) {
            qyj.M(l1cVar, i, i2, 0, 12);
        }
        qyj.M(hq9Var, measuredWidth, measuredHeight, 0, 12);
        vvi vviVar = this.x;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.T(((hq9Var.getMeasuredWidth() - vviVar.L()) / 2) + measuredWidth, measuredHeight);
        }
        ny8 ny8Var = this.F;
        boolean zD = ny8Var.d();
        int i3 = this.G;
        if (zD) {
            qyj.M((wti) ny8Var.getValue(), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, measuredWidth), hq9Var.getTop() + i3, 0, 12);
        }
        this.y.a0(measuredWidth, hq9Var.getTop(), hq9Var.getMeasuredWidth(), hq9Var.getMeasuredHeight());
        int i4 = i + this.H;
        int measuredHeight2 = hq9Var.getMeasuredHeight() + i2;
        wti wtiVar = this.E;
        qyj.M(wtiVar, i4, (measuredHeight2 - wtiVar.getMeasuredHeight()) - i3, 0, 12);
        return this.B ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight();
    }

    @Override // defpackage.gnh, defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        return n9j.d(this.A, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // defpackage.z5j
    public final boolean z() {
        this.x.getClass();
        return false;
    }
}
