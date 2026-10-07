package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ra3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ ra3(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
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
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        MessageWriteWidget messageWriteWidgetV1;
        int i = this.a;
        int i2 = 1;
        int i3 = 5;
        int i4 = 3;
        sbi sbiVar = sbi.a;
        ChatScreen chatScreen = this.b;
        switch (i) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                ou7 ou7Var = ChatScreen.L1;
                viewGroup.setId(R.id.chat__root_container);
                View view = new View(viewGroup.getContext());
                view.setId(R.id.chat__background);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                lvb.H(view, new oi8(5, 0, 5, !((Boolean) chatScreen.N1().p.getValue()).booleanValue() ? new j11(5, 1, true) : null), null);
                viewGroup.addView(view);
                ra3 ra3Var = new ra3(chatScreen, i2);
                sb3 sb3Var = new sb3(viewGroup.getContext(), 0);
                sb3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ra3Var.invoke(sb3Var);
                viewGroup.addView(sb3Var);
                tp2 tp2Var = new tp2(viewGroup.getContext());
                tp2Var.setId(R.id.chat__media_bar_container);
                tp2Var.setVisibility(8);
                tp2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(tp2Var);
                break;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                ou7 ou7Var2 = ChatScreen.L1;
                ra3 ra3Var2 = new ra3(chatScreen, 2);
                LinearLayout linearLayout = new LinearLayout(viewGroup2.getContext());
                linearLayout.setId(R.id.chat__main_container);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ra3Var2.invoke(linearLayout);
                viewGroup2.addView(linearLayout);
                tp2 tp2Var2 = new tp2(viewGroup2.getContext());
                tp2Var2.setId(R.id.chat__video_msg_container);
                tp2Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                tp2Var2.setVisibility(8);
                viewGroup2.addView(tp2Var2);
                tp2 tp2Var3 = new tp2(viewGroup2.getContext());
                tp2Var3.setId(R.id.chat__bottom_container);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                tp2Var3.setLayoutParams(layoutParams);
                chatScreen.G1(tp2Var3);
                tp2Var3.addOnLayoutChangeListener(new ci1(i4, chatScreen));
                n1g.N(new wa3(3, null, 0), tp2Var3);
                viewGroup2.addView(tp2Var3);
                ViewGroup tp2Var4 = new tp2(viewGroup2.getContext());
                tp2Var4.setId(R.id.chat__suggestion_container);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 80;
                layoutParams2.bottomMargin = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
                tp2Var4.setLayoutParams(layoutParams2);
                chatScreen.I1(tp2Var4);
                viewGroup2.addView(tp2Var4);
                View tp2Var5 = new tp2(viewGroup2.getContext());
                tp2Var5.setId(R.id.chat__media_keyboard);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 80;
                tp2Var5.setLayoutParams(layoutParams3);
                int i5 = uw8.a;
                tp2Var5.setTranslationY(uw8.a(tp2Var5.getContext()));
                if (chatScreen.m2()) {
                    lvb.H(tp2Var5, new oi8(0, 0, 0, new j11(5, 1, true), 7), new ra3(chatScreen, i3));
                }
                viewGroup2.addView(tp2Var5);
                lvb.H(viewGroup2, chatScreen.m2() ? oi8.a(oi8.e, 10) : oi8.a(oi8.f, 13), null);
                break;
            case 2:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                ou7 ou7Var3 = ChatScreen.L1;
                ra3 ra3Var3 = new ra3(chatScreen, 4);
                FrameLayout frameLayout = new FrameLayout(linearLayout2.getContext());
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                if (!((Boolean) chatScreen.N1().p.getValue()).booleanValue()) {
                    lvb.I(frameLayout);
                }
                frameLayout.setElevation(10.0f);
                n1g.N(new qb3(3, null, 0), frameLayout);
                ra3Var3.invoke(frameLayout);
                linearLayout2.addView(frameLayout);
                tp2 tp2VarA = oc9.a(linearLayout2.getContext());
                tp2VarA.setId(R.id.chat__pinbars_container);
                tp2VarA.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                n1g.N(new nb3(3, null, 0), tp2VarA);
                tp2VarA.setElevation(10.0f);
                linearLayout2.addView(tp2VarA);
                tp2 tp2Var6 = new tp2(linearLayout2.getContext());
                tp2Var6.setId(R.id.chat__messages_container);
                tp2Var6.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                chatScreen.H1(tp2Var6);
                linearLayout2.addView(tp2Var6);
                break;
            case 3:
                ou7 ou7Var4 = ChatScreen.L1;
                if (chatScreen.U1().G() == null) {
                    int i6 = uw8.a;
                    if (uw8.b(uw8.c) && (messageWriteWidgetV1 = chatScreen.V1()) != null) {
                        messageWriteWidgetV1.i();
                    }
                    ej6 ej6Var = chatScreen.k2().r1;
                    ej6Var.b.f(ej6Var);
                    qbe qbeVarA2 = chatScreen.a2();
                    if (!((Boolean) qbeVarA2.i.getValue()).booleanValue()) {
                        tb3 tb3Var = tb3.b;
                        if (!tb3Var.b().f()) {
                            RootController rootController = tb3Var.b().a().e;
                            Activity activityD = rootController != null ? rootController.w1().d() : null;
                            if (activityD != null) {
                                activityD.finish();
                            }
                        }
                    } else {
                        a8j.x(qbeVarA2.f, gbe.a);
                    }
                } else {
                    chatScreen.o2(false);
                }
                break;
            case 4:
                ViewGroup viewGroup3 = (ViewGroup) obj;
                ou7 ou7Var5 = ChatScreen.L1;
                rcc rccVar = new rcc(viewGroup3.getContext());
                rccVar.setId(R.id.chat__toolbar);
                rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rccVar.setForm(chatScreen.f2());
                rccVar.setTitle("");
                rccVar.s("", false);
                rccVar.setLeftActions(chatScreen.h2());
                t3f t3fVar = chatScreen.d;
                if (!sol.d(t3fVar)) {
                    rccVar.setTitleClickListener(new pa3(chatScreen, 18));
                }
                viewGroup3.addView(rccVar);
                t7c t7cVar = new t7c(viewGroup3.getContext());
                t7cVar.setId(R.id.chat__search_view);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                layoutParams4.gravity = 8388629;
                t7cVar.setLayoutParams(layoutParams4);
                t7cVar.setShouldShowSearchIcon(false);
                t7cVar.setListener(new pb3(chatScreen));
                t7cVar.setSearchHint(np4.q(chatScreen.getContext(), chatScreen.k2().J() ? R.string.chat_screen_channel_search_hint : R.string.chat_screen_search_hint));
                if (sol.d(t3fVar)) {
                    t7cVar.setVisibility(8);
                }
                viewGroup3.addView(t7cVar);
                break;
            default:
                kz9 kz9Var = chatScreen.t1;
                if (kz9Var != null) {
                    kz9Var.k();
                }
                break;
        }
        return sbiVar;
    }
}
