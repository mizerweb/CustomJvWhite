package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zn2 extends s7g {
    public final af7 u;
    public kbc v;
    public final FrameLayout w;
    public final TextView x;
    public final ifh y;

    public zn2(Context context, af7 af7Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(gm0.K(30.0f * yl5.d().getDisplayMetrics().density));
        super(frameLayout);
        this.u = af7Var;
        this.w = frameLayout;
        TextView textViewE = qv1.e(context, R.id.oneme_media_keyboard_stickers_header_title);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        textViewE.setLayoutParams(layoutParams);
        q9i.a(q9i.i, textViewE);
        n1g.N(new ud9(this, (lq4) null, 7), textViewE);
        this.x = textViewE;
        this.y = new ifh(new za2(context, 4, this));
        frameLayout.addView(textViewE);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof do2) {
            do2 do2Var = (do2) k79Var;
            ynh name = do2Var.getName();
            TextView textView = this.x;
            textView.setText(name.b(textView.getContext()));
            boolean zY = do2Var.y();
            ifh ifhVar = this.y;
            if (zY) {
                yab.e(this.w, (View) ifhVar.getValue(), -1);
                ((View) ifhVar.getValue()).setVisibility(0);
                qe7.H((View) ifhVar.getValue(), 300L, new t8(12, this));
                return;
            }
            if (ifhVar.d()) {
                ImageView imageView = (ImageView) ifhVar.getValue();
                imageView.setVisibility(8);
                imageView.setOnClickListener(null);
            }
        }
    }
}
