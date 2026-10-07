package defpackage;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kck implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ kck(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        wdk wdkVar = wdk.b;
        wdk wdkVar2 = wdk.d;
        wdk wdkVar3 = wdk.c;
        switch (i) {
            case 0:
                o8k o8kVar = (o8k) obj;
                return (o8kVar instanceof l8k) || (o8kVar instanceof m8k);
            case 1:
                return ((pbk) obj) instanceof mbk;
            case 2:
                return false;
            case 3:
                return ((wdk) obj) == wdkVar;
            case 4:
                wdk wdkVar4 = (wdk) obj;
                return wdkVar4 == wdkVar3 || wdkVar4 == wdkVar2;
            case 5:
                return ((wdk) obj) == wdk.a;
            case 6:
                return ((wdk) obj) == wdkVar;
            case 7:
                return true;
            case 8:
                wdk wdkVar5 = (wdk) obj;
                return wdkVar5 == wdkVar3 || wdkVar5 == wdkVar2;
            case 9:
                return !((String) obj).startsWith(":");
            case 10:
                return ((String) ((Map.Entry) obj).getKey()).startsWith(":");
            case 11:
                return ((List) obj).get(0).equals(2);
            default:
                return ((String) obj).startsWith("CN=");
        }
    }
}
