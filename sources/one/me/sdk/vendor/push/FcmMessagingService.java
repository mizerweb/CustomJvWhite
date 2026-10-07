package one.me.sdk.vendor.push;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.a4c;
import defpackage.bue;
import defpackage.cie;
import defpackage.cue;
import defpackage.die;
import defpackage.eie;
import defpackage.fue;
import defpackage.fzd;
import defpackage.gm0;
import defpackage.je9;
import defpackage.kzd;
import defpackage.mw;
import defpackage.oqg;
import defpackage.ozd;
import defpackage.pvb;
import defpackage.r7;
import defpackage.s7f;
import defpackage.svb;
import defpackage.syd;
import defpackage.wtc;
import defpackage.y6;
import defpackage.yab;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FcmMessagingService extends FirebaseMessagingService {
    public final String h = "FCM";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c() {
        gm0.n(this.h, "onDeletedMessages");
        fue.a.a().a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(eie eieVar) {
        Object next;
        long jLongValue;
        Bundle bundle = eieVar.a;
        gm0.n(this.h, "onMessageReceived");
        cue cueVarA = fue.a.a();
        if (eieVar.b == null) {
            mw mwVar = new mw(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        mwVar.put(str, str2);
                    }
                }
            }
            eieVar.b = mwVar;
        }
        mw mwVar2 = eieVar.b;
        String string = bundle.getString("google.delivered_priority");
        int i = 2;
        if (string != null) {
            if ("high".equals(string)) {
                i = 1;
            } else if (!"normal".equals(string)) {
                i = 0;
            }
        } else if (!"1".equals(bundle.getString("google.priority_reduced"))) {
            string = bundle.getString("google.priority");
            if ("high".equals(string)) {
                i = 1;
            } else if (!"normal".equals(string)) {
                i = 0;
            }
        }
        Iterator it = cie.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cie) next).a != i);
        cie cieVar = (cie) next;
        if (cieVar == null) {
            cieVar = cie.UNKNOWN;
        }
        die dieVar = new die(mwVar2, cieVar);
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        yab.i0(cueVarA.b, null, 0, new bue(dieVar, cueVarA, syd.GCM, jLongValue, null), 3);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        gm0.n(this.h, "onNewToken");
        String str2 = fue.a.a().a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "onNewToken()", null);
            }
        }
        r7 r7Var = r7.a;
        Iterator it = r7.c().entrySet().iterator();
        while (it.hasNext()) {
            kzd kzdVarE = new wtc(((y6) ((Map.Entry) it.next()).getValue()).a).e();
            ((oqg) kzdVarE.h.getValue()).getClass();
            syd sydVarF = ((oqg) kzdVarE.h.getValue()).f();
            if (sydVarF != null) {
                ((s7f) kzdVarE.a()).O(new ozd(sydVarF, str, new fzd(((s7f) kzdVarE.a()).q())));
            }
            if (str.length() > 0 && ((svb) kzdVarE.e.getValue()).b()) {
                ((pvb) kzdVarE.f.getValue()).p();
            }
        }
    }
}
