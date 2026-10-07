package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b9i extends LinearLayout implements eph, cc4 {
    public final ShapeDrawable a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final jac f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public a9i j;

    public b9i(final Context context) {
        super(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.a = shapeDrawable;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 88.0f), gm0.K(88.0f * yl5.d().getDisplayMetrics().density)));
        int iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setBackground(shapeDrawable);
        this.b = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        q9i.a(q9i.c, textView);
        this.c = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        q9i.a(q9i.g, textView2);
        this.d = textView2;
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setLayoutParams(layoutParams3);
        this.e = frameLayout;
        jac jacVar = new jac(context);
        jacVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
        bdc.a(jacVar, new rda(19, jacVar, jacVar));
        final int i = 0;
        jacVar.k(new y8i(this, 0));
        this.f = jacVar;
        this.g = rx8.P(3, new af7() { // from class: z8i
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                b9i b9iVar = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        jac jacVar2 = new jac(context2);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams4.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        jacVar2.setLayoutParams(layoutParams4);
                        jacVar2.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
                        jacVar2.setTypingMode(hac.b);
                        jacVar2.k(new y8i(b9iVar, 1));
                        return jacVar2;
                    default:
                        gc4 gc4Var = new gc4(context2);
                        gc4Var.setListener(b9iVar);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams5.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        gc4Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
                        gc4Var.setLayoutParams(layoutParams5);
                        bdc.a(gc4Var, new jb4(gc4Var, gc4Var, 2));
                        gc4Var.setKeyboardOpen(new yvg(24));
                        b9iVar.setGravity(17);
                        return gc4Var;
                }
            }
        });
        final int i2 = 1;
        this.h = rx8.P(3, new af7() { // from class: z8i
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                b9i b9iVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        jac jacVar2 = new jac(context2);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams4.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        jacVar2.setLayoutParams(layoutParams4);
                        jacVar2.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
                        jacVar2.setTypingMode(hac.b);
                        jacVar2.k(new y8i(b9iVar, 1));
                        return jacVar2;
                    default:
                        gc4 gc4Var = new gc4(context2);
                        gc4Var.setListener(b9iVar);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams5.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        gc4Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
                        gc4Var.setLayoutParams(layoutParams5);
                        bdc.a(gc4Var, new jb4(gc4Var, gc4Var, 2));
                        gc4Var.setKeyboardOpen(new yvg(24));
                        b9iVar.setGravity(17);
                        return gc4Var;
                }
            }
        });
        this.i = rx8.P(3, new twf(context, 15));
        setOrientation(1);
        setGravity(1);
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(frameLayout);
        frameLayout.addView(jacVar);
        onThemeChanged(pq3.j.h(this));
    }

    public static void e(jac jacVar, v8i v8iVar) {
        boolean z = v8iVar.g;
        int i = v8iVar.f;
        if (z) {
            jacVar.setTypingMode(hac.b);
        } else {
            jacVar.setTypingMode(hac.a);
            jacVar.setEndIconDrawable(null);
        }
        if (v8iVar.d && i > 0) {
            jacVar.setMaxLengthForLabel(i);
        }
        ynh ynhVar = v8iVar.c;
        if (ynhVar != null) {
            jacVar.m(String.valueOf(ynhVar.d(jacVar)), gac.a);
        } else {
            ynh ynhVar2 = v8iVar.b;
            if (ynhVar2 != null) {
                jacVar.m(String.valueOf(ynhVar2.d(jacVar)), gac.c);
            } else {
                jacVar.j();
            }
        }
        jacVar.setHint(String.valueOf(v8iVar.a.d(jacVar)));
        if (i > 0) {
            jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    private final TextView getConfirmCodeErrorView() {
        return (TextView) this.i.getValue();
    }

    private final gc4 getConfirmCodeView() {
        return (gc4) this.h.getValue();
    }

    public final jac getSecondTextInputView() {
        return (jac) this.g.getValue();
    }

    @Override // defpackage.cc4
    public final void a(String str) {
        a9i a9iVar = this.j;
        if (a9iVar != null) {
            a9iVar.a(str);
        }
    }

    public final void c(ynh ynhVar) {
        if (ynhVar != null) {
            n7j.a(this, getConfirmCodeErrorView(), -1);
            getConfirmCodeErrorView().setText(ynhVar.d(this));
            getConfirmCodeErrorView().setVisibility(0);
        } else {
            ny8 ny8Var = this.i;
            if (ny8Var.d()) {
                ((TextView) ny8Var.getValue()).setVisibility(8);
            }
        }
    }

    public final void d(dc4 dc4Var) {
        if (n7j.o(this.h)) {
            getConfirmCodeView().setState(dc4Var);
        }
    }

    public final void f(x8i x8iVar) {
        this.b.setImageResource(x8iVar.getIcon());
        this.c.setText(x8iVar.getTitle().d(this));
        ynh ynhVarB = x8iVar.b();
        TextView textView = this.d;
        if (ynhVarB == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(ynhVarB.d(this));
        }
        boolean z = x8iVar instanceof u8i;
        jac jacVar = this.f;
        if (z) {
            u8i u8iVar = (u8i) x8iVar;
            e(jacVar, u8iVar.b);
            v8i v8iVar = u8iVar.c;
            n7j.a(this.e, getSecondTextInputView(), -1);
            bdc.a(jacVar, new rda(18, jacVar, this));
            e(getSecondTextInputView(), v8iVar);
        } else {
            boolean z2 = x8iVar instanceof t8i;
            ny8 ny8Var = this.g;
            if (z2) {
                e(jacVar, ((t8i) x8iVar).c);
                if (ny8Var.d()) {
                    ((jac) ny8Var.getValue()).setVisibility(8);
                }
            } else if (x8iVar instanceof r8i) {
                e(jacVar, ((r8i) x8iVar).c);
                if (ny8Var.d()) {
                    ((jac) ny8Var.getValue()).setVisibility(8);
                }
            } else if (x8iVar instanceof w8i) {
                jacVar.setVisibility(8);
                if (ny8Var.d()) {
                    ((jac) ny8Var.getValue()).setVisibility(8);
                }
                n7j.a(this, getConfirmCodeView(), -1);
                getConfirmCodeView().setCountCells(((w8i) x8iVar).c);
            } else {
                if (!(x8iVar instanceof s8i)) {
                    ore.o();
                    return;
                }
                e(jacVar, ((s8i) x8iVar).c);
            }
        }
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        if ((x8iVar instanceof w8i) || z) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = jacVar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != iK) {
            ViewGroup.LayoutParams layoutParams2 = jacVar.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = iK;
            jacVar.setLayoutParams(marginLayoutParams2);
        }
    }

    public final ylc getInputTexts() {
        boolean zO = n7j.o(this.g);
        jac jacVar = this.f;
        return zO ? new ylc(jacVar.getText(), getSecondTextInputView().getText()) : new ylc(jacVar.getText(), null);
    }

    public final a9i getListener() {
        return this.j;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setColorFilter(new PorterDuffColorFilter(kbcVar.b().e, PorterDuff.Mode.SRC_IN));
        this.b.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        this.c.setTextColor(kbcVar.getText().b);
        this.d.setTextColor(kbcVar.getText().d);
        a8g a8gVar = pq3.j;
        this.f.onThemeChanged(a8gVar.h(this));
        ny8 ny8Var = this.g;
        if (ny8Var.d()) {
            ((jac) ny8Var.getValue()).onThemeChanged(kbcVar);
        }
        ny8 ny8Var2 = this.h;
        if (ny8Var2.d()) {
            ((gc4) ny8Var2.getValue()).onThemeChanged(kbcVar);
        }
        ny8 ny8Var3 = this.i;
        if (ny8Var3.d()) {
            TextView textView = (TextView) ny8Var3.getValue();
            textView.setTextColor(a8gVar.h(textView).getText().j);
        }
    }

    public final void setListener(a9i a9iVar) {
        this.j = a9iVar;
    }
}
