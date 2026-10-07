package defpackage;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class k63 implements UnaryOperator {
    public final /* synthetic */ opa a;

    public k63(opa opaVar) {
        this.a = opaVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        opa opaVar = this.a;
        return new l53(opaVar.c, opaVar.b);
    }
}
