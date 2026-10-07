package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class rh2 extends mdh implements cf7 {
    public final /* synthetic */ wfe e;
    public final /* synthetic */ wfe f;
    public final /* synthetic */ lg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh2(wfe wfeVar, wfe wfeVar2, lg lgVar, lq4 lq4Var) {
        super(1, lq4Var);
        this.e = wfeVar;
        this.f = wfeVar2;
        this.g = lgVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new rh2(this.e, this.f, this.g, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((rh2) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
        this.e.a = null;
        if (this.f.a == null) {
            return null;
        }
        Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
        this.g.a();
        return new nfc(null, new ne2(13), 1);
    }
}
