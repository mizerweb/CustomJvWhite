package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a6k implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6k b;

    public /* synthetic */ a6k(b6k b6kVar, int i) {
        this.a = i;
        this.b = b6kVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        int i2 = 0;
        w4k w4kVar = w4k.d;
        b6k b6kVar = this.b;
        switch (i) {
            case 0:
                b6kVar.b.d((o8k) obj, w4kVar, new a6k(b6kVar, i2));
                break;
            default:
                hak hakVar = b6kVar.b;
                int iIntValue = ((Integer) obj).intValue();
                s8k s8kVar = new s8k();
                s8kVar.a = iIntValue;
                hakVar.d(s8kVar, w4kVar, new a6k(b6kVar, i2));
                break;
        }
    }
}
