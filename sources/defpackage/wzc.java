package defpackage;

import android.app.Activity;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import java.util.Iterator;
import one.me.pinbars.PinBarsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class wzc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PinBarsWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzc(int i, lq4 lq4Var, PinBarsWidget pinBarsWidget) {
        super(2, lq4Var);
        this.e = i;
        this.g = pinBarsWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PinBarsWidget pinBarsWidget = this.g;
        switch (i) {
            case 0:
                wzc wzcVar = new wzc(0, lq4Var, pinBarsWidget);
                wzcVar.f = obj;
                return wzcVar;
            case 1:
                wzc wzcVar2 = new wzc(1, lq4Var, pinBarsWidget);
                wzcVar2.f = obj;
                return wzcVar2;
            case 2:
                wzc wzcVar3 = new wzc(2, lq4Var, pinBarsWidget);
                wzcVar3.f = obj;
                return wzcVar3;
            case 3:
                wzc wzcVar4 = new wzc(3, lq4Var, pinBarsWidget);
                wzcVar4.f = obj;
                return wzcVar4;
            case 4:
                wzc wzcVar5 = new wzc(4, lq4Var, pinBarsWidget);
                wzcVar5.f = obj;
                return wzcVar5;
            case 5:
                wzc wzcVar6 = new wzc(5, lq4Var, pinBarsWidget);
                wzcVar6.f = obj;
                return wzcVar6;
            default:
                wzc wzcVar7 = new wzc(6, lq4Var, pinBarsWidget);
                wzcVar7.f = obj;
                return wzcVar7;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wzc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        PinBarsWidget pinBarsWidget = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                jzc jzcVar = (jzc) obj2;
                boolean z = jzcVar instanceof gzc;
                PinBarsWidget pinBarsWidget2 = this.g;
                if (z) {
                    nl9.b(pinBarsWidget2.getActivity());
                    b0d.b.s(pinBarsWidget2.p1(), ((gzc) jzcVar).a());
                    return sbiVar;
                }
                if (jzcVar instanceof hzc) {
                    Iterator it = ((hzc) jzcVar).a().iterator();
                    while (it.hasNext()) {
                        b0d.b.e((i65) it.next());
                    }
                    return sbiVar;
                }
                if (!cqk.d(jzcVar, izc.a)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr = PinBarsWidget.z;
                pinBarsWidget2.u1(R.string.oneme_contact_block_bottom_sheet_title, R.string.oneme_contact_block_bottom_sheet_description, R.id.pinbars_block_user_confirmation_sheet_confirm, R.string.block, R.id.pinbars_block_user_confirmation_sheet_cancel, R.string.dont_block);
                return sbiVar;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                j90 j90Var = (j90) obj3;
                if (cqk.d(j90Var, h90.a)) {
                    zv8[] zv8VarArr2 = PinBarsWidget.z;
                    mvh mvhVar = pinBarsWidget.e;
                    if (mvhVar != null) {
                        mvhVar.dismiss();
                    }
                    pinBarsWidget.e = null;
                    return sbiVar;
                }
                if (!(j90Var instanceof i90)) {
                    ore.o();
                    return null;
                }
                ynh ynhVarA = ((i90) j90Var).a();
                if (pinBarsWidget.j == null) {
                    pinBarsWidget.j = pinBarsWidget.q1();
                    ViewGroup viewGroup = (ViewGroup) pinBarsWidget.getView();
                    TransitionManager.beginDelayedTransition(viewGroup, pinBarsWidget.r);
                    nza nzaVar = pinBarsWidget.j;
                    int childCount = viewGroup.getChildCount();
                    if (1 <= childCount) {
                        childCount = 1;
                    }
                    viewGroup.addView(nzaVar, childCount);
                }
                nza nzaVar2 = pinBarsWidget.j;
                if (nzaVar2 == null) {
                    return sbiVar;
                }
                nzaVar2.addOnLayoutChangeListener(new rq1(nzaVar2, pinBarsWidget, ynhVarA, 3));
                return sbiVar;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                aqc aqcVar = (aqc) obj4;
                zv8[] zv8VarArr3 = PinBarsWidget.z;
                if (aqcVar != null) {
                    b0d.b.n(aqcVar.a());
                    return sbiVar;
                }
                ore.o();
                return null;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                hr7 hr7Var = (hr7) obj5;
                zv8[] zv8VarArr4 = PinBarsWidget.z;
                if (hr7Var != null) {
                    ((xu1) pinBarsWidget.h.getValue()).k(hr7Var.a(), true, hr7Var.b(), false, new iua(23, hr7Var));
                    return sbiVar;
                }
                ore.o();
                return null;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                j99 j99Var = (j99) obj6;
                zv8[] zv8VarArr5 = PinBarsWidget.z;
                if (j99Var != null) {
                    b0d.b.p(j99Var.a(), j99Var.b());
                    return sbiVar;
                }
                ore.o();
                return null;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                te8 te8Var = (te8) obj7;
                zv8[] zv8VarArr6 = PinBarsWidget.z;
                if (te8Var instanceof pe8) {
                    b0d.b.o(((pe8) te8Var).a());
                    return sbiVar;
                }
                if (!(te8Var instanceof oe8)) {
                    if (te8Var instanceof se8) {
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                Activity activity = pinBarsWidget.getActivity();
                if (activity == null) {
                    return sbiVar;
                }
                ((gu) pinBarsWidget.v.getValue()).a(activity);
                return sbiVar;
            default:
                Object obj8 = this.f;
                ch3.d0(obj);
                pke pkeVar = (pke) obj8;
                zv8[] zv8VarArr7 = PinBarsWidget.z;
                if (pkeVar != null) {
                    b0d.b.m(pkeVar.a());
                    return sbiVar;
                }
                ore.o();
                return null;
        }
    }
}
