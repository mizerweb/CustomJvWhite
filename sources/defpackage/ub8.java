package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ub8 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ub8(px8 px8Var, String str) {
        this.a = 3;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                String str2 = ((zii) obj).a;
                return str2 != null && cqk.d(str2, str);
            case 1:
                return r5h.L0(((r01) obj).c, str, false);
            case 2:
                return ((r01) obj).c.equals(str);
            case 3:
                String str3 = (String) obj;
                if (str == null || str3 == null || str.trim().equals("") || str3.trim().equals("")) {
                    ore.p("can't be null or empty");
                } else {
                    if (!str3.startsWith("*.")) {
                        return str.equals(str3);
                    }
                    int iIndexOf = str.indexOf(".");
                    boolean z = iIndexOf > 0 && str.substring(iIndexOf + 1).equals(str3.substring(2));
                    boolean zEquals = str.equals(str3.substring(2));
                    if (z || zEquals) {
                        return true;
                    }
                }
                return false;
            default:
                return ((String) obj).equals(str);
        }
    }

    public /* synthetic */ ub8(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
