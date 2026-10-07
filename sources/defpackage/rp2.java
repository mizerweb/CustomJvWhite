package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rp2 extends LinearLayout implements eph {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final cyb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
    public rp2(ChangeDisabledDialog changeDisabledDialog, Context context) {
        a8g a8gVar;
        super(context);
        int i = 0;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        q9i.a(q9i.d, textView);
        textView.setGravity(1);
        textView.setText(R.string.oneme_settings_privacy_change_disabled_title);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        q9i.a(q9i.g, textView2);
        int i2 = ChangeDisabledDialog.v;
        SpannableString spannableStringValueOf = SpannableString.valueOf(changeDisabledDialog.getContext().getText(R.string.oneme_settings_privacy_change_disabled_description));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class);
        String str = (String) ((g5d) ((gjf) changeDisabledDialog.u.getAccessor().d(97).getValue())).a.O.a(e5d.S6[33]).i();
        int length = uRLSpanArr.length;
        while (true) {
            a8gVar = pq3.j;
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            int i3 = length;
            int spanStart = spannableStringValueOf.getSpanStart(uRLSpan);
            int spanEnd = spannableStringValueOf.getSpanEnd(uRLSpan);
            if (spanStart >= 0 && spanStart < spanEnd) {
                spannableStringValueOf.removeSpan(uRLSpan);
                tre.n0(spannableStringValueOf, str, spanStart, spanEnd, a8gVar.h(textView2).getText().h, new ot4(24, changeDisabledDialog), 16);
                break;
            } else {
                i++;
                length = i3;
            }
        }
        textView2.setText(spannableStringValueOf);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        addView(textView2);
        this.c = textView2;
        cyb cybVar = new cyb(getContext());
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(changeDisabledDialog.getContext(), R.string.its_clear));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams3);
        qe7.H(cybVar, 300L, new t8(13, changeDisabledDialog));
        addView(cybVar);
        this.d = cybVar;
        onThemeChanged(a8gVar.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = this.a;
        cyb cybVar = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        switch (i) {
            case 0:
                textView2.setTextColor(kbcVar.getText().b);
                textView.setTextColor(kbcVar.getText().d);
                cybVar.e();
                break;
            default:
                textView2.setTextColor(kbcVar.getText().b);
                textView.setTextColor(kbcVar.getText().d);
                cybVar.e();
                break;
        }
    }

    public rp2(ForgotPinCodeDialog forgotPinCodeDialog, Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        q9i.a(q9i.d, textView);
        textView.setGravity(1);
        textView.setText(R.string.oneme_settings_privacy_forgot_pin_code);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        q9i.a(q9i.g, textView2);
        textView2.setText(R.string.oneme_settings_privacy_forgot_pin_code_write_support);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        addView(textView2);
        this.c = textView2;
        cyb cybVar = new cyb(getContext());
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.write_to_support));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams3);
        qe7.H(cybVar, 300L, new o37(3, forgotPinCodeDialog));
        addView(cybVar);
        this.d = cybVar;
        onThemeChanged(pq3.j.h(this));
    }
}
