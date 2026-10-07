package defpackage;

import java.util.Comparator;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class nu1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ pu1 b;

    public /* synthetic */ nu1(pu1 pu1Var, int i) {
        this.a = i;
        this.b = pu1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        pu1 pu1Var = this.b;
        switch (i) {
            case 0:
                v8b v8bVar = pu1Var.h;
                return e9i.D(Long.valueOf(v8bVar.c(BuildConfig.MAX_TIME_TO_UPLOAD, ((Map.Entry) obj).getKey())), Long.valueOf(v8bVar.c(BuildConfig.MAX_TIME_TO_UPLOAD, ((Map.Entry) obj2).getKey())));
            default:
                v8b v8bVar2 = pu1Var.g;
                return e9i.D(Long.valueOf(v8bVar2.c(BuildConfig.MAX_TIME_TO_UPLOAD, (fu1) obj)), Long.valueOf(v8bVar2.c(BuildConfig.MAX_TIME_TO_UPLOAD, (fu1) obj2)));
        }
    }
}
