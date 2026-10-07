package defpackage;

import java.io.Serializable;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class sm4 extends kih implements Serializable {
    public int c;
    public String d;

    public sm4(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (!str.equals("verifyResult")) {
            if (str.equals(SdkMetricStatEvent.NAME_KEY)) {
                this.d = ch3.W(fkaVar);
                return;
            } else {
                fkaVar.x();
                return;
            }
        }
        String strW = ch3.W(fkaVar);
        int i = 0;
        if (strW == null) {
            ore.n("Name is null");
        } else if (strW.equals("GOOD")) {
            i = 1;
        } else if (strW.equals("BAD")) {
            i = 2;
        } else if (strW.equals("UNDEFINED")) {
            i = 3;
        } else {
            ore.p("No enum constant ru.ok.tamtam.api.commands.ContactVerifyCmd.VerifyResult.".concat(strW));
        }
        this.c = i;
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str;
        int i = this.c;
        if (i == 1) {
            str = "GOOD";
        } else if (i != 2) {
            str = i != 3 ? "null" : "UNDEFINED";
        } else {
            str = "BAD";
        }
        return nbh.w("{verifyResult=", str, ", name='", this.d, "'}");
    }
}
