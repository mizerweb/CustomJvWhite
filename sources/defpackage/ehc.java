package defpackage;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ehc implements IntUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ ehc(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.b;
                return i2 > i ? i2 : i;
            default:
                return this.b | i;
        }
    }
}
