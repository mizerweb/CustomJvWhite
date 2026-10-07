package defpackage;

import java.util.Arrays;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q4k implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    public /* synthetic */ q4k(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                return Arrays.equals(((z5k) obj).d, bArr);
            default:
                return Arrays.equals((byte[]) obj, bArr);
        }
    }
}
