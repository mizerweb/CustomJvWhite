package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.util.EnumMap;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jr6 extends Drawable implements eph {
    public final Context a;
    public final ir6 b;
    public zp6 c;
    public final RectF d;
    public final TextPaint e;
    public final ny8 f;
    public final BoringLayout.Metrics g;
    public BoringLayout h;
    public final float i;
    public float j;

    public jr6(Context context, ir6 ir6Var) {
        this.a = context;
        this.b = ir6Var;
        this.d = new RectF();
        TextPaint textPaint = new TextPaint();
        this.e = textPaint;
        this.f = rx8.P(3, new s35(22));
        this.g = new BoringLayout.Metrics();
        this.i = 9.0f;
        long jB = vl5.b(1, 9.0f);
        long jB2 = vl5.b(1, 14.0f);
        long jB3 = vl5.b(0, 0.03f);
        String str = q9i.k.e;
        EnumMap enumMap = new EnumMap(bx5.class);
        vl5 vl5Var = new vl5(jB);
        bx5 bx5Var = bx5.b;
        enumMap.put(bx5Var, vl5Var);
        EnumMap enumMap2 = new EnumMap(bx5.class);
        enumMap2.put(bx5Var, new vl5(jB2));
        EnumMap enumMap3 = new EnumMap(bx5.class);
        enumMap3.put(bx5Var, new vl5(jB3));
        new noh(true, enumMap, enumMap2, enumMap3, str, 2, false).a(context, textPaint, context.getResources().getDisplayMetrics(), bx5Var);
        this.j = 1.0f;
    }

    public final void a(zp6 zp6Var) {
        if (cqk.d(this.c, zp6Var)) {
            return;
        }
        this.c = zp6Var;
        onThemeChanged(pq3.j.e(this.a).m());
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = yl5.d().getDisplayMetrics().density * 6.0f * this.j;
        float f2 = yl5.d().getDisplayMetrics().density * 2.0f * this.j;
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            this.b.draw(canvas);
            canvas.restoreToCount(iSave);
            float f3 = yl5.d().getDisplayMetrics().density * 4.0f * this.j;
            ny8 ny8Var = this.f;
            Paint paint = (Paint) ny8Var.getValue();
            RectF rectF = this.d;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            BoringLayout boringLayout = this.h;
            if (boringLayout == null) {
                return;
            }
            float fC = c0a.c(rectF.width(), boringLayout.getWidth(), 0.5f, rectF.left);
            float fC2 = c0a.c(rectF.height(), boringLayout.getHeight(), 0.5f, rectF.top);
            int iSave2 = canvas.save();
            canvas.translate(fC, fC2);
            try {
                boringLayout.getPaint().setAlpha(((Paint) ny8Var.getValue()).getAlpha());
                boringLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        ir6 ir6Var = this.b;
        if (ir6Var.getCallback() != getCallback()) {
            ir6Var.setCallback(getCallback());
        }
        ir6Var.invalidateSelf();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iWidth = rect.width();
        if (iWidth == 0) {
            return;
        }
        float f = iWidth;
        this.j = f / gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        zp6 zp6Var = this.c;
        if (zp6Var == null) {
            return;
        }
        this.b.setBounds(0, 0, gm0.K(gm0.K(28.0f * yl5.d().getDisplayMetrics().density) * this.j), gm0.K(gm0.K(36.0f * yl5.d().getDisplayMetrics().density) * this.j));
        this.d.set(yl5.d().getDisplayMetrics().density * 4.0f * this.j, yl5.d().getDisplayMetrics().density * 18.0f * this.j, f - ((yl5.d().getDisplayMetrics().density * 4.0f) * this.j), f - ((yl5.d().getDisplayMetrics().density * 8.0f) * this.j));
        try {
            this.e.setTextSize(this.i * yl5.d().getDisplayMetrics().density * this.j);
            this.e.getFontMetricsInt(this.g);
            this.h = BoringLayout.make(zp6Var.a(), this.e, gm0.K(this.d.width()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, this.g, false);
        } catch (Throwable th) {
            this.h = null;
            String name = jr6.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qv1.k("fail to generate boring layout for ", zp6Var.a()), th);
            }
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        zp6 zp6Var = this.c;
        if (zp6Var == null) {
            return;
        }
        int i = kbcVar.w().a;
        int iZ = oc9.Z(zp6Var.h().b, kbcVar);
        int iZ2 = oc9.Z(zp6Var.h().c, kbcVar);
        ir6 ir6Var = this.b;
        VectorPath vectorPath = (VectorPath) ir6Var.a.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) ir6Var.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(iZ);
        }
        VectorPath vectorPath3 = (VectorPath) ir6Var.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(iZ2);
        }
        ((Paint) this.f.getValue()).setColor(oc9.Z(zp6Var.h().a, kbcVar));
        zp6Var.h().getClass();
        this.e.setColor(oc9.Z(R.attr.file_type_text, kbcVar));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        ((Paint) this.f.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ jr6(Context context) {
        this(context, new ir6(context));
    }
}
