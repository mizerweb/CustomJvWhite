package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class hyc implements nxc {
    public final /* synthetic */ PickerChatsListWidget a;

    public hyc(PickerChatsListWidget pickerChatsListWidget) {
        this.a = pickerChatsListWidget;
    }

    @Override // defpackage.nxc
    public final boolean S(xyc xycVar, boolean z) {
        if (xycVar.c == 7) {
            return false;
        }
        zv8[] zv8VarArr = PickerChatsListWidget.x;
        PickerChatsListWidget pickerChatsListWidget = this.a;
        if (((Boolean) pickerChatsListWidget.x1().B.a.getValue()).booleanValue()) {
            return false;
        }
        Object targetWidget = pickerChatsListWidget.getTargetWidget();
        n5b n5bVar = targetWidget instanceof n5b ? (n5b) targetWidget : null;
        if (n5bVar != null) {
            n5bVar.d0(true);
        }
        pickerChatsListWidget.v1().B(xycVar, z, pickerChatsListWidget.u1(), true, 0);
        return true;
    }

    @Override // defpackage.nxc
    public final void T0(xyc xycVar, boolean z) {
        int i = xycVar.c;
        PickerChatsListWidget pickerChatsListWidget = this.a;
        if (i != 7) {
            zv8[] zv8VarArr = PickerChatsListWidget.x;
            pickerChatsListWidget.v1().B(xycVar, z, this.a.u1(), true, 0);
            return;
        }
        zv8[] zv8VarArr2 = PickerChatsListWidget.x;
        boolean zBooleanValue = ((Boolean) pickerChatsListWidget.x1().B.a.getValue()).booleanValue();
        PickerChatsListWidget pickerChatsListWidget2 = this.a;
        if (!zBooleanValue) {
            a8j.x(pickerChatsListWidget2.v1().j, wxc.a);
            return;
        }
        String str = pickerChatsListWidget2.c;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onItemClick: story cell click ignored during multi-select", null);
        }
    }
}
