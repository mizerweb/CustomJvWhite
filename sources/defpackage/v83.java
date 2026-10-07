package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v83 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatNotificationsSettingsScreen b;

    public /* synthetic */ v83(ChatNotificationsSettingsScreen chatNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = chatNotificationsSettingsScreen;
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
    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = this.b;
        switch (i) {
            case 0:
                z83 z83Var = (z83) chatNotificationsSettingsScreen.b.getAccessor().c(939);
                return new y83(z83Var.a, z83Var.b);
            case 1:
                zv8[] zv8VarArr = ChatNotificationsSettingsScreen.g;
                rcc rccVar = new rcc(chatNotificationsSettingsScreen.getContext());
                rccVar.setId(R.id.oneme_notifications_settings_chat_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setTitle(R.string.oneme_notifications_settings_chat_toolbar_title);
                rccVar.setLeftActions(new wbc(new w83(i2)));
                return rccVar;
            default:
                zv8[] zv8VarArr2 = ChatNotificationsSettingsScreen.g;
                k96 k96Var = new k96(chatNotificationsSettingsScreen.getContext());
                k96Var.setId(R.id.oneme_notifications_settings_chat_recycler_view);
                k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager());
                k96Var.setOverScrollMode(2);
                rsf rsfVar = chatNotificationsSettingsScreen.d;
                k96Var.setAdapter(rsfVar);
                k96Var.h(new sbf(pq3.j.h(k96Var), new s63(2, chatNotificationsSettingsScreen), null, null, null, 60), -1);
                k96Var.h(new q91(2), -1);
                zpg zpgVar = new zpg(k96Var, rsfVar, new xva(8, new tc(chatNotificationsSettingsScreen, 21, k96Var)));
                k96Var.h(zpgVar, -1);
                n1g.N(new x83(zpgVar, null, 0), k96Var);
                return k96Var;
        }
    }
}
