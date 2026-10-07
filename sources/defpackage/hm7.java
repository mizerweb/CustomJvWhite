package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class hm7 extends mdh implements qf7 {
    public CharSequence e;
    public CharSequence f;
    public yf5 g;
    public QrCodeGenerator h;
    public Context i;
    public ju6 j;
    public xhh k;
    public ky8 l;
    public b0e m;
    public String n;
    public Drawable o;
    public Bitmap p;
    public long q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ b0e u;
    public final /* synthetic */ im7 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm7(b0e b0eVar, im7 im7Var, int i, int i2, lq4 lq4Var) {
        super(2, lq4Var);
        this.u = b0eVar;
        this.v = im7Var;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        hm7 hm7Var = new hm7(this.u, this.v, this.w, this.x, lq4Var);
        hm7Var.t = obj;
        return hm7Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((hm7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0312  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b5, code lost:
    
        if (r2 == r14) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0352, code lost:
    
        if (r0 == r14) goto L90;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
