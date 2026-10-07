package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.IOException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ubc extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] l;
    public SpannableString a;
    public SpannableString b;
    public final TextAppearanceSpan c;
    public final uz4 d;
    public final TextAppearanceSpan e;
    public final int f;
    public final ShapeDrawable g;
    public final RippleDrawable h;
    public final ny8 i;
    public final ny8 j;
    public final zb k;

    static {
        z8b z8bVar = new z8b(ubc.class, "isProgressEnabled", "isProgressEnabled()Z");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public ubc(Context context) {
        super(context, null);
        this.c = new TextAppearanceSpan(context, R.style.Typography_Title3);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.d = new uz4();
        this.e = new TextAppearanceSpan(context, R.style.Typography_Footnote);
        this.f = 3;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.g = shapeDrawable;
        a8g a8gVar = pq3.j;
        this.h = col.e(a8gVar.h(this), shapeDrawable, 0, 6);
        this.i = rx8.P(3, new bzb(context, 13));
        this.j = rx8.P(3, new vx9(context, 19, this));
        this.k = new zb(this);
        setMinimumHeight(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        onThemeChanged(a8gVar.h(this));
    }

    public static final void a(ubc ubcVar, boolean z) {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, ubcVar), new pyb(6)));
        while (pu6Var.hasNext()) {
            ((View) pu6Var.next()).setVisibility(z ? 0 : 8);
        }
    }

    private final void setupTextViewParams(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(2);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        textView.setTextAlignment(4);
        textView.setLineSpacing(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), 1.0f);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) throws IOException {
        SpannableString spannableStringValueOf;
        SpannableString spannableStringValueOf2;
        ny8 ny8Var = this.i;
        TextView textView = (TextView) ny8Var.getValue();
        textView.setId(R.id.oneme_button_textview_id);
        setupTextViewParams(textView);
        n7j.a(this, textView, -1);
        SpannableString spannableString = null;
        if (charSequence != this.a) {
            if (charSequence == null || (spannableStringValueOf2 = SpannableString.valueOf(charSequence)) == null) {
                spannableStringValueOf2 = null;
            } else {
                spannableStringValueOf2.setSpan(this.c, 0, charSequence.length(), 17);
                spannableStringValueOf2.setSpan(this.d, 0, charSequence.length(), 17);
            }
            this.a = spannableStringValueOf2;
        }
        if (charSequence2 != this.b) {
            if (charSequence2 != null && (spannableStringValueOf = SpannableString.valueOf(charSequence2)) != null) {
                spannableStringValueOf.setSpan(this.e, 0, charSequence2.length(), 17);
                spannableString = spannableStringValueOf;
            }
            this.b = spannableString;
        }
        TextView textView2 = (TextView) ny8Var.getValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence3 = this.a;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(charSequence3);
        SpannableString spannableString2 = this.b;
        if (spannableString2 != null) {
            spannableStringBuilderAppend.append('\n');
            spannableStringBuilderAppend.append((CharSequence) spannableString2);
        }
        textView2.setText(spannableStringBuilderAppend);
    }

    public final void c() {
        p6c p6cVar;
        ny8 ny8Var = this.j;
        if (ny8Var.d()) {
            r6c r6cVar = (r6c) ny8Var.getValue();
            r6cVar.setAppearance(pq3.j.e(r6cVar.getContext()).n() ? d6c.a : e6c.a);
            int i = f61.$EnumSwitchMapping$0[qt4.D(this.f)];
            if (i == 1) {
                p6cVar = n6c.a;
            } else {
                if (i != 2 && i != 3) {
                    ore.o();
                    return;
                }
                p6cVar = m6c.a;
            }
            r6cVar.setSize(p6cVar);
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i;
        TextView textView = (TextView) this.i.getValue();
        Context context = getContext();
        a8g a8gVar = pq3.j;
        if (a8gVar.e(context).n()) {
            i = a8gVar.h(this).getText().g;
        } else {
            a8gVar.h(this);
            i = -1;
        }
        textView.setTextColor(i);
        this.g.getPaint().setColor((a8gVar.e(getContext()).n() ? a8gVar.h(this).h() : a8gVar.h(this).h()).a);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(((fn8) a8gVar.h(this).u().c.a).c);
        RippleDrawable rippleDrawable = this.h;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
        c();
        invalidate();
    }

    public final void setProgressEnabled(boolean z) {
        this.k.B(this, l[0], Boolean.valueOf(z));
    }

    public final void setSubtitle(CharSequence charSequence) throws IOException {
        b(this.a, charSequence);
    }

    public final void setTitle(CharSequence charSequence) throws IOException {
        b(charSequence, this.b);
    }
}
