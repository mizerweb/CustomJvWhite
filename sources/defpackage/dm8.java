package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dm8 extends wf4 implements eph {
    public final /* synthetic */ int s = 1;
    public final Object t;

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
    public dm8(VpnPanelWidget vpnPanelWidget, Context context) {
        super(context, null);
        cs csVar = new cs(getContext());
        csVar.setLayoutParams(new uf4(-2, -2));
        csVar.setId(R.id.call_screen_vpn_connection_icon);
        csVar.setImageDrawable(csVar.getContext().getDrawable(R.drawable.ic_connection_fill_28).mutate());
        csVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFD60A")));
        cyb cybVar = new cyb(getContext());
        cybVar.setLayoutParams(new uf4(-2, -2));
        cybVar.setId(R.id.call_screen_vpn_dismiss_button_id);
        cybVar.setSize(ayb.i);
        cybVar.setAppearance(zxb.GHOST);
        cybVar.setTextColor(Integer.valueOf(R.attr.text_primary_inverse));
        cybVar.setText(cybVar.getContext().getString(R.string.call_screen_snackbar_button_text));
        cybVar.setOnClickListener(new aah(12, vpnPanelWidget));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setLayoutParams(new uf4(-2, -2));
        appCompatTextView.setId(R.id.call_screen_vpn_title_id);
        q9i.a(q9i.e, appCompatTextView);
        a8g a8gVar = pq3.j;
        a8gVar.h(appCompatTextView);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(appCompatTextView.getContext().getString(R.string.call_screen_snackbar_title));
        appCompatTextView.setMaxLines(2);
        this.t = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
        appCompatTextView2.setId(R.id.call_screen_vpn_caption_id);
        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
        q9i.a(q9i.i, appCompatTextView2);
        a8gVar.h(appCompatTextView2);
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(R.string.call_screen_snackbar_caption));
        appCompatTextView2.setMaxLines(2);
        setId(R.id.call_screen_vpn_container_id);
        setLayoutParams(new uf4(-1, -2));
        setMinimumHeight(gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        setPadding(iK, iK, iK, iK);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(a8gVar.h(this).k().f);
        addView(csVar);
        addView(cybVar);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        eg4 eg4VarH = ch3.h(this);
        int id = appCompatTextView.getId();
        eg4VarH.d(id, 6, csVar.getId(), 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 7, cybVar.getId(), 6);
        new bsb(7, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id, 4, appCompatTextView2.getId(), 3);
        eg4VarH.g(id).d.w = 0.0f;
        int id2 = csVar.getId();
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        int id3 = appCompatTextView2.getId();
        eg4VarH.d(id3, 6, csVar.getId(), 7);
        new bsb(6, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id3, 7, cybVar.getId(), 6);
        new bsb(7, eg4VarH, id3).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id3, 3, appCompatTextView.getId(), 4);
        new bsb(3, eg4VarH, id3).a(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id3).d.w = 0.0f;
        int id4 = cybVar.getId();
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.a(this);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = this.s;
        Object obj = this.t;
        switch (i) {
            case 0:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj;
                j8e j8eVar = inviteByPhoneScreen.f;
                zv8[] zv8VarArr = InviteByPhoneScreen.p;
                ((TextView) j8eVar.m(inviteByPhoneScreen, zv8VarArr[0])).setTextColor(kbcVar.getText().b);
                ((TextView) inviteByPhoneScreen.g.m(inviteByPhoneScreen, zv8VarArr[1])).setTextColor(kbcVar.getText().d);
                AppCompatTextView appCompatTextView = inviteByPhoneScreen.k;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextColor(kbcVar.getText().j);
                }
                inviteByPhoneScreen.q1().onThemeChanged(kbcVar);
                inviteByPhoneScreen.p1().e();
                ((rcc) inviteByPhoneScreen.j.m(inviteByPhoneScreen, zv8VarArr[4])).onThemeChanged(kbcVar);
                break;
            default:
                setBackgroundColor(kbcVar.k().f);
                ((AppCompatTextView) obj).setTextColor(-1);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm8(InviteByPhoneScreen inviteByPhoneScreen, Context context) {
        super(context);
        this.t = inviteByPhoneScreen;
    }
}
