package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class un9 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ vn9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un9(vn9 vn9Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = vn9Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        vn9 vn9Var = this.c;
        ColorStateList colorStateList2 = vn9Var.k;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (vn9Var.j != 0 && vn9Var.k != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{mx3.c(vn9Var.k.getColorForState(iArr3, 0), vn9Var.j), mx3.c(vn9Var.k.getColorForState(iArr2, 0), vn9Var.j), vn9Var.j});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            vn9 vn9Var = this.c;
            Drawable rippleDrawable = null;
            if (vn9Var.getText().toString().contentEquals(textView.getText()) && vn9Var.j != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(vn9Var.j);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = i7j.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
