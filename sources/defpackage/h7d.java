package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h7d extends ViewGroup implements eph {
    public static final /* synthetic */ zv8[] m = {new z8b(h7d.class, "count", "getCount()I"), zo5.e(zfe.a, h7d.class, "isWinner", "isWinner()Z"), new z8b(h7d.class, "bubbleColors", "getBubbleColors()Lone/me/sdk/design/theme/OneMeTheme$Bubbles$Colors;")};
    public final Paint a;
    public final Paint b;
    public final ny8 c;
    public final ny8 d;
    public final v0c e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final g7d j;
    public final g7d k;
    public final g7d l;

    public h7d(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = new Paint(1);
        this.c = rx8.P(3, new iua(28, this));
        this.d = rx8.P(3, new vx9(context, 26, this));
        v0c v0cVar = new v0c(context);
        v0cVar.setId(R.id.messages_list_poll_counter);
        v0cVar.b(0, false, true);
        v0cVar.setHasBackground(false);
        v0cVar.setTypography(q9i.u.h());
        this.e = v0cVar;
        this.f = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.g = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.h = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.i = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.j = new g7d(this, 0);
        this.k = new g7d(this, 1);
        this.l = new g7d(this, 2);
        setOutlineProvider(new fn(2));
        setLayerType(2, null);
        addView(v0cVar, new ViewGroup.LayoutParams(-2, -2));
    }

    public static ImageView a(Context context, h7d h7dVar) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.messages_list_poll_winner);
        imageView.setVisibility(0);
        imageView.setImageDrawable(h7dVar.getTrophyDrawable());
        h7dVar.addView(imageView, new ViewGroup.LayoutParams(-2, -2));
        return imageView;
    }

    public static final void b(h7d h7dVar, xac xacVar) {
        v0c v0cVar = h7dVar.e;
        g7d g7dVar = h7dVar.k;
        zv8 zv8Var = m[1];
        if (((Boolean) g7dVar.b).booleanValue()) {
            h7dVar.a.setColor(xacVar.c.c);
            v0cVar.setTextColor(0);
        } else {
            h7dVar.b.setColor(xacVar.a.e);
            v0cVar.setTextColor(xacVar.b.l);
        }
        h7dVar.invalidate();
        h7dVar.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIconView() {
        return (ImageView) this.d.getValue();
    }

    private final Drawable getTrophyDrawable() {
        return (Drawable) this.c.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zv8 zv8Var = m[1];
        if (((Boolean) this.k.b).booleanValue()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.b);
        }
    }

    public final xac getBubbleColors() {
        zv8 zv8Var = m[2];
        return (xac) this.l.b;
    }

    public final int getCount() {
        zv8 zv8Var = m[0];
        return ((Number) this.j.b).intValue();
    }

    public final int getCounterWidth() {
        return this.e.getWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        boolean zO = n7j.o(this.d);
        int i5 = this.f;
        if (zO) {
            qyj.M(getIconView(), i5, (getMeasuredHeight() / 2) - (getIconView().getMeasuredHeight() / 2), 0, 12);
            measuredWidth = getIconView().getMeasuredWidth() + this.h + i5;
        } else {
            measuredWidth = i5;
        }
        v0c v0cVar = this.e;
        if (measuredWidth == i5) {
            measuredWidth = (getMeasuredWidth() / 2) - (v0cVar.getMeasuredWidth() / 2);
        }
        qyj.M(v0cVar, measuredWidth, (getMeasuredHeight() / 2) - (v0cVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f * 2;
        if (n7j.o(this.d)) {
            int i4 = this.g;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            getIconView().measure(iMakeMeasureSpec, iMakeMeasureSpec);
            i3 += i4 + this.h;
        }
        v0c v0cVar = this.e;
        v0cVar.measure(0, 0);
        int measuredWidth = v0cVar.getMeasuredWidth() + i3;
        int i5 = this.i;
        setMeasuredDimension(Math.max(i5, measuredWidth), Math.max(i5, v0cVar.getMeasuredHeight()));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
    }

    public final void setBubbleColors(xac xacVar) {
        this.l.B(this, m[2], xacVar);
    }

    public final void setCount(int i) {
        this.j.B(this, m[0], Integer.valueOf(i));
    }

    public final void setWinner(boolean z) {
        this.k.B(this, m[1], Boolean.valueOf(z));
    }
}
