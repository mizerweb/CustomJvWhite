package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class l8g extends v5a implements i8g, z5j {
    public final l1c A;
    public final ny8 B;
    public boolean C;
    public vn2 D;
    public sgg E;
    public final mkc F;
    public final ny8 G;
    public final vvi x;
    public final hq9 y;
    public final ny8 z;

    public l8g(Context context, boolean z) {
        vvi vviVar = new vvi();
        super(context);
        this.x = vviVar;
        hq9 hq9Var = new hq9(context);
        hq9Var.setShowProgress(true);
        this.y = hq9Var;
        this.z = rx8.P(3, new twf(context, 5));
        l1c l1cVar = new l1c(context);
        this.A = l1cVar;
        this.B = rx8.P(3, new twf(context, 6));
        this.F = new mkc(hq9Var, this, z, new occ(0, this, l8g.class, "mediaCorners", "mediaCorners()[F", 0, 7));
        vviVar.a = this;
        addView(l1cVar, -1, -2);
        addView(hq9Var, -1, -2);
        setTransitionGroup(true);
        l1cVar.setupNewController(true);
        this.G = rx8.P(3, new twf(context, 7));
    }

    public static final void N(l8g l8gVar, h50 h50Var) {
        hq9 hq9Var = l8gVar.y;
        h8g h8gVar = (h8g) l8gVar.getModel();
        if (cqk.d(h8gVar != null ? Long.valueOf(h8gVar.a) : null, h50Var != null ? Long.valueOf(h50Var.b()) : null)) {
            h8g h8gVar2 = (h8g) l8gVar.getModel();
            if (cqk.d(h8gVar2 != null ? h8gVar2.b : null, h50Var != null ? h50Var.a() : null)) {
                if (!(h50Var instanceof c50) && !(h50Var instanceof g50) && !(h50Var instanceof e50)) {
                    ny8 ny8Var = l8gVar.z;
                    if (ny8Var.d()) {
                        ((wti) ny8Var.getValue()).setVisibility(8);
                    }
                    Float fValueOf = Float.valueOf(0.0f);
                    zv8[] zv8VarArr = t58.A;
                    hq9Var.o(false, fValueOf, true);
                    return;
                }
                yab.d(l8gVar, l8gVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                l8gVar.getTransferStatusView().setVisibility(0);
                wti transferStatusView = l8gVar.getTransferStatusView();
                CharSequence charSequenceB = h50Var.c().b(l8gVar.getContext());
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

    private final tz0 getBlurPostProcessor() {
        return (tz0) this.B.getValue();
    }

    private final p7a getMediaType() {
        return (p7a) this.G.getValue();
    }

    private final wti getTransferStatusView() {
        return (wti) this.z.getValue();
    }

    @Override // defpackage.z5j
    public final boolean B() {
        return this.x.B();
    }

    @Override // defpackage.z5j
    public final void D(q5j q5jVar, t50 t50Var, long j, boolean z, boolean z2) {
        this.x.D(q5jVar, t50Var, j, z, z2);
    }

    @Override // defpackage.i8g
    public final void F(h8g h8gVar) {
        vn2 vn2Var;
        setModel(h8gVar);
        this.D = new vn2(5, this);
        if (isAttachedToWindow() && (vn2Var = this.D) != null) {
            vn2Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.D);
    }

    @Override // defpackage.rz9
    public final long I(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        hq9 hq9Var = this.y;
        hq9Var.measure(iMakeMeasureSpec, i4);
        ny8 ny8Var = this.z;
        if (ny8Var.d()) {
            ((wti) ny8Var.getValue()).measure(i3, i4);
        }
        ny8 ny8Var2 = this.G;
        if (ny8Var2.d()) {
            ((p7a) ny8Var2.getValue()).measure(i3, i4);
        }
        vvi vviVar = this.x;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.U(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = hq9Var.getBlurOffset();
        l1c l1cVar = this.A;
        if (blurOffset == 0) {
            boolean z = hq9Var.getMeasuredWidth() < i;
            this.C = z;
            if (z) {
                l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
            }
        } else if (hq9Var.C > 0) {
            this.C = true;
            int blurOffset2 = (hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredWidth();
            if (i < blurOffset2) {
                i = blurOffset2;
            }
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredHeight(), 1073741824));
        } else if (hq9Var.s()) {
            this.C = true;
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(hq9Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((hq9Var.getBlurOffset() * 2) + hq9Var.getMeasuredHeight(), 1073741824));
        } else {
            this.C = false;
        }
        return bj8.a(Math.max(this.C ? l1cVar.getMeasuredWidth() : hq9Var.getMeasuredWidth(), Math.max(getDate$message_list().getMeasuredWidth() + n7j.k(ny8Var2), n7j.k(ny8Var))), e9i.l0(this.C ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight(), getDate$message_list().getMeasuredHeight(), n7j.j(ny8Var2), n7j.j(ny8Var)));
    }

    @Override // defpackage.z5j
    public final void J() {
        this.x.J();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        l1c l1cVar = this.A;
        if (view == l1cVar && !this.C) {
            return false;
        }
        if (view != this.y && view != l1cVar && view != this.x.R()) {
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
        return this.F.d(motionEvent);
    }

    @Override // defpackage.z5j
    public View getPreviewView() {
        return this.y;
    }

    @Override // defpackage.kfa
    public final boolean l(MotionEvent motionEvent) {
        return this.y.n(motionEvent);
    }

    @Override // defpackage.z5j
    public final boolean n() {
        return this.x.n();
    }

    @Override // defpackage.rz9
    public final void q(iq9 iq9Var) {
        h8g h8gVar = (h8g) iq9Var;
        this.F.e(true);
        g58 g58Var = h8gVar.c;
        this.y.setImageAttach(g58Var);
        zqk.a(this.A, g58Var, getBlurPostProcessor(), false);
        if (g58Var.e) {
            yab.d(this, getMediaType(), new ViewGroup.LayoutParams(-2, -2));
            getMediaType().setVisibility(0);
        } else {
            ny8 ny8Var = this.G;
            if (ny8Var.d()) {
                ((p7a) ny8Var.getValue()).setVisibility(8);
            }
        }
        if (h8gVar.a()) {
            return;
        }
        ny8 ny8Var2 = this.z;
        if (ny8Var2.d()) {
            ((wti) ny8Var2.getValue()).setVisibility(8);
        }
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
        hq9 hq9Var = this.y;
        boolean zS = hq9Var.s();
        l1c l1cVar = this.A;
        int measuredHeight = zS ? ((l1cVar.getMeasuredHeight() - hq9Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.C || hq9Var.s()) ? i : ((getMeasuredWidth() - ((int) ((fea) getBackground()).s)) - hq9Var.getMeasuredWidth()) / 2;
        if (this.C) {
            qyj.M(l1cVar, i, i2, 0, 12);
        }
        qyj.M(hq9Var, measuredWidth, measuredHeight, 0, 12);
        vvi vviVar = this.x;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.T(measuredWidth, measuredHeight);
        }
        ny8 ny8Var = this.z;
        if (ny8Var.d()) {
            qyj.M((wti) ny8Var.getValue(), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, measuredWidth), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, hq9Var.getTop()), 0, 12);
        }
        ny8 ny8Var2 = this.G;
        if (ny8Var2.d()) {
            qyj.M((p7a) ny8Var2.getValue(), zo5.b(4.0f, yl5.d().getDisplayMetrics().density, hq9Var.getLeft()), qv1.b(4.0f, yl5.d().getDisplayMetrics().density, getMediaType().getMeasuredHeight(), hq9Var.getBottom()), 0, 12);
        }
        return this.C ? l1cVar.getMeasuredHeight() : hq9Var.getMeasuredHeight();
    }

    @Override // defpackage.gnh, defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (n9j.d(this.y, this).contains(x, y)) {
            return true;
        }
        return n9j.d(this.A, this).contains(x, y);
    }

    @Override // defpackage.z5j
    public final boolean z() {
        return this.y.getImageAttach().e;
    }
}
