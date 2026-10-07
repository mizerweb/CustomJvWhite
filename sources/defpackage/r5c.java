package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class r5c extends LinearLayout implements eph {
    public q5c a;
    public cf7 b;
    public x0c c;
    public final lge d;
    public boolean e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final EditText i;
    public m4c j;

    public r5c(Context context) {
        super(context, null);
        this.d = new lge("^[+\\d][\\d\\s\\u00A0-]*$");
        InputFilter[] inputFilterArr = {new InputFilter() { // from class: n5c
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.a.d.b(charSequence) ? charSequence : "";
            }
        }};
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        q9i.a(q9i.c, textView);
        this.f = textView;
        TextView textViewE = qv1.e(context, R.id.oneme_login_country_codes);
        noh nohVar = q9i.e;
        q9i.a(nohVar, textViewE);
        textViewE.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
        this.g = textViewE;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.icon_chevron_down_mini);
        this.h = imageView;
        coc cocVar = new coc(context, new g3(23, this));
        EditText editText = new EditText(context);
        editText.setId(R.id.oneme_login_phone_edit_text);
        editText.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(8.0f * yl5.d().getDisplayMetrics().density), 0, 0, 0);
        editText.setLayoutParams(layoutParams);
        q9i.a(nohVar, editText);
        editText.setAutofillHints("phone");
        editText.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(gm0.J(((double) yl5.d().getDisplayMetrics().density) * 1.5d), editText.getLineHeight());
        np4.D(editText, gradientDrawable);
        editText.setFilters(inputFilterArr);
        editText.setKeyListener(DigitsKeyListener.getInstance("0123456789 -()"));
        editText.setImportantForAutofill(1);
        editText.setInputType(3);
        editText.setSingleLine(true);
        editText.setSaveEnabled(false);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCustomSelectionActionModeCallback(cocVar);
        editText.setCustomInsertionActionModeCallback(cocVar);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o5c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                this.a.e = false;
            }
        });
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: p5c
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                this.a.e = keyEvent.getAction() == 0 && i == 67;
                return false;
            }
        });
        this.i = editText;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        setOrientation(0);
        setMinimumHeight(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        addView(textView);
        addView(textViewE);
        addView(imageView);
        addView(editText);
        onThemeChanged(pq3.j.h(this));
        m4c m4cVar = new m4c(this);
        editText.addTextChangedListener(m4cVar);
        this.j = m4cVar;
    }

    public final String getCode() {
        return String.valueOf(this.g.getText());
    }

    public final cf7 getOnWindowFocusChanged() {
        return this.b;
    }

    public final String getPhone() {
        CharSequence text = this.g.getText();
        Editable text2 = this.i.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        return sb.toString();
    }

    public final q5c getPhoneFormatterProvider() {
        return this.a;
    }

    public final String getPhoneWithoutCode() {
        return String.valueOf(this.i.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i.removeTextChangedListener(this.j);
        this.j = null;
        this.a = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.h().b);
        EditText editText = this.i;
        Drawable drawableR = np4.r(editText);
        GradientDrawable gradientDrawable = drawableR instanceof GradientDrawable ? (GradientDrawable) drawableR : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(kbcVar.getText().h));
        }
        editText.setTextColor(kbcVar.getText().b);
        editText.setHintTextColor(kbcVar.getText().d);
        this.h.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        this.g.setTextColor(kbcVar.getText().b);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        cf7 cf7Var = this.b;
        if (cf7Var != null) {
            cf7Var.invoke(Boolean.valueOf(z));
        }
    }

    public final void setCountry(x0c x0cVar) {
        this.c = x0cVar;
        this.g.setText("+" + x0cVar.b);
        CharSequence charSequence = x0cVar.d;
        if (charSequence != null) {
            this.f.setText(charSequence);
        }
    }

    public final void setHint(CharSequence charSequence) {
        this.i.setHint(charSequence);
    }

    public final void setOnCountryViewClickListener(af7 af7Var) {
        zub zubVar = new zub(2, af7Var);
        this.f.setOnClickListener(zubVar);
        this.g.setOnClickListener(zubVar);
        this.h.setOnClickListener(zubVar);
    }

    public final void setOnWindowFocusChanged(cf7 cf7Var) {
        this.b = cf7Var;
    }

    public final void setPhoneFormatterProvider(q5c q5cVar) {
        this.a = q5cVar;
    }

    public final void setText(CharSequence charSequence) {
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        EditText editText = this.i;
        editText.setText(charSequence, bufferType);
        try {
            editText.setSelection(charSequence.length());
        } catch (IndexOutOfBoundsException e) {
            gm0.V(r5c.class.getName(), e.toString(), e);
        }
    }
}
