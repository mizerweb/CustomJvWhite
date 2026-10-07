package defpackage;

import java.util.function.LongUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ex9 implements LongUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((kb9) obj).a;
            default:
                Long l = (Long) ((yfd) obj).G.get(Long.valueOf(j));
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
        }
    }
}
