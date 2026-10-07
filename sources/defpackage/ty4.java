package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class ty4 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final v2a j;

    public ty4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new v2a(cryptoInfo);
    }
}
