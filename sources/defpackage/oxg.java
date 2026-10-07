package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class oxg extends EditText {
    public static final /* synthetic */ zv8[] q = {new z8b(oxg.class, "flowBackgroundColor", "getFlowBackgroundColor()I"), zo5.e(zfe.a, oxg.class, "flowCornerRadiusPx", "getFlowCornerRadiusPx()F"), new z8b(oxg.class, "flowHorizontalPaddingPx", "getFlowHorizontalPaddingPx()F"), new z8b(oxg.class, "flowVerticalPaddingPx", "getFlowVerticalPaddingPx()F")};
    public final ny8 a;
    public final Paint b;
    public CornerPathEffect c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final nxg j;
    public final nxg k;
    public final nxg l;
    public final nxg m;
    public final enh n;
    public boolean o;
    public boolean p;

    public oxg(Context context, ny8 ny8Var) {
        super(context);
        this.a = ny8Var;
        float f = yl5.d().getDisplayMetrics().density * 4.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.b = paint;
        this.c = new CornerPathEffect(f);
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new nxg(this, 0);
        this.k = new nxg(Float.valueOf(f), this, 1);
        this.l = new nxg(Float.valueOf(yl5.d().getDisplayMetrics().density * 8.0f), this, 2);
        this.m = new nxg(this, 3);
        this.n = new enh(getFlowHorizontalPaddingPx(), getFlowVerticalPaddingPx(), 2.0f);
        addTextChangedListener(new a3(9, this));
        setBreakStrategy(0);
        setHyphenationFrequency(0);
        getPaint().setLinearText(true);
        getPaint().setSubpixelText(true);
    }

    private final f66 getEmojiWorker() {
        return (f66) this.a.getValue();
    }

    public final void a(Editable editable) {
        if (this.o || editable == null || editable.length() == 0) {
            return;
        }
        this.o = true;
        try {
            getEmojiWorker().e(editable.length(), (int) getTextSize(), editable);
        } finally {
            this.o = false;
        }
    }

    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        invalidate();
    }

    public final void c() {
        Object[] spans;
        Editable text = getText();
        if (text == null || text.length() == 0 || this.o) {
            return;
        }
        try {
            spans = text.getSpans(0, text.length(), geg.class);
        } catch (Throwable unused) {
            spans = null;
        }
        geg[] gegVarArr = (geg[]) spans;
        if (gegVarArr != null) {
            for (geg gegVar : gegVarArr) {
                text.removeSpan(gegVar);
            }
        }
        a(text);
    }

    public final int getFlowBackgroundColor() {
        zv8 zv8Var = q[0];
        return ((Number) this.j.b).intValue();
    }

    public final float getFlowCornerRadiusPx() {
        zv8 zv8Var = q[1];
        return ((Number) this.k.b).floatValue();
    }

    public final float getFlowHorizontalPaddingPx() {
        zv8 zv8Var = q[2];
        return ((Number) this.l.b).floatValue();
    }

    public final float getFlowVerticalPaddingPx() {
        zv8 zv8Var = q[3];
        return ((Number) this.m.b).floatValue();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.p) {
            this.p = true;
            e9i.j0(new fz6(getEmojiWorker().a(), new hpf(this, null, 9), 3), v7j.b(this));
        }
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        Editable text;
        Paint paint = this.b;
        if (Color.alpha(getFlowBackgroundColor()) != 0 && (layout = getLayout()) != null && (text = getText()) != null && text.length() != 0) {
            boolean z = this.d;
            enh enhVar = this.n;
            if (z || this.e != layout.getWidth() || this.f != layout.getHeight() || this.g != text.length() || this.h != getGravity() || this.i != getTextAlignment()) {
                enhVar.b(layout, text);
                this.e = layout.getWidth();
                this.f = layout.getHeight();
                this.g = text.length();
                this.h = getGravity();
                this.i = getTextAlignment();
                this.d = false;
            }
            if (!enhVar.d.isEmpty()) {
                int height = (getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
                int height2 = layout.getHeight();
                float f = height > height2 ? (height - height2) / 2.0f : 0.0f;
                float compoundPaddingLeft = getCompoundPaddingLeft();
                float extendedPaddingTop = getExtendedPaddingTop() + f;
                int iSave = canvas.save();
                canvas.translate(compoundPaddingLeft, extendedPaddingTop);
                try {
                    paint.setColor(getFlowBackgroundColor());
                    paint.setPathEffect(this.c);
                    canvas.drawPath(enhVar.d, paint);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            b();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        b();
    }

    public final void setFlowBackgroundColor(int i) {
        this.j.B(this, q[0], Integer.valueOf(i));
    }

    public final void setFlowCornerRadiusPx(float f) {
        this.k.B(this, q[1], Float.valueOf(f));
    }

    public final void setFlowHorizontalPaddingPx(float f) {
        this.l.B(this, q[2], Float.valueOf(f));
    }

    public final void setFlowVerticalPaddingPx(float f) {
        this.m.B(this, q[3], Float.valueOf(f));
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        int gravity = getGravity();
        super.setGravity(i);
        if (gravity != i) {
            b();
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        int textAlignment = getTextAlignment();
        super.setTextAlignment(i);
        if (textAlignment != i) {
            b();
        }
    }
}
