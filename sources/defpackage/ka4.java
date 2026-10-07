package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka4 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ ka4(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ConcurrentHashMap.newKeySet();
            case 1:
                return ConcurrentHashMap.newKeySet();
            case 2:
                return ((fi4) obj).c;
            default:
                return ((ll4) obj).b;
        }
    }

    public /* synthetic */ ka4(int i, cf7 cf7Var) {
        this.a = i;
    }
}
