package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.devmenu.DevMenuInfoScreen;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.stickerspreview.StickerPreviewScreen;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cw0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

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
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        rt2 rt2Var;
        rt2 rt2Var2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((dw0) obj).performLongClick();
            case 1:
                ldf ldfVar = CallLinkInfoScreen.t;
                vq1 vq1VarT1 = ((CallLinkInfoScreen) obj).t1();
                CharSequence charSequence = ((lq1) vq1VarT1.k.a.getValue()).b;
                if (charSequence != null) {
                    a8j.x(vq1VarT1.m, new vn1(charSequence));
                }
                return true;
            case 2:
                TextView textView = (TextView) obj;
                CharSequence text = textView.getText();
                it3.a(textView.getContext(), text != null ? text.toString() : null);
                return true;
            case 3:
                ph4 ph4Var = (ph4) obj;
                xva xvaVar = ph4Var.B;
                if (xvaVar != null) {
                    CallHistoryPageScreen.o1((CallHistoryPageScreen) xvaVar.b, ph4Var.D);
                }
                return ph4Var.B != null;
            case 4:
                rj5 rj5Var = (rj5) ((am0) obj).v;
                rj5Var.getClass();
                DevMenuInfoScreen devMenuInfoScreen = (DevMenuInfoScreen) rj5Var.b;
                try {
                    xde xdeVar = new xde(devMenuInfoScreen.getContext());
                    ((Intent) xdeVar.c).setType(HTTP.PLAIN_TEXT_TYPE);
                    xdeVar.Q(ww3.z1(devMenuInfoScreen.o1(), "\n\n", null, null, new w83(24), 30));
                    xdeVar.R();
                    break;
                } catch (Exception e) {
                    gm0.l(rj5.class.getName(), "Не удалось отправить текст через intent", e);
                }
                return true;
            case 5:
                return ((q8d) obj).performLongClick();
            case 6:
                ((dud) obj).f.v1().L(true);
                return true;
            case 7:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                jce jceVarI1 = ((RecordControlsWidget) obj).I1();
                if (!jceVarI1.g.h() || (rt2Var = (rt2) jceVarI1.f.getValue()) == null || !sol.a(rt2Var, (wo6) jceVarI1.p.getValue())) {
                    return false;
                }
                a8j.x(jceVarI1.v, new vbe(sol.c(rt2Var)));
                return true;
            case 8:
                return ((zyf) obj).performLongClick();
            case 9:
                zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                amg amgVarS1 = ((StickerPreviewScreen) obj).s1();
                if (!amgVarS1.d.h() || (rt2Var2 = (rt2) amgVarS1.u.a.getValue()) == null || !sol.a(rt2Var2, (wo6) amgVarS1.m.getValue())) {
                    return false;
                }
                a8j.x(amgVarS1.t, new k3g(sol.c(rt2Var2)));
                return true;
            case 10:
                ((AboutAppSettingsScreen) ((zo7) ((bt1) obj).v).b).o1().C();
                return true;
            case 11:
                return ((gnh) obj).performLongClick();
            case 12:
                vvi vviVar = (vvi) obj;
                Long l = vviVar.f;
                if (l != null) {
                    long jLongValue = l.longValue();
                    qf7 qf7Var = vviVar.d;
                    if (qf7Var != null) {
                        Long lValueOf = Long.valueOf(jLongValue);
                        ViewGroup viewGroup = (ViewGroup) vviVar.a;
                        qf7Var.invoke(lValueOf, viewGroup != null ? viewGroup : null);
                    }
                }
                return true;
            case 13:
                return ((izi) obj).performLongClick();
            default:
                return ((pyi) obj).performLongClick();
        }
    }
}
