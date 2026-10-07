package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tof extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ bpf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tof(bpf bpfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = bpfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        bpf bpfVar = this.f;
        switch (i) {
            case 0:
                return new tof(bpfVar, lq4Var, 0);
            default:
                return new tof(bpfVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((tof) create((ssc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((tof) create((Map) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        bpf bpfVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = bpf.Y;
                bpfVar.B();
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = bpf.Y;
                bpfVar.B();
                break;
        }
        return sbiVar;
    }
}
