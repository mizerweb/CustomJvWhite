package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class h42 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallTopPanelWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h42(lq4 lq4Var, CallTopPanelWidget callTopPanelWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callTopPanelWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallTopPanelWidget callTopPanelWidget = this.g;
        switch (i) {
            case 0:
                h42 h42Var = new h42(lq4Var, callTopPanelWidget, 0);
                h42Var.f = obj;
                return h42Var;
            case 1:
                h42 h42Var2 = new h42(lq4Var, callTopPanelWidget, 1);
                h42Var2.f = obj;
                return h42Var2;
            default:
                h42 h42Var3 = new h42(lq4Var, callTopPanelWidget, 2);
                h42Var3.f = obj;
                return h42Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((h42) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((h42) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((h42) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallTopPanelWidget callTopPanelWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                svh svhVar = (svh) obj2;
                zv8[] zv8VarArr = CallTopPanelWidget.e;
                a42 a42VarO1 = callTopPanelWidget.o1();
                a42VarO1.x(svhVar.c, svhVar.f);
                a42VarO1.setButtonsVisibility(new y32(svhVar.d, svhVar.e));
                boolean z = svhVar.b;
                isk.d(a42VarO1.A, z, 0L, null, 6);
                isk.d(a42VarO1.B, z, 0L, null, 6);
                a42VarO1.setAudioSharingVisible(svhVar.h);
                a42VarO1.setAudioSharingEnabled(svhVar.g);
                break;
            case 1:
                ch3.d0(obj);
                int iIntValue = ((Number) obj2).intValue();
                zv8[] zv8VarArr2 = CallTopPanelWidget.e;
                callTopPanelWidget.o1().setAddUserCount(iIntValue);
                break;
            default:
                ch3.d0(obj);
                int iIntValue2 = ((Number) obj2).intValue();
                zv8[] zv8VarArr3 = CallTopPanelWidget.e;
                callTopPanelWidget.o1().setChatUnreadMessageCount(iIntValue2);
                break;
        }
        return sbiVar;
    }
}
