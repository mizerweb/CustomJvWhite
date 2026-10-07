package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dw6 implements bw6 {
    public final esh a;
    public final fi1 b;
    public final CidLogger c;
    public boolean d;
    public int e;
    public Long f;

    public dw6(esh eshVar, fi1 fi1Var, CidLogger cidLogger) {
        eshVar.getClass();
        fi1Var.getClass();
        this.a = eshVar;
        this.b = fi1Var;
        this.c = cidLogger;
        this.e = 1;
    }

    @Override // defpackage.bw6
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.bw6
    public void c() {
        String str;
        if (this.d) {
            return;
        }
        Long l = this.f;
        if (l == null) {
            this.c.log(g(), "Data is received but accept event wasn't triggered");
            return;
        }
        ((gsh) this.a).getClass();
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - l.longValue());
        switch (f()) {
            case 1:
                str = "";
                break;
            case 2:
                str = "direct_outgoing";
                break;
            case 3:
                str = "direct_incoming";
                break;
            case 4:
                str = "server_incoming";
                break;
            case 5:
                str = "server_join_server";
                break;
            case 6:
                str = "server_change_topology";
                break;
            case 7:
                str = "direct_join";
                break;
            default:
                throw null;
        }
        ((gi1) this.b).d("first_media_received", eventItemValue, new EventItemsMap((Map<String, ? extends EventItemValue>) Collections.singletonMap("call_type", EventItemValueKt.toEventItemValue(str))));
        this.d = true;
    }

    public int f() {
        return this.e;
    }

    public abstract String g();

    public final void h() {
        ((gsh) this.a).getClass();
        this.f = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
