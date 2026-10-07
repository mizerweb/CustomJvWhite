package defpackage;

import one.me.finishbottomsheet.PollFinishBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class c8d extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PollFinishBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8d(lq4 lq4Var, PollFinishBottomSheet pollFinishBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pollFinishBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PollFinishBottomSheet pollFinishBottomSheet = this.g;
        switch (i) {
            case 0:
                c8d c8dVar = new c8d(lq4Var, pollFinishBottomSheet, 0);
                c8dVar.f = obj;
                return c8dVar;
            default:
                c8d c8dVar2 = new c8d(lq4Var, pollFinishBottomSheet, 1);
                c8dVar2.f = obj;
                return c8dVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((c8d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((c8d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PollFinishBottomSheet pollFinishBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                cyb cybVar = (cyb) pollFinishBottomSheet.A.m(pollFinishBottomSheet, PollFinishBottomSheet.B[3]);
                cybVar.setLoading(zBooleanValue);
                cybVar.setClickable(!zBooleanValue);
                break;
            default:
                ch3.d0(obj);
                if (cqk.d((rbb) obj2, rt3.b)) {
                    zpe zpeVar = BaseBottomSheetWidget.i;
                    pollFinishBottomSheet.v1(true);
                }
                break;
        }
        return sbiVar;
    }
}
