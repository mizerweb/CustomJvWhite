package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class yzd extends nq4 {
    public Context d;
    public ju6 e;
    public b0e f;
    public String g;
    public Bitmap h;
    public Bitmap i;
    public /* synthetic */ Object j;
    public final /* synthetic */ QrCodeGenerator k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzd(QrCodeGenerator qrCodeGenerator, nq4 nq4Var) {
        super(nq4Var);
        this.k = qrCodeGenerator;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, 0, null, null, null, null, null, null, null, null, null, null, this);
    }
}
