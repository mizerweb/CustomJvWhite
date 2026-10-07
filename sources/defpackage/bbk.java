package defpackage;

import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bbk implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ ebk b;

    public /* synthetic */ bbk(ebk ebkVar, int i) {
        this.a = i;
        this.b = ebkVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        ebk ebkVar = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                int i2 = ebkVar.a.a;
                long j = ebkVar.j;
                long j2 = ebkVar.f;
                r8k r8kVar = new r8k();
                r8kVar.a = i2;
                r8kVar.b = j;
                r8kVar.c = j2;
                return r8kVar;
            case 1:
                return ebkVar.I(num.intValue());
            case 2:
                num.getClass();
                return ebk.y(ebkVar);
            default:
                return ebkVar.I(num.intValue());
        }
    }
}
