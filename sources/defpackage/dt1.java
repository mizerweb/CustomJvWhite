package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dt1 extends s7g {
    public static final /* synthetic */ int w = 0;
    public final ft0 u;
    public final yvb v;

    public dt1(Context context, ft0 ft0Var) {
        izb izbVar = new izb(context, false);
        super(izbVar);
        this.u = ft0Var;
        this.v = new yvb(o1m.b(context, Integer.valueOf(gm0.K(20.0f * yl5.d().getDisplayMetrics().density))));
        izbVar.setCustomTheme(pq3.j.k(context).b);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        ys1 ys1Var = (ys1) k79Var;
        View view = this.a;
        izb izbVar = (izb) view;
        izbVar.setId(Long.hashCode(ys1Var.l));
        CharSequence charSequence = ys1Var.b;
        izbVar.setTitle(charSequence.toString());
        izbVar.setVerified(ys1Var.k);
        fu1 fu1Var = ys1Var.a;
        izbVar.j(fu1Var.a, charSequence, ys1Var.c);
        ((izb) view).setAvatarOverlay(ys1Var.i ? this.v : null);
        izbVar.setSubtitle(ys1Var.j);
        a8g a8gVar = pq3.j;
        int i = ((fn8) a8gVar.l(izbVar).b.u().c.a).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(a8gVar.l(izbVar).b.b().c);
        izbVar.setBackground(col.c(i, shapeDrawable, null, 4));
        boolean z = ys1Var.e;
        boolean z2 = ys1Var.g;
        H(fu1Var, z, z2);
        ((izb) view).setIconInfo(z2 ? Integer.valueOf(R.drawable.icon_hand_fill) : null);
        if (ys1Var.d) {
            view.setOnClickListener(null);
        } else {
            qe7.H(view, 300L, new ee(this, 8, fu1Var));
        }
        izbVar.setCustomTheme(a8gVar.l(izbVar).b);
    }

    public final void H(fu1 fu1Var, boolean z, boolean z2) {
        View view = this.a;
        if (z) {
            ((izb) view).n(Integer.valueOf(R.drawable.icon_dots_vertical), zxb.GHOST, Integer.valueOf(R.attr.icon_primary_inverse_static), new z2(this, 19, fu1Var));
        } else {
            ((izb) view).n(null, (6 & 2) != 0 ? zxb.SECONDARY : zxb.GHOST, null, new br1(5));
        }
        ((izb) view).setIconInfo(z2 ? Integer.valueOf(R.drawable.icon_hand_fill) : null);
    }
}
