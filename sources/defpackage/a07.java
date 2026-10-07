package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public final class a07 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wfe b;

    public /* synthetic */ a07(int i, wfe wfeVar) {
        this.a = i;
        this.b = wfeVar;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        int i = this.a;
        wfe wfeVar = this.b;
        switch (i) {
            case 0:
                wfeVar.a = obj;
                throw new AbortFlowException(this);
            default:
                wfeVar.a = obj;
                throw new AbortFlowException(this);
        }
    }
}
