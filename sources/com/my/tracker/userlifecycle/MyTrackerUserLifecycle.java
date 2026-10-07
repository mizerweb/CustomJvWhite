package com.my.tracker.userlifecycle;

import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.MyTrackerInternal;
import com.my.tracker.core.Tracer;
import com.my.tracker.userlifecycle.o.a;
import defpackage.y9b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MyTrackerUserLifecycle {
    private static a a;

    static {
        MyTrackerInternal.registerInit("userlifecycle", new y9b(1), null);
    }

    public static void a(EngineMiniCore engineMiniCore) {
        a = a.a(engineMiniCore);
    }

    public static void trackInviteEvent(Map<String, String> map) {
        a aVar = a;
        if (aVar == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            aVar.a(map);
        }
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        a aVar = a;
        if (aVar == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            aVar.a(str, str2, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        a aVar = a;
        if (aVar == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            aVar.b(str, str2, map);
        }
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }
}
