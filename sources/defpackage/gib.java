package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class gib extends MessageDigest {
    public static final gib a = new gib("NOP");

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        return new byte[0];
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
    }
}
