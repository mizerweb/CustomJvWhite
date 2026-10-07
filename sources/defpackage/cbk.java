package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cbk implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ebk b;

    public /* synthetic */ cbk(ebk ebkVar, int i) {
        this.a = i;
        this.b = ebkVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        ebk ebkVar = this.b;
        o8k o8kVar = (o8k) obj;
        switch (i) {
            case 0:
                ebkVar.a.b.h(o8kVar, new cbk(ebkVar, 0), false);
                break;
            case 1:
                ebk.A(ebkVar, o8kVar);
                break;
            case 2:
                pak pakVar = ebkVar.a;
                pakVar.b.k(new bbk(ebkVar, 2), ti8.b(pakVar.a) + 9, w4k.d, new cbk(ebkVar, 2), true);
                break;
            default:
                ebk.A(ebkVar, o8kVar);
                break;
        }
    }
}
