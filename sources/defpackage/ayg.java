package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ayg extends nq4 {
    public Uri d;
    public List e;
    public i6a f;
    public Bitmap.Config g;
    public Bitmap h;
    public au3 i;
    public Canvas j;
    public RectF k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dyg t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(dyg dygVar, nq4 nq4Var) {
        super(nq4Var);
        this.t = dygVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return dyg.f(this.t, null, null, 0, 0, 0, 0, false, null, this);
    }
}
