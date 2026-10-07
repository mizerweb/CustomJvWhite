package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c69 extends wf4 implements eph {
    public final AppCompatTextView s;
    public final AppCompatTextView t;
    public final cs u;
    public final cs v;

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
    public c69(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.profile_channel_link_view_hint);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setText(context.getText(R.string.oneme_profile_section_chat_link));
        a8g a8gVar = pq3.j;
        appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().d);
        q9i.a(q9i.i, appCompatTextView);
        this.s = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.profile_channel_link_view_link);
        appCompatTextView2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView2.setTextAlignment(2);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(a8gVar.h(appCompatTextView2).getText().h);
        q9i.a(q9i.e, appCompatTextView2);
        this.t = appCompatTextView2;
        cs csVar = new cs(context);
        csVar.setId(R.id.profile_channel_link_view_share_icon);
        csVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f)));
        csVar.setImageResource(R.drawable.icon_share_android);
        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getText().h));
        this.u = csVar;
        cs csVar2 = new cs(context);
        csVar2.setId(R.id.profile_channel_link_view_share_qr_code);
        csVar2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        csVar2.setImageResource(R.drawable.icon_qr_code);
        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getText().h));
        this.v = csVar2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(csVar);
        addView(csVar2);
        eg4 eg4VarH = ch3.h(this);
        int id = appCompatTextView.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, appCompatTextView2.getId(), 3);
        new bsb(4, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 1.0f));
        eg4VarH.d(id, 7, csVar.getId(), 6);
        new bsb(7, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id2 = appCompatTextView2.getId();
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 3, appCompatTextView.getId(), 4);
        qt4.w(1.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 7, csVar.getId(), 6);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id3 = csVar.getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 7, csVar2.getId(), 6);
        new bsb(7, eg4VarH, id3).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        int id4 = csVar2.getId();
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.a(this);
        onThemeChanged(a8gVar.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a8g a8gVar = pq3.j;
        this.s.setTextColor(a8gVar.h(this).getText().d);
        this.t.setTextColor(a8gVar.h(this).getText().h);
        this.u.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().h));
    }

    public final void setLink(CharSequence charSequence) {
        this.t.setText(charSequence);
    }

    public final void setOnShareLinkClickListener(cf7 cf7Var) {
        qe7.H(this.u, 300L, new z36(this, 15, cf7Var));
    }

    public final void setOnShareQrCodeClickListener(af7 af7Var) {
        qe7.H(this.v, 300L, new d8(7, af7Var));
    }
}
