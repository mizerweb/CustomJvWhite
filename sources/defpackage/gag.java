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
public final class gag extends yz9 implements fag, y5j, z5j, kfa {
    public final vvi n;
    public final ivd o;
    public final o2d p;
    public final hq9 q;
    public final l1c r;
    public final ny8 s;
    public boolean t;
    public final wti u;
    public final ny8 v;
    public vn2 w;
    public sgg x;

    public gag(Context context) {
        vvi vviVar = new vvi();
        ivd ivdVar = new ivd();
        super(context);
        this.n = vviVar;
        this.o = ivdVar;
        o2d o2dVar = new o2d(context);
        this.p = o2dVar;
        hq9 hq9Var = new hq9(context);
        hq9Var.setUseMaxDimensionsOnMeasure(true);
        hq9Var.setIgnoreCropCriteria(true);
        hq9Var.setOverlayDrawable(o2dVar);
        hq9Var.setShowProgress(true);
        this.q = hq9Var;
        l1c l1cVar = new l1c(context);
        this.r = l1cVar;
        this.s = rx8.P(3, new twf(context, 8));
        wti wtiVar = new wti(context);
        wtiVar.setDrawableEnabled(false);
        wtiVar.setBackgroundEnabled(true);
        this.u = wtiVar;
        this.v = rx8.P(3, new twf(context, 9));
        vviVar.a = this;
        ivdVar.a = this;
        addView(l1cVar, new ViewGroup.LayoutParams(-1, -2));
        addView(hq9Var, new ViewGroup.LayoutParams(-1, -1));
        addView(wtiVar, new ViewGroup.LayoutParams(-2, -2));
        l1cVar.setupNewController(true);
    }

    private final tz0 getBlurPostProcessor() {
        return (tz0) this.s.getValue();
    }

