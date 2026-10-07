package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes4.dex */
public final class u93 extends LinearLayout implements eph {
    public final gnh a;
    public final gnh b;
    public final gnh c;
    public final Paint d;

    public u93(Context context) {
        super(context, null);
        gnh gnhVar = new gnh(context);
        this.a = gnhVar;
        gnh gnhVar2 = new gnh(context);
        this.b = gnhVar2;
        gnh gnhVar3 = new gnh(context);
        this.c = gnhVar3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        a8g a8gVar = pq3.j;
        paint.setColor(a8gVar.h(this).B().b);
        this.d = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 16.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        gradientDrawable.setColors((int[]) a8gVar.h(this).C().a.f);
        setOrientation(1);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        addView(gnhVar, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams2.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        layoutParams2.gravity = 8388613;
        addView(gnhVar2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388611;
        layoutParams3.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        layoutParams3.bottomMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        addView(gnhVar3, layoutParams3);
        setClipToOutline(true);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        setBackground(gradientDrawable);
    }

    public final void a(t93 t93Var) {
        int i;
        fda fdaVar = t93Var.d;
        npa npaVar = t93Var.e;
        aka akaVarD = npa.d(npaVar, t93Var.a, fdaVar, true, false, 24);
        rt2 rt2Var = t93Var.a;
        fda fdaVar2 = t93Var.b;
        aka akaVarD2 = npa.d(npaVar, rt2Var, fdaVar2, true, false, 24);
        rt2 rt2Var2 = t93Var.a;
        fda fdaVar3 = t93Var.c;
        aka akaVarD3 = npa.d(npaVar, rt2Var2, fdaVar3, true, false, 24);
        gnh gnhVar = this.a;
        gnhVar.setTextMessageLayout(akaVarD2);
        xr8 xr8Var = fea.u;
        a8g a8gVar = pq3.j;
        kbc kbcVarH = a8gVar.h(gnhVar);
        xr8Var.getClass();
        gnhVar.setBackground(xr8.j(kbcVarH));
        c cVar = fdaVar2.e;
        cVar.j();
        gnhVar.e(cVar.k, false);
        gnh gnhVar2 = this.b;
        gnhVar2.setTextMessageLayout(akaVarD);
        kja kjaVar = fdaVar.a.E;
        if (kjaVar != null) {
            gnhVar2.x(kjaVar, false);
        }
        gnhVar2.setBackground(xr8.j(a8gVar.h(gnhVar2)));
        gnhVar2.setDateViewStatus(f9j.Seen);
        c cVar2 = fdaVar.e;
        cVar2.j();
        gnhVar2.e(cVar2.k, false);
        gnh gnhVar3 = this.c;
        gnhVar3.setTextMessageLayout(akaVarD3);
        gnhVar3.setBackground(xr8.j(a8gVar.h(gnhVar3)));
        c cVar3 = fdaVar3.e;
        cVar3.j();
        gnhVar3.e(cVar3.k, false);
        kbc kbcVar = t93Var.f;
        xac xacVar = (xac) kbcVar.f().b;
        gnhVar2.K(xacVar);
        gnhVar2.setTextMessageColors(xacVar);
        gnhVar2.G(xacVar, true);
        Drawable background = gnhVar2.getBackground();
        fea feaVar = background instanceof fea ? (fea) background : null;
        if (feaVar != null) {
            i = 1;
            if (fea.b(feaVar, false, 1, true, true, xacVar.d.d, false, 72)) {
                feaVar.invalidateSelf();
            }
        } else {
            i = 1;
        }
        gnhVar2.requestLayout();
        xac xacVar2 = (xac) kbcVar.f().a;
        vac vacVar = xacVar2.d;
        gnhVar3.setTextMessageColors(xacVar2);
        gnhVar3.K(xacVar2);
        Drawable background2 = gnhVar3.getBackground();
        fea feaVar2 = background2 instanceof fea ? (fea) background2 : null;
        if (feaVar2 != null) {
            int i2 = i;
            i = i2;
            if (fea.b(feaVar2, true, i2, true, true, vacVar.d, false, 72)) {
                feaVar2.invalidateSelf();
            }
        }
        gnhVar3.requestLayout();
        gnhVar.K(xacVar2);
        gnhVar.setTextMessageColors(xacVar2);
        Drawable background3 = gnhVar.getBackground();
        fea feaVar3 = background3 instanceof fea ? (fea) background3 : null;
        if (feaVar3 != null) {
            if (fea.b(feaVar3, true, i, true, true, vacVar.d, false, 72)) {
                feaVar3.invalidateSelf();
            }
        }
        gnhVar.requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (yl5.d().getDisplayMetrics().density * 1.0f) / 2.0f;
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, (yl5.d().getDisplayMetrics().density * 16.0f) - f, (yl5.d().getDisplayMetrics().density * 16.0f) - f, this.d);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors((int[]) kbcVar.C().a.f);
        }
        pq3.g(pq3.j.e(getContext()), this);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
        requestLayout();
    }
}
