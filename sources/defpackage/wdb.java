package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class wdb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ NeuroAvatarPickerBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdb(lq4 lq4Var, NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = neuroAvatarPickerBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = this.g;
        switch (i) {
            case 0:
                wdb wdbVar = new wdb(lq4Var, neuroAvatarPickerBottomSheet, 0);
                wdbVar.f = obj;
                return wdbVar;
            case 1:
                wdb wdbVar2 = new wdb(lq4Var, neuroAvatarPickerBottomSheet, 1);
                wdbVar2.f = obj;
                return wdbVar2;
            default:
                wdb wdbVar3 = new wdb(lq4Var, neuroAvatarPickerBottomSheet, 2);
                wdbVar3.f = obj;
                return wdbVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wdb) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wdb) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wdb) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                neuroAvatarPickerBottomSheet.x.H((List) obj2);
                break;
            case 1:
                ch3.d0(obj);
                List list = (List) obj2;
                ((seb) neuroAvatarPickerBottomSheet.D.m(neuroAvatarPickerBottomSheet, NeuroAvatarPickerBottomSheet.E[4])).setVisibility(list.isEmpty() ? 0 : 8);
                neuroAvatarPickerBottomSheet.F1().setVisibility(list.isEmpty() ? 8 : 0);
                yr8 yr8Var = neuroAvatarPickerBottomSheet.z;
                aac aacVarF1 = neuroAvatarPickerBottomSheet.F1();
                yr8Var.getClass();
                yr8.l(aacVarF1, list);
                break;
            default:
                ch3.d0(obj);
                zdb zdbVar = (zdb) obj2;
                Integer num = zdbVar.b;
                if (num != null && num.intValue() >= 0) {
                    j8e j8eVar = neuroAvatarPickerBottomSheet.C;
                    zv8[] zv8VarArr = NeuroAvatarPickerBottomSheet.E;
                    ((RecyclerView) j8eVar.m(neuroAvatarPickerBottomSheet, zv8VarArr[3])).E0();
                    neuroAvatarPickerBottomSheet.y.c = true;
                    dn2 dn2Var = new dn2(neuroAvatarPickerBottomSheet.getContext(), 1);
                    dn2Var.a = num.intValue();
                    vee layoutManager = ((RecyclerView) neuroAvatarPickerBottomSheet.C.m(neuroAvatarPickerBottomSheet, zv8VarArr[3])).getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.K0(dn2Var);
                    }
                }
                int i2 = zdbVar.a;
                if (i2 >= 0) {
                    zv8[] zv8VarArr2 = NeuroAvatarPickerBottomSheet.E;
                    if (neuroAvatarPickerBottomSheet.F1().getSelectedTabPosition() != i2) {
                        neuroAvatarPickerBottomSheet.F1().stopNestedScroll();
                        ugh ughVarH = neuroAvatarPickerBottomSheet.F1().h(i2);
                        if (ughVarH != null) {
                            ughVarH.a();
                        }
                    }
                }
                break;
        }
        return sbiVar;
    }
}
