package one.me.webapp.util;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import defpackage.a4c;
import defpackage.ahj;
import defpackage.av7;
import defpackage.cv7;
import defpackage.dv7;
import defpackage.gm0;
import defpackage.ifh;
import defpackage.je9;
import defpackage.ny8;
import defpackage.o0j;
import defpackage.tgb;
import defpackage.vgb;
import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class WebAppNfcService extends HostApduService {
    public static final /* synthetic */ int c = 0;
    public final String a = WebAppNfcService.class.getName();
    public final ny8 b = ((ahj) new ifh(new o0j(20)).getValue()).a();

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/webapp/util/WebAppNfcService$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "web-app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(String str, Throwable th) {
            super("44746", str, th);
        }
    }

    public final byte[] a() {
        tgb tgbVar = (tgb) this.b.getValue();
        tgbVar.e.a(vgb.a);
        return new byte[]{111, 0};
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final void onDeactivated(int i) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.h(i, "Deactivated: "), null);
        }
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        je9 je9Var = je9.f;
        if (gm0.c()) {
            String name = WebAppNfcService.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, name, "APDU received: ".concat(av7.h(bArr)), null);
                }
            }
        }
        if (bArr.length < 4) {
            String name2 = WebAppNfcService.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, "APDU command size is less than 4", null);
            }
            return a();
        }
        byte b = bArr[1];
        if (b != -92) {
            String str = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                int[] iArr = av7.a;
                cv7 cv7Var = dv7.c.b;
                a4cVar3.c(je9Var, str, "Unsupported INS: ".concat(cv7Var.a ? new String(new char[]{"0123456789abcdef".charAt((b >> 4) & 15), "0123456789abcdef".charAt(b & 15)}) : av7.i(b, cv7Var, 8)), null);
            }
            return a();
        }
        try {
            byte[] bArr2 = (byte[]) ((tgb) this.b.getValue()).d.get();
            if (bArr2 != null) {
                ((tgb) this.b.getValue()).e.a(vgb.b);
                return bArr2;
            }
            String str2 = this.a;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str2, "Don't have data to send in select command", null);
            }
            return a();
        } catch (Exception e) {
            a aVar = new a("select command error", e);
            gm0.V(this.a, aVar.getMessage(), aVar);
            return a();
        }
    }
}
