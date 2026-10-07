package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class wll extends pil {
    public final byte[] e;

    public wll(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.e = bArr;
    }

    @Override // defpackage.pil
    public final byte[] n0() {
        return this.e;
    }
}
