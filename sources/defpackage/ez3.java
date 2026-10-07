package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ez3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ long c;

    public /* synthetic */ ez3(Set set, long j, int i) {
        this.a = i;
        this.b = set;
        this.c = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        long j = this.c;
        Set set = this.b;
        sfa sfaVar = (sfa) obj;
        switch (i) {
            case 0:
                if (!set.contains(Long.valueOf(sfaVar.b)) && sfaVar.F < j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (!set.contains(Long.valueOf(sfaVar.b)) && sfaVar.F < j) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
