package defpackage;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class swd implements kri {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public jp6 d;
    public final aqb e;

    public /* synthetic */ swd(aqb aqbVar, int i) {
        this.a = i;
        this.e = aqbVar;
    }

    @Override // defpackage.kri
    public final kri b(String str) {
        int i = this.a;
        aqb aqbVar = this.e;
        switch (i) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((rwd) aqbVar).f(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((iok) aqbVar).b(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((crk) aqbVar).b(this.d, str, this.c);
                return this;
        }
    }

    @Override // defpackage.kri
    public final kri c(boolean z) {
        int i = this.a;
        aqb aqbVar = this.e;
        switch (i) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((rwd) aqbVar).b(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((iok) aqbVar).c(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((crk) aqbVar).c(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
