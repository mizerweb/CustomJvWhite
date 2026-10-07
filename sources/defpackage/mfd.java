package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class mfd extends nq4 {
    public wui d;
    public kp4 e;
    public String f;
    public File g;
    public Closeable h;
    public InputStream i;
    public Closeable j;
    public OutputStream k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ pfd x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfd(pfd pfdVar, nq4 nq4Var) {
        super(nq4Var);
        this.x = pfdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(null, null, this);
    }
}
