package defpackage;

import android.widget.TextView;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class dde extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ RecordExitBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dde(lq4 lq4Var, RecordExitBottomSheet recordExitBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = recordExitBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        RecordExitBottomSheet recordExitBottomSheet = this.g;
        switch (i) {
            case 0:
                dde ddeVar = new dde(lq4Var, recordExitBottomSheet, 0);
                ddeVar.f = obj;
                return ddeVar;
            case 1:
                dde ddeVar2 = new dde(lq4Var, recordExitBottomSheet, 1);
                ddeVar2.f = obj;
                return ddeVar2;
            default:
                dde ddeVar3 = new dde(lq4Var, recordExitBottomSheet, 2);
                ddeVar3.f = obj;
                return ddeVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((dde) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((dde) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((dde) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        RecordExitBottomSheet recordExitBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (cqk.d((rbb) obj2, wx1.F)) {
                    recordExitBottomSheet.v1(true);
                }
                break;
            case 1:
                ch3.d0(obj);
                zv8[] zv8VarArr = RecordExitBottomSheet.E;
                recordExitBottomSheet.I1().setDescription((CharSequence) obj2);
                break;
            default:
                ch3.d0(obj);
                fde fdeVar = (fde) obj2;
                zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                TextView textViewK1 = recordExitBottomSheet.K1();
                tnh tnhVar = fdeVar.a;
                ede edeVar = fdeVar.d;
                ede edeVar2 = fdeVar.c;
                textViewK1.setText(tnhVar.b(recordExitBottomSheet.getContext()));
                TextView textViewJ1 = recordExitBottomSheet.J1();
                ynh ynhVar = fdeVar.b;
                textViewJ1.setText(ynhVar != null ? ynhVar.b(recordExitBottomSheet.getContext()) : null);
                recordExitBottomSheet.J1().setVisibility(ynhVar != null ? 0 : 8);
                CharSequence charSequenceB = fdeVar.e.b(recordExitBottomSheet.getContext());
                recordExitBottomSheet.I1().setTitle(charSequenceB);
                recordExitBottomSheet.I1().setVisibility((charSequenceB == null || charSequenceB.length() == 0) ? 8 : 0);
                recordExitBottomSheet.F1().setVisibility(fdeVar.f ? 0 : 8);
                cyb cybVarG1 = recordExitBottomSheet.G1();
                cybVarG1.setAppearance(edeVar2.c);
                CharSequence charSequenceB2 = edeVar2.b.b(cybVarG1.getContext());
                if (charSequenceB2 == null) {
                    charSequenceB2 = "";
                }
                cybVarG1.setText(charSequenceB2);
                qe7.H(cybVarG1, 300L, new x62(recordExitBottomSheet, 2, fdeVar));
                cyb cybVarH1 = recordExitBottomSheet.H1();
                cybVarH1.setAppearance(edeVar.c);
                CharSequence charSequenceB3 = edeVar.b.b(cybVarH1.getContext());
                cybVarH1.setText(charSequenceB3 != null ? charSequenceB3 : "");
                qe7.H(cybVarH1, 300L, new x7(7, recordExitBottomSheet));
                break;
        }
        return sbiVar;
    }
}
