package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w7k implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7k b;

    public /* synthetic */ w7k(z7k z7kVar, int i) {
        this.a = i;
        this.b = z7kVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        z7k z7kVar = this.b;
        switch (i) {
            case 0:
                ((eck) obj).b(z7kVar.f);
                break;
            case 1:
                ((eck) obj).b(z7kVar.f);
                break;
            case 2:
                ((eck) obj).b(z7kVar.f);
                break;
            default:
                z7kVar.j((Throwable) obj);
                break;
        }
    }
}
