package defpackage;

import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class wcj extends mdh implements tf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ ycj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcj(ycj ycjVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.f = ycjVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                wcj wcjVar = new wcj(3, (lq4) obj3);
                wcjVar.f = (ycj) obj;
                wcjVar.invokeSuspend(sbiVar);
                break;
            default:
                new wcj(this.f, (lq4) obj3).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        dce dceVar = null;
        switch (i) {
            case 0:
                ycj ycjVar = this.f;
                ch3.d0(obj);
                xcj xcjVar = ycjVar.c;
                if (xcjVar != null) {
                    RecordControlsWidget recordControlsWidget = (RecordControlsWidget) ((ft0) xcjVar).a;
                    zv8[] zv8VarArr = RecordControlsWidget.x1;
                    dceVar = (dce) recordControlsWidget.I1().s.a.getValue();
                }
                ycjVar.setBackgroundColor(dceVar instanceof zbe);
                break;
            default:
                ch3.d0(obj);
                ycj ycjVar2 = this.f;
                xcj xcjVar2 = ycjVar2.c;
                if (xcjVar2 != null) {
                    RecordControlsWidget recordControlsWidget2 = (RecordControlsWidget) ((ft0) xcjVar2).a;
                    zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                    dceVar = (dce) recordControlsWidget2.I1().s.a.getValue();
                }
                ycjVar2.setDurationColor(dceVar instanceof zbe);
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ wcj(int i, lq4 lq4Var) {
        super(i, lq4Var);
    }
}
