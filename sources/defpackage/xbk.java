package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xbk implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ybk b;

    public /* synthetic */ xbk(ybk ybkVar, int i) {
        this.a = i;
        this.b = ybkVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        ybk ybkVar = this.b;
        zbk zbkVar = (zbk) obj;
        switch (i) {
            case 0:
                ybkVar.f.remove(zbkVar.b.p());
                break;
            default:
                ybkVar.f.remove(zbkVar.b.p());
                break;
        }
    }
}
