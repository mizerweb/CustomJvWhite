package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class us extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final ma a;
    public final Context b;
    public final ks c;
    public SpinnerAdapter d;
    public final boolean e;
    public final ts f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public us(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, ru.oneme.app.R.attr.spinnerStyle);
        this.h = new Rect();
        dqh.a(this, getContext());
        int[] iArr = l3e.u;
        vbf vbfVarK = vbf.k(context, attributeSet, iArr, ru.oneme.app.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        this.a = new ma(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new hq4(context, resourceId);
        } else {
            this.b = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, ru.oneme.app.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = typedArrayObtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    ns nsVar = new ns(this);
                    this.f = nsVar;
                    nsVar.c = typedArray.getString(2);
                } else if (i2 == 1) {
                    rs rsVar = new rs(this, this.b, attributeSet);
                    vbf vbfVarK2 = vbf.k(this.b, attributeSet, iArr, ru.oneme.app.R.attr.spinnerStyle);
                    this.g = ((TypedArray) vbfVarK2.b).getLayoutDimension(3, -2);
                    rsVar.o(vbfVarK2.d(1));
                    rsVar.C = typedArray.getString(2);
                    vbfVarK2.l();
                    this.f = rsVar;
                    this.c = new ks(this, this, rsVar);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(ru.oneme.app.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                vbfVarK.l();
                this.e = true;
                spinnerAdapter = this.d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.d = null;
                }
                this.a.t(attributeSet, ru.oneme.app.R.attr.spinnerStyle);
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            ns nsVar2 = new ns(this);
            this.f = nsVar2;
            nsVar2.c = typedArray.getString(2);
        } else if (i2 == 1) {
            rs rsVar2 = new rs(this, this.b, attributeSet);
            vbf vbfVarK3 = vbf.k(this.b, attributeSet, iArr, ru.oneme.app.R.attr.spinnerStyle);
            this.g = ((TypedArray) vbfVarK3.b).getLayoutDimension(3, -2);
            rsVar2.o(vbfVarK3.d(1));
            rsVar2.C = typedArray.getString(2);
            vbfVarK3.l();
            this.f = rsVar2;
            this.c = new ks(this, this, rsVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(ru.oneme.app.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        vbfVarK.l();
        this.e = true;
        spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.t(attributeSet, ru.oneme.app.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ma maVar = this.a;
        if (maVar != null) {
            maVar.i();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ts tsVar = this.f;
        return tsVar != null ? tsVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ts tsVar = this.f;
        return tsVar != null ? tsVar.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final ts getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ts tsVar = this.f;
        return tsVar != null ? tsVar.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ts tsVar = this.f;
        return tsVar != null ? tsVar.e() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ts tsVar = this.f;
        if (tsVar == null || !tsVar.a()) {
            return;
        }
        tsVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        ss ssVar = (ss) parcelable;
        super.onRestoreInstanceState(ssVar.getSuperState());
        if (!ssVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ls(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ss ssVar = new ss(super.onSaveInstanceState());
        ts tsVar = this.f;
        ssVar.a = tsVar != null && tsVar.a();
        return ssVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ks ksVar = this.c;
        if (ksVar == null || !ksVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ts tsVar = this.f;
        if (tsVar == null) {
            return super.performClick();
        }
        if (tsVar.a()) {
            return true;
        }
        tsVar.i(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ts tsVar = this.f;
        if (tsVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            os osVar = new os();
            osVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                osVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ms.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            tsVar.k(osVar);
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
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.x(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        ts tsVar = this.f;
        if (tsVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            tsVar.h(i2);
            tsVar.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        ts tsVar = this.f;
        if (tsVar != null) {
            tsVar.g(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        ts tsVar = this.f;
        if (tsVar != null) {
            tsVar.o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(wk8.o(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        ts tsVar = this.f;
        if (tsVar != null) {
            tsVar.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
