package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class sve {
    public final String a;
    public final y3e b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public sve(CidLogger cidLogger) {
        if (cidLogger == null) {
            ore.p("Illegal 'logger' value: null");
            throw null;
        }
        this.a = "RtcCommands";
        this.b = cidLogger;
    }
}
