package defpackage;

import java.util.List;
import one.me.chats.picker.members.PickerMembersListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class zyc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PickerMembersListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyc(PickerMembersListWidget pickerMembersListWidget, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pickerMembersListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PickerMembersListWidget pickerMembersListWidget = this.g;
        switch (i) {
            case 0:
                zyc zycVar = new zyc(pickerMembersListWidget, lq4Var, 0);
                zycVar.f = obj;
                return zycVar;
            case 1:
                zyc zycVar2 = new zyc(pickerMembersListWidget, lq4Var, 1);
                zycVar2.f = obj;
                return zycVar2;
            default:
                zyc zycVar3 = new zyc(pickerMembersListWidget, lq4Var, 2);
                zycVar3.f = obj;
                return zycVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((zyc) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((zyc) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((zyc) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        final PickerMembersListWidget pickerMembersListWidget = this.g;
        switch (i) {
            case 0:
                List list = (List) this.f;
                ch3.d0(obj);
                pickerMembersListWidget.i.H(list);
                break;
            case 1:
                m8b m8bVar = (m8b) this.f;
                ch3.d0(obj);
                zv8[] zv8VarArr = PickerMembersListWidget.p;
                mjg mjgVar = ((czc) pickerMembersListWidget.g.getValue()).h;
                mjgVar.getClass();
                mjgVar.j(null, m8bVar);
                pickerMembersListWidget.r1().X();
                break;
            default:
                oxc oxcVar = pickerMembersListWidget.i;
                oxc oxcVar2 = pickerMembersListWidget.j;
                String str = (String) this.f;
                ch3.d0(obj);
                final int i2 = 0;
                if (str == null || r5h.X0(str)) {
                    zv8[] zv8VarArr2 = PickerMembersListWidget.p;
                    if (!cqk.d(pickerMembersListWidget.r1().getAdapter(), oxcVar)) {
                        pvh pvhVar = pickerMembersListWidget.m;
                        if (pvhVar != null) {
                            pvhVar.b(pickerMembersListWidget.r1());
                        }
                        pickerMembersListWidget.r1().K0(oxcVar, false);
                        pickerMembersListWidget.m = tre.Y(pickerMembersListWidget.r1());
                        if (pickerMembersListWidget.p1()) {
                            n1g.Q(pickerMembersListWidget.r1(), new Runnable() { // from class: azc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i3 = i2;
                                    PickerMembersListWidget pickerMembersListWidget2 = pickerMembersListWidget;
                                    switch (i3) {
                                        case 0:
                                            zv8[] zv8VarArr3 = PickerMembersListWidget.p;
                                            k96 k96VarR1 = pickerMembersListWidget2.r1();
                                            sy7 sy7Var = pickerMembersListWidget2.n;
                                            if (sy7Var != null) {
                                                k96VarR1.o0(sy7Var);
                                            }
                                            pickerMembersListWidget2.n = null;
                                            zpg zpgVar = pickerMembersListWidget2.o;
                                            if (zpgVar != null) {
                                                k96VarR1.o0(zpgVar);
                                            }
                                            pickerMembersListWidget2.o = null;
                                            pickerMembersListWidget2.o1(pickerMembersListWidget2.r1());
                                            break;
                                        default:
                                            zv8[] zv8VarArr4 = PickerMembersListWidget.p;
                                            k96 k96VarR2 = pickerMembersListWidget2.r1();
                                            sy7 sy7Var2 = pickerMembersListWidget2.n;
                                            if (sy7Var2 != null) {
                                                k96VarR2.o0(sy7Var2);
                                            }
                                            pickerMembersListWidget2.n = null;
                                            zpg zpgVar2 = pickerMembersListWidget2.o;
                                            if (zpgVar2 != null) {
                                                k96VarR2.o0(zpgVar2);
                                            }
                                            pickerMembersListWidget2.o = null;
                                            break;
                                    }
                                }
                            }, null, 5);
                        }
                    }
                } else {
                    zv8[] zv8VarArr3 = PickerMembersListWidget.p;
                    if (!cqk.d(pickerMembersListWidget.r1().getAdapter(), oxcVar2)) {
                        pvh pvhVar2 = pickerMembersListWidget.m;
                        if (pvhVar2 != null) {
                            pvhVar2.b(pickerMembersListWidget.r1());
                        }
                        pickerMembersListWidget.r1().K0(oxcVar2, false);
                        pickerMembersListWidget.m = tre.Y(pickerMembersListWidget.r1());
                        if (pickerMembersListWidget.p1()) {
                            final int i3 = 1;
                            n1g.Q(pickerMembersListWidget.r1(), new Runnable() { // from class: azc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    PickerMembersListWidget pickerMembersListWidget2 = pickerMembersListWidget;
                                    switch (i4) {
                                        case 0:
                                            zv8[] zv8VarArr4 = PickerMembersListWidget.p;
                                            k96 k96VarR1 = pickerMembersListWidget2.r1();
                                            sy7 sy7Var = pickerMembersListWidget2.n;
                                            if (sy7Var != null) {
                                                k96VarR1.o0(sy7Var);
                                            }
                                            pickerMembersListWidget2.n = null;
                                            zpg zpgVar = pickerMembersListWidget2.o;
                                            if (zpgVar != null) {
                                                k96VarR1.o0(zpgVar);
                                            }
                                            pickerMembersListWidget2.o = null;
                                            pickerMembersListWidget2.o1(pickerMembersListWidget2.r1());
                                            break;
                                        default:
                                            zv8[] zv8VarArr5 = PickerMembersListWidget.p;
                                            k96 k96VarR2 = pickerMembersListWidget2.r1();
                                            sy7 sy7Var2 = pickerMembersListWidget2.n;
                                            if (sy7Var2 != null) {
                                                k96VarR2.o0(sy7Var2);
                                            }
                                            pickerMembersListWidget2.n = null;
                                            zpg zpgVar2 = pickerMembersListWidget2.o;
                                            if (zpgVar2 != null) {
                                                k96VarR2.o0(zpgVar2);
                                            }
                                            pickerMembersListWidget2.o = null;
                                            break;
                                    }
                                }
                            }, null, 5);
                        }
                    }
                }
                break;
        }
        return sbiVar;
    }
}
