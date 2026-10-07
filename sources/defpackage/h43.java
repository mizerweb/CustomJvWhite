package defpackage;

import one.me.profile.screens.media.ChatMediaTabWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class h43 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatMediaTabWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h43(lq4 lq4Var, ChatMediaTabWidget chatMediaTabWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatMediaTabWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatMediaTabWidget chatMediaTabWidget = this.g;
        switch (i) {
            case 0:
                h43 h43Var = new h43(lq4Var, chatMediaTabWidget, 0);
                h43Var.f = obj;
                return h43Var;
            default:
                h43 h43Var2 = new h43(lq4Var, chatMediaTabWidget, 1);
                h43Var2.f = obj;
                return h43Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((h43) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((h43) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ChatMediaTabWidget chatMediaTabWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                c43 c43Var = (c43) obj2;
                rcc rccVar = (rcc) chatMediaTabWidget.g.m(chatMediaTabWidget, ChatMediaTabWidget.n[0]);
                rccVar.setTitle(c43Var.b);
                rccVar.setAvatar(c43Var.a);
                break;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    chatMediaTabWidget.getRouter().C(chatMediaTabWidget);
                }
                break;
        }
        return sbiVar;
    }
}
