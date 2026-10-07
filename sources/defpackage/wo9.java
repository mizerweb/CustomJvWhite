package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wo9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ wo9(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return xo9.i(list);
            case 1:
                return ((bw8) list.get(0)).c();
            case 2:
                return ((bw8) list.get(0)).c();
            default:
                return "listenToBatteryCharge: dropped accumulated snapshots count=" + list.size();
        }
    }
}
