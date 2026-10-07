package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mfa implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ mfa(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MessageContextMenuBottomSheet.w1;
                vv vvVar = messageContextMenuBottomSheet.H;
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                zv8 zv8Var = zv8VarArr2[9];
                if (!((Boolean) vvVar.a(messageContextMenuBottomSheet)).booleanValue()) {
                    zv8 zv8Var2 = zv8VarArr2[9];
                    vvVar.b(messageContextMenuBottomSheet, Boolean.TRUE);
                    Object targetController = messageContextMenuBottomSheet.getTargetController();
                    vp4 vp4Var = targetController instanceof vp4 ? (vp4) targetController : null;
                    if (vp4Var != null) {
                        vp4Var.onDismiss();
                    }
                }
                return sbi.a;
            case 1:
                c8e c8eVar = (c8e) messageContextMenuBottomSheet.Z.getValue();
                return messageContextMenuBottomSheet.H1() == -9223372036854775805L ? (a8e) c8eVar.g.getValue() : c8eVar.B();
            case 2:
                raa raaVar = (raa) messageContextMenuBottomSheet.u.getAccessor().c(869);
                vv vvVar2 = messageContextMenuBottomSheet.E;
                zv8[] zv8VarArr3 = MessageContextMenuBottomSheet.w1;
                zv8 zv8Var3 = zv8VarArr3[6];
                long jLongValue = ((Number) vvVar2.a(messageContextMenuBottomSheet)).longValue();
                long jH1 = messageContextMenuBottomSheet.H1();
                vv vvVar3 = messageContextMenuBottomSheet.G;
                zv8 zv8Var4 = zv8VarArr3[8];
                return raaVar.a(jLongValue, jH1, false, ((Number) vvVar3.a(messageContextMenuBottomSheet)).longValue());
            default:
                zv8[] zv8VarArr4 = MessageContextMenuBottomSheet.w1;
                return Boolean.valueOf(((jsa) messageContextMenuBottomSheet.o1.getValue()).d.h() && messageContextMenuBottomSheet.J1().H());
        }
    }
}
