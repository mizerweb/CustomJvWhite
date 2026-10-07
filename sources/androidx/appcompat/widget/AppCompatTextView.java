package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.as;
import defpackage.bdd;
import defpackage.bt;
import defpackage.cdd;
import defpackage.ct;
import defpackage.dqh;
import defpackage.dt;
import defpackage.et;
import defpackage.ex8;
import defpackage.f83;
import defpackage.h9i;
import defpackage.ixl;
import defpackage.jth;
import defpackage.kt;
import defpackage.ktk;
import defpackage.lg0;
import defpackage.ma;
import defpackage.ore;
import defpackage.ovl;
import defpackage.r9j;
import defpackage.v2a;
import defpackage.v4;
import defpackage.vs;
import defpackage.wk8;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements lg0 {
    public final ma a;
    public final bt b;
    public final v2a c;
    public as d;
    public boolean e;
    public ex8 f;
    public Future g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jth.a(context);
        this.e = false;
        this.f = null;
        dqh.a(this, getContext());
        ma maVar = new ma(this);
        this.a = maVar;
        maVar.t(attributeSet, i);
        bt btVar = new bt(this);
        this.b = btVar;
        btVar.f(attributeSet, i);
        btVar.b();
        v2a v2aVar = new v2a(8, false);
        v2aVar.b = this;
        this.c = v2aVar;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private as getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new as(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ma maVar = this.a;
        if (maVar != null) {
            maVar.i();
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (r9j.c) {
            return ((ex8) getSuperCaller()).x();
        }
        bt btVar = this.b;
        if (btVar != null) {
            return Math.round(btVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r9j.c) {
            return ((ex8) getSuperCaller()).y();
        }
        bt btVar = this.b;
        if (btVar != null) {
            return Math.round(btVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r9j.c) {
            return ((ex8) getSuperCaller()).z();
        }
        bt btVar = this.b;
        if (btVar != null) {
            return Math.round(btVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r9j.c) {
            return ((ex8) getSuperCaller()).C();
        }
        bt btVar = this.b;
        return btVar != null ? btVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (r9j.c) {
            return ((ex8) getSuperCaller()).D() == 1 ? 1 : 0;
        }
        bt btVar = this.b;
        if (btVar != null) {
            return btVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.a.e(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ct getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f = new et(this);
            } else if (i >= 28) {
                this.f = new dt(this);
            } else {
                this.f = new ex8(2, this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ma maVar = this.a;
        if (maVar != null) {
            return maVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ma maVar = this.a;
        if (maVar != null) {
            return maVar.q();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                androidx.core.widget.a.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        v2a v2aVar;
        if (Build.VERSION.SDK_INT >= 28 || (v2aVar = this.c) == null) {
            return ((ex8) getSuperCaller()).F();
        }
        TextClassifier textClassifier = (TextClassifier) v2aVar.c;
        return textClassifier == null ? vs.a((TextView) v2aVar.b) : textClassifier;
    }

    public bdd getTextMetricsParamsCompat() {
        return androidx.core.widget.a.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            ovl.c(editorInfo, getText());
        }
        ktk.c(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bt btVar = this.b;
        if (btVar == null || r9j.c) {
            return;
        }
        btVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                androidx.core.widget.a.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        bt btVar = this.b;
        if (btVar != null) {
            kt ktVar = btVar.i;
            if (r9j.c || !ktVar.f()) {
                return;
            }
            ktVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.lg0
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (r9j.c) {
            ((ex8) getSuperCaller()).H(i, i2, i3, i4);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (r9j.c) {
            ((ex8) getSuperCaller()).I(iArr, i);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView, defpackage.lg0
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (r9j.c) {
            ((ex8) getSuperCaller()).J(i);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.w();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.x(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? wk8.o(context, i) : null, i2 != 0 ? wk8.o(context, i2) : null, i3 != 0 ? wk8.o(context, i3) : null, i4 != 0 ? wk8.o(context, i4) : null);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? wk8.o(context, i) : null, i2 != 0 ? wk8.o(context, i2) : null, i3 != 0 ? wk8.o(context, i3) : null, i4 != 0 ? wk8.o(context, i4) : null);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            androidx.core.widget.a.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            androidx.core.widget.a.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().j(i, f);
        } else if (i2 >= 34) {
            v4.k(this, i, f);
        } else {
            androidx.core.widget.a.d(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(cdd cddVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        androidx.core.widget.a.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ma maVar = this.a;
        if (maVar != null) {
            maVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ma maVar = this.a;
        if (maVar != null) {
            maVar.E(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bt btVar = this.b;
        btVar.k(colorStateList);
        btVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bt btVar = this.b;
        btVar.l(mode);
        btVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        v2a v2aVar;
        if (Build.VERSION.SDK_INT >= 28 || (v2aVar = this.c) == null) {
            ((ex8) getSuperCaller()).R(textClassifier);
        } else {
            v2aVar.c = textClassifier;
        }
    }

    public void setTextFuture(Future<cdd> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(bdd bddVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicC = bddVar.c();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicC != textDirectionHeuristic2 && textDirectionHeuristicC != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicC == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicC == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicC == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicC == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicC == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicC == textDirectionHeuristic2) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(bddVar.d());
        ixl.f(this, bddVar.a());
        ixl.i(this, bddVar.b());
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = r9j.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            kt ktVar = btVar.i;
            if (z || ktVar.f()) {
                return;
            }
            ktVar.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            f83 f83Var = h9i.a;
            if (context == null) {
                ore.p("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        androidx.core.widget.a.d(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
