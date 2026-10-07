package defpackage;

import java.util.Iterator;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class wr1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallMoreBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(lq4 lq4Var, CallMoreBottomSheet callMoreBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callMoreBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallMoreBottomSheet callMoreBottomSheet = this.g;
        switch (i) {
            case 0:
                wr1 wr1Var = new wr1(lq4Var, callMoreBottomSheet, 0);
                wr1Var.f = obj;
                return wr1Var;
            case 1:
                wr1 wr1Var2 = new wr1(lq4Var, callMoreBottomSheet, 1);
                wr1Var2.f = obj;
                return wr1Var2;
            default:
                wr1 wr1Var3 = new wr1(lq4Var, callMoreBottomSheet, 2);
                wr1Var3.f = obj;
                return wr1Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wr1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wr1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wr1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0088 A[LOOP:0: B:11:0x0041->B:25:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        dsf dsfVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallMoreBottomSheet callMoreBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                CharSequence charSequence = (CharSequence) obj2;
                zv8[] zv8VarArr = CallMoreBottomSheet.t;
                ade adeVar = (ade) callMoreBottomSheet.q.getValue();
                adeVar.b = charSequence;
                Iterator it = adeVar.a.iterator();
                while (it.hasNext()) {
                    ((atf) ((tr1) it.next()).a).setDescription(charSequence);
                }
                break;
            case 1:
                ch3.d0(obj);
                int iIntValue = ((Number) obj2).intValue();
                zv8[] zv8VarArr2 = CallMoreBottomSheet.t;
                ee1 ee1Var = (ee1) callMoreBottomSheet.r.getValue();
                ee1Var.b = iIntValue;
                c9b c9bVar = ee1Var.a;
                Object[] objArr = c9bVar.b;
                long[] jArr = c9bVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    sr1 sr1Var = (sr1) objArr[(i2 << 3) + i4];
                                    if (iIntValue > 0) {
                                        sr1Var.getClass();
                                        dsfVar = new dsf(iIntValue, 2);
                                    } else {
                                        dsfVar = null;
                                    }
                                    ((atf) sr1Var.a).setCounter(dsfVar);
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                break;
            default:
                ch3.d0(obj);
                if (cqk.d((rbb) obj2, wx1.F)) {
                    callMoreBottomSheet.v1(true);
                }
                break;
        }
        return sbiVar;
    }
}
