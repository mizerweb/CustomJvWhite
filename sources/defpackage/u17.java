package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class u17 extends s7g {
    public static final ShapeDrawable x;
    public final ImageView u;
    public final TextView v;
    public s17 w;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = yl5.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        x = shapeDrawable;
    }

    public u17(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        q9i.a(q9i.f, textView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 8388627);
        layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 18.0f);
        layoutParams2.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 18.0f);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        frameLayout.addView(imageView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 8388627);
        layoutParams3.leftMargin = zo5.b(24.0f, yl5.d().getDisplayMetrics().density, c0a.d(18.0f, yl5.d().getDisplayMetrics().density, 2));
        layoutParams3.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.addView(textView, layoutParams3);
        super(frameLayout);
        this.u = (ImageView) frameLayout.getChildAt(0);
        this.v = (TextView) frameLayout.getChildAt(1);
        n1g.N(new d3(this, null, 15), frameLayout);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof s17) {
            s17 s17Var = (s17) k79Var;
            this.w = s17Var;
            H(pq3.j.h(this.a));
            this.u.setImageResource(s17Var.a);
            this.v.setText(s17Var.b.a(this));
        }
    }

    @Override // defpackage.s7g
    public final void G() {
        this.a.setOnClickListener(null);
    }

    public final void H(kbc kbcVar) {
        s17 s17Var = this.w;
        int i = s17Var != null ? s17Var.c : 0;
        int i2 = i == 0 ? -1 : t17.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 != -1) {
            TextView textView = this.v;
            ImageView imageView = this.u;
            if (i2 == 1) {
                imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().h));
                textView.setTextColor(kbcVar.getText().h);
            } else if (i2 != 2) {
                ore.o();
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().j));
                textView.setTextColor(kbcVar.getText().j);
            }
        }
    }
}
