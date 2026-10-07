package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ps3 implements gdd, tg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ps3(ss3 ss3Var, ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 1:
                arrayList.addAll((List) obj);
                break;
            case 2:
                arrayList.addAll((List) obj);
                break;
            case 3:
                arrayList.add((zic) obj);
                break;
            default:
                arrayList.addAll((List) obj);
                break;
        }
    }

    @Override // defpackage.gdd
    /* JADX INFO: renamed from: apply */
    public boolean mo28apply(Object obj) {
        String strA = ((v71) obj).a();
        ArrayList<String> arrayList = this.b;
        if (arrayList.isEmpty()) {
            return true;
        }
        for (String str : arrayList) {
            if (strA != null && strA.length() != 0 && z5h.K0(strA, str, false)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ ps3(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }
}
