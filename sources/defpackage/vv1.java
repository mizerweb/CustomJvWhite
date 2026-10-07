package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vv1 extends wf4 implements eph {
    public static final /* synthetic */ int z = 0;
    public final TextView s;
    public final r6c t;
    public final ShapeDrawable u;
    public final ny8 v;
    public final ny8 w;
    public final ImageView x;
    public af7 y;

    public vv1(Context context) {
        super(context);
        TextView textViewE = qv1.e(context, R.id.call_share_picker_quote_view_title);
        q9i.a(q9i.g, textViewE);
        a8g a8gVar = pq3.j;
        textViewE.setTextColor(a8gVar.h(textViewE).getText().b);
        final int i = 0;
        np4.C(textViewE, false);
        textViewE.setFocusable(0);
        textViewE.setVisibility(8);
        textViewE.setLayoutParams(new uf4(0, -2));
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        textViewE.setPadding(iK, iK, iK, iK);
        this.s = textViewE;
        r6c r6cVar = new r6c(context);
        r6cVar.setId(R.id.call_share_picker_quote_view_progress);
        r6cVar.setLayoutParams(new uf4(-2, -2));
        r6cVar.setAppearance(g6c.a);
        r6cVar.setSize(n6c.a);
        r6cVar.setVisibility(8);
        this.t = r6cVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(a8gVar.e(context).m().h().a);
        this.u = shapeDrawable;
        this.v = rx8.P(3, new af7(this) { // from class: uv1
            public final /* synthetic */ vv1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                vv1 vv1Var = this.b;
                switch (i2) {
                    case 0:
                        return vv1Var.getContext().getDrawable(R.drawable.icon_arrow_up).mutate();
                    default:
                        return vv1.u(vv1Var);
                }
            }
        });
        final int i2 = 1;
        this.w = rx8.P(3, new af7(this) { // from class: uv1
            public final /* synthetic */ vv1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                vv1 vv1Var = this.b;
                switch (i3) {
                    case 0:
                        return vv1Var.getContext().getDrawable(R.drawable.icon_arrow_up).mutate();
                    default:
                        return vv1.u(vv1Var);
                }
            }
        });
        ImageView imageViewD = qv1.d(context, R.id.oneme_message_input_right_outer_icon);
        imageViewD.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density)));
        imageViewD.setImageDrawable(getSendIcon());
        qe7.H(imageViewD, 300L, new t8(7, this));
        this.x = imageViewD;
        this.y = new br1(13);
        addView(textViewE);
        addView(imageViewD);
        addView(r6cVar);
        onThemeChanged(a8gVar.h(this));
        eg4 eg4VarH = ch3.h(this);
        int id = textViewE.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 7, imageViewD.getId(), 6);
        int id2 = imageViewD.getId();
        eg4VarH.d(id2, 4, 0, 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id3 = r6cVar.getId();
        eg4VarH.d(id3, 3, 0, 3);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 4, 0, 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.a(this);
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.v.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.w.getValue();
    }

    public static LayerDrawable u(vv1 vv1Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{vv1Var.u, vv1Var.getArrowDrawable()});
        layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public final af7 getOnConfirmClickListener$calls_share() {
        return this.y;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.s.setTextColor(kbcVar.getText().c);
        this.t.onThemeChanged(kbcVar);
        sb8.m0(-1, getArrowDrawable());
    }

    public final void setBody(CharSequence charSequence) {
        int i = !(charSequence == null || r5h.X0(charSequence)) ? 0 : 8;
        TextView textView = this.s;
        textView.setVisibility(i);
        textView.setText(charSequence);
        this.x.setVisibility(0);
    }

    public final void setLoading(boolean z2) {
        this.t.setVisibility(z2 ? 0 : 8);
        this.s.setVisibility(!z2 ? 0 : 8);
        this.x.setVisibility(z2 ? 8 : 0);
    }

    public final void setOnConfirmClickListener$calls_share(af7 af7Var) {
        this.y = af7Var;
    }
}
