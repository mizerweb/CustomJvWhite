package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class qh2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wfe g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh2(wfe wfeVar, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = wfeVar;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.h;
        wfe wfeVar = this.g;
        switch (i) {
            case 0:
                qh2 qh2Var = new qh2(wfeVar, str, lq4Var, 0);
                qh2Var.f = obj;
                return qh2Var;
            default:
                qh2 qh2Var2 = new qh2(wfeVar, str, lq4Var, 1);
                qh2Var2.f = obj;
                return qh2Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        nfc nfcVar = (nfc) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((qh2) create(nfcVar, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        wfe wfeVar = this.g;
        String str = this.h;
        switch (i) {
            case 0:
                ch3.d0(obj);
                nfc nfcVar = (nfc) this.f;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) ef2.b(str)) + " returned");
                wfeVar.a = null;
                return nfcVar;
            default:
                ch3.d0(obj);
                nfc nfcVar2 = (nfc) this.f;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) ef2.b(str)) + " opened");
                wfeVar.a = null;
                return nfcVar2;
        }
    }
}
