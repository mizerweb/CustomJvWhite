package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d5d implements af7 {
    public static final d5d b = new d5d(0);
    public static final d5d c = new d5d(1);
    public static final d5d d = new d5d(2);
    public static final d5d e = new d5d(3);
    public static final d5d f = new d5d(4);
    public static final d5d g = new d5d(5);
    public static final d5d h = new d5d(6);
    public static final d5d i = new d5d(7);
    public static final d5d j = new d5d(8);
    public final /* synthetic */ int a;

    public /* synthetic */ d5d(int i2) {
        this.a = i2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return tgc.Companion.serializer();
            case 1:
                return h6a.Companion.serializer();
            case 2:
                return y63.Companion.serializer();
            case 3:
                return b01.a;
            case 4:
                return lvb.o0(new fw(oqf.Companion.serializer()));
            case 5:
                return cfc.Companion.serializer();
            case 6:
                return new se7(new ConcurrentHashMap(64));
            case 7:
                return new se7(new ConcurrentHashMap(64));
            default:
                return new j7f();
        }
    }
}
