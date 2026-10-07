package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy2 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashSet b;

    public /* synthetic */ qy2(LinkedHashSet linkedHashSet, int i) {
        this.a = i;
        this.b = linkedHashSet;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.a;
        LinkedHashSet linkedHashSet = this.b;
        switch (i) {
            case 0:
                zContains = linkedHashSet.contains(Long.valueOf(((rt2) obj).A()));
                break;
            default:
                zContains = linkedHashSet.contains(Long.valueOf(((kw7) obj).getA()));
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
