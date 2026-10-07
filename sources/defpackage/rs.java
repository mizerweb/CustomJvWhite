package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rs extends w79 implements ts {
    public CharSequence C;
    public os D;
    public final Rect E;
    public int F;
    public final /* synthetic */ us G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(us usVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.G = usVar;
        this.E = new Rect();
        this.o = usVar;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new ps(0, this);
    }

    @Override // defpackage.ts
    public final CharSequence e() {
        return this.C;
    }

    @Override // defpackage.ts
    public final void f(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // defpackage.ts
    public final void h(int i) {
        this.F = i;
    }

    @Override // defpackage.ts
    public final void i(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        es esVar = this.z;
        boolean zIsShowing = esVar.isShowing();
        s();
        esVar.setInputMethodMode(2);
        m();
        kv5 kv5Var = this.c;
        kv5Var.setChoiceMode(1);
        kv5Var.setTextDirection(i);
        kv5Var.setTextAlignment(i2);
        us usVar = this.G;
        int selectedItemPosition = usVar.getSelectedItemPosition();
        kv5 kv5Var2 = this.c;
        if (esVar.isShowing() && kv5Var2 != null) {
            kv5Var2.setListSelectionHidden(false);
            kv5Var2.setSelection(selectedItemPosition);
            if (kv5Var2.getChoiceMode() != 0) {
                kv5Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = usVar.getViewTreeObserver()) == null) {
            return;
        }
        ls lsVar = new ls(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(lsVar);
        esVar.setOnDismissListener(new qs(this, lsVar));
    }

    @Override // defpackage.w79, defpackage.ts
    public final void k(ListAdapter listAdapter) {
        super.k(listAdapter);
        this.D = (os) listAdapter;
    }

    public final void s() {
        int i;
        es esVar = this.z;
        Drawable background = esVar.getBackground();
        us usVar = this.G;
        Rect rect = usVar.h;
        if (background != null) {
            background.getPadding(rect);
            boolean z = r9j.a;
            i = usVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = usVar.getPaddingLeft();
        int paddingRight = usVar.getPaddingRight();
        int width = usVar.getWidth();
        int i2 = usVar.g;
        if (i2 == -2) {
            int iA = usVar.a(this.D, esVar.getBackground());
            int i3 = (usVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = r9j.a;
        this.f = usVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.F) + i : paddingLeft + this.F + i;
    }
}
