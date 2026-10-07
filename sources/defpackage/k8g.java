package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class k8g extends yz9 implements i8g, kfa, z5j {
    public final vvi n;
    public final hq9 o;
    public final ny8 p;
    public final l1c q;
    public final ny8 r;
    public boolean s;
    public vn2 t;
    public sgg u;
    public final mkc v;
    public final ny8 w;

    public k8g(Context context, boolean z) {
        vvi vviVar = new vvi();
        super(context);
        this.n = vviVar;
        hq9 hq9Var = new hq9(context);
        hq9Var.setShowProgress(true);
        this.o = hq9Var;
        this.p = rx8.P(3, new twf(context, 2));
        l1c l1cVar = new l1c(context);
        this.q = l1cVar;
        this.r = rx8.P(3, new twf(context, 3));
        this.v = new mkc(hq9Var, this, z, new occ(0, this, k8g.class, "mediaCorners", "mediaCorners()[F", 0, 6));
        this.w = rx8.P(3, new twf(context, 4));
        vviVar.a = this;
        addView(l1cVar, -1, -2);
        addView(hq9Var, new ViewGroup.LayoutParams(-1, -1));
        l1cVar.setupNewController(true);
    }

    private final tz0 getBlurPostProcessor() {
        return (tz0) this.r.getValue();
    }

    private final p7a getMediaType() {
        return (p7a) this.w.getValue();
    }

    private final wti getTransferStatusView() {
        return (wti) this.p.getValue();
    }

    public static final void r(k8g k8gVar, h50 h50Var) {
        hq9 hq9Var = k8gVar.o;
        h8g h8gVar = (h8g) k8gVar.getModel();
        if (cqk.d(h8gVar != null ? Long.valueOf(h8gVar.a) : null, h50Var != null ? Long.valueOf(h50Var.b()) : null)) {
            h8g h8gVar2 = (h8g) k8gVar.getModel();
            if (cqk.d(h8gVar2 != null ? h8gVar2.b : null, h50Var != null ? h50Var.a() : null)) {
                if (!(h50Var instanceof c50) && !(h50Var instanceof g50) && !(h50Var instanceof e50)) {
                    ny8 ny8Var = k8gVar.p;
                    if (ny8Var.d()) {
                        ((wti) ny8Var.getValue()).setVisibility(8);
                    }
                    Float fValueOf = Float.valueOf(0.0f);
                    zv8[] zv8VarArr = t58.A;
                    hq9Var.o(false, fValueOf, true);
                    return;
                }
                yab.d(k8gVar, k8gVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                k8gVar.getTransferStatusView().setVisibility(0);
                wti transferStatusView = k8gVar.getTransferStatusView();
                CharSequence charSequenceB = h50Var.c().b(k8gVar.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                transferStatusView.setContent(charSequenceB);
                g50 g50Var = h50Var instanceof g50 ? (g50) h50Var : null;
                Float fValueOf2 = Float.valueOf((g50Var != null ? g50Var.b : 0.0f) / 100.0f);
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

    @Override // defpackage.i8g
    public final void F(h8g h8gVar) {
        vn2 vn2Var;
        setModel(h8gVar);
        this.t = new vn2(4, this);
        if (isAttachedToWindow() && (vn2Var = this.t) != null) {
            vn2Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.t);
    }

    @Override // defpackage.rz9
    public final long I(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        hq9 hq9Var = this.o;
        hq9Var.measure(iMakeMeasureSpec, i4);
        ny8 ny8Var = this.p;
        if (ny8Var.d()) {
            ((wti) ny8Var.getValue()).measure(i3, i4);
        }
        ny8 ny8Var2 = this.w;
        if (ny8Var2.d()) {
            ((p7a) ny8Var2.getValue()).measure(i3, i4);
        }
        vvi vviVar = this.n;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.U(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = hq9Var.getBlurOffset();
        l1c l1cVar = this.q;
        if (blurOffset == 0) {
            boolean z = hq9Var.getMeasuredWidth() < i;
            this.s = z;
            if (z) {
                l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
            }
        } else if (hq9Var.C > 0) {
            this.s = true;
            int blurOffset2 = (hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredWidth();
            if (i < blurOffset2) {
                i = blurOffset2;
            }
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        } else if (hq9Var.s()) {
            this.s = true;
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredHeight(), 1073741824));
        } else {
            this.s = false;
        }
        return bj8.a(Math.max(this.s ? l1cVar.getMeasuredWidth() : hq9Var.getMeasuredWidth(), Math.max(getDate().getMeasuredWidth() + n7j.k(ny8Var2), n7j.k(ny8Var))), e9i.l0(this.s ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight(), getDate().getMeasuredHeight(), n7j.j(ny8Var2), n7j.j(ny8Var)));
    }

    @Override // defpackage.z5j
    public final void J() {
        this.n.J();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        l1c l1cVar = this.q;
        if (view == l1cVar && !this.s) {
            return false;
        }
        if (view != this.o && view != l1cVar && view != this.n.R()) {
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

    @Override // defpackage.kfa
    public final boolean f(MotionEvent motionEvent) {
        return this.v.d(motionEvent);
    }

    @Override // defpackage.z5j
    public View getPreviewView() {
        return this.o;
    }

    @Override // defpackage.kfa
    public final boolean l(MotionEvent motionEvent) {
        return this.o.n(motionEvent);
    }

    @Override // defpackage.z5j
    public final boolean n() {
        return this.n.n();
    }

    @Override // defpackage.rz9
    public final void q(iq9 iq9Var) {
        h8g h8gVar = (h8g) iq9Var;
        this.v.e(true);
        g58 g58Var = h8gVar.c;
        this.o.setImageAttach(g58Var);
        zqk.a(this.q, g58Var, getBlurPostProcessor(), false);
        if (g58Var.e) {
            yab.d(this, getMediaType(), new ViewGroup.LayoutParams(-2, -2));
            getMediaType().setVisibility(0);
        } else {
            ny8 ny8Var = this.w;
            if (ny8Var.d()) {
                ((p7a) ny8Var.getValue()).setVisibility(8);
            }
        }
        if (h8gVar.a()) {
            return;
        }
        ny8 ny8Var2 = this.p;
        if (ny8Var2.d()) {
            ((wti) ny8Var2.getValue()).setVisibility(8);
        }
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
        hq9 hq9Var = this.o;
        boolean zS = hq9Var.s();
        l1c l1cVar = this.q;
        int measuredHeight = zS ? ((l1cVar.getMeasuredHeight() - hq9Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.s || hq9Var.s()) ? i : ((getMeasuredWidth() - ((int) ((fea) getBackground()).s)) - hq9Var.getMeasuredWidth()) / 2;
        if (this.s) {
            qyj.M(l1cVar, i, i2, 0, 12);
        }
        qyj.M(hq9Var, measuredWidth, measuredHeight, 0, 12);
        vvi vviVar = this.n;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.T(measuredWidth, measuredHeight);
        }
        ny8 ny8Var = this.p;
        if (ny8Var.d()) {
            qyj.M((wti) ny8Var.getValue(), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, measuredWidth), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, hq9Var.getTop()), 0, 12);
        }
        ny8 ny8Var2 = this.w;
        if (ny8Var2.d()) {
            qyj.M((p7a) ny8Var2.getValue(), zo5.b(4.0f, yl5.d().getDisplayMetrics().density, hq9Var.getLeft()), qv1.b(4.0f, yl5.d().getDisplayMetrics().density, getMediaType().getMeasuredHeight(), hq9Var.getBottom()), 0, 12);
        }
        return this.s ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight();
    }

    @Override // defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        return true;
    }

    @Override // defpackage.z5j
    public final boolean z() {
        return this.o.getImageAttach().e;
    }
}
