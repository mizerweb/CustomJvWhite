package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fb5 implements ddd {
    public final /* synthetic */ int a;

    public /* synthetic */ fb5(int i) {
        this.a = i;
    }

    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            case 2:
                return ((mh6) obj).b != null;
            case 3:
                return ((mh6) obj).c != null;
            case 4:
                return np4.a(((t26) obj).a, new fb5(6));
            case 5:
                return np4.a(((t26) obj).a, new fb5(7));
            case 6:
                return !((s26) obj).f.a.isEmpty();
            default:
                return !((s26) obj).f.b.isEmpty();
        }
    }
}
