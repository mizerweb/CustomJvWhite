package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class ky extends hih {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(int i, long j, long j2, long j3) {
        super(null);
        this.c = 1;
        if (i != 0) {
            h("type", qt4.f(i));
        }
        f(j, "sync");
        if (j2 != 0) {
            f(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 != 0) {
            f(j3, "userId");
        }
    }

    @Override // defpackage.hih
    public boolean i() {
        switch (this.c) {
            case 6:
                return true;
            default:
                return super.i();
        }
    }

    @Override // defpackage.hih
    public boolean j() {
        switch (this.c) {
            case 5:
                return true;
            default:
                return super.j();
        }
    }

    @Override // defpackage.hih
    public short k() {
        switch (this.c) {
            case 0:
                lhb lhbVar = kfc.c;
                return (short) 28;
            case 1:
                lhb lhbVar2 = kfc.c;
                return (short) 27;
            case 2:
                lhb lhbVar3 = kfc.c;
                return (short) 48;
            case 3:
            case 4:
            case 5:
            default:
                return super.k();
            case 6:
                lhb lhbVar4 = kfc.c;
                return (short) 1;
        }
    }

    @Override // defpackage.hih
    public int l() {
        switch (this.c) {
            case 6:
                return 0;
            default:
                return super.l();
        }
    }

    @Override // defpackage.hih
    public boolean o() {
        switch (this.c) {
            case 6:
                return false;
            default:
                return super.o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky(kfc kfcVar, int i) {
        super(kfcVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(int i, long[] jArr) {
        super(null);
        this.c = 0;
        if (i != 0) {
            if (jArr != null && jArr.length != 0) {
                h("type", qt4.f(i));
                e("ids", jArr);
                return;
            } else {
                ore.p("ids must not be null or empty");
                throw null;
            }
        }
        ore.p("type must not be null");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(List list) {
        super(null);
        this.c = 2;
        d("chatIds", list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(String str, long[] jArr) {
        super(kfc.M3);
        this.c = 3;
        if (str != null && str.length() != 0) {
            h("folderId", str);
        }
        if (jArr.length == 0) {
            return;
        }
        e("userChatIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky() {
        super(kfc.p1);
        this.c = 5;
    }
}
