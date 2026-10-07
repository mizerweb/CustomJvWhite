package defpackage;

import java.util.List;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class iyc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PickerChatsListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyc(lq4 lq4Var, PickerChatsListWidget pickerChatsListWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pickerChatsListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PickerChatsListWidget pickerChatsListWidget = this.g;
        switch (i) {
            case 0:
                iyc iycVar = new iyc(lq4Var, pickerChatsListWidget, 0);
                iycVar.f = obj;
                return iycVar;
            case 1:
                iyc iycVar2 = new iyc(lq4Var, pickerChatsListWidget, 1);
                iycVar2.f = obj;
                return iycVar2;
            case 2:
                iyc iycVar3 = new iyc(lq4Var, pickerChatsListWidget, 2);
                iycVar3.f = obj;
                return iycVar3;
            default:
                iyc iycVar4 = new iyc(lq4Var, pickerChatsListWidget, 3);
                iycVar4.f = obj;
                return iycVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((iyc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((iyc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((iyc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((iyc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PickerChatsListWidget pickerChatsListWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = PickerChatsListWidget.x;
                pickerChatsListWidget.w1().X();
                break;
            case 1:
                ch3.d0(obj);
                nee neeVar = (nee) pickerChatsListWidget.r.F().get(0);
                if (!r5h.X0((String) obj2)) {
                    if (!cqk.d(neeVar, pickerChatsListWidget.t)) {
                        pvh pvhVar = pickerChatsListWidget.l;
                        if (pvhVar != null) {
                            pvhVar.b(pickerChatsListWidget.w1());
                        }
                        pickerChatsListWidget.r.H(pickerChatsListWidget.s);
                        pickerChatsListWidget.r.d.b(0, pickerChatsListWidget.t);
                        pickerChatsListWidget.w1().setRefreshingNext(PickerChatsListWidget.p1(pickerChatsListWidget));
                        pickerChatsListWidget.l = tre.Y(pickerChatsListWidget.w1());
                        if (pickerChatsListWidget.y1()) {
                            k96 k96VarW1 = pickerChatsListWidget.w1();
                            sy7 sy7Var = pickerChatsListWidget.m;
                            if (sy7Var != null) {
                                k96VarW1.o0(sy7Var);
                            }
                            pickerChatsListWidget.m = null;
                            zpg zpgVar = pickerChatsListWidget.n;
                            if (zpgVar != null) {
                                k96VarW1.o0(zpgVar);
                            }
                            pickerChatsListWidget.n = null;
                        }
                    }
                } else if (!cqk.d(neeVar, pickerChatsListWidget.s)) {
                    pvh pvhVar2 = pickerChatsListWidget.l;
                    if (pvhVar2 != null) {
                        pvhVar2.b(pickerChatsListWidget.w1());
                    }
                    pickerChatsListWidget.r.H(pickerChatsListWidget.t);
                    pickerChatsListWidget.r.d.b(0, pickerChatsListWidget.s);
                    pickerChatsListWidget.w1().setRefreshingNext(PickerChatsListWidget.p1(pickerChatsListWidget));
                    pickerChatsListWidget.l = tre.Y(pickerChatsListWidget.w1());
                    if (pickerChatsListWidget.y1()) {
                        k96 k96VarW2 = pickerChatsListWidget.w1();
                        sy7 sy7Var2 = pickerChatsListWidget.m;
                        if (sy7Var2 != null) {
                            k96VarW2.o0(sy7Var2);
                        }
                        pickerChatsListWidget.m = null;
                        zpg zpgVar2 = pickerChatsListWidget.n;
                        if (zpgVar2 != null) {
                            k96VarW2.o0(zpgVar2);
                        }
                        pickerChatsListWidget.n = null;
                        pickerChatsListWidget.s1(pickerChatsListWidget.w1());
                    }
                }
                break;
            case 2:
                ch3.d0(obj);
                e5i e5iVar = (e5i) obj2;
                List list = (List) e5iVar.a;
                List list2 = (List) e5iVar.b;
                boolean zBooleanValue = ((Boolean) e5iVar.c).booleanValue();
                zv8[] zv8VarArr2 = PickerChatsListWidget.x;
                pickerChatsListWidget.w1().setVisibility((list2 != null && list2.isEmpty() && list.isEmpty()) ? 4 : 0);
                if (list2 != null) {
                    PickerChatsListWidget.r1(pickerChatsListWidget, list2, false, pickerChatsListWidget.t);
                    PickerChatsListWidget.q1(pickerChatsListWidget, 1);
                    pickerChatsListWidget.t1().setVisibility(list2.isEmpty() ? 0 : 4);
                } else {
                    PickerChatsListWidget.r1(pickerChatsListWidget, list, zBooleanValue, pickerChatsListWidget.s);
                    PickerChatsListWidget.q1(pickerChatsListWidget, 2);
                    pickerChatsListWidget.t1().setVisibility((!list.isEmpty() || zBooleanValue) ? 4 : 0);
                }
                break;
            default:
                ch3.d0(obj);
                if (!((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr3 = PickerChatsListWidget.x;
                    pickerChatsListWidget.w1().o0((tp3) pickerChatsListWidget.w.getValue());
                } else {
                    zv8[] zv8VarArr4 = PickerChatsListWidget.x;
                    tre.y0(pickerChatsListWidget.w1());
                    pickerChatsListWidget.w1().h((tp3) pickerChatsListWidget.w.getValue(), 0);
                }
                break;
        }
        return sbiVar;
    }
}
