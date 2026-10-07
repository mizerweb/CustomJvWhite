package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lfa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ lfa(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MessageContextMenuBottomSheet.w1;
                messageContextMenuBottomSheet.v1(true);
                break;
            case 1:
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                messageContextMenuBottomSheet.F1(((rp4) obj).a);
                break;
            default:
                zv8[] zv8VarArr3 = MessageContextMenuBottomSheet.w1;
                messageContextMenuBottomSheet.F1(((rp4) obj).a);
                break;
        }
        return sbiVar;
    }
}
