package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class bf3 extends ViewGroup implements eph {
    public final ny8 a;
    public final ny8 b;
    public final kwb c;
    public final TextView d;
    public final rfb e;
    public final cyb f;
    public final ny8 g;
    public osi h;

    public bf3(Context context) {
        super(context);
        final int i = 0;
        this.a = rx8.P(3, new af7(this) { // from class: af3
            public final /* synthetic */ bf3 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                bf3 bf3Var = this.b;
                switch (i2) {
                    case 0:
                        return bf3Var.getContext().getDrawable(R.drawable.icon_plus).mutate();
                    case 1:
                        return bf3Var.getContext().getDrawable(R.drawable.icon_check).mutate();
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) pq3.j.h(bf3Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        final int i2 = 1;
        this.b = rx8.P(3, new af7(this) { // from class: af3
            public final /* synthetic */ bf3 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                bf3 bf3Var = this.b;
                switch (i3) {
                    case 0:
                        return bf3Var.getContext().getDrawable(R.drawable.icon_plus).mutate();
                    case 1:
                        return bf3Var.getContext().getDrawable(R.drawable.icon_check).mutate();
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) pq3.j.h(bf3Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        kwb kwbVar = new kwb(context);
        kwbVar.setFocusable(0);
        this.c = kwbVar;
        TextView textView = new TextView(context);
        q9i.a(q9i.f.h(), textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setSingleLine();
        np4.C(textView, false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.d = textView;
        rfb rfbVar = new rfb(context);
        rfbVar.g(q9i.i, bx5.b);
        rfbVar.setTextColor(a8gVar.h(rfbVar).getText().d);
        final int i3 = 2;
        rfbVar.setMaxLinesValue(2);
        rfbVar.setFocusable(0);
        rfbVar.setFallbackLineSpace(false);
        rfbVar.setEllipsizing(truncateAt);
        this.e = rfbVar;
        cyb cybVar = new cyb(context);
        cybVar.setSize(ayb.j);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setIcon(getPlusDrawable());
        this.f = cybVar;
        this.g = rx8.P(3, new af7(this) { // from class: af3
            public final /* synthetic */ bf3 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                bf3 bf3Var = this.b;
                switch (i4) {
                    case 0:
                        return bf3Var.getContext().getDrawable(R.drawable.icon_plus).mutate();
                    case 1:
                        return bf3Var.getContext().getDrawable(R.drawable.icon_check).mutate();
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) pq3.j.h(bf3Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        setBackground(getRippleDrawable());
        addView(kwbVar);
        addView(textView);
        addView(rfbVar);
        addView(cybVar);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.b.getValue();
    }

    private final Drawable getPlusDrawable() {
        return (Drawable) this.a.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.g.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        kwb kwbVar = this.c;
        qyj.M(kwbVar, paddingStart, paddingTop, 0, 12);
        rfb rfbVar = this.e;
        CharSequence textValue = rfbVar.getTextValue();
        TextView textView = this.d;
        if (textValue == null || textValue.length() == 0) {
            qyj.M(textView, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight()), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        } else if (rfbVar.getMeasuredHeight() <= textView.getMeasuredHeight()) {
            qyj.M(textView, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight()), ((getMeasuredHeight() / 2) - (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) / 2)) - textView.getMeasuredHeight(), 0, 12);
            qyj.M(rfbVar, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight()), zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getBottom()), 0, 12);
        } else {
            qyj.M(textView, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight()), getPaddingTop(), 0, 12);
            qyj.M(rfbVar, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight()), zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getBottom()), 0, 12);
        }
        int measuredWidth = getMeasuredWidth() - getPaddingEnd();
        cyb cybVar = this.f;
        qyj.M(cybVar, measuredWidth - cybVar.getMeasuredWidth(), (getMeasuredHeight() / 2) - (cybVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.d;
        if (soh.c(textView)) {
            setVerified(true);
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int iA = qv1.a(54.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm0.K(54.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        kwb kwbVar = this.c;
        kwbVar.measure(iA, iMakeMeasureSpec);
        int iB = qv1.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getMeasuredWidth(), paddingStart);
        cyb cybVar = this.f;
        cybVar.measure(0, 0);
        int iK = iB - (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) + cybVar.getMeasuredWidth());
        textView.forceLayout();
        textView.measure(View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(textView.getLineHeight(), 1073741824));
        rfb rfbVar = this.e;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(rfbVar.getLineHeight() * 2, 1073741824);
        rfbVar.getAsView().forceLayout();
        rfbVar.getAsView().measure(iK, iMakeMeasureSpec2);
        setMeasuredDimension(size, Math.max(rfbVar.getMeasuredHeight() + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredHeight() + getPaddingBottom() + getPaddingTop()), gm0.K(72.0f * yl5.d().getDisplayMetrics().density)));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.c.onThemeChanged(kbcVar);
        this.d.setTextColor(kbcVar.getText().b);
        this.e.setTextColor(kbcVar.getText().d);
        this.f.e();
        getRippleDrawable().setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
    }

    public final void setItem(h9h h9hVar) {
        CharSequence charSequence = h9hVar.d;
        Uri uri = h9hVar.b;
        String string = uri != null ? uri.toString() : null;
        Long lValueOf = Long.valueOf(h9hVar.e);
        CharSequence charSequence2 = h9hVar.f;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        kwb.v(this.c, string, lValueOf, charSequence2);
        this.d.setText(h9hVar.c);
        int i = charSequence.length() == 0 ? 8 : 0;
        rfb rfbVar = this.e;
        rfbVar.setVisibility(i);
        rfbVar.setTextValue(charSequence);
        setVerified(h9hVar.g);
        setStatus(h9hVar.j);
        invalidate();
        requestLayout();
    }

    public final void setStatus(g9h g9hVar) {
        boolean z = g9hVar == g9h.b;
        cyb cybVar = this.f;
        cybVar.setLoading(z);
        int iOrdinal = g9hVar.ordinal();
        if (iOrdinal == 0) {
            cybVar.setIcon(getPlusDrawable());
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                cybVar.setIcon(getCheckDrawable());
            } else {
                ore.o();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public final void setVerified(boolean z) {
        osi osiVar;
        TextView textView = this.d;
        int iI0 = oc9.i0(soh.e(textView));
        a8g a8gVar = pq3.j;
        if (z) {
            osi osiVarA = soh.a(textView);
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                osi osiVar2 = this.h;
                if (osiVar2 != null) {
                    osiVar2.onThemeChanged(a8gVar.h(this));
                    return;
                }
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(textView);
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = this.h;
                if (osiVar == null || osiVar.a != iI0) {
                    osiVar = new osi(getContext(), iI0, ldf.e);
                    this.h = osiVar;
                }
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        osi osiVar3 = this.h;
        if (osiVar3 != null) {
            osiVar3.onThemeChanged(a8gVar.h(this));
        }
        soh.d(textView, osiVar);
    }
}
