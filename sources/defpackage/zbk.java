package defpackage;

import java.time.Instant;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class zbk {
    public final Instant a;
    public final pbk b;
    public final Consumer c;
    public boolean d;
    public boolean e;

    public zbk(Instant instant, pbk pbkVar, Consumer consumer) {
        this.a = instant;
        this.b = pbkVar;
        this.c = consumer;
    }

    public final synchronized boolean a() {
        return (this.e || this.d) ? false : true;
    }

    public final synchronized boolean b() {
        if (this.e || this.d) {
            return false;
        }
        this.d = true;
        return true;
    }

    public final String toString() {
        String str;
        pbk pbkVar = this.b;
        char cCharAt = pbkVar.n().name().charAt(0);
        Object objP = pbkVar.p().longValue() >= 0 ? pbkVar.p() : ".";
        int iQ = pbkVar.q();
        if (this.e) {
            str = "Acked";
        } else {
            str = this.d ? "Lost" : "Inflight";
        }
        return "Packet " + cCharAt + "|" + objP + "| |" + iQ + "|" + str;
    }
}
