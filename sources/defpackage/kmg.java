package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class kmg extends s7g implements xaf, sn8 {
    public static final ShapeDrawable z;
    public final t6g u;
    public final TextView v;
    public final TextView w;
    public final View x;
    public vaf y;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = yl5.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        z = shapeDrawable;
    }

    public kmg(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        int iK = gm0.K(14.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(iK2, iK, iK2, iK);
        t6g t6gVar = new t6g(frameLayout.getContext());
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 40.0f);
        t6gVar.setId(R.id.oneme_stickers_settings_set_item_icon);
        t6gVar.setLayoutParams(new FrameLayout.LayoutParams(iK3, iK3, 8388627));
        ((wj7) t6gVar.getHierarchy()).h(i1f.m);
        frameLayout.addView(t6gVar);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 16);
        layoutParams2.leftMargin = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.rightMargin = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.oneme_stickers_settings_set_item_title);
        q9i.a(q9i.h, textView);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.oneme_stickers_settings_set_item_subtitle);
        q9i.a(q9i.i, textView2);
        linearLayout.addView(textView2);
        n1g.N(new o77(textView, textView2, null, 2), linearLayout);
        frameLayout.addView(linearLayout);
        cs csVar = new cs(frameLayout.getContext());
        int iK4 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        csVar.setId(R.id.oneme_stickers_settings_set_item_drag);
        csVar.setLayoutParams(new FrameLayout.LayoutParams(iK4, iK4, 8388629));
        csVar.setImageResource(R.drawable.icon_reorder);
        int i = 3;
        n1g.N(new nff(i, (lq4) null, i), csVar);
        frameLayout.addView(csVar);
        n1g.N(new qb3(3, null, 14), frameLayout);
        super(frameLayout);
        this.u = (t6g) frameLayout.findViewById(R.id.oneme_stickers_settings_set_item_icon);
        this.v = (TextView) frameLayout.findViewById(R.id.oneme_stickers_settings_set_item_title);
        this.w = (TextView) frameLayout.findViewById(R.id.oneme_stickers_settings_set_item_subtitle);
        this.x = frameLayout.findViewById(R.id.oneme_stickers_settings_set_item_drag);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof taf) {
            this.y = (vaf) k79Var;
            taf tafVar = (taf) k79Var;
            this.u.setImageURI(tafVar.b);
            this.v.setText(tafVar.c);
            this.w.setText(tafVar.d);
        }
    }

    @Override // defpackage.sn8
    public final void d() {
        this.a.animate().translationZ(0.0f);
    }

    @Override // defpackage.sn8
    public final void e() {
        this.a.animate().translationZ(yl5.d().getDisplayMetrics().density * 20.0f);
    }

    @Override // defpackage.xaf
    public final void i(mog mogVar) {
        View view = this.a;
        if (mogVar != null) {
            qe7.H(view, 300L, new jvf(this, 7, mogVar));
        } else {
            view.setOnClickListener(null);
        }
    }
}
