package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class mf9 extends hih {
    public final int c;

    public mf9(String str, boolean z, int i, byte[] bArr, long j, long j2, String str2, long j3, long j4, long j5, ug6 ug6Var) {
        super(kfc.n);
        this.c = i;
        h(ApiProtocol.KEY_TOKEN, str);
        a("interactive", z);
        if (j > 0) {
            f(j, "chatsSync");
        }
        if (j2 > 0) {
            f(j2, "contactsSync");
        }
        f(-1L, "presenceSync");
        if (str2 != null && str2.length() != 0) {
            h("configHash", str2);
        }
        if (j3 > 0) {
            f(j3, "callsSync");
        }
        if (j4 > 0) {
            f(j4, "lastLogin");
        }
        if (j5 > 0) {
            f(j5, "bannersSync");
        }
        if (bArr != null) {
            this.a.put("chatCacheFingerprint", bArr);
        }
        ul9 ul9Var = new ul9();
        byte[] bArr2 = ug6Var.a;
        if (bArr2 != null) {
            ul9Var.put("chatsCountGroups", bArr2);
        }
        g("exp", ul9Var.b());
    }

    @Override // defpackage.hih
    public final iih n() {
        return dul.i;
    }

    @Override // defpackage.hih
    public final boolean o() {
        return false;
    }

    @Override // defpackage.hih
    public final int p() {
        return this.c;
    }
}
