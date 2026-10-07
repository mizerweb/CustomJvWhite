package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class flg extends ViewGroup implements eph {
    public kbc a;
    public final ny8 b;
    public final ny8 c;
    public final TextView d;
    public final Rect e;
    public final Rect f;

    public flg(Context context) {
        super(context);
        final int i = 0;
        this.b = rx8.P(3, new af7(this) { // from class: elg
            public final /* synthetic */ flg b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                flg flgVar = this.b;
                switch (i2) {
                    case 0:
                        return flg.b(flgVar);
                    default:
                        return flg.a(flgVar);
                }
            }
        });
        final int i2 = 1;
        this.c = rx8.P(3, new af7(this) { // from class: elg
            public final /* synthetic */ flg b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                flg flgVar = this.b;
                switch (i3) {
                    case 0:
                        return flg.b(flgVar);
                    default:
                        return flg.a(flgVar);
                }
            }
        });
        TextView textView = new TextView(context);
        textView.setText(R.string.oneme_stickers_set_create_new_set);
        textView.setTextColor(getCurrentTheme().getText().h);
        q9i.a(q9i.n, textView);
        textView.setGravity(17);
        this.d = textView;
        this.e = new Rect();
        this.f = new Rect();
        addView(textView);
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK, iK, iK, iK);
    }

    public static ofg a(flg flgVar) {
        return new ofg(flgVar.getCurrentTheme().l().c);
    }

    public static Drawable b(flg flgVar) {
        int i = flgVar.getCurrentTheme().getIcon().h;
        Drawable drawableMutate = flgVar.getContext().getDrawable(R.drawable.icon_plus_mini).mutate();
        sb8.m0(i, drawableMutate);
        return drawableMutate;
    }

    private final kbc getCurrentTheme() {
        kbc kbcVar = this.a;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    private final Drawable getPlusDrawable() {
        return (Drawable) this.b.getValue();
    }

    private final ofg getSquircleBackgroundDrawable() {
        return (ofg) this.c.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ofg squircleBackgroundDrawable = getSquircleBackgroundDrawable();
        squircleBackgroundDrawable.setBounds(this.e);
        squircleBackgroundDrawable.draw(canvas);
        Drawable plusDrawable = getPlusDrawable();
        plusDrawable.setBounds(this.f);
        plusDrawable.draw(canvas);
    }

    public final kbc getCustomTheme() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() / 2;
        TextView textView = this.d;
        qyj.M(textView, measuredWidth - (textView.getMeasuredWidth() / 2), zo5.b(4.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iA = qv1.a(64.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        TextView textView = this.d;
        textView.measure(iA, View.MeasureSpec.makeMeasureSpec(textView.getLineHeight(), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.set(getPaddingStart(), getPaddingTop(), i - getPaddingEnd(), i2 - getPaddingBottom());
        int i5 = i2 / 2;
        this.f.set((i - gm0.K(yl5.d().getDisplayMetrics().density * 16.0f)) / 2, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, i5), (gm0.K(16.0f * yl5.d().getDisplayMetrics().density) + i) / 2, i5);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.a;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        this.d.setTextColor(kbcVar.getText().h);
        sb8.m0(kbcVar.getIcon().h, getPlusDrawable());
        ofg squircleBackgroundDrawable = getSquircleBackgroundDrawable();
        squircleBackgroundDrawable.c.B(squircleBackgroundDrawable, ofg.d[0], Integer.valueOf(kbcVar.l().c));
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.a = kbcVar;
    }
}
