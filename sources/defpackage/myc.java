package defpackage;

import java.util.List;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class myc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PickerChatsTabWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myc(lq4 lq4Var, PickerChatsTabWidget pickerChatsTabWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pickerChatsTabWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PickerChatsTabWidget pickerChatsTabWidget = this.g;
        switch (i) {
            case 0:
                myc mycVar = new myc(lq4Var, pickerChatsTabWidget, 0);
                mycVar.f = obj;
                return mycVar;
            default:
                myc mycVar2 = new myc(lq4Var, pickerChatsTabWidget, 1);
                mycVar2.f = obj;
                return mycVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((myc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((myc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PickerChatsTabWidget pickerChatsTabWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    zv8[] zv8VarArr = PickerChatsTabWidget.p;
                    if (pickerChatsTabWidget.p1().getCurrentItem() != 0) {
                        pickerChatsTabWidget.p1().h(0, false);
                    }
                }
                zv8[] zv8VarArr2 = PickerChatsTabWidget.p;
                pickerChatsTabWidget.p1().setUserInputEnabled(!zBooleanValue);
                x2i.a(pickerChatsTabWidget.n, pickerChatsTabWidget.o1());
                pickerChatsTabWidget.o1().setVisibility(zBooleanValue ? 8 : 0);
                break;
            default:
                ch3.d0(obj);
                List list = (List) obj2;
                pickerChatsTabWidget.k.j(list);
                pickerChatsTabWidget.m.M(list);
                break;
        }
        return sbiVar;
    }
}
