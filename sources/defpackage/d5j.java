package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class d5j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ x6a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5j(lq4 lq4Var, x6a x6aVar, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = x6aVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                d5j d5jVar = new d5j(lq4Var, this.g, 0);
                d5jVar.f = obj;
                return d5jVar;
            default:
                d5j d5jVar2 = new d5j(lq4Var, this.g, 1);
                d5jVar2.f = obj;
                return d5jVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((d5j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((d5j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        x6a x6aVar = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                x6aVar.setBackgroundBitmap((Bitmap) obj2);
                break;
            default:
                ch3.d0(obj);
                x6aVar.setPlayheadPosition(((Number) obj2).floatValue());
                break;
        }
        return sbiVar;
    }
}