    private final wti getTransferStatusView() {
        return (wti) this.v.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(gag gagVar, h50 h50Var) {
        Float fValueOf = Float.valueOf(0.0f);
        ivd ivdVar = gagVar.o;
        hq9 hq9Var = gagVar.q;
        eag eagVar = (eag) gagVar.getModel();
        if (cqk.d(eagVar != null ? Long.valueOf(eagVar.a) : null, h50Var != null ? Long.valueOf(h50Var.b()) : null)) {
            eag eagVar2 = (eag) gagVar.getModel();
            if (cqk.d(eagVar2 != null ? eagVar2.b : null, h50Var != null ? h50Var.a() : null)) {
                byte b = (h50Var instanceof c50) || (h50Var instanceof g50) || (h50Var instanceof e50);
                if (b == true && n7j.o((ny8) gagVar.n.b)) {
                    yab.d(gagVar, gagVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                    gagVar.getTransferStatusView().setVisibility(0);
                    wti transferStatusView = gagVar.getTransferStatusView();
                    CharSequence charSequenceB = h50Var.c().b(gagVar.getContext());
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
                    ny8 ny8Var = gagVar.v;
                    if (ny8Var.d()) {
                        ((wti) ny8Var.getValue()).setVisibility(8);
                    }
                    ivdVar.J();
                    zv8[] zv8VarArr = t58.A;
                    hq9Var.o(false, fValueOf, true);
                    return;
                }
                yab.d(gagVar, gagVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                gagVar.getTransferStatusView().setVisibility(0);
                wti transferStatusView2 = gagVar.getTransferStatusView();
                CharSequence charSequenceB2 = h50Var.c().b(gagVar.getContext());
                transferStatusView2.setContent(charSequenceB2 != null ? charSequenceB2 : "");
                ivdVar.J();
                g50 g50Var2 = h50Var instanceof g50 ? (g50) h50Var : null;
                Float fValueOf2 = Float.valueOf((g50Var2 != null ? g50Var2.b : 0.0f) / 100.0f);
                zv8[] zv8VarArr2 = t58.A;
                hq9Var.o(true, fValueOf2, true);
            }
        }
    }

    @Override // defpackage.z5j
    public final boolean B() {
        return this.n.B();
    }

    @Override // defpackage.z5j
    public final void D(q5j q5jVar, t50 t50Var, long j, boolean z, boolean z2) {
        this.n.D(q5jVar, t50Var, j, z, z2);
    }

    @Override // defpackage.y5j
    public final u5j H(boolean z) {
        return ou7.k;
    }

    @Override // defpackage.rz9
    public final long I(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        wti wtiVar = this.u;
        wtiVar.measure(iMakeMeasureSpec, i4);
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            ((wti) ny8Var.getValue()).measure(i3, i4);
        }
        this.o.b0();
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        hq9 hq9Var = this.q;
        hq9Var.measure(iMakeMeasureSpec2, i4);
        vvi vviVar = this.n;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.U(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = hq9Var.getBlurOffset();
        l1c l1cVar = this.r;
        if (blurOffset == 0) {
            boolean z = hq9Var.getMeasuredWidth() < i;
            this.t = z;
            if (z) {
                l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
            }
        } else if (hq9Var.C > 0) {
            this.t = true;
            int blurOffset2 = (hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredWidth();
            if (i < blurOffset2) {
                i = blurOffset2;
            }
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        } else if (hq9Var.s()) {
            this.t = true;
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredHeight(), 1073741824));
        } else {
            this.t = false;
        }
        return bj8.a(Math.max(this.t ? l1cVar.getMeasuredWidth() : hq9Var.getMeasuredWidth(), Math.max(n7j.k(ny8Var), wtiVar.getMeasuredWidth() + getDate().getMeasuredWidth())), Math.max(this.t ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight(), Math.max(getDate().getMeasuredHeight(), n7j.j(ny8Var))));
    }

    @Override // defpackage.z5j
    public final void J() {
        this.n.J();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        l1c l1cVar = this.r;
        if (view == l1cVar && !this.t) {
            return false;
        }
        if (view != this.q && view != l1cVar && view != this.n.R()) {
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
        return this.q;
    }

    @Override // defpackage.kfa
    public final boolean l(MotionEvent motionEvent) {
        return this.q.n(motionEvent);
    }

    @Override // defpackage.z5j
    public final boolean n() {
        return this.n.n();
    }

    @Override // defpackage.rz9
    public final void q(iq9 iq9Var) {
        eag eagVar = (eag) iq9Var;
        fti ftiVar = eagVar.c;
        g58 g58Var = new g58(0L, ftiVar.b, ftiVar.c, ftiVar.d, false, ftiVar.e, false, ftiVar.i, ftiVar.j, null, null, null, 0L, 0L, 32256);
        o2d o2dVar = eagVar.f ? this.p : null;
        hq9 hq9Var = this.q;
        hq9Var.setOverlayDrawable(o2dVar);
        hq9Var.setImageAttach(g58Var);
        zqk.a(this.r, g58Var, getBlurPostProcessor(), false);
        long jG = ew5.g(ftiVar.f);
        String[] strArr = woh.b;
        this.u.setContent(mxl.a(jG));
        if (eagVar.a()) {
            return;
        }
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            ((wti) ny8Var.getValue()).setVisibility(8);
        }
        this.o.J();
    }

    @Override // defpackage.z5j
    public final void s(boolean z) {
        this.n.s(true);
    }

    @Override // defpackage.z5j
    public void setVideoClickListener(qf7 qf7Var) {
        this.n.c = qf7Var;
    }

    @Override // defpackage.z5j
    public void setVideoLongClickListener(qf7 qf7Var) {
        this.n.d = qf7Var;
    }

    @Override // defpackage.rz9
    public final int t(int i, int i2) {
        hq9 hq9Var = this.q;
        boolean zS = hq9Var.s();
        l1c l1cVar = this.r;
        int measuredHeight = zS ? ((l1cVar.getMeasuredHeight() - hq9Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.t || hq9Var.s()) ? i : ((getMeasuredWidth() - ((int) ((fea) getBackground()).s)) - hq9Var.getMeasuredWidth()) / 2;
        if (this.t) {
            qyj.M(l1cVar, i, i2, 0, 12);
        }
        qyj.M(hq9Var, measuredWidth, measuredHeight, 0, 12);
        vvi vviVar = this.n;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.T(((hq9Var.getMeasuredWidth() - vviVar.L()) / 2) + measuredWidth, measuredHeight);
        }
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            qyj.M((wti) ny8Var.getValue(), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, measuredWidth), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, hq9Var.getTop()), 0, 12);
        }
        this.o.a0(measuredWidth, hq9Var.getTop(), hq9Var.getMeasuredWidth(), hq9Var.getMeasuredHeight());
        int iB = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, i);
        int measuredHeight2 = hq9Var.getMeasuredHeight() + i2;
        wti wtiVar = this.u;
        qyj.M(wtiVar, iB, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, measuredHeight2 - wtiVar.getMeasuredHeight()), 0, 12);
        return this.t ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight();
    }

    @Override // defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        return n9j.d(this.q, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // defpackage.z5j
    public final boolean z() {
        this.n.getClass();
        return false;
    }
}
