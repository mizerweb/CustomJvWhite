package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class i3h extends mdh implements qf7 {
    public final /* synthetic */ int A;
    public final /* synthetic */ cf7 B;
    public h6a e;
    public w5a f;
    public m6a g;
    public ufe h;
    public wfe i;
    public j3h j;
    public w5a k;
    public Bitmap l;
    public int m;
    public final /* synthetic */ j3h n;
    public final /* synthetic */ Uri o;
    public final /* synthetic */ File p;
    public final /* synthetic */ Bitmap q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ long u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ float y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3h(j3h j3hVar, Uri uri, File file, Bitmap bitmap, boolean z, float f, float f2, long j, float f3, float f4, float f5, float f6, int i, int i2, cf7 cf7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = j3hVar;
        this.o = uri;
        this.p = file;
        this.q = bitmap;
        this.r = z;
        this.s = f;
        this.t = f2;
        this.u = j;
        this.v = f3;
        this.w = f4;
        this.x = f5;
        this.y = f6;
        this.z = i;
        this.A = i2;
        this.B = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new i3h(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((i3h) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0158  */
    /* JADX WARN: Code duplicated, block: B:41:0x015a  */
    /* JADX WARN: Code duplicated, block: B:43:0x015e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0167  */
    /* JADX WARN: Code duplicated, block: B:50:0x0176  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01d9 -> B:58:0x01dd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
