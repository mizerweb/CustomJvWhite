package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n99 extends wf4 implements eph {
    public final nqe s;
    public final p99 t;
    public final ImageView u;
    public final TextView v;
    public final cyb w;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public n99(Context context) {
        super(context);
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        int iI0 = tre.I0(-2678426, 0.2f);
        a8gVar.h(this);
        nqe nqeVar = new nqe(iI0, tre.I0(-2678426, 0.5f));
        this.s = nqeVar;
        p99 p99Var = new p99(context);
        this.t = p99Var;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.pinbars_live_stream_bar_icon);
        imageView.setImageDrawable(p99Var);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        GradientDrawable gradientDrawable = new GradientDrawable();
        a8gVar.h(imageView);
        gradientDrawable.setColor(-2678426);
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 14.0f);
        imageView.setBackground(gradientDrawable);
        this.u = imageView;
        TextView textViewE = qv1.e(context, R.id.pinbars_live_stream_bar_title);
        textViewE.setText(context.getString(R.string.pinbars_live_stream_bar_title));
        q9i.a(q9i.j, textViewE);
        this.v = textViewE;
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.pinbars_live_stream_bar_button);
        cybVar.setSize(ayb.j);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.pinbars_live_stream_bar_button_text));
        this.w = cybVar;
        setLayoutParams(new uf4(-1, -2));
        addView(imageView, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        addView(cybVar, 0, -2);
        addView(textViewE, 0, -2);
        setBackground(nqeVar);
        onThemeChanged(a8gVar.h(this));
        eg4 eg4VarH = ch3.h(this);
        int id = imageView.getId();
        eg4VarH.d(id, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.g(id).d.l0 = true;
        int id2 = textViewE.getId();
        eg4VarH.d(id2, 6, imageView.getId(), 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id2));
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 7, cybVar.getId(), 6);
        new bsb(7, eg4VarH, id2).a(gm0.K(9.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id2).d.l0 = true;
        eg4VarH.g(id2).d.W = 2;
        int id3 = cybVar.getId();
        eg4VarH.d(id3, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 3, 0, 3);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 4, 0, 4);
        new bsb(4, eg4VarH, id3).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id3).d.l0 = true;
        eg4VarH.a(this);
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.start();
        ww8 ww8Var = new ww8(5, this);
        p99 p99Var = this.t;
        p99Var.d = ww8Var;
        p99Var.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.s.stop();
        p99 p99Var = this.t;
        p99Var.stop();
        p99Var.d = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.wf4, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView = this.u;
        long jA = qx6.a((imageView.getMeasuredWidth() / 2.0f) + imageView.getLeft(), (imageView.getMeasuredHeight() / 2.0f) + imageView.getTop());
        nqe nqeVar = this.s;
        nqeVar.f = jA;
        nqeVar.a();
        nqeVar.invalidateSelf();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.v.setTextColor(kbcVar.getText().b);
        this.w.e();
        this.t.onThemeChanged(kbcVar);
    }

    public final void setAction(af7 af7Var) {
        qe7.H(this.w, 300L, new d8(8, af7Var));
    }
}
