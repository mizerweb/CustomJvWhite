package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ya8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya8(ArrayList arrayList, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                return new ya8(arrayList, lq4Var, 0);
            case 1:
                return new ya8(arrayList, lq4Var, 1);
            default:
                return new ya8(arrayList, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ya8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ya8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ya8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ArrayList arrayList = this.f;
        int i2 = 1;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (arrayList.size() > 1) {
                    bx3.Y0(arrayList, new xa8(0));
                }
                break;
            case 1:
                ch3.d0(obj);
                if (arrayList.size() > 1) {
                    bx3.Y0(arrayList, new xa8(i2));
                }
                break;
            default:
                ch3.d0(obj);
                if (arrayList.size() > 1) {
                    bx3.Y0(arrayList, new xa8(2));
                }
                break;
        }
        return sbiVar;
    }
}
