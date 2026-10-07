package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fyc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    public /* synthetic */ fyc(PickerChatsListWidget pickerChatsListWidget, int i) {
        this.a = i;
        this.b = pickerChatsListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        PickerChatsListWidget pickerChatsListWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickerChatsListWidget.x;
                gvc gvcVar = new gvc(5);
                ca2 ca2Var = pickerChatsListWidget.a;
                ifh ifhVarD = ca2Var.getAccessor().d(85);
                ca2Var.getAccessor().getClass();
                pi3 pi3Var = new pi3(gvcVar, ifhVarD, ca2Var.getAccessor().d(54), ca2Var.getAccessor().d(377), ca2Var.getAccessor().d(480), ca2Var.getAccessor().d(670), ca2Var.getAccessor().d(485));
                ifh ifhVar = new ifh(new fyc(pickerChatsListWidget, 2));
                String str = pickerChatsListWidget.e;
                et3 et3Var = (et3) ca2Var.getAccessor().d(85).getValue();
                xhh xhhVar = (xhh) ca2Var.getAccessor().c(23);
                eg8 eg8Var = new eg8(pi3Var);
                hk4 hk4Var = (hk4) ca2Var.getAccessor().d(942).getValue();
                ifh ifhVarD2 = ca2Var.getAccessor().d(123);
                b00 b00VarA = ((hi3) ca2Var.getAccessor().c(980)).a(pickerChatsListWidget.e);
                py2 py2VarU1 = pickerChatsListWidget.u1();
                boolean zY1 = pickerChatsListWidget.y1();
                vv vvVar = pickerChatsListWidget.j;
                zv8[] zv8VarArr2 = PickerChatsListWidget.x;
                zv8 zv8Var = zv8VarArr2[4];
                boolean zBooleanValue = ((Boolean) vvVar.a(pickerChatsListWidget)).booleanValue();
                vv vvVar2 = pickerChatsListWidget.i;
                zv8 zv8Var2 = zv8VarArr2[3];
                return new dyc(str, b00VarA, hk4Var, et3Var, new fyc(pickerChatsListWidget, 3), py2VarU1, zY1, xhhVar, zBooleanValue, ((Boolean) vvVar2.a(pickerChatsListWidget)).booleanValue(), ifhVarD2, eg8Var, ifhVar, ca2Var.getAccessor().d(498), ca2Var.d());
            case 1:
                zv8[] zv8VarArr3 = PickerChatsListWidget.x;
                return new tp3(new fyc(pickerChatsListWidget, 4), new eyc(pickerChatsListWidget, 1), new gyc(pickerChatsListWidget, 0), new gyc(pickerChatsListWidget, 1));
            case 2:
                ca2 ca2Var2 = pickerChatsListWidget.a;
                return new qyc(ca2Var2.getAccessor().d(480), ca2Var2.getAccessor().d(479), ca2Var2.getAccessor().d(377), ca2Var2.d(), pickerChatsListWidget.u1(), null, (xn3) ca2Var2.getAccessor().d(144).getValue(), false);
            case 3:
                vv vvVar3 = pickerChatsListWidget.g;
                zv8 zv8Var3 = PickerChatsListWidget.x[1];
                if (((Boolean) vvVar3.a(pickerChatsListWidget)).booleanValue() && cqk.d(pickerChatsListWidget.e, "all.chat.folder")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                zv8[] zv8VarArr4 = PickerChatsListWidget.x;
                return so2.F(pickerChatsListWidget.getContext(), 6);
        }
    }
}
