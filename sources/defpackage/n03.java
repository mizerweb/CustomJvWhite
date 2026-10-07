package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n03 extends wf4 implements eph, oqe {
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final kwb w;
    public final AppCompatTextView x;
    public final cs y;
    public final ImageView z;

    public n03(final Context context) {
        super(context, null);
        this.s = rx8.P(3, new k82(11));
        this.t = rx8.P(3, new yk1(26, this));
        final int i = 0;
        this.u = rx8.P(3, new af7() { // from class: m03
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                int i3 = 8;
                n03 n03Var = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setId(R.id.profile_invite_chatlinkview_link_tv);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                        appCompatTextView.setTextAlignment(2);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setVisibility(8);
                        q9i.a(q9i.f, appCompatTextView);
                        appCompatTextView.setTextColor(pq3.j.h(appCompatTextView).getText().b);
                        yab.e(n03Var, appCompatTextView, -1);
                        return appCompatTextView;
                    default:
                        r6c r6cVar = new r6c(context2);
                        r6cVar.setId(R.id.oneme_button_progress_bar_id);
                        bdc.a(r6cVar, new pi(i3, r6cVar, r6cVar));
                        r6cVar.setSize(n6c.a);
                        r6cVar.setVisibility(0);
                        n03Var.addView(r6cVar);
                        return r6cVar;
                }
            }
        });
        final int i2 = 1;
        ny8 ny8VarP = rx8.P(3, new af7() { // from class: m03
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                int i4 = 8;
                n03 n03Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setId(R.id.profile_invite_chatlinkview_link_tv);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                        appCompatTextView.setTextAlignment(2);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setVisibility(8);
                        q9i.a(q9i.f, appCompatTextView);
                        appCompatTextView.setTextColor(pq3.j.h(appCompatTextView).getText().b);
                        yab.e(n03Var, appCompatTextView, -1);
                        return appCompatTextView;
                    default:
                        r6c r6cVar = new r6c(context2);
                        r6cVar.setId(R.id.oneme_button_progress_bar_id);
                        bdc.a(r6cVar, new pi(i4, r6cVar, r6cVar));
                        r6cVar.setSize(n6c.a);
                        r6cVar.setVisibility(0);
                        n03Var.addView(r6cVar);
                        return r6cVar;
                }
            }
        });
        this.v = ny8VarP;
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.profile_invite_chatlinkview_avatar_view);
        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        kwbVar.setAvatarShape(awb.a);
        addView(kwbVar);
        this.w = kwbVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.profile_invite_chatlinkview_title_tv);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        q9i.a(q9i.i, appCompatTextView);
        addView(appCompatTextView);
        this.x = appCompatTextView;
        cs csVar = new cs(context);
        csVar.setId(R.id.profile_invite_chatlinkview_copy_iv);
        csVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f)));
        a8g a8gVar = pq3.j;
        int i3 = a8gVar.h(csVar).getIcon().b;
        Drawable drawableMutate = csVar.getContext().getDrawable(R.drawable.icon_copy).mutate();
        sb8.m0(i3, drawableMutate);
        csVar.setImageDrawable(drawableMutate);
        addView(csVar);
        this.y = csVar;
        ImageView imageViewD = qv1.d(context, R.id.profile_invite_chatlinkview_more_actions_button);
        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_dots_vertical).mutate());
        addView(imageViewD);
        this.z = imageViewD;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        v();
        if (ny8VarP.d()) {
            r6c r6cVar = (r6c) ny8VarP.getValue();
            int iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
            ViewGroup.LayoutParams layoutParams = r6cVar.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                throw null;
            }
            layoutParams.width = iK;
            layoutParams.height = iK;
            r6cVar.setLayoutParams(layoutParams);
        }
        requestLayout();
        onThemeChanged(a8gVar.h(this));
        setBackground(getRippleDrawable());
    }

    private final ShapeDrawable getMaskDrawable() {
        return (ShapeDrawable) this.s.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.t.getValue();
    }

    public static RippleDrawable u(n03 n03Var) {
        return col.b(((bs0) pq3.j.h(n03Var).u().c.g).c, null, n03Var.getMaskDrawable());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        getRippleDrawable().setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
        ny8 ny8Var = this.u;
        if (ny8Var.d()) {
            ((AppCompatTextView) ny8Var.getValue()).setTextColor(kbcVar.getText().b);
        }
        this.x.setTextColor(kbcVar.getText().d);
        this.y.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        this.z.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
    }

    public final void setChatTitle(String str) {
        this.x.setText(str);
        v();
    }

    public final void setLink(String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.u.getValue();
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(0);
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            ((r6c) ny8Var.getValue()).setVisibility(8);
        }
        v();
    }

    public final void setLoading(boolean z) {
        ny8 ny8Var = this.v;
        ny8 ny8Var2 = this.u;
        if (z) {
            if (ny8Var2.d()) {
                ((AppCompatTextView) ny8Var2.getValue()).setVisibility(8);
            }
            ((r6c) ny8Var.getValue()).setVisibility(0);
        } else {
            if (ny8Var2.d()) {
                ((AppCompatTextView) ny8Var2.getValue()).setVisibility(0);
            }
            ((r6c) ny8Var.getValue()).setVisibility(8);
        }
        v();
    }

    public final void setOnMoreActionsClickListener(af7 af7Var) {
        qe7.H(this.z, 300L, new d8(2, af7Var));
    }

    @Override // defpackage.oqe
    public void setRippleMask(Shape shape) {
        getMaskDrawable().setShape(shape);
    }

    public final void v() {
        bsb bsbVar;
        float f;
        eg4 eg4VarH = ch3.h(this);
        kwb kwbVar = this.w;
        int id = kwbVar.getId();
        eg4VarH.d(id, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        ny8 ny8Var = this.u;
        boolean zD = ny8Var.d();
        cs csVar = this.y;
        if (zD) {
            int id2 = ((AppCompatTextView) ny8Var.getValue()).getId();
            eg4VarH.d(id2, 6, kwbVar.getId(), 7);
            new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            eg4VarH.d(id2, 3, kwbVar.getId(), 3);
            eg4VarH.d(id2, 7, csVar.getId(), 6);
            new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            ((AppCompatTextView) ny8Var.getValue()).getId();
        } else {
            ny8 ny8Var2 = this.v;
            int id3 = ((r6c) ny8Var2.getValue()).getId();
            eg4VarH.d(id3, 6, kwbVar.getId(), 7);
            qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
            eg4VarH.d(id3, 3, 0, 3);
            new bsb(3, eg4VarH, id3).a(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
            ((r6c) ny8Var2.getValue()).getId();
        }
        int id4 = this.x.getId();
        eg4VarH.d(id4, 6, kwbVar.getId(), 7);
        new bsb(6, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id4, 4, kwbVar.getId(), 4);
        eg4VarH.d(id4, 7, csVar.getId(), 6);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id5 = csVar.getId();
        ImageView imageView = this.z;
        if (imageView.getVisibility() == 0) {
            eg4VarH.d(id5, 7, imageView.getId(), 6);
            bsbVar = new bsb(7, eg4VarH, id5);
            f = yl5.d().getDisplayMetrics().density;
        } else {
            eg4VarH.d(id5, 7, 0, 7);
            bsbVar = new bsb(7, eg4VarH, id5);
            f = yl5.d().getDisplayMetrics().density;
        }
        qt4.w(12.0f, f, bsbVar);
        eg4VarH.d(id5, 3, 0, 3);
        eg4VarH.d(id5, 4, 0, 4);
        if (imageView.getVisibility() == 0) {
            int id6 = imageView.getId();
            eg4VarH.d(id6, 7, 0, 7);
            qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id6));
            eg4VarH.d(id6, 3, 0, 3);
            eg4VarH.d(id6, 4, 0, 4);
        }
        eg4VarH.a(this);
    }
}
