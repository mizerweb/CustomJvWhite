package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d3c extends nq4 {
    public long A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ i3c Z;
    public pne d;
    public y2c e;
    public File f;
    public File g;
    public String h;
    public Object i;
    public vfe j;
    public vfe k;
    public Object l;
    public File m;
    public Iterator n;
    public int n1;
    public File o;
    public Closeable p;
    public InputStream q;
    public Closeable r;
    public OutputStream s;
    public byte[] t;
    public Iterator u;
    public boolean v;
    public long w;
    public long x;
    public long y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.Z = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.Y = obj;
        this.n1 |= Integer.MIN_VALUE;
        return this.Z.p(null, null, null, null, false, null, this);
    }
}
