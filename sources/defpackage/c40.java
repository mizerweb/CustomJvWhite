package defpackage;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c40 implements DataOutput {
    public final /* synthetic */ DataOutputStream a;

    public c40(DataOutputStream dataOutputStream) {
        this.a = dataOutputStream;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws IOException {
        this.a.write(i);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws IOException {
        this.a.writeBoolean(z);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws IOException {
        this.a.writeByte(i);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        this.a.writeBytes(str);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        this.a.writeChar(i);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        this.a.writeChars(str);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws IOException {
        this.a.writeDouble(d);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws IOException {
        this.a.writeFloat(f);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws IOException {
        this.a.writeInt(i);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
        this.a.writeLong(j);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws IOException {
        this.a.writeShort(i);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        this.a.writeUTF(str);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
