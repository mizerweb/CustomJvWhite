package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mwf extends LinearLayout implements eph {
    public final kwb a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final LinearLayout f;

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
    public mwf(Context context) {
        super(context, null);
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.oneme_settings_topbar_avatar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 96.0f), gm0.K(96.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        kwbVar.setLayoutParams(layoutParams);
        kwbVar.setAvatarShape(awb.a);
        this.a = kwbVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.oneme_settings_topbar_name);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), appCompatTextView.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), appCompatTextView.getPaddingBottom());
        appCompatTextView.setGravity(1);
        q9i.a(q9i.b, appCompatTextView);
        a8g a8gVar = pq3.j;
        appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().b);
        appCompatTextView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.oneme_settings_topbar_phone);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        noh nohVar = q9i.i;
        q9i.a(nohVar, appCompatTextView2);
        appCompatTextView2.setTextColor(a8gVar.h(appCompatTextView2).getText().h);
        this.c = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.oneme_settings_topbar_dotdivider);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        layoutParams3.setMarginEnd(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setText("·");
        appCompatTextView3.setGravity(1);
        q9i.a(nohVar, appCompatTextView3);
        appCompatTextView3.setTextColor(a8gVar.h(appCompatTextView3).getText().c);
        this.d = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setId(R.id.oneme_settings_topbar_nick);
        appCompatTextView4.setLayoutParams(new ow3(-2, -2));
        appCompatTextView4.setGravity(1);
        q9i.a(nohVar, appCompatTextView4);
        appCompatTextView4.setTextColor(a8gVar.h(appCompatTextView4).getText().h);
        appCompatTextView4.setEllipsize(truncateAt);
        appCompatTextView4.setMaxLines(1);
        this.e = appCompatTextView4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.oneme_settings_topbar_container);
        linearLayout.setLayoutParams(new ow3(-2, -2));
        linearLayout.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), linearLayout.getPaddingTop(), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        linearLayout.setOrientation(0);
        linearLayout.addView(appCompatTextView2);
        linearLayout.addView(appCompatTextView3);
        linearLayout.addView(appCompatTextView4);
        this.f = linearLayout;
        setId(R.id.oneme_settings_topbar);
        ow3 ow3Var = new ow3(-1, -2);
        setMinimumHeight(gm0.K(172.0f * yl5.d().getDisplayMetrics().density));
        ow3Var.a = 2;
        ow3Var.b = -0.3f;
        ((FrameLayout.LayoutParams) ow3Var).bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        setLayoutParams(ow3Var);
        setClipToPadding(false);
        setGravity(1);
        setOrientation(1);
        addView(kwbVar);
        addView(appCompatTextView);
        addView(linearLayout);
    }

    private final void setDivider(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    private final void setNickname(String str) {
        int i = str == null || str.length() == 0 ? 8 : 0;
        AppCompatTextView appCompatTextView = this.e;
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    private final void setPhoneNumber(String str) {
        int i = str == null || str.length() == 0 ? 8 : 0;
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setTextColor(kbcVar.getText().b);
        this.c.setTextColor(kbcVar.getText().h);
        this.e.setTextColor(kbcVar.getText().h);
        this.d.setTextColor(kbcVar.getText().c);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f.setAlpha(f);
        this.a.setAlpha(f);
    }

    public final void setAvatarClickedListener(af7 af7Var) {
        qe7.H(this.a, 300L, new d8(17, af7Var));
    }

    public final void setNicknameClickListener(af7 af7Var) {
        qe7.H(this.e, 300L, new d8(16, af7Var));
    }

    public final void setTopBarContent(ivf ivfVar) {
        kwb.v(this.a, ivfVar.b, Long.valueOf(ivfVar.a), ivfVar.d);
        this.b.setText(ivfVar.c);
        String str = ivfVar.e;
        setPhoneNumber(str);
        String str2 = ivfVar.f;
        setNickname(str2);
        setDivider((str.length() == 0 || str2.length() == 0) ? false : true);
    }

    public final void setUserPhoneClickListener(af7 af7Var) {
        qe7.H(this.c, 300L, new d8(15, af7Var));
    }
}
