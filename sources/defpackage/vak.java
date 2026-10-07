package defpackage;

import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vak implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ wak b;

    public /* synthetic */ vak(wak wakVar, int i) {
        this.a = i;
        this.b = wakVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        int i2 = 0;
        wak wakVar = this.b;
        o8k o8kVar = (o8k) obj;
        switch (i) {
            case 0:
                pak pakVar = wakVar.a;
                pakVar.b.h(new k5k(pakVar.a, wakVar.j), new vak(wakVar, i2), false);
                Objects.toString(o8kVar);
                break;
            default:
                rak rakVar = wakVar.e;
                if (rakVar.e < 0 || rakVar.c != rakVar.e) {
                    wakVar.a.b.h(o8kVar, new vak(wakVar, 1), false);
                }
                break;
        }
    }
}
