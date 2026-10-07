package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class gkg extends sia {
    public final /* synthetic */ int a;

    public gkg(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.cachedSize = -1;
                break;
            case 2:
                this.cachedSize = -1;
                break;
            case 3:
                this.cachedSize = -1;
                break;
            default:
                this.cachedSize = -1;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        int iS;
        int iS2;
        int iS3;
        int iS4;
        switch (this.a) {
            case 0:
                do {
                    iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                } while (su3Var.u(iS));
                break;
            case 1:
                do {
                    iS2 = su3Var.s();
                    if (iS2 == 0) {
                        break;
                    }
                } while (su3Var.u(iS2));
                break;
            case 2:
                do {
                    iS3 = su3Var.s();
                    if (iS3 == 0) {
                        break;
                    }
                } while (su3Var.u(iS3));
                break;
            default:
                do {
                    iS4 = su3Var.s();
                    if (iS4 == 0) {
                        break;
                    }
                } while (su3Var.u(iS4));
                break;
        }
        return this;
    }
}
