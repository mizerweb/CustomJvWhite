package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class vf3 extends nq4 {
    public wf3 d;
    public Bitmap e;
    public File f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wf3 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf3(wf3 wf3Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = wf3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return wf3.B(this.i, null, null, this);
    }
}
