package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class a0d extends wf4 implements eph {
    public static final /* synthetic */ int z = 0;
    public final ImageView s;
    public final TextView t;
    public final TextView u;
    public final gc4 v;
    public final TextView w;
    public final TextView x;
    public af7 y;

    public a0d(Context context) {
        super(context);
        this.y = new gvc(7);
        rcc rccVar = new rcc(context);
        rccVar.setId(R.id.oneme_settings_privacy_pin_code_toolbar);
        rccVar.setBackgroundColor(0);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new lh9(27, this)));
        rccVar.setLayoutParams(new uf4(-1, -2));
        addView(rccVar);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_settings_privacy_setup_pin_code_lock);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        a8g a8gVar = pq3.j;
        shapeDrawable.setTint(a8gVar.h(imageView).b().b);
        imageView.setBackground(shapeDrawable);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setImageResource(R.drawable.icon_privacy_unlock);
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().d));
        imageView.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density)));
        addView(imageView);
        this.s = imageView;
        TextView textViewE = qv1.e(context, R.id.oneme_settings_privacy_setup_pin_code_title);
        noh nohVar = q9i.f;
        textViewE.setTextColor(p.d(textViewE, nohVar, a8gVar, textViewE).b);
        textViewE.setSingleLine(true);
        textViewE.setLayoutParams(new uf4(-2, -2));
        addView(textViewE);
        this.t = textViewE;
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_settings_privacy_setup_pin_code_description);
        textView.setVisibility(8);
        textView.setTextColor(p.d(textView, q9i.g, a8gVar, textView).d);
        uf4 uf4Var = new uf4(-2, -2);
        textView.setGravity(1);
        textView.setLayoutParams(uf4Var);
        addView(textView);
        this.u = textView;
        gc4 gc4Var = new gc4(context);
        gc4Var.setId(R.id.oneme_settings_privacy_setup_pin_code_input);
        gc4Var.setKeyboardOpen(new gvc(8));
        gc4Var.setCountCells(4);
        gc4Var.setLayoutParams(new uf4(-2, -2));
        gc4Var.setSecure(true);
        gc4Var.setDisableInputsForError(false);
        bdc.a(gc4Var, new jb4(gc4Var, gc4Var, 1));
        gc4Var.setKeyboardOpen(new iua(24, gc4Var));
        addView(gc4Var);
        this.v = gc4Var;
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.oneme_settings_privacy_setup_pin_code_error);
        textView2.setVisibility(8);
        textView2.setTextAlignment(4);
        q9i.a(q9i.i, textView2);
        textView2.setSingleLine(true);
        textView2.setLayoutParams(new uf4(-2, -2));
        addView(textView2);
        this.w = textView2;
        TextView textView3 = new TextView(context);
        textView3.setId(R.id.oneme_settings_privacy_setup_pin_code_forgot);
        textView3.setVisibility(8);
        textView3.setText(R.string.oneme_settings_privacy_forgot_pin_code);
        q9i.a(nohVar, textView3);
        textView3.setTextAlignment(4);
        textView3.setLayoutParams(new uf4(-2, -2));
        addView(textView3);
        this.x = textView3;
        onThemeChanged(a8gVar.h(this));
        eg4 eg4VarH = ch3.h(this);
        int id = rccVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        eg4VarH.d(id2, 3, rccVar.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        int id3 = textViewE.getId();
        eg4VarH.d(id3, 3, imageView.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id4 = textView.getId();
        eg4VarH.d(id4, 3, textViewE.getId(), 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id5 = gc4Var.getId();
        eg4VarH.d(id5, 3, textViewE.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id5));
        eg4VarH.d(id5, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id5));
        eg4VarH.d(id5, 7, 0, 7);
        new bsb(7, eg4VarH, id5).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id6 = textView2.getId();
        eg4VarH.d(id6, 3, gc4Var.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id6));
        eg4VarH.d(id6, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id6));
        eg4VarH.d(id6, 7, 0, 7);
        new bsb(7, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id7 = textView3.getId();
        eg4VarH.d(id7, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id7));
        eg4VarH.d(id7, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id7));
        eg4VarH.d(id7, 4, 0, 4);
        new bsb(4, eg4VarH, id7).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
    }

    public final af7 getOnBackPress() {
        return this.y;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.b().c);
        ImageView imageView = this.s;
        imageView.getBackground().setTint(pq3.j.h(this).b().b);
        imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        this.t.setTextColor(kbcVar.getText().b);
        this.u.setTextColor(kbcVar.getText().d);
        this.v.onThemeChanged(kbcVar);
        this.w.setTextColor(kbcVar.getText().j);
        this.x.setTextColor(kbcVar.getText().h);
    }

    public final void setDescription(Integer num) {
        TextView textView = this.u;
        if (num != null) {
            textView.setText(num.intValue());
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        int id = textView.getVisibility() == 0 ? textView.getId() : this.t.getId();
        eg4 eg4VarH = ch3.h(this);
        new qf4(eg4VarH, this.v.getId()).p(id).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
    }

    public final void setErrorText(CharSequence charSequence) {
        TextView textView = this.w;
        textView.setText(charSequence);
        boolean z2 = charSequence == null || charSequence.length() == 0;
        boolean z3 = !z2;
        float f = !z2 ? 1.0f : 0.0f;
        textView.setAlpha(z2 ? 1.0f : 0.0f);
        textView.animate().setDuration(200L).alpha(f).withEndAction(new nb0(this, z3, 8)).start();
    }

    public final void setForgotPinCodeClickListener(af7 af7Var) {
        TextView textView = this.x;
        if (af7Var != null) {
            textView.setVisibility(0);
            qe7.H(textView, 300L, new d8(13, af7Var));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        }
    }

    public final void setListener(cc4 cc4Var) {
        this.v.setListener(cc4Var);
    }

    public final void setLocked(boolean z2) {
        this.s.setImageResource(z2 ? R.drawable.icon_privacy_fill : R.drawable.icon_privacy_unlock);
    }

    public final void setOnBackPress(af7 af7Var) {
        this.y = af7Var;
    }

    public final void setState(dc4 dc4Var) {
        this.v.setState(dc4Var);
    }

    public final void setTitle(int i) {
        this.t.setText(i);
    }
}
