package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class w5e extends ViewGroup implements eph {
    public boolean a;
    public ValueAnimator b;
    public final Paint c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final TextView i;
    public final v0c j;
    public final v5e k;
    public final v5e l;
    public final v5e m;
    public static final /* synthetic */ zv8[] o = {new z8b(w5e.class, "isOwn", "isOwn()Z"), zo5.e(zfe.a, w5e.class, "reaction", "getReaction()Lru/ok/tamtam/models/message/reactions/Reaction;"), new z8b(w5e.class, "count", "getCount()I")};
    public static final px8 n = new px8();
    public static final ifh p = new ifh(new tyd(6));

    public w5e(Context context) {
        super(context);
        this.c = new Paint(1);
        this.d = -1.0f;
        TextView textView = new TextView(context);
        q9i.a(q9i.z, textView);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(-1);
        this.i = textView;
        v0c v0cVar = new v0c(context);
        v0cVar.setHasBackground(false);
        n.getClass();
        v0cVar.setReplaceInterpolator((PathInterpolator) p.getValue());
        v0cVar.setTypography(q9i.j.h());
        this.j = v0cVar;
        this.k = new v5e(this, 0);
        this.l = new v5e(new s5e(""), this);
        this.m = new v5e(this, 2);
        setOutlineProvider(new fn(3));
        addView(textView);
        addView(v0cVar);
    }

    private final float getEmojiCenterX() {
        TextView textView = this.i;
        return (textView.getWidth() / 2.0f) + textView.getLeft();
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            lsk.a(valueAnimator);
        }
        float measuredWidth = getMeasuredWidth() - getEmojiCenterX();
        float f = 0.0f;
        if (this.d == -1.0f) {
            this.d = z ? measuredWidth : 0.0f;
        }
        float f2 = this.d;
        Float fValueOf = Float.valueOf(f2);
        if (f2 == 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : measuredWidth;
        if (!z) {
            fFloatValue = this.d;
        }
        float f3 = z ? 0.0f : measuredWidth;
        Float fValueOf2 = Float.valueOf(fFloatValue);
        Float fValueOf3 = Float.valueOf(f3);
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = fValueOf3.floatValue();
        if (measuredWidth > 0.0f) {
            float fU = oc9.u(this.d / measuredWidth, 0.0f, 1.0f);
            f = z ? fU * 350.0f : (1.0f - fU) * 500.0f;
        }
        long j = (long) f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue2, fFloatValue3);
        valueAnimatorOfFloat.setDuration(j);
        this.j.setReplaceDuration(j);
        n.getClass();
        valueAnimatorOfFloat.setInterpolator((PathInterpolator) p.getValue());
        valueAnimatorOfFloat.addUpdateListener(new ak(26, this));
        valueAnimatorOfFloat.addListener(new u5e(this, fFloatValue2, 0));
        valueAnimatorOfFloat.addListener(new li(16, this));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    public final boolean b() {
        zv8 zv8Var = o[0];
        return ((Boolean) this.k.b).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.a;
        Paint paint = this.c;
        v0c v0cVar = this.j;
        if (z) {
            paint.setColor(this.f);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            float emojiCenterX = getEmojiCenterX();
            if (((int) this.d) + emojiCenterX > v0cVar.getRight()) {
                v0cVar.setTextColor(this.g);
            } else {
                v0cVar.setTextColor(this.h);
            }
            paint.setColor(this.e);
            TextView textView = this.i;
            canvas2.drawCircle(emojiCenterX, (textView.getHeight() / 2.0f) + textView.getTop(), this.d, paint);
        } else {
            canvas2 = canvas;
            paint.setColor(b() ? this.e : this.f);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            v0cVar.setTextColor(b() ? this.g : this.h);
        }
        super.dispatchDraw(canvas2);
    }

    public final int getCount() {
        zv8 zv8Var = o[2];
        return ((Number) this.m.b).intValue();
    }

    public final s5e getReaction() {
        zv8 zv8Var = o[1];
        return (s5e) this.l.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.i;
        qyj.M(textView, iK, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
        int iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredWidth(), iK);
        int measuredHeight2 = getMeasuredHeight() / 2;
        v0c v0cVar = this.j;
        qyj.M(v0cVar, iE, measuredHeight2 - (v0cVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iD = c0a.d(10.0f, yl5.d().getDisplayMetrics().density, 2);
        int iA = qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        TextView textView = this.i;
        textView.measure(iA, iA);
        int iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredWidth(), iD);
        v0c v0cVar = this.j;
        v0cVar.measure(0, 0);
        setMeasuredDimension(v0cVar.getMeasuredWidth() + iE, Math.max(gm0.K(28.0f * yl5.d().getDisplayMetrics().density), v0cVar.getMeasuredHeight()));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
    }

    public final void setCount(int i) {
        this.m.B(this, o[2], Integer.valueOf(i));
    }

    public final void setOnChipClickListener(cf7 cf7Var) {
        qe7.H(this, 300L, new aeb(this, 18, cf7Var));
    }

    public final void setOwn(boolean z) {
        this.k.B(this, o[0], Boolean.valueOf(z));
    }

    public final void setReaction(s5e s5eVar) {
        this.l.B(this, o[1], s5eVar);
    }
}
