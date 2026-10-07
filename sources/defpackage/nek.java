package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.dj;

/* JADX INFO: loaded from: classes3.dex */
public final class nek extends InputStream {
    public ByteBuffer a;
    public final /* synthetic */ pak b;
    public final /* synthetic */ oek c;

    public nek(oek oekVar, pak pakVar) {
        this.c = oekVar;
        this.b = pakVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (l()) {
            return this.a.remaining();
        }
        return 0;
    }

    public final boolean l() throws IOException {
        byte[] bArrArray;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null && byteBuffer.position() != this.a.limit()) {
            return this.a.position() < this.a.limit();
        }
        try {
            o9b o9bVarA = this.c.d.a(this.b.e);
            if (!(o9bVarA instanceof iek)) {
                return false;
            }
            iek iekVar = (iek) o9bVarA;
            int iLimit = iekVar.a.limit();
            if (iLimit == iekVar.a.array().length) {
                bArrArray = iekVar.a.array();
            } else {
                byte[] bArr = new byte[iLimit];
                iekVar.a.get(bArr);
                bArrArray = bArr;
            }
            this.a = ByteBuffer.wrap(bArrArray);
            return true;
        } catch (dj e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (!l()) {
            return -1;
        }
        int iMin = Integer.min(this.a.remaining(), bArr.length);
        this.a.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (l()) {
            return this.a.get();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!l()) {
            return -1;
        }
        int iMin = Integer.min(this.a.remaining(), i2);
        this.a.get(bArr, i, iMin);
        return iMin;
    }
}
