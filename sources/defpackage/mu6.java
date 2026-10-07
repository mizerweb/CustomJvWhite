package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mu6 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ mu6(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                arrayList.add((String) obj);
                return sbi.a;
            default:
                arrayList.add((kp) obj);
                return Boolean.TRUE;
        }
    }
}
