package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ei5 extends LinearLayout implements eph {
    public static final /* synthetic */ zv8[] l = {new z8b(ei5.class, "maxCount", "getMaxCount()I"), zo5.e(zfe.a, ei5.class, "minLines", "getMinLines()I"), new z8b(ei5.class, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), new z8b(ei5.class, "textColorAttr", "getTextColorAttr()I"), new z8b(ei5.class, "hintColorAttr", "getHintColorAttr()I"), new z8b(ei5.class, "limitTextColorAttr", "getLimitTextColorAttr()I"), new z8b(ei5.class, "showLimitError", "getShowLimitError()Z"), new z8b(ei5.class, "showLengthLimitWhileFocused", "getShowLengthLimitWhileFocused()Z")};
    public final di5 a;
    public final di5 b;
    public final di5 c;
    public final di5 d;
    public final di5 e;
    public final di5 f;
    public Integer g;
    public final di5 h;
    public final di5 i;
    public final p1c j;
    public final TextView k;

    public ei5(Context context) {
        super(context, null);
        this.a = new di5(this, 0);
        this.b = new di5(this, 1);
        this.c = new di5(this, 2);
        this.d = new di5(Integer.valueOf(R.attr.text_primary), this, 3);
        Integer numValueOf = Integer.valueOf(R.attr.text_tertiary);
        this.e = new di5(numValueOf, this, 4);
        this.f = new di5(numValueOf, this, 5);
        this.h = new di5(this, 6);
        this.i = new di5(this, 7);
        p1c p1cVar = new p1c(context, 14);
        p1cVar.setId(R.id.oneme_description_field_with_limit);
        q9i.a(q9i.e, p1cVar);
        p1cVar.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), p1cVar.getLineHeight());
        np4.D(p1cVar, gradientDrawable);
        p1cVar.setGravity(8388659);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        p1cVar.setLayoutParams(layoutParams);
        p1cVar.setInputType(p1cVar.getInputType() | 16384);
        p1cVar.setPadding(0, 0, 0, 0);
        this.j = p1cVar;
        TextView textView = new TextView(context);
        q9i.a(q9i.m, textView);
        textView.setPadding(0, 0, 0, 0);
        textView.setTextAlignment(7);
        textView.setGravity(8388693);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.k = textView;
        setOrientation(0);
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new nt4(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
        addView(p1cVar);
        addView(textView);
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        setDescendantFocusability(262144);
        onThemeChanged(pq3.j.h(this));
    }

    private final boolean getShowLimitError() {
        zv8 zv8Var = l[6];
        return ((Boolean) this.h.b).booleanValue();
    }

    public static final void setSelectionEnd$lambda$0(ei5 ei5Var) {
        Editable text = ei5Var.j.getText();
        ei5Var.j.setSelection(text != null ? text.length() : 0);
    }

    public final void setShowLimitError(boolean z) {
        this.h.B(this, l[6], Boolean.valueOf(z));
    }

    public final Integer getBackgroundColorAttr() {
        zv8 zv8Var = l[2];
        return (Integer) this.c.b;
    }

    public final int getHintColorAttr() {
        zv8 zv8Var = l[4];
        return ((Number) this.e.b).intValue();
    }

    public final Integer getLimitErrorTextColorAttr() {
        return this.g;
    }

    public final int getLimitTextColorAttr() {
        zv8 zv8Var = l[5];
        return ((Number) this.f.b).intValue();
    }

    public final int getMaxCount() {
        zv8 zv8Var = l[0];
        return ((Number) this.a.b).intValue();
    }

    public final int getMinLines() {
        zv8 zv8Var = l[1];
        return ((Number) this.b.b).intValue();
    }

    public final boolean getShowLengthLimitWhileFocused() {
        zv8 zv8Var = l[7];
        return ((Boolean) this.i.b).booleanValue();
    }

    public final int getTextColorAttr() {
        zv8 zv8Var = l[3];
        return ((Number) this.d.b).intValue();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return nl9.d(this.j, true);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Integer num;
        p1c p1cVar = this.j;
        Drawable drawableR = np4.r(p1cVar);
        GradientDrawable gradientDrawable = drawableR instanceof GradientDrawable ? (GradientDrawable) drawableR : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(kbcVar.getText().h));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        a8g a8gVar = pq3.j;
        if (backgroundColorAttr != null) {
            setBackgroundColor(oc9.Z(backgroundColorAttr.intValue(), a8gVar.h(this)));
        }
        p1cVar.setTextColor(oc9.Z(getTextColorAttr(), a8gVar.h(this)));
        p1cVar.setHintTextColor(oc9.Z(getHintColorAttr(), a8gVar.h(this)));
        f55.f(p1cVar, kbcVar);
        int limitTextColorAttr = (!getShowLimitError() || (num = this.g) == null) ? getLimitTextColorAttr() : num.intValue();
        this.k.setTextColor(oc9.Z(limitTextColorAttr, a8gVar.h(this)));
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.c.B(this, l[2], num);
    }

    public final void setHint(ynh ynhVar) {
        this.j.setHint(ynhVar.d(this));
    }

    public final void setHintColorAttr(int i) {
        this.e.B(this, l[4], Integer.valueOf(i));
    }

    public final void setLimitErrorTextColorAttr(Integer num) {
        this.g = num;
    }

    public final void setLimitTextColorAttr(int i) {
        this.f.B(this, l[5], Integer.valueOf(i));
    }

    public final void setMaxCount(int i) {
        this.a.B(this, l[0], Integer.valueOf(i));
    }

    public final void setMinLines(int i) {
        this.b.B(this, l[1], Integer.valueOf(i));
    }

    public final void setShowLengthLimitWhileFocused(boolean z) {
        this.i.B(this, l[7], Boolean.valueOf(z));
    }

    public final void setText(String str) {
        String str2 = str == null ? "" : str;
        p1c p1cVar = this.j;
        p1cVar.setTextKeepState(str2);
        int i = 4;
        if (!getShowLengthLimitWhileFocused() ? getMaxCount() != Integer.MAX_VALUE : p1cVar.isFocused()) {
            i = 0;
        }
        TextView textView = this.k;
        textView.setVisibility(i);
        textView.setText(String.valueOf(getMaxCount() - (str != null ? str.length() : 0)));
    }

    public final void setTextColorAttr(int i) {
        this.d.B(this, l[3], Integer.valueOf(i));
    }
}
