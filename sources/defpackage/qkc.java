package defpackage;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qkc implements IntUnaryOperator {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.a) {
            case 0:
                return i + 4;
            default:
                int i2 = i - 1;
                if (i2 < 0) {
                    return 0;
                }
                return i2;
        }
    }
}
